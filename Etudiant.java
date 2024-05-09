import java.time.LocalDate;

public class Etudiant extends Personne {
    // Attributs supplémentaires pour Etudiant
    private int numeroInscription;
    private double moyenne;
    private String niveau;
    private String groupe;

    // Constructeur
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresse, int numeroInscription, double moyenne, String niveau, String groupe) {
        super(nom, prenom, dateNaissance, adresse);
        this.numeroInscription = numeroInscription;
        this.moyenne = moyenne;
        this.niveau = niveau;
        this.groupe = groupe;
    }

    public double getMoyenne() {
        return moyenne;
    }

    // Méthode pour définir la moyenne de l'étudiant
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    // Méthode pour vérifier si l'étudiant est admis
    public boolean estAdmis() {
        // Supposons que la moyenne minimale pour être admis est de 10
        return moyenne >= 10;
    }

    // Méthode pour changer le groupe de l'étudiant
    public void changerGroupe(String nouveauGroupe) {
        this.groupe = nouveauGroupe;
    }
}
