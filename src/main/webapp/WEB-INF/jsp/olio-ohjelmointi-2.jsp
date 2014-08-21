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
            <h2>Olio-ohjelmointi</h2>

            <p>Oppituokiomme keskipisteess‰ on <strong>olio-ohjelmointi</strong> (<em>object-oriented programming, OOP</em>), joka on er‰s suosittu ja mielenkiintoinen ohjelmointiparadigma. </p>
            
            <p>Olio-ohjelmointia voidaan tarkastella eri n‰kˆkulmista. Yksi n‰ist‰ on se, ett‰ olio-ohjelmoinnissa l‰hdet‰‰n liikkeelle tavasta, jolla ihminen hahmottaa ongelmakokonaisuuksia, ja pyrit‰‰n luomaan jotain ihmisen k‰sitteistˆn kaltaista koneen k‰sitelt‰v‰ksi. Olio-ohjelmointi on t‰ss‰ mieless‰ ihmisl‰htˆist‰.</p>

            <img src="/img/${materialType}/olio-ohjelmointi.png"/>
            
            <h3>Er‰s ratkaisu kommunikaatio-ongelmaan; m‰‰ritell‰‰n k‰sitteit‰ ohjelmakoodissa.</h3>
            
            <p>Tarkoituksena olio-ohjelmoinnissa on siis laatia ohjelmia, jotka ovat koneen k‰sitelt‰viss‰ mutta joiden ilmaisut muistuttavat ihmisen tapaa j‰sent‰‰ maailmaa. M‰‰ritell‰‰n k‰sitteet ja niit‰ vastaavat termit tietokoneelle!</p>
            
            <p>Olio-ohjelmointi on pitk‰lti juuri k‰sitteiden m‰‰rittelemist‰. Ohjelmoija laatii mallin siit‰, mit‰ erilaiset ohjelman <strong>aihealueeseen</strong> (<em>domain</em>) liittyv‰t k‰sitteet ovat, ja mit‰ tietoa ja toimintoja niihin liittyy.</p>
            
            <form action="/app/submit-material-2-seen" method="POST">

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
