package Java.Q2;

public class Cliente extends Pessoa {
    
    private String filme;
    private double preco;
    private boolean meiaEntrada;

    public Cliente() {}

    public void criarCliente(String nome, String cpf, int idade, String filme, double preco, boolean meiaEntrada) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.filme = filme;
        this.preco = preco;
        this.meiaEntrada = meiaEntrada;
    }

    public String getFilme() {
        return filme;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public boolean isMeiaEntrada() {
        return meiaEntrada;
    }
    public void setMeiaEntrada(boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }
}