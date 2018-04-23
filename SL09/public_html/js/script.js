
var input =  [
	["cognome","nome","richieste"],	//input_lettere
	["matricola","telefono"],	//input_numerico
	["email"]	//input_generico
	];

var funzioni = [__is_nome,__is_numero,__qualsiasi];

function __qualsiasi(string){
	return true;
}

function isNumeric(value) {
    return /^-{0,1}\d+$/.test(value);
}

function __is_numero(string){
	return  /^-{0,1}\d+$/.test(string);
}

function __is_nome(string){
	return !/[^a-zA-Z]/.test(string);
}

function __is_vuoto(ele,__metodo_aggiuntivo){
	if(ele.value.length===0 || ele.value == null || __metodo_aggiuntivo(ele)){
		//ele.value = "riempire questo campo !!";
		ele.style.backgroundColor = "red";
		return true;
	}
	
	ele.style.backgroundColor = "white";
	
	return false;
}

function __invia(){

	var __riempiti_tutti = false;
	for(var i=0;i<input.length;i++){
		for(var j=0;j<input[i].length;j++){
			__riempiti_tutti |= __is_vuoto(document.getElementById(input[i][j]),funzioni[i]);
		}
	}

	alert(__riempiti_tutti ? "non riemptiti correttamente" :  "riempiti correttamente");
}

function __reset(ele){
	ele.value = "";
}

function __reset(){
	for(var i=0;i<input.length;i++){
		for(var j=0;j<input[i].length;j++){
			__reset(document.getElementById(input[i][j]));
		}
	}
}