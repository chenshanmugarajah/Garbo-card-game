package garbogame;
import java.util.*;

public class Garbogame {
    
    public static String[][] board = new String[4][4];

    public static void createBoard(String[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = "" + r + "" + c;
            }
        }
    };
    
    public static void showBoard(String[][] board) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n");
        for (int r = 3; r > -1; r--) {
            System.out.print(r + "|");
            
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(" " + board[r][c]);
            }
            System.out.print("\n");
        }
        
        System.out.print("\nEnter card: ");
        
        String card = input.nextLine();
        
        System.out.print("Enter row (row 0-3): ");
        int row = input.nextInt();
        
        System.out.print("Enter column (row 0-3): ");
        int column = input.nextInt();
        
        userPlace(card, row, column);
    }
    
    public static void userPlace(String card, int row, int column) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = "" + r + "" + c;
            }
        }
        board[row][column] = card;
        showBoard(board);
    }
    
    public static void main(String[] args) {
        createBoard(board);
        showBoard(board);
    } 
}

class card {
    private String cardName;
    private String rank;
    private String suit;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        cardName = "" + suit + "" + rank;
        return cardName;
    }
    
    
}
