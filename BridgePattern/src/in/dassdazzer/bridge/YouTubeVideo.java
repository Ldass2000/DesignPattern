package in.dassdazzer.bridge;

public class YouTubeVideo extends Video {
	
	 public YouTubeVideo(VideoProcessor processor) {
	        super(processor);
	    }

	    @Override
	    public void play(String videoFile) {
	        processor.process(videoFile); //Processed as per given processor
	        //Now play
	    }
}
