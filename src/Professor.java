import java.util.Scanner;

public class Professor extends Pessoa{
    private double salario;

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf);
        setSalario(salario);

        System.out.println("Professor cadastrado com sucesso!");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
