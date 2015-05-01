public interface InterfaceILoader 
{
   public void load();     //This loads up all the data
   public void save();     //This saves all the data
   
   //User management
   public int tryLogin(String username, String password);
   public int getUserType(String username);
   public void makeNewUser(String username, String password, String firstName, String lastName, String email);
   
   //Functions to get information about particular wish
   public String[] getWishes(String username);
   public String getFromAirport(String username, int numberOfWish);
   public String getToAirport(String username, int numberOfWish);
   public String getFlightMaxPrixe(String username, int numberOfWish);
   public String getDateOfDeparture(String username, int numberOfWish);
   public String getDateOfReturn(String username, int numberOfWish);
   public String getDepartureAverageDays(String username, int numberOfWish);
   public String getReturnAverageDays(String username, int numberOfWish);
   public int getNumberOfPeople(String username, int numberOfWish);
   public int getContactBeforeBooking(String username, int numberOfWish);
   public int getReserveWithoutPaying(String username, int numberOfWish);
   public int getPayImmidiately(String username, int numberOfWish);
   public String[] getAddons(String username, int numberOfWish);
   public String[] getAddonsOfferPrices(String username, int numberOfWish);
   
   //Wish management.
   public void makeNewWish();
   public void deleteWish(String username, int numberOfWish);
}