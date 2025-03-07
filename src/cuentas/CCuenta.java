package cuentas;

/**
 * Clase para modelar una Cuenta Corriente
 */
public class CCuenta {

	/** Obtiene el nombre */
    public String getNombre() {
		return nombre;
	}

    /** Asigna el nombre de la cuenta
     * 
     * @param nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Obtiene la cuenta */
	public String getCuenta() {
		return cuenta;
	}

	/** Asigna el codigo de cuenta
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/** Obtiene el saldo */
	public double getSaldo() {
		return saldo;
	}

	/** Asigna el saldo de la cuenta 
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/** Obtiene el tipo de interes */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/** Asigna el tipo de interes
	 * 
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/** Nombre de la cuenta */
	private String nombre;
	
	/** Codigo de la cuenta */
    private String cuenta;
    
    /** Saldo de la cuenta */
    private double saldo;
    
    /** Tipo de interes de la cuenta */
    private double tipoInterés;

    /** Constructor por defecto */
    public CCuenta()
    {
    }

    /**
     * Constructor 
     * 
     * @param nom Nombre de la cuenta
     * @param cue Codigo de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo de la cuenta
     * 
     * @return Saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es menor que cero
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es 0 o menor que 0
     * @throws Exception Si el saldo es menor que la cantidad a retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
