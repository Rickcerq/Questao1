public class Professor extends Pessoa{
    private Double Salario;

    public Professor(){}
    public Professor(String nome, int idade, Double Salario) {
        super(nome, idade);
        this.Salario = Salario;
    }

    public Double getSalario() {
        return Salario;
    }

    public void mostrar_dados_professor() {
        super.mostrar_dados();
        System.out.println(Salario);
    }
}
