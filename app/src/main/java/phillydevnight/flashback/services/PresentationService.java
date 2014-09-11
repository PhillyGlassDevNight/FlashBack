package phillydevnight.flashback.services;

import phillydevnight.flashback.services.LocationService;
import phillydevnight.flashback.services.LocationService.LocationListCallback;
import phillydevnight.flashback.models.Location;
import com.google.android.glass.widget.CardScrollAdapter;

import java.util.ArrayList;

public class PresentationService {
  LocationService locationService = null;
  CardScrollAdapter mainMenuAdapter = null;
  
  public void showMainMenu() {
    // Add all required cards
    
    // Set content view somehow
    
    // Set click listeners for card
  }
  
  public void showDescriptionMenu() {
    
  }
  
  public void showLocationPicker() {
    //locationService.getListofLocationsNearUser(this);
    //locationAdapter = new CardScrollAdapter();
    //setContentView(locationAdapter);
  }
  
  public void locationListCallback(ArrayList<Location> location_list) {
    //for(Location location : ArrayList<Location>location_list) {
    //  // Build a card for each location
    //  locationAdapter.add_card();
    //}
  }
  
  public void back() {
  }

  public void onSuccess() {
      return;
  }
}