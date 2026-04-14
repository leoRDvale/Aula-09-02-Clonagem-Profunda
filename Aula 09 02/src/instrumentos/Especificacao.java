package instrumentos;

public class Especificacao implements Cloneable {
    private String descricao;

    public Especificacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    protected Especificacao clone() {
        try {
            return (Especificacao) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar especificação");
        }
    }
}