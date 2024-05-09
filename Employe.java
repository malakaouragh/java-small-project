import java.time.LocalDate;
public class Employe extends Personne {
    // Attributs supplémentaires pour Employe
    private String fonction;
    private double salaire;

    // Constructeur
    public Employe(String nom, String prenom, LocalDate dateNaissance, String adresse, String fonction, double salaire) {
        super(nom, prenom, dateNaissance, adresse);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    // Getters et setters pour les attributs supplémentaires
    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // Méthode pour calculer le salaire annuel
    public double calculerSalaireAnnuel() {
        // Supposons que le salaire est mensuel
        return salaire * 12;
    }
}
