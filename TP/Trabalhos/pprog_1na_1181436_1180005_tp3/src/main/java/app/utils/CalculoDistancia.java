package app.utils;

public class CalculoDistancia {

    /**
     * 
     * Calcula a distância entre 2 pontos dadas as suas coordenadas
     * 
     * @param lat1 Latitude do ponto 1
     * @param lon1 Longitude do ponto 1
     * @param lat2 Latitude do ponto 2
     * @param lon2 Longitude do ponto 2
     * @return Distância entre os 2 pontos
     */
    public static double distancia(double lat1, double lon1, double lat2, double lon2) {
        // shortest distance over the earth's surface
        // https://www.movable-type.co.uk/scripts/latlong.html
        final double R = 6371e3;
        double theta1 = Math.toRadians(lat1);
        double theta2 = Math.toRadians(lat2);
        double deltaTheta = Math.toRadians(lat2 - lat1);
        double deltaLambda = Math.toRadians(lon2 - lon1);
        double a = Math.sin(deltaTheta / 2) * Math.sin(deltaTheta / 2) + Math.cos(theta1) * Math.cos(theta2) * Math.sin(deltaLambda / 2) * Math.sin(deltaLambda / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = R * c; // distância em metros
        return d;
    }
}
