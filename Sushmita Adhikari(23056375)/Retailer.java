public class Retailer extends Store{
    private int VATInclusiveprice;
    private int loyaltyPoint;
    private boolean  isPaymentonline;
    private String PurchasedYear;
    
    
    
    //constructor method
    public Retailer(int storeId,String storeName,String location,
    String openingHour,double totalsales,double totalDiscount,
    int VATInclusiveprice,int loyaltyPoint,boolean ispaymentonline,String PurchasedYear)
    {
        super(storeId,storeName,location,openingHour);
        super.settotaldiscount(totalDiscount);  
        super.settotalsales(totalsales);
        this.VATInclusiveprice = VATInclusiveprice;
        this.loyaltyPoint = 0;
        this.isPaymentonline = isPaymentonline;
        this.PurchasedYear = PurchasedYear;
        
        
        
    }
    //accessor method
     public double getVATInclusiveprice() {
         return this.VATInclusiveprice;
         
     }
     public int getloyaltyPoint() {
         return this.loyaltyPoint;
         
     }
     public boolean getisPaymentonline() {
         return this.isPaymentonline;
     }
     public String getPurchasedYear() {
         return this.PurchasedYear;
     }
     //mutator method for ispaymentonline
     public void setisPaymentOnline(boolean isPaymentonline) {
         
        this.isPaymentonline = isPaymentonline;
    
}
     // method to calculateloyaltypoint
     public void  calculateloyaltyPoint(boolean ispaymentonline,
      int VATInclusiveprice) {
         if (ispaymentonline) {
             double loyaltyPointPercentage = 0.01;
             this.loyaltyPoint = (int) (VATInclusiveprice * loyaltyPointPercentage);
                 
             }  
         }
         
         //method to remove product
         public void removeProduct() {
             if (loyaltyPoint == 0 && (PurchasedYear.equals("2020")||
             PurchasedYear.equals("2021")||
             PurchasedYear.equals("2022"))){
               VATInclusiveprice= 0;
               loyaltyPoint=0;
               isPaymentonline= false;
            
         
     }
         
     }
     //method to display
     public void displayinfo() {
        super.displayinfo(); 
        if(loyaltyPoint ==0 && (PurchasedYear.equals("2020")||
        PurchasedYear.equals("2021")||
        PurchasedYear.equals("2022"))) {
            System.out.println("Product has been removed'");
            System.out.println("VATInclusivePrice:" + VATInclusiveprice);
            System.out.println("LoyaltyPoint:" + loyaltyPoint);
            System.out.println("PurchasedYear:" + PurchasedYear);
        }
        

    }

}