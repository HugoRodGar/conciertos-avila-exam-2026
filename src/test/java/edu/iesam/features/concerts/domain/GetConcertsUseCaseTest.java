package edu.iesam.features.concerts.domain;

import edu.iesam.mocks.ConcertMockRepository;
import edu.iesam.mocks.NullConcertMockRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetConcertsUseCaseTest {

    //Test 1
//    @Test
//    void ShouldCallGetMethodExecuted() {
//
//        //Given
//        ConcertMockRepository mockRepo = new ConcertMockRepository();
//        GetConcertsUseCase useCase = new GetConcertsUseCase(mockRepo);
//        ArrayList<Concert> concerts = new ArrayList<>();
//        concerts.add(new Concert("EV-2026-0451","Pablo","Nº1","23/06/2026","1006","50"));
//
//        //When
//        useCase.execute();
//
//        //Then
//        assertEquals(1, mockRepo.getConcerts().size());
//
//    }

    //Test 2
    @Test
    void NullShouldCallGetMethodExecuted() {

        //Given
        NullConcertMockRepository nullMockRepo = new NullConcertMockRepository();
        GetConcertsUseCase useCase = new GetConcertsUseCase(nullMockRepo);

        //When
        useCase.execute();

        //Then
        assertEquals(null, nullMockRepo.getConcerts());

    }

    //Test 3
//    @Test
//    void EmptyShouldCallGetMethodExecuted() {
//
//        //Given
//        ConcertMockRepository emptyMockRepo = new ConcertMockRepository();
//        GetConcertsUseCase useCase = new GetConcertsUseCase(emptyMockRepo);
//
//        //When
//        useCase.execute();
//
//        //Then
//        assertEquals(0, emptyMockRepo.getConcerts().size());
//    }
}