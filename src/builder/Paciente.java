package builder;

public class Paciente {
    private String nome;
    private String email;
    private String cpf;

    public Paciente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String imprimir() {
        String ficha = "Ficha do paciente";
        if (this.nome != null) {
            ficha += "Nome: " + this.nome;

        }
        if (this.email != null) {
            ficha += "Email: " + this.email;

        }
        if (this.cpf != null) {
            ficha += "Cpf: " + this.cpf;

        }
     return ficha;
    }
}
