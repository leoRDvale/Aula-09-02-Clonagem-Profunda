package instrumentos;

public abstract class Violao implements Instrumento {
    protected String tipo;
    protected int cordas;
    protected Especificacao especificacao;

    public Violao(String tipo, int cordas, Especificacao especificacao) {
        this.tipo = tipo;
        this.cordas = cordas;
        this.especificacao = especificacao;
    }

    @Override
    public Instrumento clonar() {
        try {
            Violao clone = (Violao) super.clone();


            clone.especificacao = this.especificacao.clone();

            return clone;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar violão");
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("\n🎸 " + tipo + "🎸");
        System.out.println("Cordas: " + cordas);
        System.out.println("Descrição: " + especificacao.getDescricao());
    }
}