
package indesaaho.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Cuentas {
    String idCuenta;
    String Nombre;
    int Contador;

    public Cuentas(String idCuenta, String Nombre, int Contador) {
        this.idCuenta = idCuenta;
        this.Nombre = Nombre;
        this.Contador = Contador;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
    

    public String getIdCuenta() {
        return idCuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
