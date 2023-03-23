import javax.swing.JOptionPane;
@SuppressWarnings("serial")
public class EmBrancoException extends Exception {
    EmBrancoException(){
        JOptionPane.showMessageDialog(null, "TENTE NOVAMENTE");
    }
}
