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

            <h3>N‰kˆkulmia olio-ohjelmiin</h3>

            <p>Olioiden toimiessa saamiensa k‰skyjen mukaisesti niiden tilat voivat muuttua ja samalla koko ohjelman tila. Esimerkkej‰: lis‰t‰‰n opiskelija ilmoittautuneeksi jollekin kurssille lis‰t‰‰n uusi merkint‰ p‰iv‰kirjaan, vaihdetaan k‰ytt‰j‰n henkilˆtietoja, jne. jne.</p>

            <p>Olio-ohjelman olioiden muodostama k‰sitteellinen malli j‰sent‰‰ ohjelman ihmisen kannalta j‰rkev‰ksi kokonaisuudeksi, jossa kullakin oliolla on oma vastuualueensa. Toisaalta ohjelma-ajo on pohjimmiltaan vain sarja per‰kk‰isi‰ komentoja, joita tietokone suorittaa. Ohjelmoija m‰‰rittelee k‰skyt olioiden yhteyteen, tarkemmin sanoen niiden metodeihin. Osa k‰skyist‰ saa oliot komentamaan toisiaan; n‰in m‰‰rittyy se, mihin olioon liittyv‰‰ ohjelmakoodia suoritetaan milloinkin. Toimintavuoro kiert‰‰ oliolta toiselle: vain yhden olion metodia suoritetaan kerrallaan. Metodit toteuttavat ohjelman osa-algoritmeja (osaratkaisuja), ja niit‰ yhdistelem‰ll‰ saadaan aikaan kokonainen algoritmi, joka suorittaa ohjelmalta vaaditut teht‰v‰t.</p>


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
