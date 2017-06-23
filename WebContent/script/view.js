function clickPlus() {
	if ($("#counts").val() < $("#stock").text()) $("#counts").val(parseInt($("#counts").val()) + 1);
}
function clickMinus() {
	$("#counts").val(parseInt($("#counts").val()) - 1);
	if ($("#counts").val()<1) $("#counts").val(1);
}