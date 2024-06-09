public class Professor extends pessoa implements Usuario{
     private int salario;

    public Professor (String nome , String cpf, int Salario){
        super (nome, cpf);
        this.salario = salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public void calcularPontos(int minutos){
        int pontos = minutos * 3;
    // this.setPontos(pontos);
    }

    public String imprimirSaudacao(){
        return "Ola professor" + this.getNome();
    }
}
