package data;



/**
 * Diese Klasse übergibt die notwendigen Voreinstellungen an
 * das Spielbrett. Mit dieser Klasse kann man einfacherer an
 * die notwendigen Daten zugreifen.
 * 
 * @author alex
 *
 */
public class GamePresets {
	private String nameS;
	private String nameW;
	private String spielbrett;
	
	
	public GamePresets () {
		
	}
	
	@Override
	public String toString() {
		String out = null;
		out += "Spielername von Weiß: " + this.nameS;
		out += "Spielername von Schwarz: " + this.nameW;
		out += "Spielbrettgröße: " + this.spielbrett;
		return out;
	}

	public String getNameS() {
		return nameS;
	}

	public String getNameW() {
		return nameW;
	}

	public String getSpielbrett() {
		return spielbrett;
	}
	
}
