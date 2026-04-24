import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        // Inserção automática (10 alunos)
        alunos.add(new Aluno("Ana", 20, 8.5));
        alunos.add(new Aluno("Carlos", 22, 7.2));
        alunos.add(new Aluno("Bruna", 19, 9.1));
        alunos.add(new Aluno("Diego", 21, 6.8));
        alunos.add(new Aluno("Eduarda", 23, 8.0));
        alunos.add(new Aluno("Felipe", 20, 7.5));
        alunos.add(new Aluno("Gabriela", 22, 9.3));
        alunos.add(new Aluno("Henrique", 18, 6.9));
        alunos.add(new Aluno("Isabela", 21, 8.7));
        alunos.add(new Aluno("João", 24, 7.8));

        System.out.println("Lista original:");
        System.out.println(alunos);

        // Ordenação por nota (Comparable)
        Collections.sort(alunos);
        System.out.println("\nOrdenado por notaFinal:");
        System.out.println(alunos);

        // Ordenação por nome
        alunos.sort(new ComparadorPorNome());
        System.out.println("\nOrdenado por nome:");
        System.out.println(alunos);

        // Ordenação por idade
        alunos.sort(new ComparadorPorIdade());
        System.out.println("\nOrdenado por idade:");
        System.out.println(alunos);
    }
}
