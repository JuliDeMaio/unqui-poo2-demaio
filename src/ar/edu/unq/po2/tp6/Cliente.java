package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private Banco bancoPerteneciente;
	private String nombre;
	private String apellido;
	private String direccion;
	private int    edad;
	private float  sueldoNetoMensual;

	public Cliente(Banco bancoPerteneciente, String nombre, String apellido, String direccion, int edad, float sueldoNetoMensual) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setSueldoNetoMensual(sueldoNetoMensual);
		this.setBancoPerteneciente(bancoPerteneciente);
	}
	
	public Banco getBancoPerteneciente() {
		return bancoPerteneciente;
	}

	public void setBancoPerteneciente(Banco bancoPerteneciente) {
		this.bancoPerteneciente = bancoPerteneciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(float sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}


	public Float sueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}
	
	public void solicitarCreditoPersonal(float monto, int plazoEnMeses) {
		SolicitudDeCreditoPersonal solicitudDeCreditoPersonalNueva = new SolicitudDeCreditoPersonal(this, monto, plazoEnMeses);
		this.getBancoPerteneciente().verificarYGuardarSolicitudDeCredito(solicitudDeCreditoPersonalNueva);
	}
	
	public void solicitarCreditoHipotecario(float monto, int plazoEnMeses, Propiedad propiedadDeGarantia) {
		SolicitudDeCreditoHipotecario solicitudDeCreditoHipotecariaNueva = new SolicitudDeCreditoHipotecario(this, monto, plazoEnMeses, propiedadDeGarantia);
		this.getBancoPerteneciente().verificarYGuardarSolicitudDeCredito(solicitudDeCreditoHipotecariaNueva);
	}
}
