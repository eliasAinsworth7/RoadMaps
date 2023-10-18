import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class addingPlace extends JFrame {

    //Error  Message
    JOptionPane jOptionPane = new JOptionPane();

    //Main Panel
    private JPanel addingMainPanel;

    //Name Of The City that the user want to add into app
    private JTextField textFieldAddinCity;

    //Including names of the cities in app
    private JComboBox comboBoxAddingToCity;

    //Including radio buttons
    private JPanel topPane;

    //Including buttons that're used to continue adding or cancel adding
    private JPanel actingPane;

    //Radio Buttons that control addintCity panel and addintTocity panel in disable
    private JRadioButton addCity;
    private JRadioButton addToCity;

    //Name of Tourist Attraction the user want to add into app
    private JTextField textField2AddintCity;
    private JTextField textField2AddintTocity;

    //To Continue adding
    private JButton adding;

    //Adding new city and tourist attractions of it into app
    private JPanel addintCity;

    //Adding tourist attractions of the city, which is almost in app, into app
    private JPanel addintTocity;

    //To back to InterfaceOfApplication and cancel adding
    private JButton cancelButton;

    //Including Radio Buttons
    private ButtonGroup buttonGroup;



    public addingPlace(Cities cities) {

        //Interface Of Application
        buttonGroup = new ButtonGroup();
        buttonGroup.add(addCity);
        buttonGroup.add(addToCity);
        comboBoxAddingToCity.setEditable(false);
        setSize(600, 380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        add(addingMainPanel);
        setVisible(true);

        comboBoxAddingToCity.addItem("");
        for (Graph info: cities.getGraphList()) {
            comboBoxAddingToCity.addItem(info.getNameOftheCity());
        }
        textField2AddintCity.setEditable(true);
        textFieldAddinCity.setEditable(true);
        textField2AddintTocity.setEditable(true);
        comboBoxAddingToCity.setEnabled(false);
        textField2AddintTocity.setEnabled(false);
        textField2AddintCity.setEnabled(false);
        textFieldAddinCity.setEnabled(false);

        //Radio Buttons're Taken Attraction with Listener
        addCity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2AddintTocity.setEnabled(false);
                comboBoxAddingToCity.setEnabled(false);
                textField2AddintCity.setEnabled(true);
                textFieldAddinCity.setEnabled(true);
            }
        });
        addToCity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2AddintCity.setEnabled(false);
                textFieldAddinCity.setEnabled(false);
                textField2AddintTocity.setEnabled(true);
                comboBoxAddingToCity.setEnabled(true);
            }
        });

        //Buttons're Taken Attraction with Listener
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new InterfaceOfApplication();
                dispose();
            }
        });
        adding.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addCity.isSelected() || addToCity.isSelected()){
                    if(textField2AddintCity.getText().length() != 0 && textFieldAddinCity.getText().length() != 0){

                        try{
                            new addingPlace2(cities,textFieldAddinCity.getText(),Integer.parseInt(textField2AddintCity.getText()));
                            dispose();
                        } catch (Exception t){
                            System.err.println(t);
                            jOptionPane.showMessageDialog(null,"Please fill with only number","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    } else if(textField2AddintTocity.getText().length() !=0 && comboBoxAddingToCity.getSelectedIndex()!=0){
                        try{
                            new addingPlace2(cities,comboBoxAddingToCity.getSelectedItem().toString(),Integer.parseInt(textField2AddintTocity.getText()));
                            dispose();
                        } catch (Exception t){
                            System.err.println(t);
                            jOptionPane.showMessageDialog(null,"Please fill with only number","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        jOptionPane.showMessageDialog(null,"Please fill spaces","Error",JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                jOptionPane.showMessageDialog(null,"Please select one button","Error",JOptionPane.ERROR_MESSAGE);
            }


        }
        });
    }
}
