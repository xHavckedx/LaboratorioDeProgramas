var nombre_FORO;
var xpath_pestaña_FORO = "//*[@Class='forum_pager']/*";
var xpath_mensaje_FORO = "//*[@class='post odd' or @class='post even']/*";
var xpath_temas_FOROMAESTRO = "//li/div/div[@class='title']/a"
var xpath_consulta_FOROS = "//*[@class='menu_inner']/li/a"
var array_paginas_FORO = [];
var arrayDeArray_Mensaje_FORO = [];
var array_Hilos_FOROMAESTRO = [];
var array_cantidad_FOROS = [];
var array_Mensaje_FORO = [];
var array2_Mensaje_FORO = [[nombre_FORO],["Nombre", "Mensajes", "Editado"]];
var foro = document.querySelector("#content");
var ventanaForo = document.getElementsByClassName("gpwindow_content")

//crear boton exportar
async function fncCrearBoton(){
    await sleep(200)
    var foro = document.querySelector("#content");
    let existeBoton = document.querySelector("#content > button:nth-child(4)");
    //si boton no existe crearboton
    if(existeBoton == null){
        let botonCopiar = document.createElement("button")
        botonCopiar.textContent = "Copiar Foro"
        botonCopiar.style.cssText ='position:absolute; left:0; bottom:0; background: url(https://gpes.innogamescdn.com/images/game/layout/gpwindow_bg.jpg) 0 0 repeat; color: #804000; cursor: pointer; border: none; font: 13px Verdana,Arial,Helvetica,sans-serif; font-weight: 700';
        botonCopiar.onclick = MensajesForo;
        let botonExportar = document.createElement("button")
        botonExportar.textContent = "- Exportar a csv"
        botonExportar.style.cssText ='position:absolute; left:90px; bottom:0; background: url(https://gpes.innogamescdn.com/images/game/layout/gpwindow_bg.jpg) 0 0 repeat; color: #804000; cursor: pointer; border: none; font: 13px Verdana,Arial,Helvetica,sans-serif; font-weight: 700';
        botonExportar.onclick = function() {convertirArrayCv(arrayDeArray_Mensaje_FORO)};
        if(foro != null){
            foro.appendChild(botonCopiar);
            foro.appendChild(botonExportar);
        }
    }
    ventanaForo.onload = fncCrearBoton();
}

// GPWindowMgr.Create(GPWindowMgr.TYPE_ALLIANCE_FORUM) <-- abre el foro
const observer = new MutationObserver((mutationList) => {
    mutationList.forEach((mutation) => {
        if(mutation.addedNodes[0].children[1]){
            if(mutation.addedNodes[0].children[1].className == "gpwindow_frame ui-dialog-content ui-widget-content"){
                fncCrearBoton();
            }
        }
   });
});

//Target donde observamos
const body = document.querySelector("body");
const observerOptions = {
    childList: true
};

observer.observe(body, observerOptions)
//MensajesForo();

function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

function fncNumeroPaginaForo(){
    array_paginas_FORO = []
    var paginas = document.evaluate(xpath_pestaña_FORO, document, null, XPathResult.ANY_TYPE, null);
    var itePaginas = paginas.iterateNext();
    array_paginas_FORO = [];
    while (itePaginas) {
        array_paginas_FORO.push(itePaginas.textContent);
        itePaginas = paginas.iterateNext();
    }
}
var n
async function fncCopiaForo() {
    await sleep(100)
    fncNumeroPaginaForo();
    let mensajes = [];
    mensajes = document.getElementsByClassName("title")
    if(mensajes.length > 2){
        nombre_FORO = document.querySelector("#forum_thread_name_span_text > span:nth-child(2)").innerText;
    }else{
        nombre_FORO = document.querySelector("#forum_thread_name_span_text > span").innerText;
    }
    array2_Mensaje_FORO = [[nombre_FORO],["ID","Nombre", "Mensajes", "Editado"]];
    array_Mensaje_FORO = [];
    for(var i=0; i< array_paginas_FORO.length; i++){ //Nº de paginas del hilo
      if(array_paginas_FORO[i] == i+1){
        //console.warn("entra")
        var mensaje = document.evaluate(xpath_mensaje_FORO, document, null, XPathResult.ANY_TYPE, null);
        var iteMensaje = mensaje.iterateNext();
        while(iteMensaje){
            array_Mensaje_FORO.push([iteMensaje.innerText.replace(/(\r\n|\n|\r)/gm,"")]);
            iteMensaje = mensaje.iterateNext();
        }
        //clicar a la 2 página
          var paginator = document.getElementsByClassName("paginator_bg");
          if(paginator.length > 1){
            document.querySelector("#forum > div.forum_pager > a").onclick();
          }
        await sleep(220)
     }else{ console.warn("no entra")}
    }
    for(let index = 0, x = 0; index < array_Mensaje_FORO.length/3; index++, x += 3){
        array2_Mensaje_FORO.push([index+1, array_Mensaje_FORO[x], array_Mensaje_FORO[x+1], array_Mensaje_FORO[x+2]])
    }
    arrayDeArray_Mensaje_FORO.push(array2_Mensaje_FORO);
    array2_Mensaje_FORO = []
    array_Mensaje_FORO = []
}

