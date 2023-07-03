package facadepattern;

public class User {

	public static void main(String[] args) {
		RoomLights  roomLights  =  new RoomLights();
		SoundSystem soundSystem =  new SoundSystem();
		Television television   =  new Television();
		
		HomeTheatreFacade facade =  new HomeTheatreFacade(roomLights ,soundSystem,television );
		
		facade.watchMovie();
		
		facade.stopWatchingMovie();

	}

}

/*
 *  Tv On
    light dim
    Sound System is Off
    Tv off
    lights bright
 */
