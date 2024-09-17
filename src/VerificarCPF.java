import java.util.Scanner;
 
public class VerificarCPF {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
 
        // Solicitar ao usuário que insira o número do CPF
        System.out.print("Digite o número do CPF (somente os dígitos, sem pontos e traços): ");
        String cpf = scanner.nextLine();
 
        // Fechar o scanner
        scanner.close();
 
        // Verificar se o CPF possui exatamente 11 dígitos
        if (cpf.length() == 11 && cpf.matches("\\d+")) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
}
    
