/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.time.LocalDate;

/**
 *
 * @author ricar
 */
public class TarjetaDeCredito {

    private String TitularDeLaCuenta;
    private String NmrTarjeta;
    private LocalDate FechaVencimiento;
    private String cvv;
    private String TipoDeTarjeta;
    private int LimiteDeCredito;
    private float TasaDeIntereses;

    public String getTitularDeLaCuenta() {
        return TitularDeLaCuenta;
    }

    public void setTitularDeLaCuenta(String Nombre) {
        this.TitularDeLaCuenta = Nombre;
    }

    public String getNmrTarjeta() {
        return NmrTarjeta;
    }

    public void setNmrTarjeta(String NmrTarjeta) {
        this.NmrTarjeta = NmrTarjeta;
    }

    public LocalDate getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getTipoDeTarjeta() {
        return TipoDeTarjeta;
    }

    public void setTipoDeTarjeta(String TipoDeTarjeta) {
        this.TipoDeTarjeta = TipoDeTarjeta;
    }

    public int getLimiteDeCredito() {
        return LimiteDeCredito;
    }

    public void setLimiteDeCredito(int LimiteDeCredito) {
        this.LimiteDeCredito = LimiteDeCredito;
    }

    public float getTasaDeIntereses() {
        return TasaDeIntereses;
    }

    public void setTasaDeIntereses(float TasaDeIntereses) {
        this.TasaDeIntereses = TasaDeIntereses;
    }

}
