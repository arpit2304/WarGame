/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards
{

   //The group of cards, stored in an ArrayList
   private ArrayList<CompleteCard> cards;
//    private int size;//the size of the grouping

   public GroupOfCards (int givenSize)
   {
//        size = givenSize;
      cards = new ArrayList(givenSize);
   }

   /**
    * A method that will get the group of cards as an ArrayList
    *
    * @return the group of cards.
    */
   public ArrayList<CompleteCard> showCards ()
   {
      return cards;
   }

   public CompleteCard getIndex (int i)
   {
      return cards.get(i);
   }

   public void shuffle ()
   {
      Collections.shuffle(cards);
   }

   /**
    * @return the size of the group of cards
    */
   public int getSize ()
   {
      return cards.size();
   }

   /**
    * @param givenSize the max size for the group of cards
    */
//    public void setSize(int givenSize) {
//        size = givenSize;
//    }

   public void addCard (CompleteCard c)
   {
      cards.add(c);
//        size += 1;
   }

   public void addCards (ArrayList<CompleteCard> c)
   {
      cards.addAll(c);
   }

   public CompleteCard getAndRemove ()
   {
      if (cards.size() > 0) {
         CompleteCard c = cards.get(0);
         cards.remove(0);
//            size -= 1;
         return c;
      }
      return null;
   }

   public void setCards (ArrayList<CompleteCard> cards)
   {
      this.cards = cards;
//        this.size = cards.size();
   }
}//end class
