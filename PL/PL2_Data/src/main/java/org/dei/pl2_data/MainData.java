package org.dei.pl2_data;

public class MainData {

    public static void main(String[] args) {
        Data data1 = new Data(2019, 2, 20);

        System.out.println(data1.toString());
        
        Data data2 = new Data(1974, 4, 25);
        
        System.out.println(data2.toAnoMesDiaString());
        
        System.out.println(data1.isMaior(data2));
        
        System.out.printf("Dias entre a data1 e a data2 = %d", data1.calcularDiferenca(data2));
        
        System.out.printf("%nFaltam %d dias para o natal", data1.calcularDiferenca(2019, 12, 25));
        
        System.out.printf("%n%s foi uma %s", data2.toAnoMesDiaString(), data2.determinarDiaDaSemana());
        
        System.out.printf("%n%d é um ano bissexto: %b",data2.getAno(),Data.isAnoBissexto(data2.getAno()));
        
        System.out.printf("%n%d é um ano bissexto: %b",1974,Data.isAnoBissexto(1974));
    }

}
