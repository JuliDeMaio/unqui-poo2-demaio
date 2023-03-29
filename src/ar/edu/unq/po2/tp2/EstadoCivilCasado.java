package ar.edu.unq.po2.tp2;

public class EstadoCivilCasado extends EstadoCivil {

	@Override
	public boolean esEstadoCivilCasado() {
		return true;
	}

	@Override
	public float asignacionPorConyugePara(EmpleadoPlantaPermanente empleadoPlantaPermanente) {
		return empleadoPlantaPermanente.asignacionCuandoEstaCasado();
	}
}
