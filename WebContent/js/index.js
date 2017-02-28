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
	}
}