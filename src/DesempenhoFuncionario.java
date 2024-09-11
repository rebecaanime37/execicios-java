import java.util.Scanner;

public class DesempenhoFuncionario {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String funcionario;
        int pontuaçao;
        
    
        System.out.println("Quem é o funcionário?");
        funcionario = sc.nextLine();

        System.out.println("Qual foi a pontuação dele?");
        pontuaçao =sc.nextInt();

        if (pontuaçao <= 10) {
            System.out.println("Insatisfatório");

        } else if (pontuaçao >= 11 && pontuaçao <=30) {
            System.out.println("Regular");

        }else if (pontuaçao >= 31 && pontuaçao <=70) {
            System.out.println("Bom");

        }else if (pontuaçao >=70Beth && pontuaçao <= 100) {
            System.out.println("Ótimo"); 
        }else {
            System.out.println("Fora da pontuação");
        }
        
        System.out.println("Então o funcionário:" + funcionario + " ficou com a pontuação" + pontuaçao);
    }

}
