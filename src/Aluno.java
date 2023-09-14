import java.util.Scanner;

public class Aluno extends Pessoa{
    private String mat;

    public Aluno() {
        super();

        Scanner s = new Scanner(System.in);
        System.out.print("Matrícula: ");
        setMat(s.nextLine());

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public Aluno(String nome, String cpf, String mat) {
        super(nome, cpf);
        this.mat = mat;
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public String toString() {
        return (nome + " (Matrícula: " + mat + ")");
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }
}
