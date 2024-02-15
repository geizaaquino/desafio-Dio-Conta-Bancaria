import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Por favor, digite o número da Agência:");
         String numeroAgencia = scanner.nextLine();
 
         System.out.println("Por favor, digite o número da Conta:");
         String numeroConta = scanner.nextLine();
 
         System.out.println("Por favor, digite o nome do Titular da Conta:");
         String nomeTitular = scanner.nextLine();
 
         System.out.println("Por favor, digite o saldo inicial da Conta:");
         double saldo = scanner.nextDouble();
 
         // Criar a conta com os dados fornecidos
         ContaBanco conta = new ContaBanco(numeroAgencia, numeroConta, nomeTitular, saldo);
 
         // Exibir informações da conta
         System.out.println("\nConta criada com sucesso. Detalhes da Conta:");
         System.out.println(conta );
         scanner.close();
        }
    }
    
    class ContaBanco {
        private String numeroAgencia;
        private String numeroConta;
        private String nomeTitular;
        private double saldo;
    
        public ContaBanco(String numeroAgencia, String numeroConta, String nomeTitular, double saldo) {
            this.numeroAgencia = numeroAgencia;
            this.numeroConta = numeroConta;
            this.nomeTitular = nomeTitular;
            this.saldo = saldo;
        }
        @Override
        public String toString() {
            return "Agência: " + numeroAgencia + "\n" +
                    "Conta: " + numeroConta + "\n" +
                    "Titular: " + nomeTitular + "\n" +
                    "Saldo: " + saldo;
    }
    }
