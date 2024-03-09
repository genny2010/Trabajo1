package Problema4;

import java.sql.Connection;

public class ConnectionManager {
    private static ConnectionManager instance;
    
    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private ConnectionManager() {
        // Se inicializa la conexión a la base de datos 
    }
    
    // Método estático para obtener la única instancia de ConnectionManager
    public static ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }
    
    // Método para obtener una conexión a la base de datos
    public Connection getConnection() {
        // Obtiene la conexión
        System.out.println("Obteniendo conexión a la base de datos...");
        return null; // Retorna la conexión
    }
}