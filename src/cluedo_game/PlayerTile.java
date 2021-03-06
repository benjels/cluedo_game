package cluedo_game;

/**
 * A Tile representation of a player. Should be passed an icon unique to the
 * players character
 * 
 * @author Tim
 * 
 */
public class PlayerTile extends Tile {

 private String icon;
 private CharacterCard.Character character;

 public PlayerTile(CharacterCard.Character character, String icon, int x,
   int y) {
  super(x, y);
  this.icon = icon;
  this.setCharacter(character);
 }

 public PlayerTile(CharacterCard.Character character) {
  this(character, String.valueOf(character.getIcon()), character.getXStart(),
    character.getYStart());
 }

 public String getIcon() {
 
  return String.valueOf(character.getIcon());
 }

 public CharacterCard.Character getCharacter() {
  return character;
 }

 public void setCharacter(CharacterCard.Character character) {
  this.character = character;
 }
}