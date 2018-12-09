/**
 * 
 */
$(function(){
	initModal();
	$(".form-select").change(function(){
		var value = $(this).find("option:selected").text();
		$(this).prev().val(value);
	})
});


function getBaseDict(url, selectName){
	$.ajax({
		url: url,
		success: function(res){
			var select = $("select[name="+ selectName +"]")[0]; 
			$(res).each(function(i, item){
				var option = document.createElement('option');
				option.value = item.id
				option.innerHTML = item.name + (item.no?"("+ item.no +")": "" );
				select.appendChild(option)
			});
		}
	})
}

function getBaseDictTable(url, callback){
	$.ajax({
		url: url,
		success: callback
	})
}

function initModal(){
	var html ="<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\">" +
			  "		<div class=\"modal-dialog\" role=\"document\">" +
			  "  		<div class=\"modal-content\">" +
			  "    			<div class=\"modal-body\">" +
			  "      			<p></p>" +
			  "    			</div>" +
			  "  		</div>" +
			  "		</div>" +
			  "</div>";
	$("body").append(html);
}

function showModal(value){
	$(".modal-body p").text(value);
	$(".modal").modal('show');
	setTimeout(hideModal, 2000)
}

function hideModal(){
	$(".modal").modal('hide');
	$(".modal-body p").text("");
}

function isNull(value){
	if(null == value || undefined == value || "" == value){
		return true;
	}
	return false;
}

function getEntity(url, formName, id, callback){
	var _callback = callback || function(res){
		var $form = $("form[name="+ formName +"]");
		for(var attr in res){
			$form.find("#" + attr).val(res[attr])
		}
	}
	$post({
		url: url,
		data: {id: id},
		callback: _callback 
	});
}


function $post(options){
	var url = options.url || ''
	var data = options.data
	var callback = options.callback || function() {}
	var errors = options.errors || function(res){showModal('服务器出错')}
	$.ajax({
		url: url,
		data: JSON.stringify(data),
		type: 'POST',
		contentType:'application/json;charset=utf-8',
		dataType : "json",
		success: callback,
		error: errors
	})
}

function defaultCallback(res){
	showModal(res.message);
	document.forms[0].reset();
}

function $submit(formName, url, callback){
	var _callback = callback || defaultCallback;
	var $form = $("form[name="+ formName +"]");
	var $params = $form.find(".form-param");
	var data = {};
	var flag = false;
	$params.each(function(i, item){
		var value = $(item).val();
		var name = $(item).attr("name");
		if(!isNull(value)){
			flag = true;
			data[name] = value;
		}
	});
	
	if(!flag){
		return false;
	}else{
		$post({
			url: url,
			data: data,
			callback: _callback
		})
	}
}