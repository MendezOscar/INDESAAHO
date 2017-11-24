
package indesaaho.logica;

import indesaaho.modelos.Prestamos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionPrestamos {
     ServiciosDB service = new ServiciosDB();
     public Prestamos findByIdPrestamos(String id) {
        String query = "SELECT * FROM PRESTAMOS WHERE IDPRESTAMO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                    rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                    rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                    rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                    rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de Prestamo: " + id + " no se ha encontrado.");
        }
        return null;
    }

    public List<Prestamos> obtenerPrestamosByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM PRESTAMOS WHERE IDCLIENTE = " + "'" + idCliente + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Prestamos> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                        rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                        rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                        rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> obtenerUltimoPrestamoByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM PRESTAMOS WHERE IDCLIENTE = " + "'" + idCliente + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Prestamos> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                        rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                        rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                        rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> listEmpleadosTemporales(String tipoEmpleado) {
        try {
            String query = "SELECT * FROM PRESTAMOS LEFT JOIN CLIENTES ON PRESTAMOS.IDCLIENTE = CLIENTES.IDCLIENTE "
                    + "WHERE CLIENTES.TIPO = " + "'" + tipoEmpleado + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Prestamos> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                        rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                        rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                        rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> listEmpleadosPermanentes(String tipoEmpleado) {
        try {
            String query = "SELECT * FROM PRESTAMOS LEFT JOIN CLIENTES ON PRESTAMOS.IDCLIENTE = CLIENTES.IDCLIENTE "
                    + "WHERE CLIENTES.TIPO = " + "'" + tipoEmpleado + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Prestamos> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                        rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                        rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                        rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> listEmpleadosSocios(String tipoEmpleado) {
        try {
            String query = "SELECT * FROM PRESTAMOS LEFT JOIN CLIENTES ON PRESTAMOS.IDCLIENTE = CLIENTES.IDCLIENTE "
                    + "WHERE CLIENTES.TIPO = " + "'" + tipoEmpleado + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Prestamos> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                        rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                        rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                        rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
