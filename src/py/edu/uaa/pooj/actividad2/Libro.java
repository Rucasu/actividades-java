package py.edu.uaa.pooj.actividad2;

public class Libro {
	private String Nombre;
	private Autor NombreFantasia;
	private String Editorial;
	

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Autor getNombreFantasia() {
		return NombreFantasia;
	}

	public void setNombreFantasia(Autor nombreFantasia) {
		NombreFantasia = nombreFantasia;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	

}
