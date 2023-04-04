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

			// O método getConnection lança uma exceção que precisa ser tratada pelo Throws
			// ou try cat

			// Neste caso implementado se acontecer uma exceção. A aplicação simplesmente
			// saí do método
			System.out.println("Conexao realizada");
			return DriverManager.getConnection(url, usuario, senha);

		} catch (SQLException e) {

			throw new RuntimeException(e);
		}

	}
}
