import java.util.*;
import java.lang.*;
class F{
    int f;
    public F(int f){
        this.f = f;
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
        return ("F: " + this.f);
    }
    public void setF(int f){
        this.f = f;
    }
    public int getF(){
        return this.f;
    }
}