package modelo.beans;

import java.util.Date;
import java.util.Objects;

public class Vehiculo {
    private String matricula;
    private Date fechaHoraEntrada;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.fechaHoraEntrada = new Date();
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Date getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }
    public void setFechaHoraEntrada(Date fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public boolean equals(Object vehiculo) {
        boolean iguales = false;

        if (vehiculo != null && getClass() == vehiculo.getClass()) {
            Vehiculo clave1 = (Vehiculo) vehiculo;
            if (Objects.equals(this.matricula, clave1.matricula) &&
                    this.fechaHoraEntrada.equals(clave1.fechaHoraEntrada))
                iguales = true;
        }
        return iguales;
    }

    public int hashCode() {
        return matricula.hashCode();
    }
}
