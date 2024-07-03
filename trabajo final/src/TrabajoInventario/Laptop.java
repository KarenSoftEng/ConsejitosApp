package TrabajoInventario;

import java.time.LocalDate;

public class Laptop extends Inventario{
    private boolean incluyeCooler;

    public Laptop(String codigo, String marca, String modelo, String fechaRegistro, String fechaBajaEquipo, boolean incluyeCooler) {
        super(codigo, marca, modelo, fechaRegistro, fechaBajaEquipo);
        this.incluyeCooler = incluyeCooler;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                super.toString()+
                ", incluyeCooler=" + incluyeCooler +
                '}';
    }
}
