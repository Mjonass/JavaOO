package Application.Metodos;

import Entities.Cliente;
import Entities.LocacaoVeiculo;
import Entities.Veiculo;

import java.util.List;

public class Listar {
    public static void clientes(List<Cliente> clientes){
        int cont = 0;
        System.out.println("* Clientes cadastrados *");
        for(Cliente c : clientes){
            System.out.println(cont + " - " + c);
            cont++;
        }
    }

    public static void veiculosDisponiveis(List<Veiculo> veiculosDisponiveis){
        int cont = 0;
        System.out.println("* Veículos disponíveis *");
        for(Veiculo v : veiculosDisponiveis){
            System.out.println(cont + " - " + v);
            cont++;
        }
    }

    public static void locacoes(List<LocacaoVeiculo> locacoesVeiculos){
        int cont = 0;
        System.out.println("* Locações cadastradas *");
        for(LocacaoVeiculo l : locacoesVeiculos){
            System.out.println(cont + " - " + l);
            cont++;
        }
    }

    public static void veiculosCadastrados(List<Veiculo> veiculosCadastrados){
        int cont = 0;
        System.out.println("* Veículos cadastrados *");
        for(Veiculo v : veiculosCadastrados){
            System.out.println(cont + " - " + v);
            cont++;
        }
    }
}
