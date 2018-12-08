/**
 * 
 */

function $post(options){
	var url = options.url || ''
	var data = options.data
	var callback = options.callback || function() {}
	var errors = options.errors || function(res){console.log(res);myAlert('服务器出错')}
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