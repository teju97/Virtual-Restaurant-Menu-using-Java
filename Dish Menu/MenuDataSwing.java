package System;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import System.*;        

public class MenuDataSwing
{
 JFrame mainF,addF,viewF,deleteF,searchF,updateF,sortF;
 Container mainMenu,addMenu,viewMenu,deleteMenu,searchMenu,updateMenu,sortMenu;
 JPanel mainMenuSelectP,mainMenuViewP,addMenuSelectP,addMenuViewP,viewMenuViewP,deleteMenuSelectP,deleteMenuViewP,searchMenuSelectP,searchMenuSelectP2,searchMenuViewP,updateMenuSelectP,updateMenuViewP,sortMenuViewP;
 JTextArea mainMTextA,addMTextA,viewMTextA,deleteMTextA,searchMTextAForView,searchMTextAForResult,updateMTextAForView,updateMTextAForResult,sortMTextAForResult;
 JComboBox mainMComboBox,searchMComboBox,searchMComboBQuality,addMComboBQuality,updateMComboBQuality;
 JTextField addMTextFID,addMTextFName,addMTextFPrize;
 JTextField deleteMTextFID;
 JTextField searchMTextFName,searchMTextFPrize;
 JTextField updateMTextFID,updateMTextFName,updateMTextFPrize;
 
 JButton mainMBtn,addMBtn,deleteMBtn,searchMBtn,updateMBtn;
 
 JButton addBackB,viewBackB,deleteBackB,searchBackB,updateBackB,sortBackB;
 
 JButton searchNameBtn,searchPrizeBtn,searchQualityBtn;
 JButton updateSelectTraceBtn;
 
 
 JLabel addIDL,addNameL,addPrizeL,addQualityL,addIDnoL,addStatusL;
 JLabel deleteIDL,deleteStatusL;
 JLabel searchNameL,searchPrizeL,searchQualityL;
 JLabel updateIDL,updateNameL,updatePrizeL,updateQualityL,updateStatusL;
 
 String ID, name, Prize, SorN, Quality;
 String IDView, nameView, PrizeView, SorNView, IDnoView;
 String IDDelView, nameDelView, PrizeDelView, SorNDelView, IDnoDelView;
 String IDSort, nameSort, PrizeSort, SorNSort, IDnoSort;
 String IDDelete, nameDelete, PrizeDelete, SorNDelete, IDnoDelete;
 String nameSearchSel, PrizeSearchSel, SorNSearchSel;
 String newNameUpdate, newQualityUpdate, splittUpdate, newPrizeUpdate, recordUpdate1, IDUpdate1,IDUpdate2nd,recordUpdate2,choice;
 
 //--ValAdd
 JLabel addIDV,addNameV,addPrizeV,addQualityV;
 String addValidationID,addValidationName,addValidationPrize,addValidationQuality;
 //--ValAdd

 //--ValUpdate
 JLabel delIDV,delNameV,delPrizeV,delQualityV;
 String delValidationID,delValidationName,delValidationPrize,delValidationQuality;
 //--ValUpdate
  
 
 MenuDataSwing()
 {
  
  
  mainF=new JFrame("Main Menu");
  addF=new JFrame("Add Menu");
  viewF=new JFrame("View All Menu");
  deleteF=new JFrame("Delete Menu");
  searchF=new JFrame("Search Menu");
  updateF=new JFrame("Update Menu");
  sortF=new JFrame("Sort Menu");
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//--Main Menu Container
   //--Main Menu Container
   mainMenu=mainF.getContentPane();
   mainMenu.setBackground(Color.white);
   mainMenu.setVisible(true);
   //---
   //--Add Menu Container
   addMenu=addF.getContentPane();
   addMenu.setBackground(Color.white);
   addMenu.setVisible(true);
   //---
   //--View Menu Container
   viewMenu=viewF.getContentPane();
   viewMenu.setBackground(Color.white);
   viewMenu.setVisible(true);
   //---
   //--Delete Menu Container
   deleteMenu=deleteF.getContentPane();
   deleteMenu.setBackground(Color.white);
   deleteMenu.setVisible(true);
   //---
   //--Search Menu Container
   searchMenu=searchF.getContentPane();
   searchMenu.setBackground(Color.white);
   searchMenu.setVisible(true);
   //---
   //--Update Menu Container
   updateMenu=updateF.getContentPane();
   updateMenu.setBackground(Color.white);
   updateMenu.setVisible(true);
   //---
   //--Sort Menu Container
   sortMenu=sortF.getContentPane();
   sortMenu.setBackground(Color.white);
   sortMenu.setVisible(true);
   //---
  }
  //----------------------------------------------------------------
   //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh 
  {//--Setting Size of panel
  
   //--Main Menu Panel
   mainMenuSelectP=new JPanel();
   mainMenuSelectP.setBounds(30,30,200,200);
   mainMenuSelectP.setBackground(Color.white);
   
   mainMenuViewP=new JPanel();
   mainMenuViewP.setBounds(30,280,200,30);
   mainMenuViewP.setBackground(Color.white);
   //---
   //--Add Menu Panel
   addMenuSelectP=new JPanel();
   addMenuSelectP.setBounds(30,30,170,200);
   addMenuSelectP.setBackground(Color.white);
   
   addMenuViewP=new JPanel();
   addMenuViewP.setBounds(250,30,200,200);
   addMenuViewP.setBackground(Color.white);
   //---
   //--View Menu Panel
   
   viewMenuViewP=new JPanel();
   viewMenuViewP.setBounds(30,30,720,230);
   viewMenuViewP.setBackground(Color.white);
   //---
   //--Delete Menu Panel
   deleteMenuSelectP=new JPanel();
   deleteMenuSelectP.setBounds(30,10,200,80);
   deleteMenuSelectP.setBackground(Color.white);
   
   deleteMenuViewP=new JPanel();
   deleteMenuViewP.setBounds(30,100,720,200);
   deleteMenuViewP.setBackground(Color.white);
   //---
   //--Search Menu Panel
   searchMenuSelectP=new JPanel();
   searchMenuSelectP.setBounds(30,10,200,250);
   searchMenuSelectP.setBackground(Color.white);

   searchMenuSelectP2=new JPanel();
   searchMenuSelectP2.setBounds(250,10,330,90);
   searchMenuSelectP2.setBackground(Color.white);
   
   searchMenuViewP=new JPanel();
   searchMenuViewP.setBounds(250,100,720,200);
   searchMenuViewP.setBackground(Color.white);
   //---
   //--Update Menu Panel
   updateMenuSelectP=new JPanel();
   updateMenuSelectP.setBounds(30,10,200,400);
   updateMenuSelectP.setBackground(Color.white);
   
   updateMenuViewP=new JPanel();
   updateMenuViewP.setBounds(250,10,200,200);
   updateMenuViewP.setBackground(Color.white);
   //---
   //--Sort Menu Panel
   sortMenuViewP=new JPanel();
   sortMenuViewP.setBounds(30,30,700,230);
   sortMenuViewP.setBackground(Color.white);
  }//---
  //----------------------------------------------------------------
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//--setting all frames visiblity to true
   
