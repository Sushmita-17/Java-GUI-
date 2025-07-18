import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.awt.event.ActionEvent;    
import java.util.ArrayList;
public class StoreGUI extends JFrame{
    private ArrayList<Store> storeList = new ArrayList<>();
    private JTextField StoreId,StoreNameField,LocationField, OpeningHourField, TotalDiscountField, ProductNameField, MarkedPriceField, VATInclusivePriceField;
    private JCheckBox isPaymentonlineCheckBox;
    private JComboBox<Integer> PurchasedYearComboBox;
    private JTextArea displayArea;
    private JFrame departmentFrame;
    private JFrame retailerFrame;
    public StoreGUI() {
        JFrame frame= new JFrame("Store Management System");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
      
        JLabel Jlabel2,jlabel3,jlabel4,jlabel5,jlabel6,jlabel7,jlabel8,jlabel9,jlabel10,jlabel11,jlabel12;
        
        setTitle("Store Management System");
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
         
         JFrame departmentframe = new JFrame();;
         departmentframe.setLayout(null);
         departmentframe.setSize(400,500);
         departmentframe.setVisible(true);
         departmentframe.setTitle("Store GUI");
         
         
         
         
        
        
        JLabel departmentlabel1 = new JLabel("StoreId");
        departmentframe.add(departmentlabel1);
        departmentlabel1.setBounds(20, 20, 100, 30);
        

        JTextField StoreIdt1 = new JTextField();
        departmentframe.add(StoreIdt1);
        StoreIdt1.setBounds(130, 20, 200, 30);
        
        
        JLabel departmentlabel2 = new JLabel("StoreName");
        departmentframe.add(departmentlabel2);
        departmentlabel2.setBounds(20, 60, 100, 30);
        
        JTextField StoreNamet2 = new JTextField();
        departmentframe.add(StoreNamet2);
        StoreNamet2.setBounds(130, 60, 200, 30);
        
        JLabel departmentlabel3 = new JLabel("Location");
        departmentframe.add(departmentlabel3);
        departmentlabel3.setBounds(130, 60, 200, 30);
        
        JTextField Locationt3 = new JTextField();
        departmentframe.add(Locationt3);
        Locationt3.setBounds(150,100,215,30);
        
        JLabel departmentlabel4 = new JLabel("OpeningHour");
        departmentframe.add(departmentlabel4);
        departmentlabel4.setBounds(20, 95, 100, 30);
        
        JTextField OpeningHourt4 = new JTextField();
        departmentframe.add(OpeningHourt4);
        OpeningHourt4.setBounds(130, 140, 200, 30);
        
        JLabel departmentlabel5 = new JLabel("TotalSales");
        departmentframe.add(departmentlabel5);
        departmentlabel5.setBounds(20,135,100,30);
        
        JTextField TotalSalest5 = new JTextField();
        departmentframe.add(TotalSalest5);
        TotalSalest5.setBounds(150,180,200,30);
        
        JLabel departmentlabel6 = new JLabel("Total Discount");
        departmentframe.add(departmentlabel6);
        departmentlabel6.setBounds(20,175,100,30);
        
        JTextField TotalDiscountt6 = new JTextField();
        departmentframe.add(TotalDiscountt6);
        TotalDiscountt6.setBounds(130, 220, 200, 30);
        
        JLabel departmentlabel7 = new JLabel("ProductName");
        departmentframe.add(departmentlabel7);
        departmentlabel7.setBounds(20,210,100,30);
        
        JTextField ProductNamet7 = new JTextField();
        departmentframe.add(ProductNamet7);
        ProductNamet7.setBounds(150,260, 200,30);
        
        JLabel departmentlabel8 = new JLabel("MarkedPrice");
        departmentframe.add(departmentlabel8);
        departmentlabel8.setBounds(20, 250, 100, 30);
        
        JTextField MarkedPricet8 = new JTextField();
        departmentframe.add(MarkedPricet8);
        MarkedPricet8.setBounds(130, 295, 200, 30);
        
        JLabel departmentlabel9 = new JLabel("SellingPrice");
        departmentframe.add(departmentlabel9);
        departmentlabel9.setBounds(20, 285, 100, 30);
        
        JTextField SellingPricet9 = new JTextField();
        departmentframe.add(SellingPricet9);
        SellingPricet9.setBounds(130, 350, 200, 30);
        
        JLabel departmentlabel10 = new JLabel("VATInclusivePrice");
        departmentframe.add(departmentlabel10);
        departmentlabel10.setBounds(20,350, 120, 30);
        
        JTextField VATInclusivePricet10 = new JTextField();
        departmentframe.add(VATInclusivePricet10);
        VATInclusivePricet10.setBounds(130, 420, 100, 30);
        
        
        JLabel departmentlabel11 = new JLabel("LoyaltyPoint");
        departmentframe.add(departmentlabel11);
        departmentlabel11.setBounds(20, 420, 100, 30);
        
        
        JTextField LoyaltyPointt11 =  new JTextField();
        departmentframe.add(LoyaltyPointt11);
        LoyaltyPointt11.setBounds(130, 420, 200, 30);
        
        JLabel departmentlabel12 = new JLabel("isInSales");
        departmentframe.add(departmentlabel12);
        departmentlabel12.setBounds(20, 460, 100, 30);
        
        JTextField isInSalest12 = new JTextField();
        departmentframe.add(isInSalest12);
        isInSalest12.setBounds(130, 460, 200, 30);
        
        
        // Creating the frame for retailer and labeling them 
        
        JFrame retailerframe = new JFrame();
        retailerframe.setVisible(true);
        retailerframe.setLayout(null);
        retailerframe.setVisible(true);
        retailerframe.setSize(400,600);
        retailerframe.setTitle("Store GUI");
        
        JLabel retailerLabel1 = new JLabel("StoreId");
        retailerframe.add(retailerLabel1);
        retailerLabel1.setBounds(20, 20, 100, 30);
    
        
        JTextField StoreIdf1 = new JTextField();
        retailerframe.add(StoreIdf1);
        StoreIdf1.setBounds(130, 20, 200, 30);
        
        
        JLabel retailerLabel2 = new JLabel("StoreName");
        retailerframe.add(retailerLabel2);
        retailerLabel2.setBounds(20, 60, 100, 30);
        
        JTextField StoreNamef2 = new JTextField();
        retailerframe.add(StoreNamef2);
        StoreNamef2.setBounds(130, 60, 200, 30);
        
        JLabel retailerLabel3 = new JLabel("Location");
        retailerframe.add(retailerLabel3);
        retailerLabel3.setBounds(20, 75, 200, 30);
        
    
         JTextField Locationf3 = new JTextField();
         retailerframe.add(Locationf3);
         Locationf3.setBounds(130, 100, 200, 30);
        
        JLabel retailerLabel4 = new JLabel("OpeningHour");
        retailerframe.add(retailerLabel4);
        retailerLabel4.setBounds(20, 140, 100, 30);
        
        JTextField OpeningHourf4 = new JTextField();
        retailerframe.add(OpeningHourf4);
        OpeningHourf4.setBounds(130, 140, 200, 30);
        
        JLabel retailerLabel5 = new JLabel("TotalSales");
        retailerframe.add(retailerLabel5);
        retailerLabel5.setBounds(20,200,100,25);
        
        JTextField TotalSalesf5 = new JTextField();
        retailerframe.add(TotalSalesf5);
        TotalSalesf5.setBounds(130, 140, 200, 30);
        
        JLabel retailerLabel6 = new JLabel("TotalDiscount");
        retailerframe.add(retailerLabel6);
        retailerLabel6.setBounds(20, 100, 100, 30);
        
        JTextField TotalDiscountf6 = new JTextField();
        retailerframe.add(TotalDiscountf6);
        TotalDiscountf6.setBounds(130, 200, 200, 30);
        
        JLabel retailerLabel7 = new JLabel("VATInclusivePrice");
        retailerframe.add(retailerLabel7);
        retailerLabel7.setBounds(20, 260, 120, 30);
        
        JTextField VATInclusivePricef7 = new JTextField();
        retailerframe.add(VATInclusivePricef7);
        VATInclusivePricef7.setBounds(150, 260, 180, 30);
        
        
        JLabel retailerLabel8 = new JLabel("isPaymentonline");
        retailerframe.add(retailerLabel8);
        retailerLabel8.setBounds(20, 300, 120, 30);
        
        
        JLabel retailerLabel9 = new JLabel("PurchasedYear");
        retailerframe.add(retailerLabel9);
        retailerLabel9.setBounds(20,375,100,50);
        
        
        JLabel retailerlabel10= new JLabel("LoyaltyPoint");
        retailerframe.add(retailerlabel10);
        retailerlabel10.setBounds(20, 350, 125, 30);
        
        JTextField LoyaltyPointf10 = new JTextField();
        retailerframe.add(LoyaltyPointf10);
        LoyaltyPointf10.setBounds(130, 350, 200, 30);
        
        
        
        
        
        //Displaying the Check Box 
        JCheckBox isPaymentonlineCheckBox = new JCheckBox("isPaymentonline");
        retailerframe.add(isPaymentonlineCheckBox);
        isPaymentonlineCheckBox.setBounds(150,300,180,30);
        
          
          
        //Displaying the Combo Box
        String[] PurchasedYear ={"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
        JComboBox PurchasedYearCombo = new JComboBox( PurchasedYear);
        retailerframe.add(PurchasedYearCombo);
        PurchasedYearCombo.setBounds(20,420,150,25);
        
        
        //creation of Department Buttons 
        JButton Departmentbutton = new JButton(" Add Department");
        Departmentbutton.setBounds(800,195,150,30);
        frame.add(Departmentbutton);
        
        // Adding a retailer buttons
        JButton Retailerbutton = new JButton(" Add Retailer");
        Retailerbutton.setBounds(800,220,150,30);
        frame.add(Retailerbutton);
         
        // Creation of Calculating  Discount price Button 
        JButton CalculateDiscountPricebutton = new JButton("CalculateDiscountPrice");
        CalculateDiscountPricebutton.setBounds(800,250,150,30);
        frame.add(CalculateDiscountPricebutton);
        
        // Button for SetLoyaltyPoint
        JButton SetLoyaltyPointbutton = new JButton("SetLoyaltyPoint");
        SetLoyaltyPointbutton.setBounds(800,275,150,30);
        frame.add(SetLoyaltyPointbutton);
        
        
        // Removing the product 
        JButton Removeproductbutton = new JButton("Removeproduct");
        Removeproductbutton.setBounds(800,295,150,30);
        frame.add(Removeproductbutton);
        
        
        //Button for displaying the details
        JButton Displaybutton = new JButton("Display");
        Displaybutton.setBounds(800,315,150,30);
        frame.add(Displaybutton);
        
          
        //Clear button for clearing the button
        JButton Clearbutton = new JButton("Clear");
        Clearbutton.setBounds(800,335,150,35);
        frame.add(Clearbutton);
       // back buttons
        JButton Backbutton = new JButton("Back");
        Backbutton.setBounds(70,20,75,30);
        frame.add(Backbutton);
    
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBounds(20,500,740,200);
        frame.add(scrollPane);
        
        
        
        
        
        
        
        
        
        // Button of Departments with adding ActionListener 
          Departmentbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             try{
                     int storeid = Integer.parseInt(StoreIdt1.getText());
                     String storename = StoreNamet2.getText();
                     String location = Locationt3.getText();
                     String openinghour = OpeningHourt4.getText();
                     double totalsales = Double.parseDouble(TotalSalest5.getText());
                     double totaldiscount = Double.parseDouble(TotalDiscountt6.getText());
                     String productname = ProductNamet7.getText();
                     double markedprice = Double.parseDouble(MarkedPricet8.getText());
                     
                     //arraylist to add obj
                   
                     
                       Department departmentobj = new Department(storeid,storename,location,openinghour,totalsales,totaldiscount,productname,markedprice );
                       storeList.add(departmentobj);
                      
                      
        
                     
                     //to check whether the field is empty or not
                     if(storeid == 0 || storename.isEmpty()|| location.isEmpty()|| totalsales == 0.0|| totaldiscount ==0.0 ||productname.isEmpty()){
                       JOptionPane.showMessageDialog(frame, "Please fill all fields");
                    } else{
                        JOptionPane.showMessageDialog(frame,"Department is added Sucessfully");
                    
                    }
                    } catch(NumberFormatException ex) {
                       JOptionPane.showMessageDialog(frame,"please enter valid integers","Input Error",JOptionPane.ERROR_MESSAGE);
                    
         }
         
        }
    }); 
     
     
            
              // Adding button of retailer with actionlistener implementing them by try and catch 
              Retailerbutton.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e) {
                      
                       try{
                           int Storeid = Integer.parseInt(StoreIdf1.getText());
                           String Storename = StoreNamef2.getText();
                           String location = Locationf3.getText();
                           String openingHour = OpeningHourf4.getText();
                           double totalSales = Double.parseDouble(TotalSalesf5.getText());
                           double totalDiscount = Double.parseDouble(TotalDiscountf6.getText());
                           int VATInclusiveprice = Integer.parseInt(VATInclusivePricef7.getText());
                           boolean isPaymentonline = isPaymentonlineCheckBox.isSelected();
                           String PurchasedYear = (String)PurchasedYearCombo.getSelectedItem();
                           int loyaltyPoint = Integer.parseInt(LoyaltyPointf10.getText());
                           
                           
                           //to add in arraylist
                            Retailer retailerobj = new Retailer (Storeid,Storename, location, openingHour, totalSales, totalDiscount, VATInclusiveprice,loyaltyPoint, isPaymentonline, PurchasedYear);
                            storeList.add(retailerobj);
                           
                           //To check whether filled is empty or not
                           if(Storeid == 0||Storename.isEmpty() |location.isEmpty() || openingHour.isEmpty() || totalSales == 0 || totalDiscount == 0 || PurchasedYear.isEmpty()){
                             JOptionPane.showMessageDialog(frame,"please fill out this field");
                           }else{
                               JOptionPane.showMessageDialog(frame,"Retailer is added sucessfully");
                            }
                          }catch(NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame,"please enter valid integers","Input Error",JOptionPane.ERROR_MESSAGE);
                    
               
                } 
            
    }
    });
                // Calculating  discount price
                CalculateDiscountPricebutton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                     try {
                          int StoreId = Integer.parseInt(StoreIdt1.getText());
                          double MarkedPrice = Double.parseDouble(MarkedPricet8.getText());
                          boolean isInSales = Boolean.parseBoolean(isInSalest12.getText());
                          
                          
                          boolean found = false;
                          for(Store store: storeList ) {
                         if(store.getstoreid()==(StoreId) && store instanceof Department) {
                          Department department =(Department) store;
                          //double discountPrice = department.Calculatediscountprice(isInSales,markedprice);
                          //JOptionPane.showMessageDialog(null,"Discount Price :"+discountPrice);
                          found = true;
                          break;
                             
                                 
                        }
                      }
                      if (! found) {
                          JOptionPane.showMessageDialog(frame,"Store ID did not found.");
                      }
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Please enter a valid Store ID.","Input Error",JOptionPane.ERROR_MESSAGE);
                        
                    }
                }
       
                               
    }); 
            // Setting loyalty Points
    
                SetLoyaltyPointbutton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try{
                            int StoreId = Integer.parseInt(StoreIdt1.getText());
                            int LoyaltyPoint = Integer.parseInt(LoyaltyPointf10.getText());
                            boolean isPaymentOnline = isPaymentonlineCheckBox.isSelected();
                            boolean found = false;
                            for (Store store:storeList) {
                                if(store.getstoreid() == StoreId && store instanceof Retailer) {
                                 Retailer retailer = (Retailer) store;
                                 double VATInclusiveprice = retailer.getVATInclusiveprice();
                                 //retailer.setLoyaltyPoint((int) VATInclusiveprice);
                                 
                                 JOptionPane.showMessageDialog(frame,"Loyalty Points are setted sucessfully");
                                 found = true;
                                 break;
                                } 
                            }
                             if(!found) {
                                 JOptionPane.showMessageDialog(frame,"Store ID did not found.");
                                }
                                }catch(NumberFormatException ex){
                                 JOptionPane.showMessageDialog(frame,"Invalid input.Please enter a valid Store ID.","Input Error",JOptionPane.ERROR_MESSAGE);
                        
                    }
        }
    });
                     Removeproductbutton.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent e) {
                         try{
                             int storeid = Integer.parseInt(StoreIdt1.getText());
                             String ProductName = ProductNamet7.getText();
                             boolean storefound = false;
                           for( Store store:storeList) {
                               if(store.getstoreid() ==  storeid && store instanceof Retailer) {
                               Retailer retailer = (Retailer)store; 
                               retailer.removeProduct();
                               JOptionPane.showMessageDialog(frame,"Product has been removed sucessfully.");
                               storefound = true;
                               break;
                               
                            }
                          }
                          if(!storefound){
                            JOptionPane.showMessageDialog(frame,"Store ID didn't found.");
                          }
                      } catch(NumberFormatException ex) {
                          JOptionPane.showMessageDialog(frame,"Please enter a valid Store ID.","Input Error",JOptionPane.ERROR_MESSAGE);
                      }
                    }
       });
    
      
                    // Displaying the buttons
                   Displaybutton.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                      try{ 
                         JTextArea displayTextArea = new JTextArea();
                         displayTextArea.setEditable(false);
                         for(Store store:storeList) {
                             displayTextArea.append("Store ID:" +store.getstoreid()+"\n");
                             displayTextArea.append("Store Name:" + store.getstorename()+"\n");
                             displayTextArea.append("Location:"+ store.getlocation()+"n");
                             displayTextArea.append("OpeningHour:" + store.getopeninghour()+"\n");
                             displayTextArea.append("TotalSales:" + store.gettotalsales()+"\n");
                             displayTextArea.append("TotalDiscount:" + store.gettotaldiscount()+"\n");
                        if( store instanceof Department) {
                            Department department = (Department) store;
                            displayTextArea.append("Product Name:" + department.getproductname());
                            displayTextArea.append("Marked Price:" + department.getmarkedprice());
                            displayTextArea.append("Selling Price:" + department.getsellingprice());
                            
                        } else if(store instanceof Department){
                            Retailer retailer = (Retailer) store;
                            displayTextArea.append("VAT Inclusive Price:" + retailer.getVATInclusiveprice());
                            displayTextArea.append("Loyalty Point:"  + retailer.getloyaltyPoint());
                            displayTextArea.append("is Payment online:" + retailer.getisPaymentonline());
                            displayTextArea.append("Purchased Year:" + retailer.getPurchasedYear());
                           JOptionPane.showMessageDialog(frame,displayTextArea, "store List", JOptionPane.INFORMATION_MESSAGE);
                        }
                             

                     } 
                    }catch(NumberFormatException ex) {
                         JOptionPane.showMessageDialog(frame,"An error caused while displaying information","Error", JOptionPane.ERROR_MESSAGE);
                         
                     }
                       
                 }
                });
                 //clear buttons 
                 Clearbutton.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     StoreIdt1.setText("StoreId");
                     StoreNamet2.setText("");
                     Locationt3.setText("");
                     OpeningHourt4.setText("");
                    TotalSalest5.setText("");
                    TotalDiscountt6.setText("");
                    ProductNamet7.setText("");
                    MarkedPricet8.setText("");
                    SellingPricet9.setText("");
                    VATInclusivePricet10.setText("");
                    LoyaltyPointt11.setText("");
                    isPaymentonlineCheckBox.setSelected(false);
                    PurchasedYearCombo.setSelectedIndex(0);
                    displayArea.setText("");
         }
     });
        frame.setVisible(true);
 }    
    
  public static void main(String[] args) {
          
 }
}
    
    
        
                  