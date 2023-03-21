package br.com.fatecararas.domain;

import java.util.Map;


public class Tesoura extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch(pTipo){
            case PAPEL -> valor = "Ganhou. Tesoura corta papel!";
            case TESOURA -> valor = "Empate. Tesoura empata com tesoura!";
            case PEDRA -> valor = "Perdeu. Pedra quebra tesoura!";
            case LAGARTO -> valor = "Ganhou. Tesoura decapita lagarto!";
            case SPOCK -> valor = "Perdeu. Spock derrete tesoura!";
            default -> valor = "Empatou. Op��o inv�lida!";
        }
        
        resultado.put(KEY, valor);
        return resultado;
        }
    }
    
    
    

