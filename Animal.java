package Animal;
import java.util.Scanner;
import java.util.HashMap;

public class Animal {
    protected String name;
    protected int age;
    protected String species;
    protected String gender;
    protected String park;
    protected String country;
    protected String color;
    protected String birth_season;
    protected String laugh;
    protected int weight;

    //Since I don't know what is going to appear in the arrivingAnimal.txt and animalNames.txt, so I gonna create my own
    //myown file for it
    //And this constructor will ask for name, age and species
    public Animal(String name, int age, int weight, String species, String gender, String birth_season, String color,
                  String park, String country, String laugh){
        this.name = name;
        this.age = age;
        this.species = species;
        this.gender = gender;
        this.park = park;
        this.country = country;
        this.color = color;
        this.birth_season = birth_season;
        this.laugh = laugh;
        this.weight = weight;
    }

//    public Animal(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the name of the animal: ");
//        name = scanner.nextLine();
//        System.out.println("Enter the age: ");
//        age = scanner.nextDouble();
//        System.out.println("Enter the species: ");
//        species = scanner.nextLine();
//
//    }
    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public String getSpecies(){
        return species;
    }
    public String getGender(){return gender;}
    public String getPark(){return park;}
    public String getCountry(){return country;}
    public String getColor(){return color;}
    public String getBirth_season(){return birth_season;}
    public String getLaugh(){return laugh;}
    public int getWeight(){return weight;}
    public String Information(){
        return "; " + name + "; " + age + " years old; born in " + birth_season + "; " + color + "; "
                + gender + "; " + weight + " pounds; from " + park + "; " + country + ".";
    }


    public void setName(String newname){
        name = newname;
    }
    public void setAge(int newage){
        age = newage;
    }
    public void setSpecies(String newspecies){
        species = newspecies;
    }


}
