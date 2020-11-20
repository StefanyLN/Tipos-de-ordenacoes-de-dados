package br.unip.cc.trabalho;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Arquivo {
  
    private String caminho;
    
    public String getCaminho(){
        return caminho;
    }
    
    public void setCaminho(String caminho){
        this.caminho = caminho;
    }
    
    public void buscar() throws EDadoInvalido{
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("png", "jpg", "gif", "tiff", "bmp", "jpeg");
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(fileNameExtensionFilter);
        fc.setDialogTitle("Escolha uma imagem");
        int resposta = fc.showOpenDialog(null);
        if(resposta == JFileChooser.CANCEL_OPTION);
        else 
            if(resposta == JFileChooser.APPROVE_OPTION)
                setCaminho(fc.getSelectedFile().getAbsolutePath());
    }
}
