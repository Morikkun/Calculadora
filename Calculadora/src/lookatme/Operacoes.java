package lookatme;

public class Operacoes {

    public int soma(int x, int y) {
        int soma = x + y;
        return soma;
    }

    public int subtrai(int x, int y) {
        int subtracao = x - y;
        return subtracao;
    }

    public double divide(double x, double y) {
        double divisao = x / y;
        return divisao;
    }

    public int multiplica(int x, int y) {
        int multiplicacao = x * y;
        return multiplicacao;
    }

    public double porcentagem(double x) {
        double porcento = (x / 100) * 1;
        return porcento;
    }

    public long fibonacci(long x) {
        if (x<2) {
            return x;
        }
            else {
                return fibonacci(x-1) + fibonacci(x-2);
        }


    }
}