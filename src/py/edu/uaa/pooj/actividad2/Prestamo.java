package py.edu.uaa.pooj.actividad2;


public class Prestamo {
private Lector lector;
private Ejemplar Ejemplares;
private boolean Estado;
private String FechaPrestamo;
public Lector getLector() {
	return lector;
}
public void setLector(Lector lector) {
	this.lector = lector;
}
public Ejemplar getEjemplares() {
	return Ejemplares;
}
public void setEjemplares(Ejemplar ejemplares) {
	Ejemplares = ejemplares;
}
public boolean isEstado() {
	return Estado;
}
public void setEstado(boolean estado) {
	Estado = estado;
}
public String getFechaPrestamo() {
	return FechaPrestamo;
}
public void setFechaPrestamo(String fechaPrestamo) {
	FechaPrestamo = fechaPrestamo;
}


}
