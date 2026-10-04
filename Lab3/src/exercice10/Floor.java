package exercice10;

public class Floor {
    double width,length ;
    public Floor(double w,double h){
        if (w <= 0){
            this.width = 0;
        }
        else {
            this.width = w;
        }
        if (h <= 0){
            this.length = 0;
        }
        else {
            this.length = h;
        }
    }
    public double getArea(){
        return this.width * this.length;
    }
}
