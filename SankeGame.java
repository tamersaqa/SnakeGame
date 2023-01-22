/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sankegame;

/**
 *
 * @author tamer
 */
import java.awt.EventQueue;
import javax.swing.JFrame;

public class SankeGame extends JFrame{

    /**
     * @param args the command line arguments
     */
    public SankeGame() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> {
            JFrame ex = new SankeGame();
            ex.setVisible(true);
        });
        
    }
    
}
