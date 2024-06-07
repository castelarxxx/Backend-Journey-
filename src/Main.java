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
            pessoa Hilary = new Aluno("Hilary", "5291873737");
            Professor Joao = new Professor("joao", "8934723894892", 10000);
        }

    }
}