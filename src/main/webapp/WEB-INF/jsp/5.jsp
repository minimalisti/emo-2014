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
            
            <h3>Olioista koostuvat mallit</h3>
            
            <p>Olioita yhdistelemällä voimme luoda ohjelman aihepiiriä kuvaavan mallin. Tässä yksi pieni esimerkki piirroksen muodossa:</p>

            <img src="/img/${materialType}/opiskelijaoliot-kurssit.png"/>
            
            <p><em>Olioita, jotka liittyvät kurssi-ilmoittautumisjärjestelmää etäisesti muistuttavaan ohjelmaan. Huomaa, miten oliot viittaavat toisiinsa ja muodostavat kokonaisuuden.</em></p>
            
            <p>Kullakin oliolla on oma vastuualueensa ohjelman toiminnassa. Esimerkiksi kurssiolion vastuulla voi olla kirjanpito siitä, keitä kurssille on ilmoittautunut, sekä uusista ilmoittautumisista huolehtiminen enimmäisosallistujamäärän puitteissa. Eri olioiden toimintoja yhdistelemällä saadaan aikaan koko ohjelman toiminta, mistä lisää hieman myöhemmin.</p>
            
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
