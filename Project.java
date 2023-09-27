package com.JDBC;
import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener
{
  private JMenu exit ;
  Project()
  {
    setSize(1540 , 850);
    
    //Menu Tab ho gya yeh 
    JMenuBar mb = new JMenuBar();
    
    //Menu 1 ka naam
    JMenu new_information = new JMenu("New Information");
    new_information.setForeground(Color.RED);
    mb.add(new_information);
    
    JMenuItem mi = new JMenuItem("New Faculty Information");
    new_information.add(mi);
    
    
    JMenuItem mi1 = new JMenuItem("New Student Information");
    new_information.add(mi1);
    
    //MenuBar ko set karna
    setJMenuBar(mb);
    
    
    	
    
    //JMenu View Details ka Tab 2 
    JMenu Details = new JMenu("View Details");
    Details.setForeground(Color.BLUE);
    mb.add(Details);
    
    JMenuItem FacultyDetails= new JMenuItem("Faculty Details");
    Details.add(FacultyDetails);
    
    JMenuItem StudentDetails = new JMenuItem("Student Deatials");
    Details.add(StudentDetails);
    
    
    //Apply For Leave Details Add karna Hai Tab 3
    JMenu Leave = new JMenu("Apply Leave");
    Leave.setForeground(Color.RED);
    mb.add(Leave);
    
    JMenuItem apply_Faculty_leave = new JMenuItem("Apply Faculty Leave");
    Leave.add(apply_Faculty_leave);
    
    JMenuItem apply_Student_Leave = new JMenuItem("Apply Student Leave");
    Leave.add(apply_Student_Leave);
    
    //To View Leave Details
    JMenu view_leave = new JMenu("View Leave Details");
    view_leave.setForeground(Color.BLUE);
    mb.add(view_leave);
    
    JMenuItem ab1 = new JMenuItem("Faculty Leave");
    view_leave.add(ab1);
    
    JMenuItem ab2 = new JMenuItem("Student Leave");
    view_leave.add(ab2);
    
    //Examination ka tab add kar diya
    JMenu examination = new JMenu("Examination");
    examination.setForeground(Color.RED);
    mb.add(examination);
    
    JMenuItem bc1 = new JMenuItem("Examination Results");
    examination.add(bc1);
    
    JMenuItem bc2 = new JMenuItem("Enter Marks");
    examination.add(bc2);
    
    //To Update Info uska Tab
    JMenu update_info = new JMenu("Update Info");
    update_info.setForeground(Color.BLUE);
    mb.add(update_info);
    
    JMenuItem cd1 = new JMenuItem("Update Faculty");
    update_info.add(cd1);
    
    JMenuItem cd2 = new JMenuItem("Update Student");
    update_info.add(cd2);
    
    //Fees Updation ka Tab
    
    JMenu fee = new JMenu("Fees");
    fee.setForeground(Color.RED);
    mb.add(fee);
    
    JMenuItem de1 = new JMenuItem("Fee Structure");
    fee.add(de1);
    
    JMenuItem de2 = new JMenuItem("Student Fees");
    fee.add(de2);
    
    
    //Utitily Kit Ka Tab
    
    JMenu utility = new JMenu("Utility");
    utility.setForeground(Color.BLUE);
    mb.add(utility);
    
    JMenuItem ef1 = new JMenuItem("Notepad");
    utility.add(ef1);
    ef1.addActionListener(this);
    
    
    JMenuItem ef2 = new JMenuItem("Calculator");
    utility.add(ef2);
    ef2.addActionListener(this);
    
    JMenu ab = new JMenu("About");
    ab.setForeground(Color.blue);
    mb.add(ab);
    
    JMenuItem about = new JMenuItem("About");
    about.addActionListener(this);
    ab.add(about);
    
    JMenu exit = new JMenu("EXIT");
    exit.setForeground(Color.RED);
    mb.add(exit);
    
    JMenuItem exit1 = new JMenuItem("EXIT");
    exit1.addActionListener(this);
    exit.add(exit1);
    
    
    
    
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae)
  {
    String msg = ae.getActionCommand();
    if(msg.equals("EXIT"))
    {
      setVisible(false);
    }
    else if(msg.equals("Calculator"))
    {
      try
      {
        Runtime.getRuntime().exec("calc.exe");
      }
      catch(Exception ex)
      {
        
      }
    }
    else if(msg.equals("Notepad"))
    {
      try
      {
        Runtime.getRuntime().exec("notepad.exe");
      }
      catch(Exception ec)
      {
        
      }
    }
    else if(msg.equals("Faculty Details"))
    {
      new new_faculty();
    }
    
    else if(msg.equals("Student Deatials"))
    {
      new new_student();
    }
    
    
  }
  public static void main(String[] args)
  {
    Project p1 = new Project();
    
  }
}