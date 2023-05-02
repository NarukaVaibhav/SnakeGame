import javax.swing.*;
import java.awt.event.ActionListener;

public class SnakeGame extends JFrame  {
    Board board;
    SnakeGame(){
        board = new Board();
        add(board);
        //pack the parent component to the board.
        pack();
        //Resizable must be false because we cannot change the size of bord here.
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {

        // Initialize the snake game

        SnakeGame snakeGame = new SnakeGame();

    }
}