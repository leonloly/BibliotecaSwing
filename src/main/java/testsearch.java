
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

    List<Object[]> params;

    void call() {
        JFSearch js = new JFSearch("select * from (select a.codigo,a.nombre as autor, p.nombre as pais from autores a  join paises p  on p.codigo = a.codigo_pais) as t", null, JFSearch.MULTIPLE);
        js.setVisible(true);
        js.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
                params = JFSearch.selected;

            }
        });
    }

    public static void main(String[] args) {
        testsearch s = new testsearch();
        s.call();
    }

}
