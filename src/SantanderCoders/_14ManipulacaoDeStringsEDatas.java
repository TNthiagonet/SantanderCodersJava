package SantanderCoders;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class _14ManipulacaoDeStringsEDatas {

    public static void main(String[] args) {

        // Olá. {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Thiago";


        // ISO 8601
        // tipo | var  | Data Local
        LocalDate hoje = LocalDate.now();
        // Linguagem e localidade
        Locale brasil = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        System.out.println(hoje);
        //--------------------- Dia da semana
        System.out.println(hoje.getDayOfWeek());
        //--------------------- Dia da semana| formato linguagem e local brasil
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
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
        // Utilizando %s para representar strings.
        // Utilizando %n para representar quebra de linhas
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }

}
