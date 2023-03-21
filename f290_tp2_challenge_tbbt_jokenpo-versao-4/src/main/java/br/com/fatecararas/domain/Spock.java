package br.com.fatecararas.domain;

import java.util.Map;


public class Spock extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch(pTipo){
            case PAPEL -> valor = "Perdeu. Papel refuta Spock!";
            case TESOURA -> valor = "Ganhou. Spock derrete tesoura!";
            case PEDRA -> valor = "Ganhou. Spock vaporiza pedra!";
            case LAGARTO -> valor = "Perdeu. Lagarto envenena spock!";
            case SPOCK -> valor = "Empate. Spock empata com spock!";
            default -> valor = "Empatou! Opção inválida!";
        }
        
        resultado.put(KEY, valor);
        return resultado;
    }
    
}
