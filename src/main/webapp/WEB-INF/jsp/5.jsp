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
                <button type="button" class="btn btn-primary" id="forwardButton">Eteenpäin</button>
            </form>

            <form action="/app/submit-material-${materialId}-seen-back" method="POST" id="backward">
                <input type="hidden" name="visitStarted" id="visitStartedB"/>
                <input type="hidden" name="visitEnded" id="visitEndedB"/>
                <button type="button" class="btn btn-primary" id="backwardButton">Taaksepäin</button>
            </form>          
            <div class="spacer"></div>

            <h3>Olioista koostuvat mallit</h3>

            <p><span class="object">Olioita</span> yhdistelemällä voimme luoda 
                ohjelman aihepiiriä kuvaavan mallin. Tässä yksi pieni esimerkki 
                piirroksen muodossa:</p>

            <img src="/img/${materialType}/opiskelijaoliot-kurssit.png"/>

            <p><em><span class="object">Olioita</span>, jotka liittyvät 
                    kurssi-ilmoittautumisjärjestelmää etäisesti muistuttavaan 
                    ohjelmaan. Huomaa, miten <span class="object">oliot</span> 
                    viittaavat toisiinsa ja muodostavat kokonaisuuden.</em></p>

                    <p>Kullakin <span class="object">oliolla</span> on oma 
                        vastuualueensa ohjelman toiminnassa. Esimerkiksi 
                        <span class="object">kurssiolion</span> vastuulla voi 
                        olla kirjanpito siitä, keitä kurssille on ilmoittautunut, 
                        sekä uusista ilmoittautumisista huolehtiminen 
                        enimmäisosallistujamäärän puitteissa. Eri 
                        <span class="object">olioiden</span> toimintoja 
                        yhdistelemällä saadaan aikaan koko ohjelman toiminta, 
                        mistä lisää hieman myöhemmin.</p>


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
