package app.utils;

import app.model.*;
import static app.utils.Utils.*;
import java.util.ArrayList;
import java.util.List;

public class Init {

    /**
     * Esta classe estática é utilizada na inicialização da aplicação, antes da
     * criação das janelas UI.A classe realiza a criação de instâncias de
     * Empresa, Clientes, Administrativos, Categorias, AreaGeografica, ...e seus
     * respectivos Registos dentro da instância de Empresa.Utiliza outras
     * classes utilitarias (Utils) para leitura das informações salvas em
     * ficheiro.
     *
     */
    public static void run() {
        // Criação da empresa
        Empresa.criarEmpresa("BlaBlaBla Lda", "857295829");
        // Importacao dos objetos e adição aos registos
        importarCategorias();
        impotarServicos();
        importarClientes();
        addEPsClientes();
        importarAdministrativos();
        importarAreasGeograficas();
        addAtuaEmAreasGeograficas();
        importarPrestadoresServicos();
        addAreasGeograficasPrestadoresServicos();
        addCategoriasPrestadoresServicos();
        importarPedidos();
    }

    /**
     * importa os objetos Categoria e adiciona ao registo de categorias da
     * empresa
     */
    private static void importarCategorias() {
        RegistoCategoria oRegCats = Empresa.getEmpresa().getRegistoCategoria();
        ArrayList<String[]> info;
        info = importarInfoFicheiro("src/main/resources/files/categoria.txt");
        for (String[] linha : info) {
            Categoria oCat = new Categoria(linha[0].trim(), linha[1].trim());
            oRegCats.addCategoria(oCat);
        }
    }

    /**
     * importa os objetos Cliente e adiciona ao registo de clientes da empresa
     */
    private static void importarClientes() {
        ArrayList<String[]> info;
        RegistoCliente oRegClientes = Empresa.getEmpresa().getRegistoCliente();
        info = importarInfoFicheiro("src/main/resources/files/cliente.txt");
        for (String[] linha : info) {
            Cliente oCliente = new Cliente(linha[0].trim(), linha[1].trim(), linha[2].trim(), linha[3].trim());
            oRegClientes.addCliente(oCliente);
        }
    }

    /**
     * importa os objetos Administrativo e adiciona ao registo de
     * administrativos da empresa
     */
    private static void importarAdministrativos() {
        ArrayList<String[]> info;
        RegistoAdministrativo oRegAdministrativos = Empresa.getEmpresa().getRegistoAdministrativo();
        info = importarInfoFicheiro("src/main/resources/files/administrativo.txt");
        for (String[] linha : info) {
            Administrativo oAdministrativo = new Administrativo(linha[0].trim(), linha[1].trim());
            oRegAdministrativos.addAdministrativo(oAdministrativo);
        }
    }

    /**
     * importa os objetos Area Geografica e os adiciona ao registo de AGs da
     * empresa
     */
    private static void importarAreasGeograficas() {
        ArrayList<String[]> info;
        RegistoAreaGeografica oRegAreaGeografica = Empresa.getEmpresa().getRegistoAreaGeografica();
        info = importarInfoFicheiro("src/main/resources/files/areageografica.txt");
        for (String[] linha : info) {
            String designacao = linha[0];
            CodigoPostal codPostalBase = new CodigoPostal(linha[1]);
            double raioAtuacao = Double.valueOf(linha[2]);
            double custoDeslocacao = Double.valueOf(linha[3]);
            AreaGeografica oAreaGeografica = new AreaGeografica(designacao, codPostalBase, raioAtuacao, custoDeslocacao);
            oRegAreaGeografica.addAreaGeografica(oAreaGeografica);
        }
    }

    /**
     * importa os EPs de cada cliente e os atribui ao cliente
     */
    private static void addEPsClientes() {
        ArrayList<String[]> info;
        info = importarInfoFicheiro("src/main/resources/files/endereco.txt");
        RegistoCliente oRegClientes = Empresa.getEmpresa().getRegistoCliente();
        for (String[] linha : info) {
            String emailCliente = linha[0];
            String m_strLocal = linha[1];
            String m_strLocalidade = linha[2];
            CodigoPostal m_CodPostal = new CodigoPostal(linha[3]);
            Cliente oCliente = oRegClientes.getClienteByEmail(emailCliente);
            EnderecoPostal oEndereco = new EnderecoPostal(m_strLocal, m_CodPostal, m_strLocalidade);
            oCliente.addEnderecoPostal(oEndereco);
        }
    }

