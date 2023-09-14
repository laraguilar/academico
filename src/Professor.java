import java.util.Scanner;

public class Professor extends Pessoa{
    private double salario;

    public Professor() {
        super();

        Scanner s = new Scanner(System.in);

        System.out.print("Salário: ");
        setSalario(s.nextDouble());

        System.out.println("Professor cadastrado com sucesso!");

    }

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;

        System.out.println("Professor cadastrado com sucesso!");
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
