class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private double kmAtual;
    private double nivelCombustivel;
    public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo, double kmAtual, double nivelCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.kmAtual = kmAtual;
        this.nivelCombustivel = nivelCombustivel;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getanoFabricacao() {
        return anoFabricacao;
    }
    public int getanoModelo() {
        return anoModelo;
    }
    public double getkmAtual() {
        return kmAtual;
    }
    public double getnivelCombustivel() {
        return nivelCombustivel;
    }
}
