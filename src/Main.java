//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        {
            POO gol = new POO("Gol", "Volks", "Vermelho", 2000);
         //   Carro.modelo = "civic";
           // Carro.marca = "Honda";
           // Carro.cor = "Preto";
         //   Carro.ano = 1998;
           // System.out.println(Carro.modelo);
            //System.out.println(gol.ano);
            gol.ligar();
            gol.acelerar("forte");
            System.out.println(gol.getLigado());
            System.out.println(gol.getAceleracao());
            gol.desligar();
            System.out.println(gol.getCor());

            System.out.println(gol.getIdade());
            gol.setCor("Vermelho");


          //  pessoa Hilary = new pessoa("Hilary", "5291873737");
            pessoa Hilary = new Aluno("Hilary", "5291873737");// criando um objeto a partir de uma classe
            Professor Joao = new Professor("joao", "8934723894892", 10000);
           Hilary.calcularPontos(10);
           Joao.calcularPontos(30);
            System.out.println(Hilary.getPontos());
            System.out.println(Joao.getPontos());

           // System.out.println(Hilary.imprimirSaudacao());//Polimorfismo
         //   System.out.println(Joao.imprimirSaudacao());

         //  Calculadora Calculadora = new Calculadora(); com static não precisa instanciar com new
            double soma = Calculadora.soma(2,2);

            double subtracao = Calculadora.subtracao(2,2);// com metodos estaticos é assim que acessamos os metodos na classe
          //System.out.println(Calculadora.soma(10,2));
           // System.out.println(Calculadora.subtracao(10,2));
        }
    }
}