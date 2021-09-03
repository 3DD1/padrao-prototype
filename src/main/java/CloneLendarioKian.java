public class CloneLendarioKian implements Cloneable {

    private String father;
    private String mother;
    private String color;
    private int bodyWeight;
    private int persistence;
    private int temperament;
    private int vitality;

    public CloneLendarioKian(String father, String mother, String color, int bodyWeight, int persistence, int temperament, int vitality) {
        this.father = father;
        this.mother = mother;
        this.color = color;
        this.bodyWeight = bodyWeight;
        this.persistence = persistence;
        this.temperament = temperament;
        this.vitality = vitality;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(int bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public int getPersistence() {
        return persistence;
    }

    public void setPersistence(int persistence) {
        this.persistence = persistence;
    }

    public int getTemperament() {
        return temperament;
    }

    public void setTemperament(int temperament) {
        this.temperament = temperament;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
    @Override
    public CloneLendarioKian clone() throws CloneNotSupportedException {
        CloneLendarioKian kianClone = (CloneLendarioKian) super.clone();
        return kianClone;
    }



}
/*Referencia*/
/*https://en.wikipedia.org/wiki/Kian_(bull)
*https://www.wikizero.com/en/Kian_(bull)
* https://apps.crv4all.com/siresearch/us/detail/background/NLDM000207288005
*
* */