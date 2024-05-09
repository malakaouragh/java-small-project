import java.util.ArrayList;

public class Groupe {
    // Attributs
    private int numero;
    private String niveau;
    private ArrayList<Etudiant> etudiants;

    // Constructeur
    public Groupe(int numero, String niveau) {
        this.numero = numero;
        this.niveau = niveau;
        this.etudiants = new ArrayList<>();
    }

    // Getters et setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    // Méthode pour afficher les étudiants du groupe
    public void afficherEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println("Nom: " + etudiant.getNom() + ", Prénom: " + etudiant.getPrenom());
        }
    }

    // Méthode pour calculer le nombre d'étudiants dans le groupe
    public int calculerNbrEtudiant() {
        return etudiants.size();
    }

    // Méthode pour chercher un étudiant dans le groupe
    public boolean chercherEtudiant(Etudiant etudiant) {
        return etudiants.contains(etudiant);
    }

    // Méthode pour ajouter un étudiant au groupe
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    // Méthode pour supprimer un étudiant du groupe
    public void supprimerEtudiant(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }

    // Méthode pour calculer le nombre d'étudiants admis dans le groupe
    public int calculerNbrEtudiantAdmis() {
        int count = 0;
        for (Etudiant etudiant : etudiants) {
            if (etudiant.estAdmis()) {
                count++;
            }
        }
        return count;
    }

    // Méthode pour trouver le major du groupe
    public Etudiant majorGroupe() {
        if (etudiants.isEmpty()) {
            return null; // Retourne null si le groupe est vide
        }

        Etudiant major = etudiants.get(0); // Supposons que le premier étudiant est le major initial

        // Parcourir tous les étudiants du groupe pour trouver le major
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getMoyenne() > major.getMoyenne()) {
                major = etudiant; // Met à jour le major si on trouve un étudiant avec une meilleure moyenne
            }
        }

        return major;
    }
}
