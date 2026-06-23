package edu.iesam.features.concerts.domain;

import edu.iesam.mocks.ConcertMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaveConcertUseCaseTest {

    @Test
    public void ShouldCallSaveMethodCountExecuted() {

        //Given
        ConcertMockRepository mockRepo = new ConcertMockRepository();
        SaveConcertUseCase useCase = new SaveConcertUseCase(mockRepo);
        Concert concert = new Concert("EV-2026-0451","Pablo","Nº1","23/06/2026","1006","50");

        //When
        useCase.execute(concert);

        //Then
        assertEquals(1, mockRepo.CountSaveMethod);

    }
}