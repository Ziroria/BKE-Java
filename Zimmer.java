import java.util.ArrayList;
import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Zimmer.
 * 
 * @author (Memo Kocgazi) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zimmer
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int anzahlBetten;
    private double preis;
    private ArrayList<Person> personen;

    public Zimmer(int anzahlBetten, double preis)
    {
        this.anzahlBetten = anzahlBetten;
        this.preis = preis;
        personen = new ArrayList<Person>();
    }

    public int gibAnzahlBetten()
    {
        return anzahlBetten;
    }

    public double gibPreis()
    {
        return preis;
    }

    public void setzePreis (int neuPreis)
    {
        preis = neuPreis; 
    }

    public void personHinzufügen(Person personX)
    {
        if(anzahlBetten > personen.size())
        {
            personen.add(personX);
        }
        else
        {
            System.out.println("Das Zimmer ist Belegt");
        }
    }
    
    public int anzahlPersonen()
    {
        return personen.size();
    }

    public void personEntfernen(Person personX)
    {
        personen.remove(personX);
    }

    public void personenEntfernen(String beschreibung)
    {
        
        for(Person person : personen)
        {
            personen.remove(beschreibung);
        }
    }
}
