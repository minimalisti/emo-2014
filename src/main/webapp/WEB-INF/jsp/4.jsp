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

            <p></p>

            <p>Ohessa on esimerkkej� erilaisista <span class="object">olioista</span> graafisesti esitettyn�.</p>

            <img src="/img/${materialType}/olioita.png"/>

            <p>Huomaa t�st� kuvastakin, ett� <span class="object">olioilla</span> 
                on sek� <span class="attribute">tietoja</span>, jotka niihin 
                liittyv�t (esim. opiskelijaolion 
                opiskelijanumero, nappulaolion teksti), ett� 
                <span class="method">toimintoja</span>, joita 
                niihin voidaan kohdistaa (esim. opiskelijan lis��minen kurssille, 
                tiedoston poistaminen). Huomaa my�s, ett� <span class="object">oliot</span> 
                voivat muistuttaa toisiaan - olla kesken��n saman tyyppisi� - 
                kuten kaksi <span class="object">el�inoliota</span> yll�. </p>



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
