/* [;=']
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author Arpit Soni
 */
public class CompleteCardTest
{

   public CompleteCardTest ()
   {
   }

   /**
    * Test of getRank method, of class CompleteCard.
    */
//   @Test
//   public void testGetRank ()
//   {
//      System.out.println("getRank");
//      CompleteCard instance = null;
//      int expResult = 0;
//      int result = instance.getRank();
//      assertEquals(expResult, result);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }
//
//   /**
//    * Test of toString method, of class CompleteCard.
//    */
//   @Test
//   public void testToString ()
//   {
//      System.out.println("toString");
//      CompleteCard instance = null;
//      String expResult = "";
//      String result = instance.toString();
//      assertEquals(expResult, result);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }
//
////   /**
////    * Test of compare method, of class CompleteCard.
////    */
//   @Test
//   public void testCompare ()
//   {
//      System.out.println("compare");
//      CompleteCard c = null;
//      CompleteCard instance = null;
//      int expResult = 0;
//      int result = instance.compare(c);
//      assertEquals(expResult, result);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }
   @Test
   public void testCompareGood ()
   {
      System.out.println("Compare Good");
      CompleteCard c = new CompleteCard(1, 3);
      CompleteCard a = new CompleteCard(2, 4);
      boolean exprResult = false;
      boolean result;
      if (a.compare(c) > 0) {
         result = false;
      }
      else {
         result = true;
      }
      assertEquals(result, exprResult);
   }

   @Test
   public void testCompareBad ()
   {
      System.out.println("Compare Bad");
      CompleteCard c = new CompleteCard(1, 3);
      CompleteCard a = new CompleteCard(2, 4);
      boolean exprResult = true;
      boolean result;
      if (a.compare(c) < 0) {
         result = false;
      }
      else {
         result = true;
      }
      assertEquals(result, exprResult);
   }

   @Test
   public void testCompareBoundary ()
   {
      System.out.println("Compare Boundary");
      CompleteCard c = new CompleteCard(1, 3);
      CompleteCard a = new CompleteCard(1, 4);
      boolean exprResult = false;
      boolean result;
      if (a.compare(c) == 0) {
         result = false;
      }
      else {
         result = true;
      }
      assertEquals(result, exprResult);
   }
}
