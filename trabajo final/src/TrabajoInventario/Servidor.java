package TrabajoInventario;

import java.time.LocalDate;

public class Servidor extends Inventario{
    private int CantidadDiscos;

    public Servidor(String codigo, String marca, String modelo, String fechaRegistro, String fechaBajaEquipo, int cantidadDiscos) {
        super(codigo, marca, modelo, fechaRegistro, fechaBajaEquipo);
        this.CantidadDiscos = cantidadDiscos;
    }

    @Override
    public String toString() {
        return "Servidor {" +
                super.toString()+
                ", CantidadDiscos=" + CantidadDiscos +
                '}';
    }

    public int getCantidadDiscos() {
        return CantidadDiscos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Servidor:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Fecha de Registro: " + getFechaRegistro());
        System.out.println("Fecha de Baja: " + getFechaBajaEquipo());
        System.out.println("Cantidad de Discos: " + getCantidadDiscos());
    }
}
