package Java.Q2;


public class DescontosManage implements Desconto {

    @Override
    public double desconto(double ingresso) {
        
        double novoIngresso = ingresso / 2;
        return novoIngresso;
    }

    @Override
    public double atendentesAcrescimo(double salario) {
        
        double somaSalario = salario * 0.01;
        return somaSalario;
    }

    
}