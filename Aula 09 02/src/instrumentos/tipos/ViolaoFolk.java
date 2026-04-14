package instrumentos.tipos;

import instrumentos.*;

public class ViolaoFolk extends Violao {
    public ViolaoFolk() {
        super(
                "Violão Folk",
                6,
                new Especificacao(
                        "Possui corpo maior e cordas de aço. Muito usado em pop e rock, com som encorpado."
                )
        );
    }
}