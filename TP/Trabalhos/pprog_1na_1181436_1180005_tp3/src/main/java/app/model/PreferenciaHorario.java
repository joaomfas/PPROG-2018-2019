package app.model;

import app.utils.*;
import java.io.Serializable;

public class PreferenciaHorario implements Serializable {

    private int ordem;
    private Data data;
    private Tempo hora;

    /**
     *
     * Cria uma instancia de preferencia de horario
     *
     * @param ordem Numero da preferencia de horario
     * @param data Data relativa à preferencia
     * @param hora Hora relativa à preferencia
     */
    public PreferenciaHorario(int ordem, Data data, Tempo hora) {
        this.ordem = ordem;
        this.data = data;
        this.hora = hora;
    }

    /**
     *
     * Retorna o número da preferencia de horario
     *
     * @return Número da preferencia de horario
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     *
     * Retorna a data associada à preferencia de horario
     *
     * @return Data associada à preferencia de horario
     */
    public Data getData() {
        return data;
    }

    /**
     *
     * Retorna a hora associada à preferencia de horario
     *
     * @return Hora associada à preferencia de horario
     */
    public Tempo getHora() {
        return hora;
    }

    /**
     * 
     * Retorna a descrição da preferencia de horário
     * 
     * @return Descrição da preferencia de horário
     */
    @Override
    public String toString() {
        return "\tOrdem: " + ordem + "\n\t\tData:\t" + data + "\n\t\tHora:\t" + hora;
    }

}
