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

            <form action="/app/submit-material-${materialId}-seen-back" method="POST" id="backward">
                <input type="hidden" name="visitStarted" id="visitStartedB"/>
                <input type="hidden" name="visitEnded" id="visitEndedB"/>
                <button type="button" class="btn btn-primary" id="backwardButton">Taaksep�in</button>
            </form>     

            <form id="goto_postquestionnaires" action="/app/submit-material-${materialId}-seen" method="POST">
                <input type="hidden" name="visitStarted" id="visitStartedF"/>
                <input type="hidden" name="visitEnded" id="visitEndedF"/>                
                <button type="button" class="btn btn-primary" id="forwardButton">Siirry j�lkikyselyihin</button>
            </form>

            <div class="spacer"></div>

            <h3>Vastausviestit eli palautusarvot</h3>

            <p>Monesti <span class="object">olio</span> vastaa 
                <span class="message">metodikutsuun</span> 
                jollain tapaa eli l�hett�� kutsujalle jotakin 
                <span class="parameter">vastausviestin�</span>. 
                Sanotaan, ett� <span class="method">metodi</span> 
                <strong>palauttaa arvon</strong>. 
                <span class="method">Metodin</span> 
                <span class="parameter">palautusarvo</span> voi olla 
                esimerkiksi tieto toiminnon 
                onnistumisesta tai ep�onnistumisesta:</p>

            <img style="padding-bottom: 15px;" src="/img/${materialType}/auto-olio-tankkaa-vastaus.png"/>

            <p><span class="parameter">Palautusarvo</span> voi my�s olla tilannetieto 
                <span class="object">olion</span> tilasta:</p>

            <img style="padding-bottom: 25px;" src="/img/${materialType}/auto-olio-kerro-bensa-vastaus.png"/>

            <p style=" border-top: 1px solid #a7a7a7; padding-top: 10px;">
                <em>Oppimateriaali p��ttyy t�h�n. Ole hyv� ja vastaa viel� seuraaviin kyselyihin. 
                    Niihin viev� nappula on <a href="#top">sivun yl�osassa.</a></em></p>

            <p>
            </p>

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
                    $("#goto_postquestionnaires").submit();
                });

                $("#backwardButton").click(function () {
                    $("#visitEndedB").val(new Date());
                    $("#backward").submit();
                });
            });
        </script>
    </body>
</html>
