package Problema4;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Obteniene la instancia del ConnectionManager
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        
        // Utiliza el ConnectionManager para obtener una conexión a la base de datos
        Connection connection = connectionManager.getConnection(); 
    }
}