/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {
    $('<p id="checked_info" class="center_it_all">Olet vastannut <span id="checked_number"> X </span> / <span id="radio_total_number">Y</span></p>').insertBefore("#forwardButton");


    $('#forwardButton').attr("disabled", true);
    $('#forwardButton').css('background-color', 'grey')
    $('#forwardButton').text("Vastaa ensin kysymyksiin")

    var total = 0;

    $('#radio_total_number').text(function () {
        if ($('.dropdown').length > 0) {
            total = $('.dropdown').length;
            return $('.dropdown').length;
        }
        else if ($('.sam-dropdown').length > 0) {
            total = $('.sam-dropdown').length;
            return $('.sam-dropdown').length;
        }
    });


    var countChecked = function () {
        var n = $("input:checked").length;
        $("#checked_number").text(n);
        if (n === total)
        {
            $('#forwardButton').attr("disabled", false);
            $('#forwardButton').css('background-color', 'blue')
            $('#forwardButton').text("Jatka")
        }
    };
    countChecked();
    $("input[type=radio]").on("click", countChecked);
    $("input[type=radio]").on("click", function () {
//$('#checked_info').parent().css('background-color', 'red');
        $(this).parents('.dropdown').css('background-color', '#8FBC8F');
    });
});
