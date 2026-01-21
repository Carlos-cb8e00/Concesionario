package modelo.procesos;

import modelo.beans.Vehiculo;

import java.util.ArrayList;
import java.util.HashSet;

public class Procesos {

    public void aniadirVehiculo(Vehiculo v, HashSet<Vehiculo> vehiculos){
        if (vehiculos.contains(v)){
            System.out.println("Vehiculo ya existe, mu mal");
        } else{
            vehiculos.add(v);
        }
    }

    public void buscarVehiculo(String matricula,HashSet<Vehiculo> vehiculos) {
        boolean encontrado = false;
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                System.out.println("Matrícula: " + v.getMatricula() + "\nFecha: " + v.getFechaHoraEntrada());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Sorry, no se pudo encontrar");
        }
    }

    public void vehiculosExtremos(HashSet<Vehiculo> vehiculos){
        Vehiculo vehiculoNuevo= vehiculos.iterator().next();
        Vehiculo vehiculoAntiguo= vehiculos.iterator().next();
        for (Vehiculo v : vehiculos){
            if (v.getFechaHoraEntrada().after(vehiculoAntiguo.getFechaHoraEntrada())){
                vehiculoNuevo = v;
            } else if (v.getFechaHoraEntrada().before(vehiculoNuevo.getFechaHoraEntrada())){
                vehiculoAntiguo = v;
            }
        }
        System.out.println("Vehículo más nuevo: "+vehiculoNuevo.getMatricula()+", "+vehiculoNuevo.getFechaHoraEntrada());
        System.out.println("Vehículo más antiguo: "+vehiculoAntiguo.getMatricula()+", "+vehiculoAntiguo.getFechaHoraEntrada());

    }

    public HashSet<Vehiculo> rellenar(HashSet<Vehiculo> vehiculos){
        vehiculos.add(new Vehiculo("1234VVV"));
        vehiculos.add(new Vehiculo("1234MMN"));
        vehiculos.add(new Vehiculo("1234QWR"));
        vehiculos.add(new Vehiculo("1234SDF"));
        vehiculos.add(new Vehiculo("1234ZXC"));
        vehiculos.add(new Vehiculo("1234VBN"));
        vehiculos.add(new Vehiculo("1234BHN"));
        vehiculos.add(new Vehiculo("1234PWQ"));
        vehiculos.add(new Vehiculo("1234YDT"));
        vehiculos.add(new Vehiculo("1234YRT"));
        vehiculos.add(new Vehiculo("1234WDB"));
        vehiculos.add(new Vehiculo("1234MHK"));

        return vehiculos;
    }
}
