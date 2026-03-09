package Animal;

import java.util.Scanner;

public class Tiger extends Animal{
    protected String prey;
    protected double stripeLength;

    public Tiger(String name, int age, int weight, String species, String gender, String birth_season, String color,
                 String park, String country, String laugh){
        super(name, age, weight, species, gender, birth_season, color,
                park, country, laugh);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter prey: ");
//        this.prey = scanner.nextLine();
//        System.out.println("Enter stripe's length: ");
//        this.stripeLength = scanner.nextInt();
    }
    public String getPrey(){return prey;}
    public double getStripeLength() {return stripeLength;}
    public void setNewPrey(String newPrey){prey = newPrey;}
    public void setNewStripeLength(double newstripeLength){ stripeLength = newstripeLength;}

}
