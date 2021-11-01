package mx.ipn;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Vectores {
    private Vector<String> vector;

    private final String[] animals = new String[] {
            "Tortuga",
            "León",
            "Vaca",
            "Zorro",
            "Perro",
            "Gato",
            "Oveja",
            "Ratón",
            "Tiburón",
            "Abeja",
            "Grillo",
            "Avestruz"
    };

    public Vectores() {
        this.vector = new Vector<>(10, 2);
        this.populateVector();
    }

    public void populateVector() {
        for (String s: this.animals) {
            this.vector.addElement(s);
        }
    }

    public Vector<String> getVector() {
        return vector;
    }

    public void setVector(Vector<String> vector) {
        this.vector = vector;
    }

    public void deleteElement(int index) {
        this.vector.removeElementAt(index);
    }

    public Map<String, Integer> vectorInformation() {
        Map<String, Integer> data = new HashMap<String, Integer>();

        data.put("Size", this.vector.size());
        data.put("Capacity", this.vector.capacity());

        return data;
    }
}
