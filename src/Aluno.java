public class Aluno {
    private String nome;
    private String disciplina;
    private String turma;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float media;
    /* MÉTODOS DE ACESSO
    São os métodos que vão permitir alterar (modificar)
    ou acessar (visualizar) os atributos
    SET -> método que permite alterar (modificar) os valores
    de dentro do atributo
    GET -> método que permite acessar (visualizar) os
    valores dos atributos
    -> PARA CADA ATRIBUTO UMA DUPLA GET/SET <-
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    // Métodos da Classe
    public void calcularMedia(){
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Média: " + media);
    }
    public void verificarAprovacao(){
        if (media>=7) {
            System.out.println("Você está aprovado!");
        }
        else {
            System.out.println("Você está reprovado!");
        }
    }
    public int verificarAno (int idade){
        int anoNascimento = 2023-idade;
        return anoNascimento;
    }
}

