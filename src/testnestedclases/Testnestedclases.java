
package testnestedclases;
import static java.lang.System.out;
public class Testnestedclases {
public static void main(String[] args) {
        //a.h.class. alot of methods 
        // what are this methods
//        a y = new a (); 
//       a.h t = new a.h (9);    //  objct of  class h
//      
//          a.h.o=7;
//          t.setw(6);
//      y.new k();
//        
//         t.v=5;
//         t.o=7;
//       // a.h.n=67; n is private
//       
//     //y.h.o=8;  compile srror  objects have no acsess to the nested static class
//     
//    // a.l p = new a.l (); error private acses of l

a r = new a();
//r.c=8; error c have private acsses 
// System.out.println(a.c); c is private 
System .out.println("the value of c now is "+ 0 );

System.out.println("the value of p now is "+ a.b);
System.out.println("the valu of q now is"+ a.q);
System.out.println("____________________________________");
a.q=8;

//a.h u = new a.h (5);  // new object of static nested class h of containg class a
//u.setw(5, 5, 5); 
  System.out.println("the value of p now is "+ a.b);
System.out.println("the valu of c now is"+ a.q);
System.out.println("____________________________________");
// nested class class have acssess to static and ststic only variables and methods
// of the containg class within metode of course not withon variables of nested of course
//_________________________________________________________________________________________
//wl aks sa7e7 countaing class have acsses to ststic and ststic only varible and methodes
// of its nested class
a.h.o=7;  // a outer class have acsses to o static varible of its nested class h
// basecally a.h is the full name of class h outer a  so when we say a.h.o like we
// say h.o but outside a we must call h by its full name a.h . or by object of h
a.h.seto(6);
a.h.setw(4,4,4);
System.out.println("the value of p now is "+ a.b);
System.out.println("the valu of c now is"+ a.q);
//u.seto(7); // u can reach to any thing in the class h ( static thing or  non static thing 
// by using object of h it slef considerable with acsses modifiers
//a.k varr = new a.k (); error 
a.players var =r.new players();
a.players var2;
var2=r.new players();
r.new players ().name="hisham"; // اوبيجكت مجهول الاسم
out.println("out only"); // import static vaible of an class by import static
a.players player1= new a().new players(); // تعريف اوبيجكبت من كيه في خطوة واحداة
a.players player2= new a().new players(); 
//System.out.println(new a().k.xx); error why ??????
System.out.println(new a().new players().number_of_hands);
player1.name="ahmed";
player1.u=87;
player1.v=67;
player2.name="mohamed";
player2.u=67;
player2.v=67;
a fg= new a(){}; // اوبجيكت من كلاس ملوش اسم بياكستند ايه
a tyt = new a(){
scintests hosam = new scintests ();


public void asd(){
    
    System.out.println("امال حلمي المكنة");
}



};
new a(){
    
    public void asd(){
    
    System.out.println("امال حلمي المكنة");
}
    
    
}.asd();


    }
 
   
}
