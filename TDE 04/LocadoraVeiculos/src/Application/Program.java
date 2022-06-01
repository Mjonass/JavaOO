package Application;

import Application.Metodos.*;
import Application.Validacao.Validacao;
import Entities.Cliente;
import Entities.LocacaoVeiculo;
import Entities.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Veiculo> veiculosCadastrados = new ArrayList<Veiculo>();
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<LocacaoVeiculo> locacoesVeiculos = new ArrayList<LocacaoVeiculo>();
        List<Veiculo> veiculosDisponiveis = new ArrayList<Veiculo>();

        while(true){
            UI.exibirMenu();
            int escolha = Validacao.validaInteiro("Insira uma opção: ");
            switch (escolha){
                // 1 - Cadastrar veículo;
                case 1:
                    Veiculo veiculo = (CadastroVeiculo.cadastrar());
                    veiculosCadastrados.add(veiculo);
                    veiculosDisponiveis.add(veiculo);
                    break;
                // 2 - Cadastrar cliente;
                case 2:
                    Cliente cliente = CadastroCliente.cadastrar();
                    clientes.add(cliente);
                    break;
                // 3 - Locar veículo;
                case 3:
                    UI.linha();
                    System.out.println("* Cadastro locação *");
                    System.out.println();
                    if((clientes.size() > 0) && (veiculosDisponiveis.size() > 0)){
                        Listar.clientes(clientes);
                        int indiceCliente = CadastroLocacao.indiceCliente(clientes.size());
                        System.out.println();
                        Listar.veiculosDisponiveis(veiculosDisponiveis);
                        int indiceVeiculo = CadastroLocacao.indiceVeiculo(veiculosDisponiveis.size());
                        LocacaoVeiculo locacaoVeiculo = CadastroLocacao.cadastrar(clientes.get(indiceCliente), veiculosDisponiveis.get(indiceVeiculo));
                        locacoesVeiculos.add(locacaoVeiculo);
                        veiculosDisponiveis.remove(indiceVeiculo);
                    }
                    else{
                        System.out.println("Cadastro inválido. Necessário ao menos um cliente e um veículo.");
                    }
                    break;
                // 4 - Listar veículos cadastrados;
                case 4:
                    Listar.veiculosCadastrados(veiculosCadastrados);
                    break;
                // 5 - Listar clientes;
                case 5:
                    Listar.clientes(clientes);
                    break;
                // 6 - Listar locações;
                case 6:
                    Listar.locacoes(locacoesVeiculos);
                    break;
                // 7 - Listar veículos disponíveis;
                case 7:
                    Listar.veiculosDisponiveis(veiculosDisponiveis);
                    break;
                // 8 - Finalizar programa;
                case 8:
                    UI.finalizarPrograma();
                    System.exit(0);
                    break;
                // Opção inválida;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        }
    }
}
