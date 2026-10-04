package exercice8;

public class Wall {
    double width,height;
    public Wall(){
        width = 0;
        height = 0;
    }
    public Wall(double w,double h){
        if (w <= 0){
            this.width = 0;
        }
        else {
            this.width = w;
        }
        if (h <= 0){
            this.height = 0;
        }
        else {
            this.height = h;
        }
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double w){
        if (w <= 0){
            this.width = 0;
        }
        else {
            this.width = w;
        }
    }
    public void setHeight(double h){
        if (h <= 0){
            this.height = 0;
        }
        else {
            this.height = h;
        }
    }
    public double getArea(){
        return this.width * this.height;
    }

    public static void main(String[] args){
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
