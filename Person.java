
/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @author (memo) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Person
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int alter;
    private String name;

    public Person(String nName, int nAlter)
    {
        name = nName;
        alter = nAlter;
    }
        
    public String gibName()
    {
        return name;
    }
    
    public int gibAlter()
    {
        return alter;
    }
}
