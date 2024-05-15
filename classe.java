public class classe {
    private int id;
    private String nomClasse;
    private Filiere filiere;
    private Niveau niveau;

    public Classe(int id, Filiere filiere, Niveau niveau) {
        this.id = id;
        this.filiere = filiere;
        this.niveau = niveau;
        this.nomClasse = generateNomClasse(niveau, filiere);
    }

    private String generateNomClasse(Niveau niveau, Filiere filiere) {
        return niveau.toString() + "-" + filiere.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
        this.nomClasse = generateNomClasse(this.niveau, filiere);  // Update nomClasse when filiere changes
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
        this.nomClasse = generateNomClasse(niveau, this.filiere);  // Update nomClasse when niveau changes
    }

}
