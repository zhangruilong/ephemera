function menu(mthis,menuname){
	switch(menuname){
	case 'new':
		window.location.href = "indexnews.html";
		break;
	case 'features':
		window.location.href = "indexfeatures.html";
		break;
	case 'about':
		window.location.href = "index.html";
		break;
	case 'aboutdes':
		$('section').hide();
		$('#about').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		break;
	case 'aboutteam':
		$('section').hide();
		$('#aboutteam').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		break;
	}
}
$(document).ready(function() {
    
    function displayAboutPanel() {
        $("#menuabout .dropdown-menu").show();
    }

    function hideAboutPanel() {
        $("#menuabout .dropdown-menu").hide();
    }

    $("#menuabout").mouseover(displayAboutPanel);
    $("#menuabout").mouseout(hideAboutPanel);

});

