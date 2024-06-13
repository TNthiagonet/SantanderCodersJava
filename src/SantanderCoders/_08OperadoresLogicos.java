package SantanderCoders;
public class _08OperadoresLogicos {
    public static void main(String[] args) {
        // Algoritimo para ir a praia
        // Duas condições: Sol / Fin de semana
    // cod && (AND)
        boolean fimDeSemana1 = false;
        boolean fazendoSol1 = true;
        boolean vamosAPraia1 = fimDeSemana1 && fazendoSol1;
    //-----------------------------------------------------------
    // cod || (OR)
        boolean fimDeSemana2 = true;
        boolean fazendoSol2 = false;
        boolean vamosAPraia2 = fimDeSemana2 || fazendoSol2;
//---------------------------------------------------------------

        // TABELA VERDADE
// -------------------------------------------------
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        //false && false = false
// -------------------------------------------------
        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
// -------------------------------------------------
    // Print 1
        System.out.println("&& (AND)");
        System.out.println("Vamos a praia? "+ vamosAPraia1);
    // Print 2
        System.out.println("|| (OR)");
        System.out.println("Vamos a praia? "+ vamosAPraia2);

    }
}
