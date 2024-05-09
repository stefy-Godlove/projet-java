package documents;

public class Magazines extends Document {
    private float frequenceDeParution;


    public Magazines(String titre, String localisation, int code, int nbreExemplaire,
            float frequenceDeParution) {
        super(titre, localisation, code, nbreExemplaire);
        this.frequenceDeParution = frequenceDeParution;
    }

    public float getFrequenceDeParution() {
        return frequenceDeParution;
    }

    public void setFrequenceDeParution(float frequenceDeParution) {
        this.frequenceDeParution = frequenceDeParution;
    }

    @Override
    public String toString() {
        return "Magazines ["+ super.toString() + frequenceDeParution + "]";
    }
    public void Afficher(){
        System.out.println(this.toString());
    }
}
