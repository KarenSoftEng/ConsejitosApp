package TrabajoInventario;

import java.time.LocalDate;

public class Laptop extends Inventario{
    private boolean incluyeCooler;

    public Laptop(String codigo, String marca, String modelo, String fechaRegistro, String fechaBajaEquipo, boolean incluyeCooler) {
        super(codigo, marca, modelo, fechaRegistro, fechaBajaEquipo);
        this.incluyeCooler = incluyeCooler;
    }
    public boolean isIncluyeCooler() {
        return incluyeCooler;
    }
    @Override
    public String toString() {
        return "Laptop {" +
                super.toString()+
                ", incluyeCooler=" + incluyeCooler +
                '}';
    }


    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Fecha de Registro: " + getFechaRegistro());
        System.out.println("Fecha de Baja: " + getFechaBajaEquipo());
        System.out.println("Incluye Cooler: " + isIncluyeCooler());
    }

}
