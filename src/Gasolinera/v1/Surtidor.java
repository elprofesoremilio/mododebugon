package Gasolinera.v1;

public class Surtidor {
    private final float precioLitro;

    public Surtidor(float precioLitro) {
        this.precioLitro = precioLitro;
    }

    /**
     * Llena el depósito del coche con los litros que sean necesarios.
     * @param coche Coche al que llenar el depósito
     * @return litros cargados en el coche
     */
    public int llenarDeposito(Coche coche) {
        return coche.llenarDeposito();
    }

    /**
     * Carga en el depósito del coche los litros indicados.
     * Si no caben, llena el depósito.
     * @param litros Litros a cargar
     * @param coche Coche en el que queremos cargar el combustible
     * @return litros cargados en el coche
     */
    public int surtirCombustible(int litros, Coche coche) {
        return coche.cargarCombustible(litros);
    }

    /**
     * Carga en el depósito del coche los litros indicados.
     * Si no caben, llena el depósito.
     * @param importe Importe que queremos pagar por cargar combustible
     * @param coche Coche en el que cargar el combustible
     * @return litros cargados en el coche
     */
    public int surtirCombustible(float importe, Coche coche) {
        int litrosALlenar = (int) (importe / precioLitro);
        return coche.cargarCombustible(litrosALlenar);
    }
}
