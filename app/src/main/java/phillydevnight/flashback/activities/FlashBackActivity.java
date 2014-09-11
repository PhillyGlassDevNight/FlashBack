package phillydevnight.flashback.activities;

import android.app.Activity;
import phillydevnight.flashback.services.PresentationService;

class FlashBackActivity extends Activity {
  PresentationService presentationService = new PresentationService();
  
  void onCreate() {
    presentationService.showMainMenu();
  }

  @Override
  public void onResume() {
  }

  @Override
  public void onPause() {
  }
}