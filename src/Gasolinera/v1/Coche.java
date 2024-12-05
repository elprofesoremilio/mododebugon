package Gasolinera.v1;

public class Coche {
    private int litrosDeposito;
    private final int capacidadDeposito;

    public Coche(int capacidadDeposito, int litrosDeposito) {
        this.capacidadDeposito = capacidadDeposito;
        this.litrosDeposito = litrosDeposito;
    }

    /**
     * Trata de cargar en el depósito los litros indicados. Si no alcanza a cargar todos, llena el depósito.
     * @param litros entero con los litros a llenar
     * @return entero con los litros que realmente se han cargado.
     */
    public int cargarCombustible(int litros) {
        int litrosReales;
        if (litros + litrosDeposito <= capacidadDeposito) {
            this.litrosDeposito += litros;
            litrosReales = litros;
        } else {
            litrosReales = llenarDeposito();
        }
        return litrosReales;
    }

    /**
     * Llena el depósito a la capacidad máxima.
     * @return entero con los litros utilizados para llenar el depósito
     */
    public int llenarDeposito() {
        int litrosReales = capacidadDeposito - litrosDeposito;
        this.litrosDeposito = capacidadDeposito;
        return litrosReales;
    }
}
