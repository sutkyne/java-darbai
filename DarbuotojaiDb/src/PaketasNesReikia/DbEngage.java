package PaketasNesReikia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbEngage {

	Connection cn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	public DbEngage() {
		try {
			Class.forName("org.h2.Driver");
			cn = DriverManager.getConnection("jdbc:h2:~/darbuotojai_pt_ryt", "sa", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Pavyko");
		}
	}

	void selectAllDataFromDarbuotojai() {
		try {
			st = cn.createStatement();
			rs = st.executeQuery("SELECT * FROM DARBUOTOJAI");
			while (rs.next()) {
				System.out.println("Asmens kodas: " + rs.getLong("ASMENSKODAS") + " Pavarde: " + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void instertsNewWorker() {
		try {
			st = cn.createStatement();
			st.execute("INSERT INTO DARBUOTOJAI (ASMENSKODAS, VARDAS, PAVARDE, PROJEKTONUMERIS)"
					+ "VALUES (325468, 'Petras','Senior Pedro', 5)");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void selectSpecificdataFromDarbuotojai() {
		try {
			pst = cn.prepareStatement("SELECT VARDAS, PAVARDE, DIRBANUO " + "FROM DARBUOTOJAI " + "WHERE VARDAS= ? "
					+ "AND PROJEKTONUMERIS= ? ");
			pst.setString(1, "Mantas");
			pst.setInt(2, 2);
			rs = pst.executeQuery();

			while (rs.next()) {
				System.out.println(
						"Vardas: " + rs.getString(1) + " Pavarde: " + rs.getString(2) + " Dirba nuo " + rs.getDate(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void ConvertLastNamesToUpperCase(){
		try {
			st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("SELECT * FROM DARBUOTOJAI");
			while (rs.next()) {
				rs.updateString("PAVARDE", rs.getString("PAVARDE").toUpperCase());
				rs.updateRow();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
