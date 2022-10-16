public class Cells {

    private int size;
    private int upperLeftX;
    private int upperLeftY;

    private int row;

    private int column;


    //private boolean alive; //when true, square is white, when flase, square is black

    private boolean alive;

    private Rules rules;



    public Cells(int size, int upperLeftX, int upperLeftY, int row, int column, boolean alive, Rules rules){ //boolean alive as last parameter
        this.size = size;
        this.upperLeftX = upperLeftX;
        this.upperLeftY = upperLeftY;
        this.row = row;
        this.column = column;
        this.alive = alive;
        this.rules = rules;
    }

    public void spawnCells() {
        if (alive) {
            Main.app.fill(255); //white
        } else {
            Main.app.fill(0); //black
        }
        Main.app.rect(upperLeftX, upperLeftY, size, size);
        Main.app.stroke(0);

    }

    public void handleMouseClicked(int inputX, int inputY) {
        if (inputX > upperLeftX && inputX < (upperLeftX + size) &&
                inputY > upperLeftY && inputY < (upperLeftY + size)){
            alive = !alive;
        }
        spawnCells();
    }

    //need a getter for boolean, row, and column
    //need a setter for them as well
    //it's at times like these when i feel as though im very dumb



}

