public class Musica{

    String nome;
    double duracao;

    public Musica(String nome, float duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }
    //Getter e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
}
