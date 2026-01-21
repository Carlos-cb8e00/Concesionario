package controlador;

import modelo.beans.Vehiculo;
import modelo.procesos.Procesos;

import java.util.HashSet;
import java.util.Scanner;

public class Programa {
    public void ejecutar(){
        Procesos procesos = new Procesos();
        Scanner teclado = new Scanner(System.in);
        boolean salir= false;
        HashSet<Vehiculo> vehiculos = new HashSet<>();
        vehiculos=procesos.rellenar(vehiculos);

        do {
            System.out.println("--------Concesionario de vehículos--------");
            System.out.println("1- Añadir un nuevo vehículo\n2- Consultar una matrícula\n3- Ver el vehículo más reciente y más antiguo\n0- Salir");
            switch (teclado.nextInt()) {
                case 1:
                    System.out.println("Inserte la matrícula del nuevo coche: ");
                    procesos.aniadirVehiculo(new Vehiculo(teclado.next()),vehiculos);
                    break;
                case 2:
                    System.out.println("Introduzca la matrícula del coche a buscar: ");
                    procesos.buscarVehiculo(teclado.next(),vehiculos);
                    break;
                case 3:
                    procesos.vehiculosExtremos(vehiculos);
                    break;
                case 0:
                    salir = true;
                    break;
            }
        }while (!salir);
    }
}
