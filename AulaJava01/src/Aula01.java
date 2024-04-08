import java.util.Scanner;

public class Aula01 {
    //psvm + tab
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String operacao;
        System.out.println("Menu da calculadora: "
                + "+ - Adição\n"
                + "- - Subtração\n"
                + "* - Multiplicação\n"
                + "/ - Divisão.");
        operacao = entrada.next();
        
        float v1, v2;
        //sout + tab
        System.out.println("Digite o valor1: ");
        v1 = entrada.nextFloat();
        System.out.println("Digite o valor2: ");
        v2 = entrada.nextFloat();
        
        float resultado = 0;
        if (operacao.equals("+")){
            resultado = v1+v2;
        } else if (operacao.equals("-")){
            resultado = v1-v2;
        } else if (operacao.equals("*")){
            resultado = v1*v2;
        } else if (operacao.equals("/")){
            resultado = v1/v2;
        }
        
        System.out.println("Resultado = "+resultado);
    }
}
