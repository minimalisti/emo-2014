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
            
            <h3>Olioista koostuvat mallit</h3>
            
            <p>Olioita yhdistelem‰ll‰ voimme luoda ohjelman aihepiiri‰ kuvaavan mallin. T‰ss‰ yksi pieni esimerkki piirroksen muodossa:</p>

            <img src="/img/${materialType}/opiskelijaoliot-kurssit.png"/>
            
            <p><em>Olioita, jotka liittyv‰t kurssi-ilmoittautumisj‰rjestelm‰‰ et‰isesti muistuttavaan ohjelmaan. Huomaa, miten oliot viittaavat toisiinsa ja muodostavat kokonaisuuden.</em></p>
            
            <p>Kullakin oliolla on oma vastuualueensa ohjelman toiminnassa. Esimerkiksi kurssiolion vastuulla voi olla kirjanpito siit‰, keit‰ kurssille on ilmoittautunut, sek‰ uusista ilmoittautumisista huolehtiminen enimm‰isosallistujam‰‰r‰n puitteissa. Eri olioiden toimintoja yhdistelem‰ll‰ saadaan aikaan koko ohjelman toiminta, mist‰ lis‰‰ hieman myˆhemmin.</p>
            

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
