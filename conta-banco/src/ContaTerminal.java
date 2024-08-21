import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.print("Por favor digite o numero da conta: ");
        numero = sc.nextInt();

        System.out.print("Por favor digite sua agencia: ");
        agencia = sc.next();

        System.out.print("Por favor digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.print("Por favor digite seu nome: ");
        nomeCliente = sc.next();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + 
                            " e seu saldo " + saldo + " já está disponível para saque.");  
    }
}


