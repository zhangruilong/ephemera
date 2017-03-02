$(document).ready(function() {
    
    function displayAboutPanel() {
        $(".aboutUs").animate({
            left: "0"
        }, 700);
    }

    function hideAboutPanel() {
        $(".aboutUs").animate({
            left: "-250px"
        }, 700);
    }
    
//    function addPin(x, y) {
//        $(".pins").append   
//    }

    $(".logo").mouseover(displayAboutPanel);
    $(".logo").mouseout(hideAboutPanel);

});

