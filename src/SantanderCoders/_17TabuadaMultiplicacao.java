package SantanderCoders;

public class _17TabuadaMultiplicacao {
    public static void main(String[] args) {
        // Tabuada de multiplicação

        for (int i = 1; i <= 10; i++) {
            // Alinhando for dentro de for
            // Não pode repetir o "i" então usa o "j" , ...
            for (int j = 1; j <= 10; j++){
                // pra cada interação do "i" eu terei 10 interações do "j"
                System.out.println(j + "x" + i + " = " + j * i);

            }
        }
    }
}