async function fncCalcularEntradas() {
    var array_Hilos_FOROMAESTRO = [];
    var array_cantidad_FOROS = [];
    //consulta foros
    var consulta = document.evaluate(xpath_consulta_FOROS, document, null, XPathResult.ANY_TYPE, null);
    var consultaIter = consulta.iterateNext();
    while(consultaIter){
        array_cantidad_FOROS.push(consultaIter)
        consultaIter = consulta.iterateNext();
    }
    //consulta hilos
    var hilos = document.evaluate(xpath_temas_FOROMAESTRO, document, null, XPathResult.ANY_TYPE, null);
    var hilosIter = hilos.iterateNext();
    while(hilosIter){
        array_Hilos_FOROMAESTRO.push(hilosIter);
        hilosIter = hilos.iterateNext();
    }
    for (let index = 0; index < array_Hilos_FOROMAESTRO.length; index++) {
        await sleep(200)
        array_Hilos_FOROMAESTRO[index].onclick()
        await sleep(200)
        await fncCopiaForo();
        await sleep(200)
        for(let i = 0; i < array_cantidad_FOROS.length ; i++){
          if(array_cantidad_FOROS[i].className == "submenu_link active"){
              array_cantidad_FOROS[i].click();
          }
        }
    }
    var paginator = document.getElementsByClassName("paginator_bg");
      if(paginator.length > 1){
        document.querySelector("#forum > div.forum_pager > a").onclick();
      }
    await sleep(200)
}

async function MensajesForo(){
    fncNumeroPaginaForo();
    let paginas_FORO = array_paginas_FORO;
    if(paginas_FORO.length > 1){
        for(var i=0; i < paginas_FORO.length; i++){
            await fncCalcularEntradas();
            var paginator = document.getElementsByClassName("paginator_bg");
            if(paginator.length > 1){
                document.querySelector("#forum > div.forum_pager > a").onclick();
                await sleep(200)
            }
        }
    }else{
        fncCalcularEntradas();
    }
}

function convertirArrayCv(arrayDeArray_Mensaje_FORO) {
	//let nombre = prompt("Nombre del archivo csv",0);
    arrayDeArray_Mensaje_FORO
    for(var i = 0; i < arrayDeArray_Mensaje_FORO.length; i++){
        exportToCsv( arrayDeArray_Mensaje_FORO[i][0]+".csv",arrayDeArray_Mensaje_FORO[i])
    }
    alert("finalizada la exportación")
}

// --------------------------------------CSV--------------------------------------

function exportToCsv(filename, rows) {
        var processRow = function (row) {
            var finalVal = '';
            for (var j = 0; j < row.length; j++) {
                var innerValue = row[j] === null ? '' : row[j].toString();
                if (row[j] instanceof Date) {
                    innerValue = row[j].toLocaleString();
                };
                var result = innerValue.replace(/"/g, '""');
                if (result.search(/("|,|\n)/g) >= 0)
                    result = '"' + result + '"';
                if (j > 0)
                    finalVal += ',';
                finalVal += result;
            }
            return finalVal + '\n';
        };

        var csvFile = '';
        for (var i = 0; i < rows.length; i++) {
            csvFile += processRow(rows[i]);
        }

        var blob = new Blob([csvFile], { type: 'text/csv;charset=utf-8;' });
        if (navigator.msSaveBlob) { // IE 10+
            navigator.msSaveBlob(blob, filename);
        } else {
            var link = document.createElement("a");
            if (link.download !== undefined) { // feature detection
                // Browsers that support HTML5 download attribute
                var url = URL.createObjectURL(blob);
                link.setAttribute("href", url);
                link.setAttribute("download", filename);
                link.style.visibility = 'hidden';
                document.body.appendChild(link);
                link.click();
                document.body.removeChild(link);
            }
        }
    }