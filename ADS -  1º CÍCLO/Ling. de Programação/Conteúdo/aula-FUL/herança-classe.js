herança-classe.js
 
class Pessoa {
  constructor(nome = "", sobrenome = "", idade = 0) {
    this.nome = "nome";
    this.sobrenome = "sobrenome";
    this.idade = "idade";
    this.profissão = "profissão";
  }
 
  mostre() {
    return `Olá! Prazer! Me chamo ${this.nome} ${this.sobrenome}. Tenho ${this.idade}`;
  }
}
 
class Trabaiadô extends Pessoa {
  constructor(nome = "", sobrenome = "", idade = 0, profissão = "") {
    super(nome, sobrenome, idade);
    this.profissão = profissão;
  }
  profissão="";
 
  mostre(){
    return super.mostre() + ` E sou ${this.profissão}`;
  }
}
 
let mae = new Trabaiadô();
mae.nome = "Agda";
mae.sobrenome = "Lena";
mae.idade = 40;
mae.profissão = "Servidora Pública";
let pai = new Trabaiadô();
pai.nome = "Agdo";
pai.sobrenome = "Leno";
pai.idade = 40;
pai.profissão = "Policial";
 
console.log(mae.mostre());
console.log(pai.mostre());