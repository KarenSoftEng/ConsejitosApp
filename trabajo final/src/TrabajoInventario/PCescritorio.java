package TrabajoInventario;

import java.time.LocalDate;

public class PCescritorio extends Inventario{
    private String Accesorios;

    public PCescritorio(String codigo, String marca, String modelo, String fechaRegistro, String fechaBajaEquipo, String accesorios) {
        super(codigo, marca, modelo, fechaRegistro, fechaBajaEquipo);
        this.Accesorios = accesorios;
    }

    @Override
    public String toString() {
        return "PCescritorio {" +
                super.toString()+
                ", Accesorios='" + Accesorios + '\'' +
                '}';
    }
}
