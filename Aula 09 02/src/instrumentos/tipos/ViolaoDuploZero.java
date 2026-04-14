package instrumentos.tipos;

import instrumentos.Especificacao;
import instrumentos.Violao;

public class ViolaoDuploZero extends Violao {
    public ViolaoDuploZero() {
        super(
                "Violão Duplo Zero",
                6,
                new Especificacao(
                "Um pouco maior que o zero, com boa sonoridade e indicado para fingerstyle.")
        );
    }
}