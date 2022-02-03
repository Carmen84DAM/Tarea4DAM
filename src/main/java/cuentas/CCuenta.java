/*Tarea tema 4 de Entornos de Desarrollo, DAM
 * Clase CCuenta
 * Contiene Atributos, contructores y los métodos necesarios para trabajar con los atributos
 */
package cuentas;

/**
 * @author Carmen García
 * @version 1.0
 * creado el 03/02/2022
 */
public class CCuenta {
    /**
     * Atributos
     * @param nombre String
     * @param cuenta String
     * @param saldo double
     * @param tipoInterés double
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor vacio
     */
    public CCuenta()
    {
    }
    /**
     * Contructor
     * @param nom String
     * @param cue String
     * @param sal double
     * @param tipo double
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método estado, devuelve el saldo actual
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Método ingresar
     * @param cantidad double
     * @throws Exception para el ingreso de cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Método retirar 
     * @param cantidad double
     * @throws Exception en caso de cantidades negativas y en caso de querer retirar más de lo que hay en la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
//Métodos getter y setter
    /**
     * Metodo getNombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método setNombre
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método getCuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Método setCuenta
     * @param cuenta String
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Método getSaldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método setSaldo
     * @param saldo double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método getTipoInterés
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Método setTipoInterés
     * @param tipoInterés double
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
}
