package edu.iesam.features.concerts.data;

import edu.iesam.features.concerts.domain.Concert;
import java.util.ArrayList;
import java.util.Objects;

public class ConcertMemLocalDataSource {

    private static ConcertMemLocalDataSource instance = null;

    private ArrayList<Concert> storage = new ArrayList<>();

    public ConcertMemLocalDataSource() {
        storage.add(new Concert("1","Pablo","Nº1","23/06/2026","1006","50"));
        storage.add(new Concert("2","Javi","Nº2","23/06/2026","998","60"));
        storage.add(new Concert("3","Robert","Nº3","23/06/2026","1060","70"));
    }

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

    public static ConcertMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new ConcertMemLocalDataSource();
        }
        return instance;
    }
}
