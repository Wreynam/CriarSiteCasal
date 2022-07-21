
function openNav() {
    document.getElementById("mySidenav").style.width = "22%";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
var visivel = true;
var visivel2 = false;
function exibir(num) {
    if (num == 1) {
		if(visivel){
				document.getElementById("suaConta").style.display = "none";
				visivel = false;
				document.getElementById("infoCasal").style.display = "block";
				visivel2 = true;
			}else{
				document.getElementById("suaConta").style.display = "block";
				visivel = true;
				document.getElementById("infoCasal").style.display = "none";
				visivel2 = false;
				
		}
	}else if (num == 2) {
		if(visivel2){
				document.getElementById("suaConta").style.display = "block";
				visivel = true;
				document.getElementById("infoCasal").style.display = "none";
				visivel2 = false;
			}else{
				document.getElementById("infoCasal").style.display = "block";
				visivel2 = true;
				document.getElementById("suaConta").style.display = "none";
				visivel = false;
		}
	}
}