package documents;

import java.util.Date;

public class Livres extends Document{
    private String nomAuteur;
    private String nomEditeur;
    private Date dateEdition;
 
    public Livres(String titre, String localisation, int code, int nbreExemplaire, String nomAuteur,
            String nomEditeur, Date dateEdition) {
        super(titre, localisation, code, nbreExemplaire);
        this.nomAuteur = nomAuteur;
        this.nomEditeur = nomEditeur;
        this.dateEdition = dateEdition;
    }
    public String getNomAuteur() {
        return nomAuteur;
    }
    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }
    public String getNomEditeur() {
        return nomEditeur;
    }
    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }
    public Date getDateEdition() {
        return dateEdition;
    }
    public void setDateEdition(Date dateEdition) {
        this.dateEdition = dateEdition;
    }
    @Override
    public String toString() {
        return "livres [" + super.toString()+ ", nomAuteur=" + nomAuteur + ", nomEditeur=" + nomEditeur + ", dateEdition=" + dateEdition + "]";
    }
    public void  Afficher(){
        System.out.println(this.toString());
    }
}
