public class Main {
    public static void main(String[] args) {
    Aluno a1 = new Aluno("Pedro", 18, 341129);
    a1.mostrar_dados_alunos();

    Aluno a2 = new Aluno("Marcelo", 23, 873364);
    a2.mostrar_dados_alunos();

    Professor p1 = new Professor("José", 45, 4000.89);
    p1.mostrar_dados_professor();

    Professor p2 = new Professor("Lucas", 36, 4000.89);
    p2.mostrar_dados_professor();
    }
}