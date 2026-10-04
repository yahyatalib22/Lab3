package exercice10;

public class Calculator {
    Floor floor;
    Carpet carpet;
    public Calculator(Floor f,Carpet c){
        this.floor = new Floor(f.width,f.length);
        this.carpet = new Carpet(c.cost);
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }


    public static void main(String[] args){
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
