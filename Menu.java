import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int opt = 0;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("\nOpções: ");
            System.out.println("1. Cadastrar curso");
            System.out.println("2. Cadastrar professor");
            System.out.println("3. Cadastrar aluno");
            System.out.println("4. Listar curso");
            System.out.println("5. Listar professores");
            System.out.println("6. Listar alunos");
            System.out.println("7. Sair");

            try {
                System.out.print("Escolha uma opção: ");
                opt = scanner.nextInt();
                scanner.nextLine();  // Consumir a nova linha residual após o nextInt()
            } catch (Exception e) {
                System.out.println("Opção inválida. Por favor, insira um número.");
                scanner.nextLine();  // Consumir a linha residual em caso de erro
                continue;
            }

            switch (opt) {
                case 1:
                    System.out.println("Cadastrar curso:");
                    System.out.print("Digite o id do curso: ");
                    int iddoCurso = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha residual
                    System.out.print("Digite o nome do curso: ");
                    String nomedoCurso = scanner.nextLine();
                    System.out.print("Digite a carga horária: ");
                    int cargaHoraria = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha residual
                    System.out.print("Digite o id do professor deste curso: ");
                    int idProfessor = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha residual
                    new Curso(iddoCurso, nomedoCurso, cargaHoraria, idProfessor);
                    System.out.println("Curso cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Cadastrar professor:");
                    System.out.print("Digite o id do professor: ");
                    int iddoProfessor = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha residual
                    System.out.print("Digite o nome do professor: ");
                    String nomedoProfessor = scanner.nextLine();
                    System.out.print("Digite o departamento: ");
                    String departamento = scanner.nextLine();
                    new Professor(iddoProfessor, nomedoProfessor, departamento);
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Cadastrar aluno:");
                    System.out.print("Digite o id do aluno: ");
                    int idAluno = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha residual
                    System.out.print("Digite o nome do aluno: ");
                    String nomedoAluno = scanner.nextLine();
                    System.out.print("Digite a data de nascimento do aluno: ");
                    String dataNasc = scanner.nextLine();
                    System.out.print("Digite o CPF do aluno: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o id do curso do aluno: ");
                    int idCursoDoAluno = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha residual
                    new Aluno(idAluno, nomedoAluno, dataNasc, cpf, idCursoDoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("Listar cursos:");
                    for (Curso cursoPrint : Curso.cursos) {
                        System.out.println("Nome: " + cursoPrint.nomedoCurso + 
                                           " / Carga horária: " + cursoPrint.cargaHoraria + 
                                           " / Professor: " + Professor.buscaProfessor(cursoPrint.idProfessor).nomedoProfessor + 
                                           " / Qtde de alunos: " + Aluno.contarAlunosPorCurso(cursoPrint.iddoCurso));
                    }
                    break;

                case 5:
                    System.out.println("Listar professores:");
                    for (Professor professorPrint : Professor.professores) {
                        System.out.println("Nome: " + professorPrint.nomedoProfessor + 
                                           " / Departamento: " + professorPrint.departamento);
                    }
                    break;

                case 6:
                    System.out.println("Listar alunos:");
                    for (Aluno alunoPrint : Aluno.alunos) {
                        System.out.println("Nome: " + alunoPrint.nomedoAluno + 
                                           " / CPF: " + alunoPrint.cpf + 
                                           " / Data de nascimento: " + alunoPrint.dataNascimento + 
                                           " / Curso: " + Curso.buscaCurso(alunoPrint.idCurso).nomedoCurso);
                    }
                    break;

                case 7:
                    System.out.println("Tchau...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opt != 7);
        scanner.close();
    }
}
