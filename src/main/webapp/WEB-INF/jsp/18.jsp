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

            <h3>N‰kˆkulmia olio-ohjelmiin</h3>

            <p><span class="object">Olioiden</span> toimiessa saamiensa k‰skyjen mukaisesti niiden tilat 
                voivat muuttua ja samalla koko ohjelman tila. Esimerkkej‰: 
                lis‰t‰‰n opiskelija ilmoittautuneeksi jollekin kurssille lis‰t‰‰n 
                uusi merkint‰ p‰iv‰kirjaan, vaihdetaan k‰ytt‰j‰n henkilˆtietoja, jne. jne.</p>

            <p>Olio-ohjelman <span class="object">olioiden</span> muodostama k‰sitteellinen malli j‰sent‰‰ 
                ohjelman ihmisen kannalta j‰rkev‰ksi kokonaisuudeksi, jossa kullakin 
                <span class="object">oliolla</span> on oma vastuualueensa. Toisaalta ohjelma-ajo on 
                pohjimmiltaan vain sarja per‰kk‰isi‰ komentoja, joita tietokone suorittaa. 
                Ohjelmoija m‰‰rittelee k‰skyt olioiden yhteyteen, tarkemmin 
                sanoen niiden <span class="method">metodeihin</span>. Osa k‰skyist‰ saa <span class="object">oliot</span> 
                komentamaan 
                toisiaan; n‰in m‰‰rittyy se, mihin <span class="object">olioon</span> 
                liittyv‰‰ ohjelmakoodia 
                suoritetaan milloinkin. Toimintavuoro kiert‰‰ 
                <span class="object">oliolta</span>
                toiselle: vain yhden <span class="object">olion</span> <span class="method">metodia</span> suoritetaan kerrallaan. 
                <span class="method">Metodit</span> toteuttavat ohjelman osa-algoritmeja (osaratkaisuja), 
                ja niit‰ yhdistelem‰ll‰ saadaan aikaan kokonainen algoritmi, 
                joka suorittaa ohjelmalta vaaditut teht‰v‰t.</p>


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
