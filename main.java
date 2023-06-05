package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        // Criando o mapa de países e capitais
        Map<String, String> paisesCapitais = new HashMap<>();

        // Adicionando países e capitais ao mapa
        paisesCapitais.put("Brasil", "Brasília");
        paisesCapitais.put("Estados Unidos", "Washington, D.C.");
        paisesCapitais.put("França", "Paris");
        paisesCapitais.put("Japão", "Tóquio");
        paisesCapitais.put("Índia", "Nova Deli");

        // Buscando a capital de um país específico
        String capitalBrasil = paisesCapitais.get("Brasil");
        System.out.println("A capital do Brasil é: " + capitalBrasil);

        // Buscando a capital de outro país
        String capitalJapao = paisesCapitais.get("Japão");
        System.out.println("A capital do Japão é: " + capitalJapao);
    }
}
