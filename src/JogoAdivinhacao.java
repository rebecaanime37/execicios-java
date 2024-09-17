import java.util.Random;
import java.util.Scanner;
 
public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Criar um gerador de números aleatórios
        Random random = new Random();
 
        // Gerar um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
 
        int palpite = 0;
        // Iniciar o jogo
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu gerei um número entre 1 e 100. Tente adivinhar qual é!");
 
        // Loop até que o usuário adivinhe corretamente
        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
 
            // Verificar o palpite e fornecer feedback
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }
        }
 
        // Fechar o scanner
        scanner.close();
    }
}