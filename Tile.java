/*=====================================
  class Tiles
  represents each tile of the game board
  =====================================*/

public abstract class Tile {

    //Instance Variables
    protected String _type;
    protected int _length;
    protected String _face;
    protected boolean _isFaceUp;
    
    //Default constructor
    //default tile on a board represents water
    public Tiles() {
	_type = "water";
	_length = 1;
	_face = "-W-";
	_isFaceUp = false;
    }

    //Constructor
    public Tiles( String type, int length, String value ) {
	this();
	_type = type;
	_length = length;
	_face = value;
    }

    //Methods

    public boolean isFaceUp() {
	return _isFaceUp;
    }

    public void flip() {
	_isFaceUp = !_isFaceUp;
    }

    public String toString() {
	if( isFaceUp() )
	    return _face;
	else
	    return "-W-";
    }

}