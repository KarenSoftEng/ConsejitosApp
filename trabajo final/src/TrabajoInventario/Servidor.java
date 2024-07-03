package TrabajoInventario;

import java.time.LocalDate;

public class Servidor extends Inventario{
    private int CantidadDiscos;

    public Servidor(String codigo, String marca, String modelo, String fechaRegistro, String fechaBajaEquipo, int cantidadDiscos) {
        super(codigo, marca, modelo, fechaRegistro, fechaBajaEquipo);
        CantidadDiscos = cantidadDiscos;
    }

    @Override
    public String toString() {
        return "Servidor {" +
                super.toString()+
                ", CantidadDiscos=" + CantidadDiscos +
                '}';
    }
}
