package Gasolinera.v1;

public class Surtidor {
    private final float precioLitro;

    public Surtidor(float precioLitro) {
        this.precioLitro = precioLitro;
    }

    public int llenarDeposito(Coche coche) {
        return coche.llenarDeposito();
    }

    public int surtirCombustible(int litros, Coche coche) {
        return coche.cargarCombustible(litros);
    }
    public int surtirCombustible(float importe, Coche coche) {
        int litrosALlenar = (int) Math.floor(importe / precioLitro);
        return coche.cargarCombustible(litrosALlenar);
    }
}
