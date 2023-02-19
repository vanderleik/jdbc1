package application;

import db.DB;

import java.sql.Connection;

public class Program {
    /**
     * Método para testar a conexão com o banco de dados
     * @param args
     */
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
