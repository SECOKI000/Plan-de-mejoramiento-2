// Clase Recluso
public class Recluso {
    String nombre;
    int edad;

    public Recluso(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String tipoRecluso() {
        return "Recluso general";
    }
}

class ReclusoAltaPeligrosidad extends Recluso {
    public ReclusoAltaPeligrosidad(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String tipoRecluso() {
        return "Recluso de alta peligrosidad";
    }
}

class ReclusoBajaPeligrosidad extends Recluso {
    public ReclusoBajaPeligrosidad(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String tipoRecluso() {
        return "Recluso de baja peligrosidad";
    }
}

