/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author ricar
 */
public class Login {
    String[] usuarios = { "usuario1", "usuario2" };
    String[] contraseñas = { "u123", "u123" };

    public int verificarPosUsuario(String nombre) {
        int posicion = 0;
        for (String usuario : usuarios) {
            if (usuario.equals(nombre))
                break;
            else
                posicion++;
        }
        return posicion;

    }

    public boolean verificarClave(String nombre, String contraseña) {
        boolean resultado;
        int posicionUsuario = verificarPosUsuario(nombre);
        if (posicionUsuario >= 0)
            resultado = contraseña.equals(contraseñas[posicionUsuario]);
        else
            resultado = false;
        return resultado;
    }

}
