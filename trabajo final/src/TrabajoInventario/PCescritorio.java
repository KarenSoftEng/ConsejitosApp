package TrabajoInventario;

import java.time.LocalDate;

public class PCescritorio extends Inventario{
    private String Accesorios;

    public PCescritorio(String codigo, String marca, String modelo, String fechaRegistro, String fechaBajaEquipo, String accesorios) {
        super(codigo, marca, modelo, fechaRegistro, fechaBajaEquipo);
        this.Accesorios = accesorios;
    }

    public String getAccesorios() {
        return Accesorios;
    }

    @Override
    public String toString() {
        return "PCescritorio {" +
                super.toString()+
                ", Accesorios='" + Accesorios + '\'' +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("PC de Escritorio:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Fecha de Registro: " + getFechaRegistro());
        System.out.println("Fecha de Baja: " + getFechaBajaEquipo());
        System.out.println("Accesorios: " + getAccesorios());
    }
}
