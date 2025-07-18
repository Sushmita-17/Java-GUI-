public class Department extends Store {
    private String productname;
    private double markedprice;
    private double sellingprice;
    private boolean isInSales;
    
    
    //constructor method
    public Department(int storeid,String storename,String location,
    String openinghour,double totalsales,double totaldiscount,String 
    productname,double markedprice) 
    {
        super(storeid,storename,location,openinghour);
        super.settotalsales(totalsales);
        super.settotaldiscount(totaldiscount);
        this.productname = productname;
        this.markedprice = markedprice;
        this.sellingprice = 0.0;
        this.isInSales = true;
        
    }
    //accessor methods
    public String getproductname() {
        return this.productname;
    }
    public double getmarkedprice() {
        return this.markedprice;
    }
    public double getsellingprice() {
        return this.sellingprice; 
    }
    public boolean getisInsales() {
        return this.isInSales;
    }
    //mutator method for markedprice
    public void setmarkedprice(double markedprice) {
        this.markedprice = markedprice;
    }
    //method named calculatediscountprice
    public void Calculatediscountprice(boolean isInSales,double markedprice){
        double sellingprice= 0;
        double discountpercentage = 0;
        
        if (markedprice>=5000){
            discountpercentage = 0.02;
            
        } else if(markedprice>=3000) {
            discountpercentage = 0.03; 
        
        } else if(markedprice>=1000) {
            discountpercentage=0.05;
            
        } else {
            discountpercentage=0;
        }
        this.sellingprice = markedprice -(markedprice-discountpercentage);
        super.settotaldiscount(markedprice *discountpercentage);
        isInSales=false;
        
        }
        
       
       
        public void displayinfo() {
         super.displayinfo();
         if(isInSales) {
             System.out.println("productname:" + productname);
             System.out.println("markedprice:" + markedprice);
             
             
         }else {
             System.out.println("productname:" + productname);
             System.out.println("sellingprice:" +sellingprice);
            }  
        }   
        }
        
    
    
    
  
        
    

     