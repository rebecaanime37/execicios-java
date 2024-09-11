import java.util.Scanner;
public class EmprestimoBancario {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();
        
        
        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = sc.nextInt();
        
       
        System.out.print("Digite o salário do solicitante: ");
        double salario = sc.nextDouble();
        
       
        sc.close();
        
        
        double valorParcela = valorEmprestimo / numeroParcelas;
        
        // Verifique se o valor da parcela é no máximo 30% do salário
        if (valorParcela <= 0.30 * salario) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo rejeitado");
        }
}
}
