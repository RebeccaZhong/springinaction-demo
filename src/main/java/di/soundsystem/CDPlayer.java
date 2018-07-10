package di.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	@Autowired(required = false)	// 不强制注入，注意NullPointerException
	public CDPlayer (CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

	@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	@Autowired
	public void insertDist(CompactDisc cd) {
		this.cd = cd;
	}

}
