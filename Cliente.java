import java.util.ArrayList;

public class Cliente {
    //Atributos
    private String idCliente;
    private String nombreCliente;
    private ArrayList<Reparaciones> listaReparaciones;

    //Constructor
    public Cliente(String id, String nombre){
        this.idCliente = id;
        this.nombreCliente = nombre;
        this.listaReparaciones = new ArrayList<>();
 
    }

    //agregar reparacion a una lista
    public void agregarReaparacion(Reparaciones reparacion){
        listaReparaciones.add(reparacion);//añade la reparación a la lista
    }

    public void mostrarReparaciones(){
        System.out.println("Cliente: "+ nombreCliente);
        for (Reparaciones reparacion : listaReparaciones){
            reparacion.mostrarInfo();
        }
        
    }
    
}
