//Auto es una clase hijo de la clase Vehiculo
public class Auto extends Vehiculo {
    //Atributos
    private int cantidadPuertas;
    private boolean tieneAireAcondicionado;

    //Constructor que llama al constructor de la superclase
    public Auto(String idVehiculo, String marcaVehiculo, double precioReparacion, int cantidadPuertas, boolean tieneAireAcondicionado){
        super(idVehiculo, marcaVehiculo, precioReparacion);
        this.cantidadPuertas= cantidadPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    //Sobrescribimos el método mostrarInfo() de la clase vehiculo
    @Override
    public void mostrarInfo(){
        //Heredando el metodo mostrarInfo de la clase Vehiculo
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: "+ cantidadPuertas);
        System.out.println("¿Tiene aire acondicionado? : " + (tieneAireAcondicionado ? "Si":"No"));
        
    }

}