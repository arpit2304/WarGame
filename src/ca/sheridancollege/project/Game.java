/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public abstract class Game
{
   private final String gameName;//the title of the game
   protected ArrayList<WarPlayer> players;// the players of the game

   public Game (String givenName)
   {
      gameName = givenName;
      players = new ArrayList();
   }

   /**
    * @return the gameName
    */
   public String getGameName ()
   {
      return gameName;
   }

   /**
    * @return the players of this game
    */
   public ArrayList<WarPlayer> getPlayers ()
   {
      return players;
   }

   /**
    * @param players the players of this game
    */
   public void setPlayers (ArrayList<WarPlayer> players)
   {
      this.players = players;
   }

   /**
    * Play the game. This might be one method or many method calls depending
    * on your game.
    */
   public abstract void play ();

   /**
    * When the game is over, use this method to declare and display a winning
    * player.
    */
//    public abstract void declareWinner();



}//end class

