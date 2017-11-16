/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Maxine
 */

class Book implements Comparable<Book> {

    int id;
    
    String name, author, publisher;
    
    int quantity;
    
public Book(int id, String name, String author, String publisher, int quantity) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.quantity = quantity;
}
public int compareTo(Book b) {
    if(id>b.id){
        return 1;
    } else if(id<b.id) {
        return -1;
    } else {
        return 0;
    }
}
}

public class TreeSetCollections2 {
    
    public static void main(String args[]) {
    
        Set<Book> set = new TreeSet<>();
        
        // Create books
        Book b1 = new Book(100, "The Lord of the Rings", "C.S. Lewis", "Good Books", 3);
        Book b2 = new Book(101, "The Hobbit", "C.S. Lewis", "Good Books", 3);
        Book b3 = new Book(102, "Harry Potter and the Goblet of Fire", "J.K. Rowling", "Fun Publishers", 5);
        Book b4 = new Book(103, "Harry Potter and the Order of the Phoenix", "J.K. Rowling", "Fun Publishers", 5);
        
        // Add books to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        
        // Iterate through the TreeSet
        for(Book b:set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
