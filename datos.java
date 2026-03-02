public class datos {

    private String Nombre;
    private double Precio;
    private String Oferta;

    public datos(String nombre, double precio, String oferta) {
        Nombre = nombre;
        Precio = precio;
        Oferta = oferta;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public String getOferta() {
        return Oferta;
    }
    public void setOferta(String oferta) {
        Oferta = oferta;
    }
    
    public datos() {
    }
    
}