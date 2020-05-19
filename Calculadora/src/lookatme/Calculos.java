package lookatme;

public class Calculos {
    public static void main(String[] args) {

        System.out.println("Bem vindo a incrível máquina de calcular, instancie um objeto e veja a magia" +
                "da matemática acontecer");

        Operacoes g = new Operacoes();

        for (int i = 0; i<10; i++){
            System.out.println("(" + i + ") " + g.fibonacci(i));
        }
    }
}
