package br.com.cubosacademy.patterns.factory;

public class TesteFabrica {
    public static void main(String[] args) {
        Moeda moeda = MoedaFabrica.getInstance("BR");
        System.out.println(moeda.getPrefixo());
    }
}
