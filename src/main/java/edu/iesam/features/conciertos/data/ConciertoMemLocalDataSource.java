package edu.iesam.features.conciertos.data; //cambiar por la ruta correcta

import java.util.ArrayList;
import java.util.Objects;

public class ConciertoMemLocalDataSource {

    private ArrayList<Concierto> storage = new ArrayList<>();

    public ArrayList<Concierto> findAll() {
        return storage;
    }

    public void save(Concierto concierto) {
        storage.add(concierto);
    }

    public void delete(String concierto) {
        storage.removeIf(concierto ->
            Objects.equals(concierto.getId(), concierto)
        );
    }
}
