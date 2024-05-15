import java.util.ArrayList;
import java.util.List;

public class ClasseService {
    private List<Classe> classes = new ArrayList<>();

    public Classe createClasse(int id, Filiere filiere, Niveau niveau) {
        Classe newClasse = new Classe(id, filiere, niveau);
        classes.add(newClasse);
        return newClasse;
    }

    public List<Classe> listClasses() {
        return new ArrayList<>(classes);
    }
}