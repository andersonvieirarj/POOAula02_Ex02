import java.util.Scanner;

/* VISIBILIDADE -> diz respeito a como os atributos
(principalmente) e os métodos são "enxergados" dentro
do código. É a forma de PROTEGER o atributo de acessos
indevidos.
   -> public (+) -> indica que o atributo é visível
   para qualquer classe interna ou externa
   -> private (-) -> indica que o atributo é visível
   apenas pela própria classe
   -> protected (#) -> indica que o atributo é visível
   para as classes do seu pacote e as classes filhas
   -> default (~) -> definição padrão, indica que o
   atributo é visível para as classes do mesmo pacote.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno a = new Aluno();

        a.setNome("Anderson Vieira");   // MODIFICAR
        System.out.println(a.getNome());// ACESSANDO

        System.out.println("Digite a primeira nota:");
        a.setNota1(entrada.nextFloat());
    }
}