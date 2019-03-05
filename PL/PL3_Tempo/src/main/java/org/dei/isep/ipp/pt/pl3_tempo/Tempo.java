/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.isep.ipp.pt.pl3_tempo;

/**
 *
 * @author joaoferreira
 */
public class Tempo {

    private int hora = 0;
    private int minuto = 0;
    private int segundo = 0;

    private boolean verificaInput(int hora, int minuto, int segundo) {
        boolean verifica = true;
        if (hora > 23 || hora < 0 || minuto < 0 || segundo < 0 || minuto > 60 || segundo > 60) {
            verifica = false;
        }
        return verifica;
    }

    public Tempo(int hora, int minuto, int segundo) {
        if (verificaInput(hora, minuto, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String getTempo24h() {
        String tempo = hora + ":" + minuto + ":" + segundo;
        return tempo;
    }

    @Override
    public String toString() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public String getTempo12h() {
        String tempo12h = converter24hPara12h();
        return tempo12h;
    }

    private String converter24hPara12h() {
        String tempoConv = "::";
        boolean flagPM = false;
        int hora12h = this.hora;
        if (this.hora > 12) {
            hora12h -= 12;
            flagPM = true;
        }
        if (flagPM) {
            tempoConv = hora12h + ":" + this.minuto + ":" + this.segundo + " PM";
        } else {
            tempoConv = hora12h + ":" + this.minuto + ":" + this.segundo + " AM";
        }
        return tempoConv;
    }

    public void somarSegundo() {
        this.segundo += 1;
        if (this.segundo > 60) {
            this.segundo = 0;
            this.minuto += 1;
        } else {
            if (this.minuto == 60) {
                this.minuto = 0;
                this.hora += 1;
            } else {
                if (this.hora == 24) {
                    this.hora = 0;
                }
            }
        }
    }

    public boolean tempoMaior(Tempo tempo2) {
        boolean result = false;

        if (this.hora > tempo2.hora) {
            result = true;
        } else {
            if (this.hora == tempo2.hora) {
                if (this.minuto > tempo2.minuto) {
                    result = true;
                } else {
                    if (this.minuto == tempo2.minuto) {
                        if (this.segundo > tempo2.segundo) {
                            result = true;
                        }
                    }
                }
            }
        }

        return result;
    }

    public boolean tempoMaior(int hora, int minuto, int segundo) {
        boolean result = false;

        if (this.hora > hora) {
            result = true;
        } else {
            if (this.hora == hora) {
                if (this.minuto > minuto) {
                    result = true;
                } else {
                    if (this.segundo > segundo) {
                        result = true;
                    }
                }
            }
        }

        return result;
    }

    public String diferencaTempo(Tempo tempo2) {
        String result = "::";
        int difHora = 0;
        int difMin = 0;
        int difSeg = 0;

        double segTotal = diferencaTempoSegundos(tempo2);

        difHora = (int) (segTotal / 3600);
        segTotal -= difHora * 3600;
        difMin = (int) (segTotal / 60);
        segTotal -= difMin * 60;
        difSeg = (int) segTotal;

        result = difHora + ":" + difMin + ":" + difSeg;

        return result;
    }

    public double diferencaTempoSegundos(Tempo tempo2) {
        String result = "::";
        double tempoTotal;
        double tempo2Total;

        tempoTotal = this.segundo + this.minuto * 60 + this.hora * 3600;
        tempo2Total = tempo2.segundo + tempo2.minuto * 60 + tempo2.hora * 3600;

        return (Math.abs(tempoTotal - tempo2Total));
    }
}
