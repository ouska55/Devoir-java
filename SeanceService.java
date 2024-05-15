import java.util.ArrayList;
import java.util.List;

public class SeanceService {
    private List<Seance> seances = new ArrayList<>();

    public Seance createSeance(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Cours cours) {
        Seance newSeance = new Seance(id, date, heureDebut, heureFin, cours);
        seances.add(newSeance);
        return newSeance;
    }

    public List<Seance> listSeances() {
        return new ArrayList<>(seances);
    }

    public void changeSeanceStatus(int seanceId, Statut newStatut) {
        for (Seance s : seances) {
            if (s.getId() == seanceId) {
                s.setStatut(newStatut);
                break;
            }
        }
    }
}
