
package indesaaho;

import indesaaho.grafico.registrarOperacion;
import indesaaho.logica.transaccionAsociar;
import indesaaho.logica.transaccionLibreta;
import indesaaho.modelos.Asociar;
import indesaaho.modelos.Libreta;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar Mendez
 */
public class Impuesto {
    DecimalFormat df = new DecimalFormat("#.00");
    
     public void obtenerSaldos() {
        try {
            Date date = new Date();
            String fecha = new SimpleDateFormat("dd/MM/yyyy").format(date);
            Libreta lib;
            Asociar aso;
            transaccionAsociar servi = new transaccionAsociar();
            ArrayList<Asociar> depts;
            depts = (ArrayList<Asociar>) servi.findAllAsociar();
            transaccionLibreta service = new transaccionLibreta();

            for (int x = 0; x < depts.size(); x++) {
                aso = depts.get(x);
                ArrayList<Libreta> deptsl;
                deptsl = (ArrayList<Libreta>) service.obtenerUltimoLibretaByIdCliente(aso.getIdCliente());
                lib = deptsl.get(0);
                if (lib.getFecha().equals(fecha)) {
                    System.out.println("ya se realizo");
                } else {
                    if ("Enero".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Febrero".equals(obtenerMes()) && obtenerDia() == 28) {
                        impuesto(lib, date, service);
                    } else if ("Marzo".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Abril".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Mayo".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Junio".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Julio".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Agosto".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Septiembre".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Octubre".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Noviembre".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    } else if ("Diciembre".equals(obtenerMes()) && obtenerDia() == 30) {
                        impuesto(lib, date, service);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Intereses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void impuesto(Libreta lib, Date date, transaccionLibreta service) {
        float saldo = lib.getSaldo();
        float port = (float) 0.001;
        float imp = saldo * port;
        String inter = df.format(imp);

        String idLibreta = lib.getIdCliente() + "-" + "IMP" + "-" + setearnumero();
        String idCliente = lib.getIdCliente();
        String Cuenta = lib.getCuenta();
        String Cajero = "SYSTEM";
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(date);
        String Transaccion = "IMP";
        float valor = Float.parseFloat(inter);
        float saldoActual = lib.getSaldo() - valor;
        int contador = setearnumero();
        Libreta l = new Libreta(idLibreta, idCliente, Cuenta, Cajero, fecha, Transaccion, valor, saldoActual,
                contador);
        service.createLibreta(l);
    }
    
    public int obtenerAnio() {
        Date date = new Date();
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(date);
        String formato = "yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        return Integer.parseInt(dateFormat.format(date));
    }

    public int obtenerDia() {
        Date date = new Date();
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(date);
        String formato = "dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        return Integer.parseInt(dateFormat.format(date));

    }

    public String obtenerMes() {
        Date date = new Date();
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(date);
        String formato = "MM";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        int mes = Integer.parseInt(dateFormat.format(date));
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        return meses[mes - 1];
    }

    public int setearnumero() {
        try {
            int numero;
            transaccionLibreta service = new transaccionLibreta();
            ArrayList<Libreta> depts;
            depts = (ArrayList<Libreta>) service.findAllLibretas();
            numero = depts.size() + 1;
            return numero;
        } catch (SQLException ex) {
            Logger.getLogger(registrarOperacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}

