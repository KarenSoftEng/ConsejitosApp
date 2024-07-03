package TrabajoInventario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String Area;
    private String Ubicacion;
    private List<Inventario> listarInventario;

    public Empresa(String area, String ubicacion) {
        this.Area = area;
        this.Ubicacion = ubicacion;
        this.listarInventario = new ArrayList<>();
    }

    public void listarInventario(){
        for (Inventario inv: listarInventario){
            System.out.println(inv);
        }
    }

    public void agregarEquipo(Inventario inv){
        listarInventario.add(inv);
    }



}
