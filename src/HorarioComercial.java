import java.util.Scanner;
 
public class HorarioComercial {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
 
        // Solicitar ao usuário que insira a hora
        System.out.print("Digite a hora em formato de 24 horas (por exemplo, 14 para 14:00): ");
        int hora = scanner.nextInt();
 
        // Fechar o scanner
        scanner.close();
 
        // Verificar se a hora está dentro do horário comercial
        if (hora >= 9 && hora < 18) {
            System.out.println("A hora " + hora + " está dentro do horário comercial.");
        } else {
            System.out.println("A hora " + hora + " não está dentro do horário comercial.");
        }
    }
}
