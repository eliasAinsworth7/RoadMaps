import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class addingPlace2 extends JFrame {

    //Cities to save data
    Cities cities = new Cities();


    //Main Name Of Turist Attraction
    private JTextField textField1;

    //Information about the Turist Attraction
    private JTextArea textArea1;

    //Other Attractions nearby main attraction, only 1
    private JTextField textField2;

    //To add tourist attraction nearby main tourist
    private JButton addButton;

    //To Finish adding
    private JButton OKButton;

    //To Cancel adding
    private JButton cancelButton;

    //Main Panel
    private JPanel mainpanel;

    //Including textField1
    private JPanel nameOfturist;

    //Including textArea1
    private JPanel info;

    //Including textField2
    private JPanel otherAttraction;

    public addingPlace2(Cities cities,String name,int number){
        //Lists match each other
        this.cities = cities;
        creater();


    }

    //To Create Interface
    private void creater(){
        //Interface Of Application
        setVisible(true);
        setContentPane(mainpanel);
        textArea1.setDragEnabled(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,400);

        //Buttons're Taken Attraction with Listener
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new addingPlace(cities);
                dispose();
            }
        });
    }
}
