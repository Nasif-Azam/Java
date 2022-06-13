
class clockTime {
	int hour, min;
	String AmPm;

	public clockTime(int hour, int min) {
		this.hour = hour;
		this.min = min;
		if (hour >= 24) {
			this.hour = hour % 24;
		}
		updateAP();
	}

	private void updateAP() {
		if (hour >= 12) {
			AmPm = "PM";
		} else {
			AmPm = "AM";
		}
		if (hour > 12) {
			this.hour = hour - 12;
		}
	}

	public clockTime(int h, int m, String AP) {
		hour = h;
		min = m;
		AmPm = AP;
		if (hour >= 24) {
			this.hour = hour % 24;
		}

	}

	void advTime(int min) {
		this.min = this.min + min;
		if (this.min >= 60) {
			int h = min / 60;
			this.hour = hour + h;
			this.min = this.min - h * 60;
			updateAP();
		}

	}

	void display() {
		System.out.println(hour + ": " + min + " " + AmPm);
	}

}

public class InheritanceJava{
	public static void main(String[] args) {

		clockTime obClockTime = new clockTime(25, 30);
		obClockTime.advTime(130);
		obClockTime.display();

	}
}