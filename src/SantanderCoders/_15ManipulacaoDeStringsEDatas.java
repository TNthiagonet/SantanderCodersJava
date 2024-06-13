package SantanderCoders;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class _15ManipulacaoDeStringsEDatas {

    public static void main(String[] args) {
        // Finalidade:
        // Olá. {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Thiago";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Olá.";
        }
        // Olá. {nome}. Hoje é {dia-da-semana}, BOM DIA.
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }

}
