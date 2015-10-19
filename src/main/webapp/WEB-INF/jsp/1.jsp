<!DOCTYPE html>
<html>
    <head>
        <title>Kommunikaatio-ongelma</title>
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

            <form action="/esikysely.html" id="backward">
                <button type="button" class="btn btn-primary" id="backwardButton">Taustakyselyyn</button>
            </form>

            <div class="spacer"></div>

            <h3>Kommunikaatio-ongelma</h3>

            <img class="kuvitus" src="/img/${materialType}/kommunikaatio-ongelma.png"/>

            <p>Tietokoneohjelmien on usein tarpeen k‰sitell‰ monimutkaista dataa. Halutaan, ett‰ ohjelma "tallentaa tiedoston", "ilmoittaa opiskelijan kurssille", "reagoi nappulan painallukseen", "nostaa rahaa tililt‰", "valitsee pelaajan seuraavan siirron", "kirjata asiakas hotelliin", jne.</p>

            <p>Ihmisajattelu ja -kieli on k‰sitteellist‰, mutta tietokone ei ymm‰rr‰ reaalimaailman k‰sitteit‰. Mik‰ on "kurssi", "opiskelija", "hotelli" tai "pankkitili"? Ohjelmointikieli ei voi sis‰lt‰‰ yksiselitteisi‰ m‰‰rittelyj‰ kaikille maailman k‰sitteille. Kone kuitenkin tarvitsee yksiselitteiset m‰‰ritelm‰t voidakseen suorittaa aihepiiriin liittyvi‰ ohjelmia.</p>

            <p>Vuosien saatossa on kehitetty erilaisia ohjelmointikieli‰, ja on myˆs syntynyt erilaisia tapoja ohjelmoida, niin sanottuja <strong>ohjelmointiparadigmoja</strong> (<em>programming paradigm</em>). Eri paradigmoilla on erilaisia vastauksia yll‰ esitettyyn "kommunikaatio-ongelmaan".</p>


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
