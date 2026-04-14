package instrumentos.tipos;

import instrumentos.Especificacao;
import instrumentos.Violao;

public class ViolaoFlet extends Violao {
    public ViolaoFlet() {
        super(
                "Violão Flet",
                6,
                new Especificacao(
                "Possui caixa acústica fina e som suave. Muito usado por profissionais e geralmente precisa de amplificação.")
        );
    }
}