import java.util.*;
import java.lang.*;
class D{
    int d;
    public D(int d){
        this.d = d;
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
        return ("D: " + this.d);
    }
    public void setD(int d){
        this.d = d;
    }
    public int getD(){
        return this.d;
    }
}