import java.util.*;
import java.lang.*;
class E{
    int e;
    D dObj;
    public E(int e){
        this.e = e;
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
        return ("E: " + this.e);
    }
    public void setE(int e){
        this.e = e;
    }
    public int getE(){
        return this.e;
    }
}