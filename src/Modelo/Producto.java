package Modelo;

/**
 *
 * @author MRoblesDev
 */
public class Producto {

    private int id;
    private String code;
    private String name;
    private Double price;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return code;
    }

    public void setCodigo(String code) {
        this.code = code;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return price;
    }

    public void setPrecio(Double price) {
        this.price = price;
    }

    public int getCantidad() {
        return quantity;
    }

    public void setCantidad(int quantity) {
        this.quantity = quantity;
    }
}