  mainF.setVisible(true);
  
  mainF.setLayout(null);
  
  addF.setVisible(false);
  addF.setLayout(null);
  
  viewF.setVisible(false);
  viewF.setLayout(null);
  
  deleteF.setVisible(false);
  deleteF.setLayout(null);
  
  searchF.setVisible(false);
  searchF.setLayout(null);
  
  updateF.setVisible(false);
  updateF.setLayout(null);
  
  sortF.setVisible(false);
  sortF.setLayout(null);
  }//---
  //----------------------------------------------------------------
  
  {//--setting frame and container size
   //--(main)setting frame and container size
   mainMenu.add(mainMenuSelectP);
   mainMenu.add(mainMenuViewP);
   mainMenu.setSize(550,300);
   mainF.setSize(300,400);
   mainMenu.setVisible(true);
   //---
   //--(add)setting frame and container size
   addMenu.add(addMenuSelectP);
   addMenu.add(addMenuViewP);
   addMenu.setSize(550,300);
   addF.setSize(500,300);
   addMenu.setVisible(true);
   //---
   //--(view)setting frame and container size
   viewMenu.add(viewMenuViewP);
   viewMenu.setSize(550,200);
   viewF.setSize(800,330);
   viewMenu.setVisible(true);
   //---
   //--(delete)setting frame and container size
   deleteMenu.add(deleteMenuSelectP);
   deleteMenu.add(deleteMenuViewP);
   deleteMenu.setSize(550,300);
   deleteF.setSize(900,400);
   deleteMenu.setVisible(true);
   //---
   //--(search)setting frame and container size
   searchMenu.add(searchMenuSelectP);
   searchMenu.add(searchMenuSelectP2);
   searchMenu.add(searchMenuViewP);
   searchMenu.setSize(550,300);
   searchF.setSize(1000,400);
   searchMenu.setVisible(true);
   //---
   //--(update)setting frame and container size
   updateMenu.add(updateMenuSelectP);
   updateMenu.add(updateMenuViewP);
   updateMenu.setSize(550,450);
   updateF.setSize(500,500);
   updateMenu.setVisible(true);
   //---
   //--(sort)setting frame and container size
   sortMenu.add(sortMenuViewP);
   sortMenu.setSize(550,300);
   sortF.setSize(800,330);
   sortMenu.setVisible(true);
   //---
  }
  //----------------------------------------------------------------
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//main menu view
  mainMTextA=new JTextArea("          Select the input:\n\n1 ---> Add New Dish Record \n2 ---> View All Dishes Record\n3 ---> Delete Dish Record\n4 ---> Search Dish Record\n5 ---> Update Dish Record\n6 ---> Sort Dish Record\n7 ---> Exit");
  mainMTextA.setPreferredSize(new Dimension(170,150));
  mainMTextA.setEditable(false);
  
  String select[]={"1","2","3","4","5","6","7"};
  mainMComboBox=new JComboBox(select);
  mainMComboBox.setPreferredSize(new Dimension(50,20));
  
  mainMBtn=new JButton("Select");
  mainMBtn.setPreferredSize(new Dimension(80,20));
  
  mainMenuSelectP.add(mainMTextA,BorderLayout.CENTER);
  mainMenuSelectP.add(mainMComboBox,BorderLayout.SOUTH);
  
  mainMenuViewP.add(mainMBtn,BorderLayout.CENTER);
  }
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//add menu view
   //--------------------------------------------------------------------------
   //---
   
   addIDL=new JLabel("ID: ");
   addIDL.setPreferredSize(new Dimension(20,20));
   
   addMTextFID=new JTextField();
   addMTextFID.setPreferredSize(new Dimension(110,20));
   
   //---
   
   addNameL=new JLabel("Name: ");
   addNameL.setPreferredSize(new Dimension(40,20));
   
   addMTextFName=new JTextField();
   addMTextFName.setPreferredSize(new Dimension(110,20));
   
   //---
   
   addPrizeL=new JLabel("Prize: ");
   addPrizeL.setPreferredSize(new Dimension(40,20));
   
   addMTextFPrize=new JTextField();
   addMTextFPrize.setPreferredSize(new Dimension(110,20));
   
   //---
   
   addQualityL=new JLabel("Quality: ");
   addQualityL.setPreferredSize(new Dimension(50,20));
   
   String selectQualityAdd[]={"Select Quality","Special","Normal"};
   addMComboBQuality=new JComboBox(selectQualityAdd);
   addMComboBQuality.setPreferredSize(new Dimension(110,20));
   
   //---Val
   
   
   addIDV=new JLabel("Enter the ID!!!");
   addIDV.setPreferredSize(new Dimension(100,10));
   addIDV.setForeground(Color.RED);
   addIDV.setVisible(false);
   
   addNameV=new JLabel("Enter the Name!!!");
   addNameV.setPreferredSize(new Dimension(100,10));
   addNameV.setForeground(Color.RED);
   addNameV.setVisible(false);
   
   addPrizeV=new JLabel("Enter the Prize!!!");
   addPrizeV.setPreferredSize(new Dimension(100,10));
   addPrizeV.setForeground(Color.RED);
   addPrizeV.setVisible(false);
   
   addQualityV=new JLabel("Select Proper Quality!!!");
   addQualityV.setPreferredSize(new Dimension(150,20));
   addQualityV.setForeground(Color.RED);
   addQualityV.setVisible(false);
   
   //---Val
   
   //--------------------------------------------------------------------------
   addMBtn=new JButton("Save");
   addMBtn.setPreferredSize(new Dimension(80,20));
   
   addBackB=new JButton("Back");
   addBackB.setPreferredSize(new Dimension(80,20));
   //--------------------------------------------------------------------------
   
   addMTextA=new JTextArea();
   addMTextA.setPreferredSize(new Dimension(170,80));
   addMTextA.setEditable(false);
   
   addStatusL=new JLabel("This is the Status...");
   addStatusL.setPreferredSize(new Dimension(170,80));
   //--------------------------------------------------------------------------
   
   addMenuSelectP.add(addIDL,BorderLayout.NORTH);
   addMenuSelectP.add(addMTextFID,BorderLayout.NORTH);
   
   addMenuSelectP.add(addNameL,BorderLayout.NORTH);
   addMenuSelectP.add(addMTextFName,BorderLayout.NORTH);
   
   addMenuSelectP.add(addPrizeL,BorderLayout.NORTH);
   addMenuSelectP.add(addMTextFPrize,BorderLayout.NORTH);
   
   addMenuSelectP.add(addQualityL,BorderLayout.NORTH);
   addMenuSelectP.add(addMComboBQuality,BorderLayout.NORTH);
   
   //---Val
   addMenuSelectP.add(addIDV,BorderLayout.NORTH);
   addMenuSelectP.add(addNameV,BorderLayout.NORTH);
   addMenuSelectP.add(addPrizeV,BorderLayout.NORTH);
   addMenuSelectP.add(addQualityV,BorderLayout.NORTH);
   //---Val
   
   addMenuSelectP.add(addMBtn,BorderLayout.SOUTH);
   addMenuSelectP.add(addBackB,BorderLayout.SOUTH);
   
   addMenuViewP.add(addMTextA,BorderLayout.NORTH);
   addMenuViewP.add(addStatusL,BorderLayout.SOUTH);
   
   
  }
  
  {//view menu view
   //---
   
   viewBackB=new JButton("Back");
   viewBackB.setPreferredSize(new Dimension(80,20));
   
   viewMTextA=new JTextArea(10, 60);
   viewMTextA.setPreferredSize(new Dimension(700,450));
   viewMTextA.setEditable(false);
   
   //---
   //----------------------------------------------------------------
   JScrollPane scrollView = new JScrollPane(viewMTextA,
   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   //----------------------------------------------------------------
   viewMenuViewP.add(viewBackB,BorderLayout.NORTH);
   
   viewMenuViewP.add(scrollView,BorderLayout.CENTER);
   //viewMenuViewP.add(viewMTextA,BorderLayout.SOUTH);
   
   
  }
  
  {//delete menu view
   deleteIDL=new JLabel("ID: ");
   deleteIDL.setPreferredSize(new Dimension(20,20));
   
   deleteMTextFID=new JTextField();
   deleteMTextFID.setPreferredSize(new Dimension(110,20));
   
   deleteMBtn=new JButton("Delete");
   deleteMBtn.setPreferredSize(new Dimension(80,20));
   
   deleteStatusL=new JLabel("---Status of Delete---");
   deleteStatusL.setPreferredSize(new Dimension(170,20));
   
   deleteBackB=new JButton("Back");
   deleteBackB.setPreferredSize(new Dimension(80,20));
   
   deleteMTextA=new JTextArea(10, 60);
   deleteMTextA.setPreferredSize(new Dimension(700,430));
   deleteMTextA.setEditable(false);
  
  
  JScrollPane scrollDelete = new JScrollPane(deleteMTextA,
   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
  
  //----------------------------------------------------------------
   deleteMenuSelectP.add(deleteIDL,BorderLayout.NORTH);
   deleteMenuSelectP.add(deleteMTextFID,BorderLayout.NORTH);
   deleteMenuSelectP.add(deleteMBtn,BorderLayout.CENTER);
   deleteMenuSelectP.add(deleteBackB,BorderLayout.CENTER);
   deleteMenuSelectP.add(deleteStatusL,BorderLayout.SOUTH);
   
   deleteMenuViewP.add(scrollDelete,BorderLayout.CENTER);
  
  }
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//Search menu view
  searchMTextAForView=new JTextArea("Select search input:\n1 ---> Search by Name\n2 ---> Search by Prize\n3 ---> Search by Quality");
  searchMTextAForView.setPreferredSize(new Dimension(170,150));
  searchMTextAForView.setEditable(false);
  
  String selectSearcg[]={"1","2","3"};
  searchMComboBox=new JComboBox(selectSearcg);
  searchMComboBox.setPreferredSize(new Dimension(50,20));
  
  searchMBtn=new JButton("Select");
  searchMBtn.setPreferredSize(new Dimension(80,20));
  
  searchBackB=new JButton("Back");
  searchBackB.setPreferredSize(new Dimension(80,20));
  
  //----------------------------------------------------------------
  searchNameL=new JLabel("Name: ");
  searchNameL.setPreferredSize(new Dimension(40,20));
   
  searchMTextFName=new JTextField();
  searchMTextFName.setPreferredSize(new Dimension(110,20));
  
  searchNameBtn=new JButton("Name Search");
  searchNameBtn.setPreferredSize(new Dimension(130,20));
  //----------------------------------------------------------------
  searchPrizeL=new JLabel("Prize: ");
  searchPrizeL.setPreferredSize(new Dimension(40,20));
   
  searchMTextFPrize=new JTextField();
  searchMTextFPrize.setPreferredSize(new Dimension(110,20));
  
  searchPrizeBtn=new JButton("Prize Search");
  searchPrizeBtn.setPreferredSize(new Dimension(130,20));
  //----------------------------------------------------------------
  searchQualityL=new JLabel("Quality: ");
  searchQualityL.setPreferredSize(new Dimension(50,20));
   
  String selectQuality[]={"Select Quality","Special","Normal"};
  searchMComboBQuality=new JComboBox(selectQuality);
  searchMComboBQuality.setPreferredSize(new Dimension(110,20));
  
  searchQualityBtn=new JButton("Quality Search");
  searchQualityBtn.setPreferredSize(new Dimension(130,20));
  //----------------------------------------------------------------
  
   searchMTextAForResult=new JTextArea(10, 60);
   searchMTextAForResult.setPreferredSize(new Dimension(700,450));
   searchMTextAForResult.setEditable(false);
   
   //---
   //----------------------------------------------------------------
   JScrollPane scrollSearch = new JScrollPane(searchMTextAForResult,
   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
  
  //---------------------------------- Display ------------------------------
  
  searchMenuSelectP.add(searchMTextAForView,BorderLayout.NORTH);
  searchMenuSelectP.add(searchMComboBox,BorderLayout.CENTER);
  searchMenuSelectP.add(searchMBtn,BorderLayout.SOUTH);
  searchMenuSelectP.add(searchBackB,BorderLayout.SOUTH);
  
  //-------------
  
  searchMenuSelectP2.add(searchNameL,BorderLayout.NORTH);
  searchMenuSelectP2.add(searchMTextFName,BorderLayout.NORTH);
  searchMenuSelectP2.add(searchNameBtn,BorderLayout.NORTH);
  
  searchMenuSelectP2.add(searchPrizeL,BorderLayout.CENTER);
  searchMenuSelectP2.add(searchMTextFPrize,BorderLayout.CENTER);
  searchMenuSelectP2.add(searchPrizeBtn,BorderLayout.CENTER);
  
  searchMenuSelectP2.add(searchQualityL,BorderLayout.SOUTH);
  searchMenuSelectP2.add(searchMComboBQuality,BorderLayout.SOUTH);
  searchMenuSelectP2.add(searchQualityBtn,BorderLayout.SOUTH);
  
  searchMenuViewP.add(scrollSearch,BorderLayout.CENTER);

  //----------------------------------------------------------------
  
  }
  
  {//Update menu view
   //----------------------------------------------------------------
   //---
   updateIDL=new JLabel("ID: ");
   updateIDL.setPreferredSize(new Dimension(20,20));
   
   updateMTextFID=new JTextField();
   updateMTextFID.setPreferredSize(new Dimension(110,20));
   
   //---
   updateSelectTraceBtn=new JButton("Select");
   updateSelectTraceBtn.setPreferredSize(new Dimension(80,20));
   //---
   updateMTextAForView=new JTextArea("Tracing the details\nID\nName\nPrize\nQuality\nIDno");
   updateMTextAForView.setPreferredSize(new Dimension(170,150));
   updateMTextAForView.setEditable(false);
   //---
   
   updateNameL=new JLabel("New Name: ");
   updateNameL.setPreferredSize(new Dimension(70,20));
   
   updateMTextFName=new JTextField();
   updateMTextFName.setPreferredSize(new Dimension(110,20));
   
   //---
   
   updatePrizeL=new JLabel("New Prize: ");
   updatePrizeL.setPreferredSize(new Dimension(70,20));
   
   updateMTextFPrize=new JTextField();
   updateMTextFPrize.setPreferredSize(new Dimension(110,20));
   
   //---
   
   updateQualityL=new JLabel("New Quality: ");
   updateQualityL.setPreferredSize(new Dimension(80,20));
   
   String selectQualityUpdate[]={"Select Quality","Special","Normal"};
   updateMComboBQuality=new JComboBox(selectQualityUpdate);
   updateMComboBQuality.setPreferredSize(new Dimension(110,20));
   
   
   updateMBtn=new JButton("Update");
   updateMBtn.setPreferredSize(new Dimension(80,20));
   
   updateBackB=new JButton("Back");
   updateBackB.setPreferredSize(new Dimension(80,20));
   //--------------------------------------------------------------------------
   
   updateMTextAForResult=new JTextArea("Tracing the details result\nID\nName\nPrize\nQuality\nIDno");
   updateMTextAForResult.setPreferredSize(new Dimension(170,150));
   updateMTextAForResult.setEditable(false);
   
   updateStatusL=new JLabel("Status of update");
   updateStatusL.setPreferredSize(new Dimension(200,20));
   
   //---Val
   
   
   delIDV=new JLabel("Enter the ID!!! If ID is of 1 Char then ignore !");
   delIDV.setPreferredSize(new Dimension(300,15));
   delIDV.setForeground(Color.RED);
   delIDV.setVisible(false);
   
   delNameV=new JLabel("Enter the Name!!!");
   delNameV.setPreferredSize(new Dimension(100,10));
   delNameV.setForeground(Color.RED);
   delNameV.setVisible(false);
   
   delPrizeV=new JLabel("Enter the Prize!!!");
   delPrizeV.setPreferredSize(new Dimension(100,10));
   delPrizeV.setForeground(Color.RED);
   delPrizeV.setVisible(false);
   
   delQualityV=new JLabel("Select Proper Quality!!!");
   delQualityV.setPreferredSize(new Dimension(150,20));
   delQualityV.setForeground(Color.RED);
   delQualityV.setVisible(false);
   
   //---Val
   
   //------------------------- Display ---------------------------------------
   updateMenuSelectP.add(updateIDL,BorderLayout.NORTH);
   updateMenuSelectP.add(updateMTextFID,BorderLayout.NORTH);
   updateMenuSelectP.add(updateSelectTraceBtn,BorderLayout.NORTH);
   updateMenuSelectP.add(updateMTextAForView,BorderLayout.NORTH);
   //---------------------------
   updateMenuSelectP.add(updateNameL,BorderLayout.CENTER);
   updateMenuSelectP.add(updateMTextFName,BorderLayout.CENTER);
   
   updateMenuSelectP.add(updatePrizeL,BorderLayout.CENTER);
   updateMenuSelectP.add(updateMTextFPrize,BorderLayout.CENTER);
   
   updateMenuSelectP.add(updateQualityL,BorderLayout.CENTER);
   updateMenuSelectP.add(updateMComboBQuality,BorderLayout.CENTER);
   
   
   //---------------------------
   updateMenuSelectP.add(updateMBtn,BorderLayout.SOUTH);
   updateMenuSelectP.add(updateBackB,BorderLayout.SOUTH);
   //----------------------------------------------------------------
   updateMenuViewP.add(updateMTextAForResult,BorderLayout.NORTH);
   updateMenuViewP.add(updateStatusL,BorderLayout.SOUTH);
   //---Val
   updateMenuSelectP.add(delIDV,BorderLayout.SOUTH);
   updateMenuSelectP.add(delNameV,BorderLayout.SOUTH);
   updateMenuSelectP.add(delPrizeV,BorderLayout.SOUTH);
   updateMenuSelectP.add(delQualityV,BorderLayout.SOUTH);
   //---Val
   
   
   
   //----------------------------------------------------------------
  }
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//Sort menu view
   
   
   sortBackB=new JButton("Back");
   sortBackB.setPreferredSize(new Dimension(80,20));
   
   sortMTextAForResult=new JTextArea(10, 60);
   sortMTextAForResult.setPreferredSize(new Dimension(700,450));
   sortMTextAForResult.setEditable(false);
   
   
   
   JScrollPane scrollSort = new JScrollPane(sortMTextAForResult,
   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   //------------------------- Display ---------------------------------------
   
   sortMenuViewP.add(sortBackB,BorderLayout.NORTH);
   sortMenuViewP.add(scrollSort,BorderLayout.SOUTH);
   
  }
  
  //----------------------------------------------------------------
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//ActionListener for main menu
   mainMBtn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     if(mainMComboBox.getSelectedItem().toString().equals("1"))
     {
      mainF.setVisible(false);
      addF.setVisible(true);
     }
     else if(mainMComboBox.getSelectedItem().toString().equals("2"))
     {
      mainF.setVisible(false);
      //----------------------------------------------------------------
      try
      {
       //View details
      
       BufferedReader bR1 = new BufferedReader( new FileReader("MenuList.txt") ); 
       String record;
       
       int i=0;
       String DisplayView1[]=new String[1024];
       while( ( record = bR1.readLine() ) != null )
       {
       StringTokenizer st = new StringTokenizer(record,",");
       
       IDView=st.nextToken();
       nameView=st.nextToken();
       PrizeView=st.nextToken();
       SorNView=st.nextToken();
       IDnoView=st.nextToken();
       DisplayView1[i]="ID = "+IDView+" *** Name = "+nameView+" *** Prize = "+PrizeView+" *** Quality = "+SorNView+"\n";
       
       viewMTextA.append(DisplayView1[i]);
       i++;
       }
       bR1.close();
      }
      catch(Exception ex)
      {
       System.out.println("Exception msg: "+ex);
      }
      //----------------------------------------------------------------
      viewF.setVisible(true);
     }
     else if(mainMComboBox.getSelectedItem().toString().equals("3"))
     {
      deleteStatusL.setText("");
      mainF.setVisible(false);
      //----------------------------------------------------------------
      //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
      try
      {
       //View details Delete
       
       BufferedReader bR1DelView = new BufferedReader( new FileReader("MenuList.txt") ); 
       String recordDelView;
       
       int iDel=0;
       String DisplayDel1[]=new String[1024];
       while( ( recordDelView = bR1DelView.readLine() ) != null )
       {
       StringTokenizer stDel = new StringTokenizer(recordDelView,",");
       
       IDDelView=stDel.nextToken();
       nameDelView=stDel.nextToken();
       PrizeDelView=stDel.nextToken();
       SorNDelView=stDel.nextToken();
       IDnoDelView=stDel.nextToken();
       DisplayDel1[iDel]="ID = "+IDDelView+" *** Name = "+nameDelView+" *** Prize = "+PrizeDelView+" *** Quality = "+SorNDelView+"\n";
       
       deleteMTextA.append(DisplayDel1[iDel]);
       iDel++;
       }
       bR1DelView.close();
      }
      catch(Exception ex)
      {
       System.out.println("Exception msg: "+ex);
      }
      //----------------------------------------------------------------
      deleteF.setVisible(true);
     }
     else if(mainMComboBox.getSelectedItem().toString().equals("4"))
     {
      mainF.setVisible(false);
      searchF.setVisible(true);
     }
     else if(mainMComboBox.getSelectedItem().toString().equals("5"))
     {
      mainF.setVisible(false);
      updateF.setVisible(true);
     }
     else if(mainMComboBox.getSelectedItem().toString().equals("6"))
     {
      sortMTextAForResult.setText("");
      SortTextFile sor=new SortTextFile();
      sor.sort();
      if(sor.sort())
      {     
       boolean check=true;
       System.out.println("\nRecord Sorting status: "+check);
      }
      else
      {
       boolean check=false;
       System.out.println("\nRecord Sorting status: "+check);
      }
      
      
      mainF.setVisible(false);
      //----------------------------------------------------------------
      try
      {
       //Sort details
      
       BufferedReader bR1Sort = new BufferedReader( new FileReader("MenuList.txt") ); 
       String recordSort;
       
       int iSort=0;
       String DisplaySort1[]=new String[1024];
       while( ( recordSort = bR1Sort.readLine() ) != null )
       {
       StringTokenizer stSort = new StringTokenizer(recordSort,",");
       
       IDSort=stSort.nextToken();
       nameSort=stSort.nextToken();
       PrizeSort=stSort.nextToken();
       SorNSort=stSort.nextToken();
       IDnoSort=stSort.nextToken();
       DisplaySort1[iSort]="ID = "+IDSort+" *** Name = "+nameSort+" *** Prize = "+PrizeSort+" *** Quality = "+SorNSort+"\n";
       
       sortMTextAForResult.append(DisplaySort1[iSort]);
       iSort++;
       }
       bR1Sort.close();
      }
      catch(Exception ex)
      {
       System.out.println("Exception msg: "+ex);
      }
      //----------------------------------------------------------------
      sortF.setVisible(true);
      
     }
     else if(mainMComboBox.getSelectedItem().toString().equals("7"))
     {
      // System.exit(0);
      showDialog();
     }
    }
    
   });
  }//Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
   //---
  //----------------------------------------------------------------
  
  {//ActionListener for Back of add menu
    addBackB.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     addF.setVisible(false);
     mainF.setVisible(true);
     addMTextFID.setText("");
     addMTextFName.setText("");
     addMTextFPrize.setText("");
     addMTextA.setText("");
     addStatusL.setText("");
    }
    
   });
  }
  //----------------------------------------------------------------
 
  {//ActionListener for Back of view menu
    viewBackB.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     viewF.setVisible(false);
     mainF.setVisible(true);
     viewMTextA.setText("");
    }
    
   });
  }
  //----------------------------------------------------------------
 
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//ActionListener for Back of Delete menu
    deleteBackB.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     deleteF.setVisible(false);
     mainF.setVisible(true);
     deleteMTextFID.setText("");
     deleteStatusL.setText("");
     deleteMTextA.setText("");
    }
    
   });
  }
  //----------------------------------------------------------------  
  
  {//ActionListener for Back of Search menu
    searchBackB.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     searchF.setVisible(false);
     mainF.setVisible(true);
     searchMTextFName.setText("");
     searchMTextFPrize.setText("");
     searchMTextAForResult.setText("");
    }
   });
  }
  //----------------------------------------------------------------

  {//ActionListener for Back of Update menu
    updateBackB.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     updateF.setVisible(false);
      updateMTextFID.setText("");
      updateMTextFName.setText("");
      updateMTextFPrize.setText("");
      updateMTextAForView.setText("");
      updateMTextAForResult.setText("");
      
     mainF.setVisible(true);
    }
    
   });
  }
  //----------------------------------------------------------------

  {//ActionListener for Back of Sort menu
    sortBackB.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     
     mainF.setVisible(true);
     sortF.setVisible(false);
    }
    
   });
  
  }
  //----------------------------------------------------------------
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//ActionListener for Delete btn of menu
    deleteMBtn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
    try
    {
     if(deleteMTextFID.getText().length()!=0)
     {
       deleteMTextA.setText("");
      //------------ delete ----------
      String ID2, record1,choice3;
      
      
      File tempDB = new File("MenuList_temp.txt");
      File db = new File("MenuList.txt");
      
      
      BufferedReader br2 = new BufferedReader( new FileReader( db ) );
      BufferedWriter bw2 = new BufferedWriter( new FileWriter( tempDB ) );
      
      
      //---------- Delete Dish Record ----------
      
      ID2 =deleteMTextFID.getText();
      
      ID2=" "+ID2+" ";
      while( ( record1 = br2.readLine() ) != null ) {
       
       
       if( record1.contains(ID2) )
        continue;
     
       bw2.write(record1);          
       bw2.flush();                
       bw2.newLine();                    
   
      }
      
      br2.close();
      bw2.close();
      
      db.delete();
      
      //tempDB.renameTo(db);
      
      boolean success = tempDB.renameTo(db);      
      String StatusDel="Status of Deleting dish: "+success;
      deleteStatusL.setForeground(Color.GREEN);
      deleteStatusL.setText(StatusDel);
      
      
      //-------------------------
       //View details------------------------
    
       BufferedReader bR1 = new BufferedReader( new FileReader("MenuList.txt") ); 
       String record2;
       
       int i=0;
       String DisplayView1[]=new String[1024];
       while( ( record2 = bR1.readLine() ) != null )
       {
        StringTokenizer st = new StringTokenizer(record2,",");
        
        IDDelete=st.nextToken();
        nameDelete=st.nextToken();
        PrizeDelete=st.nextToken();
        SorNDelete=st.nextToken();
        IDnoDelete=st.nextToken();
        DisplayView1[i]="ID = "+IDDelete+" *** Name = "+nameDelete+" *** Prize = "+PrizeDelete+" *** Quality = "+SorNDelete+"\n";
        
        deleteMTextA.append(DisplayView1[i]);
        i++;
       }
       bR1.close();
       
       deleteMTextFID.setText("");
     }
    }
    catch(Exception ex)
    {
     System.out.println("Exception msg: "+ex);
    }
    }
    
   });
  }
  //----------------------------------------------------------------
  
  
  mainF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  mainF.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)//For Exit windowClosing event
   {
    int a = JOptionPane.showConfirmDialog(mainF,"Are You Sure you want to exit? ");
    if(a==JOptionPane.YES_OPTION)
    {
     mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   }
  });
  addF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  addF.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)//For Exit windowClosing event
   {
    int a = JOptionPane.showConfirmDialog(addF,"Are You Sure you want to exit? ");
    if(a==JOptionPane.YES_OPTION)
    {
     addF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   }
  });
  viewF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  viewF.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)//For Exit windowClosing event
   {
    int a = JOptionPane.showConfirmDialog(viewF,"Are You Sure you want to exit? ");
    if(a==JOptionPane.YES_OPTION)
    {
     viewF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   }
  });
  deleteF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  deleteF.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)//For Exit windowClosing event
   {
    int a = JOptionPane.showConfirmDialog(deleteF,"Are You Sure you want to exit? ");
    if(a==JOptionPane.YES_OPTION)
    {
     deleteF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   }
  });
  searchF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  searchF.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)//For Exit windowClosing event
   {
    int a = JOptionPane.showConfirmDialog(searchF,"Are You Sure you want to exit? ");
    if(a==JOptionPane.YES_OPTION)
    {
     searchF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   }
  });
  updateF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  updateF.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)//For Exit windowClosing event
   {
    int a = JOptionPane.showConfirmDialog(updateF,"Are You Sure you want to exit? ");
    if(a==JOptionPane.YES_OPTION)
    {
     updateF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   }
  });
  sortF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  sortF.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)//For Exit windowClosing event
   {
    int a = JOptionPane.showConfirmDialog(sortF,"Are You Sure you want to exit? ");
    if(a==JOptionPane.YES_OPTION)
    {
     sortF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   }
  });  
 
  //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  {//Adding details
   addMBtn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae)
    {
     
     try
     {
      String addQval="Select Quality";
      if(addMTextFID.getText().length()!=0&&addMTextFName.getText().length()!=0&&addMTextFPrize.getText().length()!=0&&(!(addMComboBQuality.getSelectedItem().toString().equals(addQval))))
      {
       BufferedWriter bW1=new BufferedWriter(new FileWriter("MenuList.txt",true));
       ID = " "+addMTextFID.getText()+" ";
       name = addMTextFName.getText();
       Prize = addMTextFPrize.getText();
       Quality = addMComboBQuality.getSelectedItem().toString();
       name=name.toLowerCase();
       
       String splitt=ID;
       
       String IDno=splitt.substring(1, splitt.length() -1);
       bW1.write(ID+","+name+","+Prize+","+Quality+","+IDno);
       bW1.flush();
       bW1.newLine();
       bW1.close();
       
       String DetailsAdd="ID: "+ID+"\nName: "+name+"\nPrize: "+Prize+"\nQuality: "+Quality;
       addMTextA.setText(DetailsAdd);
       //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
       addStatusL.setForeground(Color.GREEN);
       addStatusL.setText("Added Details Successfully");
       addMTextFID.setText("");
       addMTextFName.setText("");
       addMTextFPrize.setText("");
      }
     }
     catch(Exception ex)
     {
      System.out.println("Exception msg: "+ex);
     }
    }
   });
  }
  //-----------------------------------------------------------------------
  
  //-------------------------------- Search start --------------------------------
  {//Search Select Event
      searchNameL.setVisible(false);
      searchMTextFName.setVisible(false);
      searchNameBtn.setVisible(false);
      
      searchPrizeL.setVisible(false);
      searchMTextFPrize.setVisible(false);
      searchPrizeBtn.setVisible(false);
      
      searchQualityL.setVisible(false);
      searchMComboBQuality.setVisible(false);
      searchQualityBtn.setVisible(false);
   
    searchMBtn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     
     if(searchMComboBox.getSelectedItem().toString().equals("1"))
     {
      searchMTextFName.setText("");
      searchMTextAForResult.setText("");
      
      searchNameL.setVisible(true);
      searchMTextFName.setVisible(true);
      searchNameBtn.setVisible(true);
      
      searchPrizeL.setVisible(false);
      searchMTextFPrize.setVisible(false);
      searchPrizeBtn.setVisible(false);
      
      searchQualityL.setVisible(false);
      searchMComboBQuality.setVisible(false);
      searchQualityBtn.setVisible(false);
     }
     else if(searchMComboBox.getSelectedItem().toString().equals("2"))
     {
      searchMTextFPrize.setText("");
      searchMTextAForResult.setText("");
      
      searchNameL.setVisible(false);
      searchMTextFName.setVisible(false);
      searchNameBtn.setVisible(false);
      
      searchPrizeL.setVisible(true);
      searchMTextFPrize.setVisible(true);
      searchPrizeBtn.setVisible(true);
      
      searchQualityL.setVisible(false);
      searchMComboBQuality.setVisible(false);
      searchQualityBtn.setVisible(false);
     }
     else if(searchMComboBox.getSelectedItem().toString().equals("3"))
     {
      searchMTextAForResult.setText("");
      
      searchNameL.setVisible(false);
      searchMTextFName.setVisible(false);
      searchNameBtn.setVisible(false);
      
      searchPrizeL.setVisible(false);
      searchMTextFPrize.setVisible(false);
      searchPrizeBtn.setVisible(false);
      
      searchQualityL.setVisible(true);
      searchMComboBQuality.setVisible(true);
      searchQualityBtn.setVisible(true);
     }
     
    }
    
   });
  }
  
  {//Search View Event
  
   
   searchNameBtn.addActionListener(new ActionListener()
   {
   //----------------------------------------------------------------
    public void actionPerformed(ActionEvent ae)
    {
     try
     {
      if(searchMTextFName.getText().length()!=0)
      {
       BufferedReader brSearch1 = new BufferedReader( new FileReader("MenuList.txt") );
       searchMTextAForResult.setText("");
       
       //----------------------------------------------------------------
       String recordSearch1;
       String DisplaySearch1[]=new String[1024];
       
       nameSearchSel =searchMTextFName.getText();
       nameSearchSel=nameSearchSel.toLowerCase();
       int i1=0;
       while( ( recordSearch1 = brSearch1.readLine() ) != null )
       {
        StringTokenizer stSearchView1 = new StringTokenizer(recordSearch1,",");
        if( recordSearch1.contains(nameSearchSel) )
        {
         DisplaySearch1[i1]="ID = "+stSearchView1.nextToken()+" *** Name = "+stSearchView1.nextToken()+" *** Prize = "+stSearchView1.nextToken()+" *** Quality = "+stSearchView1.nextToken()+"\n";
       
         searchMTextAForResult.append(DisplaySearch1[i1]);
         i1++;
        }
       }
       brSearch1.close();
      }
     }
     catch(Exception ex)
     {
      System.out.println("Exception msg: "+ex);
     }
     //----------------------------------------------------------------
    }
   });
   //----------------------------------------------------------------
   searchPrizeBtn.addActionListener(new ActionListener()
   {
    public void actionPerformed(ActionEvent ae)
    {
     try
     {
      if(searchMTextFPrize.getText().length()!=0)
      {
       //----------------------------------------------------------------
       BufferedReader brSearch2 = new BufferedReader( new FileReader("MenuList.txt") );
       searchMTextAForResult.setText("");
       
       //----------------------------------------------------------------
       String recordSearch2;
       String DisplaySearch2[]=new String[1024];
       
       PrizeSearchSel =searchMTextFPrize.getText();
       
       int i2=0;
       while( ( recordSearch2 = brSearch2.readLine() ) != null )
       {
        StringTokenizer stSearchView2 = new StringTokenizer(recordSearch2,",");
        if( recordSearch2.contains(PrizeSearchSel) )
        {        
         DisplaySearch2[i2]="ID = "+stSearchView2.nextToken()+" *** Name = "+stSearchView2.nextToken()+" *** Prize = "+stSearchView2.nextToken()+" *** Quality = "+stSearchView2.nextToken()+"\n";
        
         searchMTextAForResult.append(DisplaySearch2[i2]);
         i2++;
        }
       }
       brSearch2.close();
      }
     }
     catch(Exception ex)
     {
      System.out.println("Exception msg: "+ex);
     }
     //----------------------------------------------------------------
    }
   });
   //----------------------------------------------------------------
   searchQualityBtn.addActionListener(new ActionListener()
   {
    public void actionPerformed(ActionEvent ae)
    {
      try
      {
       
       //----------------------------------------------------------------
       BufferedReader brSearch3 = new BufferedReader( new FileReader("MenuList.txt") );
       searchMTextAForResult.setText("");
       //----------------------------------------------------------------
       String recordSearch3;
       String DisplaySearch3[]=new String[1024];
       
       SorNSearchSel =searchMComboBQuality.getSelectedItem().toString();
        
        int i3=0;
        while( ( recordSearch3 = brSearch3.readLine() ) != null )
        {
         StringTokenizer stSearchView3 = new StringTokenizer(recordSearch3,",");
         if( recordSearch3.contains(SorNSearchSel) )
         {
          DisplaySearch3[i3]="ID = "+stSearchView3.nextToken()+" *** Name = "+stSearchView3.nextToken()+" *** Prize = "+stSearchView3.nextToken()+" *** Quality = "+stSearchView3.nextToken()+"\n";
        
          searchMTextAForResult.append(DisplaySearch3[i3]);
          i3++;
         }
        }
        brSearch3.close();
     //----------------------------------------------------------------
      }
      catch(Exception ex)
      {
       System.out.println("Exception msg: "+ex);
      }
    }
   });
   //----------------------------------------------------------------
 }
 
 //-------------------------------- Search end --------------------------------
 //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  
  
 //-------------------------------- Update start --------------------------------
 {
  updateMTextAForView.setText("");
  updateMTextAForResult.setText("");
  updateStatusL.setText("");
       updateSelectTraceBtn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae)
    {
     try
     {
      IDUpdate1 = " "+updateMTextFID.getText()+" ";
      File dbUpdate = new File("MenuList.txt");
      File tempDBUpdate = new File("MenuList_temp.txt");
      BufferedReader brUpdate = new BufferedReader( new FileReader(dbUpdate) );
      BufferedWriter bwUpdate = new BufferedWriter( new FileWriter(tempDBUpdate) );
     
     
     updateMTextAForView.setText("");
     while( ( recordUpdate1 = brUpdate.readLine() ) != null )
     {
      String DisplayUpdate1;
      
      StringTokenizer stUpdate1 = new StringTokenizer(recordUpdate1,",");
      if( recordUpdate1.contains(IDUpdate1) ) {
       
       DisplayUpdate1="-- Current Record --\nID = "+stUpdate1.nextToken()+"\nName = "+stUpdate1.nextToken()+"\nPrize = "+stUpdate1.nextToken()+"\nQuality = "+stUpdate1.nextToken()+"\n";
      
        updateMTextAForView.setText(DisplayUpdate1);
        
       
      }
     }       
     brUpdate.close();
     bwUpdate.close();
     }
     catch(Exception ex)
     {
      System.out.println("Exception msg: "+ex);
     }
    }
   });
       
 } 
 /****/  
 { 
   //value input
      
   
   //-----------------------------
   
   
    updateMBtn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae)
    {
     
     try
     {
      
      if(updateMTextFPrize.getText().length()!=0&&updateMTextFName.getText().length()!=0)
      {
      IDUpdate1 = " "+updateMTextFID.getText()+" ";
     
      BufferedReader brUpdate = new BufferedReader( new FileReader("MenuList.txt") );
      BufferedWriter bwUpdate2 = new BufferedWriter( new FileWriter("MenuList_temp.txt") );
      //updateMTextFID.setText("");
      updateMTextAForResult.setText("");
      
      IDUpdate2nd = IDUpdate1;
      newNameUpdate = updateMTextFName.getText();
      newNameUpdate=newNameUpdate.toLowerCase();
      
      newPrizeUpdate =  updateMTextFPrize.getText();
      newQualityUpdate= updateMComboBQuality.getSelectedItem().toString();
        
      splittUpdate=IDUpdate2nd;
       
      String IDnoUpdate=splittUpdate.substring(1, splittUpdate.length() -1);
      
      BufferedReader brUpdate2 = new BufferedReader( new FileReader("MenuList.txt") );
      
      while( (recordUpdate2 = brUpdate2.readLine()) != null )
      {       
       if(recordUpdate2.contains(IDUpdate2nd))
       {
        bwUpdate2.write(IDUpdate2nd+","+newNameUpdate+","+newPrizeUpdate+","+newQualityUpdate+","+IDnoUpdate);
        
       }
       else
       {
        bwUpdate2.write(recordUpdate2); 
       }  
            
       bwUpdate2.flush();
       bwUpdate2.newLine();
      }
      brUpdate.close();
      bwUpdate2.close();
      brUpdate2.close();  
      
      File dbUpdate2 = new File("MenuList.txt");
       File tempDBUpdate2 = new File("MenuList_temp.txt");
       
       dbUpdate2.delete();
       
       boolean success =tempDBUpdate2.renameTo(dbUpdate2);
       
       
       String SuccessUpdate="Record Updation status: "+success;
       
      if(success==true)
      {
       updateStatusL.setForeground(Color.GREEN);
       updateStatusL.setText(SuccessUpdate);
      }
      else
      {
       updateStatusL.setForeground(Color.RED);
       updateStatusL.setText(SuccessUpdate);
      }
      String ViewUpdate="-- Updated Record --\nID = "+IDUpdate2nd+"\nName = "+newNameUpdate+"\nPrize = "+newPrizeUpdate+"\nQuality = "+newQualityUpdate;
      updateMTextAForResult.setText(ViewUpdate);
      updateMTextFID.setText("");
      updateMTextFName.setText("");
      updateMTextFPrize.setText("");
      }
     }
     catch(Exception ex)
     {
      System.out.println("Exception msg: "+ex);
     }
    }
   });
        
