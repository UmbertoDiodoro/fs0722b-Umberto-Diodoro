fetch("assets/Abbigliamento.json")
    .then(function (response) {
    return response.json();
})
    .then(function (myJson) {
    var autunno = document.querySelector('#autunno');
    var inverno = document.querySelector('#inverno');
    var primavera = document.querySelector('#primavera');
    var estate = document.querySelector('#estate');
    var coloreSfondo;
    for (var i = 0; i < myJson.length; i++) {
        var vestito = new Vestito(myJson[i].id, myJson[i].codprod, myJson[i].collezione, myJson[i].capo, myJson[i].modello, myJson[i].quantita, myJson[i].colore, myJson[i].prezzoivaesclusa, myJson[i].prezzoivainclusa, myJson[i].disponibile, myJson[i].saldo);
        if (vestito.colore == 'nero') {
            coloreSfondo = 'black';
        }
        else if (vestito.colore == 'rosso') {
            coloreSfondo = '#FF0800';
        }
        else if (vestito.colore == 'beige') {
            coloreSfondo = '#caaa81';
        }
        else if (vestito.colore == 'verde') {
            coloreSfondo = '#00FF40';
        }
        else if (vestito.colore == 'blu') {
            coloreSfondo = '#0047AB';
        }
        else if (vestito.colore == 'rosa') {
            coloreSfondo = '#F08080';
        }
        else if (vestito.colore == 'arancione') {
            coloreSfondo = '#FF4500';
        }
        else if (vestito.colore == 'bordeaux') {
            coloreSfondo = '#721225';
        }
        else if (vestito.colore == 'grigio') {
            coloreSfondo = '#808082';
        }
        else if (vestito.colore == 'viola') {
            coloreSfondo = '#720e9e';
        }
        else if (vestito.colore == 'azzurro') {
            coloreSfondo = '#00FFFF';
        }
        var scelta = void 0;
        if (vestito.collezione == "autunno") {
            scelta = autunno;
        }
        if (vestito.collezione == "inverno") {
            scelta = inverno;
        }
        if (vestito.collezione == "primavera") {
            scelta = primavera;
        }
        if (vestito.collezione == "estate") {
            scelta = estate;
        }
        scelta.innerHTML += "\n       <div class=\"col-3 my-3\">\n       <div class=\"card\" style=\"background-color:".concat(coloreSfondo, "; border:none\">\n       <div class=\"card-body text-center text-white\">\n         <h5 class=\"card-title mb-2\">").concat((vestito.capo).toUpperCase(), "</h5>\n         <p class=\"card-text lh-2\">Collezione:").concat(vestito.collezione, "</p>\n         <p class=\"card-text lh-2\">Colore:").concat(vestito.colore, "</p>\n         <p class=\"card-text lh-2\">Prezzo iniziale:").concat(vestito.prezzoIvaInclusa, "\u20AC</p>\n         <p class=\"card-text lh-2\">sconto:").concat(vestito.saldo, "%</p>\n         <p class=\"card-text lh-2\">prezzo scontato:").concat(vestito.getAcquistoCapo(), "\u20AC</p>\n         <button class=\"border rounded bg-white\">acquista</button>\n       </div>\n       </div> \n       </div> \n       ");
    }
});
var Vestito = /** @class */ (function () {
    function Vestito(id, codprod, collezione, capo, modello, quantita, colore, prezzoIvaEsclusa, prezzoIvaInclusa, disponibile, saldo) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantita = quantita;
        this.colore = colore;
        this.prezzoIvaEsclusa = prezzoIvaEsclusa;
        this.prezzoIvaInclusa = prezzoIvaInclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    Vestito.prototype.getSaldoCapo = function () {
        return this.prezzoIvaInclusa * this.saldo / 100;
    };
    Vestito.prototype.getAcquistoCapo = function () {
        return JSON.parse(parseFloat(JSON.stringify(this.prezzoIvaInclusa - this.getSaldoCapo())).toPrecision(3));
    };
    return Vestito;
}());
