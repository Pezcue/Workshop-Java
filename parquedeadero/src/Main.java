public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 5.0);

        Carro carro1 = new Carro("ABC123", "Toyota", "Camry");
        Carro carro2 = new Carro("XYZ456", "Honda", "Accord");

        // Estaciona carros
        parqueadero.parquearCarro(carro1, 1, 2);
        parqueadero.parquearCarro(carro2, 3, 4);

        // Intenta estacionar en un espacio ocupado
        if (!parqueadero.parquearCarro(new Carro("DEF789", "Ford", "Focus"), 1, 2)) {
            System.out.println("Espacio ocupado");
        }

        // Calcula el costo por tiempo
        System.out.println("Costo por tiempo para carro1: $" + parqueadero.cobrarPorTiempo(carro1, 3));
        System.out.println("Costo por tiempo para carro2: $" + parqueadero.cobrarPorTiempo(carro2, 2));

        // Muestra el estado del parqueadero
        parqueadero.mostrarEstadoParqueadero();
    }
}