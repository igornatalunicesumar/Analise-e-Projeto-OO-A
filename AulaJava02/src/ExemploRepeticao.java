
import java.util.Scanner;

public class ExemploRepeticao {
    //psvm + tab
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Operacoes op = new Operacoes();
        
        String operador;
        float num1, num2, resultado;
        do{
            //sout + tab
            System.out.println("Menu da calculadora:\n"
                    + "(A)dicao\n"
                    + "(S)ubtracao\n"
                    + "(M)ultiplicacao\n"
                    + "(D)ivisao\n"
                    + "(F)echar");
            operador = entrada.nextLine();
            
            if (!operador.equals("F")){
                System.out.println("Digite o primeiro numero: ");
                num1 = Float.parseFloat(entrada.nextLine());
                System.out.println("Digite o segundo numero: ");
                num2 = Float.parseFloat(entrada.nextLine());

                switch (operador) {
                    case "A":
                        resultado = op.adicao(num1, num2);
                        System.out.println(num1+" + "+num2+" = "+resultado);
                        break;
                    case "S":
                        resultado = op.subtracao(num1, num2);
                        System.out.println(num1+" - "+num2+" = "+resultado);
                        break;
                    case "M":
                           resultado = op.multiplicacao(num1, num2);
                        System.out.println(num1+" x "+num2+" = "+resultado);
                        break;
                    case "D":
                        resultado = op.divisao(num1, num2);
                        System.out.println(num1+" / "+num2+" = "+resultado);
                        break;        
                }
            }
        } while (!operador.equals("F"));
    }
}