//-----------------   
 }
 //-------------------------------- Update end --------------------------------
 
 //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
 {//Add Validation-----------------------
  
    addMTextFID.addKeyListener(new KeyAdapter()
    {
     public void keyTyped(KeyEvent ke)
     {
      addValidationID=addMTextFID.getText();
      
      if(addValidationID.length()==0)
      {
       addIDV.setVisible(true);
      }
      else if(addValidationID.length()>0)
      {
       addIDV.setVisible(false);
      }
     }
    });
    
    addMTextFName.addKeyListener(new KeyAdapter()
    {
     public void keyTyped(KeyEvent ke)
     {
      addValidationName=addMTextFName.getText();
      if(addValidationName.length()==0)
      {
       addNameV.setVisible(true);
      }
      else if(addValidationName.length()>0)
      {
       addNameV.setVisible(false);
      }
     }
    });
    
    addMTextFPrize.addKeyListener(new KeyAdapter()
    {
     public void keyTyped(KeyEvent ke)
     {
      addValidationPrize=addMTextFPrize.getText();
      if(addValidationPrize.length()==0)
      {
       addPrizeV.setVisible(true);
      }
      else if(addValidationPrize.length()>0)
      {
       addPrizeV.setVisible(false);
      }
     }
    });
    
    addMComboBQuality.addItemListener(new ItemListener()
    {
     public void itemStateChanged(ItemEvent e)
     {      
      addValidationQuality=addMComboBQuality.getSelectedItem().toString();
      String addQV1="Select Quality";
      String addQV2="Special";
      String addQV3="Normal";
      if(addValidationQuality.equals(addQV1))
      {
       addQualityV.setVisible(true);
      }
      else if((addValidationQuality.equals(addQV2))||(addValidationQuality.equals(addQV2)))
      {
       addQualityV.setVisible(false);
      }
     }          
    });

    
 }
 //--------------------------------------------------------------------------
 
 //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
 {//update Validation-----------------------
  
    updateMTextFID.addKeyListener(new KeyAdapter()
    {
     public void keyTyped(KeyEvent ke)
     {
      delValidationID=updateMTextFID.getText();
      
      if(delValidationID.equals(""))
      {
       delIDV.setVisible(true);
      }
      else if(delValidationID.length()>0)
      {
       delIDV.setVisible(false);
      }
     }
    });
    
    updateMTextFName.addKeyListener(new KeyAdapter()
    {
     public void keyTyped(KeyEvent ke)
     {
      delValidationName=updateMTextFName.getText();
      if(delValidationName.length()==0)
      {
       delNameV.setVisible(true);
      }
      else if(delValidationName.length()>0)
      {
       delNameV.setVisible(false);
      }
     }
    });
    
    updateMTextFPrize.addKeyListener(new KeyAdapter()
    {
     public void keyTyped(KeyEvent ke)
     {
      delValidationPrize=updateMTextFPrize.getText();
      if(delValidationPrize.length()==0)
      {
       delPrizeV.setVisible(true);
      }
      else if(delValidationPrize.length()>0)
      {
       delPrizeV.setVisible(false);
      }
     }
    });
    
    updateMComboBQuality.addItemListener(new ItemListener()
    {
     public void itemStateChanged(ItemEvent e)
     {      
      delValidationQuality=updateMComboBQuality.getSelectedItem().toString();
      String addQV1="Select Quality";
      String addQV2="Special";
      String addQV3="Normal";
      if(delValidationQuality.equals(addQV1))
      {
       delQualityV.setVisible(true);
      }
      else if((delValidationQuality.equals(addQV2))||(delValidationQuality.equals(addQV2)))
      {
       delQualityV.setVisible(false);
      }
     }          
    });

    
 }
 //--------------------------------------------------------------------------
 
 
 
 }
 protected void showDialog() {
   int a = JOptionPane.showConfirmDialog(mainF,"Are You Sure you want to exit? ");
   if(a==JOptionPane.YES_OPTION)
   {//Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
    System.exit(0);
   }
      }
 
 public static void main(String args[])
 {//Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
   new MenuDataSwing();
 }
}

