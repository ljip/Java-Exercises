import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Program program = new Program("database.sql");

            program.insertData("marko maric", 30);
            program.insertData("hrvoje hrvic", 25);
            program.selectData();
            program.updateData(1, "hrvoje hrvic", 35);
            program.deleteData(2);
            program.selectData();

            program.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}