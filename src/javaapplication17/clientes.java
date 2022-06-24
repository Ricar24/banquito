/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class clientes {
    private String Nombre;
    private String Apellido;
    private LocalDate Edad;
    private String Telefono;
    private int ID;
    private String Sexo;
    private String Direccion;
    private String Empleo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public LocalDate getEdad() {
        return Edad;
    }

    public void setEdad(int pos, Date fechaEntrada) {
        LocalDate conversion = fechaEntrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.Edad = conversion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmpleo() {
        return Empleo;
    }

    public void setEmpleo(String Empleo) {
        this.Empleo = Empleo;
    }

}
