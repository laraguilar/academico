import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa() {
        Scanner s = new Scanner(System.in);

        System.out.print("Nome: ");
        setNome(s.nextLine());

        System.out.print("CPF: ");
        setCpf(s.nextLine());
    }

    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String toString() {
        return (getNome() + " (CPF: " + getCpf() + ")");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
