package documents;

import java.util.Date;

public class Article extends Document{
    private String nomAuteur;
    private Date datePublication;
   
  
    public Article(String titre, String localisation, int code, int nbreExemplaire, String nomAuteur,
            Date datePublication) {
        super(titre, localisation, code, nbreExemplaire);
        this.nomAuteur = nomAuteur;
        this.datePublication = datePublication;
    }
    public String getNomAuteur() {
        return nomAuteur;
    }
    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }
    public Date getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }
    @Override
    public String toString() {
        return "Article [" + super.toString() + ", nomAuteur=" + nomAuteur + ", datePublication=" + datePublication + "]";
    }
    public void Afficher(){
        System.out.println(this.toString());
    }
    
}
