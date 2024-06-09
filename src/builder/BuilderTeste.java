package builder;

public class BuilderTeste {
    public static void main(String[] args) {
       // Paciente hilary = new Paciente("hilary", "");
     PacienteBuilder builder = new PacienteBuilder();
     builder.setNome("Hilary");
     builder.setEmail("Hilary.castelar@gmail.com");
     builder.setCpf("2367324678234");
     builder.setEmail("hilary555@gmail.com");

     Paciente hilary = builder.getResultado();
        System.out.println(hilary.imprimir());
    }
}

