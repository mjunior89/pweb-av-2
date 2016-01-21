/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

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
                indiceFim = Math.abs(i - (tamanho - 1));
                if (this.frase.charAt(i) != this.frase.charAt(indiceFim)) {
                    resultado = "Não é Palíndromo!!";
                    break;
                }
            }
        }
        return resultado;
    }

}
