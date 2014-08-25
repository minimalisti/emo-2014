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

            <h3>Vastausviestit eli palautusarvot</h3>

            <p>Monesti olio vastaa metodikutsuun jollain tapaa eli lähettää kutsujalle jotakin vastausviestinä. Sanotaan, että metodi <strong>palauttaa arvon</strong>. Metodin palautusarvo voi olla esimerkiksi tieto toiminnon onnistumisesta tai epäonnistumisesta:</p>
            
            <img src="/img/${materialType}/auto-olio-tankkaa-vastaus.png"/>
            
            <p>Palautusarvo voi myös olla tilannetieto olion tilasta:</p>
            
            <img src="/img/${materialType}/auto-olio-kerro-bensa-vastaus.png"/>


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
