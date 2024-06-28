import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      // Solicitação das informações ao usuário
      System.out.println("Por favor, digite o número da Agência:");
      String agencia = scanner.nextLine();

      System.out.println("Por favor, digite o número da Conta:");
      int numero = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do scanner

      System.out.println("Por favor, digite o nome do Cliente:");
      String nomeCliente = scanner.nextLine();

      System.out.println("Por favor, digite o saldo da Conta:");
      double saldo = scanner.nextDouble();

      // Mensagem final com as informações da conta
      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
      System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + ".");
    }
  }
}
