package di.soundsystem;

import org.springframework.stereotype.Component;

/**
 * 此处使用@Component注解自动装配bean
 * @author Rebecca 2018年4月2日 上午6:29:45
 * @version 1.0
 */
@Component
public class SgtPeppers implements CompactDisc {

	private final String title = "title";
	private final String artist = "astist";

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+ title + " by " +artist);
	}

}
