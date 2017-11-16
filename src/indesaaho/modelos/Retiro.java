package indesaaho.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Retiro {

    String idRetiro;
    String fecha;
    float monto;
    int contador;
    String idCuenta;
    String idCliente;

    public Retiro(String idRetiro, String fecha, float monto, int contador, String idCuenta, String idCliente) {
        this.idRetiro = idRetiro;
        this.fecha = fecha;
        this.monto = monto;
        this.contador = contador;
        this.idCuenta = idCuenta;
        this.idCliente = idCliente;
    }

    public String getIdRetiro() {
        return idRetiro;
    }

    public String getFecha() {
        return fecha;
    }

    public float getMonto() {
        return monto;
    }

    public int getContador() {
        return contador;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdRetiro(String idRetiro) {
        this.idRetiro = idRetiro;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
}