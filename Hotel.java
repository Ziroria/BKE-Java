import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Hotel.
 * 
 * @author (memo) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hotel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Zimmer> zimmerliste;

    public Hotel()
    {
        zimmerliste = new ArrayList<Zimmer>();
    }

    public void Hinzufuegen(Zimmer zimmer)
    {
        zimmerliste.add(zimmer);
    }

    public int gibAnzahlZimmer()
    {
        return zimmerliste.size();
    }

    public int gibAnzahlBetten()
    {
        int anzahl = 0;
        for(Zimmer zimmer : zimmerliste){
            anzahl = anzahl + zimmer.gibAnzahlBetten();
        }
        return anzahl;
    }
    
    public ArrayList<Zimmer> gibFreieZimmer()
    {
        ArrayList<Zimmer> freieZimmer = new ArrayList<Zimmer>();
        for (Zimmer zimmer : zimmerliste){
            freieZimmer.add(zimmer);
        }
        return freieZimmer;
    }
}
