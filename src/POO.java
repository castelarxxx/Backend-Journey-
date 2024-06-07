public class POO {

                private String modelo; //encapsulamento

                private String marca;

                private String cor;

                public int ano;

                private boolean ligado;

                private int aceleracao;

                private int idade;

   public POO(String modelo, String marca, String cor, int ano ){
    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.ano = ano;
    this.ligado = true;
    this.aceleracao = 0;
    this.setIdade();
   }

   public void ligar (){
       if (this.ligado) {
               return;
       }
       this.ligado = true;
   }

    public void desligar (){
        if (!this.ligado) {//nega a condição
            return;
        }
        this.aceleracao = 0;
        this.ligado = false;
    }

    public void acelerar (String tipoAceleracao){
    switch(tipoAceleracao){
        case "forte":
            this.aceleracao += 1000;
            break;
        case "fraca":
            this.aceleracao += 500;
        default:
            this.aceleracao += 750;
            break;
    }
   }

    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getCor() {
        return cor;
    }
    public int getAno() {
        return ano;
    }
    public boolean getLigado() {
        return ligado;
    }
    public int getAceleracao() {
        return aceleracao;
    }

    public void setCor(String cor){
       this. cor = "cor";
    }
    private void setIdade(){
       this.idade = 2023 - this.ano;
    }
    public int getIdade(){
       return idade;
    }
}
//metodos de encapsulamento get e set

//Neste exemplo, os métodos get (getModelo e getCor) permitem acessar os valores dos atributos privados modelo e cor
// /enquanto os métodos set (setModelo e setCor) permitem modificar esses valores.