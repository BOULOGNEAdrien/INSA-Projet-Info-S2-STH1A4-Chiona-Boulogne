/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noeud;

/**
 *
 * @author Alex
 */
public class NoeudSimple {
    
    private double px;
    private double py;
    
    public NoeudSimple(double px,double py){
        this.px = px;
        this.py = py;
        
    }
    
    @Override
    public String toString(){
    
        return "("+this.px+";"+this.py+")";
    }
    
    public double getPx(){
       return this.px;
    }
    public double getPy(){
       return this.py;
    }
      public void setPx(double px){
      this.px = px;
    }
    public void setPy(double py){
      this.py =py;
    }
    
    public double angle(NoeudSimple a,NoeudSimple b){
        Double res;
        
        double num = (a.px - this.px)*(b.px - this.px) + (a.py - this.py)*(b.py - this.py) ;
        double den = Math.pow(Math.pow(a.px - this.px,2)+Math.pow(a.py - this.py,2),1/2)*Math.pow(Math.pow(b.px - this.px,2)+Math.pow(b.py - this.py,2),1/2);
        res = Math.acos(num/den);
        return res;
    }
public static void testAngle(){
   NoeudSimple po= new NoeudSimple(1,0);
   NoeudSimple p1= new NoeudSimple(2,0);
   NoeudSimple p2= new NoeudSimple(1,1);
   System.out.println(po.angle(p1, p2));
}
public static void main(String[] args){
    
}
}
