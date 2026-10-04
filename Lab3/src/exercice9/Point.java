package exercice9;

public class Point {
    int x,y;
    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.pow(this.x*this.x + this.y*this.y,0.5); // x-0 = x the same for y and 0.5 is the power for distance
    }
    public double distance(Point p){
        return Math.pow((this.x - p.getX())*(this.x - p.getX()) + (this.y - p.getY())*(this.y - p.getY()),0.5);
    }


    public double distance(int x,int y){
        return Math.pow((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y),0.5);
    }
}
