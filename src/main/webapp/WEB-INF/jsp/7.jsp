<!DOCTYPE html>
<html>
    <head>
        <title>Olio-ohjelmointi</title>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/js/libs/twitter-bootstrap/css/bootstrap.css"/>
        <link rel="stylesheet" href="/css/style.css"/>
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

            <p>Olio-ohjelmoinnin ymm‰rt‰misess‰ voi auttaa ajatusleikki, jossa oliot miellet‰‰n ihmism‰isiksi <strong><em>toimijoiksi</em></strong>. Kukin olio on, jos ei "‰lyk‰s", niin ainakin "kyvyk‰s" omalla rajallisella tavallaan:</p>

            <ul>
                <li>Kukin olio "tiet‰‰", millainen se itse on, eli tuntee omat ominaisuutensa. Esimerkiksi auto-olio tiet‰‰ tankissa olevan bensan m‰‰r‰n ja kurssiolio kurssille ilmoittautuneet opiskelijat.</li>
                <li>Olio osaa vastaanottaa viestej‰ ("k‰skyj‰", "pyyntˆj‰") sen mukaisesti, millaiset metodit sille on m‰‰ritelty. Esimerkiksi kurssioliota voi komentaa kirjaamaan opiskelijan ilmoittautuneeksi, auto-oliota tankkaamaan itsens‰ tai tiedosto-oliota poistamaan edustamansa datan kovalevylt‰. Olio ei osaa vastaanottaa sellaista k‰sky‰, jota vastaavaa metodia sill‰ ei ole.</li>
                <li>Kullakin oliolla on tietty k‰ytt‰ytymismalli, joka m‰‰r‰‰, miten olio reagoi vastaanottamiinsa k‰skyihin. K‰ytt‰ytymismallin m‰‰rittelee ohjelmoija hyˆdynt‰en ohjelmointikielen tarjoamia mahdollisuuksia. Olio voidaan m‰‰ritell‰ esimerkiksi suorittamaan laskutoimituksia, kirjaamaan tietoja muistiin, l‰hett‰m‰‰n viestej‰ muille olioille, luomaan uusia olioita jne.</li>
                <li>Olio on ehdottoman "kuuliainen" ja noudattaa ohjelmoijan sille antamia ohjeita pilkulleen. Olio-ohjelmointi(kin) vaatii siis huolellisuutta, t‰sm‰llisyytt‰ ja yksiselitteist‰ kielt‰.</li>
            </ul>

            <h4>Olioiden v‰linen viestint‰</h4>

            <p>Olioiden kykyj‰ k‰ytt‰en ja yhdistellen saadaan aikaan ongelman ratkaisemisen kannalta hyˆdyllist‰ toimintaa. Tarkastellaan t‰t‰ esimerkin avulla:</p>
            <p>Ajatellaan kuvitteellista sovellusohjelmaa, jonka avulla opiskelija voi ilmoittautua kursseille klikkaamalla kyseiseen kurssiin liittyv‰‰ nappia ohjelman k‰yttˆliittym‰ss‰. T‰llˆin ohjelman tulee selvitt‰‰, onnistuuko ilmoittautuminen. Ilmoittautuminen onnistuu, jos saliin mahtuu ja jos sama opiskelija ei ole jo ennest‰‰n ilmoittautunut. Ilmoittautumisen onnistuessa t‰ytyy kirjata sek‰ opiskelija kurssin opiskelijaluetteloon ett‰ kyseinen kurssi opiskelijan omiin kursseihin.</p>
            <p>Ohjelman oliot hyˆdynt‰v‰t toistensa metodeita eli "komentavat toisiaan". Ne toimivat yhteen suorittaakseen erilaisia teht‰vi‰. Ohjelman suoritus muodostuu olioiden v‰lisest‰ viestinn‰st‰ ja viesteihin reagoinnista. Seuraavilla sivuilla on kuvattu ohjelman toiminta yleisell‰ tasolla er‰‰ss‰ esimerkkitapauksessa.</p>


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
