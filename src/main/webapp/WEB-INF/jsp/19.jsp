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
                <button type="button" class="btn btn-primary" id="forwardButton">Eteenp�in</button>
            </form>

            <form action="/app/submit-material-${materialId}-seen-back" method="POST" id="backward">
                <input type="hidden" name="visitStarted" id="visitStartedB"/>
                <input type="hidden" name="visitEnded" id="visitEndedB"/>
                <button type="button" class="btn btn-primary" id="backwardButton">Taaksep�in</button>
            </form>          
            <div class="spacer"></div>

            <h3>Olioiden v�lisist� viesteist� tarkemmin</h3>

            <p><span class="object">Oliolle</span> l�hetetyt 
                <span class="message">viestit</span> aktivoivat 
                <span class="object">olion</span> <span class="method">metodeita</span>. 
                T�llaisen <span class="message">viestin</span> l�hett�mist� sanotaan 
                <strong><span class="message">metodin
                    kutsumiseksi</span> </strong> 
                (<em>method call</em>, 
                <em>method invocation</em>). T�ss� kutsutaan 
                <span class="object">auto-olion</span> <span class="method">"aja"-nimist� metodia</span>:</p>

            <img style="padding-bottom: 20px;" src="/img/${materialType}/auto-olio-aja.png"/>

            <p>Jotkut <span class="message">metodikutsut</span> yksinkertaisesti 
                pyyt�v�t <span class="object">oliota</span> kertomaan 
                tietyn tilatiedon, kuten bensan m��r�n tankissa. Toiset tekev�t 
                jotakin monimutkaisempaa.</p>



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
