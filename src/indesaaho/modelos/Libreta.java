
package indesaaho.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Libreta {
    String idLibreta;
    String idCliente;
    String Cuenta;
    String Cajero;
    String Fecha;
    String Transaccion;
    float Valor;
    float Saldo;
    int Contador;

    public Libreta(String idLibreta, String idCliente, String Cuenta, String Cajero, String Fecha, String Transaccion, 
            float Valor, float Saldo, int Contador) {
        this.idLibreta = idLibreta;
        this.idCliente = idCliente;
        this.Cuenta = Cuenta;
        this.Cajero = Cajero;
        this.Fecha = Fecha;
        this.Transaccion = Transaccion;
        this.Valor = Valor;
        this.Saldo = Saldo;
        this.Contador = Contador;
    }

    public String getIdLibreta() {
        return idLibreta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public String getCajero() {
        return Cajero;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getTransaccion() {
        return Transaccion;
    }

    public float getValor() {
        return Valor;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setIdLibreta(String idLibreta) {
        this.idLibreta = idLibreta;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public void setCajero(String Cajero) {
        this.Cajero = Cajero;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setTransaccion(String Transaccion) {
        this.Transaccion = Transaccion;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
    
    
}
