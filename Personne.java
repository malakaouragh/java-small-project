import java.time.LocalDate;
import java.time.Period;

public class Personne {
    // Attributs
    public String nom;
    public String prenom;
    public LocalDate dateNaissance;
    private String adresse;

    // Constructeur
    public Personne(String nom, String prenom, LocalDate dateNaissance, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode identifier
    public void identifier() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
    }

    // Méthode calculerAge
    public int calculerAge() {
        LocalDate maintenant = LocalDate.now();
        return Period.between(dateNaissance, maintenant).getYears();
    }
}
