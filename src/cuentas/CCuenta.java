package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria con nombre, número de cuenta,
 * saldo y tipo de interés.
 */
public class CCuenta {

    /**
     * Método que devuelve el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular de la cuenta a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que establece el número de cuenta.
     * 
     * @param cuenta El número de cuenta a establecer.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo disponible en la cuenta.
     * 
     * @return El saldo disponible en la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que establece el saldo disponible en la cuenta.
     * 
     * @param saldo El saldo a establecer en la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El tipo de interés a establecer en la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
     /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta()
    {
    }

     /**
     * Constructor de la clase CCuenta que inicializa los atributos con los
     * valores proporcionados.
     * 
     * @param nom   Nombre del titular de la cuenta.
     * @param cue   Número de cuenta.
     * @param sal   Saldo inicial de la cuenta.
     * @param tipo  Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

     /**
     * Método que devuelve el estado actual de la cuenta (saldo disponible).
     * 
     * @return El saldo disponible en la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

     /**
     * Método que permite ingresar una cantidad en la cuenta.
     * 
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
     /**
     * Método que permite retirar una cantidad de la cuenta.
     * 
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay
     *                   suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
