public class FileLoader implements InterfaceILoader
{
   public void load()
   {
      System.out.println("We just loaded up a lot of things");
   }
   
   public void save()
   {
      System.out.println("We just saved everything");
   }
   
   public int tryLogin(String username, String password){
      System.out.println("Logged in");
      return 1;
   }
   public int getUserType(String username){
      System.out.println("It's a normal user");
      return 0;
   }
   public void makeNewUser(String username, String password, String firstName, String lastName, String email){
      //yep
   }
   
   
   
   
   public String[] getWishes(String username){
      String wishList[];
      wishList = new String[3];
      
      wishList[0] = "CPH - BKK  05.03.2011";
      wishList[1] = "JPN - USA  11.03.2012";
      wishList[2] = "GER - DKK  22.03.2013";
      wishList[3] = "CHN - ANT  32.12.2014";
      return wishList;
   }
   
   public String getFromAirport(String username, int numberOfWish){
      return "CPH";
   }
   public String getToAirport(String username, int numberOfWish){
      return "BKK";
   }
   public String getFlightMaxPrixe(String username, int numberOfWish){
      return "9999Kr";
   }
   public String getDateOfDeparture(String username, int numberOfWish){
      return "05.04.2011";
   }
   public String getDateOfReturn(String username, int numberOfWish){
      return "08.04.2011";
   }
   public String getDepartureAverageDays(String username, int numberOfWish){
      return "2";
   }
   public String getReturnAverageDays(String username, int numberOfWish){
      return "0";
   }
   public int getNumberOfPeople(String username, int numberOfWish){
      return 5;
   }
   public int getContactBeforeBooking(String username, int numberOfWish){
      return 0;
   }
   public int getReserveWithoutPaying(String username, int numberOfWish){
      return 1;
   }
   public int getPayImmidiately(String username, int numberOfWish){
      return 0;
   }
   public String[] getAddons(String username, int numberOfWish){
      String addonList[];
      addonList = new String[3];
      
      addonList[0] = "Elephant tour  999Kr";
      addonList[1] = "Car rental 5999Kr";
      addonList[2] = "Submarine ride 50Kr";
      addonList[3] = "Hotel 570Kr";
      return addonList;
   }
   public String[] getAddonsOfferPrices(String username, int numberOfWish){
      String offerList[];
      offerList = new String[3];
      
      offerList[0] = "8009Kr";
      offerList[1] = "99Kr";
      offerList[2] = "30Kr";
      offerList[3] = "560Kr";
      return offerList;
   }
   
   //Wish management.
   public void makeNewWish(){
   
   }
   public void deleteWish(String username, int numberOfWish){
   
   }

   
   
   
   
   
   
   
}