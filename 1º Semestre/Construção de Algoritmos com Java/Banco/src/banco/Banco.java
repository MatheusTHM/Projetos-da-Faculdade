//Criar uma representação de um Caixa Eletrônico
package banco;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo, usuário.");
        String cpf,log,agencia,banco;
        double saldo = 1000.00;
        String extrato = "Saldo : "+saldo;
        int deposito,saque,transferencia,conta;
        System.out.println("Insira seu cpf sem pontos ou hífen:");
        cpf = ler.next();
        if(!cpf.equals("12345678900")){
            System.out.println("Acesso negado!");
        }else{
            String senha;
            int tentativas = 2;
            boolean acesso = false;
            while(acesso == false){
                while(tentativas > 0){
                    System.out.println("Insira sua senha:");
                    senha = ler.next();
                    if(!senha.equals("01020304")){
                        tentativas--;
                        System.out.println("Tentativas restantes: "+tentativas);
                    }else{
                        acesso = true;
                        break;
                    }
                }
                break;
            }
            while(acesso == true){
                int opcao;
                System.out.println("Escolha uma opção:\n 1 – Saldo \n 2 – Depósito \n 3 – Saque \n 4 – Extrato \n 5 – Transferêcia \n 0 – Sair");
                opcao = ler.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Seu saldo atual é: "+saldo);
                        break;
                    case 2:
                        System.out.println("Insira o valor a ser depositado: ");
                        deposito = ler.nextInt();
                        saldo += deposito;
                        System.out.println("Seu saldo atual é: "+saldo);
                        log=("\nDeposito: "+deposito+"\nSaldo: "+saldo);
                        extrato+=log;
                        break;
                    case 3:
                        System.out.println("Insira o valor a ser sacado: ");
                        saque = ler.nextInt();
                        saldo -=saque;
                        System.out.println("Seu saldo atual é: "+saldo);
                        log=("\nSaque: "+saque+"\nSaldo: "+saldo);
                        extrato+=log;
                        break;
                    case 4:
                        System.out.println(extrato);
                        break;
                    case 5:
                        System.out.println("Insira o valor a ser tranferido: ");
                        transferencia = ler.nextInt();
                            if(transferencia > saldo){
                                System.out.println("Saldo insuficiente para continuar a transação.");
                            }else{
                                System.out.println("Insira o número da conta:");
                                conta = ler.nextInt();
                                System.out.println("Insira o nome da agência:");
                                agencia = ler.next();
                                System.out.println("Insira o nome do banco:");
                                banco = ler.next();
                                saldo -=transferencia;
                                System.out.println("Seu saldo atual é: "+saldo);
                                log=("\nTransferência: "+transferencia+"\nSaldo: "+saldo);
                                extrato+=log;
                            }
                        break;
                    case 0:
                        System.out.println("Saindo da sua conta."); 
                        acesso = false;
                        break;
                }
            }
        }
    }
    
}