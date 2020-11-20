package br.unip.cc.trabalho; 

import static br.unip.cc.trabalho.Sort.getArrayIma;
import static br.unip.cc.trabalho.Sort.getArrayInt;
import static br.unip.cc.trabalho.Sort.getnElemsIma;
import static br.unip.cc.trabalho.Sort.getnElemsInt;
import static br.unip.cc.trabalho.Sort.swapIma;
import static br.unip.cc.trabalho.Sort.swapInt;
import javax.swing.JOptionPane; 

public class BubbleSort extends Sort { 
    private static int out;
    private static int in; 
    private static long count; 
    
    public static void bubbleSortIma() { 
        for(out = getnElemsIma() - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) { 
                if(getArrayIma(in).getWidth() > getArrayIma(in + 1).getWidth()) 
                    swapIma(in, in + 1);
                ++count; 
            } 
            ++count; 
        } 
        JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Bubble Sort", JOptionPane.INFORMATION_MESSAGE); 
        count = 0; 
    } 
    
    public static void bubbleSortInt() { 
        for(out = getnElemsInt() - 1; out > 1; out--) { 
            for(in = 0; in < out; in++) {
                if(getArrayInt(in) > getArrayInt(in + 1))
                    swapInt(in, in + 1); 
                ++count; 
            } 
            ++count;
        } 
        JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Bubble Sort", JOptionPane.INFORMATION_MESSAGE);
 
 count = 0; 
    } 
}
