package crm;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CRM {

    public static void main(String[] args) {
        // TODO code application logic here
        Login frame = new Login();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
    }
    
}
