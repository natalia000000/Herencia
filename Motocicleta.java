public class Motocicleta extends Vehiculo {
    
    //Atributo adicional para la clase Motocicleta
    private boolean tieneMaletero;


    //Constructor que llama al constructor de la superClase Vehiculo
    public Motocicleta(String idVehiculo, String marcaVehiculo, double precioReparacion, boolean tieneMaletero){
        super(idVehiculo, marcaVehiculo, precioReparacion);
        this.tieneMaletero = tieneMaletero;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();//llama al metodo mostrar info de la clase Vehiculo
        System.out.println("Maletero: " + (tieneMaletero ? "Si":"No"));
    }
}
