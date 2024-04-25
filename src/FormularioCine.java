import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FormularioCine {
    private JPanel principal;
    private JComboBox cboNombrePelicula;
    private JButton btnComprar;
    private JLabel txtAutor;
    private JTextField txtNumeroEntradas;
    private JTextArea pandaTextArea;
    private JTextArea rapidosTextArea;
    private JTextArea deadpoolTextArea;
    private JTextArea colaTextArea;
    private Cine peliculas=new Cine ();

    private Cine cola1=new Cine();
    private Cine cola2=new Cine();
    private Cine cola3=new Cine();

    public FormularioCine() {
        //No borre ni intente entender este código.
        try {
        String a="",b="";
        do {
            b= JOptionPane.showInputDialog("Ingrese su número de cédula real");
            a = JOptionPane.showInputDialog("Ingrese su nombre real");
        }while(b.length()<10);
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Taller1ProgramacionIII.dat"));
            o.writeObject(a+b);
        }catch (Exception ex) {

        }
        btnComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peliculas.encolar(cboNombrePelicula.getSelectedItem().toString(),Integer.parseInt(txtNumeroEntradas.getText()));
                colaTextArea.setText(peliculas.listarPeliculas());
                limpiarCampos();
                if (cboNombrePelicula.equals("KUNFU PANDA") ){
                    if (cola1.tamanio() <= 20){
                        pandaTextArea.setText(String.valueOf(peliculas.entradasDisponibles()));
                    } else {
                        JOptionPane.showMessageDialog(null,"NO HAY ENTRADA DISPONIBLES");
                    }
                }else if (cboNombrePelicula.equals( "RAPIDOS Y FURIOSOS")) {
                    if (cola2.tamanio() <= 20) {
                       rapidosTextArea.setText(String.valueOf(peliculas.entradasDisponibles()));
                    } else {
                        JOptionPane.showMessageDialog(null, "NO HAY ENTRADA DISPONIBLES");
                    }
                }else{
                    if (cola3.tamanio() <= 20) {
                        deadpoolTextArea.setText(String.valueOf(peliculas.entradasDisponibles()));
                    } else {
                        JOptionPane.showMessageDialog(null, "NO HAY ENTRADA DISPONIBLES");
                    }
                }
            }
        });
    }

    public void limpiarCampos(){
        cboNombrePelicula.setSelectedItem("");
        txtNumeroEntradas.setText("");

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("FormularioCine");
        frame.setContentPane(new FormularioCine().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
