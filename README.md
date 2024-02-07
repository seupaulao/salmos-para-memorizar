# Salmo para memorizar

Esse projeto destina-se a Android, Web e iOS

É mais completo que o Salmo-memorizar original

Use esse para a plataforma Mobile


## Instalando

To install dependencies, and setup the project, run:

1. `npm i`


## Using Emacs with CIDER

Open Emacs and a bash shell:

1. Run `npx shadow-cljs compile :app` to perform an initial build of the app.
1. In Emacs open one of the files in the project (`deps.edn` is fine)
1. From that buffer, do `cider-jack-in-clojurescript` [C-c M-J] to
   launch a REPL. Follow the series of interactive prompts in the
   minibuffer:
   1. select `shadow-cljs` as the command to launch
   1. select `shadow` as the repl type
   1. select `:app` as the build to connect
   1. and optionally answer `y` or `n` to the final question about
      opening the `shadow-cljs` UI in a browser.
   At this point `shadow-cljs` will be watching the project folder and
   running new builds of the app if any files are changed. You'll also
   have a REPL prompt, *however the REPL doesn't work because it isn't
   connected to anything. The app isn't running yet.*
1. In a shell run `npm run ios` (same as `npx expo start -i`). This starts
   the Metro bundler, perform the bundling, launch the iPhone
   simulator, and transmit the bundled app. Be patient at this step as
   it can take many seconds to complete. When the app is finally
   running expo will display the message:

       WebSocket connected!
       REPL init successful
1. Once you see that the REPL is initalized, you can return to Emacs
   and confirm the REPL is connected and functional:
   ``` clojure
   cljs.user> (js/alert "hello world!")
   ```
   Which should pop-up a modal alert in the simulator, confirming the
   app is running and the REPL is connected end to end.

## Or the Command line
```sh
$ npm i
$ npx shadow-cljs watch app
# wait for first compile to finish or expo gets confused
# on another terminal tab/window:
$ npm start
```
This will run Expo DevTools at http://localhost:19002/

To run the app in browser using expo-web (react-native-web), press `w` in the same terminal after expo devtools is started.
This should open the app automatically on your browser after the web version is built. If it does not open automatically, open http://localhost:19006/ manually on your browser.

Note that you can also run the following instead of `npm start` to run the app in browser:
   ```
   # same as npx expo start --web
   $ npm run web

   # or

   # same as npx expo start --web-only
   $ npm run web-only
   ```

### Using ClojureScript REPL
Once the app is deployed and opened in phone/simulator/emulator/browser, connect to nrepl and run the following:

```clojure
(shadow/nrepl-select :app)
```

NB: _Calva users don't need to do ^ this ^._

To test the REPL connection:

```clojure
(js/alert "Hello from Repl")
```

### Command line CLJS REPL

Shadow can start a CLJS repl for you, if you prefer to stay at the terminal prompt:

```bash
$ npx shadow-cljs cljs-repl :app
```

## Disabling Expo Fast Refresh

You will need to disable **Fast Refresh** provided by the Expo client, which conflicts with shadow-cljs hot reloading. You really want to use Shadow's, because it is way better and way faster than the Expo stuff is.

For the iOS and Android there is a **Disable Fast Refresh** option in the [development menu](https://docs.expo.io/workflow/debugging/#developer-menu). NB: _Often you need to first enable it and then disable it._

For web there may be some way to disable it via a `webpack.config` file as per [this example](https://docs.expo.dev/guides/customizing-webpack/#example). But failing that, once the app has loaded you can block requests to/from `localhost:19006/*` (the Webpack dev server) in devtools [like so](https://github.com/facebook/create-react-app/issues/2519#issuecomment-318867289), for instance by right-clicking on a request in the Network tab, selecting `Block request URL`, then editing the pattern. In Chrome this looks something like:

![image](https://github.com/CarnunMP/rn-rf-shadow/assets/8897392/4d5d9541-f5e4-4108-a38e-65b3c2da4939)
![image](https://github.com/CarnunMP/rn-rf-shadow/assets/8897392/27c94aa8-3337-4fde-b7f6-7ce87197a89d)

This workaround is far from ideal, because the block needs to be manually toggled *off* whenever a full refresh is required (e.g. to load a new file), then back on again. But it seems to do the job.

## Production builds

A production build involves first asking shadow-cljs to build a release, then to ask Expo to work in Production Mode.

1. Kill the watch and expo tasks.
1. Execute `shadow-cljs release app`
1. Start the expo task (as per above)
   1. Enable Production mode.
   1. Start the app.

### Using EAS Build

`expo build` is the classic way of building an Expo app, and `eas build` is the new version of `expo build`. Using EAS Build currently requires an Expo account with a paid plan subscription.

The steps below provide an example of using EAS Build to build an apk file to run on an Android emulator or device.

0. Install the latest EAS CLI by running `npm install -g eas-cli`
0. Log into your Expo account
0. Configure EAS Build in your project with `eas build:configure`.
0. Make your eas.json file contents look like this:
    ```json
    {
      "build": {
        "production": {},
        "development": {
          "distribution": "internal",
          "android": {
            "buildType": "apk"
          },
          "ios": {
            "simulator": true
          }
        }
      }
    }
    ```
0. Commit your changes, run `eas build --profile development`, and follow the prompts.
0. Navigate to the URL given by the command to monitor the build. When it completes, download the apk and install it on your device or emulator.

See [the EAS Build docs](https://docs.expo.dev/build/introduction/) for more information.

If you want to use EAS Build with a project not based on this template, see [this PR](https://github.com/PEZ/rn-rf-shadow/pull/24) for information about how your project can be set up to avoid an error during the build process.

Note: The `eas-build-pre-install.sh` script makes EAS install Java in the MacOS environment when running a build for iOS. This ensures that shadow-cljs can be run in the EAS pipeline to build your ClojureScript code.

## React Navigation included

The app is setup to use [React Navigation](https://reactnavigation.org/). If you don't need that in your app, just remove it.

## Happy Hacking! ❤️

Please don't hesitate to star the project repository.
