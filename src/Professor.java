import java.util.Date;

public class Professor extends Pessoa{
    public double salario;
    public String disciplina;
    public Professor(String nome, String cpf, Date data) {
        super(nome, cpf, data);
    }
    public Professor(String nome, String cpf, Date data, double salario, String disciplina) {
        super(nome, cpf, data);
        this.salario = salario;
        this.disciplina = disciplina;
    }
}
