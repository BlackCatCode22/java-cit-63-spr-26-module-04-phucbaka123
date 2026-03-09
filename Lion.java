package Animal;

import java.util.Scanner;

public class Lion extends Animal{
    protected double prideSize;
    protected String maneColor;
    protected double roarVolume;
    protected String species = "Lion";
    //Since I don't know what is going to appear in the arrivingAnimal.txt and animalNames.txt, so I gonna create my own
    //my own file for it
    public Lion(String name, int age, int weight, String species, String gender, String birth_season, String color,
                String park, String country, String laugh){
        super(name, age, weight, species, gender, birth_season, color,
                park, country, laugh);


//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter pride size: ");
//        this.prideSize = scanner.nextDouble();
//        System.out.println("Enter mane color: ");
//        this.maneColor = scanner.nextLine();
//        System.out.println("Enter roar volume: ");
//        this.roarVolume = scanner.nextDouble();
    }
    public double getPrideSize(){
        return prideSize;
    }
    public String getManeColor(){
        return maneColor;
    }
    public double getRoarVolume(){
        return roarVolume;
    }
    public void setPrideSize(double newpridesize){
        prideSize = newpridesize;
    }
    public void setManeColor(String newmaneColor){
        maneColor = newmaneColor;
    }
    public void setRoarVolume(double newroarvolume){
        roarVolume = newroarvolume;
    }
}
