package instrumentos.tipos;

import instrumentos.Especificacao;
import instrumentos.Violao;

public class ViolaoZero extends Violao {
    public ViolaoZero() {
        super(
                "Violão Zero",
                6,
                new Especificacao(
                "Modelo menor da categoria Parlor, confortável e ideal para uso casual.")
        );
    }
}