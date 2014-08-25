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

            <h3>Olioiden v‰lisist‰ viesteist‰ tarkemmin</h3>

            <p>Oliolle l‰hetetyt viestit aktivoivat olion metodeita. T‰llaisen viestin l‰hett‰mist‰ sanotaan <strong>metodin kutsumiseksi</strong> (<em>method call</em>, <em>method invocation</em>). T‰ss‰ kutsutaan auto-olion "aja"-nimist‰ metodia:</p>

            <img src="/img/${materialType}/auto-olio-aja.png"/>
            
            <p>Jotkut metodikutsut yksinkertaisesti pyyt‰v‰t oliota kertomaan tietyn tilatiedon, kuten bensan m‰‰r‰n tankissa. Toiset tekev‰t jotakin monimutkaisempaa.</p>



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
