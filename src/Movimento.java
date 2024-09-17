    import java.util.Scanner;
 
public class Movimento {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
 
        // Solicitar ao usuário que insira a distância percorrida em metros
        System.out.print("Digite a distância percorrida em metros: ");
        double distancia = scanner.nextDouble();
 
        // Solicitar ao usuário que insira o tempo gasto em segundos
        System.out.print("Digite o tempo gasto em segundos: ");
        double tempo = scanner.nextDouble();
 
        // Fechar o scanner
        scanner.close();
 
        // Calcular a velocidade média
        double velocidadeMedia = distancia / tempo;
 
        // Determinar o tipo de movimento com base na velocidade média
        if (velocidadeMedia < 5) {
            System.out.println("Movimento lento");
        } else if (velocidadeMedia >= 5 && velocidadeMedia <= 15) {
            System.out.println("Movimento moderado");
        } else {
            System.out.println("Movimento rápido");
        }
    }
}