//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //variaveis e constantes
    public static void main(String[] args) {
        String txt = "Hilary Castelar";

        System.out.print(txt);

        txt = "Cubos Academy";
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print(txt);

         final String txt2 = "Minha primeira constante em Java";

         System.out.print(txt2);
         
         //Tipos de dados

        //numeros
        //numeros inteiros

        int numeroInteiro = 12;
        System.out.println(numeroInteiro);
        //numeros double
        double numeroDecimal = 12.5;
        System.out.println(numeroDecimal);

        //lógicos
        boolean verdadeiroOuFalso = true;
        System.out.println(verdadeiroOuFalso);
        //próximos vamos vendo outros tipos de dados



        //Estruturas de Condição
        //operadores ==, >=, <=, !=
        // && and ! para estruturas de decisão
        int numero1 = 10;
        int numero2 = 16;

        if (numero1 > numero2){
            System.out.println("numero 1 maior");

        } else if (numero1 == numero2){
            System.out.println("numero 1 é igual ao dois");
        }
        else{
            System.out.println("numero dois é maior que o 1");
        }
    }
}