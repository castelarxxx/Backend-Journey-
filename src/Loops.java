public class Loops {
    public static void main (String[] args){
        int [] arraySimples = {1, 2 , 3, 4};

        for(int i = 0; i < arraySimples.length; i++){
            System.out.println(arraySimples[i]);
        }
        //System.out.println(arraySimples.length);
        for( int numero: arraySimples){
            System.out.println(numero);
        }
    }
}
// operador ++ vai acrescentando, vai executar enquanto i for menor que array simples ( i = 0)
//for each ele vai repetir a mesma coisa do for e percorrendo o array simples, acessando cada elemento do array
