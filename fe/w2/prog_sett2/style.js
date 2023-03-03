
function aggiungiCifra(bottone){

    document.getElementById("text").value += bottone.getAttribute('data-simbolo');

}

function tot(){
    let text = document.getElementById("text");
    text.value = eval(text.value);
}

function del(){
    text.value = '';
}