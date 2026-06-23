package edu.iesam.features.concerts.domain;

public class SaveConcertUseCase {

    private ConcertRepository concertRepository;

    public SaveConcertUseCase(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    public void execute(Concert concert) {
        concertRepository.saveConcert(concert);
    }

}
