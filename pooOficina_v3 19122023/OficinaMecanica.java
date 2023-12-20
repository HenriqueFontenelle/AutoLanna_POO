import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class OficinaMecanica {
    private List<Cliente> clientes;
    private List<Veiculo> veiculos;
    public OficinaMecanica() {
        this.clientes = new ArrayList<>();
        this.veiculos = new ArrayList<>();
    }
    public void registroCliente(Cliente Cliente) {
        clientes.add(Cliente);
    }
    public void registroVeiculo(Cliente Cliente, Veiculo veiculo) {
        Cliente.addVeiculo(veiculo);
    }
    public OrdemServico criarOrdemServico(Cliente Cliente, Veiculo veiculo, String mecanico, Date data) {
        OrdemServico OrdemServico = new OrdemServico(Cliente, veiculo, mecanico, data);
        // Additional logic if needed
        return OrdemServico;
    }
    public void addPeca(OrdemServico OrdemServico, Peca peca) {
        OrdemServico.addPeca(peca);
    }
    public void addServico(OrdemServico OrdemServico, Servico servico) {
        OrdemServico.addServico(servico);
    }
    public static double calcularValorTotal(OrdemServico ordemServico) {
        return ordemServico.calcularValorTotal();
    }
}