package mermoderna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FarmConexao {
	public static Connection getConnection() {

		try {
			// Variavel da URL para conexao com o banco
			final String url = "jdbc:postgresql://localhost:5432/postgres";
			// Variavel do usuario do banco
			final String usuario = "postgres";
			// Variavel da senha do Banco
			final String senha = "123";

			// O m�todo getConnection lan�a uma exce��o que precisa ser tratada pelo Throws
			// ou try cat

			// Neste caso implementado se acontecer uma exce��o. A aplica��o simplesmente
			// sa� do m�todo
			System.out.println("Conexao realizada");
			return DriverManager.getConnection(url, usuario, senha);

		} catch (SQLException e) {

			throw new RuntimeException(e);
		}

	}
}
