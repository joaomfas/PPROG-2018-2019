package app.model;

import app.exceptions.PeriodoInvalido;
import app.utils.Data;
import app.utils.Tempo;
import java.util.ArrayList;

public class ListaDisponibilidadesDiaria {

    private ArrayList<Disponibilidade> listaDisponibilidades;

    /**
     * 
     * Cria uma instância de ListaDisponibilidadeDiaria
     * 
     */
    public ListaDisponibilidadesDiaria() {
        listaDisponibilidades = new ArrayList<>();
    }

    /**
     * 
     * Cria uma instancia de novoPedidoDisponibilidade
     * 
     * @param strDataI Data início
     * @param strhoraI Hora início
     * @param strDataF Data fim
     * @param strHoraF Hora fim
     * @return Retorna a instância de Disponibilidade criada
     */
    public Disponibilidade novoPedidoDisponibilidade(Data strDataI, Tempo strhoraI, Data strDataF, Tempo strHoraF) {
        Disponibilidade oDisp = new Disponibilidade(strDataI, strhoraI, strDataF, strhoraI);
        return oDisp;
    }

    /**
     * 
     * Regista um novo período de Disponibilidade na Lista
     * 
     * @param oDisp Periodo de disponibilidade a registar
     * @return True/False consoante o sucesso/insucesso da operação
     */
    public boolean registaPeriodoDisponibilidade(Disponibilidade oDisp) {
        if (validaPeriodoDisponibilidade(oDisp)) {
            return addPeriodoDisponibilidade(oDisp);
        }
        return false;
    }

    /**
     * 
     * Valiada o periodo de Disponibilidade criado
     * 
     * @param oDisp Perído de Disponibilidade a validar
     * @return True/false consoante o período é válido ou não
     */
    public boolean validaPeriodoDisponibilidade(Disponibilidade oDisp) {
        Data oDataInicio = oDisp.getDataInicio();
        Tempo oTempoInicio = oDisp.getHoraInicio();
        Data oDataFim = oDisp.getDataFim();
        Tempo oTempoFim = oDisp.getHoraFim();
        if (oDataFim.compareTo(oDataInicio) == -1) {
            throw new PeriodoInvalido("Data de Fim(" + oDataFim.toAnoMesDiaString() + ")antecede a Data de Início(" + oDataInicio.toAnoMesDiaString() + ")!!");
        }
        if (oDataFim.compareTo(oDataInicio) == 0 && oTempoFim.compareTo(oTempoInicio) == -1) {
            throw new PeriodoInvalido("Hora de Fim(" + oTempoFim.toString() + ")antecede a Hora de Início(" + oTempoInicio.toString() + ")!!");
        }
        if (oDataInicio.compareTo(oDataFim) == 0 && oTempoInicio.compareTo(oTempoFim) == 0) {
            throw new PeriodoInvalido("Hora e dia de início são iguais à hora e dia de fim!!");
        }
        return true;
    }

    /**
     * 
     * Adiciona o período de Disponibilidade na Lista
     * 
     * @param oDisp Período de Disponibilidade a dicionar
     * @return True/False consoante o sucesso/insucesso da operação
     */
    public boolean addPeriodoDisponibilidade(Disponibilidade oDisp) {
        return listaDisponibilidades.add(oDisp);
    }

    public ArrayList<Disponibilidade> getM_oListaDispDiaria() {
        return listaDisponibilidades;
    }

    @Override
    public String toString() {
        return "ListaDisponibilidadesDiaria{" + "m_oListaDispDiaria=" + listaDisponibilidades + '}';
    }
    
}
