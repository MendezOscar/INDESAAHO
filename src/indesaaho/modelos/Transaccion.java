
package indesaaho.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Transaccion {
    String idTransaccion;
    String nombre;
    String Apodo;
    int contador;

    public Transaccion(String idTransaccion, String nombre, String Apodo, int contador) {
        this.idTransaccion = idTransaccion;
        this.nombre = nombre;
        this.Apodo = Apodo;
        this.contador = contador;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
     
    
}
