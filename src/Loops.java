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

        int a = 0;

        while ( a > -1 ){
           // System.out.println(arraySimples[a]);
            System.out.println();
            a ++;
        }
    }
}
// operador ++ vai acrescentando, vai executar enquanto i for menor que array simples ( i = 0)
//for each ele vai repetir a mesma coisa do for e percorrendo o array simples, acessando cada elemento do array
//while enquanto A for menor que o tmaanho do array, ele vai incrementar A, igual ao for
// while prestar atenção para não entrar em loop infinito exemplo no A> -1