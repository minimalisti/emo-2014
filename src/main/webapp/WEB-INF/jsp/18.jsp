<!DOCTYPE html>
<html>
    <head>
        <title>Olio-ohjelmointi</title>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/js/libs/twitter-bootstrap/css/bootstrap.css"/>
    </head>
    <body>

        <div class="container">

            <h3>N‰kˆkulmia olio-ohjelmiin</h3>

            <p>Olioiden toimiessa saamiensa k‰skyjen mukaisesti niiden tilat voivat muuttua ja samalla koko ohjelman tila. Esimerkkej‰: lis‰t‰‰n opiskelija ilmoittautuneeksi jollekin kurssille lis‰t‰‰n uusi merkint‰ p‰iv‰kirjaan, vaihdetaan k‰ytt‰j‰n henkilˆtietoja, jne. jne.</p>

            <p>Olio-ohjelman olioiden muodostama k‰sitteellinen malli j‰sent‰‰ ohjelman ihmisen kannalta j‰rkev‰ksi kokonaisuudeksi, jossa kullakin oliolla on oma vastuualueensa. Toisaalta ohjelma-ajo on pohjimmiltaan vain sarja per‰kk‰isi‰ komentoja, joita tietokone suorittaa. Ohjelmoija m‰‰rittelee k‰skyt olioiden yhteyteen, tarkemmin sanoen niiden metodeihin. Osa k‰skyist‰ saa oliot komentamaan toisiaan; n‰in m‰‰rittyy se, mihin olioon liittyv‰‰ ohjelmakoodia suoritetaan milloinkin. Toimintavuoro kiert‰‰ oliolta toiselle: vain yhden olion metodia suoritetaan kerrallaan. Metodit toteuttavat ohjelman osa-algoritmeja (osaratkaisuja), ja niit‰ yhdistelem‰ll‰ saadaan aikaan kokonainen algoritmi, joka suorittaa ohjelmalta vaaditut teht‰v‰t.</p>



            <form action="/app/submit-material-${materialId}-seen" method="POST">

                <input type="hidden" name="visitStarted" id="visitStarted"/>
                <input type="hidden" name="visitEnded" id="visitEnded"/>

                <button type="button" class="btn btn-primary" id="forwardButton">Eteenp‰in</button>
            </form>
        </div>

        <script src="/js/libs/jquery/jquery.js"></script>
        <script src="/js/libs/twitter-bootstrap/js/bootstrap.js"></script>

        <script>
            $(function() {
                $("#visitStarted").val(new Date());

                $("#forwardButton").click(function() {
                    $("#visitEnded").val(new Date());
                    $("form").submit();
                });
            });
        </script>
    </body>
</html>
