public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public static int totalVehiculos = 0;

    public Vehiculo() {
        totalVehiculos++;
    }

    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        totalVehiculos++;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: " + precio);
    }

    public void encender() {
        System.out.println("El vehículo " + marca + " ha sido encendido");
    }

}