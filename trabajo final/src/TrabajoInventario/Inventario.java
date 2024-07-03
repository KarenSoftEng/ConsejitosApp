package TrabajoInventario;

import java.time.LocalDate;

public class Inventario {
    private String Codigo;
    private String Marca;
    private String Modelo;
    private String fechaRegistro;
    private String fechaBajaEquipo;

    public Inventario(String codigo, String marca, String modelo, String fechaRegistro, String fechaBajaEquipo) {
        Codigo = codigo;
        Marca = marca;
        Modelo = modelo;
        this.fechaRegistro = fechaRegistro;
        this.fechaBajaEquipo = fechaBajaEquipo;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "Codigo='" + Codigo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaBajaEquipo=" + fechaBajaEquipo +
                '}';
    }
}
