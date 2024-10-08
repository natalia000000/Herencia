public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(" V001 "," Chevrolet ",   25000.0 ,   4,  true);
        Motocicleta moto1 = new Motocicleta(" V062 ", " BMW: ", 29800.0 ,  true);
    
        //creamos un cliente
        Cliente cliente1 = new Cliente(" C001 ", " natalia ");
    
        // Creamos una reparación y agregamos vehículos
        Reparaciones reparacion = new Reparaciones();
        reparacion.agregarVehiculo(auto1);
        reparacion.agregarVehiculo(moto1);
    
        // Agregamos la reparación al cliente
        cliente1.agregarReaparacion(reparacion);
    
        // Mostramos la información del cliente y sus reparaciones
        cliente1.mostrarReparaciones();
    }
}
