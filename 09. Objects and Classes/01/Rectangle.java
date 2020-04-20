/*
  By: Ahmed Moustafa
  E-mail: geekahmed1@gmail.com
 */

            //UML Class Diagram                     
/***************************************************
*               Rectangle                          *  
* ------------------------------------------------ *  
* -width: double                                   *
* -height: double                                  * 
* +Rectangle()                                     *  
* +Rectangle(width: double, height: double)        *
* +getArea(): double                               *
* +getPerimeter(): double                          *
***************************************************/


public class Rectangle {
    private double width ;
    private double height;
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){return width * height;}
    public double getPerimeter(){return 2 * (width + height) ;}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
