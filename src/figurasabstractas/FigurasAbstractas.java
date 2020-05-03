/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasabstractas;

/**
 *
 * @author Idalia
 */
public class FigurasAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Triangulo t = new Triangulo();
//        Circulo c = new Circulo();
//        t.setAltura(5);
//        t.setBase(2);        
//        System.out.println(t.calcularArea());
//        
//        c.setRadio(3);
//        System.out.println(c.calcularArea());

//          Triangulo t = new Triangulo(5, 2);
//          Circulo c = new Circulo(4);
//          
//          System.out.println(t.calcularArea());

          Figura f0 = new Triangulo(5, 2);//polimorfismo
          Figura f1 = new Circulo(4);
          
          Figura[] fs = new Figura[2];
          fs[0] = f0;
          fs[1] = f1;
          
          double total = 0;
          for(Figura f : fs){
              total += f.calcularArea();
          }
          
          System.out.println("Area total= "+ total);
    }
    
    
}
