package dominio;

import java.util.ArrayList;

public class Libreta {

    private ArrayList<Contacto> contactos;

    public Libreta() {
        contactos = new ArrayList<>();
    }

    public void añadirContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Contacto contacto : contactos) {
            sb.append(contacto.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

