import java.util.ArrayList;

public class Professor {
    int iddoProfessor;
    String nomedoProfessor;
    String departamento;
    static ArrayList<Professor> professores = new ArrayList<>();
 
    public Professor (
        int iddoProfessor,
        String nomedoProfessor,
        String departamento
    ){
        this.iddoProfessor = iddoProfessor;
        this.nomedoProfessor = nomedoProfessor;
        this.departamento = departamento;
        professores.add(this);
    }

    static Professor buscaProfessor(int id) {
        for (Professor professorPrint : professores) {
            if (professorPrint.iddoProfessor == id) {
                return professorPrint;
            }
        }
        return null;
    }
    
}