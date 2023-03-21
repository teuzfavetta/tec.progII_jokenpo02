package br.com.fatecararas.domain;

import java.util.Map;


public class Lagarto extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch(pTipo){
            case PAPEL -> valor = "Ganhou. Lagarto come papel!";
            case TESOURA -> valor = "Perdeu. Tesoura decapita lagarto!";
            case PEDRA -> valor = "Perdeu. Pedra esmaga lagarto!";
            case LAGARTO -> valor = "Empate. Lagarto empata com lagarto!";
            case SPOCK -> valor = "Ganhou. Lagarto envenena spock!";
            default -> valor = "Empatou! Opção inválida!";
        }
        
        resultado.put(KEY, valor);
        return resultado;
    }
    
}
