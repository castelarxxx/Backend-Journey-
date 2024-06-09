package br.com.cubosacademy.patterns.factory;

public class Dolar implements Moeda{
        @Override
        public String getPrefixo(){
            return  "$";
        }
}
