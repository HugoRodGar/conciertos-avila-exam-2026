package edu.iesam;

import edu.iesam.features.concerts.presentation.ConcertView;

public class Main {

    static void main() {

        //Function1
        System.out.println("Actual list");
        ConcertView.printConcerts();

        //Function2
        ConcertView.saveConcert();

        //Function3
        ConcertView.deleteConcert();

    }

}
