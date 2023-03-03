function Persona(){
    this.nome='';
    this.eta= '';
    this.anno_nascita='';
    this.anno_attuale='';
    this.calcolaEta=function(){
       this.eta=this.anno_attuale-this.anno_nascita
    };
}

var nome=document.querySelector('#name');
var cognome=document.querySelector('#surname');
var data=document.querySelector('#date');
var bottone=document.querySelector('#button');
var persona= new Persona();
var tabella= document.querySelector('#tabella');
var current_data= new Date();
bottone.addEventListener('click' ,()=>{
   if(nome.value && cognome.value && data.value)
  {
    persona.nome=nome.value + ' ' + cognome.value;
    persona.anno_nascita= data.value.substring(0,4);
    persona.anno_attuale=current_data.getFullYear()
    persona.calcolaEta();
    console.log(persona.eta);
    var anno= data.value.substring(0,4);
    anno=parseInt(anno);
    persona.eta=current_data.getFullYear()-anno;
    tabella.innerHTML +='<tr> <td>' + persona.nome +'</td> <td>' + persona.eta + '</td>';
    console.log(anno);
    nome.value='';
    cognome.value='';
    data.value='';
  }
  console.log(persona.nome);
  console.log(persona.eta);
});
  
 

