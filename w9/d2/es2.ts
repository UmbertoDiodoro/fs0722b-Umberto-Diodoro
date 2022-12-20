class SonAccount{
    balanceInit:number = 0;
    constructor(){

    }
    oneDeposit(somma:number){
        this.balanceInit += somma
    }
    oneWithDraw(somma:number){
        this.balanceInit -= somma
    }
}

class MotherAccount{
    balanceInit:number = 0;
    constructor(){
        
    }
    twoDeposit(somma:number){
        this.balanceInit += somma
    }
    twoWithDraw(somma:number){
        this.balanceInit -= somma
    }
    addInterest(){
        return this.balanceInit /10
    }
}

var madre = new MotherAccount()
var figlio = new SonAccount()

figlio.oneDeposit(50000000)
figlio.oneWithDraw(200000)
console.log(figlio.balanceInit);

madre.twoDeposit(120)
madre.twoWithDraw(20)
console.log(madre.addInterest());


