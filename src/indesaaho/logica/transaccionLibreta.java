package indesaaho.logica;

import indesaaho.modelos.Libreta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionLibreta {
    
    ServiciosDB service = new ServiciosDB();
    
    public void createLibreta(Libreta lib) {
        String query = "INSERT INTO LIBRETA "
                + "(IDLIBRETA, IDCLIENTE, CUENTA, CAJERO, FECHA, TRANSACCION, VALOR, SALDOACTUAL, CONTADOR) "
                + "VALUES (? , ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, lib.getIdLibreta());
            stmt.setString(2, lib.getIdCliente());
            stmt.setString(3, lib.getCuenta());
            stmt.setString(4, lib.getCajero());
            stmt.setString(5, lib.getFecha());
            stmt.setString(6, lib.getTransaccion());
            stmt.setFloat(7, lib.getValor());
            stmt.setFloat(8, lib.getSaldo());
            stmt.setInt(9, lib.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La libreta: " + lib.getIdLibreta() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error La libreta: " + lib.getIdLibreta() + " no se ha guardado Exitosamente.");
        }
    }
    
    public void updatelibreta(String id, Libreta lib) throws SQLException {
        String query = "UPDATE LIBRETA "
                + "SET IDLIBRETA=?, IDCLIENTE=?, CUENTA=?, CAJERO=?, FECHA=?, TRANCASSION =?, VALOR=?, SALDO= ?"
                + "WHERE IDDEPOSITO=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, lib.getIdCliente());
            stmt.setString(2, lib.getCuenta());
            stmt.setString(3, lib.getCajero());
            stmt.setString(4, lib.getFecha());
            stmt.setString(5, lib.getTransaccion());
            stmt.setFloat(6, lib.getValor());
            stmt.setFloat(7, lib.getSaldo());
            stmt.setString(8, lib.getIdLibreta());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La libreta: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR La libreta: " + id + " no ha actualizado correctamente.");
        }
    }
    
    public void deleteLibreta(String id) throws SQLException {
        Libreta lib = findByIdLibreta(id);
        if (lib == null) {
            JOptionPane.showMessageDialog(null, "Codigo de deposito: " + id + " no existe.");
        }
        String query = "DELETE FROM LIBRETA WHERE IDLIBRETA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de libreta: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de libreta: " + id + "no se ha borrado.");
        }
    }
    
    public Libreta findByIdLibreta(String id) {
        String query = "SELECT * FROM LIBRETA WHERE IDLIBRETA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Libreta(rs.getString("IDLIBRETA"), rs.getString("IDCLIENTE"), rs.getString("CUENTA"),
                    rs.getString("CAJERO"), rs.getString("FECHA"), rs.getString("TRANSACCION"), rs.getFloat("VALOR"),
                    rs.getFloat("SALDOACTUAL"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de libreta: " + id + "no se ha encontrado.");
        }
        return null;
    }
    
    public List<Libreta> findAllLibretas() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM LIBRETA";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Libreta> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Libreta(rs.getString("IDLIBRETA"), rs.getString("IDCLIENTE"), rs.getString("CUENTA"),
                    rs.getString("CAJERO"), rs.getString("FECHA"), rs.getString("TRANSACCION"), rs.getFloat("VALOR"),
                    rs.getFloat("SALDOACTUAL"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }
    
    public List<Libreta> obtenerLibretaByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM LIBRETA WHERE IDCLIENTE = " + "'" + idCliente + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Libreta> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Libreta(rs.getString("IDLIBRETA"), rs.getString("IDCLIENTE"), rs.getString("CUENTA"),
                    rs.getString("CAJERO"), rs.getString("FECHA"), rs.getString("TRANSACCION"), rs.getFloat("VALOR"),
                    rs.getFloat("SALDOACTUAL"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Libreta> obtenerUltimoLibretaByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM LIBRETA WHERE IDCLIENTE = " + "'" + idCliente + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Libreta> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Libreta(rs.getString("IDLIBRETA"), rs.getString("IDCLIENTE"), rs.getString("CUENTA"),
                    rs.getString("CAJERO"), rs.getString("FECHA"), rs.getString("TRANSACCION"), rs.getFloat("VALOR"),
                    rs.getFloat("SALDOACTUAL"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Libreta> obtenerUltimoLibretaByIdClienteAcs(String idCliente) {
        try {
            String query = "SELECT * FROM LIBRETA WHERE IDCLIENTE = " + "'" + idCliente + "'" + " ORDER BY CONTADOR ASC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Libreta> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Libreta(rs.getString("IDLIBRETA"), rs.getString("IDCLIENTE"), rs.getString("CUENTA"),
                    rs.getString("CAJERO"), rs.getString("FECHA"), rs.getString("TRANSACCION"), rs.getFloat("VALOR"),
                    rs.getFloat("SALDOACTUAL"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
