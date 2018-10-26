/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package HelloWorld;

/**
 *
 * @author Pritish
 */
public class HelloWorld {

    public static void main(String args[]) {
        System.out.println("Inside HelloWorld");
        
        Book a = new Book();
        a.setBookName("Think & Grow");
        
        System.out.println(a.getBookName());
    }
 
}

class Book{
 String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
 


}
