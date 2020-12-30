package domain.plansza;

public class PlanszaService {
    PlanszaRepository repository = new PlanszaRepository();

    /*Plansza createPlansza() {
        Plansza p1 = new Plansza();
        return p1;
    }*/

    public Poziom wczytajPoziom() {
        return repository.wczytajPoziom();
    }
}