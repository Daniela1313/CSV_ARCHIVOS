package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniela Garcia Rios
 */
public class Controller implements ActionListener {
    
    private final Model model;
    private final View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        view.jb_csv_guardar.addActionListener(this);
        view.jb_csv_nuevo.addActionListener(this);
         
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.jb_csv_guardar){
            model.setPath("C:\\Users\\Dany\\Documents\\csv1archivo\\Archivo.csv");
            String name = view.jtf_csv_nombre.getText();
            String email = view.jtf_csv_email.getText();
           
            System.out.println(email);
            String message="";
            message+=name+","+email+"\n";
            model.setMessage(message);
            model.writeFile(model.getPath(), model.getMessage());
            JOptionPane.showMessageDialog(view, "archivo guardado");
        }else if(e.getSource()==view.jb_csv_nuevo){
            view.jtf_csv_email.setText(null);
            view.jtf_csv_nombre.setText(null);
            
        }
        
    }
    private void initView() {
        view.setTitle("CSV_ARCHIVOS");
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    } 
    
}

