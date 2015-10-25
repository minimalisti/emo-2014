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

            <img class="" style="padding: 30px; float: left;" src="/img/${materialType}/auto-olio.png"/>

            <p>Yksitt�ist� kurssia, opiskelijaa, pankkitili�, k�ytt�liittym�n ikkunaa tai 
                nappulaa vastaa olio-ohjelmassa yksi <span class="object"><strong>olio</strong></span> (<em>object</em>). 
                Yleens� kuhunkin <span class="object">olioon</span> liittyy toimintoja eli 
                <strong><span class="method">metodeja</strong> (<em>method</em>)</span>, 
                joilla <span class="object">oliota</span>
                voidaan hy�dynt��. Esimerkiksi autoa voitaisiin kuvata 
                <span class="object">oliona</span>, 
                jolla on <span class="method">metodeja</span> kuten 
                <span class="method">"aja"</span>, 
                <span class="method">"lis�� matkustaja"</span>, 
                <span class="method">"tankkaa"</span>, 
                <span class="method">"kerro bensan m��r�"</span> jne.</p>

            <p><span class="object">Olioon</span> liittyy usein my�s 
                <span class="attribute">ominaisuuksia</span>, 
                jotka kuvaavat sen pysyvi� tai muuttuvia piirteit�. Esimerkiksi 
                <span class="object">auto-olion</span> 
                <span class="attribute">tietoja</span> voisivat olla sen 
                <span class="attribute">merkki</span>, 
                <span class="attribute">bensatankin sis�lt�m�n bensan m��r�</span>, 
                <span class="attribute">sijainti</span> 
                ja 
                <span class="attribute"> sis�ll� olevat matkustajat</span>. 
                Ohjelmoija valitsee, mit� <span class="attribute">ominaisuuksia</span> ja 
                <span class="method">metodeja</span> 
                <span class="object">olioihin</span> liittyy. Valintaan 
                vaikuttaa ratkaisevasti se, mit� asioita kyseisess� ohjelmassa 
                halutaan mallintaa. Ohjelmaa ajettaessa tietokone pit�� 
                <span class="object">oliot</span> 
                tallessa muistissaan.</p>



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
