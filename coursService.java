import java.util.ArrayList;
import java.util.List;

public class CoursService {
    private List<Cours> coursList = new ArrayList<>();

    public Cours createCours(int id, String module, String professeur) {
        Cours newCours = new Cours(id, module, professeur);
        coursList.add(newCours);
        return newCours;
    }

    public List<Cours> listCours() {
        return new ArrayList<>(coursList);
    }

    public List<Cours> listCoursByClasse(int classeId) {
        List<Cours> filteredCours = new ArrayList<>();
        for (Cours c : coursList) {
            for (Classe cl : c.getClasses()) {
                if (cl.getId() == classeId) {
                    filteredCours.add(c);
                }
            }
        }
        return filteredCours;
    }
}
