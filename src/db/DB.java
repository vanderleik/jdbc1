package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Classe que estabeçece a conexão com o banco de dados conforme propriedades definidas no db.properties
 */
public class DB {

    private static Connection conn = null;

    /**
     * Método que faz a conexão com o banco de dados
     * @return Connection (retorna a conexão com o banco de dados)
     */
    public static Connection getConnection() {
        if (conn == null) {
            try {
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            conn = DriverManager.getConnection(url, props);
            } catch (SQLException ex) {
                throw new DbException(ex.getMessage());
            }
        }
        return conn;
    }

    /**
     * Método que fecha a conexão com o banco de dados
     */
    public static void closeConnection(){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                throw new DbException(ex.getMessage());
            }
        }
    }

    /**
     * Método que carrega as propriedades do db.properties
     * @return Properties (retorna as propriedades de conexão ao banco de dados)
     */
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException ex) {
            throw new DbException(ex.getMessage());
        }
    }
}
