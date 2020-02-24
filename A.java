import java.util.*;
import java.lang.*;
class A{
    String a;
    B bObj;
    F fObj;
    public A(String a){
        this.a = a;
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
        return ("A: " + a + "\n" + bObj.toString() + fObj.toString());
    }

}