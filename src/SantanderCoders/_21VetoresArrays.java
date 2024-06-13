package SantanderCoders;

public class _21VetoresArrays {
    public static void main(String[] args){
        // descobrindo qual numero tem o valor maior, menor e qual a média
        int[] numeros = { 9, 10, 12, 25, 2 };
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior número é: "+ maior);
        System.out.println("Menor número é: "+ menor);
        System.out.println("Média é: "+ media/numeros.length);
    }
}
