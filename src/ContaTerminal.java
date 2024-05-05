import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int Numero = 0;
        String Agencia = "";
        String NomeCliente = "";
        double Saldo = 0.0;

        System.out.println("Por favor, digite o número da sua Conta:");
        Numero = scanner.nextInt();

        System.out.println("Agora digite o número da Agência:");
        Agencia = scanner.next();
       
        System.out.println("Por favor, digite o seu Nome:");
        NomeCliente = scanner.nextLine();
        NomeCliente = scanner.nextLine();

        System.out.println("Digite o valor do seu primeiro depósito:");
        Saldo = scanner.nextDouble();



        System.out.print("Olá " + NomeCliente + " Obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de R$" + Saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
