import java.util.Scanner;
 
public class SomaArray {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
 
        // Criar um array para armazenar os 5 números inteiros
        int[] numeros = new int[5];
 
        // Ler os 5 números inteiros do usuário e armazená-los no array
        System.out.println("Digite 5 números inteiros:");
 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
 
        // Fechar o scanner
        scanner.close();
 
        // Calcular a soma dos elementos do array
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
 
        // Exibir a soma
        System.out.println("A soma de todos os elementos do array é: " + soma);
    }
}
