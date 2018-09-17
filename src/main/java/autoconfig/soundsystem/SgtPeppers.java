package autoconfig.soundsystem;
import org.springframework.stereotype.Component;

@Component("lonlyHeartsClub") //为组件扫描的bean命名
public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.print("Playing " + title + " by " + artist);
  }
  
}
