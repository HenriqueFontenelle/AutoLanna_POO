import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class OrdemServico {
    private Cliente cliente;
    private Veiculo veiculo;
    private Date data;
    private String mecanico;
    private List<Peca> pecas;
    private List<Servico> servicos;
    public OrdemServico(Cliente cliente, Veiculo veiculo, String mecanico, Date data) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.mecanico = mecanico;
        this.data = data;
        this.pecas = new ArrayList<>();
        this.servicos = new ArrayList<>();
    }
    public void addPeca(Peca peca) {
        pecas.add(peca);
    }
    public void addServico(Servico servico) {
        servicos.add(servico);
    }
    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item peca : pecas) {
            valorTotal += peca.getValor();
        }
        for (Item servico : servicos) {
            valorTotal += servico.getValor();
        }
        return valorTotal;
    }

    public String getMecanico() {
        return mecanico;
    }


}
