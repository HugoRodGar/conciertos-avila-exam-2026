package edu.iesam.features.concerts.domain;

import java.util.ArrayList;

public interface ConcertRepository {

    ArrayList<Concert> getConcerts();
    void saveConcert(Concert concert);
    void deleteConcert(String id);

}
