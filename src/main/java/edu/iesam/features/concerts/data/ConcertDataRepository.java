package edu.iesam.features.concerts.data;

import edu.iesam.features.concerts.domain.Concert;
import edu.iesam.features.concerts.domain.ConcertRepository;

import java.util.ArrayList;

public class ConcertDataRepository implements ConcertRepository {

    private ConcertMemLocalDataSource concertMemLocalDataSource;

    public ConcertDataRepository(ConcertMemLocalDataSource concertMemLocalDataSource) {
        this.concertMemLocalDataSource = concertMemLocalDataSource;
    }

    @Override
    public ArrayList<Concert> getConcerts() {
        return concertMemLocalDataSource.findAll();
    }

    @Override
    public void saveConcert(Concert concert) {
        concertMemLocalDataSource.save(concert);
    }

    @Override
    public void deleteConcert(String id) {
        concertMemLocalDataSource.delete(id);
    }
}
