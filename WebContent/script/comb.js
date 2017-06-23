function showComb(id,time) {
	var color = [
		["#D9E9E9", "#F9FCFC", "#E9EFEF", "#F6F9F8", "#F6F9F8" ,"#EDECF2", "#E9EFEF", "#FCFDFD", "#CCE3EB", "#F1F5F6","#F1F5F6", "#DEECED"],
		["#CEE7E3", "#EDF1F0", "#E1E3DE", "#F4F6F3", "#D8DFCF" ,"#ECEBE6", "#F5E7DA", "#FBF8F7", "#EAECEB", "#F9F9F9","#F0E8D7", "#E4E9E3"],
		["#DDD6CC", "#EEEDEB", "#C4C6D7", "#F5F5F6", "#F5F5F6" ,"#E0E3E8", "#F1E4D3", "#F8F7F5", "#E3E5E8", "#F9FBFC","#F9FBFC", "#F1F0EC"],
		["#CEE7E3", "#EDF4F3", "#6CB7CA", "#F3F6F7", "#F3F6F7" ,"#D3E2E9", "#A0CCD7", "#F1F7F9", "#95D5E0", "#EFF9FB","#DBD9D6", "#E8F0F2"],
		["#E6DCAB", "#FBFAF2", "#F5E7DA", "#FBF8F7", "#DFD0BD" ,"#FFF8E5", "#FBF7CA", "#FFFEF7", "#F3F1D8", "#FEFEFC","#FEFEFC", "#F6F6EE"],
		["#E6DCAB", "#FBFAF2", "#F5E7DA", "#FBF8F7", "#DFD0BD" ,"#ECEBE6", "#FBF7CA", "#FFFEF7", "#ECDFD7", "#F8F7F3","#F8F7F3", "#F3EEDB"],
		["#CEE7E3", "#F8FCFB", "#F6F6ED", "#FEFEFD", "#FFF7DE" ,"#ECECE4", "#F5E8DB", "#FEFCFA", "#E9EFEF", "#FBFCFC","#FBFCFC", "#F6F6F2"],
		];
	$("#comb"+id+"_a1"+time).css("background-color",color[id][0]);
	$("#comb"+id+"_c1"+time).css({"border-color":color[id][1],"border-left-color":color[id][0]});
	$("#comb"+id+"_a2"+time).css("background-color",color[id][1]);
	$("#comb"+id+"_a3"+time).css("background-color",color[id][2]);
	$("#comb"+id+"_c2"+time).css({"border-color":color[id][3],"border-left-color":color[id][2]});
	$("#comb"+id+"_a4"+time).css("background-color",color[id][3]);
	$("#comb"+id+"_a5"+time).css("background-color",color[id][4]);
	$("#comb"+id+"_a6"+time).css("background-color",color[id][5]);
	$("#comb"+id+"_b1"+time).css("background-color",color[id][6]);
	$("#comb"+id+"_c3"+time).css({"border-color":color[id][7],"border-left-color":color[id][6]});
	$("#comb"+id+"_b2"+time).css("background-color",color[id][7]);
	$("#comb"+id+"_b3"+time).css("background-color",color[id][8]);
	$("#comb"+id+"_c4"+time).css({"border-color":color[id][9],"border-left-color":color[id][8]});
	$("#comb"+id+"_b4"+time).css("background-color",color[id][9]);
	$("#comb"+id+"_b5"+time).css("background-color",color[id][10]);
	$("#comb"+id+"_b6"+time).css("background-color",color[id][11]);
}