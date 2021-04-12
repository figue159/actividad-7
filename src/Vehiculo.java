
import javax.swing.JOptionPane;


public class Vehiculo {
    public int precio;
    
    public void mostarMarcas(){
         int opcion;
          opcion=Integer.parseInt(JOptionPane.showInputDialog("1. marca abarth"+"\n"+"2.marca alfa romeo"+"\n"+"3.marca alpine"+"\n"+"4.marca aston martin"+"\n"+"5.marca audi"));
        switch (opcion) {
            case 1:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("1.modelo 500 abarth"+"2. modelo punto abarth"+"3.modelo spider 124"));
                precio = 1500000;
                break;
            case 2:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("1.modelo stelvio"+"2. modelo Guiluia"+"3.modelo Mito"));
                precio=2300000;
                break;
            case 3:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("1.modelo A1110"));
                precio = 1000000;
                break;
            case 4:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("1.modelo DB11"+"2. modelo DB9"+"3.modelo DBS"));
                precio = 600000;   
                break;
            case 5:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("1.modelo A7 sportback"+"2. modelo A4"+"3.modelo A3"));
                precio = 3000000;
                break;
            default:
                break;
        }
    }
}
