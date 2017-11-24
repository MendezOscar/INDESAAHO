
package indesaaho.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Cajero {
    String idCajero;
    String Nombre;
    int contador;

    public Cajero(String idCajero, String Nombre, int contador) {
        this.idCajero = idCajero;
        this.Nombre = Nombre;
        this.contador = contador;
    }

    public String getIdCajero() {
        return idCajero;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getContador() {
        return contador;
    }

    public void setIdCajero(String idCajero) {
        this.idCajero = idCajero;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
}
