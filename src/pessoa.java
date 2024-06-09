import java.awt.*;

public  abstract class pessoa {// de classe concreta para abstrata

    private String nome;

    private String cpf;

    private int pontos;


    public pessoa (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.pontos = 0;
    }
    public String imprimirSaudacao(){
        return "Ola pessoa" + this.nome;//Polimorfismo
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public int getPontos(){
        return pontos;
    }
    public void calcularPontos(int minutos){
       // this.pontos += minutos * 2;
    }
}
