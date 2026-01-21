package modelo.beans;

import java.util.Date;

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
}
