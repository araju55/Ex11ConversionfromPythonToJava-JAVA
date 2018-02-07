/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner
/**
 *
 * @author Joseph
 */
public class Ex11ConversionfromPythonToJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      int coins
      
      System.out.print("Enter the amount to be paid in pence: ");
      int bill = kb.nextInt();
      
      System.out.print("Enter the money received in pence: ");
      int customer = kb.nextInt();
      
      int change = customer - bill;
      System.out.print("Change: " + change);
      
      if (change >= 200)
      {
              coins = change / 200;
              change = change / 200;
              System.out.print("200p Coins: " + coins);
      }
       
      if (change >= 100)
      {    
              coins = change / 100;
              change = change / 100;
              System.out.print("100p Coins: " + coins);
      }
      
      if (change >= 50)
      {      
          coins = change / 50;
          change = change / 50;
          System.out.print("50p Coins: " + coins);
      }
      
      if (change >= 20)
      {    
              coins = change / 20;
              change = change / 20;
              System.out.print("20p Coins: " + coins);
      }
      
      if (change >= 10)
      {    
              coins = change / 10;
              change = change / 10;
              System.out.print("10p Coins: " + coins);
      }
      
      if (change >= 5)
      {    
              coins = change / 5;
              change = change / 5;
              System.out.print(" 5p Coins: " + coins);
      }
      
      if (change >= 2)
      {    
              coins = change / 2;
              change = change / 2;
              System.out.print("2p Coins: " + coins);
      }
      
      if (change >= 1)
      {    
              System.out.print("1p Coins: " + coins);
      }
 
    
      
