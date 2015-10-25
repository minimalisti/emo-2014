<!DOCTYPE html>
<html>
    <head>
        <title>Olio-ohjelmointi</title>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/js/libs/twitter-bootstrap/css/bootstrap.css"/>
        <link rel="stylesheet" href="/css/style.css"/>
        <link rel="stylesheet" href="/css/${materialType}_style.css"/>
    </head>
    <body>

        <div class="container">
            <form id="forward" action="/app/submit-material-${materialId}-seen" method="POST">
                <input type="hidden" name="visitStarted" id="visitStartedF"/>
                <input type="hidden" name="visitEnded" id="visitEndedF"/>                
                <button type="button" class="btn btn-primary" id="forwardButton">Eteenp‰in</button>
            </form>

            <form action="/app/submit-material-${materialId}-seen-back" method="POST" id="backward">
                <input type="hidden" name="visitStarted" id="visitStartedB"/>
                <input type="hidden" name="visitEnded" id="visitEndedB"/>
                <button type="button" class="btn btn-primary" id="backwardButton">Taaksep‰in</button>
            </form>          
            <div class="spacer"></div>

            <h3>Oliot ihmisenkaltaisina toimijoina</h3>

            <p>Olio-ohjelmoinnin ymm‰rt‰misess‰ voi auttaa ajatusleikki, jossa 
                <span class="object">oliot</span> miellet‰‰n ihmism‰isiksi 
                <strong><em>toimijoiksi</em></strong>. Kukin 
                <span class="object">olio</span> on, jos ei "‰lyk‰s", niin ainakin 
                "kyvyk‰s" omalla rajallisella tavallaan:</p>

            <ul>
                <li>Kukin <span class="object">olio</span> "tiet‰‰", 
                    millainen se itse on, eli tuntee omat <span class="attribute">ominaisuutensa</span>. 
                    Esimerkiksi <span class="object">auto-olio</span> tiet‰‰ 
                    <span class="attribute">tankissa olevan bensan m‰‰r‰n</span> ja 
                    <span class="object">kurssiolio</span> kurssille 
                    <span class="attribute">ilmoittautuneet opiskelijat</span>.</li>
                <li><span class="object">Olio</span> osaa vastaanottaa 
                    <span class="message">viestej‰</span>
                    ("k‰skyj‰", "pyyntˆj‰") sen mukaisesti, millaiset 
                    <span class="method">metodit</span> 
                    sille on m‰‰ritelty. Esimerkiksi <span class="object">kurssioliota</span> 
                    voi komentaa kirjaamaan opiskelijan ilmoittautuneeksi, 
                    <span class="object">auto-oliota</span> tankkaamaan itsens‰ 
                    tai <span class="object">tiedosto-oliota</span> poistamaan 
                    edustamansa datan kovalevylt‰. <span class="object">Olio</span> 
                    ei osaa vastaanottaa sellaista k‰sky‰, jota vastaavaa 
                    <span class="method">metodia</span> sill‰ ei ole.</li>
                <li>Kullakin <span class="object">oliolla</span> on tietty k‰ytt‰ytymismalli, 
                    joka m‰‰r‰‰, miten <span class="object">olio</span> reagoi 
                    vastaanottamiinsa k‰skyihin. K‰ytt‰ytymismallin m‰‰rittelee 
                    ohjelmoija hyˆdynt‰en ohjelmointikielen tarjoamia mahdollisuuksia. 
                    <span class="object">Olio</span> voidaan m‰‰ritell‰ esimerkiksi suorittamaan 
                    laskutoimituksia, kirjaamaan tietoja muistiin, l‰hett‰m‰‰n viestej‰ 
                    muille <span class="object">olioille</span>, luomaan uusia 
                    <span class="object">olioita</span> jne.</li>
                <li><span class="object">Olio</span> on ehdottoman "kuuliainen" 
                    ja noudattaa ohjelmoijan sille antamia ohjeita pilkulleen. 
                    Olio-ohjelmointi(kin) vaatii siis huolellisuutta, t‰sm‰llisyytt‰ 
                    ja yksiselitteist‰ kielt‰.</li>
            </ul>

            <h4>Olioiden v‰linen viestint‰</h4>

            <p><span class="object">Olioiden</span> kykyj‰ k‰ytt‰en 
                        ja yhdistellen saadaan aikaan ongelman ratkaisemisen kannalta 
                        hyˆdyllist‰ toimintaa. Tarkastellaan t‰t‰ esimerkin avulla:</p>
            <p>Ajatellaan kuvitteellista sovellusohjelmaa, jonka avulla opiskelija 
                voi ilmoittautua kursseille klikkaamalla kyseiseen kurssiin 
                liittyv‰‰ nappia ohjelman k‰yttˆliittym‰ss‰. T‰llˆin ohjelman 
                tulee selvitt‰‰, onnistuuko ilmoittautuminen. Ilmoittautuminen 
                onnistuu, jos saliin mahtuu ja jos sama opiskelija ei ole jo 
                ennest‰‰n ilmoittautunut. Ilmoittautumisen onnistuessa t‰ytyy 
                kirjata sek‰ opiskelija kurssin opiskelijaluetteloon ett‰ kyseinen 
                kurssi opiskelijan omiin kursseihin.</p>
            <p>Ohjelman <span class="object">oliot</span> hyˆdynt‰v‰t toistensa 
                <span class="method">metodeita</span> eli "komentavat toisiaan". Ne toimivat yhteen suorittaakseen 
                erilaisia teht‰vi‰. Ohjelman suoritus muodostuu <span class="object">olioiden</span> 
                v‰lisest‰ <span class="message">viestinn‰st‰</span> ja viesteihin reagoinnista. Seuraavilla 
                sivuilla on kuvattu ohjelman toiminta yleisell‰ tasolla er‰‰ss‰ esimerkkitapauksessa.</p>


        </div>

        <script src="/js/libs/jquery/jquery.js"></script>
        <script src="/js/libs/twitter-bootstrap/js/bootstrap.js"></script>

        <script>
            $(function () {
                var tmpTime = new Date();
                $("#visitStartedF").val(tmpTime);
                $("#visitStartedB").val(tmpTime);

                $("#forwardButton").click(function () {
                    $("#visitEndedF").val(new Date());
                    $("#forward").submit();
                });

                $("#backwardButton").click(function () {
                    $("#visitEndedB").val(new Date());
                    $("#backward").submit();
                });
            });
        </script>
    </body>
</html>
