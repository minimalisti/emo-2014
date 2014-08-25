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

            <h3>Viestin lis‰tiedot eli parametrit</h3>

            <p><strong>Metodiparametreilla</strong> voidaan v‰litt‰‰ oliolle lis‰tietoja siit‰, mit‰ olion tulisi tehd‰. T‰ss‰ tankattavan bensan m‰‰r‰ v‰litet‰‰n parametriksi (mik‰ on korostettu keltaisella):</p>

            <img src="/img/${materialType}/auto-olio-tankkaa.png"/>
            
            <p>Parametreiksi voi antaa erilaisia arvoja: lukuja, viittauksia toisiin olioihin ja niin edelleen.</p>
            
            <p>Parametreja voi olla yksi tai useampia. Ja voi niit‰ olla nollakin, kun viesti itsess‰‰n kertoo kaiken oleellisen kuten t‰ss‰:</p>
            
            <p>Jotkut metodikutsut yksinkertaisesti pyyt‰v‰t oliota kertomaan tietyn tilatiedon, kuten bensan m‰‰r‰n tankissa. Toiset tekev‰t jotakin monimutkaisempaa.</p>

            <img src="/img/${materialType}/auto-olio-kerro-bensa.png"/>


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
