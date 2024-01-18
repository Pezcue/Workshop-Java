public class Main {
    public static void main(String[] args) {

        Capitan cap = new Capitan("Jairo", "Martero", 923839);
        Velero Jairo = new Velero(4000,200,2021, cap);

        Capitan capi = new Capitan("Jairo", "Martero", 923839);
        Yate Andres = new Yate(7000, 640,2024,true, capi);

        System.out.println("El alquiler es " + Jairo.calcularAlquiler());
        System.out.println("El tamano tiene un estado de " + Jairo.medirTamano());
        System.out.println(" ");
        System.out.println("El alquiler es " + Andres.calcularAlquiler());
        System.out.println("Lujosidad: " + Andres.esLujoso());
        System.out.println("Es vendible: " + Andres.esVendible());
    }
}