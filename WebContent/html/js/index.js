function menu(mthis,menuname){
	switch(menuname){
	case 'news':
		$('section').hide();
		$('#news').show();
		$("a dd").css("color","white");
		$(mthis).find("dd").css("color","red");
		loaddatafornews();
		break;
	case 'features':
		$('section').hide();
		$('#features').show();
		$("a dd").css("color","white");
		$(mthis).find("dd").css("color","red");
		break;
	case 'featuresccaa':
		$('section').hide();
		$('#features').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('features','featuresccaa');
		break;
	case 'featuresads':
		$('section').hide();
		$('#features').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('features','featuresads');
		break;
	case 'featureswork':
		$('section').hide();
		$('#features').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('features','featureswork');
		break;
	case 'featureslec':
		$('section').hide();
		$('#features').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('features','featureslec');
		break;
	case 'featuresspe':
		$('section').hide();
		$('#features').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('features','featuresspe');
		break;
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
		loaddata('about','aboutdes');
		break;
	case 'aboutdes':
		$('section').hide();
		$('#about').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('about','aboutdes');
		break;
	case 'aboutteam':
		$('section').hide();
		$('#about').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('about','aboutteam');
		break;
	case 'aboutgrant':
		$('section').hide();
		$('#about').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('about','aboutgrant');
		break;
	case 'abouthistory':
		$('section').hide();
		$('#about').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('about','abouthistory');
		break;
	case 'aboutcollab':
		$('section').hide();
		$('#about').show();
		$("a dd").css("color","white");
		$(mthis).parent().parent().parent().find("dd").css("color","red");
		loaddata('about','aboutcollab');
		break;
	}
}
function loaddatafornews(){
	$.ajax({
		url: "Cms_contentAction.do?method=selAll",
		data: {
			wheresql:"contentcode='news'"
		},
		success: function(r) {
			var resp = eval('('+r+')'); 
			$("#news .content").html("");
			$.each(resp.root, function(i, item) {
				window.localStorage.setItem("newsid",item.comtentid);
				var contentdetail = item.contentdetail.substr(0,1000); 
				$("#news .content").append('<div class="col-md-4 column"><div class="page-header"><h4><a target="_blank" href="newsdetail.html?newsid='
						+item.contentid+'">'
						+item.contentname+'</a></h4></div>'
						+contentdetail+'</div>');
			});
		},
		error:function(r) {
			var resp = eval(r); 
			alert(resp.msg);
		}
	});
}
function nextsection(mthis,menuname){
	$('section').hide();
	$('#'+menuname).show();
}
function loaddata(model,code){
	$.ajax({
		url: "Cms_contentAction.do?method=selAll",
		data: {
			wheresql:"contentcode='"+code+"'"
		},
		success: function(r) {
			var resp = eval('('+r+')'); 
			$("#"+model+" .content").html("");
			$.each(resp.root, function(i, item) {	
				var reStripTagA = /<\/?a.*?>/g;
				var textIncludeSpan = item.contentdetail.replace(reStripTagA, ''); //包括span的结果（只去掉了a）
				$("#"+model+" .content").append('<div class="page-header"><h4>'
						+item.contentname+'</h4></div>'
						+textIncludeSpan);
			});
			$("a").css("text-decoration","none");
		},
		error:function(r) {
			var resp = eval(r); 
			alert(resp.msg);
		}
	});
}
function searchdate(){
	var wheresql = "";
	$("#searchform :text").each(function(){
		var str = $(this).val();
		if(!!str && str != null && str.length > 0 && 'null' != str && 'undefined' != str){
			strjt = simplized(str);
			strft = traditionalized(str);
			wheresql += " ("+this.id+" like '%"+strjt+"%' or "; 
			wheresql += this.id+" like '%"+strft+"%') and "; 
		}
	});
	$("#searchform :checkbox").each(function(){
		if($(this).prop('checked'))
		wheresql += " recordsubject like '%"+$(this).val()+"%' and "; 
	});
	window.localStorage.setItem("wheresql",wheresql.substr(0, wheresql.length - 4));
	window.open("images2.html");
}
function openimages(){
	window.localStorage.setItem("wheresql","");
	window.open("images2.html");
}
$(function(){
    $("#menuabout").mouseover(function () {
        $("#menuabout .dropdown-menu").show();
    });
    $("#menuabout").mouseout(function () {
        $("#menuabout .dropdown-menu").hide();
    });
    $("#menufeatures").mouseover(function () {
        $("#menufeatures .dropdown-menu").show();
    });
    $("#menufeatures").mouseout(function () {
        $("#menufeatures .dropdown-menu").hide();
    });
    $.ajax({
		url: "System_attachAction.do?method=selAll",
		data: {
			wheresql:"classify='images'"
		},
		success: function(r) {
			var resp = eval('('+r+')'); 
			$("#myCarousel .carousel-inner").html("");
			$.each(resp.root, function(i, item) {
				$("#myCarousel .carousel-inner").append('<div align="center" class="item">'
						+'<img src="'+item.name+'" onclick="javascript:window.open(\''+item.detail+'\')">'
			            +'</div>');
			});
			$("#myCarousel .item:first").addClass("active");
			$('.carousel').carousel();
		},
		error:function(r) {
			var resp = eval(r); 
			alert(resp.msg);
		}
	});
    loaddata('about','aboutdes');
});

