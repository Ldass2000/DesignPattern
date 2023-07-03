package facadepattern;

public class HomeTheatreFacade {
	 RoomLights  roomLights;
	 SoundSystem soundSystem;
	 Television television;
	 
	public HomeTheatreFacade(RoomLights roomLights, SoundSystem soundSystem, Television television) {
		
		this.roomLights = roomLights;
		this.soundSystem = soundSystem;
		this.television = television;
	}
	 
	public void watchMovie() {
		soundSystem.switchOnSoundSystem();
		television.switchOnTv();
		roomLights.lightsDim();
	}
	
	public void stopWatchingMovie() {
	  soundSystem.switchOffSoundSystem();
	  television.switchOffTv();
	  roomLights.lightsBright();
	}
	
	
}
