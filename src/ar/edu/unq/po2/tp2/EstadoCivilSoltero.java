package ar.edu.unq.po2.tp2;

public class EstadoCivilSoltero extends EstadoCivil {

	@Override
	public boolean esEstadoCivilCasado() {
		return false;
	}

	@Override
	public float asignacionPorConyugePara(EmpleadoPlantaPermanente empleadoPlantaPermanente) {
		return empleadoPlantaPermanente.asignacionCuandoNoEstaCasado();
	}
}
