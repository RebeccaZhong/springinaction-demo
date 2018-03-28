package di.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private final String title = "title";
	private final String artist = "astist";

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+ title + " by " +artist);
	}

}
