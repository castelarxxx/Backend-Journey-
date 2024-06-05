public class manipulacaoArrays {
    public static void main(String[] args) {
        // int []  array = {1, 234, 93};
        //int []array2 = {1, 234, 937}pode passar dessa forma
        //int array3[]= {1, 234, 937} dessa forma também

        // int[] array4 = new int [5];
        // array4 [0] = 2000;
        // array4 [1] = 2001;
        // array4 [2] = 2002;
        //System.out.println(array4[1]);
       // String[][] arrayMultidimensional = {{"Hilary", "Castelar",},
               // {"Hilary", "Alves",},
                //{"CASTELAR", "ALVES"}};
        //System.out.println(arrayMultidimensional[0][1]);

         int[][] arrayMultidimensional2 =  new int[2][2];
        arrayMultidimensional2[0][0]= 1;
        arrayMultidimensional2 [0][1] = 2;
        arrayMultidimensional2 [1][0]= 3;
        System.out.println(arrayMultidimensional2[0][1]);
    }
}
//array multidimensional- da mesma forma que cria a quantidade de arrays, acessa o elemento
