package TrabajoInventario;

import java.time.LocalDate;

public abstract  class Inventario {
    private String Codigo;
    private String Marca;
    private String Modelo;
    private String fechaRegistro;
    private String fechaBajaEquipo;

    public Inventario(String codigo, String marca, String modelo, String fechaRegistro, String fechaBajaEquipo) {
        this.Codigo = codigo;
        this.Marca = marca;
        this.Modelo = modelo;
        this.fechaRegistro = fechaRegistro;
        this.fechaBajaEquipo = fechaBajaEquipo;
    }

    @Override
    public String toString() {
        return " Codigo='" + Codigo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaBajaEquipo=" + fechaBajaEquipo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public String getFechaBajaEquipo() {
        return fechaBajaEquipo;
    }

    public abstract void mostrarDetalles();


}
