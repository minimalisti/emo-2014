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
            
            <img src="/img/${materialType}/auto-olio.png"/>
            
            <p>Yksittäistä kurssia, opiskelijaa, pankkitiliä, käyttöliittymän ikkunaa tai nappulaa vastaa olio-ohjelmassa yksi <strong>olio</strong> (<em>object</em>). Yleensä kuhunkin olioon liittyy toimintoja eli <strong>metodeja</strong> (<em>method</em>), joilla oliota voidaan hyödyntää. Esimerkiksi autoa voitaisiin kuvata oliona, jolla on metodeja kuten "aja", "lisää matkustaja", "tankkaa", "kerro bensan määrä" jne.</p>
            
            <p>Olioon liittyy usein myös ominaisuuksia, jotka kuvaavat sen pysyviä tai muuttuvia piirteitä. Esimerkiksi auto-olion tietoja voisivat olla sen merkki, bensatankin sisältämän bensan määrä, sijainti ja sisällä olevat matkustajat. Ohjelmoija valitsee, mitä ominaisuuksia ja metodeja olioihin liittyy. Valintaan vaikuttaa ratkaisevasti se, mitä asioita kyseisessä ohjelmassa halutaan mallintaa. Ohjelmaa ajettaessa tietokone pitää oliot tallessa muistissaan.</p>

            
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
