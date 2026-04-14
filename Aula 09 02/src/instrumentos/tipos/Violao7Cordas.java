package instrumentos.tipos;

import instrumentos.Especificacao;
import instrumentos.Violao;

public class Violao7Cordas extends Violao {
    public Violao7Cordas() {
        super(
                "Violão 7 Cordas",
                7,
                new Especificacao(
                "Muito usado no choro e samba. Possui uma corda extra mais grave, exigindo maior técnica do músico.")
        );
    }
}