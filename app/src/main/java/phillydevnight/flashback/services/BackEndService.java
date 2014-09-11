package phillydevnight.flashback.services;

class BackEndService {
  void upload_story(Story story, UploadCallback callback) {
    // Marshaling bytes, 
    // Start HTTP request
  }
  
  void upload_audio_story(AudioStory story, UploadCallback callback) {
    callback.success();
  }
}