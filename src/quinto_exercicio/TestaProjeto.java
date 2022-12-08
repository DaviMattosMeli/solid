package quinto_exercicio;

import java.util.ArrayList;
import java.util.List;

public class TestaProjeto {

    public static void main(String[] args) {

        List<IDev> devs = new ArrayList<>();

        devs.add(new FrontendDev());
        devs.add(new BackendDev());

        ProjetoSoftware projetoSoftware = new ProjetoSoftware(devs);

        projetoSoftware.criarProjeto();
    }

}