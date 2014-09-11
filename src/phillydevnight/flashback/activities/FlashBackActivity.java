package phillydevnight.flashback.activities;

class FlashBackActivity() extends Activity {
  PresentationService presentationService = new PresentaionService();
  
  void onCreate() {
    presentationService.showMainMenu();
  }
  
  void onResume() {
  }
  
  void onPause() {
  }
}