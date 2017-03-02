function menu(mthis,menuname){
	switch(menuname){
	case 'working':
		$('section').hide();
		$('#working').show();
		$("a dd").css("color","white");
		$(mthis).find("dd").css("color","red");
		break;
	case 'about':
		$('section').hide();
		$('#about').show();
		$("a dd").css("color","white");
		$(mthis).find("dd").css("color","red");
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

