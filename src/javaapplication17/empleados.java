/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class empleados {
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private LocalDate Edad;
    private int ID;
    private int Codigo;
    private String Contraseña;

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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public LocalDate getEdad() {
        return Edad;
    }

    public void setEdad(int pos, Date fechaEntrada) {
        LocalDate conversion = fechaEntrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.Edad = conversion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
}
