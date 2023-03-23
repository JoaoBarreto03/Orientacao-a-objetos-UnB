import javax.swing.JOptionPane;

public class NaoEncontradoException extends Exception{
    public NaoEncontradoException(){
        JOptionPane.showMessageDialog(null, "NÂO ENCONTRADO!");
    }
}
