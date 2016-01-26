import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
    public frame(){
        //setSize(500,300);
        //setLocation(400,300);
        //setBounds(500,300,400,300);
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);


        //titulo ventana
        setTitle("Mi musica ");

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //centrar el jframe
        Toolkit miPantalla=Toolkit.getDefaultToolkit();
        Dimension tamanopantalla=miPantalla.getScreenSize();
        int alturapantalla=tamanopantalla.height;
        int anchurapantalla= tamanopantalla.width;

        setSize(anchurapantalla/2,alturapantalla/2);
        setLocation(anchurapantalla/4,alturapantalla/4);


        // cambiar icono
        Image miIcono=miPantalla.getImage("src/main/resources/icono.png");
        setIconImage(miIcono);


        lamina lamina=new lamina();
        add(lamina);

    }
}
