package edu.iesam.features.concerts.domain;

import edu.iesam.features.concerts.data.ConcertMemLocalDataSource;

import java.util.ArrayList;

public class GetConcertsUseCase {

    private ConcertRepository concertRepository;

    public GetConcertsUseCase(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    public ArrayList<Concert> execute() {
        return concertRepository.getConcerts();
    }

}
