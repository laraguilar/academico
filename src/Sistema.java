public class Sistema {
    private int nProfs;
    private int nAlunos;
    private Professor[] profs;
    private Aluno [] alunos;

    public Sistema() {
        setProfs(new Professor[100]);
        setAlunos(new Aluno[1000]);
        setnAlunos(0);
        setnProfs(0);
    }

    public void novoProf(Professor p) {
        this.profs[getnProfs()] = p;
        setnProfs(getnProfs()+1);
    }

    public void novoAluno(Aluno a) {
        this.alunos[getnAlunos()] = a;
        setnAlunos(getnAlunos() + 1);
    }

    public Professor encontrarProfessor(String cpf) {
        for ( int i = 0; i < getnProfs(); i++) {
            Professor prof = getProfs()[i];

            if(prof.getCpf().equals(cpf)) {
                return prof;
            }
        }
        return null;
    }

    public void listarProfs() {
        if (getnProfs() == 0) {
            System.out.println("Nenhum professor cadastrado até agora.");
        } else {
            System.out.println("Professores cadastrados: ");
            for (int i = 0; i < getnProfs(); i++) {
                Professor prof = getProfs()[i];
                System.out.println(prof.toString());
            }
        }
        System.out.println();
    }

    public Aluno encontrarAluno(String matr){
        for ( int i = 0; i < getnAlunos(); i++) {
            Aluno aln = getAlunos()[i];

            if(aln.getMat().equals(matr)) {
                return aln;
            }
        }
        return null;
    }

    public void listarAlunos() {
        if(getnAlunos() == 0) {
            System.out.println("Nenhum aluno cadastrado até agora.");
        } else {
            System.out.println("Alunos cadastrados: ");
            for ( int i = 0; i < getnAlunos(); i++) {
                Aluno aln = getAlunos()[i];
                System.out.println(aln.toString());
            }
        }
        System.out.println();
    }

    public int getnProfs() {
        return nProfs;
    }

    public void setnProfs(int nProfs) {
        this.nProfs = nProfs;
    }

    public int getnAlunos() {
        return nAlunos;
    }

    public void setnAlunos(int nAlunos) {
        this.nAlunos = nAlunos;
    }

    public Professor[] getProfs() {
        return profs;
    }

    public void setProfs(Professor[] profs) {
        this.profs = profs;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
