package SantanderCoders;
public class _09OperadoresLogicos {
    public static void main(String[] args) {

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println("Vamos a praia? " + vamosAPraia);
// Operador ternário: condicao ? valorSeVerdadeiro : valorSeFalso;
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";

        System.out.println(mensagem);
    }
}
