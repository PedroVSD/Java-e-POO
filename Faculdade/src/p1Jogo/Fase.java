package p1Jogo;

public class Fase {
    private final String nome;
    private int dificuldade;
    private static int numeroPersonagens;

    public Fase(String nome, int dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public void definirDificuldade() {
        this.dificuldade = 1 + numeroPersonagens;
    }

    public String getNome() {
        return nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public static int getNumeroPersonagens() {
        return numeroPersonagens;
    }

    public static void setNumeroPersonagens(int numeroPersonagens) {
        Fase.numeroPersonagens = numeroPersonagens;
    }
}
