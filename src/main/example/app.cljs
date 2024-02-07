(ns example.app
  (:require [example.events]
            [example.subs]
            [example.widgets :refer [button]]
            [expo.root :as expo-root]
            ["expo-status-bar" :refer [StatusBar]]
            [re-frame.core :as rf]
            ["react-native" :as rn]
            [reagent.core :as r]
            ["@react-navigation/native" :as rnn]
            ["@react-navigation/native-stack" :as rnn-stack]
            [example.livro :as livro]
            ))

(defonce Stack (rnn-stack/createNativeStackNavigator))

(def cap (r/atom 91))

(def ver (r/atom 1))

(defn pra-frente [n]
  (do
     (swap! ver #(+ % n))
     (when (> @ver (example.livro/qte-versos @cap))  
         (do
            (reset! ver (- @ver (example.livro/qte-versos @cap))) 
            (swap! cap inc) 
            ))
     (when (> @cap 150) (do (reset! ver 1) (reset! cap 1)))       
  )  
)

(defn pra-tras [n]
   (do
     (swap! ver #(- % n))
     (when (<= @ver 0)  
         (do
            (swap! cap dec) 
            (reset! ver (+ (example.livro/qte-versos @cap) @ver)) 
            ))
     (when (<= @cap 1) (do (reset! ver 1) (reset! cap 1)))       
  )  
)

(defn home [^js props]
  
   [:> rn/View {:style {:flex 1          
                        :align-items :center
                        :background-color :white
   }}
      [:> rn/Text {:style {:color :blue
                           :font-size 72
                           :margin-bottom 30
      }} "Salmos para Memorizar"]

      [:> rn/View {:style {:margin-bottom 30 :padding-left 100 :padding-right 100}}
           [:> rn/Text {:style {:color :black
                           :font-size 18
                }} (str @cap ":" @ver "  ")]
           [:> rn/Text {:style {:color :black
                           :font-size 36
                }} (example.livro/getlivro (str "PSA_" @cap "_" @ver))]
      ]

      [:> rn/View {:style {:margin-top 20 :margin-bottom 20 :flex-direction :row}}

            [button {:on-press #(pra-tras 5) :style {:background-color :red :margin 10 }} "-5"]
            [button {:on-press #(pra-tras 1) :style {:background-color :blue :margin 10 }} "Anterior"]
            [button {:on-press #(pra-frente 1) :style {:background-color :blue :margin 10 }} "Próximo"]
            [button {:on-press #(pra-frente 5) :style {:background-color :red :margin 10 }} "+5"]
      ]

      [:> rn/View {:style {:align-items :center}}
      [button {:on-press (fn []
                           (-> props .-navigation (.navigate "Sobre")))}
       "Click em mim para poder navegar"]]

      [:> StatusBar {:style "auto"}]

   ]
)

(defn- about 
  []
  (r/with-let [counter (rf/subscribe [:get-counter])]
    [:> rn/View {:style {:flex 1
                         :padding-vertical 50
                         :padding-horizontal 20
                         :justify-content :space-between
                         :align-items :flex-start
                         :background-color :white}}
     [:> rn/View {:style {:align-items :flex-start}}
      [:> rn/Text {:style {:font-weight   :bold
                           :font-size     54
                           :color         :blue
                           :margin-bottom 20}}
       "Sobre Salmos para Memorizar"]

      [:> rn/Text {:style {:font-weight :normal
                           :font-size   15
                           :color       :blue}}
       "Construido com React Native, Expo, Reagent, re-frame, and React Navigation"]]
     [:> StatusBar {:style "auto"}]]))

(defn root []
  ;; The save and restore of the navigation root state is for development time bliss
  (r/with-let [!root-state (rf/subscribe [:navigation/root-state])
               save-root-state! (fn [^js state]
                                  (rf/dispatch [:navigation/set-root-state state]))
               add-listener! (fn [^js navigation-ref]
                               (when navigation-ref
                                 (.addListener navigation-ref "state" save-root-state!)))]
    [:> rnn/NavigationContainer {:ref add-listener!
                                 :initialState (when @!root-state (-> @!root-state .-data .-state))}
     [:> Stack.Navigator
      [:> Stack.Screen {:name "Home"
                        :component (fn [props] (r/as-element [home props]))
                        :options {:title "Salmos para Memorizar"}}]
      [:> Stack.Screen {:name "Sobre"
                        :component (fn [props] (r/as-element [about props]))
                        :options {:title "Sobre"}}]]]))

(defn start
  {:dev/after-load true}
  []
  (expo-root/render-root (r/as-element [root])))

(defn init []
  (rf/dispatch-sync [:initialize-db])
  (start))