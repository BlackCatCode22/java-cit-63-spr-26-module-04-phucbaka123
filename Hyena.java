package Animal;

import java.util.Scanner;

public class Hyena extends Animal {
    protected String laughPitch;
    protected int clanSize;
    protected double biteForce;

    public Hyena(String name, int age, int weight, String species, String gender, String birth_season, String color,
                 String park, String country, String laugh){
        super(name, age, weight, species, gender, birth_season, color,
                park, country, laugh);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter laughPitch(high, medium, low): ");
//        this.laughPitch = scanner.nextLine();
//        System.out.println("Enter clansize: ");
//        this.clanSize = scanner.nextInt();
//        System.out.println("Enter bite force: ");
//        this.biteForce = scanner.nextDouble();
    }
    public String getLaughPitch(){
        return laughPitch;
    }
    public int getClanSize(){
        return clanSize;
    }
    public double getBiteForce(){
        return biteForce;
    }
    public void setLaughPitch(String newLaughPitch){
        laughPitch = newLaughPitch;
    }
    public void setClanSize(int newclansize){
        clanSize = newclansize;
    }
    public void setbitForce(double newBitForce){
        biteForce = newBitForce;
    }
}
