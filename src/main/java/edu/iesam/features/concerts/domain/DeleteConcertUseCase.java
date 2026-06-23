package edu.iesam.features.concerts.domain;

public class DeleteConcertUseCase {

    private ConcertRepository concertRepository;

    public DeleteConcertUseCase(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    public void execute(String id) {
        concertRepository.deleteConcert(id);
    }

}
