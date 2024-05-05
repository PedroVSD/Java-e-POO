package p1Jogo;

public class Fase {
    private final String nome;
    private int dificuldade;
    private static int numeroPersonagens;

    public Fase(String nome, int dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    // Método para definir a dificuldade com base no número de personagens
    public void definirDificuldade() {
        this.dificuldade = 1 + numeroPersonagens;
    }

    // Método getter para o nome da fase
    public String getNome() {
        return nome;
    }

    // Método getter para a dificuldade da fase
    public int getDificuldade() {
        return dificuldade;
    }

    // Método getter para o número de personagens
    public static int getNumeroPersonagens() {
        return numeroPersonagens;
    }

    // Método setter para o número de personagens
    public static void setNumeroPersonagens(int numeroPersonagens) {
        Fase.numeroPersonagens = numeroPersonagens;
    }
}
