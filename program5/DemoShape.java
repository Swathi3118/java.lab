package program5;

class Circle implements Shape {
   public void draw()
   {
       System.out.println("Circle.draw() ...");
   }
   public void erase()
   {
       System.out.println("Circle.erase() ...");
   }
}


 class Triangle implements Shape {
       public void draw()
       {
           System.out.println("Triangle.draw() ...");
       }
       public void erase()
       {
           System.out.println("Triangle.erase() ...");
       }
       
   }


class Square implements Shape {
   public void draw()
   {
       System.out.println("Square.draw() ...");
   }
   public void erase()
   {
       System.out.println("Square.erase() ...");
   }
}

interface Shape {
   public void draw();
   public void erase();
}



public class DemoShape {

   public static void main(String[] args)
   {
       Shape shape; //Shape shape=new Circle() 
       
       shape = new Circle();
       shape.draw();
       shape.erase();
       
       shape = new Triangle();
       shape.draw();
       shape.erase();
       
       shape = new Square();
       shape.draw();
       shape.erase();
   }
}

