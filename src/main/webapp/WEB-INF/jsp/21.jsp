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

            <h3>Vastausviestit eli palautusarvot</h3>

            <p>Monesti olio vastaa metodikutsuun jollain tapaa eli lähettää kutsujalle jotakin vastausviestinä. Sanotaan, että metodi <strong>palauttaa arvon</strong>. Metodin palautusarvo voi olla esimerkiksi tieto toiminnon onnistumisesta tai epäonnistumisesta:</p>
            
            <img src="/img/${materialType}/auto-olio-tankkaa-vastaus.png"/>
            
            <p>Palautusarvo voi myös olla tilannetieto olion tilasta:</p>
            
            <img src="/img/${materialType}/auto-olio-kerro-bensa-vastaus.png"/>

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
