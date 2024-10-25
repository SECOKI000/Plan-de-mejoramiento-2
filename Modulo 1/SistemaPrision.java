public class SistemaPrision {
    public static void main(String[] args) {
        Celda celda1 = new Celda(1);
        Celda celda2 = new Celda(2);

        Recluso recluso1 = new ReclusoAltaPeligrosidad("Sergio", 30);
        Recluso recluso2 = new ReclusoBajaPeligrosidad("Luis", 25);

        celda1.asignarRecluso(recluso1);
        celda2.asignarRecluso(recluso2);
    }
}
