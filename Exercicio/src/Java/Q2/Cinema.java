package Java.Q2;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Funcionario funcionario = new Funcionario();
        DescontosManage desc = new DescontosManage();
        int continuar = 1;
        
        Scanner reader = new Scanner(System.in);

        while (continuar == 1) {

            System.out.println("\n1-Criar cliente\n2-Criar funcionario\n3-Realizar venda\n4-Ver salario");
            int menu = reader.nextInt();

            switch (menu) {
                case 1:

                    System.out.print("Nome: ");
                    String nomeCliente = reader.next();

                    System.out.print("CPF: ");
                    String cpfCliente = reader.next();

                    System.out.print("Idade: ");
                    int idadeCliente = reader.nextInt();

                    System.out.print("Filme: ");
                    String filmeCliente = reader.next();

                    System.out.print("Preço: ");
                    double precoCliente = reader.nextDouble();

                    System.out.print("Meia entrada (true/false): ");
                    boolean isMeiaEntradaCliente = reader.nextBoolean();

                    cliente.criarCliente(nomeCliente, cpfCliente, idadeCliente, filmeCliente, precoCliente, isMeiaEntradaCliente);


                break;

                case 2:

                    System.out.print("Nome: ");
                    String nomeFuncionario = reader.next();

                    System.out.print("CPF: ");
                    String cpfFuncionario = reader.next();

                    System.out.print("Idade: ");
                    int idadeFuncionario = reader.nextInt();

                    System.out.print("Função: ");
                    String funcaoFuncionario = reader.next();


                    funcionario.criarFuncionario(nomeFuncionario, cpfFuncionario, idadeFuncionario, funcaoFuncionario);

                break;

                case 3:

                    if (!cliente.isMeiaEntrada()) {

                        funcionario.setAjusteSalario(desc.atendentesAcrescimo(funcionario.getSalarioBase()) + funcionario.getAjusteSalario());
                    }

                break;

                case 4:

                    System.out.print("Salario do " + funcionario.getNome() + " é de R$" + funcionario.getAjusteSalario());

                break;

                default:

                    System.out.print("Escolha uma opção válida");
                break;
            }

        }
        reader.close();
    }
}