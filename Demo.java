/*
   CIS 112 Final Presentation
   Demo Program for doubly linked version of SetOfStacks
   Shawn Dutill
   Sean Fitzpatrick
*/


import java.util.Random;

public class Demo
{
   public static void main(String[] args)
   {
      Random random = new Random();
      SetOfStacks<Integer> numbers = new SetOfStacks<Integer>();
      
      System.out.println("Adding 11 random numbers to our SetOfStacks: ");
      for (int i = 0; i < 11; i++)
      {
         numbers.push( random.nextInt(100) );
      }
      
      System.out.println();
      
      System.out.println("We can use pop() and top() like a normal stack...");
      System.out.println("top(): " + numbers.top() );
      System.out.println("calling pop()");
      numbers.pop();
      System.out.println("top(): " + numbers.top() );
      
      System.out.println();
      
      System.out.println("Adding 21 more random numbers");
      for (int i = 0; i < 21; i++)
      {
         numbers.push( random.nextInt(100) );
      }
      
      System.out.println();
      
      System.out.println("Calling popAt(10) 10 times...");
      for (int i = 0; i < 10; i++)
      {
         numbers.popAt( 10 );
      }
      
      System.out.println();
      
      System.out.println("top(): " + numbers.top() );
      System.out.println("Calling pop()");
      numbers.pop();
      System.out.println("top(): " + numbers.top() );
   }
}