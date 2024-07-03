package TrabajoInventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Empresa {
    private String Area;
    private String Ubicacion;
   private List<Inventario> listaInventario;
    private List<Inventario> marketingEquipos;
    private List<Inventario> tecnologiaEquipos;
    private List<Inventario> finanzasEquipos;


    public Empresa(String area, String ubicacion) {
        this.Area = area;
        this.Ubicacion = ubicacion;
        this.listaInventario = new ArrayList<>();
        this.marketingEquipos = new ArrayList<>();
        this.tecnologiaEquipos = new ArrayList<>();
        this.finanzasEquipos = new ArrayList<>();
    }

    public List<Inventario> getListaInventario() {
        return listaInventario;
    }

    public void listarInventario(){
        for (Inventario inv: listaInventario){

            inv.mostrarDetalles();
            System.out.println();
           // System.out.println(inv);
        }
    }

    public void agregarEquipo(Inventario inv){
        listaInventario.add(inv);

    }

    public void asignarEquipoArea(String area, Inventario equipo) throws ExceptionInventarioChecked {
        switch (area) {
            case "marketing":
                marketingEquipos.add(equipo);
                System.out.println("Equipo asignado al área 'Marketing' correctamente.");
                break;
            case "tecnologia":
                tecnologiaEquipos.add(equipo);
                System.out.println("Equipo asignado al área 'Tecnologia' correctamente.");
                break;
            case "finanzas":
                finanzasEquipos.add(equipo);
                System.out.println("Equipo asignado al área 'Finanzas' correctamente.");
                break;
            default:
                throw new ExceptionInventarioChecked("El área especificada no existe: " + area);
        }
    }

    public void mostrarEquiposPorArea(String area) throws ExceptionInventarioChecked {
        List<Inventario> equiposEnArea = null;
        switch (area) {
            case "marketing":
                equiposEnArea = marketingEquipos;
                break;
            case "tecnologia":
                equiposEnArea = tecnologiaEquipos;
                break;
            case "finanzas":
                equiposEnArea = finanzasEquipos;
                break;
            default:
                throw new ExceptionInventarioChecked("El área especificada no existe: " + area);
        }

        if (equiposEnArea != null && !equiposEnArea.isEmpty()) {
            System.out.println("Equipos en el área '" + area + "':");
            for (Inventario inv : equiposEnArea) {
                inv.mostrarDetalles();
                System.out.println();
            }
        } else {
            System.out.println("No hay equipos asignados al área '" + area + "'.");
        }
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
            inventario.mostrarDetalles();
        } else {
            throw new ExceptionInventarioChecked("No se encontró el equipo con el código: " + codigo);
        }


    };
}
