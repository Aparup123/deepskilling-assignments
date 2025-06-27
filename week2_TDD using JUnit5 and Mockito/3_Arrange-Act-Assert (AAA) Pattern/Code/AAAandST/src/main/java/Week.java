import java.util.HashMap;
import java.util.Map;

public class Week implements WeekInterface {

	private Map<Integer, String> days = new HashMap<>();

	Week() {
		days.put(1, "Monday");
		days.put(2, "Tuesday");
		days.put(3, "Wednesday");
		days.put(4, "Thursday");
		days.put(5, "Friday");
		days.put(6, "Saturday");
		days.put(7, "Sunday");
	}
	
	@Override
	public String getDayName(int dayNumber) {
		if (!days.containsKey(dayNumber)) {
			throw new InvalidDayException("Day " + dayNumber + " does not exist in the week.");
		}
		return days.get(dayNumber);
	}

	@Override
	public boolean isValidDay(int dayNumber) {
		boolean valid = (dayNumber <= 7 && dayNumber >= 1);
		return valid;
	}

	@Override
	public void clean() {
		days.clear();
	}

}
