package br.unip.cc.trabalho;
import br.unip.cc.trabalho.JMenuFrame;
import java.awt.EventQueue; 
public class Principal{
    @SuppressWarnings("unused")
    public static void main(String[] args){ 
        EventQueue.invokeLater(new Runnable(){
            public void run() 
            { 
                try { 
                    JMenuFrame frame = new JMenuFrame();
                } catch (Exception e) {
                    e.printStackTrace(); 
                } 
            } 
        });
    } 
}
