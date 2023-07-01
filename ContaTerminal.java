import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Digite a agência da conta: ");
            String agenciaConta = scanner.next();

            scanner.nextLine();

            System.out.print("Digite o nome do titular da conta: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Digite o saldo da conta: ");
            double saldoConta = scanner.nextDouble();

            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
            String saldoFormatado = decimalFormat.format(saldoConta);

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta "+ numeroConta +" e seu saldo de R$" + saldoFormatado + " já está disponível para saque");
        }


}
