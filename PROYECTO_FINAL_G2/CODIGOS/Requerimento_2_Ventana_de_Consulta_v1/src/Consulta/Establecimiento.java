/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consulta;

/**
 *
 * @author USER
 */
public class Establecimiento {
    private String nombre_establecimiento;
    private String direccion;
    private String nombre_encargado;
    private int dosis_recibida;
    private int dosis_aplicada;
    private int dosis_restante;
    private String numero_contaco;

    public Establecimiento(String nombre_establecimiento, String direccion, String nombre_encargado, 
            int dosis_recibida, int dosis_aplicada, int dosis_restante, String numero_contaco) {
        this.nombre_establecimiento = nombre_establecimiento;
        this.direccion = direccion;
        this.nombre_encargado = nombre_encargado;
        this.dosis_recibida = dosis_recibida;
        this.dosis_aplicada = dosis_aplicada;
        this.dosis_restante = dosis_restante;
        this.numero_contaco = numero_contaco;
    }

    public String getNombre_establecimiento() {
        return nombre_establecimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre_encargado() {
        return nombre_encargado;
    }

    public int getDosis_recibida() {
        return dosis_recibida;
    }

    public int getDosis_aplicada() {
        return dosis_aplicada;
    }

    public int getDosis_restante() {
        return dosis_restante;
    }

    public String getNumero_contaco() {
        return numero_contaco;
    }
    
    
}
