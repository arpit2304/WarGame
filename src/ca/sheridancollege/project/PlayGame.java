package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;
public class PlayGame extends Game
{

   public PlayGame (String name)
   {
      super(name);
   }

   public void play ()
   {

      WarPlayer p1 = players.get(0);
      WarPlayer p2 = players.get(1);
      GroupOfCards deck = new GroupOfCards(52);

      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 13; j++) {
//                System.out.println(j + " " + i);
            deck.addCard(new CompleteCard(j, i));
         }
      }
//        System.out.println(deck.getSize());
//        for(CompleteCard c: deck.showCards()) {
//            System.out.println(c);
//        }
      deck.shuffle();
      for (CompleteCard c : deck.showCards()) {
         System.out.println(c);
      }
      System.out.println("-----------1--------------");
      for (int i = 0; i < deck.getSize() / 2; i++) {

         p1.takeCard(deck.getAndRemove());

         p2.takeCard(deck.getAndRemove());

      }
      for (CompleteCard c : p1.getCards()) {
         System.out.println(c);
      }
      System.out.println("--------------------2-----------");
      for (CompleteCard c : p2.getCards()) {
         System.out.println(c);
      }
      while (true) {
         if (p1.handSize() == 0 || p2.handSize() == 0) {
            break;
         }
         CompleteCard c1 = p1.move();
         CompleteCard c2 = p2.move();
         System.out.println("-----------------------------------------------------");
         System.out.println(p1.getPlayerID() + " got " + c1 + " card  " + p1.handSize());
         System.out.println(p2.getPlayerID() + " got " + c2 + " card  " + p2.handSize());
         if (c1.compare(c2) > 0) {
            p1.takeCard(c1);
            p1.takeCard(c2);
            System.out.println(p1.getPlayerID() + " wins this round!");
         }
         else if (c1.compare(c2) < 0) {
            p2.takeCard(c1);
            p2.takeCard(c2);
            System.out.println(p2.getPlayerID() + " wins this round!");
         }
         else {
            System.out.println("War!!!!");
            ArrayList<CompleteCard> temp = new ArrayList();
            temp.add(c1);
            temp.add(c2);
            while (true) {
               for (int i = 0; i < 3; i++) {
                  if (p1.handSize() == 0 || p2.handSize() == 0) {
                     break;
                  }
                  temp.add(p1.move());
                  temp.add(p2.move());
               }
               if (p1.handSize() == 0 || p2.handSize() == 0) {
                  break;
               }
               System.out.println("3 cards are faced down by both players\nIt's War Card");
               CompleteCard w1 = p1.move();
               CompleteCard w2 = p2.move();
               System.out.println(p1.getPlayerID() + " got " + w1 + "for war card");
               System.out.println(p2.getPlayerID() + " got " + w2 + "for war card");
               temp.add(w1);
               temp.add(w2);
               if (w1.compare(w2) > 0) {
                  p1.takeCards(temp);
                  System.out.println(p1.getPlayerID() + " won the war!");
                  temp.clear();
                  break;
               }
               else if (w1.compare(w2) < 0) {
                  p2.takeCards(temp);
                  System.out.println(p2.getPlayerID() + " won the war!");
                  temp.clear();
                  break;
               }
               else {
                  System.out.println("Again War!!!");
               }
            }
         }
      }
      if (p1.handSize() == 0) {
         System.out.println(p2.getPlayerID() + " wins the match!! --------------");
      }
      else {
         System.out.println(p1.getPlayerID() + " wins the match!! --------------");
      }
   }

   public static void main (String[] args)
   {
      Game g = new PlayGame("War");
      ArrayList<WarPlayer> p = new ArrayList();
      Scanner scan = new Scanner(System.in);
      System.out.println("Player 1 Name:");
      p.add(new WarPlayer(scan.nextLine()));
      System.out.println("Player 2 Name:");
      p.add(new WarPlayer(scan.nextLine()));
      g.setPlayers(p);
      ((PlayGame) g).play();
   }
}
