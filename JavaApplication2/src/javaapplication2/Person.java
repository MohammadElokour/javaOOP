/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Elokour
 */
public class Person {
   static int instanceCounter = 0;
   int counter = 0;
   String firstName = "Sonia";
   String lastName = "Kaboor";
   String address = "Bollywood";
   int dateOfBirth = 1980;
   String nationality = "Indian";
   String city = "Mombi";
   int weight = 50;
   int height = 165;
   Boolean isMale = false;
  
   public Person() {
       instanceCounter++;
       counter = instanceCounter;
   }
   
   public Person(String firstName, String lastName, String address, int dateOfBirth, String nationality, String city, int weight, int height, Boolean isMale ) {
       instanceCounter++;
       counter = instanceCounter;
       this.firstName = firstName;
       this.lastName = lastName;
       this.address = address;
       this.dateOfBirth = dateOfBirth;
       this.nationality = nationality;
       this.city = city;
       this.weight = weight;
       this.height = height;
       this.isMale = isMale;
   }
   
   public void getFullName() {
       System.out.println(firstName + " " + lastName);
   }
   
   public double getHeightInFeet() {
       return height*0.032808;
   }
   
   public int getAge() {
       return 2019 - dateOfBirth;
   }
   
   public void eating() {
        System.out.println("I'm eating!");
        weight = weight + 1;
   }
   public String getInfo() {
       return counter + "\n" + firstName + "\n" + lastName + "\n" + address + "\n" + dateOfBirth + "\n" + nationality + "\n" + city + "\n" + weight + "\n" + height + "\n" + isMale;
   }
   
   public void main() {
       Person iman = new Person( "Iman", "Elokour", "Jordan", 1998, "Jordanain American", "Amman", 60 , 170 , false);
       Person mohd = new Person( "Mohammad", "Elokour", "Jordan", 1996, "Jordanain American", "Amman", 80 , 180 , true);
       Person yasser = new Person( "Yasser", "Kasem", "Jordan", 1993, "Sirian", "Irbid", 70 , 170 , true);
       Person ayman = new Person ( "Ayman", "Hareere", "Jordan", 1988, "Sirian", "Amman", 70 , 180 , true);
       Person[] PersonsArray = {iman, mohd, yasser, ayman};
       ayman.getInfo();
   }

}
