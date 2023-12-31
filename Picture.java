/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Javel Chalas
 * @version 2023.09.02
 * 
 * a bald person with shoes comes back home with their date; a person with 
 * hair (afro) but no shoes
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person man;
    private Person date;
    private Square grass;
    private Square sky;
    private Circle head;
    private Square Rshoe;
    private Square Lshoe;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        man = new Person();
        date = new Person();
        grass = new Square();
        sky = new Square();
        head = new Circle();
        Lshoe = new Square();
        Rshoe = new Square();
    
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {

            sky.changeColor("blue");
            sky.moveVertical(-100);
            sky.moveHorizontal(-355);
            sky.changeSize(1000);
            sky.makeVisible();
            
        
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("white");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            grass.changeColor("green");
            grass.moveHorizontal(-350);
            grass.moveVertical(120);
            grass.changeSize(1000);
            grass.makeVisible();
            
            
            man.changeColor("blue");
            man.moveHorizontal(-20);
            man.moveVertical(10);
            man.makeVisible();
            
            head.changeColor("yellow");
            head.moveHorizontal(55);
            head.moveVertical(87);
            head.changeSize(15);
            head.makeVisible();
            
            date.changeColor("black");
            date.moveHorizontal(10);
            date.moveVertical(10);
            date.makeVisible();
            
            Lshoe.changeColor("black");
            Lshoe.moveHorizontal(-65);
            Lshoe.moveVertical(115);
            Lshoe.changeSize(10);
            Lshoe.makeVisible();
            
            Rshoe.changeColor("black");
            Rshoe.moveHorizontal(-42);
            Rshoe.moveVertical(115);
            Rshoe.changeSize(10);
            Rshoe.makeVisible();
            
            
            
            
            
            
            
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("white");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        sky.changeColor("black");
        man.changeColor("black");
        date.changeColor("black");
        Lshoe.changeColor("black");
        Rshoe.changeColor("black");
        grass.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("greem");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        grass.changeColor("green");
        sky.changeColor("blue");
        date.changeColor("red");
        man.changeColor("blue");
        Lshoe.changeColor("black");
        Rshoe.changeColor("black");
        
        
        
    }
}
