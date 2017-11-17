package indesaaho.logica;

import indesaaho.modelos.Transaccion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public class servicioTransaccion {

    ServiciosDB service = new ServiciosDB();

    public void createTransaccion(Transaccion tran) {
        String query = "INSERT INTO TRANSACCION "
                + "(IDTRANSACCION, NOMBRE, APODO, CONTADOR) "
                + "VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, tran.getIdTransaccion());
            stmt.setString(2, tran.getNombre());
            stmt.setString(3, tran.getApodo());
            stmt.setInt(4, tran.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " La transaccion: " + tran.getIdTransaccion() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error La transaccion: " + tran.getIdTransaccion() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateTransaccion(String id, Transaccion tran) throws SQLException {
        String query = "UPDATE TRANSACCION "
                + "SET NOMBRE=, APODO=? ?"
                + "WHERE IDTRANSACCION=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, tran.getNombre());
            stmt.setString(2, tran.getApodo());
            stmt.setInt(3, tran.getContador());
            stmt.setString(4, tran.getIdTransaccion());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La transaccion: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR La transaccion: " + id + " no ha actualizado correctamente.");
        }
    }
    public void deleteTransaccion(String id) throws SQLException {
        Transaccion tran = findByIdTransaccion(id);
        if (tran == null) {
            JOptionPane.showMessageDialog(null, "Codigo de transaccion: " + id + " no existe.");
        }
        String query = "DELETE FROM TRANSACCION WHERE IDTRANSACCION = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de transaccion: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de transaccion: " + id + "no se ha borrado.");
        }
    }

    public Transaccion findByIdTransaccion(String id) {
        String query = "SELECT * FROM TRANSACCION WHERE IDTRANSACCION = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Transaccion(rs.getString("IDTRANSACCION"), rs.getString("NOMBRE"), rs.getString("APODO"),
                    rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de transaccion: " + id + "no se ha encontrado.");
        }
        return null;
    }
    
    public List<Transaccion> findAllTransaccion() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM TRANSACCION";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Transaccion> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Transaccion(rs.getString("IDTRANSACCION"), rs.getString("NOMBRE"), rs.getString("APODO"),
                    rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }
    
    public List<Transaccion> findAllTransaccionbyAcs() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM TRANSACCION ORDER BY CONTADOR ASC";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Transaccion> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Transaccion(rs.getString("IDTRANSACCION"), rs.getString("NOMBRE"), rs.getString("APODO"),
                    rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }
    
}
