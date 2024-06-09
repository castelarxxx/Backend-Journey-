package br.com.cubosacademy.patterns.factory;

public class Real implements Moeda {
    @Override
    public String getPrefixo(){
        return  "R$";
    }
}
