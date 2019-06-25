package app.model;

import app.utils.Data;
import app.utils.Tempo;

public class Disponibilidade {

    private Data dataInicio;
    private Tempo horaInicio;
    private Data dataFim;
    private Tempo horaFim;

    /**
     *
     * Cria uma instância de Disponibilidade
     *
     * @param oDataInicio Data de início
     * @param oHoraInicio Hora de início
     * @param oDataFim Data de fim
     * @param oHoraFim Hora de fim
     */
    public Disponibilidade(Data oDataInicio, Tempo oHoraInicio, Data oDataFim, Tempo oHoraFim) {
        this.dataInicio = oDataInicio;
        this.horaInicio = oHoraInicio;
        this.dataFim = oDataFim;
        this.horaFim = oHoraFim;
    }

    /**
     *
     * Retorna a data de início
     *
     * @return Data de início
     */
    public Data getDataInicio() {
        return dataInicio;
    }

    /**
     *
     * Retorna a hora de início
     *
     * @return Hora de início
     */
    public Tempo getHoraInicio() {
        return horaInicio;
    }

    /**
     *
     * Retorna a data de fim
     *
     * @return Data de fim
     */
    public Data getDataFim() {
        return dataFim;
    }

    /**
     *
     * Retorna a hora de fim
     *
     * @return Hora de fim
     */
    public Tempo getHoraFim() {
        return horaFim;
    }

    /**
     *
     * Define a data de início
     *
     * @param m_oDataInicio Data de início
     */
    public void setDataInicio(Data m_oDataInicio) {
        this.dataInicio = m_oDataInicio;
    }

    /**
     *
     * Define a hora de início
     *
     * @param m_oHoraInicio Hora de início
     */
    public void setHoraInicio(Tempo m_oHoraInicio) {
        this.horaInicio = m_oHoraInicio;
    }

    /**
     *
     * Define a data de fim
     *
     * @param m_oDataFim Data de fim
     */
    public void setDataFim(Data m_oDataFim) {
        this.dataFim = m_oDataFim;
    }

    /**
     *
     * Define a hora de fim
     *
     * @param m_oHorFim Hora de fim
     */
    public void setHoraFim(Tempo m_oHorFim) {
        this.horaFim = m_oHorFim;
    }

    /**
     *
     * Retorna a descrição completa da Disponibilidade
     *
     * @return Descrição da Disponibilidade
     */
    @Override
    public String toString() {
        return "Data de início\t" + dataInicio + "\nHora de início:\t" + horaInicio + "\nData de fim:\t" + dataFim + "\nHora de fim:\t" + horaFim;
    }

    /**
     * Verifica se uma preferencia de horário está contida dentro da 
     * disponibilidade, retornando verdadeiro ou falso.
     * 
     * @param preferenciaHorario Preferência de horário
     * @return True/false consoante a disponibilidade
     */
    public boolean contemHorario(PreferenciaHorario preferenciaHorario) {
        Data prefData = preferenciaHorario.getData();
        Tempo prefHora = preferenciaHorario.getHora();
        if (prefData.isMaior(dataInicio) && !prefData.isMaior(dataFim)) {
            return true;
        } else if (prefData.compareTo(dataInicio) == 0) {
            if (prefHora.tempoMaior(horaInicio)) {
                return true;
            }
        } else if (prefData.compareTo(dataFim) == 0) {
            if (!prefHora.tempoMaior(horaFim)) {
                return true;
            }
        }
        return false;
    }
}
