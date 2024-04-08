public class Operacoes {

    
    public float adicao(float n1, float n2){
        return n1+n2;
    }
    
    public float subtracao(float n1, float n2){
        return n1-n2;
    }
    
    public float multiplicacao(float n1, float n2){
        return n1*n2;
    }
    
    public float divisao(float n1, float n2){
        if (n2==0){
            System.out.println("Não pode dividir por zero!");
            return n2;
        } else {
            return n1/n2;
        }
    }
    
    
}
