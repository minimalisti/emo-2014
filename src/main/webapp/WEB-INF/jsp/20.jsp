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

            <h3>Viestin lis‰tiedot eli parametrit</h3>

            <p><strong><span class="parameter">Metodiparametreilla</span></strong> 
                voidaan v‰litt‰‰ <span class="object">oliolle</span> 
                lis‰tietoja siit‰, mit‰ olion tulisi tehd‰. T‰ss‰ tankattavan 
                bensan m‰‰r‰ v‰litet‰‰n <span class="parameter">parametriksi:</span> 
            </p>
                
                <!-- (mik‰ on korostettu sinisell‰):</p> -->

            <img style="padding-bottom: 20px;" src="/img/${materialType}/auto-olio-tankkaa.png"/>

            <p><span class="parameter">Parametreiksi</span> voi antaa erilaisia arvoja: 
                lukuja, viittauksia toisiin <span class="object">olioihin</span> ja niin 
                edelleen.</p>

            <p><span class="parameter">Parametreja</span> voi olla yksi tai useampia. 
                Ja voi niit‰ olla nollakin, 
                kun viesti itsess‰‰n kertoo kaiken oleellisen kuten t‰ss‰:</p>


            <img src="/img/${materialType}/auto-olio-kerro-bensa.png"/>

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
