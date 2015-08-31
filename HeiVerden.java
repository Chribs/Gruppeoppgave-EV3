/*
	Her skal vi sjekke at vi er koblet rett til lejoen
*/
import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;

public class HeiVerden {
	public static void main(String[] args) throws Exception{
		System.out.println("Hei verden!");
		Thread.sleep(500);

		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();
		lcd.drawString("Hei EV3!", 4, 1);
		keys.waitForAnyPress();
	}
}