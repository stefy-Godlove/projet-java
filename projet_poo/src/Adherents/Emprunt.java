package Adherents;

import java.sql.Date;

public class Emprunt {
    //attributs
    private String emprunteurId;
    private Date dateDeDebut;
    private Date dateLimite;
    private int codeDocument;
    //contructeur
    public Emprunt(String emprunteurId, Date dateDeDebut, Date dateLimite, int codeDocument) {
        this.emprunteurId = emprunteurId;
        this.dateDeDebut = dateDeDebut;
        this.dateLimite = dateLimite;
        this.codeDocument = codeDocument;
    }
    //getter et setter
    public String getEmprunteurId() {
        return emprunteurId;
    }
    public void setEmprunteurId(String emprunteurId) {
        this.emprunteurId = emprunteurId;
    }
    public Date getDateDeDebut() {
        return dateDeDebut;
    }
    public void setDateDeDebut(Date dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }
    public Date getDateLimite() {
        return dateLimite;
    }
    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }
    public int getCodeDocument() {
        return codeDocument;
    }
    public void setCodeDocument(int codeDocument) {
        this.codeDocument = codeDocument;
    }
    //methode to    string
    @Override
    public String toString() {
        return "Emprunt [emprunteurId=" + emprunteurId + ", dateDeDebut=" + dateDeDebut + ", dateLimite=" + dateLimite
                + ", codeDocument=" + codeDocument + "]";
    }

    
}
