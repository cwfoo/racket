package draw;
        
public abstract class World {

    Canvas theCanvas = new Canvas(); 

    public native boolean bigBang(double s); 
    
    public native boolean endOfTime();
    
    public native World endOfWorld();

    public native World lastWorld();

    public abstract World onTick();

    public abstract World onKeyEvent(String ke); 

    public abstract boolean draw();

    public abstract boolean erase();
}    
