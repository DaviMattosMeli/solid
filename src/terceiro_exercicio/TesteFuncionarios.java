package terceiro_exercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteFuncionarios {

    public static void main(String[] args) {
        Gerente gerente = new Gerente(4950.00f, "Gerente de Caixa", "Pedro Silva", 520.00f);
        Vendedor vendedor = new Vendedor(2590.00f,"Vendedor De Calçados","Janaína Souza",295.00f);

        FolhaSalarial imprimirFolhaSalarial = new FolhaSalarial(LocalDate.now());

        List<Funcionario> funcionarios = new ArrayList<>();

        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(gerente);
        funcionarios.addAll(gerentes);


        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor);
        funcionarios.addAll(vendedores);

        imprimirFolhaSalarial.imprimirFolhaSalarial(funcionarios);
    }
}
