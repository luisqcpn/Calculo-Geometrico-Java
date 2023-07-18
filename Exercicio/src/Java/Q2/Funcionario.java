package Java.Q2;

public class Funcionario extends Pessoa {
    private String funcao;
    private double salarioBase = 2100.00;
    private double ajusteSalario = salarioBase;

    public Funcionario() {}

    public void criarFuncionario(String nome, String cpf, int idade, String funcao) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return this.funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }
    public void setSalarioBase(double salario) {
        this.salarioBase = salario;
    }

    public double getAjusteSalario() {
        return this.ajusteSalario;
    }

    public void setAjusteSalario(double ajusteSalario) {
        this.ajusteSalario = ajusteSalario;
    }

}