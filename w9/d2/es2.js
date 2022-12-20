var SonAccount = /** @class */ (function () {
    function SonAccount() {
        this.balanceInit = 0;
    }
    SonAccount.prototype.oneDeposit = function (somma) {
        this.balanceInit += somma;
    };
    SonAccount.prototype.oneWithDraw = function (somma) {
        this.balanceInit -= somma;
    };
    return SonAccount;
}());
var MotherAccount = /** @class */ (function () {
    function MotherAccount() {
        this.balanceInit = 0;
    }
    MotherAccount.prototype.twoDeposit = function (somma) {
        this.balanceInit += somma;
    };
    MotherAccount.prototype.twoWithDraw = function (somma) {
        this.balanceInit -= somma;
    };
    MotherAccount.prototype.addInterest = function () {
        return this.balanceInit / 10;
    };
    return MotherAccount;
}());
var madre = new MotherAccount();
var figlio = new SonAccount();
figlio.oneDeposit(50000000);
figlio.oneWithDraw(200000);
console.log(figlio.balanceInit);
madre.twoDeposit(120);
madre.twoWithDraw(20);
console.log(madre.addInterest());
