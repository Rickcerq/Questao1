public class Aluno extends Pessoa{
    private int matricula;
    public Aluno(){}

    public Aluno (String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void mostrar_dados_alunos() {
        super.mostrar_dados();
        System.out.println(matricula);
    }
}
