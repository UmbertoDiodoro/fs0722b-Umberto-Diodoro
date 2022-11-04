
function aggiungiCifra(bottone){

    document.getElementById("display").value += bottone.getAttribute('data-simbolo');

}

function tot(){
    let display = document.getElementById("display");
    display.value = eval(display.value);
}

function cancella(){
    display.value = '';
}
