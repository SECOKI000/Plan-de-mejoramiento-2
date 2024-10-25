public class Celda {
    int numero;
    boolean ocupada = false;
    Recluso recluso;

    public Celda(int numero) {
        this.numero = numero;
    }

    public void asignarRecluso(Recluso recluso) {
        if (!ocupada) {
            this.recluso = recluso;
            ocupada = true;
            System.out.println("Recluso " + recluso.nombre + " ("
                + recluso.tipoRecluso() + ") asignado a la celda " + numero);
        } else {
            System.out.println("La celda " + numero + " ya está ocupada.");
        }
    }
}
