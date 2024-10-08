import java.util.ArrayList;
 
public class Curso {
    int iddoCurso;
    String nomedoCurso;
    int cargaHoraria;
    int idProfessor;
    static ArrayList<Curso> cursos = new ArrayList<>();

public Curso(
    int iddoCurso,
    String nomedoCurso,
    int cargaHoraria,
    int idProfessor
    ) {
        this.iddoCurso = iddoCurso;
        this.nomedoCurso= nomedoCurso;
        this.cargaHoraria = cargaHoraria;
        this.idProfessor = idProfessor;
        cursos.add(this);
    }

    static Curso buscaCurso(int id) {
        for (Curso cursoPrint : cursos) {
            if (cursoPrint.iddoCurso == id) {
                return cursoPrint;
            }
        }
        return null;
    }
    static String cursoAssociado(int idProfessor) {
        for (Curso curso : cursos) {
            if (curso.idProfessor == idProfessor) {
                return curso.nomedoCurso;  
            }
        }
        return "Nenhum curso associado";  
    }
}
