$(function(){
	$("#myAccount").popover({
		trigger:"click",
		template:"#account-popover",
		html: true
	});
	$("#viewCategory").popover({
		trigger:"click",
		template:"#category-popover",
		html: true
	});

})
function doSearch() {
	if ($("input[name=search]").val()!="") location="search?cate=" + $("select[name=category]").val() + "&p=" + $("input[name=search]").val()
}