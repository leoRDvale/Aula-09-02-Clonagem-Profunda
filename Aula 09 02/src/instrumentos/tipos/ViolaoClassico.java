package instrumentos.tipos;

import instrumentos.*;

public class ViolaoClassico extends Violao {
    public ViolaoClassico() {
        super(
                "Violão Clássico",
                6,
                new Especificacao(
                        "O violão clássico é um modelo acústico com cordas de nylon. Possui custo mais baixo e é ideal para iniciantes."
                )
        );
    }
}