package edu.iesam.mocks;

import edu.iesam.features.concerts.domain.Concert;
import edu.iesam.features.concerts.domain.ConcertRepository;

import java.util.ArrayList;

public class NullConcertMockRepository implements ConcertRepository {

    @Override
    public ArrayList<Concert> getConcerts() {
        return null;
    }

    @Override
    public void saveConcert(Concert concert) {

    }

    @Override
    public void deleteConcert(String id) {

    }

}
