import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       

        Scanner scaner = new Scanner(System.in);
        System.out.println("Digite o número da sua Conta");
        int conta = scaner.nextInt();

        scaner.nextLine();

        System.out.println("Digite a sua Agencia");
        String numAgencia = scaner.nextLine();

        System.out.println("Digite Seu nome Completo");
        String nomeCompleto = scaner.nextLine();

        System.out.println("Digite o valor do seu Saldo");
        double saldo = scaner.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + numAgencia + ", conta " + conta + "e seu saldo " + saldo + " já está disponivel para saque."  );





    }
}
