var giocatore1= Math.floor(Math.random()*(100-1)+1)
var giocatore2= Math.floor(Math.random()*(100-1)+1)

function giocoNumeri(a,b){
    console.log('giocatore1 ' + a);
    console.log('giocatore2 ' + b);
    
    
    var numero= Math.floor(Math.random()*(100-1)+1)
    console.log(numero);
    
    if(a==numero){
        console.log('giocatore 1 vince');
        
    }else if(b==numero){
    console.log('giocatore 2 vince');
    }else{
        if(Math.abs(numero-a)>Math.abs(numero-b)){
            console.log('nessuno ha azzeccato, ma giocatore 2 è più vicino');
            
        }else{
            console.log('nessuno ha azzeccato, ma giocatore 1 è più vicino');
        }
    }
}
giocoNumeri(giocatore1, giocatore2)