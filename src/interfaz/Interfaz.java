package interfaz;

import java.util.HashMap;
import java.util.Map;

public class Interfaz implements Runnable {
    private Map<String, String> contactos;

    public Interfaz() {
        contactos = new HashMap<>();
    }

    public void add(String nombre, String telefono) {
        contactos.put(nombre, telefono);
    }

    public void list() {
        for (Map.Entry<String, String> entry : contactos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public void run() {
        // Lógica para ejecutar la aplicación
    }
}
