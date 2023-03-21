package br.com.fatecararas.domain;

import java.util.Map;

public class Pedra extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch(pTipo){
            case PAPEL -> valor = "Perdeu. Papel embrulha a pedra!";
            case TESOURA -> valor = "Ganhou. Pedra quebra tesoura!";
            case PEDRA -> valor = "Empate. Pedra empata com pedra!";
            case LAGARTO -> valor = "Ganhou. Pedra esmaga lagarto!";
            case SPOCK -> valor = "Perdeu. Spock vaporiza pedra!";
            default -> valor = "Empatou! Opção inválida!";
        }
        
        resultado.put(KEY, valor);
        return resultado;
    }
}
