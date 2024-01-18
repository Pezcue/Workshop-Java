public class Parqueadero {
    private Carro[][] espacios;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        this.espacios = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= espacios.length || columna < 0 || columna >= espacios[0].length || espacios[fila][columna] != null) {
            return false; // Espacio ocupado o fuera de límites
        }

        espacios[fila][columna] = carro;
        return true;
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        // Verifica si el carro está en el parqueadero
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[0].length; j++) {
                if (espacios[i][j] != null && espacios[i][j].equals(carro)) {
                    // Calcula el costo por tiempo
                    return horas * tarifaPorHora;
                }
            }
        }
        return 0; // El carro no está en el parqueadero
    }

    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[0].length; j++) {
                if (espacios[i][j] != null) {
                    System.out.print("X "); // Espacio ocupado
                } else {
                    System.out.print("  "); // Espacio vacío
                }
            }
            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}
