import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class InterfaceOfApplication extends JFrame {

    //List of cities to save data
    private static Cities cities = new Cities();

    //Main Panel
    private JPanel mainPanel;

    //Including Cities in app
    private JComboBox Cities1;

    //Including buttons
    private JPanel Buttons;

    //To Go
    private JButton goWalkButton;

    //To Add new places
    private JButton addCityButton;



    public InterfaceOfApplication(){
        //Interface Of Application
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,150);
        setResizable(false);


        //Filling the combobox

        Cities1.addItem("");
        for (Graph info: cities.getGraphList()) {
            Cities1.addItem(info.getNameOftheCity());
        }
        setVisible(true);


        //Buttons're Taken Attraction with Listener
        goWalkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Cities1.getSelectedItem()!=""){InterfaceOfApplicatinPart2 interfaceOfApplicatinPart2 = new InterfaceOfApplicatinPart2(cities, Cities1.getSelectedItem().toString());
                setVisible(false);}
            }
        }
        );
        addCityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new addingPlace(cities);
                dispose();
            }
        });

    }
    public Cities getCities(){
        return cities;
    }




}
