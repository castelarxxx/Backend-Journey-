package br.com.cubosacademy.pacotes.classesAB;

public class ClasseB {
    public static void main(String[] args) {
        ClasseA classeA = new ClasseA();
        System.out.println(classeA.nome);
    }// as classes protected conseguem se acessar se for do mesmo pacote
}
