package instrumentos.tipos;

import instrumentos.Especificacao;
import instrumentos.Violao;

public class ViolaoTriploZero extends Violao {
    public ViolaoTriploZero() {
        super(
                "Violão Triplo Zero",
                6,
        new Especificacao(
                "Tamanho intermediário, com timbre peculiar e equilibrado.")
        );
    }
}