/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.model;

/**
 *
 * @author Lesa2
 */
public class Ticket {

    private int idTicket;
    private Empleado Empleado;
    private Categoria Categoria;
    private String descripcion;
    private String dispositivo;
    private String fecha;
    private char estatus;
    private String fechaAtencion;

    public Ticket() {

    }

    public Ticket(int idTicket, Empleado Empleado, Categoria Categoria, String descripcion, String dispositivo, String fecha, char estatus, String fechaAtencion) {
        this.idTicket = idTicket;
        this.Empleado = Empleado;
        this.Categoria = Categoria;
        this.descripcion = descripcion;
        this.dispositivo = dispositivo;
        this.fecha = fecha;
        this.estatus = estatus;
        this.fechaAtencion = fechaAtencion;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", Empleado=" + Empleado + ", Categoria=" + Categoria + ", descripcion=" + descripcion + ", dispositivo=" + dispositivo + ", fecha=" + fecha + ", estatus=" + estatus + ", fechaAtencion=" + fechaAtencion + '}';
    }
    
    

}
