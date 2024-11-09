import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private static final String URL = "jdbc:sqlite:contacts.db";

    public static void addContact(String name, String phone, String category) throws SQLException {
        String sql = "INSERT INTO contacts(name, phone, category) VALUES(?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, category);
            pstmt.executeUpdate();
        }
    }

    public static void updateContact(int id, String name, String phone, String category) throws SQLException {
        String sql = "UPDATE contacts SET name=?, phone=?, category=? WHERE id=?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, category);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        }
    }

    public static void deleteContact(int id) throws SQLException {
        String sql = "DELETE FROM contacts WHERE id=?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    public static List<String[]> getContacts(String searchTerm) throws SQLException {
        List<String[]> contacts = new ArrayList<>();
        String sql = "SELECT * FROM contacts WHERE name LIKE ? OR phone LIKE ?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + searchTerm + "%");
            pstmt.setString(2, "%" + searchTerm + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                contacts.add(new String[]{String.valueOf(rs.getInt("id")), rs.getString("name"),
                        rs.getString("phone"), rs.getString("category")});
            }
        }
        return contacts;
    }
}
