package ca.sheridancollege.project;


public class CompleteCard extends Card
{
   private int rank;
   private int suit;

   public CompleteCard (int r, int s)
   {
      rank = r;
      suit = s;
   }

   public int getRank ()
   {
      return rank;
   }

   public String toString ()
   {
      return ((Rank.values()[rank]).name() + " " + (Suit.values()[suit]).name());
   }

   public int compare (CompleteCard c)
   {
      return (rank - c.getRank());
   }

   public enum Rank
   {
      DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
   }

   public enum Suit
   {
      CLUBS, DIAMONDS, HEARTS, SPADES;
   }
}
