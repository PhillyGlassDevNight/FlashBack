package phillydevnight.flashback.services;

class PresentationService() implements LocationListCallback {
  CardScrollAdapater mainMenuAdapter = null;
  
  void showMainMenu() {
    CardScrollAdapater mainMenuAdapter = new CardScollAdapter();
    // Add all required cards
    
    // Set content view somehow
    
    // Set click listeners for card
  }
  
  void showDescriptionMenu() {
    
  }
  
  void showLocationPicker() {
    locationSerivce.getListofLocationsNearUser(this)
    locationAdapter = new CardScrollAdapter();
    setContentView(locationAdapter)
  }
  
  void locationListCallback(ArrayList<Location> location_list) {
    for(Location location : ArrayList<Location>location_list) {
      // Build a card for each location
      locationAdapter.add_card();
    }
  }
  
  void back() {
  }
}