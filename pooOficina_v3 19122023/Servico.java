import java.util.List;

class Servico extends Item implements CalculoServicos {
    private int horasDeReparo;
    private List<Servico> servicos;

    public Servico(String codigo, String descricao, double valor, int horasDeReparo) {
        super(codigo, descricao, valor);
        this.horasDeReparo = horasDeReparo;

    }
    public int getHorasDeReparo() {
        return horasDeReparo;
    }

    @Override
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item servico : servicos) {
            valorTotal += servico.getValor();
        }
        return valorTotal;

    }
}