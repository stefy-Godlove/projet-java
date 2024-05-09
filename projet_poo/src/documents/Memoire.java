package documents;

import java.util.Date;

public class Memoire extends Document{
    private String nomCandidat;
    private Date dateSoutenance;
 
    public Memoire(String titre, String localisation, int code, int nbreExemplaire, String nomCandidat, Date dateSoutenance) {
        super(titre, localisation, code, nbreExemplaire);
        this.nomCandidat = nomCandidat;
        this.dateSoutenance = dateSoutenance;
    }
    public String getNomCandidat() {
        return nomCandidat;
    }
    public void setNomCandidat(String nomCandidat) {
        this.nomCandidat = nomCandidat;
    }
    public Date getDateSoutenance() {
        return dateSoutenance;
    }
    public void setDateSoutenance(Date dateSoutenance) {
        this.dateSoutenance = dateSoutenance;
    }
    @Override
    public String toString() {
        return "Memoire ["+ super.toString() + ", nomCandidat=" + nomCandidat + ", dateSoutenance="
                + dateSoutenance + "]";
    }
    public void Afficher(){
        System.out.println(this.toString());
    }

}
