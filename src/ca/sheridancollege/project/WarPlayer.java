package ca.sheridancollege.project;
import java.util.ArrayList;

public class WarPlayer extends Player
{

   private GroupOfCards cards;

   public WarPlayer (String name)
   {
      super(name);
      cards = new GroupOfCards(26);
   }

   public void takeCard (CompleteCard c)
   {
      cards.addCard(c);
   }

   public void takeCards (ArrayList<CompleteCard> c)
   {
      cards.addCards(c);
   }

   public int handSize ()
   {
      return cards.getSize();
   }

   public CompleteCard showTopCard ()
   {
      return cards.getAndRemove();
   }

   public ArrayList<CompleteCard> getCards ()
   {
      return cards.showCards();
   }

   public CompleteCard move ()
   {
      if (cards.getSize() > 0) {
         return showTopCard();
      }
      return null;
   }

}
