public class Aluno  extends pessoa implements Usuario{//classe herdeira com extends
    public Aluno(String nome , String cpf){

        super (nome, cpf);
    }

    public String imprimirSaudacao(){
        return "Ola Aluno(a)" + this.getNome();//polimorfismo
    }
}
