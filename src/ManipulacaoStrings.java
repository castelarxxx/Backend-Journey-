public class ManipulacaoStrings {

    public static void main (String[] args){
        //String variavel1 = "Hilary CASTELAR";
        double numero1 = 13.5;
        String variavelConvertida = String.valueOf(numero1);
        System.out.println(variavelConvertida.charAt(1));
        //System.out.println(variavel1.startsWith("Hi"));

        String variavel1 = "Hilary CASTELAR";
        boolean resultado1 = variavel1.startsWith("Hil");
        boolean resultado2 = variavel1.startsWith("il",  1);

//        System.out.println(resultado2);

        //verifica se a string termina com a ocorrencia informada
        boolean resultado3 = variavel1.endsWith("LAR");

        System.out.println(resultado3);


//.length contando caracteres
// trim remove espaços no inicio ou final de uma string
        String variavel2 = "Hilary ";
        System.out.println(variavel2.length());

        String variavelSemEspacos = variavel2.trim();
        System.out.println(variavelSemEspacos.length());
    }

}

//Value of converte qual quer tipo de dado em string
//ChartAt passa o indice que começa de 0 e retorna o caractere

//startsWith passa o prefixo //off set aonde verifica se a string que esta sendo manipulado começa com a ocorrencia informada/ tem esse prefixo
//o ends with verifica se termina

