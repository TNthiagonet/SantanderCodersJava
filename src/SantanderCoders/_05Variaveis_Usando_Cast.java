package SantanderCoders;
public class _05Variaveis_Usando_Cast {
    public static void main(String[] args) {
// Utilizando cast() para obter resultados float
// com variaveis int

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;
        // aqui declaramos (float) para a divisao
        // das variaveis int , resolvendo no resultado

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

    }
}
