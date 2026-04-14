package instrumentos.tipos;

import instrumentos.*;

public class ViolaoJumbo extends Violao {
    public ViolaoJumbo() {
        super(
                "Violão Jumbo",
                6,
                new Especificacao(
                        "Possui corpo grande e som grave e encorpado."
                )
        );
    }
}