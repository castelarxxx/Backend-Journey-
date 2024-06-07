public class POO {

                public String modelo;

                public String marca;

                public String cor;

                public int ano;

                 public boolean ligado ;

                public int aceleracao ;

   public POO(String modelo, String marca, String cor, int ano ){
    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.ano = ano;
    this.ligado = true;
    this.aceleracao = 0;
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
}

