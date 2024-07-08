package escola;


public class Escola {
    public static void main(String[] args) {
        Aluno leo = new Aluno();

        leo.setNome("Leonardo");
        leo.setIdade(21);
        leo.setSexo("Masculino");

        System.out.println("O aluno " + leo.getNome() + " tem " + leo.getIdade() + " anos!");

    }
}
