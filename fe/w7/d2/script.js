import {Persona} from './moduli/Persona.js';
var umano1 = new Persona('Umberto', 'Diodoro', 23);
var umano2 = new Persona('Stefano', 'Gavioli', 21);
var umano3 = new Persona('Tizio', 'Caio', 50);

var responso = umano2.confrontaEta(umano1, umano3);
console.log(responso);