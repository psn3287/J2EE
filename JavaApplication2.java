/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication2;
import java.io.* ; 
import java.util.Random;
/**
 *
 * @author Pritish
 */
//public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World Program");
    }*/
    
    
    
//}
interface Shape{
   public void display(); 
   abstract public void calculateArea();
}
interface Shape2{
   public void display(); 
   abstract public void calculateArea2();
}

public class JavaApplication2 implements Shape, Shape2, Runnable {
     int  value1;
      int  value2;
      int value5;
      JavaApplication2(){
         value1 = 10;
         value2 = 20;
         System.out.println("Inside Constructor");
     } 
      JavaApplication2(int a){
      value5 = a;
      System.out.println("Inside 2nd Constructor");
    }
      public void run() {
    }
    
    public static void main(String args[]) throws IOException{
        JavaApplication2 obj = new JavaApplication2();
        JavaApplication2 obj1 = new JavaApplication2(40);
        obj.display();
        obj.calculateArea2();
        obj1.calculateArea2();
      
        //Custom Exception Example
        DemoChild d1 = new DemoChild();
          d1.display();
        //obj.b=200;
        try{
          throw new MyException(2);
         // throw is used to create a new exception and throw it.
          }
         catch(MyException e){
            System.out.println(e) ;
         }
        
        //Throws IOException in main
        try{
           FileWriter file = new FileWriter("D:\\Data1.txt");
           file.write("Guru99");
           file.close();
        }
        catch(IOException i){
            System.out.println(i) ;
        }
      
        //Random Number Example
        Random objGen = new Random();
        for (int z=0; z < 3; z++)
        {
            int randomNumber = objGen.nextInt(100) ; 
            System.out.println("Random No : " + randomNumber); 
        }
      
      //Threading Example
        Thread guruthread1 = new Thread();
          guruthread1.start();
          try {
              guruthread1.sleep(1000);
          } catch (InterruptedException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
          guruthread1.setPriority(2);
          int gurupriority = guruthread1.getPriority();
          System.out.println(gurupriority);
          System.out.println("Thread Running... multithreading starts now.. ");
          
          GuruThread3 threadguru1 = new GuruThread3("guru1");
            threadguru1.start();
            GuruThread3 threadguru2 = new GuruThread3("guru2");
            threadguru2.start();
      
  }
  public void calculateArea(){
      System.out.println("Output");
  }
  public void calculateArea2(){
      System.out.println("Output2");
  }
   public void display(){
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    }
}
class DemoChild extends JavaApplication2{
    int value3;
    int value4;
    DemoChild(){
    super(5);
     value3 = 3;
     value4 = 4;
    System.out.println("Inside the Constructor of Child");
    }
    public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
      System.out.println("Value1 === "+value3);
      System.out.println("Value2 === "+value4);
      System.out.println("Value5 === "+value5);
   }
}
class MyException extends Exception{
   int a;
   MyException(int b) {
     a=b;
   }
   public String toString(){
     return ("Exception Number =  "+a) ;
  }
}

class GuruThread3 implements Runnable {
 Thread guruthread;
 private String guruname;
 GuruThread3(String name) {
  guruname = name;
 }
 @Override
 public void run() {
  System.out.println("Thread running" + guruname);
  for (int i = 0; i < 4; i++) {
   System.out.println(i);
   System.out.println(guruname);
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    System.out.println("Thread has been interrupted");
   }
  }
 }
 public void start() {
  System.out.println("Thread started");
  if (guruthread == null) {
   guruthread = new Thread(this, guruname);
   guruthread.start();
  }

 }
}