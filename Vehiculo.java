

public class Vehiculo{
//Atributos;id, =patente, marca, precioReparacion.

    private String patenteVehiculo;
    private String marcaVehiculo;
    private double precioReparacion;

    //Constructor
    public Vehiculo(String patente, String marca, double precio){

        this.patenteVehiculo = patente;
        this.marcaVehiculo = marca;
        this.precioReparacion = precio;
    }

    //metodopara mostrar la info del vehiculo
    public void mostrarInfo(){
        System.out.print("Patente del vehiculo: " + patenteVehiculo);
        System.out.print("Marca del vehiculo: " + marcaVehiculo);
        System.out.print("Precio de la reparacion: " + precioReparacion);

    }
    //metodo para calcular el precio de la reparacion
    public double calcularDescuento(double descuento){
        return precioReparacion - (precioReparacion * descuento);
    }
}