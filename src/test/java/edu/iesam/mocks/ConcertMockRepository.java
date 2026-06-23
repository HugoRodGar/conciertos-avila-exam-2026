package edu.iesam.mocks;

import edu.iesam.features.concerts.domain.Concert;
import edu.iesam.features.concerts.domain.ConcertRepository;

import java.util.ArrayList;

public class ConcertMockRepository implements ConcertRepository {

    public int CountSaveMethod = 0;
    public int CountDeleteMethod = 0;

    @Override
    public ArrayList<Concert> getConcerts() {
        ArrayList<Concert> concerts = new ArrayList<>();
        concerts.add(new Concert("EV-2026-0451","Pablo","Nº1","23/06/2026","1006","50"));
        concerts.add(new Concert("EV-2026-0452","Javi","Nº2","23/06/2026","998","60"));
        concerts.add(new Concert("EV-2026-0453","Robert","Nº3","23/06/2026","1060","70"));
        return null;
    }

    @Override
    public void saveConcert(Concert concert) {
        CountSaveMethod++;
    }

    @Override
    public void deleteConcert(String id) {
        CountDeleteMethod++;
    }
}
