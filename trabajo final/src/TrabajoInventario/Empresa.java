package TrabajoInventario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String Area;
    private String Ubicacion;
    private List<Inventario> listaInventario;

    public Empresa(String area, String ubicacion) {
        this.Area = area;
        this.Ubicacion = ubicacion;
        this.listaInventario = new ArrayList<>();
    }

    public void listarInventario(){
        for (Inventario inv: listaInventario){
            System.out.println(inv);
        }
    }

    public void agregarEquipo(Inventario inv){
        listaInventario.add(inv);
    }

    public void buscarEquipoPorCodigo(String codigo) throws ExceptionInventarioChecked {
        Inventario inventario = null;
        for (Inventario inv : listaInventario) {

            if (inv.getCodigo().equalsIgnoreCase(codigo)){
                inventario = inv;
                break;
            }

        }
        if (inventario != null) {
            System.out.println(inventario);
        } else {
            throw new ExceptionInventarioChecked("No se encontró el equipo con el código: " + codigo);
        }


    };
}
