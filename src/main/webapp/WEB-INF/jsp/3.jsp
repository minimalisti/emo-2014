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
            
            <img class="" style="padding: 30px; float: left;" src="/img/${materialType}/auto-olio.png"/>
            
            <p>Yksittäistä kurssia, opiskelijaa, pankkitiliä, käyttöliittymän ikkunaa tai nappulaa vastaa olio-ohjelmassa yksi <strong>olio</strong> (<em>object</em>). Yleensä kuhunkin olioon liittyy toimintoja eli <strong>metodeja</strong> (<em>method</em>), joilla oliota voidaan hyödyntää. Esimerkiksi autoa voitaisiin kuvata oliona, jolla on metodeja kuten "aja", "lisää matkustaja", "tankkaa", "kerro bensan määrä" jne.</p>
            
            <p>Olioon liittyy usein myös ominaisuuksia, jotka kuvaavat sen pysyviä tai muuttuvia piirteitä. Esimerkiksi auto-olion tietoja voisivat olla sen merkki, bensatankin sisältämän bensan määrä, sijainti ja sisällä olevat matkustajat. Ohjelmoija valitsee, mitä ominaisuuksia ja metodeja olioihin liittyy. Valintaan vaikuttaa ratkaisevasti se, mitä asioita kyseisessä ohjelmassa halutaan mallintaa. Ohjelmaa ajettaessa tietokone pitää oliot tallessa muistissaan.</p>

            

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
