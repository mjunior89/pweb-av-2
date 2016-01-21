/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class TratadorString {

    private String frase;

    public TratadorString(String frase) {
        this.frase = frase;
    }

    public String tratarPalindromo() {
        String resultado = "É Palíndromo!!";
        int tamanho = frase.length();
        if (tamanho == 0) {
            resultado = "Frase vazia!";
        } else {
            int indiceFim = 0;
            for (int i = 0; i < tamanho; i++) {
                indiceFim = ((tamanho - 1) - i);
                if (this.frase.charAt(i) != this.frase.charAt(indiceFim)) {
                    resultado = "Não é Palíndromo!!";
                    break;
                }
            }
        }
        return resultado;
    }

    public String tratarEspacos() {
        String resultado = "";
        int tamanho = frase.length();
        if (tamanho == 0) {
            resultado = "Frase vazia!";
        } else {
            while (this.frase.indexOf("  ") != -1) {
                this.frase = this.frase.replace("  ", " ");
                resultado = this.frase;
            }
        }
        return resultado;
    }

    public String tratarCaracteresEspeciais() {
        String resultado = "";
        int tamanho = frase.length();
        Character[] vetA = {'Á', 'À', 'Â', 'Ã'};
        Character[] vetE = {'É', 'È', 'Ê'};
        Character[] vetI = {'Í', 'Ì', 'Î'};
        Character[] vetO = {'Ó', 'Ò', 'Ô', 'Õ'};
        Character[] vetU = {'Ú', 'Ù', 'Û'};
        if (tamanho == 0) {
            resultado = "Frase vazia!";
        } else {
            for (int i = 0; i < tamanho; i++) {
                if (Arrays.asList(vetA).contains(this.frase.toUpperCase().charAt(i))) {
                    this.frase = this.frase.replace(this.frase.charAt(i), 'a');
                } else if (Arrays.asList(vetE).contains(this.frase.toUpperCase().charAt(i))) {
                    this.frase = this.frase.replace(this.frase.charAt(i), 'e');
                } else if (Arrays.asList(vetI).contains(this.frase.toUpperCase().charAt(i))) {
                    this.frase = this.frase.replace(this.frase.charAt(i), 'i');
                } else if (Arrays.asList(vetO).contains(this.frase.toUpperCase().charAt(i))) {
                    this.frase = this.frase.replace(this.frase.charAt(i), 'o');
                } else if (Arrays.asList(vetU).contains(this.frase.toUpperCase().charAt(i))) {
                    this.frase = this.frase.replace(this.frase.charAt(i), 'u');
                } else if (this.frase.toUpperCase().charAt(i) == 'Ç') {
                    this.frase = this.frase.replace(this.frase.charAt(i), 'c');
                }
            }
            resultado = this.frase;
        }
        return resultado;
    }

    public String contarOcorrencias() {
        String resultado = "";
        int tamanho = frase.length();
        Map<Character, Integer> mapaOcorrencias = new HashMap<Character, Integer>();
        if (tamanho == 0) {
            resultado = "Frase vazia!";
        } else {
            for (int i = 0; i < tamanho; i++) {
                char chave = this.frase.charAt(i);
                if (!mapaOcorrencias.containsKey(chave)) {
                    mapaOcorrencias.put(chave, 0);
                }
                Integer valor = mapaOcorrencias.get(chave);
                mapaOcorrencias.replace(chave, valor + 1);
            }
            Set<Map.Entry<Character, Integer>> valores = mapaOcorrencias.entrySet();
            for (Map.Entry<Character, Integer> valor : valores) {
                resultado = resultado + "'" + valor.getKey() + "', ocorreu: "  + valor.getValue() + " vezes. <br />";
            }
        }
        return resultado;
    }
}
