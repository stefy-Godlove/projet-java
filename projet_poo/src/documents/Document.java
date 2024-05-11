package documents;

public class Document {
    //attributs
    private String titre;
    private String localisation;
    private int code;
    private int nbreExemplaire;
    private int nbreEmpruntEff = 0;
    //constructor
    public Document(String titre, String localisation, int code, int nbreExemplaire) {
        this.titre = titre;
        this.localisation = localisation;
        this.code = code;
        this.nbreExemplaire = nbreExemplaire;
    }
    //getter et setter
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getLocalisation() {
        return localisation;
    }
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getNbreExemplaire() {
        return nbreExemplaire;
    }
    public void setNbreExemplaire(int nbreExemplaire) {
        this.nbreExemplaire = nbreExemplaire;
    }
    public void Afficher(){
       
    }
    public int getNbreEmpruntEff() {
        return nbreEmpruntEff;
    }
    public void setNbreEmpruntEff(int nbreEmpruntEff) {
        this.nbreEmpruntEff = nbreEmpruntEff;
    }

    //methode tostring
    @Override
    public String toString() {
        return "titre=" + titre + ", localisation=" + localisation  + ", code=" + code
                + ", nbreExemplaire=" + nbreExemplaire;
    }
    
 

}
