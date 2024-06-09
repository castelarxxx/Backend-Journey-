package br.com.cubosacademy.patterns.factory;

public class MoedaFabrica {
    public static Moeda getInstance(String pais){
        switch (pais){
            case "BR": return new Real();
            case "EUA": return new Dolar();
            case "CA" : return new Dolar();
           // default: return new Real();
            default: throw new IllegalArgumentException("País não encontrado.");
        }
    }
}
