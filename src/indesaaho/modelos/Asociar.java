
package indesaaho.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Asociar {
    String idAsociar;
    String tipocuenta;
    String idCliente;
    String Nombre;
    String idCuenta;
    int contador;
    float Saldo;

    public Asociar(String idAsociar, String tipocuenta, String idCliente, String Nombre, String idCuenta, 
            int contador, float Saldo) {
        this.idAsociar = idAsociar;
        this.tipocuenta = tipocuenta;
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.idCuenta = idCuenta;
        this.contador = contador;
        this.Saldo = Saldo;
    }

    public String getIdAsociar() {
        return idAsociar;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public int getContador() {
        return contador;
    }

    public void setIdAsociar(String idAsociar) {
        this.idAsociar = idAsociar;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
    
    
}