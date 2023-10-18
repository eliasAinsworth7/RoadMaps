import javax.swing.*;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class InterfaceOfApplicatinPart2 extends JFrame  {

    //Index Of Current City
    private int indexOfcity=0;
    //Main Panel
    private JPanel panel1;

    //List of Places around current place
    private JList<String> list1;
    //To fill list1, to create an arraylist
    DefaultListModel model;

    //Next Cities

    ArrayList<String> nextCities = new ArrayList<>();

    //To Continue hanging around
    private JButton continueHangingAroundButton;

    //To Back to InterfaceOfApplication
    private JButton backToCitiesButton;

    //Info about current place
    private JLabel infoLabel;

    private JScrollPane scrollPane;
    private JPanel ListPanel;

    //Name of Current
    private JLabel current;

    //Panel that includes infolabel
    private JPanel info;

    public InterfaceOfApplicatinPart2(Cities c, String s) {

        //Interface Of Application
        model = new DefaultListModel();
        list1 = new JList(model);
        scrollPane = new JScrollPane(list1);
        ListPanel.add(scrollPane);
        list1.setVisible(true);
        System.out.println(s);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(panel1);
        setVisible(true);

        //To find index of current city out
        for (int i=0; i <c.getGraphList().size();i++){
            if(c.getGraphList().get(i).getNameOftheCity() == s){
                indexOfcity = i;
            }
        }
            //Fill table with Vertex's Data
        for(Vertex vertex : c.getGraphList().get(indexOfcity).GetVertexes()){
            model.addElement(vertex.GetData().getName());
        }


        //Buttons're Taken Attraction with Listener
        backToCitiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InterfaceOfApplication();
                dispose();
            }
        });
        continueHangingAroundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Taking attracting to list


                if(list1.getSelectedValue()!=null){
                    for(Vertex v : c.getGraphList().get(indexOfcity).GetVertexes()){
                       if(v.GetData().getName()!= list1.getSelectedValue()){
                           System.out.println(v.GetData().getName());
                           nextCities.add(v.GetData().getName());
                       } else if (v.GetData().getName()== list1.getSelectedValue()) {
                           current.setText(v.GetData().getName());
                           //infoLabel.setText(v.GetData().getInfo() + "/nDistance:0");

                       }

                   }
                    model.removeAllElements();

                    try{
                        int i = nextCities.size()-1;
                        for(String s : nextCities){

                            if(i!=-1) {
                                model.addElement(nextCities.remove(i));
                            }
                            i--;
                        }

                    } catch (Exception z){
                        System.err.println(z);
                    }





                }

            }
        });
    }
}
