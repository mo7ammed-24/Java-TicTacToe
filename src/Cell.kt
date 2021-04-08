class Cell {
    //This is one cell of the game grid
    private var contents = " "  //make contents private
    var empty = true
    fun output()=contents  // using compact function
    fun placeMark() {
        if(TicTacToe.count % 2 == 0) contents = "X" else contents = "O" //using if and else in one line
        empty = false }
}