    /**
     * importa os objetos serviço registo de serviços da empresa
     */
    private static void impotarServicos() {
        ArrayList<String[]> info;
        RegistoServico oRegServs = Empresa.getEmpresa().getRegistoServico();
        RegistoCategoria oRegCats = Empresa.getEmpresa().getRegistoCategoria();
        info = importarInfoFicheiro("src/main/resources/files/servico.txt");
        for (String[] linha : info) {
            String strId = linha[0].trim();
            String strDescBreve = linha[1].trim();
            String strDescCompleta = linha[2].trim();
            double dCustoHora = Double.parseDouble(linha[3].trim());
            Categoria oCategoria = oRegCats.getCatById(linha[4].trim());
            Servico oServico;
            String strTipoServico = linha[5].trim();
            try {
                Class cTipoServico = Class.forName("app.model." + strTipoServico);
                if (strTipoServico.equals("ServicoFixo")) {
                    double dDuracaoPreDeterminada = Double.parseDouble(linha[6].trim());
                    oServico = (Servico) cTipoServico.getConstructor(String.class, String.class, String.class, double.class, Categoria.class, double.class).
                            newInstance(strId, strDescBreve, strDescCompleta, dCustoHora, oCategoria, dDuracaoPreDeterminada);
                } else {
                    oServico = (Servico) cTipoServico.getConstructor(String.class, String.class, String.class, double.class, Categoria.class).
                            newInstance(strId, strDescBreve, strDescCompleta, dCustoHora, oCategoria);
                }
                oRegServs.addServico(oServico);
            } catch (Exception e) {
                System.out.println("Não foi possível criar o Serviço: " + linha.toString());
            }
        }
    }

    /**
     * importa os objetos atua em de cada area geográfica na forma de endereço
     * postal com latitude e longitude. adiciona-os às areas geográficas
     * conforme distância até o código postal base da área geográfica
     */
    private static void addAtuaEmAreasGeograficas() {
        ArrayList<String[]> info;
        info = importarInfoFicheiro("src/main/resources/files/novoscodigos.txt");
        RegistoAreaGeografica oRegAreaGeografica = Empresa.getEmpresa().getRegistoAreaGeografica();
        List<AreaGeografica> listaAg = oRegAreaGeografica.getAreasGeograficas();

        for (AreaGeografica ag : listaAg) {
            double dLatitudeCPBase = 0;
            double dLongitudeCPBase = 0;
            // encontra o CP base da AG e salva latitude/longitude
            for (String[] linha : info) {
                if (ag.getCodPostalBase().getStringCodigoPostal().equals(linha[0])) {
                    dLatitudeCPBase = Double.valueOf(linha[1]);
                    dLongitudeCPBase = Double.valueOf(linha[2]);
                    break;
                }
            }

            // para cada CP, verifica se a distância até o CP base da AG é menor
            // do que o raio de atuação. se for, adiciona o CP à AG
            double menor = 0;
            for (String[] linha : info) {
                double dLatitude = Double.valueOf(linha[1]);
                double dLongitude = Double.valueOf(linha[2]);
                double dDistancia = CalculoDistancia.distancia(dLatitudeCPBase, dLongitudeCPBase, dLatitude, dLongitude);
                if (dDistancia <= ag.getRaioAtuacao()) {
                    CodigoPostal cp = new CodigoPostal(linha[0]);
                    AtuaEm atuaEm = new AtuaEm(cp, dDistancia);
                    ag.getAtuacao().add(atuaEm);
                }
            }
        }
    }

    /**
     * importa os objetos prestador de serviço e os adiciona ao registo de da
     * empresa
     */
    private static void importarPrestadoresServicos() {
        ArrayList<String[]> info;
        RegistoPrestadorServico oRegPrestServ = Empresa.getEmpresa().getRegistoPrestadorServico();
        info = importarInfoFicheiro("src/main/resources/files/prestServico.txt");
        for (String[] linha : info) {
            PrestadorServico oPS = new PrestadorServico(linha[0].trim(), linha[1].trim(), linha[2].trim(), linha[3].trim());
            oRegPrestServ.addPrestadorServico(oPS);
        }
    }

    /**
     * importa as categorias de cada prestador e as atribui
     */
    private static void addCategoriasPrestadoresServicos() {
        ArrayList<String[]> info;
        RegistoPrestadorServico oRegPrestServ = Empresa.getEmpresa().getRegistoPrestadorServico();
        RegistoCategoria oRegCats = Empresa.getEmpresa().getRegistoCategoria();
        info = importarInfoFicheiro("src/main/resources/files/catsPS.txt");
        for (String[] linha : info) {
            String strEmail = linha[0];
            String strId = linha[1];
            PrestadorServico prestador = oRegPrestServ.getPrestServicoByEmail(strEmail);
            Categoria cat = oRegCats.getCatById(strId);
            prestador.addCategoria(cat);
        }
    }

    /**
     * importa os pedidos já armazenados em ficheiro binário (UC6)
     */
    private static void importarPedidos() {
        Utils.importarRegistoPedidosEmFicheiroBinario();
    }

    /**
     * importa as AGs de cada prestador e as atribui
     */
    private static void addAreasGeograficasPrestadoresServicos() {
        ArrayList<String[]> info;
        info = importarInfoFicheiro("src/main/resources/files/areasGeoPS.txt");
        RegistoPrestadorServico oRegPrestServ = Empresa.getEmpresa().getRegistoPrestadorServico();
        RegistoAreaGeografica oRegAreaGeografica = Empresa.getEmpresa().getRegistoAreaGeografica();
        for (String[] linha : info) {
            String strPSEmail = linha[0];
            String strAGDesig = linha[1];
            PrestadorServico oPrest = oRegPrestServ.getPrestServicoByEmail(strPSEmail);
            AreaGeografica oAG = oRegAreaGeografica.getAGByDesig(strAGDesig);
            oPrest.addAreaGeografica(oAG);
        }
    }
}
