import java.util.Scanner;

public class Aluno extends Pessoa{
    private String mat;

    public Aluno(String nome, String cpf, String mat) {
        super(nome, cpf);
        this.mat = mat;
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public String toString() {
        return (getNome() + " (Matrícula: " + getMat() + ")");
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }
}
