package SantanderCoders;

public class _19VetoresArrays {
    public static void main(String[] args){
        // Declarando array com 5 posições
        String[] letras = new String[7];
        // [T] [U] [V] [X] [Z]
        letras[0] = "T";
        letras[1] = "H";
        letras[2] = "I";
        letras[3] = "A";
        letras[4] = "G";
        letras[5] = "O";
        letras[6] = ""; //apenas para dar espaço
        for (int i=0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        // Maneira mais simples
        String[] letras2 = { "J", "E", "S", "U", "S"};
        for (int i=0; i < letras2.length; i++) {
            System.out.println(letras2[i]);
        }
    }
}
