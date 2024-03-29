(ns example.livro)

(def referencia  {
"PSA_1_1" {:texto "Bem-aventurado o homem que não anda no conselho dos maus, nem fica parado no caminho dos pecadores, nem se senta junto dos escarnecedores."}
"PSA_1_2" {:texto "Mas sim, que tem seu prazer na Lei do SENHOR; e medita em sua Lei de dia e de noite."}
"PSA_1_3" {:texto "Porque ele será como uma árvore, plantada junto a ribeiros de águas, que dá fruto a seu [devido] tempo, e suas folhas não caem; e tudo quanto fizer prosperará."}
"PSA_1_4" {:texto "Os maus não são assim; mas são como a palha que o vento dispersa."}
"PSA_1_5" {:texto "Por isso os maus não subsistirão no julgamento, nem os pecadores no ajuntamento dos justos."}
"PSA_1_6" {:texto "Porque o SENHOR conhece o caminho dos justos; porém o caminho dos maus perecerá."}
"PSA_2_1" {:texto "Por que as nações se rebelam, e os povos planejam em vão?"}
"PSA_2_2" {:texto "Os reis da terra se levantam, e os governantes tomam conselhos reunidos contra o SENHOR, e contra seu Ungido, [dizendo] :"}
"PSA_2_3" {:texto "Rompamos as correntes deles, e lancemos fora de nós as cordas deles."}
"PSA_2_4" {:texto "Aquele que está sentado nos céus rirá; o Senhor zombará deles."}
"PSA_2_5" {:texto "Então ele lhes falará em sua ira; em seu furor ele os assombrará, [dizendo] :"}
"PSA_2_6" {:texto "E eu ungi a meu Rei sobre Sião, o monte de minha santidade."}
"PSA_2_7" {:texto "E eu declararei o decreto do SENHOR: Ele me disse: Tu és meu Filho; eu hoje te gerei."}
"PSA_2_8" {:texto "Pede-me, e eu te darei as nações [por] herança, e [por] tua propriedade os confins da terra."}
"PSA_2_9" {:texto "Com cetro de ferro tu as quebrarás; como vaso de oleiro tu as despedaçarás;"}
"PSA_2_10" {:texto "Portanto agora, reis, sede prudentes; vós, juízes da terra, deixai serdes instruídos."}
"PSA_2_11" {:texto "Servi ao SENHOR com temor; e alegrai-vos com tremor."}
"PSA_2_12" {:texto "Beijai ao Filho, para que ele não se ire, e pereçais [no] caminho; porque em breve a ira dele se acenderá. Bem-aventurados [são] todos os que nele confiam."}
"PSA_3_1" {:texto "Salmo de Davi, quando ele fugia da presença de seu filho Absalão:Ah SENHOR, como têm se multiplicado meus adversários! Muitos se levantam contra mim."}
"PSA_3_2" {:texto "Muitos dizem de minha alma: Não há salvação para ele em Deus.(Selá)"}
"PSA_3_3" {:texto "Porém tu, SENHOR, és escudo para mim; minha glória, e o que levanta minha cabeça."}
"PSA_3_4" {:texto "Com minha voz eu clamei ao SENHOR; e ele me ouviu desde o monte de sua santidade. (Selá)"}
"PSA_3_5" {:texto "Eu me deitei, e dormi; acordei, porque o SENHOR me sustentava."}
"PSA_3_6" {:texto "Eu não temerei [ainda que sejam] dez mil pessoas que se ponham ao redor de mim."}
"PSA_3_7" {:texto "Levanta-te, SENHOR, salva-me, meu Deus; pois feriste os queixos de todos meus inimigos; [e] quebraste os dentes dos maus."}
"PSA_3_8" {:texto "A salvação [vem] do SENHOR; sobre o teu povo seja tua bênção. (Selá)"}
"PSA_4_1" {:texto "Salmo de Davi para o regente, com instrumentos de cordas:Quando eu clamar, ouve-me, ó Deus de minha justiça; na angústia tu me alivias; tem misericórdia de mim, e ouve a minha oração."}
"PSA_4_2" {:texto "Filhos dos homens, até quando [tornareis] minha glória em infâmia, e amareis as coisas vãs? [Até quando] buscareis a mentira? (Selá)"}
"PSA_4_3" {:texto "Sabei pois, que o SENHOR separou para si aquele que é fiel; o SENHOR ouvirá, quando a ele eu clamar."}
"PSA_4_4" {:texto "Quando estiverdes perturbados, não pequeis; meditai em vosso coração sobre a vossa cama, e fazei silêncio. (Selá)"}
"PSA_4_5" {:texto "Sacrificai sacrifícios de justiça, e confiai no SENHOR."}
"PSA_4_6" {:texto "Muitos dizem: Quem nos mostrará o bem?Levanta sobre nós, SENHOR, a luz de teu rosto."}
"PSA_4_7" {:texto "Tu me deste alegria em meu coração, maior do que quando o trigo e o vinho deles se multiplicaram."}
"PSA_4_8" {:texto "Eu deitarei, e dormirei em paz; porque só tu, SENHOR, me fazes descansar seguro."}
"PSA_5_1" {:texto "Salmo de Davi para o regente, com instrumentos de sopro:SENHOR, escuta as minhas palavras; entende aquilo que estou meditando;"}
"PSA_5_2" {:texto "Ouve a voz do meu clamor, meu Rei e meu Deus; porque a ti eu oro."}
"PSA_5_3" {:texto "SENHOR, pela manhã ouvirás minha voz; pela manhã apresentarei [meu clamor] a ti, e ficarei esperando."}
"PSA_5_4" {:texto "Porque tu não [és] Deus que tens prazer na maldade; contigo não habitará o mau."}
"PSA_5_5" {:texto "Os arrogantes não ficarão de pé diante dos teus olhos; tu odeias todas os praticantes de maldade."}
"PSA_5_6" {:texto "Tu destruirás aos que falam mentiras; o SENHOR abomina ao homem sanguinário e enganador."}
"PSA_5_7" {:texto "Mas eu, pela grandeza de tua bondade, entrarei em tua casa; adorarei inclinado para o templo de tua santidade em temor a ti."}
"PSA_5_8" {:texto "SENHOR, guia-me em tua justiça, por causa dos meus adversários; prepara diante de mim o teu caminho."}
"PSA_5_9" {:texto "Porque não há verdade na boca deles; seu interior são meras destruições; a garganta deles é uma sepultura aberta; com suas línguas elogiam falsamente."}
"PSA_5_10" {:texto "Declara-os culpados, ó Deus, [e] que caiam de seus próprios conselhos; expulsa-os por causa da abundância de suas transgressões, porque eles se rebelaram contra ti."}
"PSA_5_11" {:texto "Mas se alegrem todos os que confiam em ti; clamai de alegria para sempre; porque tu os proteges; e fiquem contentes em ti aqueles que amam o teu nome."}
"PSA_5_12" {:texto "Porque tu, SENHOR, abençoarás ao justo; como com um escudo tu o rodearás com tua bondade."}
"PSA_6_1" {:texto "Salmo de Davi para o regente, com instrumentos de cordas, uma harpa de oito cordas:SENHOR, não me repreendas na tua ira; e não me castigues em teu furor."}
"PSA_6_2" {:texto "Tem misericórdia de mim, SENHOR; porque eu [estou] enfraquecido; cura-me, SENHOR, porque meus ossos estão afligidos."}
"PSA_6_3" {:texto "Até minha alma está muito aflita; e tu, SENHOR, até quando?"}
"PSA_6_4" {:texto "Volta, SENHOR; livra minha alma; salva-me por tua bondade."}
"PSA_6_5" {:texto "Porque na morte não há lembrança de ti; no Xeol quem te louvará?"}
"PSA_6_6" {:texto "Já estou cansado do meu gemido; toda a noite eu inundo a minha cama; com minhas lágrimas molho meu leito."}
"PSA_6_7" {:texto "Meus olhos estão desolados de mágoa, [e] têm se envelhecido por causa de todos os meus adversários."}
"PSA_6_8" {:texto "Sai para longe de mim, todos vós praticantes de maldade; porque o SENHOR já ouviu a voz do meu choro."}
"PSA_6_9" {:texto "O SENHOR tem ouvido a minha súplica; o SENHOR aceitará a minha oração."}
"PSA_6_10" {:texto "Todos os meus inimigos se envergonharão e ficarão muito perturbados; voltarão para trás, [e] repentinamente se envergonharão."}
"PSA_7_1" {:texto "Cântico de Davi, que cantou ao SENHOR, depois das palavras de Cuxe, descendente de Benjamim:SENHOR, meu Deus, em ti confio; salva-me de todos os que me perseguem, e livra-me."}
"PSA_7_2" {:texto "Para que não rasguem minha alma como um leão, sendo despedaçada sem [haver] quem a livre."}
"PSA_7_3" {:texto "SENHOR, meu Deus, se eu fiz isto: se há perversidade em minhas mãos;"}
"PSA_7_4" {:texto "Se eu paguei [com] mal ao que tinha paz comigo (mas fiz escapar ao que me oprimia sem causa);"}
"PSA_7_5" {:texto "[Então] que o inimigo persiga a minha alma, e a alcance; e pise em terra a minha vida; e faça habitar minha honra no pó. (Selá)"}
"PSA_7_6" {:texto "Levanta-te, SENHOR, em tua ira; exalta-te pelos furores de meus opressores; e desperta para comigo; tu mandaste o juízo."}
"PSA_7_7" {:texto "Então o ajuntamento de povos te rodeará; portanto volta a te elevar [a ti mesmo] sobre ele."}
"PSA_7_8" {:texto "O SENHOR julgará aos povos; julga-me, SENHOR, conforme a minha justiça, e conforme a sinceridade [que há] em mim."}
"PSA_7_9" {:texto "Que tenha fim a maldade dos maus; mas firma ao justo, tu, ó justo Deus, que provas os corações e os sentimentos."}
"PSA_7_10" {:texto "Meu escudo [pertence] a Deus, que salva os corretos de coração."}
"PSA_7_11" {:texto "Deus é um justo juiz; e um Deus que se ira todos os dias."}
"PSA_7_12" {:texto "Ele afia a espada para aquele que não se arrepende; ele [já] armou e preparou seu arco."}
"PSA_7_13" {:texto "E para ele [já] preparou armas mortais; suas flechas utilizará contra os perseguidores."}
"PSA_7_14" {:texto "Eis que [o injusto] está com dores de perversidade; e está em trabalho de parto, e gerará mentiras."}
"PSA_7_15" {:texto "Ele cavou um poço e o fez fundo; mas caiu na cova [que ele próprio] fez."}
"PSA_7_16" {:texto "Seu trabalho se voltará contra sua [própria] cabeça; e sua violência descerá sobre o topo de sua cabeça."}
"PSA_7_17" {:texto "Eu louvarei ao SENHOR conforme sua justiça; cantarei ao nome do SENHOR, o Altíssimo."}
"PSA_8_1" {:texto "Salmo de Davi para o regente, com “Gitite”:Ah DEUS, nosso Senhor, quão glorioso é o teu nome sobre toda a terra! Pois tu puseste tua majestade acima dos céus."}
"PSA_8_2" {:texto "Da boca das crianças, e dos que mamam, tu fundaste força, por causa de teus adversários, para fazer cessar ao inimigo e ao vingador."}
"PSA_8_3" {:texto "Quando eu vejo teus céus, obra de teus dedos; a lua e as estrelas, que tu preparaste;"}
"PSA_8_4" {:texto "O que é o homem, para que tu te lembres dele? E [o que é] o filho do homem, para que o visites?"}
"PSA_8_5" {:texto "E tu o fizeste um pouco menor que os anjos; e com glória e honra tu o coroaste."}
"PSA_8_6" {:texto "Tu o fazes ter controle sobre as obras de tuas mãos; tudo puseste debaixo de seus pés."}
"PSA_8_7" {:texto "Ovelhas e bois, todos eles, e também os animais do campo;"}
"PSA_8_8" {:texto "As aves dos céus, e os peixes do mar; [e] os que passam pelos caminhos dos mares."}
"PSA_8_9" {:texto "Ó DEUS, nosso Senhor! Quão glorioso é o teu nome sobre toda a terra!"}
"PSA_9_1" {:texto "Salmo de Davi, para o regente, em “Mute-Laben”:Louvarei a [ti] , SENHOR com todo o meu coração; contarei todas as tuas maravilhas."}
"PSA_9_2" {:texto "Em ti eu ficarei contente e saltarei de alegria; cantarei a teu nome, ó Altíssimo."}
"PSA_9_3" {:texto "Meus inimigos voltaram para trás; eles caem e perecem diante de ti."}
"PSA_9_4" {:texto "Porque tu fizeste conforme meu direito e minha causa; tu te sentaste no teu tribunal e julgaste com justiça."}
"PSA_9_5" {:texto "Severamente repreendeste às nações, destruíste ao perverso; tu tiraste o nome dele para sempre e eternamente."}
"PSA_9_6" {:texto "[Ao] inimigo, as destruições já se acabaram para sempre. E tu arrasaste as cidades, [e] já pereceu sua memória [com] elas."}
"PSA_9_7" {:texto "Mas o SENHOR se sentará [para governar] eternamente; ele já preparou seu trono para julgar."}
"PSA_9_8" {:texto "Ele mesmo julgará ao mundo com justiça; e corretamente fará justiça aos povos."}
"PSA_9_9" {:texto "O SENHOR será um refúgio para o aflito; um refúgio em tempos de angústia."}
"PSA_9_10" {:texto "E confiarão em ti os que conhecem o teu nome; porque tu, SENHOR, nunca desamparaste aos que te buscam."}
"PSA_9_11" {:texto "Cantai ao SENHOR, que habita em Sião! Contai entre os povos as obras dele."}
"PSA_9_12" {:texto "Porque ele investiga os derramamentos de sangue, [e] lembra-se deles; não se esquece do clamor dos que sofrem."}
"PSA_9_13" {:texto "Tem misericórdia de mim, SENHOR; olha para o meu sofrimento, [causado] pelos que me odeiam; tu, que me levantas [para fora] das portas da morte."}
"PSA_9_14" {:texto "Para que eu conte todos os teus louvores nas portas da filha de Sião, [e] me alegre em tua salvação."}
"PSA_9_15" {:texto "As nações se afundaram na cova que elas fizeram; o pé delas ficou preso na rede que esconderam."}
"PSA_9_16" {:texto "O SENHOR foi conhecido [pelo] juízo que fez; o perverso foi enlaçado pelas obras de suas [próprias] mãos. (Higaiom, Selá)"}
"PSA_9_17" {:texto "Os perversos irão para o Xeol, e todas as nações que se esquecem de Deus."}
"PSA_9_18" {:texto "Porque o necessitado não será esquecido para sempre; [nem a] esperança dos oprimidos perecerá eternamente."}
"PSA_9_19" {:texto "Levanta-te, SENHOR, não prevaleça o homem [contra ti] ; sejam julgadas as nações diante de ti."}
"PSA_9_20" {:texto "Põe medo neles, SENHOR; saibam as nações que eles são meros mortais. (Selá)"}
"PSA_10_1" {:texto "Por que, SENHOR, tu estás longe? [Por que] tu te escondes em tempos de angústia?"}
"PSA_10_2" {:texto "Com arrogância o perverso persegue furiosamente ao miserável; sejam presos nas ciladas que planejaram."}
"PSA_10_3" {:texto "Pois o perverso se orgulha do desejo de sua alma; ele bendiz ao ganancioso, e blasfema do SENHOR."}
"PSA_10_4" {:texto "Pela arrogância de seu rosto o perverso não se importa; Deus não existe em todos as seus pensamentos."}
"PSA_10_5" {:texto "Em todo tempo seus caminhos atormentam; teus juízos [estão] longe do rosto dele, em grande altura; ele sopra furiosamente todos os seus adversários."}
"PSA_10_6" {:texto "Ele diz em seu coração: Eu nunca serei abalado; porque de geração após geração nunca [sofrerei] mal algum."}
"PSA_10_7" {:texto "Sua boca está cheia de maldição, e de enganos, e de falsidade; debaixo de sua língua há sofrimento e maldade."}
"PSA_10_8" {:texto "Eles se sentam [postos] para as ciladas das aldeias; nos esconderijos ele mata ao inocente; seus olhos observam secretamente ao contra o pobre."}
"PSA_10_9" {:texto "Ele arma ciladas no esconderijo, como o leão em seu covil; arma ciladas para roubar ao miserável; rouba ao miserável, trazendo-o em sua rede."}
"PSA_10_10" {:texto "Ele se encolhe, se agacha, [para que] os pobres caiam em suas armadilhas."}
"PSA_10_11" {:texto "Ele diz em seu coração: Deus [já] se esqueceu; [já] escondeu o seu rosto, nunca mais [o] verá."}
"PSA_10_12" {:texto "Levanta-te, SENHOR Deus, ergue tua mão; não te esqueças dos miseráveis."}
"PSA_10_13" {:texto "Por que o perverso blasfema de Deus? Ele diz eu seu coração que tu nada [lhe] exigirá."}
"PSA_10_14" {:texto "Tu estás [o] vendo; porque tu olhas para o trabalho e o cansaço, para o entregar em tuas mãos; em ti o pobre põe confiança; tu és o que ajuda ao órfão."}
"PSA_10_15" {:texto "Quebra tu o braço do perverso e do maligno; faz cobrança da maldade dele, [até que] tu aches nada [mais dela] ."}
"PSA_10_16" {:texto "O SENHOR é Rei eterno e para todo o sempre; as nações perecerão de sua terra."}
"PSA_10_17" {:texto "SENHOR, tu ouviste o desejo dos humildes; tu fortalecerás os seus corações, e teus ouvidos [os] ouvirão;"}
"PSA_10_18" {:texto "Para fazer justiça ao órfão e ao afligido; para que o homem não mais continue a praticar o terror."}
"PSA_11_1" {:texto "Salmo de Davi, para o regente:No SENHOR eu confio; como, pois, tu dizeis à minha alma: Fugi para vossa montanha, [como] um pássaro?"}
"PSA_11_2" {:texto "Porque eis que os maus estão armando o arco; eles estão pondo suas flechas na corda, para atirarem às escuras [com elas] aos corretos de coração."}
"PSA_11_3" {:texto "Se os fundamentos são destruídos, o que o justo pode fazer?"}
"PSA_11_4" {:texto "O SENHOR está em seu santo Templo, o trono do SENHOR está nos céus; seus olhos observam com atenção; suas pálpebras provam aos filhos dos homens."}
"PSA_11_5" {:texto "O SENHOR prova ao justo; mas sua alma odeia ao perverso e ao que ama a violência."}
"PSA_11_6" {:texto "Sobre os perversos choverá laços, fogo e enxofre; e o pagamento para seu cálice será vento tempestuoso."}
"PSA_11_7" {:texto "Porque o SENHOR [é] justo, [e] ama as justiças; seu rosto presta atenção ao [que é] correto."}
"PSA_12_1" {:texto "Salmo de Davi, para o regente, com harpa de oito cordas:Salva, SENHOR, porque os bons estão em falta; porque são poucos os fiéis dentre os filhos dos homens."}
"PSA_12_2" {:texto "Cada um fala falsidade ao seu próximo, [com] lábios elogiam falsamente; falam com duas intenções no coração."}
"PSA_12_3" {:texto "Que o SENHOR corte a todos os lábios que falam falsos elogios, [e toda] língua que fala grandes [mentiras] ."}
"PSA_12_4" {:texto "Pois dizem: Com nossa língua prevaleceremos; nossos lábios [são] nossos; que é senhor sobre nós?"}
"PSA_12_5" {:texto "O SENHOR diz: Pela opressão aos humildes, pelo gemido dos necessitados, eu agora me levantarei; porei em segurança àquele a quem ele sopra [desejando oprimir] ."}
"PSA_12_6" {:texto "As palavras do SENHOR são palavras puras, [como] prata refinada em forno de barro, purificada sete vezes."}
"PSA_12_7" {:texto "Tu, SENHOR, os guardarás; desta geração os livrarás para sempre."}
"PSA_12_8" {:texto "Os maus andam cercando, enquanto os mais vis dos filhos dos homens são exaltados."}
"PSA_13_1" {:texto "Salmo de Davi, para o regente:Até quando, SENHOR, te esquecerás de mim? Para sempre? Até quando tu esconderás de mim o teu rosto?"}
"PSA_13_2" {:texto "Até quando refletirei em minha alma, [tendo] tristeza em meu coração o dia todo? Até quando o meu inimigo se levantará contra mim?"}
"PSA_13_3" {:texto "Olha [para mim, e] ouve-me, SENHOR meu Deus; ilumina os meus olhos, para que eu não adormeça [na] morte."}
"PSA_13_4" {:texto "Para que meu inimigo não diga: Eu o venci;e meus inimigos se alegrem, se eu vier a cair."}
"PSA_13_5" {:texto "Mas eu confio em tua bondade; em tua salvação meu coração se alegrará;"}
"PSA_13_6" {:texto "Cantarei ao SENHOR, porque ele tem me feito muito bem."}
"PSA_14_1" {:texto "Salmo de Davi, para o regente:O tolo diz em seu coração: Não há Deus.Eles têm se pervertido, fazem obras abomináveis; não há quem faça o bem."}
"PSA_14_2" {:texto "O SENHOR olhou desde os céus para os filhos dos homens, para ver se havia alguém prudente, que buscasse a Deus."}
"PSA_14_3" {:texto "Todos se desviaram, juntamente se contaminaram; não há quem faça o bem, nem um sequer."}
"PSA_14_4" {:texto "Será que não têm conhecimento todos os que praticam a maldade? Eles devoram a meu povo [como se] comessem pão, [e] não clamam ao SENHOR."}
"PSA_14_5" {:texto "Ali eles se encherão de medo, porque Deus está com a geração dos justos."}
"PSA_14_6" {:texto "Vós envergonhais os planos do humilde, mas o SENHOR é o refúgio dele."}
"PSA_14_7" {:texto "Ah, que de Sião venha a salvação de Israel! Quando o SENHOR restaurar o seu povo de seu infortúnio, Jacó jubilará, Israel se alegrará."}
"PSA_15_1" {:texto "Salmo de Davi:SENHOR, quem morará em tua tenda? Quem habitará no monte de tua santidade?"}
"PSA_15_2" {:texto "Aquele que anda sinceramente, e pratica a justiça; e com seu coração fala a verdade;"}
"PSA_15_3" {:texto "[Aquele que] não murmura com sua língua; não faz mal ao seu companheiro, nem aceita insulto contra seu próximo."}
"PSA_15_4" {:texto "Em seus olhos despreza à pessoa que é digna de reprovação, mas honra aos que temem ao SENHOR; mantém seu juramento até sob [seu próprio] prejuízo, e não muda."}
"PSA_15_5" {:texto "[Tal pessoa] não empresta seu dinheiro com juros; nem aceita suborno contra o inocente; quem faz isto, nunca se abalará."}
"PSA_16_1" {:texto "Cântico de Davi:Guarda-me, ó Deus; porque eu confio em ti."}
"PSA_16_2" {:texto "Tu, [minha alma] , disseste ao SENHOR: Tu és meu Senhor; minha bondade não [chega] até ti."}
"PSA_16_3" {:texto "[Mas] aos santos que [estão] na terra, e [a] os ilustres, nos quais está todo o meu prazer."}
"PSA_16_4" {:texto "As dores se multiplicarão daqueles que se apressam [para servir] a outros [deuses] ; eu não oferecerei seus sacrifícios de derramamento de sangue, e não tomarei seus nomes em meus lábios."}
"PSA_16_5" {:texto "O SENHOR é a porção da minha herança e o meu cálice; tu sustentas a minha sorte."}
"PSA_16_6" {:texto "Em lugares agradáveis foram postos os limites [do meu terreno] ; sim, eu recebo uma bela propriedade."}
"PSA_16_7" {:texto "Eu louvarei ao SENHOR, que me aconselhou; até de noite meus sentimentos me ensinam."}
"PSA_16_8" {:texto "Ponho ao SENHOR continuamente diante de mim; porque [ele está] à minha direita; nunca serei abalado."}
"PSA_16_9" {:texto "Por isso meu coração está contente, e minha glória se alegra; certamente minha carne habitará em segurança."}
"PSA_16_10" {:texto "Porque tu não deixarás a minha alma no Xeol, nem permitirás que teu Santo veja a degradação."}
"PSA_16_11" {:texto "Tu me farás conhecer o caminho da vida; fartura de alegrias [há] em tua presença; agrados estão em tua mão direita para sempre."}
"PSA_17_1" {:texto "Oração de Davi:Ouve, SENHOR, a [minha] justiça; presta atenção ao meu choro, dá ouvidos à minha oração de lábios que não enganam."}
"PSA_17_2" {:texto "De diante de teu rosto saia o meu julgamento; teus olhos observarão o que é justo."}
"PSA_17_3" {:texto "Tu [já] provaste o meu coração, tu [me] visitaste de noite; tu me investigaste, [e] nada achaste; decidi [que] minha boca não transgredirá."}
"PSA_17_4" {:texto "Quanto às obras dos homens, conforme a palavra de teus lábios eu me guardei dos caminhos do violento;"}
"PSA_17_5" {:texto "Guiando meu andar em teus caminhos, para que meus passos não tropecem."}
"PSA_17_6" {:texto "Eu clamo a ti, ó Deus, porque tu me respondes; inclina teus ouvidos a mim, escuta a minha palavra."}
"PSA_17_7" {:texto "Revela maravilhosamente tuas misericórdias, tu salvas aos que confiam [em ti] com tua mão direita daqueles se se levantam contra [ti] ."}
"PSA_17_8" {:texto "Guarda-me como a pupila do olho; esconde-me debaixo da sombra de tuas asas,"}
"PSA_17_9" {:texto "De diante dos perversos que me oprimem; dos meus mortais inimigos que me cercam."}
"PSA_17_10" {:texto "Eles se enchem de gordura; com sua boca falam arrogantemente."}
"PSA_17_11" {:texto "Agora eles têm nos cercado em nossos passos; eles fixam seus olhos para [nos] derrubar ao chão."}
"PSA_17_12" {:texto "Semelhantes ao leão, que deseja nos despedaçar, e ao leãozinho, que fica em esconderijos."}
"PSA_17_13" {:texto "Levanta-te, SENHOR, confronta-o, derruba-o; livra minha alma d [as mãos] do perverso com tua espada."}
"PSA_17_14" {:texto "Dos homens com tua mão, SENHOR, dos homens que são do mundo, cuja parte está n [esta] vida, cujo ventre enches de teu secreto [tesouro] ; os filhos se fartam, e deixam sua sobra para suas crianças."}
"PSA_17_15" {:texto "[Mas] eu olharei para teu rosto em justiça; serei satisfeito de tua semelhança, quando eu despertar."}
"PSA_18_1" {:texto "Para o regente. Do servo do SENHOR, chamado Davi, o qual falou as palavras deste cântico ao SENHOR, no dia em que o SENHOR o livrou das mãos de todos os seus inimigos, e das mãos de Saul. Ele disse:Eu te amarei, SENHOR, [tu és] minha força."}
"PSA_18_2" {:texto "O SENHOR é minha rocha, e minha fortaleza, e meu libertador, meu Deus, meu rochedo, em quem confio; [é] meu escudo, e a força da minha salvação, meu alto refúgio."}
"PSA_18_3" {:texto "Eu clamei ao SENHOR digno de louvor; e fiquei livre de meus inimigos."}
"PSA_18_4" {:texto "Cordas de morte me cercaram; e riachos de maldade me encheram de medo."}
"PSA_18_5" {:texto "Cordas do Xeol me envolveram; laços de morte me afrontaram."}
"PSA_18_6" {:texto "Em minha angústia, clamei ao SENHOR, e roguei a meu Deus; desde o seu Templo ele ouviu a minha voz; e o meu clamor diante de seu rosto chegou aos ouvidos dele."}
"PSA_18_7" {:texto "Então a terra de abalou e tremeu; e os fundamentos dos montes de moveram e foram abalados, porque ele se irritou."}
"PSA_18_8" {:texto "Fumaça subiu de seu nariz, e fogo consumidor saiu de sua boca; carvões foram acesos por ele."}
"PSA_18_9" {:texto "Ele moveu os céus, e desceu; e as trevas [estavam] debaixo de seus pés."}
"PSA_18_10" {:texto "Ele montou sobre um querubim, e fez seu voo; e voou veloz sobre as assas do vento."}
"PSA_18_11" {:texto "Ele pôs as trevas como seu esconderijo; pôs a sua tenda ao redor dele; trevas das águas, nuvens dos céus."}
"PSA_18_12" {:texto "Do brilho de sua presença suas nuvens se espalharam, [e também] a saraiva, e as brasas de fogo."}
"PSA_18_13" {:texto "E o SENHOR trovejou nos céus; e o Altíssimo soltou sua voz; saraiva e brasas de fogo [caíram] ."}
"PSA_18_14" {:texto "Ele mandou suas flechas, e os dispersou; e [lançou] muitos raios, e os perturbou."}
"PSA_18_15" {:texto "E as profundezas das águas foram vistas, e os fundamentos do mundo foram descobertos por tua repreensão, SENHOR, pelo sopro do vento do teu nariz."}
"PSA_18_16" {:texto "Desde o alto ele enviou, [e] me tomou; tirou-me de muitas águas."}
"PSA_18_17" {:texto "Ele me livrou do meu forte inimigo, e daqueles que me odeiam; porque eles eram mais poderosos do que eu."}
"PSA_18_18" {:texto "Eles me confrontaram no dia de minha calamidade; mas o SENHOR ficou junto de mim."}
"PSA_18_19" {:texto "Ele me tirou para um lugar amplo; ele me libertou, porque se agradou de mim."}
"PSA_18_20" {:texto "O SENHOR me recompensou conforme a minha justiça; conforme a pureza das minhas mãos ele me retribuiu."}
"PSA_18_21" {:texto "Porque eu guardei os caminhos do SENHOR; nem me [afastei] do meu Deus praticando o mal."}
"PSA_18_22" {:texto "Porque todos os juízos dele estavam diante de mim; e não rejeitei seus estatutos para mim."}
"PSA_18_23" {:texto "Mas eu fui fiel com ele; e tomei cuidado contra minha maldade."}
"PSA_18_24" {:texto "Assim o SENHOR me recompensou conforme a minha justiça; conforme a pureza de minhas mãos perante seus olhos."}
"PSA_18_25" {:texto "Com o bondoso tu te mostras bondoso; [e] com o homem fiel tu te mostras fiel."}
"PSA_18_26" {:texto "Com o puro tu te mostras puro; mas com o perverso tu te mostras agressivo."}
"PSA_18_27" {:texto "Porque tu livras ao povo aflito, e humilhas aos olhos que se exaltam."}
"PSA_18_28" {:texto "Porque tu acendes minha lâmpada; o SENHOR meu Deus ilumina as minhas trevas."}
"PSA_18_29" {:texto "Porque contigo eu marcho [contra] um exército; e com meu Deus eu salto um muro."}
"PSA_18_30" {:texto "O caminho de Deus é perfeito; a palavra do SENHOR é refinada; ele [é] escudo para todos os que nele confiam."}
"PSA_18_31" {:texto "Porque quem é Deus, a não ser o SENHOR? E quem é rocha, a não ser o nosso Deus?"}
"PSA_18_32" {:texto "Deus [é] o que me veste de força; e o que dá perfeição ao meu caminho."}
"PSA_18_33" {:texto "Ele faz meus pés como o das cervas; e me põe em meus lugares altos."}
"PSA_18_34" {:texto "Ele ensina minhas mãos para a guerra, [de modo que] um arco de bronze se quebra em meus braços."}
"PSA_18_35" {:texto "Também tu me deste o escudo de tua salvação, e tua mão direita me sustentou; e tua mansidão me engrandeceu."}
"PSA_18_36" {:texto "Tu alargaste os meus passos abaixo de mim; e meus pés não vacilaram."}
"PSA_18_37" {:texto "Persegui a meus inimigos, e eu os alcancei; e não voltei até os exterminá-los."}
"PSA_18_38" {:texto "Eu os perfurei, que não puderam mais se levantar; caíram debaixo dos meus pés."}
"PSA_18_39" {:texto "Porque tu me preparaste com força para a batalha; fizeste se curvarem abaixo de mim aqueles que contra mim tinham se levantado."}
"PSA_18_40" {:texto "E tu me deste a nuca de meus inimigos; destruí aos que me odiavam."}
"PSA_18_41" {:texto "Eles clamaram, mas não havia quem os livrasse; [clamaram até] ao SENHOR, mas ele não lhes respondeu."}
"PSA_18_42" {:texto "Então eu os reduzi a pó, como a poeira ao vento; eu os joguei fora como a lama das ruas."}
"PSA_18_43" {:texto "Tu me livraste das brigas do povo; tu me puseste como cabeça das nações; o povo que eu não conhecia me serviu."}
"PSA_18_44" {:texto "Ao [me] ouvirem, [logo] me obedeceram; estrangeiros se sujeitaram a mim."}
"PSA_18_45" {:texto "Estrangeiros se enfraqueceram; e tremeram de medo desde suas extremidades."}
"PSA_18_46" {:texto "O SENHOR vive, e bendito [seja] minha rocha; e exaltado [seja] o Deus de minha salvação;"}
"PSA_18_47" {:texto "O Deus que dá minha vingança, e sujeita aos povos debaixo de mim;"}
"PSA_18_48" {:texto "Aquele que me livra dos meus inimigos; tu também me exaltas sobre aqueles que se levantam contra mim; tu me livras do homem violento."}
"PSA_18_49" {:texto "Por isso, SENHOR, eu te louvarei entre as nações, e cantarei ao teu Nome;"}
"PSA_18_50" {:texto "Que faz grandes as salvações de seu Rei, e pratica a bondade para com o seu ungido, com Davi, e sua semente, para sempre."}
"PSA_19_1" {:texto "Salmo de Davi, para o regente:Os céus declaram a glória de Deus; e o firmamento anuncia a obra de suas mãos."}
"PSA_19_2" {:texto "Dia após dia ele fala; e noite após noite ele mostra sabedoria."}
"PSA_19_3" {:texto "Não há língua, nem palavras, onde não se ouça a voz deles."}
"PSA_19_4" {:texto "Por toda a terra sai sua corda, e suas palavras até o fim do mundo; para o sol ele pôs uma tenda neles."}
"PSA_19_5" {:texto "E ele [é] como o noivo, que sai de sua câmara; [e] se alegra como um homem valente, para correr [seu] caminho."}
"PSA_19_6" {:texto "Desde uma extremidade dos céus [é] sua saída, e seu curso até as [outras] extremidades deles; e nada se esconde de seu calor."}
"PSA_19_7" {:texto "A lei do SENHOR é perfeita, [e] restaura a alma; o testemunho do SENHOR é fiel, [e] da sabedoria aos simples."}
"PSA_19_8" {:texto "Os preceitos do SENHOR são corretos, [e] alegram ao coração; o mandamento do SENHOR é puro, [e] ilumina aos olhos."}
"PSA_19_9" {:texto "O temor ao SENHOR é limpo, [e] permanece para sempre; os juízos do SENHOR são verdade; juntamente são justos."}
"PSA_19_10" {:texto "[São] mais desejáveis que ouro, mais do que muito ouro fino; e mais doces que o mel, e o licor de seus favos."}
"PSA_19_11" {:texto "Também por eles teu servo é advertido; por guardá-los, [há] muita recompensa."}
"PSA_19_12" {:texto "Quem pode entender [seus próprios] erros? Limpa-me dos que [me] são ocultos."}
"PSA_19_13" {:texto "Também retém a teu servo de arrogâncias, para que elas não me controlem; então eu serei sincero, e ficarei limpo de grande transgressão."}
"PSA_19_14" {:texto "Sejam agradáveis as palavras de minha boca, e o pensamento do meu coração, diante de ti, ó SENHOR, minha rocha e meu Libertador."}
"PSA_20_1" {:texto "Salmo de Davi, para o regente:Que o SENHOR te responda no dia da angústia; o nome do Deus de Jacó te ponha em lugar seguro."}
"PSA_20_2" {:texto "Que ele envie a ti ajuda desde [seu] santuário; e desde Sião ele te sustenha."}
"PSA_20_3" {:texto "Que ele se lembre de todas as tuas ofertas, e aceite os teus holocaustos. (Selá)"}
"PSA_20_4" {:texto "Que ele de a ti conforme o teu coração, e faça cumprir todo o teu propósito."}
"PSA_20_5" {:texto "Nós alegraremos muito por tua salvação, e no nome do nosso Deus levantaremos bandeiras; que o SENHOR cumpra todos os teus pedidos."}
"PSA_20_6" {:texto "Agora eu sei que o SENHOR salva a seu ungido; desde os céus de sua santidade ele lhe responderá, com o poder salvador de sua mão direita."}
"PSA_20_7" {:texto "Alguns confiam em carruagens, e outros em cavalos; mas nós nos lembraremos do nome do SENHOR nosso Deus."}
"PSA_20_8" {:texto "Eles se encurvam, e caem; mas nós nos levantamos, e ficamos em pé."}
"PSA_20_9" {:texto "Salva [-nos] ,SENHOR! Que o Rei nos ouça no dia de nosso clamor."}
"PSA_21_1" {:texto "Salmo de Davi para o regente:SENHOR, em tua força o rei se alegra; e como ele fica contente com tua salvação!"}
"PSA_21_2" {:texto "Tu lhe deste o desejo de seu coração; e tu não negaste o pedido de seus lábios. (Selá)"}
"PSA_21_3" {:texto "Porque tu foste até ele com bênçãos de bens; tu puseste na cabeça dele uma coroa de ouro fino."}
"PSA_21_4" {:texto "Ele te pediu vida, [e] tu lhe deste; muitos dias, para todo o sempre."}
"PSA_21_5" {:texto "Grande [é] a honra dele por tua salvação; honra e majestade tu lhe concedeste."}
"PSA_21_6" {:texto "Porque tu o pões em bênçãos para sempre; tu fazes abundante a alegria dele com tua face."}
"PSA_21_7" {:texto "Porque o rei confia no SENHOR; e ele nunca se abalará com a bondade do Altíssimo."}
"PSA_21_8" {:texto "Tua mão alcançará a todos o os teus inimigos; tua mão direita encontrará aos que te odeiam."}
"PSA_21_9" {:texto "Tu os porás como que [num] forno de fogo no tempo [em que se encontrarem] em tua presença; o SENHOR em sua ira os devorará; e fogo os consumirá."}
"PSA_21_10" {:texto "Tu destruirás o fruto deles de [sobre] a terra; e [também] a semente deles dos filhos dos homens."}
"PSA_21_11" {:texto "Porque eles quiseram o mal contra ti; planejaram uma cilada, [mas] não tiveram sucesso."}
"PSA_21_12" {:texto "Porque tu os porás em fuga; com [tuas flechas] nas cordas tu lhes apontarás no rosto."}
"PSA_21_13" {:texto "Exalta-te, SENHOR, em tua força; cantaremos e louvaremos o teu poder."}
"PSA_22_1" {:texto "Salmo de Davi para o regente, como em “cerva da manhã”:Deus meu, Deus meu, por que me desamparaste? Longe [estás] de meu livramento [e] das palavras de meu gemido."}
"PSA_22_2" {:texto "Deus meu, eu clamo de dia, e tu não me respondes; também [clamo] de noite, e não tenho sossego."}
"PSA_22_3" {:texto "Porém tu és Santo, que habitas [nos] louvores de Israel."}
"PSA_22_4" {:texto "Nossos pais confiaram em ti; eles confiaram, e tu os livraste."}
"PSA_22_5" {:texto "Eles clamaram a ti, e escaparam [do perigo] ; eles confiaram em ti, e não foram envergonhados."}
"PSA_22_6" {:texto "Mas eu sou um verme, e não um homem; [sou] humilhado pelos homens, e desprezado pelo povo."}
"PSA_22_7" {:texto "Todos os que me veem zombam de mim; abrem os lábios [e] sacodem a cabeça, [dizendo] :"}
"PSA_22_8" {:texto "Ele confiou no “SENHOR”; [agora] que ele o salve e o liberte; pois se agrada nele."}
"PSA_22_9" {:texto "Tu és o que me tiraste do ventre; [e] o que me deu segurança, [estando eu] junto aos seios de minha mãe."}
"PSA_22_10" {:texto "Eu fui lançado sobre ti desde [que saí d] o útero; desde o ventre de minha mãe tu [és] meu Deus."}
"PSA_22_11" {:texto "Não fiques longe de mim, porque a minha angústia está perto; pois não há quem [me] ajude."}
"PSA_22_12" {:texto "Muitos touros me cercaram; fortes de Basã me rodearam."}
"PSA_22_13" {:texto "Abriram contra mim suas bocas, [como] leão que despedaça e ruge."}
"PSA_22_14" {:texto "Eu me derramei como água, e todos os meus ossos se soltaram uns dos outros; meu coração é como cera, [e] se derreteu por entre meus órgãos."}
"PSA_22_15" {:texto "Minha força se secou como um caco de barro, e minha língua está grudada no céu da boca; e tu me pões no pó da morte;"}
"PSA_22_16" {:texto "Porque cães ficaram ao meu redor; uma multidão de malfeitores me cercou; perfuraram minhas mãos e meus pés."}
"PSA_22_17" {:texto "Eu poderia contar todos os meus ossos; eles estão [me] olhando, e prestando atenção em mim."}
"PSA_22_18" {:texto "Eles repartem entre si minhas roupas; e sobre minha vestimenta eles lançam sortes."}
"PSA_22_19" {:texto "Porém tu, SENHOR, não fiques longe; força minha, apressa-te para me socorrer."}
"PSA_22_20" {:texto "Livra minha alma da espada; [e] minha vida da violência do cão."}
"PSA_22_21" {:texto "Salva-me da boca do leão; e responde-me dos chifres dos touros selvagens."}
"PSA_22_22" {:texto "[Então] eu contarei teu nome a meus irmãos; no meio da congregação eu te louvarei."}
"PSA_22_23" {:texto "Vós que temeis ao SENHOR, louvai a ele! E vós, de toda a semente de Jacó, glorificai a ele! Prestai culto a ele, vós de toda a semente de Israel."}
"PSA_22_24" {:texto "Porque ele não desprezou nem abominou a aflição do aflito, nem escondeu seu rosto dele; mas sim, quando [o aflito] clamou, ele [o] ouviu."}
"PSA_22_25" {:texto "Meu louvor será para ti na grande congregação; eu pagarei meus juramentos perante os que o temem."}
"PSA_22_26" {:texto "Os humilhados comerão, e ficarão fartos; louvarão ao SENHOR aqueles que o buscam; vosso coração viverá para sempre."}
"PSA_22_27" {:texto "Todos os extremos da terra se lembrarão [disso] , e se converterão ao SENHOR; e todas as gerações das nações adorarão diante de ti."}
"PSA_22_28" {:texto "Porque o reino [pertence] ao SENHOR; e ele governa sobre as nações."}
"PSA_22_29" {:texto "Todos os ricos da terra comerão e adorarão, [e] perante o rosto dele se prostrarão todos os que descem ao pó, e [que] não podem manter viva sua alma."}
"PSA_22_30" {:texto "A descendência o servirá; ela será contada ao Senhor, para a geração [seguinte] ."}
"PSA_22_31" {:texto "Chegarão, e anunciarão a justiça dele ao povo que nascer, porque ele [assim] fez."}
"PSA_23_1" {:texto "Salmo de Davi:O SENHOR é meu pastor, nada me faltará."}
"PSA_23_2" {:texto "Ele me faz deitar em pastos verdes, [e] me leva a águas quietas."}
"PSA_23_3" {:texto "Ele restaura minha alma, [e] me guia pelos caminhos da justiça por seu nome."}
"PSA_23_4" {:texto "Ainda que eu venha a andar pelo vale da sombra da morte, não temerei mal algum, porque tu estás comigo; tua vara e teu cajado me consolam."}
"PSA_23_5" {:texto "Tu preparas uma mesa diante de mim à vista de meus adversários; unges a minha cabeça com azeite, meu cálice transborda."}
"PSA_23_6" {:texto "Certamente o bem e a bondade me seguirão todos os dias de minha vida; e habitarei na casa do SENHOR por muitos e muitos dias."}
"PSA_24_1" {:texto "Salmo de Davi:Ao SENHOR [pertence] a terra, e sua plenitude; o mundo, e os que nele habitam."}
"PSA_24_2" {:texto "Porque ele a fundou sobre os mares; e sobre os rios ele a firmou."}
"PSA_24_3" {:texto "Quem subirá ao monte do SENHOR? E quem ficará de pé no lugar de sua santidade?"}
"PSA_24_4" {:texto "Aquele que é limpo de mãos, e puro de coração, que não entrega sua alma para as coisas vãs, nem jura enganosamente."}
"PSA_24_5" {:texto "Este receberá a bênção do SENHOR, e a justiça do Deus de sua salvação."}
"PSA_24_6" {:texto "Esta é a geração dos que o buscam, dos que procuram a tua face: [a geração de] Jacó. (Selá)"}
"PSA_24_7" {:texto "Levantai, portas, vossas cabeças; e levantai-vos vós, entradas eternas; para que entre o Rei da Glória."}
"PSA_24_8" {:texto "Quem é o Rei da Glória? O SENHOR forte e poderoso, o SENHOR poderoso na guerra."}
"PSA_24_9" {:texto "Levantai, portas, vossas cabeças; e levantai-vos vós, entradas eternas; para que entre o Rei da Glória."}
"PSA_24_10" {:texto "Quem é este Rei da Glória? O SENHOR dos exércitos; ele é o Rei da Glória! (Selá)"}
"PSA_25_1" {:texto "Salmo de Davi:A ti, SENHOR, levanto minha alma."}
"PSA_25_2" {:texto "Meu Deus, eu confio em ti; não me deixes envergonhado, nem que meus inimigos se alegrem por me [vencerem] ."}
"PSA_25_3" {:texto "Certamente todos os que esperam em ti, nenhum será envergonhado; envergonhados serão os que traem sem motivo."}
"PSA_25_4" {:texto "Tu me fazes conhecer os teus caminhos; ensina-me teus lugares onde se deve andar."}
"PSA_25_5" {:texto "Guia-me em tua verdade, e ensina-me; porque tu és o Deus de minha salvação; eu espero por ti o dia todo."}
"PSA_25_6" {:texto "Lembra-te, SENHOR, de tuas misericórdias e de tuas bondades; porque elas são desde a eternidade."}
"PSA_25_7" {:texto "Não te lembres dos pecados de minha juventude e das minhas transgressões; [mas sim] , conforme tua misericórdia, lembra-te de mim por tua bondade, SENHOR."}
"PSA_25_8" {:texto "O SENHOR é bom e correto; por isso ele ensinará o caminho aos pecadores."}
"PSA_25_9" {:texto "Ele guiará os humildes ao [bom] juízo; e ensinará aos humildes seu caminho."}
"PSA_25_10" {:texto "Todos os caminhos do SENHOR são bondade e verdade, para aqueles que guardam seu pacto e seus testemunhos."}
"PSA_25_11" {:texto "Pelo teu nome, SENHOR, perdoa a minha maldade, porque ela é grande."}
"PSA_25_12" {:texto "Qual é o homem que teme ao SENHOR? Ele lhe ensinará o caminho [que] deve escolher."}
"PSA_25_13" {:texto "Sua alma habitará no bem; e sua semente [isto é, sua descendência] possuirá a terra em herança."}
"PSA_25_14" {:texto "O segredo do SENHOR é para os que o temem; e ele lhes faz conhecer seu pacto."}
"PSA_25_15" {:texto "Meus olhos [estão] continuamente [voltados] para o SENHOR, porque ele tirará meus pés da rede de caça."}
"PSA_25_16" {:texto "Olha para mim, e mim, e tem piedade de mim, porque eu estou solitário e miserável."}
"PSA_25_17" {:texto "As aflições de meu coração têm se multiplicado; tira-me de minhas angústias."}
"PSA_25_18" {:texto "Presta atenção para minha miséria e meu cansativo trabalho; e tira todos os meus pecados."}
"PSA_25_19" {:texto "Presta atenção a meus inimigos, porque eles estão se multiplicando; eles me odeiam com ódio violento."}
"PSA_25_20" {:texto "Guarda minha alma, e livra-me; não me deixes envergonhado, porque eu confio em ti."}
"PSA_25_21" {:texto "Integridade e justiça me guardem, porque eu espero em ti."}
"PSA_25_22" {:texto "Ó Deus, resgata Israel de todas as suas angústias."}
"PSA_26_1" {:texto "Salmo de Davi:Faze-me justiça, SENHOR, pois eu ando em minha sinceridade; e eu confio no SENHOR, não me abalarei."}
"PSA_26_2" {:texto "Prova-me, SENHOR, e testa-me; examina meus sentimentos e meu coração."}
"PSA_26_3" {:texto "Porque tua bondade está diante dos meus olhos; e eu ando em tua verdade."}
"PSA_26_4" {:texto "Não me sento com homens vãos, nem converso com desonestos."}
"PSA_26_5" {:texto "Eu odeio a reunião dos malfeitores; e não me sento com os perversos."}
"PSA_26_6" {:texto "Lavo minhas mãos em inocência, e ando ao redor do teu altar, SENHOR;"}
"PSA_26_7" {:texto "Para que eu declare com voz de louvores, e para contar todas as tuas maravilhas."}
"PSA_26_8" {:texto "SENHOR, eu amo a morada de tua Casa, e o lugar onde habita a tua glória."}
"PSA_26_9" {:texto "Não juntes minha alma com os pecadores, nem minha vida com homens sanguinários;"}
"PSA_26_10" {:texto "Nas mãos deles há más intenções; e sua mão direita é cheia de suborno."}
"PSA_26_11" {:texto "Mas eu ando em minha sinceridade; livra-me e tem piedade de mim."}
"PSA_26_12" {:texto "Meu pé está em um caminho plano; louvarei ao SENHOR nas congregações."}
"PSA_27_1" {:texto "Salmo de Davi:O SENHOR é minha luz e minha salvação; a quem temerei? O SENHOR é a força da minha vida; de quem terei medo?"}
"PSA_27_2" {:texto "Quando os maus chegaram perto de mim, meus adversários e meus inimigos contra mim, para devorarem minha carne; eles mesmos tropeçaram e caíram."}
"PSA_27_3" {:texto "Ainda que um exército me cercasse, eu não temeria; ainda que uma guerra se levantasse contra mim, nisto mantenho confiança."}
"PSA_27_4" {:texto "Pedi uma coisa ao SENHOR, [e] a ela buscarei: que eu possa morar na casa do SENHOR todos os dias de minha vida, para ver a beleza do SENHOR, e consultá-lo em seu Templo."}
"PSA_27_5" {:texto "Porque no dia mal ele me esconderá em seu abrigo; ele me encobrirá no oculto de sua tenda; [e] me porá sobre as rochas."}
"PSA_27_6" {:texto "E minha cabeça será exaltada acima de meus inimigos, que estão ao redor de mim; e eu sacrificarei na tenda dele sacrifícios com alta voz; cantarei e louvarei ao SENHOR."}
"PSA_27_7" {:texto "Ouve, SENHOR, minha voz, [quando] eu clamo; tem piedade de mim, e responde-me."}
"PSA_27_8" {:texto "Ele diz a ti, meu coração: Buscai a minha face.Eu busco a tua face, SENHOR."}
"PSA_27_9" {:texto "Não escondas de mim a tua face, nem rejeites a teu servo com ira; tu tens sido meu socorro; não me deixes, nem me desampares, ó Deus de minha salvação."}
"PSA_27_10" {:texto "Porque meu pai e minha mãe me abandonaram, mas o SENHOR me recolherá."}
"PSA_27_11" {:texto "Ensina-me, SENHOR, o teu caminho; e guia-me pela via correta, por causa dos meus inimigos."}
"PSA_27_12" {:texto "Não me entregues à vontade dos meus adversários, porque se levantaram contra mim falsas testemunhas, e também ao que sopra violência."}
"PSA_27_13" {:texto "Se eu não tivesse crido que veria a bondade do SENHOR na terra dos viventes, [certamente já teria perecido] ."}
"PSA_27_14" {:texto "Espera no SENHOR, esforça-te, e ele fortalecerá o teu coração; espera pois ao SENHOR."}
"PSA_28_1" {:texto "Salmo de Davi:A ti, SENHOR, rocha minha, eu clamo; não te silencies para comigo; para que não [aconteça de, se] tu calares quanto a mim, eu não [me torne] semelhante aos que descem à cova."}
"PSA_28_2" {:texto "Ouve a voz de minhas súplicas, quando eu clamar a ti, ao levantar às minhas mãos ao templo de tua santidade."}
"PSA_28_3" {:texto "Não me jogues fora com os perversos, nem com os praticantes da maldade, que falam de paz com sem próximo, porém [há] o mal no coração deles."}
"PSA_28_4" {:texto "Dá-lhes conforme as obras deles, e conforme a maldade de seus atos; dá-lhes conforme a obra das mãos deles, retribui-lhes como eles merecem."}
"PSA_28_5" {:texto "Porque eles não dão atenção para os atos do SENHOR, nem para a obra de suas mãos; [então] ele os derrubará e não os edificará."}
"PSA_28_6" {:texto "Bendito [seja] o SENHOR, porque ele ouviu a voz de minhas súplicas."}
"PSA_28_7" {:texto "O SENHOR [é] a minha força e meu escudo; meu coração confiou nele, e foi socorrido; por isso meu coração salta de alegria; e com meu canto eu o louvarei."}
"PSA_28_8" {:texto "O SENHOR [é] a força deles, e o poder das salvações de seu Ungido."}
"PSA_28_9" {:texto "Salva a teu povo, e abençoa a tua herança; e apascenta-os, e levanta-os para sempre."}
"PSA_29_1" {:texto "Salmo de Davi:Reconhecei ao SENHOR, vós filhos dos poderosos, reconhecei ao SENHOR [sua] glória e força."}
"PSA_29_2" {:texto "Reconhecei ao SENHOR a glória de seu nome; adorai ao SENHOR na honra da santidade."}
"PSA_29_3" {:texto "A voz do SEHOR [percorre por] sobre as águas; o Deus da glória troveja; o SENHOR [está] sobre muitas águas."}
"PSA_29_4" {:texto "A voz do SENHOR [é] poderosa; a voz do SENHOR [é] gloriosa."}
"PSA_29_5" {:texto "A voz do SENHOR quebra aos cedros; o SENHOR quebra aos cedros do Líbano."}
"PSA_29_6" {:texto "Ele os faz saltar como bezerros; ao Líbano e a Sírion como a filhotes de bois selvagens."}
"PSA_29_7" {:texto "A voz do SENHOR faz chamas de fogo se separarem."}
"PSA_29_8" {:texto "A voz do SENHOR faz tremer o deserto; o SENHOR faz tremer o deserto de Cades."}
"PSA_29_9" {:texto "A voz do SENHOR faz as cervas terem filhotes, e tira a cobertura das florestas; e em seu templo todos falam de [sua] glória."}
"PSA_29_10" {:texto "O SENHOR se sentou sobre as muitas águas [como dilúvio] ; e o SENHOR se sentará como rei para sempre."}
"PSA_29_11" {:texto "O SENHOR dará força a seu povo; o SENHOR abençoará a seu povo com paz."}
"PSA_30_1" {:texto "Salmo e canção de Davi para a dedicação da casa:Eu te exaltarei, SENHOR, porque tu me levantaste, e fizeste com que meus inimigos não se alegrassem por causa de mim."}
"PSA_30_2" {:texto "SENHOR, meu Deus; eu clamei a ti, e tu me curaste."}
"PSA_30_3" {:texto "SENHOR, tu levantaste minha alma do Xeol; preservaste-me a vida, para que eu não descesse à sepultura."}
"PSA_30_4" {:texto "Cantai ao SENHOR, vós [que sois] santos dele, [e] celebrai a memória de sua santidade."}
"PSA_30_5" {:texto "Porque sua ira [dura por] um momento; mas seu favor [dura por toda a] vida; o choro fica pela noite, mas a alegria [vem] pela manhã."}
"PSA_30_6" {:texto "Eu disse em minha boa situação: Nunca serei abalado."}
"PSA_30_7" {:texto "SENHOR, pelo teu favor, tu firmaste minha montanha; [mas quando] tu encobriste o teu rosto, fiquei perturbado."}
"PSA_30_8" {:texto "A ti, DEUS, eu clamei; e supliquei ao SENHOR,"}
"PSA_30_9" {:texto "[Dizendo] : Que proveito [há] em meu sangue, [ou] em minha descida a cova? Por acaso o pó da terra te louvará, ou anunciará tua fidelidade?"}
"PSA_30_10" {:texto "Ouve [-me] , SENHOR, e tem piedade de mim; sê tu, SENHOR, o meu ajudador."}
"PSA_30_11" {:texto "Tu tornaste meu pranto em dança; tu desamarraste o meu saco [de lamentação] , e me envolveste de alegria."}
"PSA_30_12" {:texto "Por isso a [minha] glória cantará para ti, e não se calará; SENHOR, Deus meu, para sempre eu te louvarei."}
"PSA_31_1" {:texto "Salmo de Davi, para o regente:Eu confio em ti, SENHOR; não me deixes envergonhado para sempre; livra-me por tua justiça."}
"PSA_31_2" {:texto "Inclina a mim os teus ouvidos, faze-me escapar depressa [do perigo] ; sê tu por minha rocha firme, por casa fortíssima, para me salvar."}
"PSA_31_3" {:texto "Porque tu [és] minha rocha e minha fortaleza; guia-me e conduz-me por causa do teu nome."}
"PSA_31_4" {:texto "Tira-me da rede que me prepararam em segredo, pois tu [és] minha força."}
"PSA_31_5" {:texto "Em tuas mãos eu confio meu espírito; tu me resgataste, SENHOR, Deus da verdade."}
"PSA_31_6" {:texto "Odeio os que dedicam sua atenção a coisas vãs [e] enganosas; porém eu confio no SENHOR."}
"PSA_31_7" {:texto "Em tua bondade eu me alegrarei e ficarei cheio de alegria, porque tu viste minha situação miserável; tu reconheceste as angústias de minha alma."}
"PSA_31_8" {:texto "E tu não me entregastes nas mãos do [meu] inimigo; tu puseste meus pés num lugar amplo."}
"PSA_31_9" {:texto "Tem misericórdia de mim, SENHOR, porque eu estou angustiado; meus olhos, minha alma e meu ventre foram consumidos pelo sofrimento."}
"PSA_31_10" {:texto "Porque minha vida foi destruída pela aflição, e meus anos pelos suspiros; minha força descaiu por minha maldade; e meus ossos se enfraqueceram."}
"PSA_31_11" {:texto "Por causa de todos os meus adversários eu fui humilhado até entre os meus próximos; e fui feito horrível entre os meus conhecidos; os que me veem na rua fogem de mim."}
"PSA_31_12" {:texto "No coração [deles] eu fui esquecido, como se [estivesse] morto; me tornei como um vaso destruído."}
"PSA_31_13" {:texto "Porque ouvi a murmuração de muitos, temor [há] ao redor; juntamente tramam contra mim, planejam como matar minha alma."}
"PSA_31_14" {:texto "Mas eu confio em ti, SENHOR, eu te chamo de meu Deus."}
"PSA_31_15" {:texto "Meus tempos estão em tuas mãos; livra-me da mão dos meus inimigos e daqueles que me perseguem."}
"PSA_31_16" {:texto "Faz brilhar o teu rosto sobre teu servo; salva-me por tua bondade."}
"PSA_31_17" {:texto "SENHOR, não me deixes envergonhado, pois eu clamo a ti; que os perversos se envergonhem e se calem no Xeol."}
"PSA_31_18" {:texto "Emudeçam os lábios mentirosos, que falam coisas duras contra o justo, com arrogância e desprezo."}
"PSA_31_19" {:texto "Como [é] grade a tua bondade, que guardaste para aqueles que te temem! Tu trabalhaste para os que confiam em ti, na presença dos filhos dos homens."}
"PSA_31_20" {:texto "No esconderijo de tua presença tu os escondes das arrogâncias dos homens; em [tua] tenda tu os encobres da rivalidade das línguas."}
"PSA_31_21" {:texto "Bendito [seja] o SENHOR, pois ele fez maravilhosa sua bondade para comigo, [como] uma cidade segura."}
"PSA_31_22" {:texto "Eu dizia em minha aflição: Estou cortado de diante de teus olhos.Porém tu ouviste a voz de minhas súplicas quando clamei a ti."}
"PSA_31_23" {:texto "Amai ao SENHOR, todos vós santos dele; o SENHOR guarda aos fiéis, e retribui abundantemente ao que usa de arrogância."}
"PSA_31_24" {:texto "Sede fortes, e ele fortalecerá vosso coração, todos vós que esperais no SENHOR."}
"PSA_32_1" {:texto "Instrução de Davi:Bem-aventurado aquele cuja transgressão é perdoada, cujo pecado é encoberto."}
"PSA_32_2" {:texto "Bem-aventurado o homem a quem o SENHOR não considera a maldade, e em cujo espírito não há engano."}
"PSA_32_3" {:texto "Enquanto fiquei calado, meus ossos ficaram cada vez mais fracos com meu gemido pelo dia todo."}
"PSA_32_4" {:texto "Porque de dia e de noite tua mão pesava sobre mim; meu humor ficou seco como no verão. (Selá)"}
"PSA_32_5" {:texto "Eu reconheci meu pecado a ti, e não escondi minha maldade. Eu disse: Confessarei ao SENHOR minhas transgressões;E tu perdoaste a maldade do meu pecado. (Selá)"}
"PSA_32_6" {:texto "Por isso cada santo deve orar a ti em [todo] tempo que achar; até no transbordar de muitas águas, elas não chegarão a ele."}
"PSA_32_7" {:texto "Tu [és] meu esconderijo, tu me guardas da angústia; tu me envolves de canções alegres de liberdade. (Selá)"}
"PSA_32_8" {:texto "Eu te instruirei, e de ensinarei o caminho que deves seguir; eu te aconselharei, e [porei] meus olhos em ti."}
"PSA_32_9" {:texto "Não sejais como o cavalo [ou] como a mula, que não têm entendimento; cuja boca é presa com o cabresto e o freio, para que não cheguem a ti."}
"PSA_32_10" {:texto "O perverso [terá] muitas dores, mas aquele que confia no SENHOR, a bondade o rodeará."}
"PSA_32_11" {:texto "Alegrai-vos no SENHOR, e enchei de alegria vós justos, e cantai alegremente todos os corretos de coração."}
"PSA_33_1" {:texto "Cantai ao SENHOR, vós [que sois] justos; aos corretos convém louvar."}
"PSA_33_2" {:texto "Louvai ao SENHOR com harpa; cantai a ele com alaúde [e] instrumento de dez cordas."}
"PSA_33_3" {:texto "Cantai-lhe uma canção nova; tocai [instrumento] bem com alegria."}
"PSA_33_4" {:texto "Porque a palavra do SENHOR é correta; e todas suas obras [são] fiéis."}
"PSA_33_5" {:texto "Ele ama a justiça e o juízo; a terra está cheia da bondade do SENHOR."}
"PSA_33_6" {:texto "Pala palavra do SENHOR foram feitos os céus; e todo o seu exército [foi feito] pelo sopro de sua boca."}
"PSA_33_7" {:texto "Ele junta as águas do mar como se estivessem empilhadas; aos abismos ele põe como depósitos de tesouros."}
"PSA_33_8" {:texto "Toda a terra, tenha temor ao SENHOR; todos os moradores do mundo prestem reverência a ele."}
"PSA_33_9" {:texto "Porque ele falou, [e logo] se fez; ele mandou, [e logo] apareceu."}
"PSA_33_10" {:texto "O SENHOR desfez a intenção das nações; ele destruiu os planos dos povos."}
"PSA_33_11" {:texto "O conselho do SENHOR permanece para sempre; as intenções de seu coração [continuam] de geração após geração."}
"PSA_33_12" {:texto "Bem-aventurada [é] a nação em que seu Deus é o SENHOR; o povo que ele escolheu para si por herança."}
"PSA_33_13" {:texto "O SENHOR olha desde os céus; ele vê a todos os filhos dos homens."}
"PSA_33_14" {:texto "Desde sua firme morada ele observa a todos os moradores da terra."}
"PSA_33_15" {:texto "Ele forma o coração de todos eles; ele avalia todas as obras deles."}
"PSA_33_16" {:texto "O rei não se salva pela grandeza de [seu] exército, nem o valente escapa do perigo pela [sua] muita força."}
"PSA_33_17" {:texto "O cavalo é falho como segurança, com sua grande força não livra do perigo."}
"PSA_33_18" {:texto "Eis que os olhos do SENHOR [estão] sobre aqueles que o temem, sobre os que esperam pela sua bondade."}
"PSA_33_19" {:texto "Para livrar a alma deles da morte, e para os manter vivos durante a fome."}
"PSA_33_20" {:texto "Nossa alma espera no SENHOR; ele [é] nossa socorro e nosso escudo."}
"PSA_33_21" {:texto "Porque nele nosso coração se alegra, porque confiamos no nome de sua santidade."}
"PSA_33_22" {:texto "Que tua bondade, SENOR, esteja sobre nós, assim como nós esperamos em ti."}
"PSA_34_1" {:texto "Salmo de Davi, quando ele mudou seu comportamento perante Abimeleque, que o expulsou, e ele foi embora:Louvarei ao SENHOR em todo tempo; [haverá] louvor a ele continuamente em minha boca."}
"PSA_34_2" {:texto "Minha alma se orgulhará no SENHOR; os humildes ouvirão, e se alegrarão."}
"PSA_34_3" {:texto "Engrandecei ao SENHOR comigo, e juntos exaltemos o seu nome."}
"PSA_34_4" {:texto "Busquei ao SENHOR. Ele me respondeu, e me livrou de todos os meus temores."}
"PSA_34_5" {:texto "Os que olham para ele ficam visivelmente alegres, e seus rostos não são envergonhados."}
"PSA_34_6" {:texto "Este miserável clamou, e o SENHOR ouviu; e ele o salvou de todas as suas angústias."}
"PSA_34_7" {:texto "O anjo do SENHOR fica ao redor daqueles que o temem, e os livra."}
"PSA_34_8" {:texto "Experimentai, e vede que o SENHOR é bom; bem-aventurado [é] o homem que confia nele."}
"PSA_34_9" {:texto "Temei ao SENHOR vós, os seus santos; porque nada falta para aqueles que o temem."}
"PSA_34_10" {:texto "Os filhos dos leões passam necessidades e têm fome; mas os que buscam ao SENHOR não têm falta de bem algum."}
"PSA_34_11" {:texto "Vinde, filhos, ouvi a mim; eu vos ensinarei o temor ao SENHOR."}
"PSA_34_12" {:texto "Quem é o homem que deseja vida, que ama [viver por muitos] dias, para ver o bem?"}
"PSA_34_13" {:texto "Guarda a tua língua do mal, e os teus lábios de falar falsidade."}
"PSA_34_14" {:texto "Desvia-te do mal, e faze o bem; busca a paz, e segue-a."}
"PSA_34_15" {:texto "Os olhos do SENHOR estão sobre os justos, e seus ouvidos [atentos] ao seu clamor."}
"PSA_34_16" {:texto "A face do SENHOR está contra aqueles que fazem o mal, para tirar da terra a memória deles."}
"PSA_34_17" {:texto "Os [justos] clamam, e o SENHOR os ouve. Ele os livra de todas as suas angústias."}
"PSA_34_18" {:texto "O SENHOR [está] perto daqueles que estão com o coração partido, e sava os aflitos de espírito."}
"PSA_34_19" {:texto "Muitas são as adversidades do justo, mas o SENHOR o livra de todas elas."}
"PSA_34_20" {:texto "Ele guarda todos os seus ossos; nenhum deles é quebrado."}
"PSA_34_21" {:texto "O mal matará o perverso, e os que odeiam o justo serão condenados."}
"PSA_34_22" {:texto "O SENHOR resgata a alma de seus servos, e todos os que nele confiam não receberão condenação."}
"PSA_35_1" {:texto "Salmo de Davi:Disputa, SENHOR contra os meus adversários; luta contra os que lutam contra mim."}
"PSA_35_2" {:texto "Pega os [teus] pequeno e grande escudos, e levanta-te em meu socorro."}
"PSA_35_3" {:texto "E tira a lança, e fecha [o caminho] ao encontro de meus perseguidores; dize à minha alma: Eu sou tua salvação."}
"PSA_35_4" {:texto "Envergonhem-se, e sejam humilhados os que buscam [matar] a minha alma; tornem-se para trás, e sejam envergonhados os que planejam o mal contra mim."}
"PSA_35_5" {:texto "Sejam como a palha perante o vento; e que o anjo do SENHOR os remova."}
"PSA_35_6" {:texto "Que o caminho deles seja escuro e escorregadio; e o anjo do SENHOR os persiga."}
"PSA_35_7" {:texto "Porque sem motivo eles esconderam de mim a cova de sua rede; sem motivo eles cavaram para minha alma."}
"PSA_35_8" {:texto "Venha sobre ele a destruição sem que ele saiba [de antemão] ; e sua rede, que ele escondeu, que o prenda; que ele, assolado, caia nela."}
"PSA_35_9" {:texto "E minha alma se alegrará no SENHOR; ela se encherá de alegria por sua salvação."}
"PSA_35_10" {:texto "Todos os meus ossos dirão: SENHOR, quem [é] como tu, que livras ao miserável daquele que é mais forte do que ele, e ao miserável e necessitado, daquele que o rouba?"}
"PSA_35_11" {:texto "Levantam-se más testemunhas; exigem de mim [coisas] que não sei."}
"PSA_35_12" {:texto "Ele retribuem o bem com o mal, desolando a minha alma."}
"PSA_35_13" {:texto "Mas eu, quando ficavam doentes, minha roupa [era] de saco; eu afligia a minha alma com jejuns, e minha oração voltava ao meu seio."}
"PSA_35_14" {:texto "Eu agia [para com eles] como [para] um amigo [ou] irmão meu; eu andava encurvado, como que de luto pela mãe."}
"PSA_35_15" {:texto "Mas quando eu vacilava, eles se alegravam e se reuniam; inimigos se reuniam sem que eu soubesse; eles me despedaçavam [em palavras] ,e não se calavam."}
"PSA_35_16" {:texto "Entre os fingidos zombadores [em] festas, eles rangiam seus dentes por causa de mim."}
"PSA_35_17" {:texto "Senhor, até quando tu [somente] observarás? Resgata minha alma das assolações deles; minha única [vida] dos filhos dos leões."}
"PSA_35_18" {:texto "Assim eu te louvarei na grande congregação; numa grande multidão eu celebrarei a ti."}
"PSA_35_19" {:texto "Não se alegrem meus inimigos por causa de mim por um mau motivo, [nem] acenem com os olhos aquele que me odeiam sem motivo."}
"PSA_35_20" {:texto "Porque eles não falam de paz; mas sim, planejam falsidades contra os pacíficos da terra."}
"PSA_35_21" {:texto "E abrem suas bocas contra mim, dizendo: Ha-ha, nós vimos com nossos [próprios] olhos!"}
"PSA_35_22" {:texto "Tu, SENHOR, tens visto [isso] ; não fiques calado; SENHOR, não fiques longe de mim."}
"PSA_35_23" {:texto "Levanta-te e acorda para meu direito, Deus meu, e Senhor meu, para minha causa."}
"PSA_35_24" {:texto "Julga-me conforme a tua justiça, SENHOR meu Deus; e não deixes eles se alegrarem de mim."}
"PSA_35_25" {:texto "Não digam eles em seus corações: Ahá, [vencemos] , alma nossa!nem digam: Nós já o devoramos!"}
"PSA_35_26" {:texto "Que eles se envergonhem, e sejam juntamente humilhados os que se alegram pelo meu mal; vistam-se de vergonha e confusão os que se engrandecem contra mim."}
"PSA_35_27" {:texto "Cantem de alegria e sejam muito contentes os que amam a minha justiça; e continuamente digam: Seja engrandecido o SENHOR, que ama o bem-estar de seu servo."}
"PSA_35_28" {:texto "E minha língua falará de tua justiça, louvando a ti o dia todo."}
"PSA_36_1" {:texto "Salmo de Davi, servo do SENHOR, para o regente:A transgressão do perverso diz ao meu coração [que] não há temor a Deus perante seus olhos."}
"PSA_36_2" {:texto "Porque ele é [tão] orgulhoso diante de seus olhos [que não] achar [nem] odiar sua própria maldade."}
"PSA_36_3" {:texto "As palavras da boca dele são malícia e falsidade; ele deixou de [fazer] o que é sábio e bom."}
"PSA_36_4" {:texto "Ele planeja maldade em sua cama; fica no caminho que não é bom; não rejeita o mal."}
"PSA_36_5" {:texto "SENHOR, tua bondade [alcança] os céus, e tua fidelidade [chega] até as mais altas nuvens."}
"PSA_36_6" {:texto "Tua justiça é como as montanhas de Deus, teus juízos [como] um grande abismo; tu, SENHOR, guardas [a vida] dos homens e dos animais."}
"PSA_36_7" {:texto "Como é preciosa, SENHOR, a tua bondade! Porque os filhos dos homens se abrigam à sombra de tuas asas."}
"PSA_36_8" {:texto "Eles se fartam da comida de tua casa, e tu lhes dás de beber [do] ribeiro de teus prazeres."}
"PSA_36_9" {:texto "Porque contigo está a fonte da vida; em tua luz vemos a luz [verdadeira] ."}
"PSA_36_10" {:texto "Estende tua bondade sobre os que te conhecem; e tua justiça sobre os corretos de coração."}
"PSA_36_11" {:texto "Não venha sobre mim o pé dos arrogantes, e que a não dos perversos não me mova."}
"PSA_36_12" {:texto "Ali cairão os que praticam a maldade; eles foram lançados, e não podem se levantar."}
"PSA_37_1" {:texto "Salmo de Davi:Não te irrites com os malfeitores, nem tenhas inveja dos que praticam perversidade."}
"PSA_37_2" {:texto "Porque assim como a erva, eles logo serão cortados; e como a verdura eles cairão."}
"PSA_37_3" {:texto "Confia no SENHOR, e faze o bem; habita a terra, e te alimentarás em segurança."}
"PSA_37_4" {:texto "E agrada-te no SENHOR; e ele te dará os pedidos de teu coração."}
"PSA_37_5" {:texto "Entrega o teu caminho ao SENHOR; confia nele, e ele agirá,"}
"PSA_37_6" {:texto "e manifestará a tua justiça como a luz, e o teu direito como o sol do meio-dia."}
"PSA_37_7" {:texto "Descansa no SENHOR, e espera nele; não te irrites contra aquele cujo caminho prospera, [nem] com o homem que planeja maldades."}
"PSA_37_8" {:texto "Detém a ira, abandona o furor; não te irrites de maneira alguma para fazer o mal."}
"PSA_37_9" {:texto "Porque os malfeitores serão exterminados; mas os que esperam no SENHOR herdarão a terra."}
"PSA_37_10" {:texto "E ainda um pouco, e o perverso não [mais existirá] ; e tu olharás para o lugar dele, e ele não [aparecerá] ."}
"PSA_37_11" {:texto "Mas os mansos herdarão a terra, e se agradarão com muita paz."}
"PSA_37_12" {:texto "O perverso trama contra o justo, e range seus dentes contra ele."}
"PSA_37_13" {:texto "O Senhor ri dele, porque vê que já vem o dia dele."}
"PSA_37_14" {:texto "O perversos pegarão a espada e armarão seu arco, para abaterem ao miserável e necessitado, para matarem os corretos no caminho."}
"PSA_37_15" {:texto "Mas sua espada entrará em seus corações, e seus arcos serão quebrados."}
"PSA_37_16" {:texto "O pouco que o justo [tem] é melhor do que a riqueza de muitos perversos."}
"PSA_37_17" {:texto "Porque os braços dos perversos serão quebrados, mas o SENHOR sustenta os justos."}
"PSA_37_18" {:texto "O SENHOR conhece os dias dos corretos, e a herança deles permanecerá para sempre."}
"PSA_37_19" {:texto "Eles não serão envergonhados no tempo mau, e terão fartura nos dias de fome."}
"PSA_37_20" {:texto "Mas os perversos perecerão, e os inimigos do SENHOR desaparecerão tal como as melhores partes dos cordeiros; eles de desfarão na fumaça."}
"PSA_37_21" {:texto "O perverso toma emprestado, e paga de volta; mas o justo se compadece e dá."}
"PSA_37_22" {:texto "Porque os que são por ele abençoados herdarão a terra; mas os que são por ele amaldiçoados serão removidos."}
"PSA_37_23" {:texto "Os passos do homem [justo] são preparados pelo SENHOR; e ele tem prazer em seu caminho."}
"PSA_37_24" {:texto "Quando cai, ele não fica derrubado, pois o SENHOR sustenta a sua mão."}
"PSA_37_25" {:texto "Eu já fui jovem, e já envelheci; mas nunca vi o justo desamparado, nem a sua semente a pedir pão."}
"PSA_37_26" {:texto "O dia todo ele se compadece, e empresta; e sua semente é abençoada."}
"PSA_37_27" {:texto "Afasta-te do mal, e faze o bem; e faça sua habitação eterna."}
"PSA_37_28" {:texto "Porque o SENHOR ama o juízo, e não desampara a seus santos: eles estão guardados para sempre; mas a semente dos perversos será removida."}
"PSA_37_29" {:texto "Os justos herdarão a terra, e para sempre nela habitarão."}
"PSA_37_30" {:texto "A boca do justo fala de sabedoria, e sua língua fala do [bom] juízo."}
"PSA_37_31" {:texto "A Lei de seu Deus [está] em seu coração; seus passos não serão abalados."}
"PSA_37_32" {:texto "O perverso espia ao justo, e procura matá-lo."}
"PSA_37_33" {:texto "[Mas] o SENHOR não o deixa em suas mãos; nem também o condenará, quando for julgado."}
"PSA_37_34" {:texto "Espera no SENHOR, guarda o seu caminho, e ele te exaltará, para herdares a terra; tu verás que os perversos serão removidos."}
"PSA_37_35" {:texto "Eu vi ao perverso violento crescer como a árvore verde, natural da terra."}
"PSA_37_36" {:texto "Porém ele já foi embora, e eis que ele não [existe mais] ; eu o procurei, e não foi achado."}
"PSA_37_37" {:texto "Olha ao sincero, e vê o correto; porque o fim de [tal] homem é a paz."}
"PSA_37_38" {:texto "Mas os transgressores serão juntamente destruídos; o fim dos perversos será eliminado."}
"PSA_37_39" {:texto "Porém a salvação dos justos [vem] do SENHOR, [que é] a força deles no tempo de angústia."}
"PSA_37_40" {:texto "E o SENHOR os socorrerá, e os livrará; ele os livrará dos perversos, e os salvará, porque nele confiam."}
"PSA_38_1" {:texto "Salmo de Davi, para lembrança:SENHOR, não me repreendas em tua ira, e não me castigues em teu furor."}
"PSA_38_2" {:texto "Porque tuas flechas me atingiram, e tua mão pesou sobre mim."}
"PSA_38_3" {:texto "Na minha carne nada [há que esteja] saudável, por causa de tua ira; não há paz em meus ossos por causa do meu pecado."}
"PSA_38_4" {:texto "Porque minhas maldades ultrapassam minha cabeça; elas [são] como carga pesada demais para mim."}
"PSA_38_5" {:texto "Minhas feridas fedem, e estão apodrecidas, por eu ter sido tão tolo."}
"PSA_38_6" {:texto "Eu estou perturbado e abatido; ando o dia todo em sofrimento."}
"PSA_38_7" {:texto "Porque meus lombos ardem muito, e nada há que esteja saudável em minha carne."}
"PSA_38_8" {:texto "Estou enfraquecido e despedaçado; eu gemo pelo sofrimento do meu coração."}
"PSA_38_9" {:texto "SENHOR, todo o meu sofrimento está diante de ti, e meu gemido não te é oculto."}
"PSA_38_10" {:texto "Meu coração dá palpitações, e minha força me deixou; e a luz dos meus olhos já não [está] comigo."}
"PSA_38_11" {:texto "Meus amigos e companheiros observam de longe minha calamidade; e os meus vizinhos ficam afastados."}
"PSA_38_12" {:texto "Os que procuram [matar] a minha alma [me] armam laços; e os que procuram o meu mal falam insultos e todo o dia planejam maldades."}
"PSA_38_13" {:texto "Mas eu [estou] como o surdo, não ouço; e como o mudo, [que] não abre sua boca."}
"PSA_38_14" {:texto "E eu estou como um homem que não ouve, e cuja boca não [pode responder] com repreensões."}
"PSA_38_15" {:texto "Por isso, SENHOR, eu espero em ti; Senhor, meu Deus, tu me ouvirás."}
"PSA_38_16" {:texto "Porque eu dizia: Não se alegrem de mim!Quando meu pé vacilou, eles se engrandeceram contra mim."}
"PSA_38_17" {:texto "Porque eu estou prestes a ficar como manco, e minha dor está continuamente perante mim."}
"PSA_38_18" {:texto "Por isso eu [te] conto minha maldade; estou aflito por causa do meu pecado."}
"PSA_38_19" {:texto "Porém meus inimigos [estão] vivos, [e] se fortalecem; e os que me odeiam por maldade se multiplicam;"}
"PSA_38_20" {:texto "Assim como os que retribuem o bem com o mal, eles se opõem a mim, porque eu sigo o bem."}
"PSA_38_21" {:texto "Não me desampares, SENHOR, meu Deus, não fiques longe de mim."}
"PSA_38_22" {:texto "Apressa-te ao meu socorro, SENHOR, salvação minha."}
"PSA_39_1" {:texto "Salmo de Davi, para o regente, conforme “Jedutum”:Eu dizia: Vigiarei os meus caminhos, para eu não pecar com minha língua; vigiarei minha boca com freio, enquanto o perverso ainda estiver em frente a mim."}
"PSA_39_2" {:texto "Eu fiquei calado, nada falei de bom; e minha dor se agravou."}
"PSA_39_3" {:texto "Meu coração se esquentou dentro de mim, fogo se acendeu em minha meditação; [então] eu disse com minha língua:"}
"PSA_39_4" {:texto "Conta-me, SENHOR, o meu fim, e a duração dos meus dias, para que eu saiba como eu sou frágil."}
"PSA_39_5" {:texto "Eis que a palmos tu ordenaste os meus dias, e o tempo de minha vida [é] como nada diante de ti; pois todo homem que existe [é] um nada. (Selá)"}
"PSA_39_6" {:texto "Certamente o homem anda pela aparência, certamente se inquietam em vão; ajuntam [bens] , e não sabem que [os] levará."}
"PSA_39_7" {:texto "E agora, SENHOR, o que eu espero? Minha esperança [está] em ti."}
"PSA_39_8" {:texto "Livra-me de todas as minhas transgressões; não me ponhas como humilhado pelo tolo."}
"PSA_39_9" {:texto "Eu estou calado, não abrirei a minha boca, porque tu fizeste [assim] ."}
"PSA_39_10" {:texto "Tira teu tormento de sobre mim; estou consumido pelo golpe de tua mão."}
"PSA_39_11" {:texto "Ao castigares alguém com repreensões pela maldade, logo tu desfaz o que lhe agrada como traça; certamente todo homem é um nada. (Selá)"}
"PSA_39_12" {:texto "Ouve a minha oração, SENHOR; e dá ouvidos ao meu clamor; não te cales de minhas lágrimas, porque eu sou [como] um peregrino para contigo; estrangeiro, como todos os meus pais."}
"PSA_39_13" {:texto "Não prestes atenção em mim [em tua ira] , antes que eu vá, e pereça."}
"PSA_40_1" {:texto "Salmo de Davi, para o regente:Esperei com esperança no SENHOR, e ele se inclinou a mim, e ouviu o meu clamor."}
"PSA_40_2" {:texto "Ele me tirou de uma cova de tormento, de um lamaceiro de barro; e pôs os meus pés sobre uma rocha; ele firmou meus passos."}
"PSA_40_3" {:texto "E pôs em minha boca uma canção nova, um louvor para nosso Deus: muitos [o] verão, e temerão, e confiarão no SENHOR."}
"PSA_40_4" {:texto "Bem-aventurado [é] o homem que põe no SENHOR sua confiança; e não dá atenção aos arrogantes e aos que caminham em direção à mentira."}
"PSA_40_5" {:texto "Tu, SENHOR meu Deus, multiplicaste para conosco tuas maravilhas e teus planos; eles não podem ser contados em ordem diante de ti; se eu [tentasse] contá-los e falá-los, eles são muito mais do que incontáveis."}
"PSA_40_6" {:texto "Tu não te agradaste de sacrifício e oferta; [porém] tu me furaste as orelhas; tu não pediste nem holocausto nem oferta de expiação do pecado."}
"PSA_40_7" {:texto "Então eu disse: Eis que venho; no rolo do livro está escrito sobre mim."}
"PSA_40_8" {:texto "Meu Deus, eu desejo fazer a tua vontade; e tua Lei está no meio dos meus sentimentos."}
"PSA_40_9" {:texto "Eu anuncio a justiça na grande congregação; eis que não retenho meus lábios; tu, SENHOR sabes [disso] ."}
"PSA_40_10" {:texto "Eu não escondo tua justiça no meio de meu coração; eu declaro tua fidelidade e tua salvação; não escondo tua bondade e tua verdade na grande congregação."}
"PSA_40_11" {:texto "Tu, SENHOR, não detenhas para comigo tuas misericórdias; tua bondade e tua fidelidade me guardem continuamente."}
"PSA_40_12" {:texto "Porque inúmeros males me cercaram; minhas maldades me prenderam, e eu não pude as ver; elas são muito mais do que os cabelos de minha cabeça, e meu coração me desamparou."}
"PSA_40_13" {:texto "Seja agradável para ti, SENHOR, tu me livrares; SENHOR, apressa-te ao meu socorro."}
"PSA_40_14" {:texto "Envergonhem-se, e sejam juntamente humilhados os que buscam a minha alma para a destruírem; tornem-se para trás e sejam envergonhados os que querem o meu mal."}
"PSA_40_15" {:texto "Sejam eles assolados como pagamento de sua humilhação, os que dizem de mim: “Ha-ha!”"}
"PSA_40_16" {:texto "Fiquem contentes e se alegrem-se em ti todos aqueles que te buscam; digam continuamente os que amam tua salvação: Engrandecido seja o SENHOR!"}
"PSA_40_17" {:texto "E eu [estou] miserável e necessitado; [mas] o SENHOR cuida de mim; tu [és] meu socorro e meu libertador; Deus meu, não demores."}
"PSA_41_1" {:texto "Salmo de Davi, para o regente:Bem-aventurado aquele que dá atenção ao miserável; o SENHOR o livrará no dia do mal."}
"PSA_41_2" {:texto "O SENHOR o guardará, e o manterá vivo; ele será bem-aventurado na terra; e tu não o entregarás à vontade de seus inimigos."}
"PSA_41_3" {:texto "O SENHOR o sustentará no leito de enfermidade; na doença dele tu mudas toda a sua cama."}
"PSA_41_4" {:texto "Eu disse: SENHOR, tem piedade de mim, sara a minha alma, porque eu pequei contra ti."}
"PSA_41_5" {:texto "Meus inimigos falam mal de mim, [dizendo] : Quando ele morrerá? [Quando] o nome dele perecerá?"}
"PSA_41_6" {:texto "E se [algum deles] vem me ver, fala coisas sem valor, [e] seu coração junta maldade; ele sai, [e] fala disso."}
"PSA_41_7" {:texto "Todos os que me odeiam murmuram juntamente de mim; contra mim eles planejam o mal para mim, [dizendo] :"}
"PSA_41_8" {:texto "Uma doença maligna está posta sobre ele; e aquele que está deitado não se levantará mais."}
"PSA_41_9" {:texto "Até o homem [que era] meu amigo íntimo, em quem eu confiava, que comia do meu pão; grandemente levantou contra mim seu calcanhar."}
"PSA_41_10" {:texto "Porém tu, SENHOR, tem piedade de mim, e levanta-me; e eu lhes darei o pagamento [que merecem] ."}
"PSA_41_11" {:texto "Por isto eu sei que tu te agradas de mim: porque meu inimigo não se declara vencedor sobre mim;"}
"PSA_41_12" {:texto "E quanto a mim, tu me sustentas em minha sinceridade; e tu me puseste diante de ti para sempre."}
"PSA_41_13" {:texto "Bendito [seja] o SENHOR, Deus de Israel, para todo o sempre! Amém e Amém!"}
"PSA_42_1" {:texto "Salmo de instrução para o regente; dos filhos de Coré:Assim como a corça geme de desejo pelas correntes de águas, assim também minha alma geme de desejo por ti, Deus."}
"PSA_42_2" {:texto "Minha alma tem sede de Deus, do Deus vivente: Quando entrarei, e me apresentarei diante de Deus?"}
"PSA_42_3" {:texto "Minhas lágrimas têm sido [meu] alimento dia e noite, porque o dia todo me dizem: Onde [está] o teu Deus?"}
"PSA_42_4" {:texto "Disto eu me lembro, e derramo minha alma em mim [com choros] , porque eu ia entre a multidão, [e] com eles entrava na casa de Deus, com voz de alegria e louvor, na festa da multidão."}
"PSA_42_5" {:texto "Minha alma, por que tu estás abatida, e te inquietas em mim? Espera em Deus; pois eu o louvarei pelas suas salvações."}
"PSA_42_6" {:texto "Deus meu, minha alma está abatida dentro de mim; por isso eu me lembro de ti desde a terra do Jordão, e dos hermonitas, desde o monte Mizar."}
"PSA_42_7" {:texto "Um abismo chama [outro] abismo, ao ruído de suas cascatas; todos as tuas ondas e vagas têm passado sobre mim."}
"PSA_42_8" {:texto "[Mas] de dia o SENHOR mandará sua misericórdia, e de noite a canção dele estará comigo; uma oração ao Deus de minha vida."}
"PSA_42_9" {:texto "Direi a Deus, minha rocha: Por que tu te esqueces de mim? Por que eu ando em sofrimento pela opressão do inimigo?"}
"PSA_42_10" {:texto "Meus adversários me afrontam com uma ferida mortal em meus ossos, ao me dizerem todo dia: Onde [está] o teu Deus?"}
"PSA_42_11" {:texto "Por que estás abatida, minha alma? E por que te inquietas em mim? Espera em Deus; porque eu ainda o louvarei; ele é a minha salvação e o meu Deus."}
"PSA_43_1" {:texto "Faze-me justiça, ó Deus, e defende minha causa contra a nação impiedosa; livra-me do homem enganador e perverso;"}
"PSA_43_2" {:texto "Pois tu és o Deus de minha força. Por que tu me rejeitas? Por que ando em sofrimento pela opressão do inimigo?"}
"PSA_43_3" {:texto "Envia tua luz e tua verdade, para que elas me guiem, para que me levem ao monte de tua santidade e a tuas habitações;"}
"PSA_43_4" {:texto "E eu entre ao altar de Deus, ao Deus da minha maior alegria, e eu te louve com harpa, ó Deus, meu Deus."}
"PSA_43_5" {:texto "Por que estás abatida, minha alma? E por que te inquietas em mim? Espera em Deus, porque eu ainda o louvarei; ele é a minha salvação e o meu Deus."}
"PSA_44_1" {:texto "Instrução para o regente; dos filhos de Coré:Ó Deus, com nossos ouvidos ouvimos, nossos pais nos contaram a obra que tu fizeste nos seus dias, nos dias antigos."}
"PSA_44_2" {:texto "Para plantá-los, expulsaste as nações com a tua própria mão; para fazê-los crescer, afligiste os povos."}
"PSA_44_3" {:texto "Porque não conquistaram a terra pelas espadas deles, nem o braço deles os salvou; mas sim tua mão direita e o teu braço, e a luz de teu rosto; porque tu os favoreceste."}
"PSA_44_4" {:texto "Deus, tu és meu Rei; ordena salvações a Jacó."}
"PSA_44_5" {:texto "Por ti venceremos nossos adversários; por teu nome passaremos por cima dos que se levantam contra nós."}
"PSA_44_6" {:texto "Porque minha confiança não está em meu arco; nem minha espada me salvará."}
"PSA_44_7" {:texto "Pois tu nos salvaste de nossos adversários, e envergonhaste aos que nos odeiam."}
"PSA_44_8" {:texto "Nós exaltamos a Deus o dia todo; e louvaremos o teu nome para sempre. (Selá)"}
"PSA_44_9" {:texto "Mas [agora] tu tens nos rejeitado e envergonhado; e tu não tens saído junto com nossos exércitos."}
"PSA_44_10" {:texto "Tu nos fazes fugir do adversário, e aqueles que nos odeiam saqueiam [de nós] para si."}
"PSA_44_11" {:texto "Tu nos entregas como ovelhas para serem comidas, e nos espalhas entre as nações."}
"PSA_44_12" {:texto "Tu vendes a teu povo ao preço de nada, e não aumentas o seu valor."}
"PSA_44_13" {:texto "Tu nos pões como humilhação por nossos vizinhos; como escárnio e zombaria pelos que estão ao redor de nós."}
"PSA_44_14" {:texto "Tu nos pões como provérbio de escárnio entre as nações; como balançar de cabeça entre os povos;"}
"PSA_44_15" {:texto "Minha humilhação está o dia todo diante de mim; e a vergonha cobre o meu rosto,"}
"PSA_44_16" {:texto "Pela voz do adversário e do que insulta; por causa do inimigo e do vingador."}
"PSA_44_17" {:texto "Tudo isto veio sobre nós; porém não nos esquecemos de ti, nem traímos o teu pacto."}
"PSA_44_18" {:texto "Nosso coração não se voltou para trás, nem nossos passos de desviaram de teu caminho."}
"PSA_44_19" {:texto "Tu tens nos afligido num lugar de chacais, e nos cobriste com sobra de morte."}
"PSA_44_20" {:texto "Se tivéssemos esquecido do nome do nosso Deus, e estendido nossas mãos a um outro deus,"}
"PSA_44_21" {:texto "por acaso Deus não o descobriria? Pois ele conhece os segredos do coração."}
"PSA_44_22" {:texto "Mas por causa de ti somos mortos o dia todo; somos considerados como ovelhas para o matadouro."}
"PSA_44_23" {:texto "Desperta; por que estás dormindo, Senhor? Acorda, não [nos] rejeites para sempre."}
"PSA_44_24" {:texto "Por que escondes tua face, e te esqueces de nossa humilhação e de nossa opressão?"}
"PSA_44_25" {:texto "Pois nossa alma está abatida ao pó; nosso ventre está junto à terra."}
"PSA_44_26" {:texto "Levanta-te para nosso socorro; e resgata-nos por tua bondade."}
"PSA_45_1" {:texto "Instrução e canção de amor, para o regente; dos filhos de Coré, conforme “os lírios”:Meu coração derrama palavras boas; digo meus versos sobre o Rei; minha língua é pena de um habilidoso escriba."}
"PSA_45_2" {:texto "Tu és o mais belo dos filhos dos homens; graça foi derramada em teus lábios, por isso Deus te bendisse para sempre."}
"PSA_45_3" {:texto "Põe tua espada ao redor de tua coxa, ó valente; [com] tua glória e tua honra."}
"PSA_45_4" {:texto "E [em] tua glória prosperamente cavalga, sobre a palavra da verdade e da justa mansidão; e tua mão direita ensinará coisas temíveis."}
"PSA_45_5" {:texto "Tuas flechas [são] afiadas no coração dos inimigos do Rei; povos cairão debaixo de ti."}
"PSA_45_6" {:texto "Deus, teu trono é eterno e dura para sempre; o cetro de teu reino [é] cetro de equidade."}
"PSA_45_7" {:texto "Tu amas a justiça e odeias a maldade; por isso Deus, o teu Deus te ungiu com azeite de alegria, mais que a teus companheiros."}
"PSA_45_8" {:texto "Todos as tuas roupas [cheiram] a mirra, aloés e cássia; alegram-te desde os palácios de marfim."}
"PSA_45_9" {:texto "Filhas de reis estão entre tuas damas de honra; e a rainha está à tua direita, [ornada] com o valioso ouro de Ofir."}
"PSA_45_10" {:texto "Ouve, filha, e olha, e inclina os teus ouvidos; e esquece-te de teu povo, e da casa de teu pai."}
"PSA_45_11" {:texto "Então o rei desejará tua beleza; inclina-te a ele, pois ele é teu Senhor."}
"PSA_45_12" {:texto "E a filha de Tiro, os ricos dentre o povo, suplicarão teu favor com presentes."}
"PSA_45_13" {:texto "Gloriosa é a filha do Rei dentro [do palácio] ; de fios de ouro é a sua roupa."}
"PSA_45_14" {:texto "Com roupas bordadas a levarão ao Rei; as virgens atrás dela, suas companheiras, serão trazidas a ti."}
"PSA_45_15" {:texto "Serão trazidas com alegria e grande satisfação; entrarão no palácio do Rei."}
"PSA_45_16" {:texto "Em vez de teus pais, serão teus filhos; tu os porás por príncipes sobre toda a terra."}
"PSA_45_17" {:texto "Farei memória de teu nome em toda geração após geração; por isso os povos te louvarão para todo o sempre."}
"PSA_46_1" {:texto "Cântico sobre “Alamote”; para o regente, dos filhos de Coré:Deus [é] nosso refúgio e força; socorro oportuno nas angústias."}
"PSA_46_2" {:texto "Por isso não temeremos, ainda que a terra se mova, e ainda que as montanhas passem ao interior dos mares;"}
"PSA_46_3" {:texto "[Ainda que] suas águas rujam [e] se perturbem, [e] as montanhas tremam por sua braveza. (Selá)"}
"PSA_46_4" {:texto "[Há] um rio cujos ribeiros alegram a cidade de Deus, o santuário das habitações do Altíssimo."}
"PSA_46_5" {:texto "Deus [está] no meio dela; ela não será abalada; Deus a ajudará ao romper da manhã."}
"PSA_46_6" {:texto "As nações gritarão, os reinos se abalarão; [quando] ele levantou a sua voz, a terra se dissolveu."}
"PSA_46_7" {:texto "O SENHOR dos exércitos [está] conosco; o Deus de Jacó [é] nosso alto refúgio. (Selá)"}
"PSA_46_8" {:texto "Vinde, observai os feitos do SENHOR, que faz assolações na terra;"}
"PSA_46_9" {:texto "Que termina as guerras até o fim da terra; ele quebra o arco e corta a lança; ele queima os carros com fogo."}
"PSA_46_10" {:texto "Ficai quietos, e sabei que eu sou Deus; eu serei exaltado entre as nações; serei exaltado sobre a terra."}
"PSA_46_11" {:texto "O SENHOR dos exércitos [está] conosco; o Deus de Jacó [é] nosso alto refúgio. (Selá)"}
"PSA_47_1" {:texto "Salmo para o regente, dos filhos de Coré:Vós todos os povos, batei palmas; clamai a Deus com voz de alegria."}
"PSA_47_2" {:texto "Porque o SENHOR Altíssimo [é] temível, o grande Rei sobre toda a terra."}
"PSA_47_3" {:texto "Ele subjugará aos povos debaixo de nós, e as nações debaixo de nossos pés."}
"PSA_47_4" {:texto "Ele escolhe para nós nossa herança, a glória de Jacó, a quem ele amou. (Selá)"}
"PSA_47_5" {:texto "Deus sobe com gritos de alegria; o SENHOR, com voz de trombeta."}
"PSA_47_6" {:texto "Cantai louvores a Deus, cantai; cantai louvores ao nosso Rei, cantai."}
"PSA_47_7" {:texto "Porque Deus é o Rei de toda a terra; cantai louvores com entendimento."}
"PSA_47_8" {:texto "Deus reina sobre as nações; Deus se senta sobre o trono de sua santidade."}
"PSA_47_9" {:texto "Os chefes dos povos se juntaram ao povo do Deus de Abraão, porque os escudos da terra pertencem a Deus, [e] ele é muito exaltado."}
"PSA_48_1" {:texto "Cântico e salmo, dos filhos de Coré:O SENHOR [é] grande e muito louvável, na cidade de nosso Deus, [no] monte de sua santidade."}
"PSA_48_2" {:texto "Belo de se ver e alegria de toda a terra [é] o monte de Sião, nas terras do norte; a cidade do grande Rei."}
"PSA_48_3" {:texto "Deus [está] em seus palácios, [e] é conhecido como alto refúgio."}
"PSA_48_4" {:texto "Porque eis que os reis se reuniram; eles juntamente passaram"}
"PSA_48_5" {:texto "Eles, [quando] a viram, ficaram maravilhados; assombraram-se, fugiram apressadamente."}
"PSA_48_6" {:texto "Ali o temor os tomou, [e sentiram] dores como as de parto."}
"PSA_48_7" {:texto "Com o vento do oriente tu quebras os navios de Társis."}
"PSA_48_8" {:texto "Assim como nós ouvimos, também vimos na cidade do SENHOR dos exércitos, na cidade do nosso Deus; Deus a firmará para sempre. (Selá)"}
"PSA_48_9" {:texto "Deus, nós reconhecemos tua bondade no meio de teu templo."}
"PSA_48_10" {:texto "Conforme o teu nome, ó Deus, assim é o louvor a ti, até os confins da terra; tua mão direita está cheia de justiça."}
"PSA_48_11" {:texto "Alegre-se o monte de Sião, fiquem contentes as filhas de Judá, por causa de teus juízos."}
"PSA_48_12" {:texto "Andai ao redor de Sião, e a circundai; contai suas torres."}
"PSA_48_13" {:texto "Ponde vosso coração em seus muros de defesa, prestai atenção em seus palácios, para que conteis deles à geração seguinte."}
"PSA_48_14" {:texto "Porque este Deus [é] nosso Deus para todo o sempre; ele nos acompanhará até a morte."}
"PSA_49_1" {:texto "Salmo para o regente, dos filhos de Coré:Ouvi isto, vós todos os povos; dai ouvidos, todos os moradores do mundo;"}
"PSA_49_2" {:texto "vós, povo, filhos dos homens, tanto os ricos como os pobres."}
"PSA_49_3" {:texto "Minha boca falará da sabedoria; e o pensamento do meu coração [estará cheio de] entendimento."}
"PSA_49_4" {:texto "Inclinarei meus ouvidos a uma parábola; ao [som] da harpa declararei o meu enigma."}
"PSA_49_5" {:texto "Por que temeria eu nos dias do mal, [quando] a maldade dos meus adversários me cercar?"}
"PSA_49_6" {:texto "Eles confiam em seus bens, e se orgulham da abundância de suas riquezas."}
"PSA_49_7" {:texto "Mas ninguém pode livrar o seu irmão, nem pagar a Deus o seu resgate,"}
"PSA_49_8" {:texto "porque a redenção da sua alma é caríssima, e sempre será insuficiente"}
"PSA_49_9" {:texto "para viver eternamente, e jamais ver a cova."}
"PSA_49_10" {:texto "Pois se vê que os sábios morrem, que o tolo e o bruto igualmente perecem; e deixam suas riquezas a outros."}
"PSA_49_11" {:texto "Seu pensamento interior é que suas casas serão perpétuas, que suas moradas durarão de geração em geração;dão às terras os seus próprios nomes."}
"PSA_49_12" {:texto "Mas o ser humano, ainda que em honra, não dura para sempre; semelhante é aos animais, que perecem."}
"PSA_49_13" {:texto "Este é o caminho dos tolos e dos seus seguidores, que se agradam de suas palavras. (Selá)"}
"PSA_49_14" {:texto "São como ovelhas levados ao Xeol; a morte se alimentará deles. Os corretos os dominarão pela manhã, e sua beleza será consumida no Xeol, longe de sua morada."}
"PSA_49_15" {:texto "Mas Deus resgatará a minha alma da violência do mundo dos mortos, pois ele me tomará [consigo] . (Selá)"}
"PSA_49_16" {:texto "Não temas quando um homem enriquece, quando a glória de sua casa se engrandece."}
"PSA_49_17" {:texto "Pois ele, quando morrer, nada levará; nem sua glória o seguirá abaixo."}
"PSA_49_18" {:texto "Ainda que, em vida, tenha pronunciado a si mesmo a bênção “Louvam-te ao fazeres o bem a ti”,"}
"PSA_49_19" {:texto "ele, porém, se juntará à geração de seus pais; nunca mais verão a luz."}
"PSA_49_20" {:texto "O homem em posição de honra que não tem entendimento é semelhante aos animais, que perecem."}
"PSA_50_1" {:texto "Salmo de Asafe:Deus, o SENHOR Deus fala e chama a terra, desde onde o sol nasce até onde ele se põe."}
"PSA_50_2" {:texto "Desde Sião, a perfeição da beleza, Deus mostra seu imenso brilho."}
"PSA_50_3" {:texto "Nosso Deus virá, e não ficará calado; fogo queimará adiante dele, e ao redor dele haverá grande tormenta."}
"PSA_50_4" {:texto "Ele chamará aos céus do alto, e à terra, para julgar a seu povo."}
"PSA_50_5" {:texto "Ajuntai-me meus santos, que confirmam meu pacto por meio de sacrifício."}
"PSA_50_6" {:texto "E os céus anunciarão sua justiça, pois o próprio Deus é o juiz. (Selá)"}
"PSA_50_7" {:texto "Ouve, povo meu, e eu falarei; eu darei testemunho contra ti, Israel; eu sou Deus, o teu Deus."}
"PSA_50_8" {:texto "Eu não te repreenderei por causa de teus sacrifícios, porque teus holocaustos estão continuamente perante mim."}
"PSA_50_9" {:texto "Não tomarei bezerro de tua casa, [nem] bodes de teus currais;"}
"PSA_50_10" {:texto "Porque todo animal das matas é meu, [e também] os milhares de animais selvagens das montanhas."}
"PSA_50_11" {:texto "Conheço todas as aves das montanhas, e as feras do campo [estão] comigo."}
"PSA_50_12" {:texto "Se eu tivesse fome, não te diria, porque meu é o mundo, e tudo o que nele há."}
"PSA_50_13" {:texto "Comeria eu carne de touros, ou beberia sangue de bodes?"}
"PSA_50_14" {:texto "Oferece a Deus sacrifício de louvor, e paga ao Altíssimo os teus votos."}
"PSA_50_15" {:texto "E clama a mim no dia da angústia; e eu te farei livre, e tu me glorificarás."}
"PSA_50_16" {:texto "Mas Deus diz ao perverso: Para que tu recitas meus estatutos, e pões meu pacto em tua boca?"}
"PSA_50_17" {:texto "Pois tu odeias a repreensão, e lança minhas palavras para detrás de ti."}
"PSA_50_18" {:texto "Se vês ao ladrão, tu consentes com ele; e tens tua parte com os adúlteros."}
"PSA_50_19" {:texto "Com tua boca pronuncias o mal, e tua língua gera falsidades."}
"PSA_50_20" {:texto "Tu te sentas [e] falas contra teu irmão; contra o filho de tua mãe tu dizes ofensas."}
"PSA_50_21" {:texto "Tu fazes estas coisas, e eu fico calado; pensavas que eu seria como tu? Eu te condenarei, e mostrarei [teus males] diante de teus olhos."}
"PSA_50_22" {:texto "Entendei, pois, isto, vós que vos esqueceis de Deus; para que eu não [vos] faça em pedaços, e não haja quem [vos] livre."}
"PSA_50_23" {:texto "Quem oferece sacrifício de louvor me glorificará, e ao que cuida de seu caminho, eu lhe mostrarei a salvação de Deus."}
"PSA_51_1" {:texto "Salmo de Davi, para o regente, quando o profeta Natã veio até ele, depois dele ter praticado adultério com Bate-Seba:Tem misericórdia de mim, ó Deus, conforme a tua bondade; desfaz minhas transgressões conforme a abundância de tuas misericórdias."}
"PSA_51_2" {:texto "Lava-me bem de minha perversidade, e purifica-me de meu pecado."}
"PSA_51_3" {:texto "Porque eu reconheço minhas transgressões, e meu pecado está continuamente diante de mim."}
"PSA_51_4" {:texto "Contra ti, somente contra ti pequei, e fiz o mal segundo teus olhos; para que estejas justo no que dizeres, e puro no que julgares."}
"PSA_51_5" {:texto "Eis que em perversidade fui formado, e em pecado minha mãe me concebeu."}
"PSA_51_6" {:texto "Eis que tu te agradas da verdade interior, e no oculto tu me fazes conhecer sabedoria."}
"PSA_51_7" {:texto "Limpa-me do pecado com hissopo, e ficarei limpo; lava-me, e eu serei mais branco que a neve."}
"PSA_51_8" {:texto "Faça-me ouvir alegria e contentamento, [e] meus ossos, que tu quebraste, se alegrarão."}
"PSA_51_9" {:texto "Esconde tua face de meus pecados, e desfaz todas as minhas perversidades."}
"PSA_51_10" {:texto "Cria em mim um coração puro, ó Deus; e renova um espírito firme em meu interior."}
"PSA_51_11" {:texto "Não me rejeites de tua face, e não tires teu Espírito Santo de mim."}
"PSA_51_12" {:texto "Restaura a alegria de tua salvação, e que tu me sustentes com um espírito de boa vontade."}
"PSA_51_13" {:texto "[Então] eu ensinarei aos transgressores os teus caminhos, e os pecadores se converterão a ti."}
"PSA_51_14" {:texto "Livra-me das [transgressões] por derramamento de sangue, ó Deus, Deus de minha salvação; e minha língua louvará alegremente tua justiça."}
"PSA_51_15" {:texto "Abre, Senhor, os meus lábios, e minha boca anunciará louvor a ti."}
"PSA_51_16" {:texto "Porque tu não te agradas de sacrifícios, pois senão eu te daria; tu não te alegras de holocaustos."}
"PSA_51_17" {:texto "Os sacrifícios a Deus são um espírito quebrado [em arrependimento] ; tu não desprezarás um coração quebrado e triste."}
"PSA_51_18" {:texto "Faze bem a Sião conforme tua boa vontade; edifica os muros de Jerusalém."}
"PSA_51_19" {:texto "Então tu te agradarás dos sacrifícios de justiça, dos holocaustos, e das ofertas queimadas; então oferecerão bezerros sobre teu altar."}
"PSA_52_1" {:texto "Instrução de Davi, para o regente, quando Doegue, o edomita, veio, e contou a Saul, dizendo: Davi veio à casa de Aimeleque:Por que tu, homem poderoso, te orgulhas no mal? A bondade de Deus continua o dia todo."}
"PSA_52_2" {:texto "Tua língua planeja maldades; [é] como navalha afiada, que gera falsidades."}
"PSA_52_3" {:texto "Tu amas mais o mal que o bem, [e] a mentira mais do que falar justiça. (Selá)"}
"PSA_52_4" {:texto "Tu amas todas as palavras de destruição, ó língua enganadora."}
"PSA_52_5" {:texto "Porém Deus te derrubará para sempre; ele te tomará, e te arrancará para fora da tenda; e te eliminará de toda a terra dos viventes. (Selá)"}
"PSA_52_6" {:texto "E os justos [o] verão, e temerão; e rirão dele, [dizendo] :"}
"PSA_52_7" {:texto "Eis aqui o homem que não pôs sua força em Deus, mas [preferiu] confiar a abundância de suas riquezas, e fortaleceu em sua maldade."}
"PSA_52_8" {:texto "Mas eu [serei] como a oliveira verde na casa de Deus; confio na bondade de Deus para todo o sempre."}
"PSA_52_9" {:texto "Eu te louvarei para sempre, por causa do que fizeste; e terei esperança em teu nome, porque tu és bom perante teus santos."}
"PSA_53_1" {:texto "Instrução de Davi, para o regente, sobre “Maalate”:O tolo diz em seu coração: Não há Deus.Eles se corrompem, e cometem abominável perversidade, ninguém há que faça o bem."}
"PSA_53_2" {:texto "Deus olhou desde os céus para os filhos dos homens, para ver se havia alguém prudente, que buscasse a Deus."}
"PSA_53_3" {:texto "Todos se desviaram, juntamente se fizeram detestáveis; ninguém há que faça o bem, nem um sequer."}
"PSA_53_4" {:texto "Será que não tem conhecimento os praticantes de maldade, que devoram a meu povo, [como se] comessem pão? Eles não clamam a Deus."}
"PSA_53_5" {:texto "Ali eles terão grande medo, [onde] não havia medo; porque Deus espalhou os ossos daquele que te cercava; tu os humilhaste, porque Deus os rejeitou."}
"PSA_53_6" {:texto "Ah, que de Sião venha a salvação de Israel! Quando Deus restaurar seu povo de seu infortúnio, Jacó jubilará, Israel se alegrará."}
"PSA_54_1" {:texto "Instrução de Davi, para o regente, para instrumentos de cordas, quando os zifeus vieram, e disseram a Saul: “Não está Davi escondido entre nós?”:Deus, salva-me por teu nome; e faze-me justiça por teu poder."}
"PSA_54_2" {:texto "Deus, ouve minha oração; inclina teus ouvidos aos dizeres de minha boca;"}
"PSA_54_3" {:texto "Porque estranhos se levantam contra mim, e [homens] terríveis procuram [matar] a minha alma; não põem a Deus diante dos olhos deles. (Selá)"}
"PSA_54_4" {:texto "Eis que Deus é o que me socorre; o Senhor [está] com aqueles que sustentam a minha alma."}
"PSA_54_5" {:texto "Ele retribuirá com o mal aos que me espiam [contra mim] ; tu os elimina por tua verdade."}
"PSA_54_6" {:texto "De boa vontade eu te oferecerei sacrifícios; louvarei o teu nome, SENHOR, porque é bom."}
"PSA_54_7" {:texto "Porque tu tens me livrado de toda angústia; e meus olhos verão [o fim] de meus inimigos."}
"PSA_55_1" {:texto "Instrução de Davi, para o regente, com instrumento de cordas:Deus, inclina os teus ouvidos à minha oração; e não te escondas de minha súplica."}
"PSA_55_2" {:texto "Presta atenção em mim, e responde-me; clamo por meu sofrimento, e grito,"}
"PSA_55_3" {:texto "Por causa da voz do inimigo, [e] pela opressão do perverso; porque me preparam [suas] maldades, e com furor eles me odeiam."}
"PSA_55_4" {:texto "Meu coração sofre dores em meu interior, e terrores de morte caíram sobre mim."}
"PSA_55_5" {:texto "Temor e tremor vêm sobre mim, e o horror me toma por completo."}
"PSA_55_6" {:texto "Então eu digo: Ah, quem me dera se eu tivesse asas como uma pomba! Eu voaria, e pousaria."}
"PSA_55_7" {:texto "Eis que eu fugiria para longe, e ficaria no deserto. (Selá)"}
"PSA_55_8" {:texto "Eu me apressaria para escapar do vento violento [e] da tempestade."}
"PSA_55_9" {:texto "Devora-os, Senhor, divide a língua deles; porque tenho visto violência e briga na cidade."}
"PSA_55_10" {:texto "Dia e noite cercam sobre seus muros; perversidade e opressão há dentro dela."}
"PSA_55_11" {:texto "Coisas destrutivas [estão] dentro dela; e a falsidade e o engano não sai de suas praças."}
"PSA_55_12" {:texto "Porque não [é] um inimigo o que me insulta, pois [se fosse] eu o suportaria; nem é alguém que me odeia o que se engrandece contra mim, pois [se fosse] eu me esconderia dele."}
"PSA_55_13" {:texto "Mas és tu, homem semelhante a mim; meu guia, e meu conhecido;"}
"PSA_55_14" {:texto "Que juntos agradavelmente dávamos conselhos [um ao outro] ; na casa de Deus andávamos entre a multidão."}
"PSA_55_15" {:texto "Que a morte os tome de surpresa, e desçam ao Xeol vivos; porque há maldades em suas moradas, e no meio deles."}
"PSA_55_16" {:texto "Clamarei a Deus, e o SENHOR me salvará."}
"PSA_55_17" {:texto "À tarde, e pela manhã, e ao meio dia, orarei e clamarei; e ele ouvirá a minha voz."}
"PSA_55_18" {:texto "Ele resgatou em paz a minha alma da batalha [que havia] contra mim; porque muitos vieram para me [prejudicar] ."}
"PSA_55_19" {:texto "Deus ouvirá, e os humilhará, ele que governa desde os princípios dos tempos. (Selá)Porque eles não mudam [de comportamento] , nem temem a Deus."}
"PSA_55_20" {:texto "[Meu antigo amigo] se voltou contra os que tinham paz com ele, e violou seu pacto."}
"PSA_55_21" {:texto "Sua boca é agradável como a manteiga, mas seu coração [deseja] a guerra; suas palavras [parecem] mais suaves que o azeite, mas são espadas prontas para o ataque."}
"PSA_55_22" {:texto "Entrega [tuas preocupações] ao SENHOR, e ele te sustentará; ele não permitirá que o justo fique caído para sempre."}
"PSA_55_23" {:texto "Porém tu, SENHOR, farás com que eles desçam ao poço da perdição; os homens sanguinários e enganadores não viverão a metade de seus dias; e eu confiarei em ti."}
"PSA_56_1" {:texto "Salmo “Mictão” de Davi para o regente, conforme “pombas silenciosas ao longe”, quando os filisteus o prenderam em Gate:Tem misericórdia de mim, ó Deus, porque o homem procura me devorar; todo o dia ele me oprime em lutas."}
"PSA_56_2" {:texto "Os inimigos que me espiam querem [me] devorar todo dia; porque muitos lutam contra mim, ó Altíssimo."}
"PSA_56_3" {:texto "No dia em que eu tiver medo, eu confiarei em ti."}
"PSA_56_4" {:texto "Por causa de Deus eu louvarei sua palavra; confio em Deus, não temerei; o que pode a mera carne fazer contra mim?"}
"PSA_56_5" {:texto "Todos os dias eles distorcem minhas palavras; todos os pensamentos deles sobre mim são para o mal."}
"PSA_56_6" {:texto "Eles se reúnem e se escondem; eles espiam os meus passos, como que esperando a [morte] de minha alma."}
"PSA_56_7" {:texto "Por acaso eles escaparão em [suas] maldades? Derruba com ira aos povos, ó Deus."}
"PSA_56_8" {:texto "Tu contaste as voltas que dei por causa de meu sofrimento; põe minhas lágrimas em teu odre; não estão elas em teu livro?"}
"PSA_56_9" {:texto "No dia em que eu clamar, então meus inimigos se voltarão para trás; isto eu sei, que Deus [está] comigo."}
"PSA_56_10" {:texto "Por causa de Deus eu louvarei [sua] palavra; por causa do SENHOR eu louvarei [sua] palavra."}
"PSA_56_11" {:texto "Em Deus eu confio, não temerei; o que o homem pode me fazer?"}
"PSA_56_12" {:texto "Tuas promessas, SENHOR, estão sobre mim; oferecerei agradecimentos a ti;"}
"PSA_56_13" {:texto "Porque tu resgataste minha alma da morte, e meus pés não [deixaste] tropeçar; para [eu] andar diante de Deus na luz dos viventes."}
"PSA_57_1" {:texto "Salmo “Mictão” para o regente, conforme “Altachete”; de Davi, quando fugia de diante de Saul, na caverna:Tem misericórdia de mim, ó Deus, tem misericórdia de mim; porque minha alma confia em ti, e eu me refugio sob a sombra de tuas asas, até que os [meus] problemas passem de mim."}
"PSA_57_2" {:texto "Clamarei ao Deus Altíssimo; a Deus, que cumprirá [sua obra] em mim."}
"PSA_57_3" {:texto "Ele enviará desde os céus e me livrará, humilhando ao que procura me demorar. (Selá)Deus enviará sua bondade e sua verdade."}
"PSA_57_4" {:texto "Minha alma está no meio dos leões, estou deitado [entre] brasas ardentes, filhos de homens, cujos dentes são lanças e flechas, e a língua deles são espada afiada."}
"PSA_57_5" {:texto "Exalta-te sobre os céus, ó Deus; [esteja] tua glória sobre toda a terra."}
"PSA_57_6" {:texto "Prepararam uma rede de armadilha para os meus passos, minha alma [estava] abatida; cavaram perante mim uma cova, [porém] eles mesmos caíram nela. (Selá)"}
"PSA_57_7" {:texto "Firme está meu coração, ó Deus; meu coração está firme; eu cantarei, e louvarei com músicas."}
"PSA_57_8" {:texto "Desperta-te, ó glória minha! Desperta, lira e harpa; despertarei ao amanhecer."}
"PSA_57_9" {:texto "Eu te louvarei entre os povos, Senhor; cantarei louvores a ti entre as nações."}
"PSA_57_10" {:texto "Pois tua bondade é grande, [alcança] até os céus; e a tua fidelidade até as nuvens mais altas."}
"PSA_57_11" {:texto "Exalta-te sobre os céus, ó Deus; [esteja] tua glória sobre toda a terra."}
"PSA_58_1" {:texto "Salmo “Mictão” de Davi, para o regente, conforme “Altachete”:Congregação, por acaso falais verdadeiramente o que é justo? Vós, Filhos dos homens, julgais corretamente?"}
"PSA_58_2" {:texto "Na verdade vós praticais perversidades em [vosso] coração; sobre a terra pesais a violência de vossas mãos."}
"PSA_58_3" {:texto "Os perversos se desviam desde o ventre da mãe; afastam-se desde o ventre os mentirosos."}
"PSA_58_4" {:texto "O veneno deles [é] semelhante ao veneno de serpente; são como a cobra surda, que tapa seus ouvidos,"}
"PSA_58_5" {:texto "Para não ouvirem a voz dos encantadores, do encantador sábio em encantamentos."}
"PSA_58_6" {:texto "Deus, quebra os dentes deles em suas bocas; arranca os queixos dos filhos dos leões, SENHOR."}
"PSA_58_7" {:texto "Que eles escorram como águas, que vão embora; quando ele armar sua flecha, sejam eles cortados em pedaços."}
"PSA_58_8" {:texto "Como a lesma, que se desmancha, que [assim] saiam embora; como o aborto de mulher, [assim também] nunca vejam o sol."}
"PSA_58_9" {:texto "Antes que vossas panelas sintam os espinhos, tanto vivos, como aquecidos, ele os arrebatará furiosamente."}
"PSA_58_10" {:texto "O justo se alegrará ao ver a vingança; [e] lavará seus pés no sangue do perverso."}
"PSA_58_11" {:texto "Então o homem dirá: Certamente há recompensa para o justo; certamente há Deus, que julga na terra."}
"PSA_59_1" {:texto "Salmo “Mictão” de Davi, para o regente, conforme “Altachete”, quando Saul enviou pessoas para vigiarem sua casa e o matarem:Livra-me de meus inimigos, ó Deus meu; protege-me dos que se levantam contra mim."}
"PSA_59_2" {:texto "Livra-me dos que praticam perversidade, e salva-me dos homens sanguinários;"}
"PSA_59_3" {:texto "Porque eis que eles põem ciladas à minha alma; fortes se juntam contra mim; [ainda que] eu não tenha cometido transgressão nem pecado, ó SENHOR."}
"PSA_59_4" {:texto "Eles correm sem [eu ter] culpa; desperta para me encontrar, e olha."}
"PSA_59_5" {:texto "Tu, SENHOR, Deus dos exércitos, Deus de Israel, desperta para julgar a todas estas nações; não tenhas misericórdia de nenhum dos enganadores que praticam perversidade. (Selá)"}
"PSA_59_6" {:texto "Eles voltam ao anoitecer, latem como cães, e rodeiam a cidade."}
"PSA_59_7" {:texto "Eis que vomitam com as bocas deles, seus lábios [são como] espadas; porque [dizem] : Quem ouve?"}
"PSA_59_8" {:texto "Porém tu, SENHOR, rirás deles; zombarás de todas as nações."}
"PSA_59_9" {:texto "[Por causa] de sua força, eu te aguardarei; porque Deus é o meu refúgio."}
"PSA_59_10" {:texto "O Deus que tem bondade para comigo me antecederá; Deus me fará ver [o fim] dos meus inimigos."}
"PSA_59_11" {:texto "Não os mates, para que meu povo não se esqueça; faze-os fugir de um lado para o outro pelo teu poder, e abate-os; ó Senhor, escudo nosso;"}
"PSA_59_12" {:texto "[Por causa do] pecado da boca deles [e da] palavra de seus lábios; e sejam presos em sua arrogância pelas maldições e pelas mentiras que contam."}
"PSA_59_13" {:texto "Destrói [-os] em [tua] ira; destrói [-os] para que nunca mais existam; para que saibam que Deus governa em Jacó até os limites da terra. (Selá)"}
"PSA_59_14" {:texto "Eles voltam ao anoitecer, latem como cães, e rodeiam a cidade."}
"PSA_59_15" {:texto "Andam de um lado para o outro por comida, e rosnam se não estiverem saciados."}
"PSA_59_16" {:texto "Mas eu cantarei [sobre] tua força; e pela manhã com alegria louvarei tua bondade; porque tu tens sido meu alto refúgio e abrigo no dia da minha angústia."}
"PSA_59_17" {:texto "Cantarei louvores a ti, [que és] minha força; porque Deus é o meu refúgio, ó Deus de bondade para comigo."}
"PSA_60_1" {:texto "Salmo “Mictão” de Davi, de ensinamento, para o regente, conforme “Susanedute”, quando lutou contra os de Arã-Naraim e Arã-Zobá, e Joabe voltou vitorioso, tendo ferido no Vale do Sal a doze mil dos de Edom:Deus, tu nos rejeitaste, e nos quebraste; tu te encheste de ira. [Por favor] , restaura-nos!"}
"PSA_60_2" {:texto "Tu fizeste a terra tremer, [e] a abriste; cura suas rachaduras, porque ela está abalada."}
"PSA_60_3" {:texto "Mostraste ao teu povo coisas duras; nos fizeste beber vinho perturbador."}
"PSA_60_4" {:texto "Deste uma bandeira aos que te temem, para a erguerem por causa da verdade. (Selá)"}
"PSA_60_5" {:texto "Para que os teus amados sejam livrados; salva-nos com tua mão direita, e responde-nos."}
"PSA_60_6" {:texto "Deus falou em seu santuário: Eu me alegrarei; repartirei a Siquém e medirei o vale de Sucote."}
"PSA_60_7" {:texto "Meu [é] Gileade, e meu [é] Manassés; e Efraim [é] a força de minha cabeça; Judá [é] meu legislador."}
"PSA_60_8" {:texto "Moabe [é] minha bacia de lavar; sobre Edom lançarei minha sandália; gritarei de alegria sobre a Filístia."}
"PSA_60_9" {:texto "Quem me levará a uma cidade fortificada? Quem me guiará até Edom?"}
"PSA_60_10" {:texto "Não serás tu, ó Deus, que tinha nos rejeitado? Não saías tu, ó Deus, com nossos exércitos?"}
"PSA_60_11" {:texto "Dá-nos socorro para a angústia; porque a salvação de [origem] humana é inútil."}
"PSA_60_12" {:texto "Com Deus faremos coisas grandiosas; e ele atropelará nossos adversários."}
"PSA_61_1" {:texto "Salmo de Davi, para o regente, com instrumento de cordas:Ouve, ó Deus, o meu clamor; presta atenção à minha oração."}
"PSA_61_2" {:texto "Desde o limite da terra eu clamo a ti, pelo sofrimento do meu coração; leva-me para uma rocha alta para mim."}
"PSA_61_3" {:texto "Pois tu tens sido o meu refúgio [e] torre forte perante o inimigo."}
"PSA_61_4" {:texto "Eu habitarei em tua tenda para sempre; tomarei refúgio [me] escondendo sob tuas asas. (Selá)"}
"PSA_61_5" {:texto "Pois tu, ó Deus, ouviste meus votos; tu tens [me] dado a herança dos que temem o teu nome."}
"PSA_61_6" {:texto "Acrescentarás dias e mais dias ao Rei; seus anos serão como de geração em geração."}
"PSA_61_7" {:texto "Ele habitará para sempre diante de Deus; prepara que [tua] bondade e fidelidade o guardem."}
"PSA_61_8" {:texto "Assim cantarei ao teu nome para sempre, para eu pagar meus votos dia após dia."}
"PSA_62_1" {:texto "Salmo de Davi para o regente, conforme “Jedutum”:Certamente minha alma se aquieta por causa de Deus; dele [vem] minha salvação."}
"PSA_62_2" {:texto "Certamente ele [é] minha rocha, minha salvação e meu refúgio; não serei muito abalado."}
"PSA_62_3" {:texto "Até quando atacareis um homem? Todos vós sereis mortos; [sereis] como um parede tombada e uma cerca derrubada."}
"PSA_62_4" {:texto "Eles somente tomam conselhos sobre como lançá-lo abaixo de sua alta posição; agradam-se de mentiras; falam bem com suas bocas, mas amaldiçoam em seus interiores. (Selá)"}
"PSA_62_5" {:texto "Tu, porém, ó minha alma, aquieta-te em Deus; porque ele [é] minha esperança."}
"PSA_62_6" {:texto "Certamente ele [é] minha rocha, minha salvação [e] meu refúgio; não me abalarei."}
"PSA_62_7" {:texto "Em Deus [está] minha salvação e minha glória; em Deus [está] minha força e meu refúgio."}
"PSA_62_8" {:texto "Confiai, povo, nele em todo o tempo; derramai vosso coração diante dele; Deus [é] nosso refúgio. (Selá)"}
"PSA_62_9" {:texto "Pois os filhos dos seres humanos são nada; os filhos do homem são mentira; pesados juntos [são mais leves] que o vazio."}
"PSA_62_10" {:texto "Não confieis na opressão, nem no roubo; nem sejais inúteis; quando tiverdes bens, não ponhais [neles vosso] coração."}
"PSA_62_11" {:texto "Deus falou uma vez; eu ouvi duas vezes: que [de] Deus [vem] o poder."}
"PSA_62_12" {:texto "Também é tua, Senhor, a bondade; pois tu pagarás a [cada] homem conforme sua obra."}
"PSA_63_1" {:texto "Salmo de Davi, quando ele estava no deserto de Judá:Deus, tu [és] meu Deus. Eu te busco ao amanhecer; minha alma tem sede de ti, minha carne muito te deseja, em terra seca, cansativa, sem águas."}
"PSA_63_2" {:texto "Para que eu te veja em teu santuário, para ver tua força e tua glória."}
"PSA_63_3" {:texto "Porque tua bondade [é] melhor que a vida; meus lábios te louvarão."}
"PSA_63_4" {:texto "Assim te bendirei em minha vida; por teu nome levantarei minhas mãos."}
"PSA_63_5" {:texto "Minha alma será saciada, como que de gorduras e muita comida; e minha boca te louvará com lábios alegres,"}
"PSA_63_6" {:texto "Quando eu me lembrar de ti em minha cama; nas vigílias da noite meus pensamentos estarão em ti."}
"PSA_63_7" {:texto "Porque tu tens sido meu socorro; e à sombra de tuas asas cantarei de alegria."}
"PSA_63_8" {:texto "Minha alma está apegada a ti; tua mão direita me sustenta."}
"PSA_63_9" {:texto "Porém aqueles que procuram assolar a minha alma irão para as profundezas da terra."}
"PSA_63_10" {:texto "Eles serão derrubados pela força da espada; serão repartidos entre raposas."}
"PSA_63_11" {:texto "Mas o Rei se alegrará em Deus; todo o que por ele jurar se alegrará, porque a boca dos mentirosos será tapada."}
"PSA_64_1" {:texto "Salmo de Davi, para o regente:Ouve, Deus, minha voz, em minha meditação [de súplica] ; guarda minha vida do terror do inimigo."}
"PSA_64_2" {:texto "Esconde-me do grupo dos malignos, e do ajuntamento dos praticantes de maldade,"}
"PSA_64_3" {:texto "Que afiam sua língua como [se fosse] espada; e armaram palavras amargas [como se fossem] flechas."}
"PSA_64_4" {:texto "Para atirarem no inocente às escondidas; disparam apressadamente contra ele, e não têm medo."}
"PSA_64_5" {:texto "Eles são ousados para [fazerem] coisas más, comentam sobre como esconder armadilhas, [e] dizem: Quem as verá?"}
"PSA_64_6" {:texto "Eles buscam por perversidades; procuram tudo o que pode ser procurado, até o interior de [cada] homem, e as profundezas do coração."}
"PSA_64_7" {:texto "Mas Deus os atingirá com flecha de repente; e [logo] serão feridos."}
"PSA_64_8" {:texto "E a língua deles fará com que tropecem em si mesmos; todo aquele que olhar para eles se afastará."}
"PSA_64_9" {:texto "E todos os homens terão medo, e anunciarão a obra de Deus, e observarão cuidadosamente o que ele fez."}
"PSA_64_10" {:texto "O justo se alegará no SENHOR, e confiará nele; e todos os corretos de coração [o] glorificarão."}
"PSA_65_1" {:texto "Salmo e cântico de Davi, para o regente:A ti, Deus, [pertence] a tranquilidade [e] o louvor em Sião; e a ti será pago o voto."}
"PSA_65_2" {:texto "Tu, que ouves as orações; toda carne virá a ti."}
"PSA_65_3" {:texto "Perversidades têm me dominado, [porém] tu tiras a culpa de nossas transgressões."}
"PSA_65_4" {:texto "Bem-aventurado [é] aquele a quem tu escolhes, e [o] fazes aproximar, para que habite em teus cômodos; seremos fartos do bem de tua casa, [na] santidade de teu templo."}
"PSA_65_5" {:texto "Tu nos responderá de forma justa [por meio de] coisas temíveis. O Deus de nossa salvação [é] a confiança de todos os limites da terra, e dos lugares mais distantes do mar."}
"PSA_65_6" {:texto "Ele [é] o que firma os montes com sua força, revestido de poder."}
"PSA_65_7" {:texto "Ele é o que amansa o ruído dos mares, o ruído de suas ondas, e o tumulto dos povos."}
"PSA_65_8" {:texto "[Até] os que habitam nos lugares mais distantes temem teus sinais; tu fazes alegres o nascer e o pôr do sol."}
"PSA_65_9" {:texto "Tu visitas a terra, e a regas; tu a enriqueces; o rio de Deus [está] cheio de águas; tu preparas [a terra] , e lhes dá trigo."}
"PSA_65_10" {:texto "Enche seus regos de [águas] ,fazendo-as descer em suas margens; com muita chuva a amoleces, [e] abençoas o que dela brota."}
"PSA_65_11" {:texto "Coroas o ano com tua bondade; e teus caminhos transbordam fartura."}
"PSA_65_12" {:texto "Eles são derramados [sobre] os pastos do deserto; e os morros se revestem de alegria."}
"PSA_65_13" {:texto "Os campos se revestem de rebanhos, e os vales são cobertos de trigo; e por isso se alegram e cantam."}
"PSA_66_1" {:texto "Cântico e salmo para o regente:Gritai de alegria a Deus toda a terra."}
"PSA_66_2" {:texto "Cantai a glória do nome dele; reconhecei a glória de seu louvor."}
"PSA_66_3" {:texto "Dizei a Deus: Tu [és] temível [em] tuas obras; pela grandeza de tua força os teus inimigos se sujeitarão a ti."}
"PSA_66_4" {:texto "Toda a terra te adorará, e cantará a ti; cantarão ao teu nome. (Selá)"}
"PSA_66_5" {:texto "Vinde, e vede os atos de Deus; a obra dele é temível aos filhos dos homens."}
"PSA_66_6" {:texto "Ele fez o mar ficar seco, passaram o rio a pé; ali nos alegramos nele."}
"PSA_66_7" {:texto "Ele governa com seu poder para sempre; seus olhos vigiam as nações; não se exaltem os rebeldes. (Selá)"}
"PSA_66_8" {:texto "Vós povos, bendizei a nosso Deus, e fazei ouvir a voz do louvor a ele,"}
"PSA_66_9" {:texto "Que conserva nossas almas em vida, e não permite que nossos pés se abalem."}
"PSA_66_10" {:texto "Porque tu, Deus, tem nos provado; tu nos refinas como se refina a prata."}
"PSA_66_11" {:texto "Tu nos levaste a uma rede; prendeste-nos em nossas cinturas."}
"PSA_66_12" {:texto "Fizeste um homem cavalgar sobre nossas cabeças; passamos pelo fogo e pela água, porém tu nos tiraste para um [lugar] confortável."}
"PSA_66_13" {:texto "Entrarei em tua casa com holocaustos; pagarei a ti os meus votos,"}
"PSA_66_14" {:texto "Que meus lábios pronunciaram, e minha boca falou, quando eu estava angustiado."}
"PSA_66_15" {:texto "Eu te oferecerei holocaustos de animais gordos, com incenso de carneiros; prepararei bois com bodes. (Selá)"}
"PSA_66_16" {:texto "Vinde, ouvi, todos vós que temeis a Deus, e eu contarei o que ele fez à minha alma."}
"PSA_66_17" {:texto "Clamei a ele com minha boca, e ele foi exaltado pela minha língua."}
"PSA_66_18" {:texto "Se eu tivesse dado valor para a maldade em meu coração, o Senhor não teria [me] ouvido."}
"PSA_66_19" {:texto "Mas certamente Deus [me] ouviu; ele prestou atenção à voz de minha oração."}
"PSA_66_20" {:texto "Bendito seja Deus, que não ignorou minha oração, nem sua bondade [se desviou] de mim."}
"PSA_67_1" {:texto "Salmo e cântico, para o regente, com instrumento de cordas:Que Deus tenha misericórdia de nós, e nos abençoe; que ele brilhe seu rosto sobre nós. (Selá)"}
"PSA_67_2" {:texto "Para que o teu caminho seja conhecido na terra, [e] todos as nações [conheçam] tua salvação."}
"PSA_67_3" {:texto "Louvem os povos a ti, ó Deus, louvem a ti todos os povos."}
"PSA_67_4" {:texto "Que as nações se alegrem e cantem de alegria, pois tu julgarás aos povos com equidade, e guiarás as nações na terra. (Selá)"}
"PSA_67_5" {:texto "Louvem os povos a ti, ó Deus, louvem a ti todos os povos."}
"PSA_67_6" {:texto "Que a terra dê seu fruto, [e] que Deus, nosso Deus, nos abençoe."}
"PSA_67_7" {:texto "Deus nos abençoará, e todos os limites da terra o temerão."}
"PSA_68_1" {:texto "Salmo e canção de Davi, para o regente:Deus se levantará, [e] seus inimigos serão dispersos, e os que o odeiam fugirão de sua presença."}
"PSA_68_2" {:texto "Assim como a fumaça se espalha, tu os espalharás; assim como a cera que se derrete diante do fogo, [assim também] os perversos perecerão diante de Deus."}
"PSA_68_3" {:texto "Mas os justos se alegrarão, [e] saltarão de prazer perante Deus, e se encherão de alegria."}
"PSA_68_4" {:texto "Cantai a Deus, cantai louvores ao seu nome; exaltai aquele que anda montado sobre as nuvens, pois EU-SOU é o seu nome; e alegrai [-vos] diante dele."}
"PSA_68_5" {:texto "[Ele é] o pai dos órfãos, e juiz que defende as viúvas; Deus na habitação de sua santidade."}
"PSA_68_6" {:texto "Deus que faz os solitários viverem em uma família, e liberta os prisioneiros; mas os rebeldes habitam em terra seca."}
"PSA_68_7" {:texto "Deus, quando tu saías perante teu povo, enquanto caminhavas pelo deserto (Selá),"}
"PSA_68_8" {:texto "A terra se abalava, e os céus se derramavam perante a presença de Deus; neste Sinai, diante da presença de Deus, o Deus de Israel."}
"PSA_68_9" {:texto "Tu fizeste a chuva cair abundantemente, e firmaste tu herança, que estava cansada."}
"PSA_68_10" {:texto "Nela o teu rebanho habitou; por tua bondade, Deus, sustentaste ao miserável."}
"PSA_68_11" {:texto "O Senhor falou; grande é o exército das que anunciam as boas novas."}
"PSA_68_12" {:texto "Reis de exércitos fugiam apressadamente; e aquela que ficava em casa repartia os despojos."}
"PSA_68_13" {:texto "Ainda que estivésseis cercados por ambos os lados, [estais protegidos] como que por asas de pomba, cobertas de prata, e suas penas revestidas de ouro."}
"PSA_68_14" {:texto "Quando o Todo-Poderoso espalhou os reis, houve neve em Salmom."}
"PSA_68_15" {:texto "O monte de Deus [é como] o monte de Basã; [é] um monte bem alto, [como] o monte de Basã."}
"PSA_68_16" {:texto "Por que olhais com inveja, ó montes altos? A este monte Deus desejou para ser sua habitação; e o SENHOR habitará [nele] para sempre."}
"PSA_68_17" {:texto "As carruagens de Deus são várias dezenas de milhares; o Senhor está entre elas, [como] em Sinai, em [seu] santuário."}
"PSA_68_18" {:texto "Tu subiste ao alto, levaste cativos, recebeste bens dos homens, até dos rebeldes, para que [ali] o SENHOR Deus habitasse."}
"PSA_68_19" {:texto "Bendito seja o Senhor; dia após dia ele nos carrega; Deus [é] nossa salvação. (Selá)"}
"PSA_68_20" {:texto "Nosso Deus [é] um Deus de salvação; e com o Senhor DEUS há livramento para a morte;"}
"PSA_68_21" {:texto "Pois Deus ferirá a cabeça de seus inimigos, o topo da cabeça, onde ficam os cabelos, daquele que anda na prática de suas transgressões."}
"PSA_68_22" {:texto "O Senhor disse: Eu [os] farei voltar de Basã; eu [os] farei voltar das profundezas do mar."}
"PSA_68_23" {:texto "Para que metas teu pé no sangue dos teus inimigos; e nele [também] terá uma parte a língua de cada um de teus cães."}
"PSA_68_24" {:texto "Viram teus caminhos, ó Deus; os caminhos de meu Deus, meu Rei, no santuário."}
"PSA_68_25" {:texto "Os cantores vieram adiante, depois os instrumentistas; entre eles as virgens tocadoras de tamborins."}
"PSA_68_26" {:texto "Bendizei a Deus nas congregações; [bendizei] ao SENHOR, desde a fonte de Israel."}
"PSA_68_27" {:texto "Ali [está] o pequeno Benjamim, que domina sobre eles; os chefes de Judá e a congregação deles; os chefes de Zebulom, [e] os chefes de Nafitali."}
"PSA_68_28" {:texto "Teu Deus ordenou tua força; fortalece, ó Deus, o que já operaste por nós."}
"PSA_68_29" {:texto "Ao teu templo, em Jerusalém, os Reis te trarão presentes."}
"PSA_68_30" {:texto "Repreende a fera das canas, a multidão de touros, juntamente com as bezerras dos povos; aos que humilham a si mesmos em [troca] de peças e prata; dissipa aos povos que gostam da guerra."}
"PSA_68_31" {:texto "Embaixadores virão do Egito; Cuxe correrá para [estender] suas mãos a Deus."}
"PSA_68_32" {:texto "Reinos da terra, cantai a Deus; cantai louvores ao Senhor. (Selá)"}
"PSA_68_33" {:texto "Ele anda montado por entre os céus desde os tempos antigos; eis que sua voz fala poderosamente."}
"PSA_68_34" {:texto "Reconhecei o poder de Deus; sobre Israel [está] sua exaltação, e sua força [está] nas altas nuvens."}
"PSA_68_35" {:texto "Deus, tu és temível desde teus santuários; o Deus de Israel é o que dá força e poder ao povo. Bendito seja Deus!"}
"PSA_69_1" {:texto "Salmo de Davi, para o regente, conforme “os lírios”:Salva-me, ó Deus, porque as águas têm entrado [e encoberto] a minha alma."}
"PSA_69_2" {:texto "Afundei-me em um profundo lamaçal, onde não se pode ficar em pé; entrei nas profundezas das águas, e a corrente está me levando."}
"PSA_69_3" {:texto "Já estou cansado de clamar, minha garganta enrouqueceu; meus olhos desfaleceram, enquanto espero pelo meu Deus."}
"PSA_69_4" {:texto "Os que me odeiam sem motivo são mais numerosos que os cabelos de minha cabeça; são poderosos os que procuram me arruinar, os que por falsidades se fazem meus inimigos; tive que pagar de volta aquilo que não furtei."}
"PSA_69_5" {:texto "Tu, Deus, sabes como sou tolo; e meus pecados não estão escondidos perante ti."}
"PSA_69_6" {:texto "Não sejam envergonhados por minha causa aqueles que te esperam, ó Senhor DEUS dos exércitos; não sejam humilhados por minha causa os que te buscam, ó Deus de Israel."}
"PSA_69_7" {:texto "Porque por causa de ti aguentei ser insultado; a humilhação cobriu o meu rosto."}
"PSA_69_8" {:texto "Tornei-me estranho aos meus irmãos; e desconhecido aos filhos de minha mãe;"}
"PSA_69_9" {:texto "Porque o zelo por tua casa me devorou; e os insultos dos que te insultam caíram sobre mim;"}
"PSA_69_10" {:texto "Minha alma chorou e jejuou; porém [mais] insultos vieram sobre mim."}
"PSA_69_11" {:texto "Vesti-me de saco, mas fui ridicularizado por eles num ditado."}
"PSA_69_12" {:texto "Os que se sentam à porta falam [mal] de mim; e os bebedores de álcool cantam [piadas] contra mim."}
"PSA_69_13" {:texto "Mas eu oro a ti, SENHOR, [no] tempo aceitável. Pela grandeza de tua bondade, responde-me, ó Deus, pela fidelidade de tua salvação."}
"PSA_69_14" {:texto "Livra-me do lamaçal, e não me deixes afundar; seja eu resgatado dos que me odeiam, e das profundezas das águas."}
"PSA_69_15" {:texto "Não permitas que as correntes de águas me cubram, e que a profundeza não me devore, nem o poço feche sua boca sobre mim."}
"PSA_69_16" {:texto "Responde-me, SENHOR; pois boa é tua bondade; olha para mim conforme tua piedade."}
"PSA_69_17" {:texto "E não escondas teu rosto de teu servo; porque estou angustiado; ouve-me depressa."}
"PSA_69_18" {:texto "Vem para perto de minha alma, [e] a liberta; resgata-me por causa de meus inimigos."}
"PSA_69_19" {:texto "Tu conheces como me insultam, me envergonham e me humilham; diante de ti estão todos os meus adversários."}
"PSA_69_20" {:texto "Insultos têm quebrado meu coração, e estou fraquíssimo; e esperei compaixão, porém [houve] nenhuma; [também esperei] por pessoas que me consolassem, mas não os achei."}
"PSA_69_21" {:texto "Deram-me fel como alimento; e em minha sede me deram vinagre para beber."}
"PSA_69_22" {:texto "Torne-se a mesa diante deles como que um laço; e aquilo que [lhes] dá segurança [lhes] seja uma armadilha."}
"PSA_69_23" {:texto "Sejam escurecidos os olhos deles, para que não possam ver; e que seus quadris vacilem continuamente."}
"PSA_69_24" {:texto "Derrama tua indignação sobre eles; e que sejam tomados pelo ardor de tua ira."}
"PSA_69_25" {:texto "A habitação deles seja desolada; e que não haja morador nas tendas deles;"}
"PSA_69_26" {:texto "Porque perseguem [aquele] a quem tu feriste, e contam histórias da dor daqueles a quem tu machucaste."}
"PSA_69_27" {:texto "Conta como maldade a maldade deles; e não sejam eles agraciados por tua justiça."}
"PSA_69_28" {:texto "Sejam riscados dos livro da vida; e não estejam eles escritos junto com os justos."}
"PSA_69_29" {:texto "Mas eu [estou] miserável e em dores; ó Deus, que tua salvação me proteja."}
"PSA_69_30" {:texto "Louvarei o nome de Deus com cântico; e o engrandecerei com agradecimentos."}
"PSA_69_31" {:texto "Isto agradará ao SENHOR mais do que [o sacrifício] de um boi [ou] de um bezerro com chifres e unhas."}
"PSA_69_32" {:texto "Os mansos verão, e se alegrarão; vós que buscais a Deus, vosso coração viverá."}
"PSA_69_33" {:texto "Porque o SENHOR ouve aos necessitados, e não despreza os prisioneiros que lhe pertencem."}
"PSA_69_34" {:texto "Louvem a ele os céus, a terra, os mares, e tudo que neles se move;"}
"PSA_69_35" {:texto "Porque Deus salvará a Sião, e construirá as cidades de Judá; e habitarão ali, e a terão como posse."}
"PSA_69_36" {:texto "E a semente de seus servos a herdará; e os que amam o nome dele habitarão nela."}
"PSA_70_1" {:texto "Memorial de Davi, para o regente:Livra-me Deus; apressa-te para me socorrer, SENHOR."}
"PSA_70_2" {:texto "Envergonhem-se, e sejam confundidos os que procuram [matar] a minha alma; voltem-se para trás, e sejam humilhados os que gostam de me fazer o mal."}
"PSA_70_3" {:texto "Virem-se para trás por causa de sua vergonha os que dizem: “Há, há!”"}
"PSA_70_4" {:texto "Alegrem-se e fiquem contentes em ti todos aqueles que te buscam; aqueles que amam tua salvação digam continuamente: Engrandecido seja Deus!"}
"PSA_70_5" {:texto "Eu, porém, estou miserável e necessitado; ó Deus, apressa-te a mim; tu [és] meu socorro e meu libertador; não demores, SENHOR."}
"PSA_71_1" {:texto "Em ti, SENHOR, confio; nunca me deixes ser envergonhado."}
"PSA_71_2" {:texto "Resgata-me e livra-me por tua justiça; inclina a mim teus ouvidos, e salva-me."}
"PSA_71_3" {:texto "Sê tu minha rocha [e minha] habitação, para continuamente eu me abrigar nela; tu tens ordenado que eu seja salvo, porque tu [és] minha rocha forte e minha fortaleza."}
"PSA_71_4" {:texto "Meu Deus, livra-me da dominação do perverso, das mãos do injusto e cruel;"}
"PSA_71_5" {:texto "Pois tu és minha esperança, ó Senhor DEUS; [tu és] minha confiança desde minha juventude."}
"PSA_71_6" {:texto "Tenho me apoiado em ti desde o ventre de minha mãe; das entranhas dela me tiraste; eu louvo continuamente a ti."}
"PSA_71_7" {:texto "Para muitos fui como prodígio, porém tu és meu forte refúgio."}
"PSA_71_8" {:texto "Minha boca seja cheia de louvores a ti por tua glória o dia todo."}
"PSA_71_9" {:texto "Não me rejeites no tempo da velhice; não me desampares quando minha força se acabar;"}
"PSA_71_10" {:texto "Porque meus inimigos falam contra mim, e os que espiam minha alma tomam conselhos juntos uns com os outros;"}
"PSA_71_11" {:texto "Dizendo: Deus o desamparou; persegui, e o tomai, pois já não há quem o livre."}
"PSA_71_12" {:texto "Deus, não fiques longe de mim; Deus meu, apressa-te para me socorrer."}
"PSA_71_13" {:texto "Sejam envergonhados e pereçam os adversários de minha alma; cubram-se de humilhação e confusão aqueles que procuram [fazer] mal a mim."}
"PSA_71_14" {:texto "Porém eu continuamente manterei a esperança, e darei todo o louvor a ti ainda mais."}
"PSA_71_15" {:texto "Minha boca contará tua justiça, [e] tua salvação o dia todo, ainda que eu não saiba sua medida."}
"PSA_71_16" {:texto "Irei adiante pelos poderes do Senhor DEUS; anunciarei tua justiça, que é somente tua."}
"PSA_71_17" {:texto "Deus, tu tens me ensinado desde minha juventude; e até agora conto tuas maravilhas."}
"PSA_71_18" {:texto "E agora, que estou velho e de cabelos grisalhos, não me desampares, Deus; enquanto eu não tiver anunciado a força de teu braço a [esta] geração, e teu poder a todos que vierem."}
"PSA_71_19" {:texto "E tua justiça, Senhor, [alcança] as alturas; porque tu tens feito grandes coisas. Quem é como tu, ó Deus?"}
"PSA_71_20" {:texto "Tu, que me fizeste ver muitos males e aflições, voltarás a me dar vida; e voltarás a me tirar dos abismos da terra."}
"PSA_71_21" {:texto "Tu aumentarás minha honra e voltarás para me consolar."}
"PSA_71_22" {:texto "Eu também te louvarei com instrumento de cordas pela tua fidelidade, ó meu Deus; cantarei a ti com harpa, ó Santo de Israel."}
"PSA_71_23" {:texto "Meus lábios terão muita alegria, porque cantarei a ti; e também [se alegrará] a minha alma, que tu tens resgatado."}
"PSA_71_24" {:texto "Minha língua também falará de tua justiça o dia todo, pois já estão envergonhados e humilhados aqueles que procuram me [fazer] mal."}
"PSA_72_1" {:texto "Para SalomãoDeus, dá teus juízos ao rei, e tua justiça ao filho do rei."}
"PSA_72_2" {:texto "Ele julgará a teu povo com justiça, e a teus aflitos com juízo."}
"PSA_72_3" {:texto "Os montes trarão paz ao povo, e os morros [trarão] justiça."}
"PSA_72_4" {:texto "Ele julgará os pobres do povo, livrará os filhos do necessitado, e quebrará o opressor."}
"PSA_72_5" {:texto "Temerão a ti enquanto durarem o sol e a luz, geração após geração."}
"PSA_72_6" {:texto "Ele descerá como chuva sobre a [erva] cortada, como as chuvas que regam a terra."}
"PSA_72_7" {:texto "Em seus dias o justo florescerá, e [haverá] abundância de paz, até que não [haja] mais a lua."}
"PSA_72_8" {:texto "E ele terá domínio de mar a mar; e desde o rio até os limites da terra."}
"PSA_72_9" {:texto "Os moradores dos desertos se inclinarão perante sua presença, e seus inimigos lamberão o pó da terra."}
"PSA_72_10" {:texto "Os reis de Társis e das ilhas trarão presentes; os reis de Sabá e Seba apresentarão bens."}
"PSA_72_11" {:texto "E todos os reis se inclinarão a ele; todas as nações o servirão;"}
"PSA_72_12" {:texto "Porque ele livrará ao necessitado que clamar, e também ao aflito que não tem quem o ajude."}
"PSA_72_13" {:texto "Ele será piedoso para o pobre e necessitado, e salvará as almas dos necessitados."}
"PSA_72_14" {:texto "Ele livrará suas almas da falsidade e da violência, e o sangue deles lhe será precioso."}
"PSA_72_15" {:texto "E ele viverá; e lhe darão ouro de Sabá, e continuamente orarão por ele; o dia todo o bendirão."}
"PSA_72_16" {:texto "Haverá bastante trigo na terra sobre os cumes dos montes; seu fruto brotará como o Líbano; e desde a cidade florescerão como a erva da terra."}
"PSA_72_17" {:texto "Seu nome permanecerá para sempre; enquanto o sol durar, seu nome continuará; e se bendirão nele; todas as nações o chamarão de bem-aventurado."}
"PSA_72_18" {:texto "Bendito [seja] o SENHOR Deus, o Deus de Israel! Somente ele faz [tais] maravilhas!"}
"PSA_72_19" {:texto "E bendito seja seu glorioso nome eternamente; e que sua glória encha toda a terra! Amem, e amém!"}
"PSA_72_20" {:texto "[Aqui] terminam as orações de Davi, filho de Jessé."}
"PSA_73_1" {:texto "Salmo de Asafe:Sim, certamente Deus [é] bom para Israel, para os limpos de coração."}
"PSA_73_2" {:texto "Eu porém, quase que meus pés se desviaram; quase nada [faltou] para meus passos escorregarem."}
"PSA_73_3" {:texto "Porque eu tinha inveja dos arrogantes, quando via a prosperidade dos perversos."}
"PSA_73_4" {:texto "Porque não há problemas para eles até sua morte, e o vigor deles continua firme."}
"PSA_73_5" {:texto "Não são tão oprimidos como o homem comum, nem são afligidos como os outros homens;"}
"PSA_73_6" {:texto "Por isso eles são rodeados de arrogância como um colar; estão cobertos de violência como [se fosse] um vestido."}
"PSA_73_7" {:texto "Seus olhos incham de gordura; são excessivos os desejos do coração deles."}
"PSA_73_8" {:texto "Eles são escarnecedores e oprimem falando mal e falando arrogantemente."}
"PSA_73_9" {:texto "Elevam suas bocas ao céu, e suas línguas andam na terra."}
"PSA_73_10" {:texto "Por isso seu povo volta para cá, e as águas lhes são espremidas por completo."}
"PSA_73_11" {:texto "E dizem: Como Deus saberia? Será que o Altíssimo tem conhecimento [disto] ?"}
"PSA_73_12" {:texto "Eis que estes [são] perversos, sempre estão confortáveis e aumentam seus bens."}
"PSA_73_13" {:texto "[Cheguei a pensar] : Certamente purifiquei meu coração e lavei minhas mãos na inocência inutilmente,"}
"PSA_73_14" {:texto "Porque sou afligido o dia todo, e castigado toda manhã."}
"PSA_73_15" {:texto "Se eu tivesse dito [isto] , eu falaria dessa maneira; eis que teria decepcionado a geração de teus filhos."}
"PSA_73_16" {:texto "Quando tentei entender, isto me pareceu trabalhoso."}
"PSA_73_17" {:texto "Até que entrei nos santuários de Deus, [e] entendi o fim de tais pessoas."}
"PSA_73_18" {:texto "Certamente tu os fazes escorregarem, [e] os lança em assolações."}
"PSA_73_19" {:texto "Como eles foram assolados tão repentinamente! Eles se acabaram, [e] se consumiram de medo."}
"PSA_73_20" {:texto "Como o sonho depois de acordar, ó Senhor, quando tu acordares desprezarás a aparência deles;"}
"PSA_73_21" {:texto "Porque meu coração tem se amargurado, e meus rins têm sentido dolorosas picadas."}
"PSA_73_22" {:texto "Então me comportei como tolo, e nada sabia; tornei-me como um animal para contigo."}
"PSA_73_23" {:texto "Porém [agora estarei] continuamente contigo; tu tens segurado minha mão direita."}
"PSA_73_24" {:texto "Tu me guiarás com teu conselho, e depois me receberás [em] glória."}
"PSA_73_25" {:texto "A quem tenho no céu [além de ti] ? E [quando estou] contigo, nada há na terra que eu deseje."}
"PSA_73_26" {:texto "Minha carne e meu coração desfalecem; [porém] Deus [será] a rocha do meu coração e minha porção para sempre."}
"PSA_73_27" {:texto "Porque eis que os que ficaram longe de ti perecerão; tu destróis todo infiel a ti."}
"PSA_73_28" {:texto "Mas [quanto] a mim, bom me é me aproximar de Deus; ponho minha confiança no Senhor DEUS, para que eu conte todas as tuas obras."}
"PSA_74_1" {:texto "Instrução de Asafe:Deus, por que nos rejeitaste para sempre? [Por que] tua ira fumega contra as ovelhas do teu pasto?"}
"PSA_74_2" {:texto "Lembra-te do teu povo, que tu compraste desde a antiguidade; a tribo de tua herança, que resgataste; o monte Sião, em que habitaste."}
"PSA_74_3" {:texto "Percorre as ruínas duradouras, tudo que o inimigo destruiu no santuário."}
"PSA_74_4" {:texto "Os teus inimigos rugiram no meio de tuas assembleias; puseram por sinais de vitória os símbolos deles."}
"PSA_74_5" {:texto "Eles eram como o que levantam machados contra os troncos das árvores."}
"PSA_74_6" {:texto "E agora, com machados e martelos, quebraram todas as obras entalhadas."}
"PSA_74_7" {:texto "Puseram fogo no teu santuário; profanaram [levando] ao chão o lugar onde o teu nome habita."}
"PSA_74_8" {:texto "Disseram em seus corações: Nós os destruiremos por completo; serão queimadas todas as assembleias de Deus na terra."}
"PSA_74_9" {:texto "Já não vemos os nossos sinais; já não há mais profeta; e ninguém entre nós sabe até quando será assim."}
"PSA_74_10" {:texto "Deus, até quando o adversário insultará? O inimigo blasfemará o teu nome para sempre?"}
"PSA_74_11" {:texto "Por que está afastada a tua mão direita? Tira-a do teu peito!"}
"PSA_74_12" {:texto "Deus é o meu Rei desde a antiguidade; ele opera salvação no meio da terra."}
"PSA_74_13" {:texto "Tu dividiste o mar com a tua força; quebraste as cabeças dos monstros nas águas."}
"PSA_74_14" {:texto "Despedaçaste as cabeças do leviatã; e o deste como alimento ao povo do deserto."}
"PSA_74_15" {:texto "Tu dividiste a fonte e o ribeiro; tu secaste os rios perenes."}
"PSA_74_16" {:texto "A ti pertence o dia, a noite também é tua; tu preparaste a luz e o sol."}
"PSA_74_17" {:texto "Tu estabeleceste todos os limites da terra; tu formaste o verão e o inverno."}
"PSA_74_18" {:texto "Lembra-te disto: que o inimigo insultou ao SENHOR; e um povo tolo blasfemou o teu nome."}
"PSA_74_19" {:texto "Não entregues a vida da tua pombinha para os animais selvagens; não te esqueças para sempre da vida dos teus pobres."}
"PSA_74_20" {:texto "Olha para o [teu] pacto, porque os lugares escuros da terra estão cheios de habitações violentas."}
"PSA_74_21" {:texto "Não permitas que o oprimido volte humilhado; que o aflito e o necessitado louvem o teu nome."}
"PSA_74_22" {:texto "Levanta-te, Deus; luta em favor de tua causa; lembra-te do insulto que o tolo faz a ti o dia todo."}
"PSA_74_23" {:texto "Não te esqueças da voz dos teus adversários; o barulho dos que se levantam contra ti sobe cada vez mais."}
"PSA_75_1" {:texto "Para o regente, conforme “altachete”; salmo e cântico de Asafe:Louvamos a ti, ó Deus; louvamos, e perto [está] o teu nome; são anunciadas as tuas maravilhas."}
"PSA_75_2" {:texto "O que eu recebi, no [tempo] determinado, julgarei de forma justa."}
"PSA_75_3" {:texto "A terra e todos os seus moradores [são] dissolvidos; [porém] eu fortifiquei suas colunas. (Selá)"}
"PSA_75_4" {:texto "Eu disse aos orgulhosos: Não sejais orgulhosos!E aos perversos: Não exalteis o vosso poder!"}
"PSA_75_5" {:texto "Não confieis em vosso poder, nem faleis com arrogância."}
"PSA_75_6" {:texto "Porque a exaltação não vem do oriente, nem do ocidente, nem do deserto;"}
"PSA_75_7" {:texto "Mas sim [de] Deus, que é o Juiz; ele abate a um, e exalta a outro."}
"PSA_75_8" {:texto "Porque o SENHOR [tem] um copo na mão; com vinho espumado, cheio de mistura, e ele o derramará; e os perversos da terra o beberão e sugarão até seus restos."}
"PSA_75_9" {:texto "Mas eu [o] anunciarei para sempre; cantarei louvores ao Deus de Jacó."}
"PSA_75_10" {:texto "E cortarei todas as arrogâncias dos perversos; [mas] os rostos dos justos serão exaltados."}
"PSA_76_1" {:texto "Salmo e cântico de Asafe, para o regente, com instrumentos de cordas:Deus é conhecido em Judá; grande é o seu nome em Israel."}
"PSA_76_2" {:texto "E em Salém está seu tabernáculo, e sua morada em Sião."}
"PSA_76_3" {:texto "Ali ele quebrou as flechas do arco; o escudo, a espada, e a guerra. (Selá)"}
"PSA_76_4" {:texto "Tu és mais ilustre [e] glorioso que montes de presas."}
"PSA_76_5" {:texto "Os ousados de coração foram despojados; dormiram seu sono; e dos homens valentes, nenhum encontrou [poder] em suas mãos."}
"PSA_76_6" {:texto "Por tua repreensão, ó Deus de Jacó, carruagens e cavalos caíram no sono [da morte] ."}
"PSA_76_7" {:texto "Tu, terrível és tu; e quem subsistirá perante ti com tua ira?"}
"PSA_76_8" {:texto "Desde os céus tu anunciaste o juízo; a terra tremeu, e se aquietou,"}
"PSA_76_9" {:texto "Quando Deus se levantou para o julgamento, para salvar a todos os mansos da terra. (Selá)"}
"PSA_76_10" {:texto "Porque a ira humana serve para o teu louvor; com o restante da ira te cingirás."}
"PSA_76_11" {:texto "Fazei votos, e [os] pagai ao SENHOR vosso Deus; todos os que estão ao redor dele tragam presentes ao Temível."}
"PSA_76_12" {:texto "Ele cortará o espírito dos governantes; ele é temível aos reis da terra."}
"PSA_77_1" {:texto "Salmo de Asafe, para o regente, conforme “Jedutum”:Clamo a Deus com minha voz, minha voz a Deus; e ele inclinará seus ouvidos a mim."}
"PSA_77_2" {:texto "No dia da minha angústia busquei ao Senhor; minha mão estava continuamente estendida; minha alma não se deixava consolar."}
"PSA_77_3" {:texto "Eu ficava me lembrando de Deus, e gemendo; ficava pensativo, e meu espírito desfalecia. (Selá)"}
"PSA_77_4" {:texto "Tu mantiveste abertas as pálpebras dos meus olhos; eu estava perturbado, e não conseguia falar."}
"PSA_77_5" {:texto "Eu ficava imaginando os dias antigos, e os anos passados."}
"PSA_77_6" {:texto "De noite eu me lembrava de minha canção; meditava em meu coração; e meu espírito ficava procurando [entender] ."}
"PSA_77_7" {:texto "Será que o Senhor rejeitará para sempre? E nunca mais mostrará seu favor?"}
"PSA_77_8" {:texto "A sua bondade se acabou para sempre? Ele deu fim à [sua] promessa de geração em geração?"}
"PSA_77_9" {:texto "Deus se esqueceu de ter misericórdia? Ele encerrou suas compaixões por causa de sua ira? (Selá)"}
"PSA_77_10" {:texto "Então eu disse: Esta é a minha dor: os anos em que a mão do Altíssimo [agia] ."}
"PSA_77_11" {:texto "Eu me lembrarei das obras do SENHOR; porque me lembrarei de tuas antigas maravilhas."}
"PSA_77_12" {:texto "Meditarei em todos as tuas obras, e falarei de teus feitos."}
"PSA_77_13" {:texto "Deus, santo [é] o teu caminho; quem é deus [tão] grande como [nosso] Deus?"}
"PSA_77_14" {:texto "Tu [és] o Deus que faz maravilhas; tu fizeste os povos conhecerem teu poder."}
"PSA_77_15" {:texto "Com [teu] braço livraste teu povo, os filhos de Jacó e de José. (Selá)"}
"PSA_77_16" {:texto "As águas te viram, ó Deus; as águas te viram, [e] tremeram; também os abismos foram abalados."}
"PSA_77_17" {:texto "Grandes nuvens derramaram muitas águas; os céus fizeram barulho; e também tuas flechas correram de um lado ao outro."}
"PSA_77_18" {:texto "O ruído de teus trovões [estava] nos ventos; relâmpagos iluminaram ao mundo; a terra se abalou e tremou."}
"PSA_77_19" {:texto "Pelo mar [foi] teu caminho; e tuas veredas por muitas águas; e tuas pegadas não foram conhecidas."}
"PSA_77_20" {:texto "Guiaste a teu povo como a um rebanho, pela mão de Moisés e de Arão."}
"PSA_78_1" {:texto "Instrução de Asafe:Povo meu, escuta minha doutrina; inclinai vossos ouvidos às palavras de minha boca."}
"PSA_78_2" {:texto "Abrirei minha boca em parábolas; falarei mistérios dos tempos antigos,"}
"PSA_78_3" {:texto "Os quais ouvimos e conhecemos, e nossos pais nos contaram."}
"PSA_78_4" {:texto "Nós não [os] encobriremos a seus filhos, contaremos à próxima geração sobre os louvores do SENHOR, o seu poder, e suas maravilhas que ele fez."}
"PSA_78_5" {:texto "Porque ele firmou um testemunho em Jacó, e pôs a Lei em Israel, a qual ele instruiu aos nossos pais, para que eles ensinassem a seus filhos;"}
"PSA_78_6" {:texto "Para que a geração seguinte [dela] soubesse; [e] os filhos que nascessem contassem a seus filhos;"}
"PSA_78_7" {:texto "E [assim] pusessem sua esperança em Deus; e não se esquecessem dos feitos de Deus, mas sim, que guardassem os mandamentos dele;"}
"PSA_78_8" {:texto "E não fossem como seus pais, [que foram] uma geração teimosa e rebelde; geração que não firmou seu coração, e cujo espírito não foi fiel a Deus."}
"PSA_78_9" {:texto "Os filhos de Efraim, mesmo tendo arcos e flechas, viraram-se para trás no dia da batalha;"}
"PSA_78_10" {:texto "Não guardaram o pacto de Deus, e recusaram a andar conforme sua Lei."}
"PSA_78_11" {:texto "E se esqueceram de seus feitos, e de suas maravilhas que ele tinha lhes feito ver."}
"PSA_78_12" {:texto "Ele fez maravilhas perante seus pais na terra do Egito, [no] campo de Zoã."}
"PSA_78_13" {:texto "Ele dividiu o mar, e os fez passarem por ele; ele fez as águas ficarem paradas como [se estivessem] amontoadas."}
"PSA_78_14" {:texto "E ele os guiou com uma nuvem durante o dia, e por toda a noite com uma luz de fogo."}
"PSA_78_15" {:texto "Ele partiu as rochas no deserto, e [lhes] deu de beber como que de abismos profundos."}
"PSA_78_16" {:texto "Porque ele tirou correntes da rocha, e fez as águas descerem como rios."}
"PSA_78_17" {:texto "E [ainda] prosseguiram em pecar contra ele, irritando ao Altíssimo no deserto."}
"PSA_78_18" {:texto "E tentaram a Deus nos seus corações, pedindo comida para o desejo de suas almas."}
"PSA_78_19" {:texto "E falaram contra Deus, e disseram: Poderia Deus preparar uma mesa de comida no deserto?"}
"PSA_78_20" {:texto "Eis que ele feriu a rocha, e águas correram [dela] e ribeiros fluíram em abundância; será que ele também poderia [nos] dar pão, ou preparar carne a seu povo?"}
"PSA_78_21" {:texto "Por isso o SENHOR [os] ouviu, e se irritou; e fogo se acendeu contra Jacó, e furor também subiu contra Israel;"}
"PSA_78_22" {:texto "Porque eles não creram em Deus, nem confiaram na salvação que dele vem;"}
"PSA_78_23" {:texto "Mesmo assim, ele deu ordens às altas nuvens, e abriu as portas dos céus;"}
"PSA_78_24" {:texto "E choveu sobre eles o maná, para comerem; e lhes deu trigo dos céus."}
"PSA_78_25" {:texto "Cada homem [daquele povo] comeu o pão dos anjos; ele lhes mandou comida para se fartarem."}
"PSA_78_26" {:texto "Ele fez soprar o vento do oriente nos céus, e trouxe o [vento] do sul com seu poder."}
"PSA_78_27" {:texto "Ele fez chover sobre eles carne como a poeira da terra; e aves de asas como a areia do mar;"}
"PSA_78_28" {:texto "E [as] fez cair no meio de seu acampamento, ao redor de suas tendas."}
"PSA_78_29" {:texto "Então comeram, e fartaram-se abundantemente; e satisfez o desejo deles."}
"PSA_78_30" {:texto "Porem, estando eles [ainda] não satisfeitos, enquanto a comida ainda estava em suas bocas,"}
"PSA_78_31" {:texto "a ira de Deus subiu contra eles; matou os mais robustos deles e abateu os jovens de Israel."}
"PSA_78_32" {:texto "Com tudo isto ainda pecaram, e não creram nas maravilhas que ele fez."}
"PSA_78_33" {:texto "Por isso gastaram seus dias em futilidades, e seus anos em terrores."}
"PSA_78_34" {:texto "Quando ele matava [alguns dentre] eles, então buscavam por ele, e se convertiam, e buscavam a Deus de madrugada."}
"PSA_78_35" {:texto "E se lembravam de que Deus era sua rocha, e que o Deus Altíssimo [era] o seu libertador."}
"PSA_78_36" {:texto "Porém falavam bem dele da boca para fora, e mentiam com suas línguas."}
"PSA_78_37" {:texto "Porque o coração deles não era comprometido para com ele, e não foram fiéis ao pacto dele."}
"PSA_78_38" {:texto "Porém ele, sendo misericordioso, perdoava a maldade deles, e não os destruía; e muitas vezes desviou de mostrar sua ira, e não despertou todo o seu furor;"}
"PSA_78_39" {:texto "[Porque] se lembrou de que eles eram carne, e [como] o vento, que vai, e não volta mais."}
"PSA_78_40" {:texto "Quantas vezes o provocaram no deserto, e o maltrataram na terra desabitada!"}
"PSA_78_41" {:texto "Pois voltavam a tentar a Deus, e perturbavam ao Santo de Israel."}
"PSA_78_42" {:texto "Não se lembraram de sua mão, [nem] do dia em que os livrou do adversário."}
"PSA_78_43" {:texto "Como quando ele fez seus sinais no Egito, e seus atos maravilhosos no campo de Zoã."}
"PSA_78_44" {:texto "E transformou seus rios e suas correntes em sangue, para que não bebessem."}
"PSA_78_45" {:texto "Enviou entre eles variedades de moscas, que os consumiu; e rãs, que os destruíram."}
"PSA_78_46" {:texto "E deu suas colheitas ao pulgão, e o trabalho deles ao gafanhoto."}
"PSA_78_47" {:texto "Com saraiva destruiu suas vinhas, e suas figueiras-bravas com granizo."}
"PSA_78_48" {:texto "E entregou seu gado à saraiva; e seus animais a brasas ardentes."}
"PSA_78_49" {:texto "Mandou entre eles o ardor de sua ira: fúria, irritação e angústia, enviando mensageiros do mal."}
"PSA_78_50" {:texto "Ele preparou o caminho de sua ira; não poupou suas almas da morte, e entregou seus animais à peste."}
"PSA_78_51" {:texto "E feriu [mortalmente] a todo primogênito no Egito; as primícias nas forças nas tendas de Cam."}
"PSA_78_52" {:texto "E levou a seu povo como a ovelhas; e os guiou pelo deserto como a um rebanho."}
"PSA_78_53" {:texto "Ele os conduziu em segurança, e não temeram. O mar encobriu seus inimigos."}
"PSA_78_54" {:texto "E os trouxe até os limites de sua [terra] santa, até este monte, que sua mão direita adquiriu."}
"PSA_78_55" {:texto "E expulsou as nações de diante deles, e fez com que eles repartissem as linhas de sua herança, e fez as tribos de Israel habitarem em suas tendas."}
"PSA_78_56" {:texto "Porém eles tentaram e provocaram ao Deus Altíssimo; e não guardaram os testemunhos dele."}
"PSA_78_57" {:texto "E voltaram a ser [tão] infiéis como os seus pais; desviaram-se como um arco enganoso."}
"PSA_78_58" {:texto "E provocaram a ira dele com seus altares pagãos, e com suas imagens de escultura moveram-no de ciúmes."}
"PSA_78_59" {:texto "Deus ouviu [isto] , e se indignou; e rejeitou gravemente a Israel."}
"PSA_78_60" {:texto "Por isso ele abandonou o tabernáculo em Siló, a tenda que ele havia estabelecido como habitação entre as pessoas."}
"PSA_78_61" {:texto "E entregou o [símbolo] de seu poder em cativeiro, e sua glória na mão do adversário."}
"PSA_78_62" {:texto "E entregou seu povo à espada, e enfureceu-se contra sua herança."}
"PSA_78_63" {:texto "O fogo consumiu a seus rapazes, e suas virgens não tiveram músicas de casamento."}
"PSA_78_64" {:texto "Seus sacerdotes caíram à espada, e suas viúvas não lamentaram."}
"PSA_78_65" {:texto "Então o Senhor despertou como que do sono, como um homem valente que se exalta com o vinho."}
"PSA_78_66" {:texto "E feriu a seus adversários, para que recuassem, [e] lhes pôs como humilhação perpétua."}
"PSA_78_67" {:texto "Porém ele rejeitou a tenda de José, e não escolheu a tribo de Efraim."}
"PSA_78_68" {:texto "Mas escolheu a tribo de Judá, o monte de Sião, a quem ele amava."}
"PSA_78_69" {:texto "E edificou seu santuário como alturas; como a terra, a qual ele fundou para sempre."}
"PSA_78_70" {:texto "E ele escolheu a seu servo Davi; e o tomou dos apriscos de ovelhas."}
"PSA_78_71" {:texto "Ele o tirou de cuidar das ovelhas geradoras de filhotes, para que ele apascentasse ao seu povo Jacó; e à sua herança Israel."}
"PSA_78_72" {:texto "E ele os apascentou com um coração sincero, e os guiou com as habilidades de suas mãos."}
"PSA_79_1" {:texto "Salmo de Asafe:Ó Deus, as nações invadiram a tua herança; contaminaram ao teu santo Templo; tornaram Jerusalém em amontoados de ruínas."}
"PSA_79_2" {:texto "Deram os cadáveres dos teus servos por comida para as aves dos céus; a carne dos teus consagrados aos animais da terra."}
"PSA_79_3" {:texto "Derramaram o sangue deles como água ao redor de Jerusalém, e não havia quem os enterrasse."}
"PSA_79_4" {:texto "Somos humilhados pelos nossos vizinhos; zombados e escarnecidos pelos que estão ao nosso redor."}
"PSA_79_5" {:texto "Até quando, SENHOR? Ficarás tu irado para sempre? Teus ciúmes arderão como o fogo?"}
"PSA_79_6" {:texto "Derrama o teu furor sobre as nações que não te conhecem, sobre os reinos que não clamam pelo teu nome;"}
"PSA_79_7" {:texto "porque devoraram Jacó, e arruinaram suas habitações."}
"PSA_79_8" {:texto "Não nos castigue pelas perversidades do passado; apressa-te, que as tuas misericórdias venham até nós, porque estamos muito fracos."}
"PSA_79_9" {:texto "Socorre-nos, ó Deus da nossa salvação, para glorificar o teu nome; livra-nos, e perdoa os nossos pecados por causa do teu nome."}
"PSA_79_10" {:texto "Qual é a finalidade de que as nações digam: Onde está o Deus deles?Que a vingança do sangue derramado dos teus servos seja conhecida entre as nações, diante dos nossos olhos."}
"PSA_79_11" {:texto "Chegue diante de ti o gemido dos prisioneiros; conforme o teu grande poder, salva a vida dos sentenciados à morte."}
"PSA_79_12" {:texto "E retribui a nossos vizinhos em seus corpos sete vezes tanto dos insultos que te insultaram, ó Senhor."}
"PSA_79_13" {:texto "Assim nós, o teu povo, e as ovelhas de teu pasto, te louvaremos para sempre; de geração em geração cantaremos louvores a ti."}
"PSA_80_1" {:texto "Para o regente, conforme “Susanedute”. Samo de Asafe:Ó Pastor de Israel, inclina teus ouvidos [a mim] ,tu que pastoreias a José como a ovelhas, que habitas entre os querubins, mostra teu brilho,"}
"PSA_80_2" {:texto "Perante Efraim, Benjamim e Manassés, desperta o teu poder, e vem para nos salvar."}
"PSA_80_3" {:texto "Restaura-nos, Deus, e faz brilhar o teu rosto; e [assim] seremos salvos."}
"PSA_80_4" {:texto "Ó SENHOR Deus dos exércitos, até quando ficarás irritado contra a oração de teu povo?"}
"PSA_80_5" {:texto "Tu os alimentas com pão de lágrimas, e lhes faz beber lágrimas com grande medida."}
"PSA_80_6" {:texto "Puseste-nos como a briga de nossos vizinhos, e nossos inimigos zombam [de nós] ."}
"PSA_80_7" {:texto "Restaura-nos, ó Deus dos exércitos, e faz brilhar o teu rosto; e [assim] seremos salvos."}
"PSA_80_8" {:texto "Tu transportaste [tua] vinha do Egito, tiraste as nações, e a plantaste."}
"PSA_80_9" {:texto "Preparaste [um lugar] para ela, e a fizeste estender suas raízes, e ela encheu a terra."}
"PSA_80_10" {:texto "Os montes foram cobertos pela sombra dela, e seus ramos [se tornaram] como o dos mais fortes cedros."}
"PSA_80_11" {:texto "Ela espalhou seus ramos até o mar, e seus brotos até o rio."}
"PSA_80_12" {:texto "Por que [pois] quebraste seus muros, de modo que os que passam arrancam seus frutos?"}
"PSA_80_13" {:texto "O porco do campo a destruiu; os animais selvagens a devoraram."}
"PSA_80_14" {:texto "Ó Deus dos exércitos, volta, te pedimos; olha desde os céus, e vê, e visita esta vinha;"}
"PSA_80_15" {:texto "E a videira que tua mão direita plantou; o ramo que fortificaste para ti."}
"PSA_80_16" {:texto "[Ela está] queimada pelo fogo, [e] cortada; perecem pela repreensão de tua face."}
"PSA_80_17" {:texto "Seja tua mão sobre o homem de tua mão direita, sobre o filho do homem a quem fortificaste para ti."}
"PSA_80_18" {:texto "Assim não desviaremos de ti; guarda-nos em vida, e chamaremos o teu nome."}
"PSA_80_19" {:texto "SENHOR Deus dos exércitos, restaura-nos; faz brilhar o teu rosto, e [assim] seremos salvos."}
"PSA_81_1" {:texto "Salmo de Asafe, para o regente, conforme “Gitite”:Cantai de alegria a Deus, [que é] nossa força; mostrai alegria ao Deus de Jacó."}
"PSA_81_2" {:texto "Levantai uma canção, e dai-nos o tamborim; a agradável harpa com a lira."}
"PSA_81_3" {:texto "Tocai trombeta na lua nova; e na lua cheia, no dia de nossa celebração."}
"PSA_81_4" {:texto "Porque [isto] é um estatuto em Israel, e uma ordem do Deus de Jacó."}
"PSA_81_5" {:texto "Ele o pôs como testemunho em José, quando tinha saído contra a terra do Egito, [onde] ouvi uma língua que eu não entendia:"}
"PSA_81_6" {:texto "Tirei seus ombros de debaixo da carga; suas mãos foram livrados dos cestos."}
"PSA_81_7" {:texto "Na angústia clamaste, e livrei-te dela; te respondi no esconderijo dos trovões; provei a ti nas águas de Meribá. (Selá)"}
"PSA_81_8" {:texto "Ouve [-me] , povo meu, e eu te darei testemunho; ó Israel, se tu me ouvisses!"}
"PSA_81_9" {:texto "Não haverá entre ti deus estranho, e não te prostrarás a um deus estrangeiro."}
"PSA_81_10" {:texto "Eu sou o SENHOR teu Deus, que te fiz subir da terra do Egito; abre tua boca por completo, e eu a encherei."}
"PSA_81_11" {:texto "Mas meu povo não ouviu minha voz, e Israel não me quis."}
"PSA_81_12" {:texto "Por isso eu os entreguei ao desejo de seus próprios corações, e andaram conforme seus próprios conselhos."}
"PSA_81_13" {:texto "Ah, se meu povo me ouvisse, se Israel andasse em meus caminhos!"}
"PSA_81_14" {:texto "Em pouco tempo eu derrotaria seus inimigos, e viraria minha mão contra seus adversários."}
"PSA_81_15" {:texto "Os que odeiam ao SENHOR, a ele se submeteriam, e o tempo [da punição] deles seria eterno."}
"PSA_81_16" {:texto "E ele sustentaria [Israel] com a abundância de trigo; e eu te fartaria com o mel da rocha."}
"PSA_82_1" {:texto "Salmo de Asafe:Deus está na congregação dos poderosos, e julga no meio dos deuses."}
"PSA_82_2" {:texto "Até quando julgareis injustamente, e favoreceis a aparência dos perversos? (Selá)"}
"PSA_82_3" {:texto "Fazei justiça ao pobre e ao órfão; defendei o afligido e o pobre."}
"PSA_82_4" {:texto "Livrai ao pobre e necessitado, resgatai [-o] das mãos dos perversos."}
"PSA_82_5" {:texto "Eles nada conhecem, nem entendem; continuamente andam em trevas; abalam-se todos os fundamentos da terra."}
"PSA_82_6" {:texto "Eu disse: Sois deuses; e todos vós sois filhos do Altíssimo."}
"PSA_82_7" {:texto "Porém morrereis como homens, e caireis como qualquer um dos líderes."}
"PSA_82_8" {:texto "Levanta-te, ó Deus; julga a terra, pois tu és o dono de todas as nações."}
"PSA_83_1" {:texto "Cântico e Salmo de Asafe:Deus, não fiques em silêncio; não estejas indiferente, nem fiques quieto, ó Deus."}
"PSA_83_2" {:texto "Porque eis que teus inimigos fazem barulho, e aqueles que te odeiam levantam a cabeça."}
"PSA_83_3" {:texto "Planejam astutos conselhos contra teu povo, e se reúnem para tramar contra teus preciosos."}
"PSA_83_4" {:texto "Eles disseram: Vinde, e os destruamos, para que não sejam mais um povo, e nunca mais seja lembrado o nome de Israel."}
"PSA_83_5" {:texto "Porque tomaram conselhos com uma só intenção; fizeram aliança contra ti:"}
"PSA_83_6" {:texto "As tendas de Edom, e dos ismaelitas, de Moabe, e dos agarenos;"}
"PSA_83_7" {:texto "De Gebal, e de Amom, e de Amaleque; dos filisteus, com os moradores de Tiro."}
"PSA_83_8" {:texto "A Assíria também se aliou a eles; eles foram a força dos filhos de Ló. (Selá)"}
"PSA_83_9" {:texto "Faze a eles como a Midiã, como a Sísera, como a Jabim no ribeiro de Quisom,"}
"PSA_83_10" {:texto "[Que] pereceram em Endor; vieram a ser esterco da terra."}
"PSA_83_11" {:texto "Faze a eles [e] a seus nobres como a Orebe, e como Zeebe; e a todos os seus príncipes como a Zebá, e como a Zalmuna,"}
"PSA_83_12" {:texto "Que disseram: Tomemos posse para nós dos terrenos de Deus."}
"PSA_83_13" {:texto "Deus meu, faze-os como a um redemoinho, como a palhas perante o vento;"}
"PSA_83_14" {:texto "Como o fogo, que queima uma floresta, e como a labareda que incendeia as montanhas."}
"PSA_83_15" {:texto "Persegue-os assim com tua tempestade, e assombra-os com o teu forte vento."}
"PSA_83_16" {:texto "Enche os rostos deles de vergonha, para que busquem o teu nome, SENHOR."}
"PSA_83_17" {:texto "Sejam envergonhados e assombrados para sempre, e sejam humilhados, e pereçam."}
"PSA_83_18" {:texto "Para que saibam que tu, (e teu nome é EU-SOU), és o Altíssimo sobre toda a terra."}
"PSA_84_1" {:texto "Para o regente, com “Gitite”. Salmo dos filhos de Coré:Quão agradáveis são tuas moradas, SENHOR dos exércitos!"}
"PSA_84_2" {:texto "Minha alma está desejosa, ao ponto de desmaiar, pelos pátios do SENHOR; meu coração e minha carne clamam ao Deus vivente."}
"PSA_84_3" {:texto "Até o pardal acha casa, e a andorinha ninho para si, onde ponha filhotes perto de teus altares, ó SENHOR dos exércitos, Rei meu e Deus meu."}
"PSA_84_4" {:texto "Bem-aventurados os que habitam em tua casa; eles louvam a ti continuamente. (Selá)"}
"PSA_84_5" {:texto "Bem-aventurados aqueles cuja força está em ti, em cujos corações estão os caminhos [corretos] ."}
"PSA_84_6" {:texto "Eles, ao passarem pelo Vale de Baca, fazem dele uma fonte; e a chuva o cobre de bênçãos."}
"PSA_84_7" {:texto "Eles vão de força em força; [cada um deles] comparece diante de Deus em Sião."}
"PSA_84_8" {:texto "SENHOR Deus dos exércitos, escuta minha oração; inclina os teus ouvidos, ó Deus de Jacó. (Selá)"}
"PSA_84_9" {:texto "Olha o nosso escudo, ó Deus; e observa o rosto do teu ungido."}
"PSA_84_10" {:texto "Porque melhor é um dia nos teus pátios, do que mil [fora] . Prefiro estar à porta da casa do meu Deus, a morar nas tendas dos perversos."}
"PSA_84_11" {:texto "Porque o SENHOR Deus é sol e escudo; o SENHOR concederá graça e honra; ele não negará o bem aos que andam em integridade."}
"PSA_84_12" {:texto "Ó SENHOR dos exércitos, bem-aventurado é o homem que confia em ti!"}
"PSA_85_1" {:texto "Salmo para o regente, dos filhos de Coré:Foste favorável, ó SENHOR, à tua terra; restauraste Jacó de seu infortúnio."}
"PSA_85_2" {:texto "Perdoaste a perversidade de teu povo; encobriste todos os seus pecados. (Selá)"}
"PSA_85_3" {:texto "Removeste toda a tua indignação; do ardor de tua ira te desviaste."}
"PSA_85_4" {:texto "Restaura-nos, ó Deus de nossa salvação; e cessa tua ira de sobre nós."}
"PSA_85_5" {:texto "Acaso estarás irado contra nós para sempre? Estenderás a tua ira de geração em geração?"}
"PSA_85_6" {:texto "Não voltará a dar-nos vida, para que o teu povo se alegre em ti?"}
"PSA_85_7" {:texto "Mostra-nos tua bondade, SENHOR, e dá para nós tua salvação."}
"PSA_85_8" {:texto "Escutarei o que o Deus, o SENHOR, falar, pois ele falará de paz ao seu povo, e aos seus santos, contanto que não voltem à loucura."}
"PSA_85_9" {:texto "Certamente sua salvação está perto daqueles que o temem, para que a glória habite em nossa terra."}
"PSA_85_10" {:texto "A bondade e a verdade se encontrarão; a justiça e a paz se beijarão."}
"PSA_85_11" {:texto "A verdade brotará da terra, e a justiça olhará desde os céus."}
"PSA_85_12" {:texto "E o SENHOR também dará o bem; e a nossa terra dará o seu fruto."}
"PSA_85_13" {:texto "A justiça irá adiante dele, e ele nos porá no caminho de seus passos."}
"PSA_86_1" {:texto "Oração de Davi:Inclina teus ouvidos, SENHOR, e ouve-me, porque estou aflito e necessitado."}
"PSA_86_2" {:texto "Guarda minha alma, porque eu sou dedicado [a ti] ; ó Deus, salva o teu servo, que confia em ti."}
"PSA_86_3" {:texto "Tem misericórdia de mim, SENHOR, porque clamo a ti o dia todo."}
"PSA_86_4" {:texto "Alegra a alma de teu servo; porque a ti, Senhor, levanto a minha alma."}
"PSA_86_5" {:texto "Pois tu, Senhor, és bom, perdoador, e grande em bondade para todos os que clamam a ti."}
"PSA_86_6" {:texto "Inclina, SENHOR, teus ouvidos à minha oração; e presta atenção à voz de minhas súplicas."}
"PSA_86_7" {:texto "No dia de minha angústia clamarei a ti, pois tu me responderás."}
"PSA_86_8" {:texto "Não há semelhante a ti entre os deuses, ó Senhor; e nem obras como as tuas."}
"PSA_86_9" {:texto "Todas as nações que tu fizeste virão e se prostrarão diante de ti, Senhor; e elas glorificarão o teu nome."}
"PSA_86_10" {:texto "Pois tu és grande, e fazes maravilhas; somente tu és Deus."}
"PSA_86_11" {:texto "Ensina-me, SENHOR, o teu caminho, [e] eu andarei em tua verdade; une meu coração com o temor ao teu nome."}
"PSA_86_12" {:texto "Louvarei a ti, ó Senhor meu Deus, com todo o meu coração; e glorificarei o teu nome para sempre."}
"PSA_86_13" {:texto "Pois grande é a tua misericórdia para comigo; e livraste minha alma das profundezas do Xeol."}
"PSA_86_14" {:texto "Ó Deus, pessoas arrogantes têm se levantado contra mim; e muitos violentos procuram [matar] a minha alma, e te desprezam."}
"PSA_86_15" {:texto "Porém tu, Senhor, és Deus misericordioso e piedoso; tardio para se irar, e abundante em bondade e verdade."}
"PSA_86_16" {:texto "Volta-te para mim, e tem piedade de mim; dá tua força a teu servo, e salva o filho de tua serva."}
"PSA_86_17" {:texto "Faze-me um sinal de bondade, para que os que me odeiam vejam, e se envergonhem; porque tu, SENHOR, tens me ajudado e consolado."}
"PSA_87_1" {:texto "Salmo e cântico, dos filhos de Coré:Seu fundamento está nos santos montes."}
"PSA_87_2" {:texto "O SENHOR ama os portões de Sião mais que todas as habitações de Jacó."}
"PSA_87_3" {:texto "Gloriosas coisas são faladas de ti, ó cidade de Deus. (Selá)"}
"PSA_87_4" {:texto "Farei menção de Raabe e Babilônia aos que me conhecem; eis que da Filístia, Tiro e Cuxe [se dirá] : Este é nascido ali."}
"PSA_87_5" {:texto "E de Sião se dirá: Este e aquele outro nasceram ali. E o próprio Altíssimo a manterá firme."}
"PSA_87_6" {:texto "O SENHOR contará, quando escrever dos povos: Este nasceu ali. (Selá)"}
"PSA_87_7" {:texto "Assim como os cantores e instrumentistas; todas as minhas fontes estão em ti."}
"PSA_88_1" {:texto "Cântico e Salmo dos filhos de Coré, para o regente, conforme “Maalate Leanote”. Instrução feita por Hemã, o Ezraíta:Ó SENHOR Deus de minha salvação, dia [e] noite clamo diante de ti."}
"PSA_88_2" {:texto "Que minha oração chegue à tua presença; inclina os teus ouvidos ao meu clamor."}
"PSA_88_3" {:texto "Porque minha alma está cheia de aflições, e minha vida se aproxima do Xeol."}
"PSA_88_4" {:texto "Já estou contado entre os que descem à cova; tornei-me um homem sem forças."}
"PSA_88_5" {:texto "Abandonado entre os mortos, como os feridos de morte que jazem na sepultura, aos quais tu já não te lembra mais, e já estão cortados [para fora do poder] de tua mão."}
"PSA_88_6" {:texto "Puseste-me na cova mais profunda, nas trevas [e] nas profundezas."}
"PSA_88_7" {:texto "O teu furor pesa sobre mim, e [me] oprimiste com todas as tuas ondas. (Selá)"}
"PSA_88_8" {:texto "Afastaste de mim os meus conhecidos, fizeste-me abominável para com eles; estou preso, e não posso sair."}
"PSA_88_9" {:texto "Meus olhos estão fracos por causa da opressão; clamo a ti, SENHOR, o dia todo; a ti estendo minhas mãos."}
"PSA_88_10" {:texto "Farás tu milagres aos mortos? Ou mortos se levantarão, e louvarão a ti? (Selá)"}
"PSA_88_11" {:texto "Tua bondade será contada na sepultura? Tua fidelidade na perdição?"}
"PSA_88_12" {:texto "Serão conhecidas tuas maravilhas nas trevas? E tua justiça na terra do esquecimento?"}
"PSA_88_13" {:texto "Porém eu, SENHOR, clamo a ti; e minha oração vem ao teu encontro de madrugada."}
"PSA_88_14" {:texto "Por que tu, SENHOR, rejeitas minha alma, e escondes tua face de mim?"}
"PSA_88_15" {:texto "Tenho sido afligido e estou perto da morte desde a minha juventude; tenho sofrido teus temores, e estou desesperado."}
"PSA_88_16" {:texto "Os ardores de tua ira têm passado por mim; teus terrores me destroem."}
"PSA_88_17" {:texto "Rodeiam-me como águas o dia todo; cercam-me juntos."}
"PSA_88_18" {:texto "Afastaste de mim meu amigo e meu companheiro; meus conhecidos [estão em] trevas."}
"PSA_89_1" {:texto "Instrução de Etã Ezraíta:Cantarei das bondades do SENHOR para sempre; de geração em geração com minha boca anunciarei tua fidelidade."}
"PSA_89_2" {:texto "Porque eu disse: [Tua] bondade durará para sempre; confirmaste tua fidelidade até nos céus."}
"PSA_89_3" {:texto "[Tu disseste] : Eu fiz um pacto com o meu escolhido, jurei a meu servo Davi. [Eu lhe disse] :"}
"PSA_89_4" {:texto "Confirmarei tua semente para sempre, e farei teu trono continuar de geração em geração. (Selá)"}
"PSA_89_5" {:texto "Que os céus louvem as tuas maravilhas, SENHOR; pois tua fidelidade [está] na congregação dos santos."}
"PSA_89_6" {:texto "Porque quem no céu pode se comparar ao SENHOR? E quem é semelhante ao SENHOR entre os filhos dos poderosos?"}
"PSA_89_7" {:texto "Deus é terrível na assembleia dos santos, e mais temível do que todos os que estão ao seu redor."}
"PSA_89_8" {:texto "Ó SENHOR Deus dos exércitos, quem é poderoso como tu, SENHOR? E tua fidelidade está ao redor de ti."}
"PSA_89_9" {:texto "Tu dominas a arrogância do mar; quando suas ondas se levantam, tu as aquietas."}
"PSA_89_10" {:texto "Quebraste a Raabe como que ferida de morte; com teu braço forte espalhaste os teus inimigos."}
"PSA_89_11" {:texto "Teus são os céus, também tua é a terra; o mundo e sua plenitude, tu os fundaste."}
"PSA_89_12" {:texto "O norte e o sul, tu os criaste; Tabor e Hermon têm muita alegria em teu nome."}
"PSA_89_13" {:texto "Tu tens um braço poderoso; forte é tua mão, [e] alta está tua mão direita."}
"PSA_89_14" {:texto "Justiça e juízo são a base de teu trono; bondade e verdade vão adiante de teu rosto."}
"PSA_89_15" {:texto "Bem-aventurado é o povo que entende o grito de alegria; ó SENHOR, eles andarão na luz de tua face."}
"PSA_89_16" {:texto "Em teu nome se alegrarão o dia todo, e em tua justiça serão exaltados."}
"PSA_89_17" {:texto "Porque tu és a glória de sua força, e por tua boa vontade nosso poder é exaltado."}
"PSA_89_18" {:texto "Porque ao SENHOR pertence nosso escudo; e o Santo de Israel é nosso Rei."}
"PSA_89_19" {:texto "Então em visão falaste ao teu santo, e disseste: Pus o socorro sobre um valente; exaltei a um escolhido dentre o povo."}
"PSA_89_20" {:texto "Achei a Davi, meu servo; eu o ungi com meu óleo santo."}
"PSA_89_21" {:texto "Com ele minha mão será firme; e também meu braço o fortalecerá."}
"PSA_89_22" {:texto "O inimigo não tomará suas riquezas, nem o filho da perversidade o afligirá."}
"PSA_89_23" {:texto "Porém eu espancarei seus adversários, e ferirei aos que o odeiam."}
"PSA_89_24" {:texto "E minha fidelidade e minha bondade serão com ele; e em meu nome seu poder será exaltado."}
"PSA_89_25" {:texto "Porei a mão dele no mar, e sua mão direita nos rios."}
"PSA_89_26" {:texto "Ele me chamará: Tu és meu Pai, meu Deus, e a rocha da minha salvação."}
"PSA_89_27" {:texto "Eu também o porei como primogênito, mais alto que todos os reis da terra."}
"PSA_89_28" {:texto "Manterei minha bondade para com ele para sempre, e meu pacto com ele será firme."}
"PSA_89_29" {:texto "Conservarei sua semente para sempre, e o trono dele como os dias dos céus."}
"PSA_89_30" {:texto "Se seus filhos deixarem minha Lei, e não andarem em meus juízos,"}
"PSA_89_31" {:texto "Se profanarem os meus estatutos, e não guardarem os meus mandamentos,"}
"PSA_89_32" {:texto "Então punirei a transgressão deles com vara, e a perversidade deles com açoite,"}
"PSA_89_33" {:texto "Porém nunca tirarei minha bondade dele, nem falharei em minha fidelidade."}
"PSA_89_34" {:texto "Não quebrarei o meu pacto, e o que saiu dos meus lábios não mudarei."}
"PSA_89_35" {:texto "Uma vez jurei por minha Santidade, [e] nunca mentirei a Davi."}
"PSA_89_36" {:texto "A semente dele durará para sempre, e o trono dele [será] como o sol perante mim."}
"PSA_89_37" {:texto "Assim como a lua, ele será confirmado para sempre; e a testemunha no céu é fiel. (Selá)"}
"PSA_89_38" {:texto "Porém tu te rebelaste, e [o] rejeitaste; ficaste irado contra o teu Ungido."}
"PSA_89_39" {:texto "Anulaste o pacto do teu servo; desonraste a coroa dele [lançando-a] contra a terra."}
"PSA_89_40" {:texto "Derrubaste todos os seus muros; quebraste suas fortificações."}
"PSA_89_41" {:texto "Todos os que passam pelo caminho o despojaram; ele foi humilhado por seus vizinhos."}
"PSA_89_42" {:texto "Levantaste a mão direita de seus adversários; alegraste a todos os inimigos dele."}
"PSA_89_43" {:texto "Também deixaste de afiar sua espada; e não o sustentaste na batalha."}
"PSA_89_44" {:texto "Fizeste cessar sua formosura; e derrubaste seu trono à terra."}
"PSA_89_45" {:texto "Encurtaste os dias de sua cidade; cobriste-o de vergonha. (Selá)"}
"PSA_89_46" {:texto "Até quando, SENHOR? Tu te esconderás para sempre? Arderá teu furor como o fogo?"}
"PSA_89_47" {:texto "Lembra-te de que curta é minha vida; por que criarias em vão todos os filhos dos homens?"}
"PSA_89_48" {:texto "Que homem vive, que não experimente a morte? Livrará ele a sua alma do poder do Xeol? (Selá)"}
"PSA_89_49" {:texto "Senhor, onde estão as tuas bondades do passado, que juraste a Davi por tua fidelidade?"}
"PSA_89_50" {:texto "Lembra-te, Senhor, da humilhação de teus servos, que eu trago em meu peito, [causada] por todos e grandes povos."}
"PSA_89_51" {:texto "Com [humilhação] os teus inimigos insultam, SENHOR, com a qual insultam os passos do teu ungido."}
"PSA_89_52" {:texto "Bendito [seja] o SENHOR para todo o sempre. Amém, e Amém."}
"PSA_90_1" {:texto "Oração de Moisés, homem de Deus:Senhor, tu tens sido nossa habitação, de geração em geração."}
"PSA_90_2" {:texto "Antes que os montes surgissem, e tu produzisses a terra e o mundo, desde à eternidade até a eternidade tu és Deus."}
"PSA_90_3" {:texto "Tu fazes o homem voltar ao pó, e dizes: Retornai-vos, filhos dos homens!"}
"PSA_90_4" {:texto "Porque mil anos aos teus olhos são como o dia de ontem, que passou, e como a vigília da noite."}
"PSA_90_5" {:texto "Tu os levas como correntes de águas; são como o sono; de madrugada são como a erva que brota:"}
"PSA_90_6" {:texto "De madrugada floresce, e brota; à tarde é cortada, e se seca."}
"PSA_90_7" {:texto "Porque perecemos com tua ira, e nos assombramos com teu furor."}
"PSA_90_8" {:texto "Tu pões nossas perversidades perante ti, nosso [pecado] oculto [perante] a luz do teu rosto."}
"PSA_90_9" {:texto "Porque todos os nossos dias se vão por causa de tua irritação; acabamos nossos anos como um suspiro."}
"PSA_90_10" {:texto "Os dias de nossa vida [chegam até] os setenta anos; e os que são mais fortes, até os oitenta anos; e o melhor deles é canseira e opressão, porque logo é cortado, e saímos voando."}
"PSA_90_11" {:texto "Quem conhece a força de tua ira? O teu furor é conforme o temor a ti."}
"PSA_90_12" {:texto "Ensina [-nos] a contar nossos dias de tal maneira que alcancemos um coração sábio."}
"PSA_90_13" {:texto "Retorna, SENHOR! Até quando? [Tem] compaixão para com teus servos."}
"PSA_90_14" {:texto "Farta-nos de manhã com tua bondade; e nos alegraremos e seremos cheios de alegria por todos os nossos dias."}
"PSA_90_15" {:texto "Alegra-nos conforme os dias [em que] tu nos afligiste, os anos [em que] vimos o mal."}
"PSA_90_16" {:texto "Que tua obra apareça aos teus servos, e tua glória sobre seus filhos."}
"PSA_90_17" {:texto "E que o agrado do SENHOR nosso Deus seja sobre nós; e confirma as obras de nossas mãos sobre nós; sim, a obra de nossas mãos, confirma!"}
"PSA_91_1" {:texto "Aquele que mora no esconderijo do Altíssimo, à sombra do Todo-Poderoso habitará."}
"PSA_91_2" {:texto "Direi ao SENHOR: [Tu és] meu refúgio e minha fortaleza; Deus meu, em quem confio."}
"PSA_91_3" {:texto "Porque ele te livrará do laço do caçador e da peste maligna."}
"PSA_91_4" {:texto "Com suas penas ele te cobrirá, e debaixo de suas asas estarás protegido; a verdade dele é escudo grande e protetor."}
"PSA_91_5" {:texto "Não terás medo do terror da noite, [nem] da flecha que voa de dia;"}
"PSA_91_6" {:texto "[Nem] da peste que anda às escuras, [nem] da mortandade que assola ao meio-dia."}
"PSA_91_7" {:texto "Cairão mil ao teu lado, e dez mil à tua direita, [mas] a ti nada alcançará."}
"PSA_91_8" {:texto "Somente verás com teus olhos, e observarás o pagamento dos perversos;"}
"PSA_91_9" {:texto "Porque tu fizeste como morada ao SENHOR: o meu refúgio, o Altíssimo."}
"PSA_91_10" {:texto "Mal nenhum te sucederá, nem praga alguma chegará à tua tenda;"}
"PSA_91_11" {:texto "Porque ele ordenou aos anjos quanto a ti, para que guardem todos os teus caminhos."}
"PSA_91_12" {:texto "Pelas mãos te levarão, para que não tropeces teu pé em alguma pedra."}
"PSA_91_13" {:texto "Tu pisarás sobre o leão e a cobra; passarás esmagando ao filho do leão e à serpente."}
"PSA_91_14" {:texto "Por ele ter me amado tanto, eu também o livrarei; em alto retiro eu o porei, porque ele conhece o meu nome."}
"PSA_91_15" {:texto "Ele me chamará, e eu o responderei; estarei com ele na angústia; [dela] eu o livrarei, e o honrarei."}
"PSA_91_16" {:texto "Eu o satisfarei com uma longa vida , e lhe mostrarei a minha salvação."}
"PSA_92_1" {:texto "Salmo e cântico para o dia do Sábado:Bom é louvar ao SENHOR, e cantar louvores ao teu nome, ó Altíssimo;"}
"PSA_92_2" {:texto "Para anunciar tua bondade pela manhã, e tua fidelidade durante as noites."}
"PSA_92_3" {:texto "Com o instrumento de dez cordas, com a lira, e com música de harpa."}
"PSA_92_4" {:texto "Porque tu, SENHOR, tens me alegrado com teus feitos; cantarei de alegria pelas obras de tuas mãos."}
"PSA_92_5" {:texto "Ó SENHOR, como são grandes tuas obras! Muito profundos são teus pensamentos!"}
"PSA_92_6" {:texto "O homem bruto não os conhece, nem o tolo entende isto."}
"PSA_92_7" {:texto "Quando os perversos crescem como a erva, e florescem todos os praticantes de maldade, [assim então] serão destruídos para sempre."}
"PSA_92_8" {:texto "Mas tu és Altíssimo para sempre, SENHOR."}
"PSA_92_9" {:texto "Porque eis que teus inimigos, SENHOR, porque eis que teus inimigos pereceram; serão dispersos todos os praticantes de maldade."}
"PSA_92_10" {:texto "Porém tu exaltaste o meu poder, como que um chifre de touro selvagem; eu fui ungido com óleo fresco."}
"PSA_92_11" {:texto "E meus olhos verão [o fim] dos meus inimigos; meus ouvidos ouvirão [o fim] dos malfeitores que se levantam contra mim."}
"PSA_92_12" {:texto "O justo florescerá como a palma; crescerá como o cedro do Líbano."}
"PSA_92_13" {:texto "Os [justos] estão plantados na casa do SENHOR, crescerão nos pátios do nosso Deus."}
"PSA_92_14" {:texto "[Até] na velhice ainda darão fruto; serão fortes e verdes;"}
"PSA_92_15" {:texto "Para anunciarem que o SENHOR é correto; ele é minha rocha, e não há perversidade nele."}
"PSA_93_1" {:texto "O SENHOR reina. Ele está vestido de majestade; o SENHOR está vestido de poder, [com o qual] se envolveu. O mundo está firmado, não se abalará."}
"PSA_93_2" {:texto "Teu trono está firme desde o passado; tu [és] desde a eternidade."}
"PSA_93_3" {:texto "SENHOR, os rios levantam; os rios levantam seus ruídos; os rios levantam suas ondas."}
"PSA_93_4" {:texto "[Porém] o SENHOR nas alturas é mais forte que os ruídos de muitas águas, [mais que] as fortes ondas do mar."}
"PSA_93_5" {:texto "Muito fiéis são teus testemunhos; a santidade embeleza tua casa, SENHOR, para sempre."}
"PSA_94_1" {:texto "Ó Deus das vinganças, SENHOR Deus das vinganças, mostra-te com teu brilho!"}
"PSA_94_2" {:texto "Exalta-te, ó Juiz da terra! Retribui com punição aos arrogantes."}
"PSA_94_3" {:texto "Até quando os perversos, SENHOR, até quando os perversos se alegrarão?"}
"PSA_94_4" {:texto "Eles falam [demais] , e dizem palavras soberbas; todos os que praticam a maldade se orgulham."}
"PSA_94_5" {:texto "Eles despedaçam ao teu povo, SENHOR, e humilham a tua herança."}
"PSA_94_6" {:texto "Eles matam a viúva e o estrangeiro, e tiram a vida dos órfãos."}
"PSA_94_7" {:texto "E dizem: O SENHOR não vê [isso] , e o Deus de Jacó não está prestando atenção."}
"PSA_94_8" {:texto "Entendei, ó tolos dentre o povo; e vós [que sois] loucos, quando sereis sábios?"}
"PSA_94_9" {:texto "Por acaso aquele que criou os ouvidos não ouviria? Aquele que formou os olhos não veria?"}
"PSA_94_10" {:texto "Aquele que disciplina as nações não castigaria? É ele o que ensina o conhecimento ao homem."}
"PSA_94_11" {:texto "O SENHOR conhece os pensamentos do homem, que são inúteis."}
"PSA_94_12" {:texto "Bem-aventurado é o homem a quem tu disciplinas, SENHOR, e em tua Lei o ensinas;"}
"PSA_94_13" {:texto "Para tu lhe dares descanso dos dias de aflição, até que seja cavada a cova para o perverso."}
"PSA_94_14" {:texto "Pois o SENHOR não abandonará o seu povo, nem desamparará a sua herança."}
"PSA_94_15" {:texto "Porque o juízo restaurará a justiça, e todos os corretos de coração o seguirão."}
"PSA_94_16" {:texto "Quem se levantará em meu favor contra os malfeitores? Quem se porá em meu favor contra os praticantes de perversidade?"}
"PSA_94_17" {:texto "Se o SENHOR não tivesse sido meu socorro, minha alma logo teria vindo a morar no silêncio [da morte] ."}
"PSA_94_18" {:texto "Quando eu dizia: Meu pé está escorregando;Tua bondade, ó SENHOR, me sustentava."}
"PSA_94_19" {:texto "Quando minhas preocupações se multiplicavam dentro de mim, teus consolos confortaram a minha alma."}
"PSA_94_20" {:texto "Por acaso teria comunhão contigo o trono da maldade, que faz leis opressivas?"}
"PSA_94_21" {:texto "Muitos se juntam contra a alma do justo, e condenam o sangue inocente."}
"PSA_94_22" {:texto "Mas o SENHOR é meu alto retiro, e meu Deus a rocha de meu refúgio."}
"PSA_94_23" {:texto "E ele fará voltar sobre eles suas próprias perversidades, e por suas maldades ele os destruirá; o SENHOR nosso Deus os destruirá."}
"PSA_95_1" {:texto "Vinde, cantemos alegres ao SENHOR; gritemos [de alegria] à rocha de nossa salvação."}
"PSA_95_2" {:texto "Cheguemos adiante de sua presença com agradecimentos; cantemos salmos a ele."}
"PSA_95_3" {:texto "Porque o Senhor é o grande Deus, e maior Rei do que todos os deuses."}
"PSA_95_4" {:texto "Na mão dele estão as profundezas da terra; e a ele pertencem os altos montes."}
"PSA_95_5" {:texto "Dele [também] é o mar, pois ele o fez; e suas mãos formaram a [terra] seca."}
"PSA_95_6" {:texto "Vinde, adoremos, e prostremo-nos; ajoelhemo-nos perante o SENHOR, que nos fez."}
"PSA_95_7" {:texto "Porque ele é o nosso Deus, e nós [somos] o povo do seu pasto, e as ovelhas de sua mão. Se hoje ouvirdes a voz dele,"}
"PSA_95_8" {:texto "Não endureçais vosso coração, como em Meribá, como no dia da tentação no deserto,"}
"PSA_95_9" {:texto "Onde vossos pais me tentaram; eles me provaram, mesmo já tendo visto minha obra."}
"PSA_95_10" {:texto "Por quarenta anos aguentei com desgosto d [esta] geração, e disse: Este povo se desvia em seus corações; e eles não conhecem meus caminhos."}
"PSA_95_11" {:texto "Por isso jurei em minha ira que eles não entrarão no meu [lugar] de descanso."}
"PSA_96_1" {:texto "Cantai ao SENHOR uma nova canção; cantai ao SENHOR toda a terra."}
"PSA_96_2" {:texto "Cantai ao SENHOR, bendizei ao seu nome; anunciai todos os dias sua salvação."}
"PSA_96_3" {:texto "Contai sua glória por entre as nações, [e] suas maravilhas por entre todos os povos."}
"PSA_96_4" {:texto "Porque o SENHOR é grande e muito digno de louvor; ele é mais temível que todos os deuses."}
"PSA_96_5" {:texto "Porque todos os deuses dos povos são ídolos, porém o SENHOR fez os céus;"}
"PSA_96_6" {:texto "Majestade e glória há diante dele; força e beleza [há] em seu santuário."}
"PSA_96_7" {:texto "Reconhecei ao SENHOR, ó famílias dos povos; reconhecei que ao SENHOR pertence a glória e a força."}
"PSA_96_8" {:texto "Reconhecei ao SENHOR a glória de seu nome; trazei ofertas, e entrai nos pátios dele."}
"PSA_96_9" {:texto "Adorai ao SENHOR na glória da santidade; temei perante sua presença toda a terra."}
"PSA_96_10" {:texto "Dizei entre as nações: O SENHOR reina; o mundo está firme, e não se abalará; ele julgará aos povos de forma correta."}
"PSA_96_11" {:texto "Alegrem-se os céus, e enchei de alegria a terra; faça barulho o mar e sua plenitude."}
"PSA_96_12" {:texto "Saltem contentes o campo e tudo que nele há, e que todas as árvores dos bosque cantem de alegria,"}
"PSA_96_13" {:texto "Diante do SENHOR; porque ele vem; porque ele vem para julgar a terra. Ele julgará ao mundo com justiça, e aos povos com sua verdade."}
"PSA_97_1" {:texto "O SENHOR reina; que a terra se encha de alegria; alegrem-se as muitas ilhas."}
"PSA_97_2" {:texto "Nuvens e escuridão há ao redor dele; justiça e juízo são a base de seu trono."}
"PSA_97_3" {:texto "Fogo vai adiante dele, que inflama seus adversários ao redor."}
"PSA_97_4" {:texto "Seus relâmpagos iluminam o mundo; a terra os vê, e treme."}
"PSA_97_5" {:texto "Os montes se derretem como cera na presença do SENHOR, na presença do Senhor de toda a terra."}
"PSA_97_6" {:texto "Os céus anunciam sua justiça, e todos os povos veem sua glória."}
"PSA_97_7" {:texto "Sejam envergonhados todos os que servem a imagens, e os que se orgulham de ídolos; prostrai-vos diante dele todos os deuses."}
"PSA_97_8" {:texto "Sião ouviu, e se alegrou; e as filhas de Judá tiveram muita alegria, por causa de teus juízos, SENHOR;"}
"PSA_97_9" {:texto "Pois tu, SENHOR, és o Altíssimo sobre toda a terra; tu és muito mais elevado que todos os deuses."}
"PSA_97_10" {:texto "Vós que amais ao SENHOR: odiai o mal; ele guarda a alma de seus santos, [e] os resgata da mão dos perversos."}
"PSA_97_11" {:texto "A luz é semeada para o justo, e a alegria para os corretos de coração."}
"PSA_97_12" {:texto "Vós justos, alegrai-vos no SENHOR; e agradecei em memória de sua santidade."}
"PSA_98_1" {:texto "Salmo:Cantai ao SENHOR uma canção nova, porque ele fez maravilhas; sua mão direita e seu santo braço lhe fez ter a salvação."}
"PSA_98_2" {:texto "O SENHOR fez ser conhecida sua salvação; perante os olhos das nações ele mostrou sua justiça."}
"PSA_98_3" {:texto "Ele se lembrou de sua bondade e de sua fidelidade para com a casa de Israel; todos os confins da terra viram a salvação de nosso Deus."}
"PSA_98_4" {:texto "Gritai de alegria ao SENHOR, toda a terra; clamai, cantai alegres, e tocai salmos."}
"PSA_98_5" {:texto "Tocai ao SENHOR com harpa; com harpa, e com a voz da música;"}
"PSA_98_6" {:texto "Com trombetas, e som de cornetas, clamai alegremente diante do Rei SENHOR."}
"PSA_98_7" {:texto "Faça barulho o mar com sua plenitude; o mundo com os que nele habitam."}
"PSA_98_8" {:texto "Que os rios batam palmas, que as montanhas juntamente se alegrem,"}
"PSA_98_9" {:texto "Diante do SENHOR, porque ele vem para julgar a terra; ele julgará ao mundo com justiça, e aos povos de forma correta."}
"PSA_99_1" {:texto "O SENHOR reina, tremam as nações; [ele é] o que se senta [entre] os querubins, mova-se a terra."}
"PSA_99_2" {:texto "O SENHOR é grande em Sião; ele é mais elevado que todos os povos."}
"PSA_99_3" {:texto "Louvem o teu grande e temível nome, [porque] ele é santo;"}
"PSA_99_4" {:texto "Assim como também a fortaleza do Rei, que ama o juízo; tu firmaste as coisas corretas; tu fizeste juízo e justiça em Jacó."}
"PSA_99_5" {:texto "Exaltai ao SENHOR nosso Deus, e prostrai-vos perante o suporte dos seus pés, [porque] ele é santo."}
"PSA_99_6" {:texto "Moisés e Arão estavam entre seus sacerdotes, e Samuel entre os que chamavam o seu nome; eles clamavam ao SENHOR, e ele os respondia."}
"PSA_99_7" {:texto "Na coluna da nuvem ele lhes falava; eles guardavam seus testemunhos e os estatutos que ele tinha lhes dado."}
"PSA_99_8" {:texto "Ó SENHOR nosso Deus, tu os respondia; tu lhes foste Deus perdoador, ainda que vingasse as coisas que eles praticavam."}
"PSA_99_9" {:texto "Exaltai ao SENHOR nosso Deus, e prostrai-vos perante seu santo monte; pois santo é o SENHOR nosso Deus."}
"PSA_100_1" {:texto "Salmo de louvor:Gritai de alegria ao SENHOR toda a terra!"}
"PSA_100_2" {:texto "Servi ao SENHOR com alegria; vinde com alegre canto perante sua presença."}
"PSA_100_3" {:texto "Sabei que o SENHOR é Deus; foi ele, e não nós, que nos fez seu povo, e ovelhas de seu pasto."}
"PSA_100_4" {:texto "Entrai pelas portas dele com agradecimento, por seus pátios com canto de louvor; agradecei a ele, [e] bendizei o seu nome."}
"PSA_100_5" {:texto "Porque o SENHOR é bom, sua bondade [dura] para sempre; e a fidelidade dele [continua] de geração após geração."}
"PSA_101_1" {:texto "Salmo de Davi:Cantarei sobre a bondade e o juízo; a ti, SENHOR, tocarei melodia."}
"PSA_101_2" {:texto "No caminho correto eu meditarei; [mas] quando virás a mim? Em sinceridade de meu coração andarei dentro de minha casa."}
"PSA_101_3" {:texto "Não porei perante meus olhos obra maligna; odeio as ações dos que desviam, [tais coisas] não me tomarão."}
"PSA_101_4" {:texto "O coração perverso se afastará de mim; não conhecerei ao mau."}
"PSA_101_5" {:texto "Destruirei ao que fala mal de seu próximo as escondidas, e não tolerarei ao que tem olhos cobiçosos e coração arrogante."}
"PSA_101_6" {:texto "Meus olhos [estarão] sobre os fiéis da terra, para que se sentem comigo; aquele que anda no caminho correto, esse me servirá."}
"PSA_101_7" {:texto "Aquele que usa de engano não habitará em minha casa; aquele que fala mentiras não conseguirá ficar firme perante meus olhos."}
"PSA_101_8" {:texto "Pelas madrugadas destruirei a todos os perversos da terra, para tirar da cidade do SENHOR todos os que praticam maldade."}
"PSA_102_1" {:texto "Oração do aflito, quando ele se viu desfalecido, e derramou sua súplica diante do SENHOR:Ó SENHOR, ouve minha oração; e que meu clamor chegue a ti."}
"PSA_102_2" {:texto "Não escondas de mim o teu rosto no dia da minha angústia; inclina a mim teu ouvidos; no dia em que eu clamar, apressa-te para me responder."}
"PSA_102_3" {:texto "Porque os meus dias têm se desfeito como fumaça; e meus ossos se têm se queimado como [n] um forno."}
"PSA_102_4" {:texto "Meu coração, tal como a erva, está tão ferido e seco, que me esqueci de comer meu pão."}
"PSA_102_5" {:texto "Por causa da voz do meu gemido, meus ossos têm se grudado à minha carne."}
"PSA_102_6" {:texto "Estou semelhante a uma ave no deserto, estou como uma coruja num lugar desabitado."}
"PSA_102_7" {:texto "Fico alerta e estou como um pardal solitário sobre o telhado."}
"PSA_102_8" {:texto "Os meus inimigos me insultam o dia todo; os que me odeiam juram [maldições] contra mim."}
"PSA_102_9" {:texto "Porque estou comendo cinza como [se fosse] pão, e misturo minha bebida com lágrimas,"}
"PSA_102_10" {:texto "Por causa de tua irritação e tua ira; porque tu me levantaste e me derrubaste."}
"PSA_102_11" {:texto "Meus dias [têm sido] como a sombra, que declina; e eu estou secando como a erva."}
"PSA_102_12" {:texto "Porém tu, SENHOR, permaneces para sempre; e tua lembrança [continua] geração após geração."}
"PSA_102_13" {:texto "Tu te levantarás, e terás piedade de Sião; porque chegou o tempo determinado para se apiedar dela."}
"PSA_102_14" {:texto "Pois os teus servos se agradam de suas pedras, e sentem compaixão do pó de suas [ruínas] ."}
"PSA_102_15" {:texto "Então as nações temerão o nome do SENHOR; e todos os reis da terra [temerão] a tua glória;"}
"PSA_102_16" {:texto "Quando o SENHOR edificar a Sião, [e] aparecer em sua glória;"}
"PSA_102_17" {:texto "E der atenção à oração do desamparado, e não desprezar sua oração."}
"PSA_102_18" {:texto "Isto será escrito para a geração futura; e o povo que for criado louvará ao SENHOR;"}
"PSA_102_19" {:texto "Porque ele olhará desde o alto de seu santuário; o SENHOR olhará desde os céus para a terra,"}
"PSA_102_20" {:texto "Para ouvir o gemido dos prisioneiros; para soltar aos sentenciados à morte."}
"PSA_102_21" {:texto "Para eles anunciarem o nome do SENHOR em Sião, e seu louvor em Jerusalém."}
"PSA_102_22" {:texto "Quando os povos se reunirem, e os reinos, para servirem ao SENHOR."}
"PSA_102_23" {:texto "Ele abateu minha força no caminho; abreviou os meus dias."}
"PSA_102_24" {:texto "Eu dizia: Meu Deus, não me leves no meio dos meus dias; teus anos são [eternos] ,geração após geração."}
"PSA_102_25" {:texto "Desde muito antes fundaste a terra; e os céus são obra de tuas mãos."}
"PSA_102_26" {:texto "Eles se destruirão, porém tu permanecerás; e todos eles como vestimentas se envelhecerão; como roupas tu os mudarás, e serão mudados."}
"PSA_102_27" {:texto "Porém tu és o mesmo; e teus anos nunca se acabarão."}
"PSA_102_28" {:texto "Os filhos de teus servos habitarão [seguros] ,e a semente deles será firmada perante ti."}
"PSA_103_1" {:texto "Salmo de Davi:Louva ao SENHOR, ó minha alma; e que todo o meu interior [louve] ao seu santo nome."}
"PSA_103_2" {:texto "Louva ao SENHOR, ó minha alma; e não te esqueças de nenhum dos benefícios dele;"}
"PSA_103_3" {:texto "Que perdoa todas as tuas perversidades, e te sara de todas as tuas enfermidades."}
"PSA_103_4" {:texto "Que resgata tua vida da perdição; que te coroa com bondade e misericórdia."}
"PSA_103_5" {:texto "Que farta tua boca de coisas boas, e tua juventude é renovada como a águia."}
"PSA_103_6" {:texto "O SENHOR faz justiça e juízos a todos os oprimidos."}
"PSA_103_7" {:texto "Ele fez Moisés conhecer seus caminhos, e os filhos de Israel [conhecerem] as obras dele."}
"PSA_103_8" {:texto "Misericordioso e piedoso é o SENHOR, que demora para se irar, e é grande em bondade."}
"PSA_103_9" {:texto "Ele não reclamará perpetuamente, nem manterá [sua ira] para sempre."}
"PSA_103_10" {:texto "Ele não nos trata conforme nossos pecados, nem nos retribui conforme nossas perversidades."}
"PSA_103_11" {:texto "Porque, assim como os céus estão bem mais elevados que a terra, assim também prevalece a bondade dele sobre aqueles que o temem."}
"PSA_103_12" {:texto "Assim como o oriente está longe do ocidente, assim também ele tira para longe de nós nossas transgressões."}
"PSA_103_13" {:texto "Assim como um pai se compadece dos filhos, assim também o SENHOR se compadece daqueles que o temem."}
"PSA_103_14" {:texto "Porque ele sabe como fomos formados; ele se lembra de que somos pó."}
"PSA_103_15" {:texto "Os dias do homem são como a erva, como a flor do campo, assim ele floresce."}
"PSA_103_16" {:texto "Mas quando o vento passa por ele, logo perece; e seu lugar deixa de ser conhecido."}
"PSA_103_17" {:texto "Porém a bondade do SENHOR [continua] de eternidade em eternidade sobre os que o temem; e a justiça dele [está] sobre os filhos de [seus] filhos."}
"PSA_103_18" {:texto "Sobre os que guardam o seu pacto dele, e sobre os que se lembram de dos mandamentos dele, para os praticarem."}
"PSA_103_19" {:texto "O SENHOR firmou o seu trono nos céus, e seu reino domina sobre tudo."}
"PSA_103_20" {:texto "Bendizei ao SENHOR, ó anjos dele; vós, fortes valentes, que guardais sua palavra, ao ouvirem a voz de sua palavra."}
"PSA_103_21" {:texto "Bendizei ao SENHOR todos os seus exércitos; vós que servis a ele, que fazeis o que lhe agrada."}
"PSA_103_22" {:texto "Bendizei ao SENHOR todas as suas obras, em todos os lugares de seu domínio; louva, minha alma, ao SENHOR!"}
"PSA_104_1" {:texto "Louva, minha alma, ao SENHOR; ó SENHOR meu Deus, tu és grandioso; de majestade e de glória estás vestido."}
"PSA_104_2" {:texto "Tu estás coberto de luz, como que uma roupa; estendes os céus como cortinas."}
"PSA_104_3" {:texto "Ele, que fixou seus cômodos sobre as águas; que faz das nuvens sua carruagem; que se move sobre as asas do vento."}
"PSA_104_4" {:texto "Que faz de seus anjos ventos, e de seus servos fogo flamejante."}
"PSA_104_5" {:texto "Ele fundou a terra sobre suas bases; ela jamais se abalará."}
"PSA_104_6" {:texto "Com o abismo, como um vestido, tu a cobriste; sobre os montes estavam as águas."}
"PSA_104_7" {:texto "Elas fugiram de tua repreensão; pela voz de teu trovão elas se recolheram apressadamente."}
"PSA_104_8" {:texto "Os montes subiram [e] os vales desceram ao lugar que tu lhes tinha fundado."}
"PSA_104_9" {:texto "Tu [lhes] puseste um limite, que não ultrapassarão; não voltarão mais a cobrir a terra."}
"PSA_104_10" {:texto "Ele envia fontes aos vales, para que corram por entre os montes."}
"PSA_104_11" {:texto "Elas dão de beber a todos os animais do campo; os asnos selvagens matam a sede [com elas] ."}
"PSA_104_12" {:texto "Junto a elas habitam as aves dos céus, que dão [sua] voz dentre os ramos."}
"PSA_104_13" {:texto "Ele rega os montes desde seus cômodos; a terra se farta do fruto de tuas obras."}
"PSA_104_14" {:texto "Ele faz brotar a erva para os animais, e as plantas para o trabalho do homem, fazendo da terra produzir o pão,"}
"PSA_104_15" {:texto "E o vinho, que alegra o coração do homem, [e] faz o rosto brilhar o rosto com o azeite; com o pão, que fortalece o coração do homem."}
"PSA_104_16" {:texto "As árvores do SENHOR são fartamente [nutridas] ,os cedros do Líbano, que ele plantou."}
"PSA_104_17" {:texto "Onde as aves fazem ninhos, e os pinheiros são as casas para as cegonhas."}
"PSA_104_18" {:texto "Os altos montes são para as cabras selvagens; as rochas, refúgio para os coelhos."}
"PSA_104_19" {:texto "Ele fez a lua para [marcar] os tempos, e o sol sobre seu poente."}
"PSA_104_20" {:texto "Ele dá ordens à escuridão, e faz haver noite, quando saem todos os animais do mato."}
"PSA_104_21" {:texto "Os filhos dos leões, rugindo pela presa, e para buscar de Deus sua comida."}
"PSA_104_22" {:texto "Quando o sol volta a brilhar, [logo] se recolhem, e vão se deitar em suas tocas."}
"PSA_104_23" {:texto "Então o homem sai para seu trabalho e sua obra até o entardecer."}
"PSA_104_24" {:texto "Como são muitas as suas obras, SENHOR! Tu fizeste todas com sabedoria; a terra está cheia de teus bens."}
"PSA_104_25" {:texto "Este grande e vasto mar, nele há inúmeros seres, animais pequenos e grandes."}
"PSA_104_26" {:texto "Por ali andam os navios e o Leviatã que formastes, para que te alegrasses nele."}
"PSA_104_27" {:texto "Todos eles aguardam por ti, que [lhes] dês seu alimento a seu tempo [devido] ."}
"PSA_104_28" {:texto "O que tu dás, eles recolhem; tu abres tua mão, [e] eles se fartam de coisas boas."}
"PSA_104_29" {:texto "[Quando] tu escondes teu rosto, eles ficam perturbados; [quando] tu tiras o fôlego deles, [logo] eles morrem, e voltam ao seu pó."}
"PSA_104_30" {:texto "Tu envias o teu fôlego, e logo são criados; e [assim] tu renovas a face da terra."}
"PSA_104_31" {:texto "A glória do SENHOR será para sempre; alegre-se o SENHOR em suas obras."}
"PSA_104_32" {:texto "[Quando] ele olha para a terra, [logo] ela treme; [quando] ele toca nos montes, eles soltam fumaça."}
"PSA_104_33" {:texto "Cantarei ao SENHOR em [toda] a minha vida; tocarei música ao meu Deus enquanto eu existir."}
"PSA_104_34" {:texto "Meus pensamentos lhe serão agradáveis; eu me alegrarei no SENHOR."}
"PSA_104_35" {:texto "Os pecadores serão consumidos da terra, e os maus não existirão mais. Bendizei, ó minha alma, ao SENHOR! Aleluia!"}
"PSA_105_1" {:texto "Agradecei ao SENHOR, chamai o seu nome; anunciai suas obras entre os povos."}
"PSA_105_2" {:texto "Cantai a ele, tocai músicas para ele; falai de todas as suas maravilhas."}
"PSA_105_3" {:texto "Tende orgulho de seu santo nome; alegre-se o coração dos que buscam ao SENHOR."}
"PSA_105_4" {:texto "Buscai ao SENHOR e à sua força; buscai a presença dele continuamente."}
"PSA_105_5" {:texto "Lembrai-vos de suas maravilhas, que ele fez; de seus milagres, e dos juízos de sua boca."}
"PSA_105_6" {:texto "Vós, [que sois da] semente de seu servo Abraão; vós, filhos de Jacó, seus escolhidos."}
"PSA_105_7" {:texto "Ele é o SENHOR, nosso Deus; seus juízos [estão] em toda a terra."}
"PSA_105_8" {:texto "Ele se lembra para sempre de seu pacto, da palavra que ele mandou até mil gerações;"}
"PSA_105_9" {:texto "O qual ele firmou com Abraão, e de seu juramento a Isaque."}
"PSA_105_10" {:texto "O qual também confirmou a Jacó como estatuto, a Israel como pacto eterno."}
"PSA_105_11" {:texto "Dizendo: A ti darei a terra de Canaã, a porção de vossa herança."}
"PSA_105_12" {:texto "Sendo eles poucos em número; [eram] poucos, e estrangeiros nela."}
"PSA_105_13" {:texto "E andaram de nação em nação, de um reino a outro povo."}
"PSA_105_14" {:texto "Ele não permitiu a ninguém que os oprimisse; e por causa deles repreendeu a reis,"}
"PSA_105_15" {:texto "[Dizendo] : Não toqueis nos meus ungidos, e não façais mal a meus profetas."}
"PSA_105_16" {:texto "E chamou a fome sobre a terra; ele interrompeu toda fonte de alimento;"}
"PSA_105_17" {:texto "Enviou um homem adiante deles: José, [que] foi vendido como escravo."}
"PSA_105_18" {:texto "Amarraram seus pés em correntes; ele foi preso com ferros;"}
"PSA_105_19" {:texto "Até o tempo que sua mensagem chegou, a palavra do SENHOR provou o valor que ele tinha."}
"PSA_105_20" {:texto "O rei mandou que ele fosse solto; o governante de povos o libertou."}
"PSA_105_21" {:texto "Ele o pôs como senhor de sua casa, e por chefe de todos os seus bens,"}
"PSA_105_22" {:texto "Para dar ordens a suas autoridades, e instruir a seus anciãos."}
"PSA_105_23" {:texto "Então Israel entrou no Egito; Jacó peregrinou na terra de Cam."}
"PSA_105_24" {:texto "E fez seu povo crescer muito, e o fez mais poderoso que seus adversários."}
"PSA_105_25" {:texto "E mudou o coração [dos outros] ,para que odiassem ao seu povo, para que tratassem mal a seus servos."}
"PSA_105_26" {:texto "[Então] enviou seu servo Moisés, e a Arão, a quem tinha escolhido;"}
"PSA_105_27" {:texto "[Que] fizeram entre eles os sinais anunciados, e coisas sobrenaturais na terra de Cam."}
"PSA_105_28" {:texto "Ele mandou trevas, e fez escurecer; e não foram rebeldes a sua palavra."}
"PSA_105_29" {:texto "Ele transformou suas águas em sangue, e matou a seus peixes."}
"PSA_105_30" {:texto "A terra deles produziu rãs em abundância, [até] nos quartos de seus reis."}
"PSA_105_31" {:texto "Ele falou, e vieram vários bichos [e] piolhos em todos os seus limites."}
"PSA_105_32" {:texto "Tornou suas chuvas em saraiva; [pôs] fogo ardente em sua terra."}
"PSA_105_33" {:texto "E feriu suas vinhas e seus figueirais; e quebrou as árvores de seus territórios."}
"PSA_105_34" {:texto "Ele falou, e vieram gafanhotos, e incontáveis pulgões;"}
"PSA_105_35" {:texto "E comeram toda a erva de sua terra; e devoraram o fruto de seus campos."}
"PSA_105_36" {:texto "Também feriu a todos os primogênitos em sua terra; os primeiros de todas as suas forças."}
"PSA_105_37" {:texto "E os tirou [dali] com prata e ouro; e dentre suas tribos não houve quem tropeçasse."}
"PSA_105_38" {:texto "[Até] o Egito se alegrou com a saída deles, porque seu temor tinha caído sobre eles."}
"PSA_105_39" {:texto "Ele estendeu uma nuvem como cobertor, e um fogo para iluminar a noite."}
"PSA_105_40" {:texto "Eles pediram, e fez vir codornizes; e os fartou com pão do céu."}
"PSA_105_41" {:texto "Ele abriu uma rocha, e dela saíram águas; [e] correram [como] um rio pelos lugares secos;"}
"PSA_105_42" {:texto "Porque se lembrou de sua santa palavra, e de seu servo Abraão."}
"PSA_105_43" {:texto "Então ele tirou [dali] a seu povo com alegria; e seus eleitos com celebração."}
"PSA_105_44" {:texto "E lhes deu as terras das nações; e do trabalho das nações tomaram posse;"}
"PSA_105_45" {:texto "Para que guardassem seus estatutos, e obedecessem a leis dele. Aleluia!"}
"PSA_106_1" {:texto "Aleluia! Agradecei ao SENHOR, porque ele é bom, porque sua bondade [dura] para sempre."}
"PSA_106_2" {:texto "Quem falará das proezas do SENHOR? [Quem] dirá louvores a ele?"}
"PSA_106_3" {:texto "Bem-aventurados [são] os que guardam o juízo; [e] aquele que pratica justiça em todo tempo."}
"PSA_106_4" {:texto "Lembra-te de mim, SENHOR, conforme [tua] boa vontade [para com] teu povo; concede-me tua salvação."}
"PSA_106_5" {:texto "Para eu ver o bem de teus escolhidos; para eu me alegrar com a alegria de teu povo; para eu ter orgulho de tua herança."}
"PSA_106_6" {:texto "Pecamos com nossos pais, fizemos o mal, agimos perversamente."}
"PSA_106_7" {:texto "Nossos pais no Egito não deram atenção a tuas maravilhas, nem se lembraram da abundância de tuas bondades; mas ao invés disso se rebelaram junto ao mar, perto do mar Vermelho."}
"PSA_106_8" {:texto "Apesar disso ele os livrou por causa de seu nome, para que seu poder fosse conhecido."}
"PSA_106_9" {:texto "E repreendeu ao mar Vermelho, e [este] se secou; e os fez caminharem pelas profundezas [do mar] ,como que pelo deserto."}
"PSA_106_10" {:texto "E os livrou das mãos daquele que os odiava, e os resgatou das mãos do inimigo."}
"PSA_106_11" {:texto "E as águas cobriram seus adversários; não sobrou nem um sequer deles."}
"PSA_106_12" {:texto "Então creram nas palavras dele, e cantaram louvores a ele."}
"PSA_106_13" {:texto "[Porém] logo se esqueceram das obras dele, e não esperaram pelo seu conselho."}
"PSA_106_14" {:texto "Mas foram levados pelo mau desejo no deserto, e tentaram a Deus no lugar desabitado."}
"PSA_106_15" {:texto "Então ele lhes concedeu o que pediam, porém enviou magreza a suas almas."}
"PSA_106_16" {:texto "E tiveram inveja de Moisés no acampamento; [e] de Arão, o santo do SENHOR."}
"PSA_106_17" {:texto "A terra se abriu, e engoliu a Datã; e encobriu ao grupo de Abirão."}
"PSA_106_18" {:texto "E o fogo consumiu o seu grupo; a chama queimou os perversos."}
"PSA_106_19" {:texto "Fizeram um bezerro em Horebe; e se inclinaram perante uma imagem de fundição."}
"PSA_106_20" {:texto "E mudaram sua glória na figura de um boi, que come erva."}
"PSA_106_21" {:texto "Esqueceram-se de Deus, o salvador deles, que tinha feito coisas grandiosas no Egito,"}
"PSA_106_22" {:texto "Maravilhas na terra de Cam, coisas temíveis no mar Vermelho."}
"PSA_106_23" {:texto "Por isso ele disse que teria os destruído, se Moisés, seu escolhido, não tivesse se posto na fenda diante dele, para desviar sua ira, para não os destruir."}
"PSA_106_24" {:texto "Eles também desprezaram a terra desejável, [e] não creram na palavra dele."}
"PSA_106_25" {:texto "E ao invés disso murmuraram em suas tendas, [e] não deram ouvidos à voz do SENHOR."}
"PSA_106_26" {:texto "Por isso ele levantou sua mão contra eles, [jurando] que os derrubaria no deserto;"}
"PSA_106_27" {:texto "E que derrubaria sua semente entre as nações; e os dispersaria pelas terras."}
"PSA_106_28" {:texto "Eles também passaram a adorar Baal-Peor, e a comer sacrifícios dos mortos."}
"PSA_106_29" {:texto "E o provocaram à ira com as obras deles; e [por isso] surgiu a praga entre eles."}
"PSA_106_30" {:texto "Então se levantou Fineias, e interveio, e cessou aquela praga."}
"PSA_106_31" {:texto "E isto lhe foi reconhecido como justiça, de geração em geração, para todo o sempre."}
"PSA_106_32" {:texto "Também o irritaram muito junto às águas de Meribá; e houve mal a Moisés por causa deles;"}
"PSA_106_33" {:texto "Porque provocaram o seu espírito, de modo que ele falou imprudentemente com seus lábios."}
"PSA_106_34" {:texto "Eles não destruíram os povos que o SENHOR tinha lhes mandado;"}
"PSA_106_35" {:texto "Mas ao invés disso, se misturaram com as nações, e aprenderam as obras delas;"}
"PSA_106_36" {:texto "E serviram a seus ídolos; e vieram a lhes ser por laço de armadilha."}
"PSA_106_37" {:texto "Além disso, sacrificaram seus filhos e suas filhas a demônios,"}
"PSA_106_38" {:texto "E derramaram sangue inocente, o sangue de seus filhos e de suas filhas, os quais eles sacrificaram aos ídolos de Canaã; e a terra foi profanada com [este] sangue."}
"PSA_106_39" {:texto "E contaminaram-se com suas obras; e se prostituíram com suas ações."}
"PSA_106_40" {:texto "Por isso a ira do SENHOR se acendeu contra seu povo; e ele odiou sua propriedade."}
"PSA_106_41" {:texto "E os entregou nas mãos das nações estrangeiras, e aqueles que os odiavam passaram a dominá-los."}
"PSA_106_42" {:texto "E seus inimigos os oprimiram, e foram humilhados sob as mãos deles."}
"PSA_106_43" {:texto "Muitas vezes ele os livrou; mas eles [voltavam a] irritá-lo com seus pensamentos, e foram abatidos pela sua perversidade."}
"PSA_106_44" {:texto "Apesar disso, ele observou a angústia deles, e ouviu quando eles clamaram."}
"PSA_106_45" {:texto "E ele se lembrou de seu pacto em [favor] deles, e sentiu pena conforme suas muitas bondades."}
"PSA_106_46" {:texto "E fez com que todos os que os mantinham em cativeiro tivessem misericórdia deles."}
"PSA_106_47" {:texto "Salva-nos, SENHOR nosso Deus, e ajunta-nos dentre as nações, para darmos graças ao teu santo nome, e termos orgulho em louvar a ti."}
"PSA_106_48" {:texto "Bendito [seja] o SENHOR, Deus de Israel, desde sempre e para sempre! E todo o povo diga Amém! Aleluia!"}
"PSA_107_1" {:texto "Agradecei ao SENHOR, porque ele é bom; porque sua bondade [dura] para sempre."}
"PSA_107_2" {:texto "Digam [isso] os resgatados pelo SENHOR, os quais ele resgatou das mão do adversário."}
"PSA_107_3" {:texto "E os que ele ajuntou de todas as terras, do oriente e do ocidente, do norte e do sul."}
"PSA_107_4" {:texto "Os que andaram sem rumo no deserto, por caminhos solitários; os que não acharam cidade para morarem."}
"PSA_107_5" {:texto "Famintos e sedentos, suas almas neles desfaleciam."}
"PSA_107_6" {:texto "Mas eles clamaram ao SENHOR em suas angústias, e ele os livrou de suas aflições."}
"PSA_107_7" {:texto "E os levou ao caminho correto, para irem a uma cidade de moradia."}
"PSA_107_8" {:texto "Agradeçam ao SENHOR por sua bondade, e suas maravilhas perante os filhos dos homens."}
"PSA_107_9" {:texto "Porque ele fartou a alma sedenta, e encheu de bem a alma faminta;"}
"PSA_107_10" {:texto "Os que estavam sentados em trevas e sombra de morte, presos com aflição e ferro,"}
"PSA_107_11" {:texto "Porque se rebelaram contra os mandamentos de Deus, e rejeitaram o conselho do Altíssimo."}
"PSA_107_12" {:texto "Por isso ele abateu seus corações com trabalhos cansativos; eles tropeçaram, e não houve quem os socorresse."}
"PSA_107_13" {:texto "Porém eles clamaram ao SENHOR em suas angústias, e ele os livrou de suas aflições."}
"PSA_107_14" {:texto "Ele os tirou das trevas e da sombra da morte, e quebrou suas correntes de prisão."}
"PSA_107_15" {:texto "Agradeçam ao SENHOR pela sua bondade, e suas maravilhas perante os filhos dos homens."}
"PSA_107_16" {:texto "Porque ele quebrou as portas de bronze, e despedaçou os ferrolhos de ferro."}
"PSA_107_17" {:texto "Os tolos foram afligidos por causa de seu caminho de transgressões e por suas perversidades."}
"PSA_107_18" {:texto "A alma deles perdeu o interesse por todo tipo de comida, e chegaram até às portas da morte."}
"PSA_107_19" {:texto "Porém eles clamaram ao SENHOR em suas angústias, e ele os livrou de suas aflições."}
"PSA_107_20" {:texto "Ele enviou sua palavra, e os sarou; e ele os livrou de suas covas."}
"PSA_107_21" {:texto "Agradeçam ao SENHOR por sua bondade, e suas maravilhas perante os filhos dos homens."}
"PSA_107_22" {:texto "E sacrifiquem sacrifícios de gratidão; e anunciai as obras dele com alegria."}
"PSA_107_23" {:texto "Os que descem ao mar em navios, trabalhando em muitas águas,"}
"PSA_107_24" {:texto "Esses veem as obras do SENHOR, e suas maravilhas nas profundezas."}
"PSA_107_25" {:texto "[Porque] quando ele fala, ele faz levantar tormentas de vento, que levanta suas ondas."}
"PSA_107_26" {:texto "Elas sobem aos céus, [e] descem aos abismos; a alma deles se derrete de angústia."}
"PSA_107_27" {:texto "Eles cambaleiam e vacilam como bêbados, e toda a sabedoria deles se acaba."}
"PSA_107_28" {:texto "Então eles clamaram ao SENHOR em suas angústias, e ele os tirou de suas aflições."}
"PSA_107_29" {:texto "Ele fez cessar as tormentas, e as ondas se calaram."}
"PSA_107_30" {:texto "Então se alegraram, porque houve calmaria; e ele os levou ao porto que queriam [chegar] ."}
"PSA_107_31" {:texto "Agradeçam ao SENHOR por sua bondade, e suas maravilhas perante os filhos dos homens;"}
"PSA_107_32" {:texto "E exaltem a ele na assembleia do povo, e o glorifiquem na reunião dos anciãos."}
"PSA_107_33" {:texto "Ele torna os rios em deserto, e as saídas de águas em terra seca."}
"PSA_107_34" {:texto "A terra frutífera em salgada, pela maldade dos que nela habitam."}
"PSA_107_35" {:texto "Ele torna o deserto em lagoa, e a terra seca em nascentes de águas."}
"PSA_107_36" {:texto "E faz aos famintos habitarem ali; e eles edificam uma cidade para morarem;"}
"PSA_107_37" {:texto "E semeiam campos, e plantam vinhas, que produzem fruto valioso."}
"PSA_107_38" {:texto "E ele os abençoa, e se multiplicam muito, e o gado dele não diminui."}
"PSA_107_39" {:texto "Mas [quando] eles se diminuem e se abatem, por causa da opressão, mal e aflição;"}
"PSA_107_40" {:texto "Ele derrama desprezo sobre os governantes, e os faz andar sem rumo pelos desertos, sem [terem] caminho."}
"PSA_107_41" {:texto "Mas ao necessitado, ele levanta da opressão a um alto retiro, e faz famílias como a rebanhos."}
"PSA_107_42" {:texto "Os corretos, ao verem, ficam alegres, e todo perverso se calará."}
"PSA_107_43" {:texto "Quem é sábio, que preste atenção a estas coisas, e reflita nas bondades do SENHOR."}
"PSA_108_1" {:texto "Cântico e Salmo de Davi:Preparado está meu coração, ó Deus; cantarei e tocarei música [com] minha glória."}
"PSA_108_2" {:texto "Desperta-te, lira e harpa; eu despertarei ao amanhecer."}
"PSA_108_3" {:texto "Louvarei a ti entre os povos, SENHOR, e tocarei música a ti entre as nações;"}
"PSA_108_4" {:texto "Porque tua bondade é maior que os céus, e tua fidelidade mais alta que as nuvens."}
"PSA_108_5" {:texto "Exalta-te sobre os céus, ó Deus; e tua glória sobre toda a terra;"}
"PSA_108_6" {:texto "Para que teus amados sejam libertados; salva [-nos] com tua mão direita, e responde-me."}
"PSA_108_7" {:texto "Deus falou em seu santuário: Eu me alegrarei; repartirei a Siquém, e medirei ao vale de Sucote."}
"PSA_108_8" {:texto "Meu é Gileade, meu é Manassés; e Efraim é a fortaleza de minha cabeça; Judá é meu legislador."}
"PSA_108_9" {:texto "Moabe é minha bacia de lavar; sobre Edom lançarei meu sapato; sobre a Filístia eu triunfarei."}
"PSA_108_10" {:texto "Quem me levará a uma cidade fortificada? Quem me guiará até Edom?"}
"PSA_108_11" {:texto "Por acaso não serás tu, ó Deus? Tu que tinha nos rejeitado, e não saías [mais] com nossos exércitos?"}
"PSA_108_12" {:texto "Dá-nos ajuda [para livrarmos] da angústia, porque o socorro humano é inútil."}
"PSA_108_13" {:texto "Em Deus faremos proezas; e ele pisoteará nossos adversários."}
"PSA_109_1" {:texto "Salmo de Davi, para o regente:Ó Deus a quem eu louvo, não fiques calado."}
"PSA_109_2" {:texto "Porque a boca do perverso, e a boca enganadora já se abriram contra mim; falaram de mim com língua falsa."}
"PSA_109_3" {:texto "E me cercaram com palavras de ódio; e lutaram contra mim sem motivo."}
"PSA_109_4" {:texto "Fizeram-se contra mim por causa de meu amor; porém eu [me mantenho] em oração."}
"PSA_109_5" {:texto "Retribuíram o bem com o mal, e o meu amor com ódio."}
"PSA_109_6" {:texto "Põe algum perverso contra ele, e que haja um acusador à sua direita."}
"PSA_109_7" {:texto "Quando for julgado, que saia condenado; e que a oração dele seja [considerada] como pecado."}
"PSA_109_8" {:texto "Sejam os dias dele poucos, e que outro tome sua atividade."}
"PSA_109_9" {:texto "Sejam seus filhos órfãos, e sua mulher seja viúva."}
"PSA_109_10" {:texto "E que seus filhos andem sem rumo, e mendiguem; e busquem [para si longe] de suas ruínas."}
"PSA_109_11" {:texto "Que o credor tome tudo o que ele tem, e estranhos saqueiem seu trabalho."}
"PSA_109_12" {:texto "Haja ninguém que tenha piedade dele, e haja ninguém que se compadeça de seus órfãos."}
"PSA_109_13" {:texto "Sejam seus descendentes cortados de vez; [e] que o nome deles seja apagado da geração seguinte."}
"PSA_109_14" {:texto "Que a perversidade de seus pais seja lembrada pelo SENHOR, e que o pecado de sua mãe não seja apagado."}
"PSA_109_15" {:texto "[Porém que tais coisas] estejam sempre perante o SENHOR, e corte-se a lembrança deles da terra."}
"PSA_109_16" {:texto "Porque ele não se lembrou de fazer o bem; ao invés disso, perseguiu ao homem humilde e necessitado, e ao de coração quebrado, para [o] matar."}
"PSA_109_17" {:texto "Já que ele amou a maldição, então que ela lhe sobrevenha; e já que ele não quis a bênção, que esta se afaste dele."}
"PSA_109_18" {:texto "E ele seja revestido de maldição, como se lhe fosse sua roupa, como água dentro do seu corpo, e como óleo em seus ossos."}
"PSA_109_19" {:texto "Que ela seja como uma roupa com que ele se cubra, e como cinto com que ele sempre põe ao seu redor."}
"PSA_109_20" {:texto "Isto seja o pagamento do SENHOR para os meus adversários, e para os que falam mal contra minha alma."}
"PSA_109_21" {:texto "Porém tu, Senhor DEUS, me trata [bem] por causa do teu nome; por ser boa a tua misericórdia, livra-me;"}
"PSA_109_22" {:texto "Porque estou aflito e necessitado; e meu coração está ferido dentro de mim."}
"PSA_109_23" {:texto "Eu vou como a sombra, que declina; estou sendo sacudido como um gafanhoto."}
"PSA_109_24" {:texto "Meus joelhos estão fracos de [tanto] jejuar; minha carne está magra, sem gordura alguma."}
"PSA_109_25" {:texto "E eu por eles sou humilhado; quando me veem, sacodem suas cabeças."}
"PSA_109_26" {:texto "Socorre-me, SENHOR Deus meu; salva-me conforme a tua bondade;"}
"PSA_109_27" {:texto "Para que saibam que esta é a tua mão; e que assim tu a fizeste."}
"PSA_109_28" {:texto "Maldigam eles, mas bendize tu; levantem-se eles, mas sejam envergonhados; e o teu servo se alegre."}
"PSA_109_29" {:texto "Que meus adversários se vistam de vergonha, e cubram-se com sua própria humilhação, como [se fosse] uma capa."}
"PSA_109_30" {:texto "Agradecerei grandemente ao SENHOR com minha boca, e no meio de muitos eu o louvarei;"}
"PSA_109_31" {:texto "Porque ele se põe à direita do necessitado, para [o] livrar daqueles que atacam a sua alma."}
"PSA_110_1" {:texto "Salmo de Davi:O SENHOR disse a meu Senhor: Senta-te à minha direita, até que eu ponha teus inimigos por escabelo de teus pés."}
"PSA_110_2" {:texto "O SENHOR enviará o cetro de tua força desde Sião, [dizendo] : Domina tu no meio de teus inimigos."}
"PSA_110_3" {:texto "Teu povo será voluntário no dia do teu poder; com santas honras, desde o ventre do amanhecer, tu [terás] o orvalho de tua juventude."}
"PSA_110_4" {:texto "O SENHOR jurou, e não se arrependerá: Tu és Sacerdote eterno, segundo a ordem de Melquisedeque."}
"PSA_110_5" {:texto "O Senhor está à tua direita; ele ferirá aos reis no dia de sua ira."}
"PSA_110_6" {:texto "Julgará entre as nações; ele [as] encherá de corpos mortos; [e] ferirá a cabeça de uma grande terra."}
"PSA_110_7" {:texto "Ele beberá do ribeiro no caminho, então levantará a cabeça."}
"PSA_111_1" {:texto "Aleluia! Louvarei ao SENHOR com todo o coração, no conselho e na congregação dos corretos."}
"PSA_111_2" {:texto "Grandes são as obras do SENHOR; procuradas por todos os que nelas se agradam."}
"PSA_111_3" {:texto "Glória e majestade são o seu agir, e sua justiça permanece para sempre."}
"PSA_111_4" {:texto "Ele fez memoráveis as suas maravilhas; piedoso é misericordioso é o SENHOR."}
"PSA_111_5" {:texto "Ele deu alimento aos que o temem; ele se lembrará para sempre de seu pacto."}
"PSA_111_6" {:texto "Ele anunciou o poder se suas obras a seu povo, dando-lhes a herança de nações [estrangeiras] ."}
"PSA_111_7" {:texto "As obras de suas mãos são verdade e juízo, e todos os seus mandamentos são fiéis."}
"PSA_111_8" {:texto "Eles ficarão firmes para sempre, e são feitos em verdade e justiça."}
"PSA_111_9" {:texto "Ele enviou resgate a seu povo, ordenou seu pacto para sempre; santo e temível é o seu nome."}
"PSA_111_10" {:texto "O temor ao SENHOR é o princípio da sabedoria; inteligentes são todos o que isto praticam. O louvor a ele dura para sempre."}
"PSA_112_1" {:texto "Aleluia! Bem-aventurado é o homem que teme ao SENHOR, e que tem muito prazer em seus mandamentos."}
"PSA_112_2" {:texto "Sua descendência será poderosa na terra; a geração dos corretos será bendita."}
"PSA_112_3" {:texto "Em sua casa [haverá] bens e riquezas, e sua justiça permanece para sempre."}
"PSA_112_4" {:texto "A luz brilha nas trevas para os corretos, [para quem é] piedoso, misericordioso e justo."}
"PSA_112_5" {:texto "O homem bom é misericordioso, e empresta; ele administra suas coisas com prudência."}
"PSA_112_6" {:texto "Certamente ele nunca se abalará; o justo será lembrado para sempre."}
"PSA_112_7" {:texto "Ele não temerá o mau rumor; o seu coração está firme, confiante no SENHOR."}
"PSA_112_8" {:texto "Seu firme coração não temerá, até que ele veja [o fim] de seus inimigos."}
"PSA_112_9" {:texto "Ele distribui, e dá aos necessitados; sua justiça permanece para sempre; seu poder será exaltado em glória."}
"PSA_112_10" {:texto "O perverso verá, e ficará incomodado; rangerá seus dentes, e se consumirá. O desejo dos perversos perecerá."}
"PSA_113_1" {:texto "Aleluia! Louvai, vós servos do SENHOR, louvai o nome do SENHOR."}
"PSA_113_2" {:texto "Seja o nome do SENHOR bendito, desde agora para todo o sempre."}
"PSA_113_3" {:texto "Desde o nascer do sol até o poente, seja louvado o nome do SENHOR."}
"PSA_113_4" {:texto "O SENHOR está elevado acima de todas as nações; [e] sua glória acima dos céus."}
"PSA_113_5" {:texto "Quem é como o SENHOR nosso Deus? Ele que habita nas alturas,"}
"PSA_113_6" {:texto "Que se abaixa para ver [o que há] nos céus e na terra;"}
"PSA_113_7" {:texto "Que do levanta o pobre do pó da terra, e levanta o necessitado da sujeira;"}
"PSA_113_8" {:texto "Para fazê-lo sentar com os príncipes, com os príncipes de seu povo;"}
"PSA_113_9" {:texto "Que faz a estéril habitar em família, como alegre mãe de filhos. Aleluia!"}
"PSA_114_1" {:texto "Quando Israel saiu do Egito, [quando] a casa de Jacó [saiu] de um povo estrangeiro,"}
"PSA_114_2" {:texto "Judá se tornou seu santuário, [e] Israel os seus domínios."}
"PSA_114_3" {:texto "O mar viu, e fugiu; e o Jordão recuou."}
"PSA_114_4" {:texto "Os montes saltaram como carneiros, os morros como cordeiros."}
"PSA_114_5" {:texto "O que houve, ó mar, que fugiste? Ó Jordão, que recuaste?"}
"PSA_114_6" {:texto "Ó montes, que saltastes como carneiros? Ó morros, como cordeiros?"}
"PSA_114_7" {:texto "Trema tu, ó terra, pela presença do Senhor, pela presença do Deus de Jacó,"}
"PSA_114_8" {:texto "Que tornou a rocha em lago de águas; ao pedregulho em fonte de águas."}
"PSA_115_1" {:texto "Não a nós, SENHOR; não a nós, mas a teu nome dá glória; por tua bondade, por tua fidelidade."}
"PSA_115_2" {:texto "Porque as nações dirão: Onde está o Deus deles?"}
"PSA_115_3" {:texto "Porém nosso Deus está nos céus, ele faz tudo o que lhe agrada."}
"PSA_115_4" {:texto "Os ídolos deles são prata e ouro, obras de mãos humanas."}
"PSA_115_5" {:texto "Têm boca, mas não falam; têm olhos, mas não veem;"}
"PSA_115_6" {:texto "Têm ouvidos, mas não ouvem; tem nariz, mas não cheiram;"}
"PSA_115_7" {:texto "Têm mãos, mas não apalpam; têm pés, mas não andam; nem falam com suas gargantas."}
"PSA_115_8" {:texto "Tornem-se como eles os que os fazem, [e] todos os que neles confiam."}
"PSA_115_9" {:texto "Ó Israel, confia no SENHOR; ele é sua ajuda e seu escudo."}
"PSA_115_10" {:texto "Ó casa de Arão, confiai no SENHOR; ele é sua ajuda e seu escudo."}
"PSA_115_11" {:texto "Vós que temeis ao SENHOR, confiai no SENHOR; ele é sua ajuda e seu escudo."}
"PSA_115_12" {:texto "O SENHOR tem se lembrado de nós; ele há de abençoar; ele abençoará a casa de Israel; ele abençoará a casa de Arão."}
"PSA_115_13" {:texto "Ele abençoará aos que temem ao SENHOR; tanto os pequenos como os grandes."}
"PSA_115_14" {:texto "O SENHOR vos aumentará, vós e vossos filhos."}
"PSA_115_15" {:texto "Benditos sois vós [que pertenceis] ao SENHOR, que fez os céus e a terra."}
"PSA_115_16" {:texto "[Quanto] aos céus, os céus são do SENHOR; mas a terra ele deu aos filhos dos homens."}
"PSA_115_17" {:texto "Os mortos não louvam ao SENHOR, nem os que descem ao silêncio."}
"PSA_115_18" {:texto "Porém nós bendiremos ao SENHOR, desde agora e para sempre. Aleluia!"}
"PSA_116_1" {:texto "Amo o SENHOR, porque ele escuta minha voz [e] minhas súplicas."}
"PSA_116_2" {:texto "Porque ele tem inclinado a mim seus ouvidos; por isso eu clamarei a ele em [todos] os meus dias."}
"PSA_116_3" {:texto "Cordas da morte me cercaram, e angústias do Xeol me afrontaram; encontrei opressão e aflição."}
"PSA_116_4" {:texto "Mas clamei ao nome do SENHOR, [dizendo] : Ah SENHOR, livra minha alma!"}
"PSA_116_5" {:texto "O SENHOR é piedoso e justo; e nosso Deus é misericordioso."}
"PSA_116_6" {:texto "O SENHOR protege os simples; eu estava com graves problemas, mas ele me livrou."}
"PSA_116_7" {:texto "Minha alma, volta ao teu descanso, pois o SENHOR tem te tratado bem."}
"PSA_116_8" {:texto "Porque tu, [SENHOR] ,livraste minha alma da morte, meus olhos das lágrimas, e meu pé do tropeço."}
"PSA_116_9" {:texto "Andarei diante do SENHOR na terra dos viventes."}
"PSA_116_10" {:texto "Eu cri, por isso falei; estive muito aflito."}
"PSA_116_11" {:texto "Eu dizia em minha pressa: Todo homem é mentiroso."}
"PSA_116_12" {:texto "O que pagarei ao SENHOR por todos os benefícios dele para mim?"}
"PSA_116_13" {:texto "Tomarei o copo da salvação, [e] chamarei o nome do SENHOR."}
"PSA_116_14" {:texto "Certamente pagarei meus votos ao SENHOR, na presença de todo o seu povo."}
"PSA_116_15" {:texto "Preciosa é aos olhos do SENHOR a morte de seus santos."}
"PSA_116_16" {:texto "Ah SENHOR, verdadeiramente eu sou teu servo; sou teu servo, filho de tua serva; tu me soltaste das correntes que me prendiam."}
"PSA_116_17" {:texto "Sacrificarei a ti sacrifício de agradecimento, e chamarei o nome do SENHOR."}
"PSA_116_18" {:texto "Certamente pagarei meus votos ao SENHOR, na presença de todo o seu povo;"}
"PSA_116_19" {:texto "Nos pátios da casa do SENHOR, em meio de ti, ó Jerusalém. Aleluia!"}
"PSA_117_1" {:texto "Louvai ao SENHOR, todas as nações; celebrai a ele, todos os povos."}
"PSA_117_2" {:texto "Porque sua bondade prevaleceu sobre nós, e a fidelidade do SENHOR [dura] para sempre. Aleluia!"}
"PSA_118_1" {:texto "Agradecei ao SENHOR, porque ele é bom; pois sua bondade [dura] para sempre."}
"PSA_118_2" {:texto "Diga agora Israel, que sua bondade [dura] para sempre."}
"PSA_118_3" {:texto "Diga agora casa de Arão, que sua bondade [dura] para sempre."}
"PSA_118_4" {:texto "Digam agora os que temem ao SENHOR, que sua bondade [dura] para sempre."}
"PSA_118_5" {:texto "Na angústia clamei ao SENHOR; [e] o SENHOR me respondeu, e [me pôs] num lugar amplo."}
"PSA_118_6" {:texto "O SENHOR está comigo, não temerei; o que poderá me fazer o homem?"}
"PSA_118_7" {:texto "O SENHOR está comigo entre os que ajudam; por isso verei [o fim] daqueles que me odeiam."}
"PSA_118_8" {:texto "Melhor é buscar refúgio no SENHOR do que confiar no homem."}
"PSA_118_9" {:texto "Melhor é buscar refúgio no SENHOR do que confiar em príncipes."}
"PSA_118_10" {:texto "Todas as nações me cercaram; [mas foi] no nome do SENHOR que eu as despedacei."}
"PSA_118_11" {:texto "Cercaram-me, cercaram-me mesmo; [mas foi] no nome do SENHOR que eu as despedacei."}
"PSA_118_12" {:texto "Cercaram-me como abelhas, mas se apagaram como fogo de espinhos; [porque] foi no nome do SENHOR que eu as despedacei."}
"PSA_118_13" {:texto "Com força me empurraste para que eu caísse; mas o SENHOR me ajudou."}
"PSA_118_14" {:texto "O SENHOR é minha força e [minha] canção, porque ele tem sido minha salvação."}
"PSA_118_15" {:texto "Nas tendas dos justos há voz de alegria e salvação; a mão direita do SENHOR faz proezas."}
"PSA_118_16" {:texto "A mão direita do SENHOR se levanta; a mão direita do SENHOR faz proezas."}
"PSA_118_17" {:texto "Eu não morrerei, mas viverei; e contarei as obras do SENHOR."}
"PSA_118_18" {:texto "É verdade que o SENHOR me castigou, porém ele não me entregou à morte."}
"PSA_118_19" {:texto "Abri para mim as portas da justiça; entrarei por elas [e] louvarei ao SENHOR."}
"PSA_118_20" {:texto "Esta é a porta do SENHOR, pela qual os justos entrarão."}
"PSA_118_21" {:texto "Eu te louvarei porque tu me respondeste e me salvaste."}
"PSA_118_22" {:texto "A pedra que os construtores rejeitaram se tornou cabeça de esquina."}
"PSA_118_23" {:texto "Pelo SENHOR isto foi feito, [e] é maravilhoso aos nossos olhos."}
"PSA_118_24" {:texto "Este é o dia em que o SENHOR agiu; alegremos e enchamos de alegria nele."}
"PSA_118_25" {:texto "Ah, SENHOR, salva-nos! Ah, SENHOR, faze [-nos] prosperar!"}
"PSA_118_26" {:texto "Bendito aquele que vem no nome do SENHOR; nós vos bendizemos desde a casa do SENHOR."}
"PSA_118_27" {:texto "O SENHOR é o [verdadeiro] Deus, que nos deu luz; atai os [sacrifícios] da festa, para [levá-los] aos chifres do altar."}
"PSA_118_28" {:texto "Tu és meu Deus, por isso eu te louvarei. Eu te exaltarei, meu Deus."}
"PSA_118_29" {:texto "Agradecei ao SENHOR, porque ele é bom; pois sua bondade [dura] para sempre."}
"PSA_119_1" {:texto "[Álefe] :Bem-aventurados são os puros em [seus] caminhos, os que andam na lei do SENHOR."}
"PSA_119_2" {:texto "Bem-aventurados são os que guardam os testemunhos dele, [e] o buscam com todo o coração;"}
"PSA_119_3" {:texto "E não praticam perversidade, [mas] andam nos caminhos dele."}
"PSA_119_4" {:texto "Tu mandaste que teus mandamentos fossem cuidadosamente obedecidos."}
"PSA_119_5" {:texto "Ah! Como gostaria que meus caminhos fossem dirigidos a guardar teus estatutos!"}
"PSA_119_6" {:texto "Então não me envergonharia, quando eu observasse todos os teus mandamentos."}
"PSA_119_7" {:texto "Louvarei a ti com um coração correto, enquanto aprendo os juízos de tua justiça."}
"PSA_119_8" {:texto "Eu guardarei teus estatutos; não me abandones por completo."}
"PSA_119_9" {:texto "[Bete] : Com que um rapaz purificará o seu caminho? Sendo obediente conforme a tua palavra."}
"PSA_119_10" {:texto "Eu te busco como todo o meu coração; não me deixes desviar de teus mandamentos."}
"PSA_119_11" {:texto "Guardei a tua palavra em meu coração, para eu não pecar contra ti."}
"PSA_119_12" {:texto "Bendito [és] tu, SENHOR; ensina-me os teus estatutos."}
"PSA_119_13" {:texto "Com meus lábios contei todos os juízos de tua boca."}
"PSA_119_14" {:texto "Eu me alegro mais com o caminho de teus estatutos, do que com todas as riquezas."}
"PSA_119_15" {:texto "Meditarei em teus mandamentos, e darei atenção aos teus caminhos."}
"PSA_119_16" {:texto "Terei prazer em teus estatutos; não me esquecerei de tua palavra."}
"PSA_119_17" {:texto "[Guímel] :Trata bem o teu servo, [para] que eu viva, e obedeça tua palavra."}
"PSA_119_18" {:texto "Abre meus olhos, para que eu veja as maravilhas de tua lei."}
"PSA_119_19" {:texto "Eu sou peregrino na terra, não escondas de mim os teus mandamentos."}
"PSA_119_20" {:texto "Minha alma está despedaçada de tanto desejar os teus juízos em todo tempo."}
"PSA_119_21" {:texto "Tu repreendes aos malditos arrogantes, que se desviam de teus mandamentos."}
"PSA_119_22" {:texto "Tira-me de minha humilhação e desprezo, pois eu guardei teus testemunhos."}
"PSA_119_23" {:texto "Até mesmo os príncipes se sentaram, e falaram contra mim; porém o teu servo estava meditando em teus estatutos."}
"PSA_119_24" {:texto "Pois teus testemunhos são meus prazeres [e] meus conselheiros."}
"PSA_119_25" {:texto "[Dálete] :Minha alma está grudada ao pó; vivifica-me conforme tua palavra."}
"PSA_119_26" {:texto "Eu [te] contei os meus caminhos, e tu me respondeste; ensina-me conforme teus estatutos."}
"PSA_119_27" {:texto "Faze-me entender o caminho de teus preceitos, para eu falar de tuas maravilhas."}
"PSA_119_28" {:texto "Minha alma se derrama de tristeza; levanta-me conforme tua palavra."}
"PSA_119_29" {:texto "Desvia de mim o caminho de falsidade; e sê piedoso dando-me tua lei."}
"PSA_119_30" {:texto "Eu escolhi o caminho da fidelidade; e pus [diante de mim] os teus juízos."}
"PSA_119_31" {:texto "Estou apegado a teus testemunhos; ó SENHOR, não me envergonhes."}
"PSA_119_32" {:texto "Correrei pelo caminho de teus mandamentos, porque tu alargaste o meu coração."}
"PSA_119_33" {:texto "[Hê] :Ensina-me, SENHOR, o caminho de teus estatutos, e eu o guardarei até o fim."}
"PSA_119_34" {:texto "Dá-me entendimento, e eu guardarei a tua lei, e a obedecerei de todo [o meu] coração."}
"PSA_119_35" {:texto "Faze-me andar na trilha de teus mandamentos, porque nela tenho prazer."}
"PSA_119_36" {:texto "Inclina meu coração a teus testemunhos, e não à ganância."}
"PSA_119_37" {:texto "Desvia meus olhos para que não olhem para coisas inúteis; vivifica-me pelo teu caminho."}
"PSA_119_38" {:texto "Confirma tua promessa a teu servo, que tem temor a ti."}
"PSA_119_39" {:texto "Desvia de mim a humilhação que eu tenho medo, pois teus juízos são bons."}
"PSA_119_40" {:texto "Eis que amo os teus mandamentos; vivifica-me por tua justiça."}
"PSA_119_41" {:texto "[Vau] :E venham sobre mim tuas bondades, SENHOR; [e também] a tua salvação, segundo tua promessa."}
"PSA_119_42" {:texto "Para que eu tenha resposta ao que me insulta; pois eu confio em tua palavra."}
"PSA_119_43" {:texto "E nunca tires de minha boca a palavra da verdade, pois eu espero em teus juízos."}
"PSA_119_44" {:texto "Assim obedecerei a tua lei continuamente, para todo o sempre."}
"PSA_119_45" {:texto "E andarei [livremente] por longas distâncias, pois busquei teus preceitos."}
"PSA_119_46" {:texto "Também falarei de teus testemunhos perante reis, e não me envergonharei."}
"PSA_119_47" {:texto "E terei prazer em teus mandamentos, que eu amo."}
"PSA_119_48" {:texto "E levantarei as minhas mãos a teus mandamentos, que eu amo; e meditarei em teus estatutos."}
"PSA_119_49" {:texto "[Záin] :Lembra-te da palavra [dada] a teu servo, à qual mantenho esperança."}
"PSA_119_50" {:texto "Isto é meu consolo na minha aflição, porque tua promessa me vivifica."}
"PSA_119_51" {:texto "Os arrogantes têm zombado de mim demasiadamente; [porém] não me desviei de tua lei."}
"PSA_119_52" {:texto "Eu me lembrei de teus juízos muito antigos, SENHOR; e [assim] me consolei."}
"PSA_119_53" {:texto "Eu me enchi de ira por causa dos perversos, que abandonam tua lei."}
"PSA_119_54" {:texto "Teus estatutos foram meus cânticos no lugar de minhas peregrinações."}
"PSA_119_55" {:texto "De noite tenho me lembrado de teu nome, SENHOR; e tenho guardado tua lei."}
"PSA_119_56" {:texto "Isto eu tenho feito, porque guardo teus mandamentos."}
"PSA_119_57" {:texto "[Hete] :O SENHOR é minha porção; eu disse que guardaria tuas palavras."}
"PSA_119_58" {:texto "Busquei a tua face com todo o [meu] coração; tem piedade de mim segundo tua palavra."}
"PSA_119_59" {:texto "Eu dei atenção a meus caminhos, e dirigi meus pés a teus testemunhos."}
"PSA_119_60" {:texto "Eu me apressei, e não demorei a guardar os teus mandamentos."}
"PSA_119_61" {:texto "Bandos de perversos me roubaram; [porém] não me esqueci de tua lei."}
"PSA_119_62" {:texto "No meio da noite eu me levanto para te louvar, por causa dos juízos de tua justiça."}
"PSA_119_63" {:texto "Sou companheiro de todos os que te temem, e dos que guardam os teus mandamentos."}
"PSA_119_64" {:texto "A terra está cheia de tua bondade, SENHOR; ensina-me os teus estatutos."}
"PSA_119_65" {:texto "[Tete] :Tu fizeste bem a teu servo, SENHOR, conforme tua palavra."}
"PSA_119_66" {:texto "Ensina-me bom senso e conhecimento, pois tenho crido em teus mandamentos."}
"PSA_119_67" {:texto "Antes de ter sido afligido, eu andava errado; mas agora guardo tua palavra."}
"PSA_119_68" {:texto "Tu és bom, e fazes o bem; ensina-me os teus estatutos."}
"PSA_119_69" {:texto "Os arrogantes forjaram mentiras contra mim; [mas] eu com todo o [meu] coração guardo os teus mandamentos."}
"PSA_119_70" {:texto "O coração deles se incha como gordura; [mas] eu tenho prazer em tua lei."}
"PSA_119_71" {:texto "Foi bom pra mim ter sido afligido, para assim eu aprender os teus estatutos."}
"PSA_119_72" {:texto "Melhor para mim é a lei de tua boca, do que milhares de [peças] de ouro ou prata."}
"PSA_119_73" {:texto "[Iode] :Tuas mãos me fizeram e me formaram; faze-me ter entendimento, para que eu aprenda teus mandamentos."}
"PSA_119_74" {:texto "Os que te temem olham para mim e se alegram, porque eu mantive esperança em tua palavra."}
"PSA_119_75" {:texto "Eu sei, SENHOR, que teus juízos são justos; e que tu me afligiste [por] tua fidelidade."}
"PSA_119_76" {:texto "Seja agora tua bondade para me consolar, segundo a promessa [que fizeste] a teu servo."}
"PSA_119_77" {:texto "Venham tuas misericórdias sobre mim, para que eu viva; pois tua lei é o meu prazer."}
"PSA_119_78" {:texto "Sejam envergonhados os arrogantes, porque eles me prejudicaram com mentiras; [porém] eu medito em teus mandamentos."}
"PSA_119_79" {:texto "Virem-se a mim os que te temem e conhecem os teus testemunhos."}
"PSA_119_80" {:texto "Seja meu coração correto em teus estatutos, para eu não ser envergonhado."}
"PSA_119_81" {:texto "[Cafe] :Minha alma desfalece por tua salvação; em tua palavra mantenho esperança."}
"PSA_119_82" {:texto "Meus olhos desfaleceram por tua promessa, enquanto eu dizia: Quando tu me consolarás?"}
"PSA_119_83" {:texto "Porque fiquei como um odre na fumaça, [porém] não me esqueci teus testemunhos."}
"PSA_119_84" {:texto "Quantos serão os dias de teu servo? Quando farás julgamento aos meus perseguidores?"}
"PSA_119_85" {:texto "Os arrogantes me cavaram covas, aqueles que não são conforme a tua lei."}
"PSA_119_86" {:texto "Todos os teus mandamentos são verdade; com mentiras me perseguem; ajuda-me."}
"PSA_119_87" {:texto "Estou quase que destruído por completo sobre a terra; porém eu não deixei teus mandamentos."}
"PSA_119_88" {:texto "Vivifica-me conforme tua bondade, então guardarei o testemunho de tua boca."}
"PSA_119_89" {:texto "[Lâmede] :Para sempre, SENHOR, tua palavra permanece nos céus."}
"PSA_119_90" {:texto "Tua fidelidade [dura] de geração em geração; tu firmaste a terra, e [assim] ela permanece."}
"PSA_119_91" {:texto "Elas continuam por tuas ordens até hoje, porque todos são teus servos."}
"PSA_119_92" {:texto "Se a tua lei não fosse meu prazer, eu já teria perecido em minha aflição."}
"PSA_119_93" {:texto "Nunca esquecerei de teus mandamentos, porque tu me vivificaste por eles."}
"PSA_119_94" {:texto "Eu sou teu, salva-me, porque busquei teus preceitos."}
"PSA_119_95" {:texto "Os perversos me esperaram, para me destruírem; [porém] eu dou atenção a teus testemunhos."}
"PSA_119_96" {:texto "A toda perfeição eu vi fim; [mas] teu mandamento é extremamente grande."}
"PSA_119_97" {:texto "[Mem] :Ah, como eu amo a tua lei! O dia todo eu medito nela."}
"PSA_119_98" {:texto "Ela me faz mais sábio do que meus inimigos [por meio de] teus mandamentos, porque ela está sempre comigo."}
"PSA_119_99" {:texto "Sou mais inteligente que todos os meus instrutores, porque medito em teus testemunhos."}
"PSA_119_100" {:texto "Sou mais prudente que os anciãos, porque guardei teus mandamentos."}
"PSA_119_101" {:texto "Afastei meus pés de todo mau caminho, para guardar tua palavra."}
"PSA_119_102" {:texto "Não me desviei de teus juízos, porque tu me ensinaste."}
"PSA_119_103" {:texto "Como são doces tuas palavras ao meu paladar! Mais que o mel em minha boca."}
"PSA_119_104" {:texto "Obtenho conhecimento por meio de teus preceitos; por isso odeio todo caminho de mentira."}
"PSA_119_105" {:texto "[Nun] :Tua palavra é lâmpada para meus pés e luz para meu caminho."}
"PSA_119_106" {:texto "Eu jurei, e [assim] cumprirei, de guardar os juízos de tua justiça."}
"PSA_119_107" {:texto "Eu estou muito aflito, SENHOR; vivifica-me conforme a tua palavra."}
"PSA_119_108" {:texto "Agrada-te das ofertas voluntárias de minha boca, SENHOR; e ensina-me teus juízos."}
"PSA_119_109" {:texto "Continuamente arrisco minha alma, porém não me esqueço de tua lei."}
"PSA_119_110" {:texto "Os perversos me armaram um laço de armadilha, mas não me desviei de teus mandamentos."}
"PSA_119_111" {:texto "Tomei teus testemunhos por herança para sempre, pois eles são a alegria de meu coração."}
"PSA_119_112" {:texto "Inclinei meu coração para praticar os teus testemunhos para todo o sempre."}
"PSA_119_113" {:texto "[Sâmeque] :Odeio os inconstantes, mas amo a tua lei."}
"PSA_119_114" {:texto "Tu és meu refúgio e meu escudo; eu espero em tua palavra."}
"PSA_119_115" {:texto "Afastai-vos de mim, malfeitores, para que eu guarde os mandamentos de meu Deus."}
"PSA_119_116" {:texto "Sustenta-me conforme a tua promessa, para que eu viva; e não me faças ser humilhado em minha esperança."}
"PSA_119_117" {:texto "Segura-me, e estarei protegido; então continuamente pensarei em teus estatutos."}
"PSA_119_118" {:texto "Tu atropelas a todos que se desviam de teus estatutos; pois o engano deles é mentira."}
"PSA_119_119" {:texto "Tu tiras a todos os perversos da terra como [se fossem] lixo; por isso eu amo teus testemunhos."}
"PSA_119_120" {:texto "Meu corpo se arrepia de medo de ti; e temo os teus juízos."}
"PSA_119_121" {:texto "[Áin] :Eu fiz juízo e justiça; não me abandones com os meus opressores."}
"PSA_119_122" {:texto "Sê tu a garantia do bem de teu servo; não me deixes ser oprimido pelos arrogantes."}
"PSA_119_123" {:texto "Meus olhos desfaleceram [de esperar] por tua salvação, e pela palavra de tua justiça."}
"PSA_119_124" {:texto "Age para com teu servo segundo tua bondade, e ensina-me teus estatutos."}
"PSA_119_125" {:texto "Eu sou teu servo. Dá-me entendimento; então conhecerei teus testemunhos."}
"PSA_119_126" {:texto "É tempo do SENHOR agir, porque estão violando tua lei."}
"PSA_119_127" {:texto "Por isso eu amo teus mandamentos mais que o ouro, o mais fino ouro."}
"PSA_119_128" {:texto "Por isso considero corretos todos os [teus] mandamentos quanto a tudo, e odeio todo caminho de falsidade."}
"PSA_119_129" {:texto "[Pê] :Maravilhosos são teus testemunhos, por isso minha alma os guarda."}
"PSA_119_130" {:texto "A entrada de tuas palavras dá luz, dando entendimento aos simples."}
"PSA_119_131" {:texto "Abri minha boca, e respirei; porque desejei teus mandamentos."}
"PSA_119_132" {:texto "Olha-me, e tem piedade de mim; conforme [teu] costume para com os que amam o teu nome."}
"PSA_119_133" {:texto "Firma meus passos em tua palavra, e que nenhuma perversidade me domine."}
"PSA_119_134" {:texto "Resgata-me da opressão dos homens; então guardarei teus mandamentos."}
"PSA_119_135" {:texto "Brilha teu rosto sobre teu servo, e ensina-me teus estatutos."}
"PSA_119_136" {:texto "Ribeiros d'água descem de meus olhos, porque eles não guardam tua lei."}
"PSA_119_137" {:texto "[Tsadê] :Tu és justo, SENHOR; e corretos são teus juízos."}
"PSA_119_138" {:texto "Tu ensinaste teus testemunhos justos e muito fiéis."}
"PSA_119_139" {:texto "Meu zelo me consumiu, porque meus adversários se esqueceram de tuas palavras."}
"PSA_119_140" {:texto "Refinada é a tua palavra, e teu servo a ama."}
"PSA_119_141" {:texto "Eu sou pequeno e desprezado; [porém] não me esqueço de teus mandamentos."}
"PSA_119_142" {:texto "Tua justiça é justa para sempre, e tua lei é verdade."}
"PSA_119_143" {:texto "Aperto e angústia me encontraram; [ainda assim] teus mandamentos são meus prazeres."}
"PSA_119_144" {:texto "A justiça de teus testemunhos [dura] para sempre; dá-me entendimento, e então viverei."}
"PSA_119_145" {:texto "[Cofe] :Clamei com todo o [meu] coração; responde-me, SENHOR; guardarei teus estatutos."}
"PSA_119_146" {:texto "Clamei a ti; salva-me, e então guardarei os teus testemunhos."}
"PSA_119_147" {:texto "Eu me antecedi ao amanhecer, e gritei; [e] mantive esperança em tua palavra."}
"PSA_119_148" {:texto "Meus olhos antecederam as vigílias da noite, para meditar em tua palavra."}
"PSA_119_149" {:texto "Ouve minha voz, segundo tua bondade, SENHOR; vivifica-me conforme teu juízo."}
"PSA_119_150" {:texto "Aproximam-se [de mim] os que praticam maldade; eles estão longe de tua lei."}
"PSA_119_151" {:texto "[Porém] tu, SENHOR, estás perto [de mim] ; e todos os teus mandamentos são verdade."}
"PSA_119_152" {:texto "Desde antigamente eu soube de teus testemunhos, que tu os fundaste para sempre."}
"PSA_119_153" {:texto "[Rexe] :Olha a minha aflição, e livra-me [dela] ; pois não me esqueci de tua lei."}
"PSA_119_154" {:texto "Defende minha causa, e resgata-me; vivifica-me conforme tua palavra."}
"PSA_119_155" {:texto "A salvação está longe dos perversos, porque eles não buscam teus estatutos."}
"PSA_119_156" {:texto "Muitas são tuas misericórdias, SENHOR; vivifica-me conforme teus juízos."}
"PSA_119_157" {:texto "Muitos são meus perseguidores e meus adversários; [porém] eu não me desvio de teus testemunhos."}
"PSA_119_158" {:texto "Eu vi aos enganadores e os detestei, porque eles não guardam tua palavra."}
"PSA_119_159" {:texto "Vê, SENHOR, que eu amo teus mandamentos; vivifica-me conforme a tua bondade."}
"PSA_119_160" {:texto "O princípio de tua palavra é fiel, e o juízo de tua justiça [dura] para sempre."}
"PSA_119_161" {:texto "[Xin] :Príncipes me perseguiram sem causa, mas meu coração temeu a tua palavra."}
"PSA_119_162" {:texto "Eu me alegro em tua palavra, tal como alguém que encontra um grande tesouro."}
"PSA_119_163" {:texto "Odeio e abomino a falsidade; [mas] amo a tua lei."}
"PSA_119_164" {:texto "Louvo a ti sete vezes ao dia, por causa dos juízos de tua justiça."}
"PSA_119_165" {:texto "Muita paz têm aqueles que amam a tua lei; e para eles não há tropeço."}
"PSA_119_166" {:texto "Espero por tua salvação, SENHOR; e pratico teus mandamentos."}
"PSA_119_167" {:texto "Minha alma guarda teus testemunhos, e eu os amo muito."}
"PSA_119_168" {:texto "Eu guardo teus preceitos e teus testemunhos, porque todos os meus caminhos estão diante de ti."}
"PSA_119_169" {:texto "[Tau] :Chegue meu clamor perante teu rosto, SENHOR; dá-me entendimento conforme tua palavra."}
"PSA_119_170" {:texto "Venha minha súplica diante de ti; livra-me conforme tua promessa."}
"PSA_119_171" {:texto "Meus lábios falarão muitos louvores, pois tu me ensinas teus estatutos."}
"PSA_119_172" {:texto "Minha língua falará de tua palavra, porque todos os teus mandamentos são justiça."}
"PSA_119_173" {:texto "Que tua mão me socorra, porque escolhi [seguir] teus preceitos."}
"PSA_119_174" {:texto "Desejo tua salvação, SENHOR; e tua lei é o meu prazer."}
"PSA_119_175" {:texto "Que minha alma viva e louve a ti; e que teus juízos me socorram."}
"PSA_119_176" {:texto "Tenho andado sem rumo, como uma ovelha perdida; busca a teu servo, pois eu não me esqueci de teus mandamentos."}
"PSA_120_1" {:texto "Cântico dos degraus:Em minha angústia clamei ao SENHOR, e ele me respondeu."}
"PSA_120_2" {:texto "Ó SENHOR, livra minha alma dos lábios mentirosos, da língua enganadora."}
"PSA_120_3" {:texto "O que ele te dará, e o que ele fará contigo, ó língua enganadora?"}
"PSA_120_4" {:texto "Flechas afiadas de um guerreiro, com brasas de zimbro."}
"PSA_120_5" {:texto "Ai de mim, que peregrino em Meseque, [e] habito nas tendas de Quedar!"}
"PSA_120_6" {:texto "Minha alma morou [tempo] demais com os que odeiam a paz."}
"PSA_120_7" {:texto "Eu sou da paz; mas quando falo, eles [entram] em guerra."}
"PSA_121_1" {:texto "Cântico dos degraus:Levanto meus olhos aos montes. De onde virá meu socorro?"}
"PSA_121_2" {:texto "Meu socorro [vem] do SENHOR, que fez os céus e a terra."}
"PSA_121_3" {:texto "Ele não deixará o teu pé se abalar, nem cochilará o teu guardião."}
"PSA_121_4" {:texto "Eis que não cochilará nem dormirá o Guardião de Israel."}
"PSA_121_5" {:texto "O SENHOR é o teu guardião; o SENHOR é a sombra à tua direita."}
"PSA_121_6" {:texto "O sol não te ferirá durante o dia, nem a lua durante a noite."}
"PSA_121_7" {:texto "O SENHOR te guardará de todo mal; ele guardará a tua alma."}
"PSA_121_8" {:texto "O SENHOR guardará tua saída e tua entrada, desde agora e para sempre."}
"PSA_122_1" {:texto "Cântico dos degraus, de Davi:Alegro-me com os que me dizem: Vamos à casa do SENHOR."}
"PSA_122_2" {:texto "Nossos pés estão [adentro] de tuas portas, ó Jerusalém."}
"PSA_122_3" {:texto "Jerusalém está edificada como uma cidade bem unida;"}
"PSA_122_4" {:texto "Para onde as tribos sobem, as tribos do SENHOR, como testemunho de Israel, para agradecerem ao nome do SENHOR."}
"PSA_122_5" {:texto "Porque ali estão as cadeiras do julgamento; as cadeiras da casa de Davi."}
"PSA_122_6" {:texto "Orai pela paz de Jerusalém; prosperem os que te amam."}
"PSA_122_7" {:texto "Paz haja em teus muros, e prosperidade em tuas fortalezas."}
"PSA_122_8" {:texto "Por meus irmãos e amigos, assim falarei: Paz haja em ti."}
"PSA_122_9" {:texto "Pela Casa do SENHOR nosso Deus, buscarei o bem para ti."}
"PSA_123_1" {:texto "Cântico dos degraus:Levanto meus olhos a ti, que moras nos céus."}
"PSA_123_2" {:texto "Eis que, assim como os olhos dos servos [olham] para a mão de seus senhores, e os olhos da serva para a mão de sua senhora, assim também nossos olhos [olharão] para o SENHOR nosso Deus, até que ele tenha piedade de nós."}
"PSA_123_3" {:texto "Tem piedade de nós, SENHOR! Tem piedade de nós; pois temos sido humilhados em excesso."}
"PSA_123_4" {:texto "Nossa alma está cheia da zombaria dos insolentes, e da humilhação dos arrogantes."}
"PSA_124_1" {:texto "Cântico dos degraus, de Davi:Diga, Israel: O que [seria de nós] se o SENHOR não estivesse conosco?"}
"PSA_124_2" {:texto "Se o SENHOR não estivesse conosco, quando os homens se levantaram contra nós,"}
"PSA_124_3" {:texto "Eles teriam nos devorado vivos, quando o furor deles se acendeu contra nós."}
"PSA_124_4" {:texto "As águas teriam nos coberto, [e] a corrente de águas teria passado por sobre nossas almas."}
"PSA_124_5" {:texto "Águas violentas teriam passado por sobre nossas almas."}
"PSA_124_6" {:texto "Bendito seja o SENHOR, que não nos entregou como presa aos dentes deles."}
"PSA_124_7" {:texto "Nossa alma escapou como um pássaro da armadilha dos caçadores; a cadeia se quebrou, e nós escapamos."}
"PSA_124_8" {:texto "Nosso socorro está no nome do SENHOR, que fez o céu e a terra."}
"PSA_125_1" {:texto "Os que confiam no SENHOR são como o monte de Sião, que não se abala, [e] permanece para sempre."}
"PSA_125_2" {:texto "Assim como montanhas estão ao redor de Jerusalém, assim também o SENHOR está ao redor de seu povo, desde agora para sempre."}
"PSA_125_3" {:texto "Porque o cetro da maldade não repousará sobre a sorte dos justos, para que os justos não estendam suas mãos à perversidade."}
"PSA_125_4" {:texto "SENHOR, trata bem aos bons, e aos corretos em seus corações."}
"PSA_125_5" {:texto "Mas aos que se dirigem a seus caminhos tortuosos, o SENHOR os mandará embora junto com os que praticam perversidade. Paz [seja] sobre Israel."}
"PSA_126_1" {:texto "Cântico dos degraus:Quando o SENHOR restaurou Sião de seu infortúnio, estivemos como os que sonham."}
"PSA_126_2" {:texto "Então nossa boca se encheu de riso, e nossa língua de alegria; então diziam entre as nações: O SENHOR fez grandes coisas para estes."}
"PSA_126_3" {:texto "Grandes coisas o SENHOR fez para nós; [por isso] estamos alegres."}
"PSA_126_4" {:texto "Restaura-nos, ó SENHOR, como as correntes de águas no sul."}
"PSA_126_5" {:texto "Os que semeiam em lágrimas colherão com alegria."}
"PSA_126_6" {:texto "Aquele que sai chorando com semente para semear voltará com alegria, trazendo sua colheita."}
"PSA_127_1" {:texto "Cântico dos degraus, de Salomão:Se o SENHOR não estiver edificando a casa, em vão trabalham nela seus construtores; se o SENHOR não estiver guardando a cidade, em vão o guarda vigia."}
"PSA_127_2" {:texto "Inutilmente levantais de madrugada [e] descansais tarde, para comerdes o pão de dores; [porque] assim ele dá sono a quem ele ama."}
"PSA_127_3" {:texto "Eis que os filhos são um presente do SENHOR; o fruto do ventre é uma recompensa."}
"PSA_127_4" {:texto "Como flechas na mão do guerreiro, assim são os filhos da juventude."}
"PSA_127_5" {:texto "Bem-aventurado é o homem que enche deles seu porta-flechas; eles não serão envergonhados, quando falarem com os inimigos à porta."}
"PSA_128_1" {:texto "Cântico dos degraus:Bem-aventurado todo aquele que teme ao SENHOR, [e] anda em seus caminhos."}
"PSA_128_2" {:texto "Porque comerás do trabalho de tuas mãos; tu serás bem-aventurado, e bem lhe [sucederá] ."}
"PSA_128_3" {:texto "Tua mulher será como a videira frutífera, ao lado de tua casa; [e] teus filhos como plantas de oliveira ao redor de tua mesa."}
"PSA_128_4" {:texto "Eis que assim é bendito o homem que teme ao SENHOR."}
"PSA_128_5" {:texto "O SENHOR te abençoará desde Sião, e tu verás o bem de Jerusalém todos os dias de tua vida."}
"PSA_128_6" {:texto "E verás os filhos de teus filhos, [e] a paz sobre Israel."}
"PSA_129_1" {:texto "Cântico dos degraus:Diga Israel: Desde minha juventude muitas vezes me afligiram."}
"PSA_129_2" {:texto "Desde minha juventude, muitas vezes me afligiram, porém não prevaleceram contra mim."}
"PSA_129_3" {:texto "Lavradores lavraram sobre minhas costas, fizeram compridos os seus sulcos."}
"PSA_129_4" {:texto "O SENHOR é justo; ele cortou as cordas dos perversos."}
"PSA_129_5" {:texto "Sejam envergonhados, e voltem para trás todos os que odeiam a Sião."}
"PSA_129_6" {:texto "Sejam como a erva dos telhados, que se seca antes que cresça."}
"PSA_129_7" {:texto "Com que o ceifeiro não enche sua mão, nem o braço daquele que amarra os molhos."}
"PSA_129_8" {:texto "Nem também os que passam, dizem: A bênção do SENHOR seja sobre vós; nós vos bendizemos no nome do SENHOR."}
"PSA_130_1" {:texto "Cântico dos degraus:Das profundezas clamo a ti, SENHOR."}
"PSA_130_2" {:texto "Ouve, Senhor, a minha voz; sejam teus ouvidos atentos à voz de minhas súplicas."}
"PSA_130_3" {:texto "Se tu, SENHOR, considerares todas as perversidades, quem resistirá, Senhor?"}
"PSA_130_4" {:texto "Mas contigo está o perdão, para que tu sejas temido."}
"PSA_130_5" {:texto "Mantenho esperança no SENHOR, a minha alma espera; e persisto em sua palavra."}
"PSA_130_6" {:texto "Minha alma [espera ansiosamente] pelo Senhor, mais que os guardas [esperam] pela manhã, [mais] que os vigilantes pelo alvorecer."}
"PSA_130_7" {:texto "Espere, Israel, pelo SENHOR; porque com o SENHOR há bondade, e com ele muito resgate."}
"PSA_130_8" {:texto "E ele resgatará Israel de todas as suas perversidades."}
"PSA_131_1" {:texto "Cântico dos degraus, de Davi:SENHOR, meu coração não se exaltou, nem meus olhos se levantaram; nem andei em grandezas, nem em coisas maravilhosas para mim."}
"PSA_131_2" {:texto "Ao invés disso, eu me sosseguei e calei minha alma, tal como uma criança com sua mãe; como um bebê está minha alma comigo."}
"PSA_131_3" {:texto "Ó Israel, espere no SENHOR, desde agora para sempre."}
"PSA_132_1" {:texto "Cântico dos degraus:Lembra-te, SENHOR, de Davi, [e] de todas as aflições dele."}
"PSA_132_2" {:texto "Ele, que jurou ao SENHOR, [e] fez um voto ao Poderoso de Jacó,"}
"PSA_132_3" {:texto "[dizendo] : Não entrarei na tenda de minha casa, nem subirei no leito de minha cama;"}
"PSA_132_4" {:texto "Não darei sono aos meus olhos, [nem] cochilo às minhas pálpebras;"}
"PSA_132_5" {:texto "Enquanto eu não achar um lugar para o SENHOR, moradas para o Poderoso de Jacó."}
"PSA_132_6" {:texto "Eis que ouvimos dela em Efrata, e [a] achamos nos campos de Jaar."}
"PSA_132_7" {:texto "Entraremos em suas moradas, [e] nos prostraremos perante o escabelo de seus pés."}
"PSA_132_8" {:texto "Levanta-te, SENHOR, a teu repouso; tu e a arca de teu poder."}
"PSA_132_9" {:texto "Que teus sacerdotes se vistam de justiça, e teus santos gritem de alegria."}
"PSA_132_10" {:texto "Por causa de Davi teu servo, não rejeites o rosto de teu ungido."}
"PSA_132_11" {:texto "O SENHOR jurou a Davi [com] fidelidade; dela não se desviará. [Ele disse] : Do fruto do teu ventre porei sobre o teu trono."}
"PSA_132_12" {:texto "Se teus filhos guardarem meu pacto e meus testemunhos que eu lhes ensinar, também seus filhos se sentarão sobre teu trono para sempre."}
"PSA_132_13" {:texto "Porque o SENHOR escolheu a Sião, desejou-a para sua habitação,"}
"PSA_132_14" {:texto "[Dizendo] : Este é o meu repouso para sempre; aqui habitarei, pois assim desejei."}
"PSA_132_15" {:texto "Abençoarei seu sustento abundantemente, [e] fartarei seus necessitados de pão."}
"PSA_132_16" {:texto "E a seus sacerdotes vestirei de salvação; e seus santos gritarão de alegria abundantemente."}
"PSA_132_17" {:texto "Ali farei brotar o poder de Davi; e preparei uma lâmpada para o meu ungido."}
"PSA_132_18" {:texto "A seus inimigos vestirei de vergonha; mas sobre ele florescerá sua coroa."}
"PSA_133_1" {:texto "Cântico dos degraus, de Davi:Vede como é bom e agradável que irmãos convivam em união!"}
"PSA_133_2" {:texto "É como o óleo precioso sobre a cabeça, que desce pela barba, a barba de Arão; que desce pelas bordas de suas roupas."}
"PSA_133_3" {:texto "É como o orvalho de Hermom, que desce sobre os montes de Sião; porque ali o SENHOR ordenou a bênção [e] a vida para sempre."}
"PSA_134_1" {:texto "Cântico dos degraus:Bendizei, pois, ao SENHOR, todos vós servos do SENHOR, que prestais serviço à casa do SENHOR durante as noites."}
"PSA_134_2" {:texto "Levantai vossas mãos ao Santuário, e bendizei ao SENHOR."}
"PSA_134_3" {:texto "Que o SENHOR, o criador do céu e da terra, te abençoe desde Sião."}
"PSA_135_1" {:texto "Aleluia! Louvai o nome do SENHOR; louvai [-o] vós, servos do SENHOR,"}
"PSA_135_2" {:texto "Que prestais serviço na Casa do SENHOR, nos pátios da Casa do nosso Deus."}
"PSA_135_3" {:texto "Louvai ao SENHOR, porque o SENHOR é bom; cantai louvores ao seu nome, porque é agradável;"}
"PSA_135_4" {:texto "Porque o SENHOR escolheu para si a Jacó, a Israel como propriedade sua;"}
"PSA_135_5" {:texto "Porque eu sei que o SENHOR é grande, e nosso Senhor está acima de todos os deuses."}
"PSA_135_6" {:texto "O SENHOR faz tudo o que quer, nos céus, na terra, nos mares, e [em] todos os abismos."}
"PSA_135_7" {:texto "Ele faz as nuvens subirem desde os confins da terra, faz os relâmpagos com a chuva; ele produz os ventos de seus tesouros."}
"PSA_135_8" {:texto "Ele feriu os primogênitos do Egito, desde os homens até os animais."}
"PSA_135_9" {:texto "Ele enviou sinais e prodígios no meio de ti, Egito; contra Faraó, e contra todos os seus servos."}
"PSA_135_10" {:texto "Ele feriu muitas nações, e matou reis poderosos:"}
"PSA_135_11" {:texto "Seom, rei dos amorreus, e Ogue, rei de Basã; e todos os reinos de Canaã."}
"PSA_135_12" {:texto "E deu a terra deles como herança; como herança a Israel, seu povo."}
"PSA_135_13" {:texto "Ó SENHOR, teu nome [dura] para sempre; [e] tua memória, SENHOR, de geração em geração."}
"PSA_135_14" {:texto "Porque o SENHOR julgará a seu povo; e terá compaixão de seus servos."}
"PSA_135_15" {:texto "Os ídolos das nações [são] prata e ouro; [são] obra de mãos humanas."}
"PSA_135_16" {:texto "Têm boca, mas não falam; têm olhos, mas não veem."}
"PSA_135_17" {:texto "Têm ouvidos, mas não ouvem; não têm respiração em sua boca."}
"PSA_135_18" {:texto "Tornem-se como eles os que os fazem, [e] todos os que confiam neles."}
"PSA_135_19" {:texto "Casa de Israel, bendizei ao SENHOR! Casa de Arão, bendizei ao SENHOR!"}
"PSA_135_20" {:texto "Casa de Levi, bendizei ao SENHOR! Vós que temeis ao SENHOR, bendizei ao SENHOR."}
"PSA_135_21" {:texto "Bendito seja o SENHOR desde Sião, ele que habita em Jerusalém. Aleluia!"}
"PSA_136_1" {:texto "Agradecei ao SENHOR, porque ele é bom, porque sua bondade [dura] para sempre."}
"PSA_136_2" {:texto "Agradecei ao Deus dos deuses, porque sua bondade [dura] para sempre."}
"PSA_136_3" {:texto "Agradecei ao SENHOR dos senhores; porque sua bondade [dura] para sempre."}
"PSA_136_4" {:texto "Ao que faz grandes maravilhas sozinho por si mesmo; porque sua bondade [dura] para sempre."}
"PSA_136_5" {:texto "Ao que fez os céus com entendimento; porque sua bondade [dura] para sempre."}
"PSA_136_6" {:texto "Ao que estendeu a terra sobre as águas; porque sua bondade [dura] para sempre."}
"PSA_136_7" {:texto "Ao que fez as grandes fontes de luz; porque sua bondade [dura] para sempre."}
"PSA_136_8" {:texto "Ao sol, para governar o dia; porque sua bondade [dura] para sempre."}
"PSA_136_9" {:texto "À lua e as estrelas, para governarem a noite; porque sua bondade [dura] para sempre."}
"PSA_136_10" {:texto "Ao que feriu aos egípcios em seus primogênitos; porque sua bondade [dura] para sempre."}
"PSA_136_11" {:texto "E tirou Israel do meio deles; porque sua bondade [dura] para sempre."}
"PSA_136_12" {:texto "Com mão forte, e com braço estendido; porque sua bondade [dura] para sempre."}
"PSA_136_13" {:texto "Ao que separou o mar Vermelho em [duas] partes; porque sua bondade [dura] para sempre."}
"PSA_136_14" {:texto "E fez Israel passar por meio dele; porque sua bondade [dura] para sempre."}
"PSA_136_15" {:texto "E derrubou a Faraó com seu exército no mar Vermelho; porque sua bondade [dura] para sempre."}
"PSA_136_16" {:texto "Ao que guiou seu povo pelo deserto; porque sua bondade [dura] para sempre."}
"PSA_136_17" {:texto "Ao que feriu grandes reis; porque sua bondade [dura] para sempre."}
"PSA_136_18" {:texto "E matou reis poderosos; porque sua bondade [dura] para sempre."}
"PSA_136_19" {:texto "Seom; rei amorreu; porque sua bondade [dura] para sempre."}
"PSA_136_20" {:texto "E Ogue, rei de Basã; porque sua bondade [dura] para sempre."}
"PSA_136_21" {:texto "E deu a terra deles como herança; porque sua bondade [dura] para sempre."}
"PSA_136_22" {:texto "[Como] herança a seu servo Israel; porque sua bondade [dura] para sempre."}
"PSA_136_23" {:texto "O que em nossa humilhação se lembrou de nós; porque sua bondade [dura] para sempre."}
"PSA_136_24" {:texto "E nos tirou livres de nossos adversários; porque sua bondade [dura] para sempre."}
"PSA_136_25" {:texto "O que dá alimento a todo [ser vivo feito de] carne; porque sua bondade [dura] para sempre."}
"PSA_136_26" {:texto "Agradecei ao Deus dos céus; porque sua bondade [dura] para sempre."}
"PSA_137_1" {:texto "Junto aos rios da Babilônia nos sentamos e choramos, enquanto nos lembramos de Sião."}
"PSA_137_2" {:texto "Sobre os salgueiros que há no meio dela penduramos nossas harpas."}
"PSA_137_3" {:texto "Porque ali os que tinham nos capturado nos pediam letras de canções, e os que nos destruíram, que [os] alegrássemos, [dizendo] : Cantai para nós [algumas] das canções de Sião."}
"PSA_137_4" {:texto "Como cantaríamos canções do SENHOR em terra estrangeira?"}
"PSA_137_5" {:texto "Se eu me esquecer de ti, ó Jerusalém, que minha mão direita se esqueça [de sua habilidade] ."}
"PSA_137_6" {:texto "Que minha língua grude no céu da boca se eu não me lembrar de ti, se eu não pôr Jerusalém acima de todas as minhas alegrias."}
"PSA_137_7" {:texto "Lembra-te, SENHOR, dos filhos de Edom no dia de Jerusalém, que diziam: Arruinai [-a] ,arruinai [-a] ,até ao seus fundamentos!"}
"PSA_137_8" {:texto "Ah filha de Babilônia, que serás destruída! Bem-aventurado a quem te retribuir o que fizeste conosco."}
"PSA_137_9" {:texto "Bem-aventurado aquele que tomar dos teus filhos, e [lançá-los] contra as pedras."}
"PSA_138_1" {:texto "Salmo de Davi:Louvarei a ti com todo o meu coração; na presença dos deuses cantarei louvores a ti."}
"PSA_138_2" {:texto "Eu me prostrarei ao teu santo templo, e louvarei o teu nome por tua bondade e por tua verdade; porque engrandeceste tua palavra [e] teu nome acima de tudo."}
"PSA_138_3" {:texto "No dia [em que] clamei, tu me respondeste; [e] me fortaleceste [com] força em minha alma."}
"PSA_138_4" {:texto "Todos os reis da terra louvarão a ti, SENHOR, quando ouvirem as palavras de tua boca."}
"PSA_138_5" {:texto "E cantarão sobre os caminhos do SENHOR, pois grande [é] a glória do SENHOR."}
"PSA_138_6" {:texto "Porque [mesmo] sendo SENHOR elevado, ele presta atenção ao humilde; porém ele reconhece o arrogante de longe."}
"PSA_138_7" {:texto "Enquanto ando no meio da angústia, tu me vivificas; tu estendes tua mão contra a ira de meus inimigos; e tua mão direita me salva."}
"PSA_138_8" {:texto "O SENHOR fará por completo [o que ele tem] para mim; ó SENHOR, tua bondade [dura] para sempre; não abandones as obras de tuas mãos."}
"PSA_139_1" {:texto "Salmo de Davi, para o regente:SENHOR, tu me examinas e me conheces."}
"PSA_139_2" {:texto "Tu sabes o meu sentar e o meu caminhar; de longe entendes meus pensamentos."}
"PSA_139_3" {:texto "Tu cercas o meu andar e meu deitar; conheces desde antes os meus caminhos."}
"PSA_139_4" {:texto "Mesmo não havendo [ainda] palavra [alguma] em minha língua, eis, SENHOR, que já sabes tudo."}
"PSA_139_5" {:texto "Tu me envolves por detrás e pela frente, e pões tua mão sobre mim."}
"PSA_139_6" {:texto "[Teu] conhecimento é maravilhoso demais para mim, tão alto que não posso [alcançá] -lo."}
"PSA_139_7" {:texto "Para onde eu escaparia de teu Espírito? E para onde fugiria de tua presença?"}
"PSA_139_8" {:texto "Se eu subisse até os céus, lá tu [estás] ; se eu fizer meu leito no Xeol, eis que tu [também ali estás] ."}
"PSA_139_9" {:texto "Se eu tomasse as asas do amanhecer, e morasse nas extremidades do mar,"}
"PSA_139_10" {:texto "Até ali tua mão me guiaria, e tua mão direita me seguraria."}
"PSA_139_11" {:texto "Se eu dissesse: Certamente as trevas me encobrirão; e a luz ao redor de mim [será como] a noite."}
"PSA_139_12" {:texto "Porém nem mesmo as trevas [me] esconderão de ti; ao invés disso, [pois] a noite é tão clara quanto o dia, [e aos teus olhos] as trevas são como a luz."}
"PSA_139_13" {:texto "Porque tu és dono do meu ser, e me cobriste no ventre da minha mãe."}
"PSA_139_14" {:texto "Eu te louvarei porque de um [jeito] assombroso e maravilhoso eu fui feito; maravilhosas [são] tuas obras; e minha alma sabe muito bem."}
"PSA_139_15" {:texto "Meus ossos não estavam escondidos de ti quando eu fui feito em oculto, e formado como tramas de tecido nas profundezas da terra."}
"PSA_139_16" {:texto "Teus olhos viram meu corpo [ainda] sem forma, e tudo estava escrito em teu livro; [até] os dias estavam determinados quando nenhum deles [ainda] havia."}
"PSA_139_17" {:texto "Como são preciosos para mim os teus pensamentos, Deus! Como é grande a quantidade deles!"}
"PSA_139_18" {:texto "Se eu os contasse, seriam muito mais [numerosos] que a areia; [quando] acordo, ainda estou contigo."}
"PSA_139_19" {:texto "Ah, Deus, tomara que mates ao perverso! E vós, homens sanguinários, afastai-vos de mim;"}
"PSA_139_20" {:texto "Porque eles falam de ti com maldade, [e] teus inimigos [se] exaltam em vão."}
"PSA_139_21" {:texto "Por acaso, SENHOR, eu não odiaria aos que te odeiam? E não detestaria os que se levantam contra ti?"}
"PSA_139_22" {:texto "Eu os odeio com ódio completo; eu os considero como inimigos."}
"PSA_139_23" {:texto "Examina-me, Deus, e conhece meu coração; prova-me, e conhece meus pensamentos."}
"PSA_139_24" {:texto "E vê se em mim [há algum] mau caminho; e guia-me pelo caminho eterno."}
"PSA_140_1" {:texto "Salmo de Davi, para o regente:Livra-me do homem mau, SENHOR; guarda-me dos homens violentos,"}
"PSA_140_2" {:texto "Que pensam maldades no coração; todo dia se reúnem para fazerem guerra."}
"PSA_140_3" {:texto "Eles afiam suas línguas como a cobra; veneno de serpentes [há] debaixo de seus lábios. (Selá)"}
"PSA_140_4" {:texto "Guarda-me, SENHOR, das mãos do perverso; guarda-me do homens violentos, que pensam em empurrar os meus pés."}
"PSA_140_5" {:texto "Os arrogantes me armaram ciladas e cordas; estenderam uma rede de um lado do caminho; [e] puseram laços de armadilhas para mim. (Selá)"}
"PSA_140_6" {:texto "Eu disse ao SENHOR: Tu [és] meu Deus; inclina teus ouvidos à voz de minhas súplicas, SENHOR."}
"PSA_140_7" {:texto "Ó Senhor DEUS, força de minha salvação, cobriste minha cabeça no dia da batalha."}
"PSA_140_8" {:texto "Não concedas ao perverso os desejos dele, SENHOR; não permitas suceder seu plano maligno, [pois senão] se exaltariam. (Selá)"}
"PSA_140_9" {:texto "Quanto à cabeça dos que me cercam, que a opressão de seus próprios lábios os cubra."}
"PSA_140_10" {:texto "Caiam sobre eles brasas vivas; faça-os cair no fogo [e] em covas profundas, [para que] não se levantem mais."}
"PSA_140_11" {:texto "O homem de língua maligna não se firmará na terra; o mal perseguirá o homem violento até o derrubar."}
"PSA_140_12" {:texto "Eu sei que o SENHOR cumprirá a causa do aflito, o direito dos necessitados."}
"PSA_140_13" {:texto "Certamente os justos agradecerão ao teu nome; os corretos habitarão perante teu rosto."}
"PSA_141_1" {:texto "Salmo de Davi:Ó SENHOR, eu clamo a ti; apressa-te a mim; ouve minha voz, quando eu clamar a ti."}
"PSA_141_2" {:texto "Apresente-se minha oração [como] incenso diante de ti; [e] o levantar de minhas mãos [como] a oferta do anoitecer."}
"PSA_141_3" {:texto "Põe, SENHOR, uma guarda em minha boca; vigia a abertura dos meus lábios."}
"PSA_141_4" {:texto "Não inclines meu coração para as coisas más, para fazer o mal junto com homens que praticam maldade; e não coma eu das delícias deles."}
"PSA_141_5" {:texto "Que o justo me faça o favor de me espancar e me repreender; [isto me será] azeite sobre a cabeça; minha cabeça não rejeitará, porque ainda orarei contra as maldades deles."}
"PSA_141_6" {:texto "[Quando] seus juízes forem lançados contra a rocha, então ouvirão minhas palavras, porque [são] agradáveis."}
"PSA_141_7" {:texto "Como quem lavra e fende a terra, assim nossos ossos são espalhados à entrada do Xeol."}
"PSA_141_8" {:texto "Porém meus olhos [estão voltados] para ti, ó Senhor DEUS; em ti confio; não desampares minha alma."}
"PSA_141_9" {:texto "Guarda-me do perigo da armadilha que me prepararam; e dos laços da cilada dos que praticam maldade."}
"PSA_141_10" {:texto "Caiam os perversos cada um em suas próprias redes, e eu passe adiante [em segurança] ."}
"PSA_142_1" {:texto "Instrução de Davi; oração quando ele estava na caverna:Com minha voz clamo ao SENHOR; com minha voz suplico ao SENHOR."}
"PSA_142_2" {:texto "Diante dele derramo meu pedido; diante dele contei minha angústia."}
"PSA_142_3" {:texto "Estando meu espírito angustiado em mim, tu conheceste meu percurso; no caminho em que eu andava esconderam um laço de armadilha para mim."}
"PSA_142_4" {:texto "Eu olho à direita, e eis que não há quem me conheça; não há nenhum refúgio para mim; nem ninguém se importava com minha alma."}
"PSA_142_5" {:texto "Eu clamo a ti, SENHOR, dizendo: Tu és meu refúgio, [e] minha porção na terra dos viventes."}
"PSA_142_6" {:texto "Presta atenção aos meus gritos, porque estou muito oprimido; resgata-me daqueles que me perseguem, pois são mais fortes que eu."}
"PSA_142_7" {:texto "Tira minha alma da prisão, para que eu louve o teu nome; os justos me rodearão, porque tu me tratarás bem."}
"PSA_143_1" {:texto "Salmo de Davi:Ó SENHOR, ouve minha oração; inclina teus ouvidos às minhas súplicas; responde-me segundo tua fidelidade [e] tua justiça."}
"PSA_143_2" {:texto "E não entres em juízo com teu servo; porque nenhum ser vivo será justo diante de ti."}
"PSA_143_3" {:texto "Pois o inimigo persegue minha alma, atropela na terra a minha vida; [e] me obriga a viver na escuridão, como os que há muito [tempo] morreram."}
"PSA_143_4" {:texto "Por isso meu espírito se enche de angústia em mim, [e] meu coração está desesperado dentro de mim."}
"PSA_143_5" {:texto "Lembro-me dos dias antigos, eu considero todos os teus feitos; medito nas obras de tuas mãos."}
"PSA_143_6" {:texto "Levanto minhas mãos a ti; minha alma [tem sede] de ti como a terra seca."}
"PSA_143_7" {:texto "Responde-me depressa, SENHOR; porque meu espírito está muito fraco; não escondas tua face de mim, pois eu seria semelhante aos que descem à cova."}
"PSA_143_8" {:texto "De madrugada faze com que eu ouça tua bondade, porque em ti confio; faze-me saber o caminho que devo seguir, porque a ti levanto minha alma."}
"PSA_143_9" {:texto "Livra-me de meus inimigos, SENHOR; [pois] em ti eu me escondo."}
"PSA_143_10" {:texto "Ensina-me a fazer a tua vontade, pois tu és meu Deus; teu bom Espírito me guie por terra plana."}
"PSA_143_11" {:texto "Vivifica-me por teu nome, SENHOR; por tua justiça tira minha alma da angústia."}
"PSA_143_12" {:texto "E por tua bondade extermina os meus inimigos; e destrói a todos os que afligem a minha alma; pois eu sou teu servo."}
"PSA_144_1" {:texto "Salmo de Davi:Bendito [seja] o SENHOR, rocha minha, que ensina minhas mãos para a batalha, [e] meus dedos para a guerra."}
"PSA_144_2" {:texto "[Ele é] minha bondade e meu castelo; meu alto refúgio, e meu libertador; [ele é] meu escudo, em quem confio; [e] aquele que faz meu povo se submeter a mim."}
"PSA_144_3" {:texto "Ó SENHOR, o que é o homem para que lhe dês atenção? [E] o filho do homem, para que com ele te importes?"}
"PSA_144_4" {:texto "O homem é semelhante a um sopro; seus dias, como a sombra que passa."}
"PSA_144_5" {:texto "Ó SENHOR, abaixa teus céus, e desce; toca os montes, e fumeguem."}
"PSA_144_6" {:texto "Lança relâmpagos, e os dispersa; envia tuas flechas, e os derrota."}
"PSA_144_7" {:texto "Estende tuas mãos desde o alto; livra-me, e resgata-me das muitas águas, das mãos dos filhos de estrangeiros;"}
"PSA_144_8" {:texto "Cuja boca fala coisas inúteis, e sua mão direita é a mão direita da mentira."}
"PSA_144_9" {:texto "Ó Deus, a ti cantarei uma canção nova; com harpa [e] instrumento de dez cordas tocarei música a ti."}
"PSA_144_10" {:texto "[Tu és] o que dás vitória aos reis, [e] livras a Davi, teu servo, da espada maligna."}
"PSA_144_11" {:texto "Livra-me e resgata-me das mãos dos filhos de estrangeiros; cuja boca fala mentiras, e sua mão direita é mão direita de falsidade."}
"PSA_144_12" {:texto "Para que nossos filhos [sejam] como plantas, que crescem em sua juventude; [e] nossas filhas [sejam] como esquinas entalhadas ao modo do palácio."}
"PSA_144_13" {:texto "Nossos celeiros sejam cheios de todos os tipos de mantimentos; nosso gado seja aos milhares, e dezenas de milhares em nossos campos."}
"PSA_144_14" {:texto "Nossos bois sejam vigorosos; não haja nem assalto, nem fugas, nem gritos em nossas ruas."}
"PSA_144_15" {:texto "Bem-aventurado é o povo que assim lhe [acontece] ; bem-aventurado é o povo cujo Deus é o SENHOR!"}
"PSA_145_1" {:texto "Cântico de Davi:Eu te exaltarei, meu Deus [e] Rei; e bendirei teu nome para todo o sempre."}
"PSA_145_2" {:texto "Todo dia eu te bendirei, e louvarei teu nome para todo o sempre."}
"PSA_145_3" {:texto "O SENHOR é grande e muito louvável; sua grandeza é incompreensível."}
"PSA_145_4" {:texto "Geração após geração louvará tuas obras, e anunciarão tuas proezas."}
"PSA_145_5" {:texto "Eu falarei da honra gloriosa de tua majestade, e de teus feitos maravilhosos."}
"PSA_145_6" {:texto "E falarão do poder de teus assombrosos feitos; e eu contarei tua grandeza."}
"PSA_145_7" {:texto "Declararão a lembrança de tua grande bondade; e anunciarão tua justiça alegremente."}
"PSA_145_8" {:texto "Piedoso e misericordioso é o SENHOR; ele demora para se irar, e tem grande bondade."}
"PSA_145_9" {:texto "O SENHOR é bom para com todos; e suas misericórdias [estão] sobre todas as obras que ele fez."}
"PSA_145_10" {:texto "Todas as tuas obras louvarão a ti, SENHOR; e teus santos te bendirão."}
"PSA_145_11" {:texto "Contarão a glória de teu reino, e falarão de teu poder."}
"PSA_145_12" {:texto "Para anunciarem aos filhos dos homens suas proezas, e a honra gloriosa de seu reino."}
"PSA_145_13" {:texto "Teu reino é um reino eterno, e teu domínio [dura] geração após geração."}
"PSA_145_14" {:texto "O SENHOR segura todos os que caem, e levanta todos os abatidos."}
"PSA_145_15" {:texto "Os olhos de todos esperam por ti, e tu lhes dás seu alimento ao seu tempo."}
"PSA_145_16" {:texto "Tu abres tua mão, e sacias o desejo de todo ser vivo."}
"PSA_145_17" {:texto "O SENHOR [é] justo em todos os seus caminhos, e bondoso em todas as suas obras."}
"PSA_145_18" {:texto "O SENHOR está perto de todos os que o chamam; de todos os que clamam a ele sinceramente."}
"PSA_145_19" {:texto "Ele faz a vontade dos que o temem; e ouve o clamor deles, e os salva."}
"PSA_145_20" {:texto "O SENHOR protege a todos os que o amam; porém destrói a todos os perversos."}
"PSA_145_21" {:texto "Minha boca anunciará louvores ao SENHOR; e todo [ser feito de] carne louvará seu santo nome para todo o sempre."}
"PSA_146_1" {:texto "Aleluia! Louva ao SENHOR, ó minha alma!"}
"PSA_146_2" {:texto "Louvarei ao SENHOR durante [toda] a minha vida; cantarei louvores a meu Deus enquanto eu [existir] ."}
"PSA_146_3" {:texto "Não ponhas tua confiança em príncipes; em filhos de homens, em quem não há salvação."}
"PSA_146_4" {:texto "O espírito dele [s] sai, e volta para sua terra; naquele mesmo dia seus pensamentos perecem."}
"PSA_146_5" {:texto "Bem-aventurado aquele que [tem] o Deus de Jacó como sua ajuda, cuja esperança está no SENHOR seu Deus;"}
"PSA_146_6" {:texto "Que fez os céus e a terra, o mar, e tudo o que neles [há] ; que guarda a fidelidade para sempre."}
"PSA_146_7" {:texto "Que faz juízo aos oprimidos, que dá pão aos famintos; o SENHOR solta aos presos."}
"PSA_146_8" {:texto "O SENHOR abre [os olhos] dos cegos; o SENHOR levanta aos abatidos; o SENHOR ama aos justos."}
"PSA_146_9" {:texto "O SENHOR guarda os estrangeiros; sustenta o órfão e a viúva; mas põe dificuldades ao caminho dos perversos."}
"PSA_146_10" {:texto "O SENHOR reinará eternamente. Ó Sião, o teu Deus [reinará] geração após geração. Aleluia!"}
"PSA_147_1" {:texto "Louvai ao SENHOR, porque é bom cantar louvores ao nosso Deus; porque agradável e merecido [é] o louvor."}
"PSA_147_2" {:texto "O SENHOR edifica a Jerusalém; [e] ajunta os dispersos de Israel."}
"PSA_147_3" {:texto "Ele sara aos de coração partido, e os cura de suas dores."}
"PSA_147_4" {:texto "Ele conta o número das estrelas; chama todas elas pelos seus nomes."}
"PSA_147_5" {:texto "O nosso Senhor é grande e muito poderoso; seu entendimento é incomensurável."}
"PSA_147_6" {:texto "O SENHOR levanta aos mansos; [e] abate aos perversos até a terra."}
"PSA_147_7" {:texto "Cantai ao SENHOR em agradecimento; cantai louvores ao nosso Deus com harpa."}
"PSA_147_8" {:texto "Ele que cobre o céu com nuvens, que prepara chuva para a terra, que faz os montes produzirem erva;"}
"PSA_147_9" {:texto "Que dá ao gado seu pasto; e [também] aos filhos dos corvos, quando clamam."}
"PSA_147_10" {:texto "Ele não se agrada da força do cavalo, nem se contenta com as pernas do homem."}
"PSA_147_11" {:texto "O SENHOR se agrada dos que o temem, daqueles que esperam por sua bondade."}
"PSA_147_12" {:texto "Louva, Jerusalém, ao SENHOR; celebra ao teu Deus, ó Sião."}
"PSA_147_13" {:texto "Porque ele fortifica os ferrolhos de tuas portas; ele abençoa a teus filhos dentro de ti."}
"PSA_147_14" {:texto "[Ele é] o que dá paz às tuas fronteiras; e te farta com o melhor trigo;"}
"PSA_147_15" {:texto "Que envia sua ordem à terra; sua palavra corre velozmente."}
"PSA_147_16" {:texto "Que dá a neve como a lã; espalha a geada como a cinza."}
"PSA_147_17" {:texto "Que lança seu gelo [em] pedaços; quem pode subsistir ao seu frio?"}
"PSA_147_18" {:texto "Ele manda sua palavra, e os faz derreter; faz soprar seu vento, [e] escorrem-se as águas."}
"PSA_147_19" {:texto "Ele declara suas palavras a Jacó; e seus estatutos e seus juízos a Israel."}
"PSA_147_20" {:texto "Ele não fez assim a nenhuma [outra] nação; [e] não conhecem os juízos [dele] . Louvai ao SENHOR."}
"PSA_148_1" {:texto "Aleluia! Louvai ao SENHOR desde os céus; louvai-o nas alturas."}
"PSA_148_2" {:texto "Louvai-o todos os seus anjos; louvai-o todos os seus exércitos."}
"PSA_148_3" {:texto "Louvai-o, sol e lua; louvai-o, todas as estrelas luminosas."}
"PSA_148_4" {:texto "Louvai-o, céus dos céus, e as águas que [estais] sobre os céus."}
"PSA_148_5" {:texto "Louvem ao nome do SENHOR; porque pela ordem dele foram criados."}
"PSA_148_6" {:texto "E os firmou para todo o sempre; e deu [tal] decreto, que não será traspassado."}
"PSA_148_7" {:texto "Louvai ao SENHOR [vós] da terra: os monstros marinhos, e todos os abismos;"}
"PSA_148_8" {:texto "O fogo e a saraiva, a neve e o vapor; o vento tempestuoso, que executa sua palavra."}
"PSA_148_9" {:texto "Os montes e todos os morros; árvores frutíferas, e todos os cedros."}
"PSA_148_10" {:texto "As feras, e todo o gado; répteis, e aves que tem asas."}
"PSA_148_11" {:texto "Os reis da terra, e todos os povos; os príncipes, e todos os juízes da terra."}
"PSA_148_12" {:texto "Os rapazes, e também as moças; os velhos com os jovens."}
"PSA_148_13" {:texto "Louvem ao nome do SENHOR; pois só o nome dele é exaltado; sua majestade [está] sobre a terra e o céu."}
"PSA_148_14" {:texto "E ele exaltou o poder de seu povo: o louvor de todos os seus santos, os filhos de Israel, o povo [que está] perto dele. Aleluia!"}
"PSA_149_1" {:texto "Aleluia! Cantai ao SENHOR um cântico novo; [haja] louvor a ele na congregação dos santos."}
"PSA_149_2" {:texto "Alegre-se Israel em seu Criador; os filhos de Sião se encham de alegria em seu Rei."}
"PSA_149_3" {:texto "Louvem seu nome com danças; cantai louvores a ele com tamborim e harpa."}
"PSA_149_4" {:texto "Porque o SENHOR se agrada de seu povo; ele ornará os mansos com salvação."}
"PSA_149_5" {:texto "Saltem de prazer [seus] santos pela glória; fiquem contentes sobre suas camas."}
"PSA_149_6" {:texto "Exaltações a Deus [estarão] em suas gargantas; e espada afiada [estará] em sua mão,"}
"PSA_149_7" {:texto "Para se vingarem das nações, e repreenderem aos povos."}
"PSA_149_8" {:texto "Para prenderem a seus reis com correntes, e seus nobres com grilhões de ferro;"}
"PSA_149_9" {:texto "Para executarem sobre eles a sentença escrita; esta [será] a glória de todos os seus santos. Aleluia!"}
"PSA_150_1" {:texto "Aleluia! Louvai a Deus em seu santuário; louvai-o no firmamento de seu poder."}
"PSA_150_2" {:texto "Louvai-o por suas proezas; louvai-o conforme a imensidão de sua grandeza."}
"PSA_150_3" {:texto "Louvai-o com com de trombeta; louvai-o com lira e harpa."}
"PSA_150_4" {:texto "Louvai-o com tamborim e flauta; louvai-o com instrumentos de cordas e de sopro."}
"PSA_150_5" {:texto "Louvai-o com címbalos bem sonoros; louvai-o com címbalos de sons de alegria."}
"PSA_150_6" {:texto "Tudo quanto tem fôlego, louve ao SENHOR! Aleluia!"}
                  }
  )

(defn getlivro [p] ((referencia p) :texto))

(defn qte-versos [p] ([6 12 8 8 12 10 17 9 20 18 7 8 6 7 5 11 15 50 14 9 13 31 6 10 22 12 14 9 11 12 24 11 22 22 28 12 40 22 13 17 13 11 5 26 17 11 9 14 20 23 19 9 6 7 23 13 11 11 17 12 8 12 11 10 13 20 7 35 36 5 24 20 28 23 10 12 20 72 13 19 16 8 18 12 13 17 7 18 52 17 16 15 5 23 11 13 12 9 9 5 8 28 22 35 45 48 43 13 31 7 10 10 9 8 18 19 2 29 176 7 8 9 4 8 5 6 5 6 8 8 3 18 3 3 21 26 9 8 24 13 10 7 12 15 21 10 20 14 9 6] (- p 1)))

;
; criar a lista de quantidade de versos por capitulo
;

;usado no REPL para pegar os dados do arquivo texto e converter em lista de strings 
;(defn get-lista-salmos [] (with-open 
;                           [rdr 
;                            (clojure.java.io/reader "/home/s817842443/Estudos/clojure-prj/bliv-tr-salmos-vpl.txt")
;                            ] 
;                            (reduce conj [] (line-seq rdr))))

(defn getTexto [frase] (subs frase (+ 1 (clojure.string/index-of frase " "))))

(defn getId [frase] (clojure.string/replace (subs frase 0 (clojure.string/index-of frase " ")) ":" "_"))

;
; coloca no formato certo de mapa
;(for [item lista] (println (str "\"" (getId item) "\"" " {:texto \"" (getTexto item) "\"}")))
;
;"ID" {:texto "TEXTO"}

;
; retirei o plugin do calva pois estava atrapalhando o desenvolvimento
; não deixando apagar os parentesis ou colchetes no final da sentença
;
