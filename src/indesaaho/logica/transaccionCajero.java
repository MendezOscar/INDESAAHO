
package indesaaho.logica;

import indesaaho.modelos.Cajero;
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
public class transaccionCajero {
    ServiciosDB service = new ServiciosDB();

    public void createCajero(Cajero caj) {
        String query = "INSERT INTO CAJERO "
                + "(IDCAJERO, NOMBRE, CONTADOR) "
                + "VALUES (? , ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, caj.getIdCajero());
            stmt.setString(2, caj.getNombre());
            stmt.setInt(3, caj.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " La cuenta: " + caj.getIdCajero() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error La cuenta: " + caj.getIdCajero() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateCajero(String id, Cajero caj) throws SQLException {
        String query = "UPDATE CAJERO "
                + "SET NOMBRE= ?"
                + "WHERE IDCAJERO=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, caj.getNombre());
            stmt.setString(2, caj.getIdCajero());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La cuenta: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR La cuenta: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteCajero(String id) throws SQLException {
        Cajero caj = findByIdCajero(id);
        if (caj == null) {
            JOptionPane.showMessageDialog(null, "Codigo de cuenta: " + id + " no existe.");
        }
        String query = "DELETE FROM CAJERO WHERE IDCAJERO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de cuenta: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + id + "no se ha borrado.");
        }
    }

    public Cajero findByIdCajero(String id) {
        String query = "SELECT * FROM CAJERO WHERE IDCAJERO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Cajero(rs.getString("IDCAJERO"), rs.getString("NOMBRE"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Cajero> findAllCajero() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM CAJERO";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Cajero> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Cajero(rs.getString("IDCAJERO"), rs.getString("NOMBRE"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }

    public Cajero findByIdcajeroNombre(String tipo) {
        String query = "SELECT * FROM CAJERO WHERE NOMBRE = " + "'" + tipo + "'";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Cajero(rs.getString("IDCAJERO"), rs.getString("NOMBRE"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + tipo + "no se ha encontrado.");
        }
        return null;
    }
}
