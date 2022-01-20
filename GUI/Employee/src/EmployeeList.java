import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.ArrayList;

public class EmployeeList{
    ArrayList<Employee> list = new ArrayList<Employee>();

    void addEmployee(){
        JFrame jFrame = new JFrame("Add Members.\n");
        jFrame.setSize(new Dimension(400,500));
        //jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);

        JLabel jLabel = new JLabel("Enter details.");
        jLabel.setBounds(120,5,200,200);

        JLabel jLabel1 = new JLabel("Name: ");
        jLabel1.setBounds(5,80,150,50);
        JTextField jtf1 = new JTextField();
        jtf1.setBounds(160,95,150,20);

        JLabel jLabel2 = new JLabel("Code: ");
        jLabel2.setBounds(5,100,150,50);
        JTextField jtf2 = new JTextField();
        jtf2.setBounds(160,115,150,20);

        JLabel jLabel3 = new JLabel("Pay: ");
        jLabel3.setBounds(5,120,150,50);
        JTextField jtf3 = new JTextField();
        jtf3.setBounds(160,135,150,20);

        JLabel jLabel4 = new JLabel("Contact: ");
        jLabel4.setBounds(5,140,150,50);
        JTextField jtf4 = new JTextField();
        jtf4.setBounds(160,155,150,20);



       /* String entries [] = {"Department 1","Department 2","Department 3","Department 4"};
        JList<String> jlist = new JList<String>(entries);
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane jsp = new JScrollPane(jlist);
        jsp.setPreferredSize(new Dimension(120,90));

        JLabel jLabel5 = new JLabel("Select a department.\n");
        jLabel5.setBounds(120,120,150,200);
        jlist.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int indx = jlist.getSelectedIndex();
                if(indx != -1 ){
                    jLabel5.setText("Current selection is: "+entries[indx]);
                }else{
                    jLabel5.setText("Please Choose.\n");
                }
            }
        });
*/
        jFrame.add(jLabel);
        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jLabel3);
        jFrame.add(jLabel4);
      //  jFrame.add(jLabel5);
        jFrame.add(jtf1);
        jFrame.add(jtf2);
        jFrame.add(jtf3);
        jFrame.add(jtf4);
      //  jFrame.add(jsp);
        jFrame.setVisible(true);


    }
    void removeEmployee(){
        JFrame jFrame = new JFrame("Remove Employee.\n");
        jFrame.setSize(new Dimension(275,100));
      //  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel1 = new JLabel("Enter details.");
        jFrame.add(jLabel1);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }

    void modify(){
        JFrame jFrame = new JFrame("Modify Employee.\n");
        jFrame.setSize(new Dimension(275,100));
      //  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel1 = new JLabel("Enter details.");
        jFrame.add(jLabel1);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }
    void search(){
        JFrame jFrame = new JFrame("Search Employee.\n");
        jFrame.setSize(new Dimension(275,100));
      //  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel1 = new JLabel("Enter details.");
        jFrame.add(jLabel1);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }
}
