package edu.iesam.features.concerts.presentation;

import edu.iesam.features.concerts.data.ConcertDataRepository;
import edu.iesam.features.concerts.data.ConcertMemLocalDataSource;
import edu.iesam.features.concerts.domain.Concert;
import edu.iesam.features.concerts.domain.DeleteConcertUseCase;
import edu.iesam.features.concerts.domain.GetConcertsUseCase;
import edu.iesam.features.concerts.domain.SaveConcertUseCase;

import java.util.ArrayList;

public class ConcertView {

    //Funcion 1
    public static void printConcerts() {
        GetConcertsUseCase getConcertsUseCase = new GetConcertsUseCase(
                new ConcertDataRepository(ConcertMemLocalDataSource.newInstance())
        );

        ArrayList<Concert> concerts = getConcertsUseCase.execute();
        System.out.println(concerts);
    }

    //Funcion 2
    public static void saveConcert() {
        SaveConcertUseCase saveConcertUseCase = new SaveConcertUseCase(
                new ConcertDataRepository(ConcertMemLocalDataSource.newInstance())
        );

        System.out.println("List before");
        printConcerts();

        Concert newConcert = new Concert("EV-2026-0454","Gabriel","Nº4","23/06/2026","2000","206");
        System.out.println("Saving: " + newConcert);
        saveConcertUseCase.execute(newConcert);

        System.out.println("List after");
        printConcerts();
    }

    //Funcion 3
    public static void deleteConcert() {
        DeleteConcertUseCase deleteConcertUseCase = new DeleteConcertUseCase(
                new ConcertDataRepository(ConcertMemLocalDataSource.newInstance())
        );

        System.out.println("List before");
        printConcerts();

        System.out.println("Deleting... ");
        deleteConcertUseCase.execute("2");

        System.out.println("List after");
        printConcerts();
    }
}
