
public class Fahrzeug {

    private String kennzeichen;
    private String haltername;
    private int baujahr;
    private String fahrzeugtyp;

    // Konstruktor
    public Fahrzeug(String kennzeichen, String haltername, int baujahr, String fahrzeugtyp) {
        this.kennzeichen = kennzeichen;
        this.haltername = haltername;
        this.baujahr = baujahr;
        this.fahrzeugtyp = fahrzeugtyp;
    }

    // Getter
    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getHaltername() {
        return haltername;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public String getFahrzeugtyp() {
        return fahrzeugtyp;
    }

   
    public void setHaltername(String haltername) {
        this.haltername = haltername;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public void setFahrzeugtyp(String fahrzeugtyp) {
        this.fahrzeugtyp = fahrzeugtyp;
    }



    public boolean isGreaterThan(Fahrzeug anderesFahrzeug) {
        return this.kennzeichen.compareTo(anderesFahrzeug.kennzeichen) > 0;
    }

    public boolean isLessThan(Fahrzeug anderesFahrzeug) {
        return this.kennzeichen.compareTo(anderesFahrzeug.kennzeichen) < 0;
    }

    public boolean isEqualTo(Fahrzeug anderesFahrzeug) {
        return this.kennzeichen.equals(anderesFahrzeug.kennzeichen);
    }

    @Override
    public String toString() {
        return "Kennzeichen: " + kennzeichen +
               ", Halter: " + haltername +
               ", Baujahr: " + baujahr +
               ", Typ: " + fahrzeugtyp;
    }
}