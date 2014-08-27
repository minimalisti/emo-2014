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
            
            <h3>Olio-ohjelmointi</h3>

            <p>Oppituokiomme keskipisteess‰ on <strong>olio-ohjelmointi</strong> (<em>object-oriented programming, OOP</em>), joka on er‰s suosittu ja mielenkiintoinen ohjelmointiparadigma. </p>
            
            <p>Olio-ohjelmointia voidaan tarkastella eri n‰kˆkulmista. Yksi n‰ist‰ on se, ett‰ olio-ohjelmoinnissa l‰hdet‰‰n liikkeelle tavasta, jolla ihminen hahmottaa ongelmakokonaisuuksia, ja pyrit‰‰n luomaan jotain ihmisen k‰sitteistˆn kaltaista koneen k‰sitelt‰v‰ksi. Olio-ohjelmointi on t‰ss‰ mieless‰ ihmisl‰htˆist‰.</p>

            <img class="kuvitus" src="/img/${materialType}/olio-ohjelmointi.png"/>
            
            <p><em>Er‰s ratkaisu kommunikaatio-ongelmaan; m‰‰ritell‰‰n k‰sitteit‰ ohjelmakoodissa.</em></p>
            
            <p>Tarkoituksena olio-ohjelmoinnissa on siis laatia ohjelmia, jotka ovat koneen k‰sitelt‰viss‰ mutta joiden ilmaisut muistuttavat ihmisen tapaa j‰sent‰‰ maailmaa. M‰‰ritell‰‰n k‰sitteet ja niit‰ vastaavat termit tietokoneelle!</p>
            
            <p>Olio-ohjelmointi on pitk‰lti juuri k‰sitteiden m‰‰rittelemist‰. Ohjelmoija laatii mallin siit‰, mit‰ erilaiset ohjelman <strong>aihealueeseen</strong> (<em>domain</em>) liittyv‰t k‰sitteet ovat, ja mit‰ tietoa ja toimintoja niihin liittyy.</p>
            


        </div>

        <script src="/js/libs/jquery/jquery.js"></script>
        <script src="/js/libs/twitter-bootstrap/js/bootstrap.js"></script>

        <script>
            $(function() {
                var tmpTime = new Date();
                $("#visitStartedF").val(tmpTime);
                $("#visitStartedB").val(tmpTime);

                $("#forwardButton").click(function() {
                    $("#visitEndedF").val(new Date());
                    $("#forward").submit();
                });

                $("#backwardButton").click(function() {
                    $("#visitEndedB").val(new Date());
                    $("#backward").submit();
                });                
            });
        </script>
    </body>
</html>
