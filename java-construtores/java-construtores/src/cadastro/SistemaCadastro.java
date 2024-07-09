package cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa cadastro = new Pessoa("1254","Leonardo");

        cadastro.setEndereco("Rua Teste, N233");

        System.out.println("Cliente " + cadastro.getNome() + " com o cadastro no CPF " + cadastro.getCpf() + ", endereço " + cadastro.getEndereco());
    }
}
