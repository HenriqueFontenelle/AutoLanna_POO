import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String outrosDetalhes;
    private List<Veiculo> veiculos;
    public Cliente(String nome, String outrosDetalhes) {
        this.nome = nome;
        this.outrosDetalhes = outrosDetalhes;
        this.veiculos = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public String getOutrosDetalhes() {
        return outrosDetalhes;
    }
    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
}
