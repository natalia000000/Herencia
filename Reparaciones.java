import java.util.ArrayList;

public class Reparaciones {
    
    //Atributos
    private ArrayList<Vehiculo> listadeVehiculos;
    private double total;


    //Construcor
    public Reparaciones(){
        this.listadeVehiculos = new ArrayList<>();
        this.total = 0;

    }
    //Agregar vehiculo
    public void agregarVehiculo(Vehiculo vehiculo){
        listadeVehiculos.add(vehiculo);

    }
    //metodo para calcular el total de la reparacion
    public double calcularTotal(){
        return total;
    }
    //metodo para mostrar la info de la reparacion
    public void mostrarInfo(){
        System.out.println("Vehículos en la reparación: ");
        for (Vehiculo vehiculo : listadeVehiculos){
            vehiculo.mostrarInfo();//llama al metodo 

        }
        System.out.println("Total de la reparación : " + total);
    }
    //yjygjyj ytyj ytjtjtjtrhskydhrtyyyjyrymridftttrhyjtjrrrrrrgseeeeeeyjuuuykidhertrrrrr
}
