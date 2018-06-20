
/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @authors Yami, Ziroria
 * @version 20.06.2018
 */
public class Person{
    private int alter;
    private String name;

    public Person(String newName, int newAlter){
        name = newName;
        alter = newAlter;
    }
        
    public String gibName(){
        return name;
    }
    
    public int gibAlter(){
        return alter;
    }
}
