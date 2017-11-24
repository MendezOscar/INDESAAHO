package indesaaho;

import indesaaho.logica.transaccionAsociar;
import indesaaho.logica.transaccionLibreta;
import indesaaho.modelos.Asociar;
import indesaaho.modelos.Libreta;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar Mendez
 */
public class Intereses {

    public void obtenerSaldos() {
        try {
            Date date = new Date();
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
                if (lib.getSaldo() > 50 && lib.getSaldo() < 999.99) {
                    float saldo = lib.getSaldo();
                    float port = (float) 0.20;
                    float res = (saldo * port * 12) / 1200;
                    float interes = res / 12;
                    
                    String idLibreta = lib.getIdCliente() + "INT";
                    String idCliente = lib.getIdCliente();
                    String Cuenta = lib.getCuenta();
                    String Cajero = "SYSTEM";
                    String fecha = new SimpleDateFormat("dd/MM/yyyy").format(date);
                    String Transaccion = "INT";
                    float saldoActual = interes;
                    
                } else if (lib.getSaldo() > 1000 && lib.getSaldo() < 4999.99) {
                    float saldo = lib.getSaldo();
                    float port = (float) 0.30;
                    float res = (saldo * port * 12) / 1200;
                    float interes = res / 12;
                    System.out.println(interes);
                } else if (lib.getSaldo() > 5000 && lib.getSaldo() < 9999.99) {
                    float saldo = lib.getSaldo();
                    float port = (float) 0.50;
                    float res = (saldo * port * 12) / 1200;
                    float interes = res / 12;
                    System.out.println(interes);
                } else if (lib.getSaldo() > 10000 && lib.getSaldo() < 49999.99) {
                    float saldo = lib.getSaldo();
                    float port = (float) 1.0;
                    float res = (saldo * port * 12) / 1200;
                    float interes = res / 12;
                    System.out.println(interes);
                } else if (lib.getSaldo() > 50000 && lib.getSaldo() < 249999.99) {
                    float saldo = lib.getSaldo();
                    float port = (float) 1.5;
                    float res = (saldo * port * 12) / 1200;
                    float interes = res / 12;
                    System.out.println(interes);
                } else if (lib.getSaldo() > 250000 && lib.getSaldo() < 499999.99) {
                    float saldo = lib.getSaldo();
                    float port = (float) 2.0;
                    float res = (saldo * port * 12) / 1200;
                    float interes = res / 12;
                    System.out.println(interes);
                } else {
                    float saldo = lib.getSaldo();
                    float port = (float) 2.5;
                    float res = (saldo * port * 12) / 1200;
                    float interes = res / 12;
                    System.out.println(interes);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Intereses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
