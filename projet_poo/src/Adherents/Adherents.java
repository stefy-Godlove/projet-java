package Adherents;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

public class Adherents {
    //attributs
    private String nom;
    private String prenom;
    private String identifiant;
    private String adresse;
    private String type;
    private int duree;
    private int empruntEffectues = 0;
    private Emprunt[] emprunt;
    //constructeur
    public Adherents(String nom, String prenom, String identifiant, String adresse, String type) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.type = type;
        if(this.type.equals("etudiant")){
            emprunt = new Emprunt[2];
            duree = 2;
        }else if(this.type.equals("enseignant")){
            emprunt = new Emprunt[4];
            duree = 3;
        }else {
            emprunt = new Emprunt[1];
            duree = 1;
        }
    }
    //getter et setter
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
    public String getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getEmpruntEffectues() {
        return empruntEffectues;
    }
    public void setEmpruntEffectues(int empruntEffectues) {
        this.empruntEffectues = empruntEffectues;
    }
    public int nbrEmprunt(){
        return this.emprunt.length;
    }
 


    //afficher une instanciation de la classe
    @Override
    public String toString() {
        return "Adherents [nom=" + nom + ", prenom=" + prenom + ", identifiant=" + identifiant + ", adresse=" + adresse
                + ", type=" + type + ", emprunt=" + emprunt.length + "]";
    }
    public void Afficher(){
        System.out.println(this.toString());
    }
    //methode pour emprunter un document
    public void Emprunter(Emprunt emprunt){
        this.emprunt[this.empruntEffectues] = emprunt;
        this.empruntEffectues++;
    }
    // methode pour afficher un emprunt
    public void afficheEmprunt(){
        for(int i =0;i < this.empruntEffectues;i++){
            System.out.println(this.emprunt[i].toString());
        }
    }
    //methode pour remettre un document
    public void Remettre(int codeD, String IdEm, Date dateEmprunt ){

       for (int i = 0; i < this.empruntEffectues; i++) {
        if (this.emprunt[i].getCodeDocument()==codeD &&  this.emprunt[i].getEmprunteurId().equals(IdEm) && this.emprunt[i].getDateDeDebut().equals(dateEmprunt)) {
            if (i == empruntEffectues - 1) {
                this.empruntEffectues--;
            }
            else{
                for(int j = i; j <this.empruntEffectues - 1; j++){
                    this.emprunt[j] = this.emprunt[j+1];
                }
                this.empruntEffectues--;
                return;
            }
        }
       }
    }
    //getter de l'attribut emprunt
    public Emprunt[] getEmprunt() {
        return emprunt;
    }
    //methode pour voir des emprunts depasses
    public void EmpruntDepasse(int codeD, String IdEm, Date date ){
        int count = 0;
        for (int i = 0; i < this.empruntEffectues; i++) {
            int compaire = this.emprunt[i].getDateLimite().compareTo(date);
            if (this.emprunt[i].getCodeDocument()== codeD && this.emprunt[i].getEmprunteurId().equals(IdEm) && compaire < 0  ) {
                count++;
                // System.out.println("l'emprunt: " + this.emprunt[i].toString() + " n'a pas ete remis a temp. Veillez tout dabord le regler.");
            }
            System.out.println(" il y'a exactement " + count + " Emprunt en retard");
        }
    }
}
