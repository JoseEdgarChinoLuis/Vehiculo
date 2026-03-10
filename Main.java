public class Main {

    public static void main(String[] args) {

        PedirDatos pd = new PedirDatos();
        int opcion;

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Crear Auto");
        System.out.println("2. Crear Camión");
        System.out.println("3. Mostrar total de vehículos");

        opcion = pd.pedirEntero("Seleccione una opción");

        if (opcion == 1) {

            String marca = pd.pedirCadena("Marca");
            String modelo = pd.pedirCadena("Modelo");
            int ano = pd.pedirEntero("Año");
            double precio = pd.pedirDecimal("Precio");
            int numPuertas = pd.pedirEntero("Número de puertas");
            String tipoCombustible = pd.pedirCadena("Tipo de combustible");

            Auto auto1 = new Auto(marca, modelo, ano, precio, numPuertas, tipoCombustible);

            auto1.mostrarInfo();
            auto1.tocarClaxon();
            auto1.mostrarPuertas();
            auto1.encender();
        }

       
}