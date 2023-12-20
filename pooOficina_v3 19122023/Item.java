import java.util.List;

class Item implements CalculoServicos {
    private String codigo;
    private String descricao;
    private double valor;

    public Item(String codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;

    }
    public String getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }

    @Override
    public double calcularValorTotal() {
       return getValor();
    }

}


