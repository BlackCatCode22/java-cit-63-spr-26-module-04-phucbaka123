package Animal;

import java.util.Scanner;

public class Bear extends Animal{
    protected int weight;
    protected String Fur_color;
    protected String prey;

    public Bear(String name, int age, int weight, String species, String gender, String birth_season, String color,
                String park, String country, String laugh){
        super(name, age, weight, species, gender, birth_season, color,
                park, country, laugh);

    }
    public String getPrey(){return prey;}
    public String getFur_color(){return Fur_color;}
    public int getWeight(){return weight;}
    public void setPrey(String newPrey){prey = newPrey;}
    public void setWeight(int newWeight){weight = newWeight;}
    public void setFur_color(String newColor){Fur_color = newColor;}

}
