import java.util.*;
import java.lang.*;
class B{
    int b;
    public B(int b){
        this.b = b;
    }
    public Object clone() {
        try{ 
            return super.clone();
        }
        catch (CloneNotSupportedException e){
           // This shouldn't happen, since we are Cloneable
           return null;
        }
    }
    public String toString() {
        return ("B: " + this.b);
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return this.b;
    }
}