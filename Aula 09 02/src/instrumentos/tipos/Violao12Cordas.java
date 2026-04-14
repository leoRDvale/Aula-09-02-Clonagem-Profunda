package instrumentos.tipos;

import instrumentos.Especificacao;
import instrumentos.Violao;

public class Violao12Cordas extends Violao {
    public Violao12Cordas() {
        super(
                "Violão 12 Cordas",
                12,
                new Especificacao(
                        "Cordas em pares que geram maior ressonância. Exige mais técnica para tocar corretamente.")
        );
    }
}




