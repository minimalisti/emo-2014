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
            
            <p></p>
            
            <p>Ohessa on esimerkkejä erilaisista olioista graafisesti esitettynä.</p>
            
            <img src="/img/${materialType}/olioita.png"/>
            
            <p>Huomaa tästä kuvastakin, että olioilla on sekä tietoja, jotka niihin liittyvät (esim. opiskelijaolion opiskelijanumero, nappulaolion teksti), että toimintoja, joita niihin voidaan kohdistaa (esim. opiskelijan lisääminen kurssille, tiedoston poistaminen). Huomaa myös, että oliot voivat muistuttaa toisiaan - olla keskenään saman tyyppisiä - kuten kaksi eläinoliota yllä. </p>
            
            
            <form action="/app/submit-material-${materialId}-seen" method="POST">

                <input type="hidden" name="visitStarted" id="visitStarted"/>
                <input type="hidden" name="visitEnded" id="visitEnded"/>
                
                <button type="button" class="btn btn-primary" id="forwardButton">Eteenpäin</button>
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
