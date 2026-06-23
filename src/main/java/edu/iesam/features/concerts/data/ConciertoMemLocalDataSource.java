package edu.iesam.features.concerts.data;

import edu.iesam.features.concerts.domain.Concert;

import java.util.ArrayList;
import java.util.Objects;

public class ConciertoMemLocalDataSource {

    private ArrayList<Concert> storage = new ArrayList<>();

    public ArrayList<Concert> findAll() {
        return storage;
    }

    public void save(Concert concert) {
        storage.add(concert);
    }

    public void delete(String id) {
        storage.removeIf(concert ->
            Objects.equals(concert.getId(), id)
        );
    }
}
