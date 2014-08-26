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
                <button type="button" class="btn btn-primary" id="forwardButton">Eteenpäin</button>
            </form>

            <form action="/app/submit-material-${materialId}-seen-back" method="POST" id="backward">
                <input type="hidden" name="visitStarted" id="visitStartedB"/>
                <input type="hidden" name="visitEnded" id="visitEndedB"/>
                <button type="button" class="btn btn-primary" id="backwardButton">Taaksepäin</button>
            </form>          
            <div class="spacer"></div>
            
            <p></p>
            
            <p>Ohessa on esimerkkejä erilaisista olioista graafisesti esitettynä.</p>
            
            <img src="/img/${materialType}/olioita.png"/>
            
            <p>Huomaa tästä kuvastakin, että olioilla on sekä tietoja, jotka niihin liittyvät (esim. opiskelijaolion opiskelijanumero, nappulaolion teksti), että toimintoja, joita niihin voidaan kohdistaa (esim. opiskelijan lisääminen kurssille, tiedoston poistaminen). Huomaa myös, että oliot voivat muistuttaa toisiaan - olla keskenään saman tyyppisiä - kuten kaksi eläinoliota yllä. </p>
            
            

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
