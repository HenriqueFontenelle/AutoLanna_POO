import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Criar a Oficina Mecânica
        OficinaMecanica oficinaMecanica = new OficinaMecanica();
        // Criar Cliente
        Cliente cliente = new Cliente("Seu João", "Trabalha na feira");
        oficinaMecanica.registroCliente(cliente);
        // Criar veículo para o Cliente
        Veiculo veiculo = new Veiculo("Toyota", "SRV", 2020, 2020, 50000.0, 75.0);
        oficinaMecanica.registroVeiculo(cliente, veiculo);
        // Criar Ordem de Serviço
        OrdemServico ordemServico = oficinaMecanica.criarOrdemServico(cliente, veiculo, "Jair", new Date());
        // Adiciona Peça
        Peca peca1 = new Peca("P001", "Pedal de freio", 50.0, "Boss", "Unidade");
        Peca peca2 = new Peca("P002", "Filtro de óleo", 10.0, "Bardal", "Unidade");
        oficinaMecanica.addPeca(ordemServico, peca1);
        oficinaMecanica.addPeca(ordemServico, peca2);
        // Adiciona serviço à Ordem
        Servico servico1 = new Servico("S001", "Troca de óleo", 30.0, 2);
        Servico servico2 = new Servico("S002", "Rodízio de pneus", 20.0, 1);
        oficinaMecanica.addServico(ordemServico, servico1);
        oficinaMecanica.addServico(ordemServico, servico2);
        // Calcula o valor total da OS
        double valorTotal = OficinaMecanica.calcularValorTotal(ordemServico);
        // Mostra valor total
        System.out.println("\n");
        System.out.println("Oficina Lanna Autos\n");

        System.out.println("Dados do Cliente: ");
        System.out.printf("Proprietário: %s; \natividade: %s.\n\n", cliente.getNome(), cliente.getOutrosDetalhes());

        System.out.println("Dados do Veículo: ");
        System.out.printf(" Marca: %s;\n modelo: %s;\n Ano de fabricação: %s;\n Ano do Modelo: %s;\n Odômetro: %.1f;\n " +
                        "quantidade de " +
                        "Combustível: %s percentual \n\n",
                veiculo.getMarca(), veiculo.getModelo(), veiculo.getanoFabricacao(), veiculo.getanoModelo(),
                veiculo.getkmAtual(), veiculo.getnivelCombustivel());


        System.out.println("Consultor: ");
        System.out.printf("Consultor / Mecânico responsável pela OS: %s", ordemServico.getMecanico());

        System.out.println("\n");

        System.out.println("Trocas de Peças: \n");
        System.out.printf("Foi colocada a peça de código %s; %s; R$ %.1f; %s; %s.\n", peca1.getCodigo(), peca1.getDescricao(),
                peca1.getValor(),peca1.getBrand(), peca1.getUnidade());
        System.out.printf("Foi colocada a peça de código %s; %s; R$ %.1f; %s; %s.", peca2.getCodigo(), peca2.getDescricao(),
                peca2.getValor(),peca2.getBrand(), peca2.getUnidade());
        System.out.println("\n");
        System.out.println("Serviços Realizados: \n");
        System.out.printf("Foi realizado serviço de código: %s; %s; R$ %.1f; %s hora(s) de reparo.\n", servico1.getCodigo(),
                servico1.getDescricao(),
                servico1.getValor(),servico1.getHorasDeReparo());
        System.out.printf("Foi realizado serviço de código: %s; %s; R$ %.1f; %s hora(s) de reparo.\n", servico2.getCodigo(),
                servico2.getDescricao(),
                servico2.getValor(),servico2.getHorasDeReparo());

        System.out.println("Valor total incluindo peças e serviços: \n");

        System.out.printf("valor total da Ordem do Servico: R$ %.1f \n", valorTotal);
    }
}