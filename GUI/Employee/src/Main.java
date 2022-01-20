import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        mainWindows(employeeList);
    }

    private static void mainWindows(EmployeeList employeeList) {
        JFrame jFrame = new JFrame("Employee Manager.");
        jFrame.setSize(new Dimension(400,200));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new FlowLayout());
        panel.setBorder(new EmptyBorder(2,3,2,3));
        JPanel layout = new JPanel(new GridBagLayout());
        layout.setBorder(new EmptyBorder(5,5,5,5));
        JPanel btnpannel = new JPanel(new GridLayout(10,1,10,5));


        JButton addbutton = new JButton("Add Data.");
        JButton searchbutton = new JButton("Search Data.");
        JButton removebutton = new JButton("Remove Data.");
        JButton modifybutton = new JButton("Modify Data.");
        btnpannel.add(addbutton);
        btnpannel.add(searchbutton);
        btnpannel.add(removebutton);
        btnpannel.add(modifybutton);

        layout.add(btnpannel);
        panel.add(layout,BorderLayout.CENTER);
        jFrame.add(panel);
        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeList.addEmployee();
            }
        });
        searchbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeList.search();
            }
        });
        removebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeList.removeEmployee();
            }
        });
        modifybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeList.modify();
            }
        });
    }
}
