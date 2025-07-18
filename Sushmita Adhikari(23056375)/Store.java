//class Store
 public class Store{
    
    private int storeid;
    private String storename;
    private String location;
    private String openinghour;
    private double totalsales;
    private  double  totaldiscount;
    
    
     //constructor method
    
    public Store(int storeid,String storename,String location,
    String openinghour) {
        this.storeid = storeid;
        this.storename = storename;
        this.location = location;
        this.openinghour = openinghour;
        this.totalsales = 0.0;
        this.totaldiscount = 0.0;
    }
    //accessor method
    public int getstoreid() {
        return this.storeid;
        
    }
    public String getstorename() {
        return this.storename;
        
    
}
    public String getlocation() {
        return this.location;
         
         
     }
     public String getopeninghour() {
         return this.openinghour;
         
     }
     public double gettotalsales() {
         return this.totalsales;
         
     }
     public double gettotaldiscount() {
         return this.totaldiscount;
     }
     //setter method to set totalsales
     public void settotalsales(double totalsales) {
         this.totalsales += totalsales;
     }
     //method to set total discount
     public void  settotaldiscount(double totaldiscount) {
         this.totaldiscount += totaldiscount;
     }
     
     public void displayinfo() {
         System.out.println("storeid:" + storeid);
         System.out.println("storename:" + storename);
         System.out.println("location:" + location);
         System.out.println("openinghour:" + openinghour);
         
         
         if(totalsales ==0.0 && totaldiscount ==0.0)
         {
             System.out.println("" + totalsales);
    } else{
        System.out.println("" + totaldiscount);
    } 
} 
}

    
    
    
    
    



      

    
    


  