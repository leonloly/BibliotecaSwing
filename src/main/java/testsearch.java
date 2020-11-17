
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import view.JFSearch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moi
 */
public class testsearch {

    List<Object> params;

    void response(List<Object> params) {
        System.out.println("testsearch.response()");
    }

    void call() {
        JFSearch js = new JFSearch("Select * from paises", null, JFSearch.MULTIPLE);
        js.setVisible(true);
        js.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e); //To change body of generated methods, choose Tools | Templates.
                 params = JFSearch.selected;

            }

            

        });
    }

    public static void main(String[] args) {
        testsearch s = new testsearch();
        s.call();
    }

}
