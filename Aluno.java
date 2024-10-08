import java.util.ArrayList;

public class Aluno {
    int iddoAluno;
    String nomedoAluno;
    String cpf;
    String dataNascimento;
    int idCurso;
    static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(
            int iddoAluno,
            String nomedoAluno,
            String cpf,
            String dataNascimento,
            int idCurso) {
        this.iddoAluno = iddoAluno;
        this.nomedoAluno = nomedoAluno;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idCurso = idCurso;
        alunos.add(this);
    }

    static Aluno buscaAluno(int id) {
        for (Aluno alunoPrint : alunos) {
            if (alunoPrint.iddoAluno == id) {
                return alunoPrint;
            }
        }
        return null;
    }
    static int contarAlunosPorCurso(int id) {
        int cont = 0;
        for (Aluno alunoPrint : alunos) {
            if (alunoPrint.idCurso == id) {
                cont++;
            }
        }
        return cont;
    }
   
}