import java.util.Date;

public class TestaEscola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Sebastiao da Silva", "999.999.999-00", new Date(), "01");
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + aluno.nome);
        System.out.println("CPF: " + aluno.cpf);
        System.out.println("Data de nascimento: " + aluno.data_nascimento.toString());
        System.out.println("Matricula: " + aluno.matricula);

        double copias = aluno.tirarCopias(10);
        System.out.printf("Quantidade de cópias aluno: %.2f \n\n",copias);

        Professor prof = new Professor("Whashington Luiz", "888.888.888-00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + prof.nome);
        System.out.println("CPF: " + prof.cpf);
        System.out.println("Data de nascimento: " + prof.data_nascimento.toString());

        copias = prof.tirarCopias(10);
        System.out.printf("Quantidade de cópias professor: %.2f \n\n",copias);
    }
}
