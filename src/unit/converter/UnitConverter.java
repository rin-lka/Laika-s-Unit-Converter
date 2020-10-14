
package unit.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class UnitConverter {

	public static double roundTo(double sum) {
		return ((long) (sum < 0 ? sum * 100 - 0.5 : sum * 100 + 0.5)) / 100.0;
	}

	private static final String DATE_FORMAT = "hh:mm:ss a";

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		Calendar calendar = new GregorianCalendar();
		TimeZone userLocal = TimeZone.getDefault();

		System.out.println("Welcome to the Unit Converter, Now supporting time!");
		System.out.println("It's currently: " + calendar.getTime());
		System.out.println("----------------------------------------");
		System.out.println("Supported timezone inputs are identical to java.util.TimeZone.");
		System.out.println("Timezone conversion also appears to be one hour out.");
		System.out.println("----------------------------------------");
		System.out.println("What would you like to convert?");
		System.out.println("Distance - Time Zone - Speed - Weight");

		String userIn = reader.nextLine().toLowerCase();

		while (true) {

			if (userIn.equals("speed")) {
				System.out.println("Please enter your speed.");

				String speedSelect = reader.nextLine().toLowerCase();

				String userSpeedString = speedSelect.replaceAll("[a-z]", "");
				double userSpeed = Double.parseDouble(userSpeedString);

				if (speedSelect.contains("mph") || (speedSelect.contains("miles per hour"))) {

					while (true) {

						System.out.println("Please select a unit to convert MPH to.");
						System.out.println("KPH - M/S - F/S - Knots");

						String mphVS = reader.nextLine().toLowerCase();

						if (mphVS.equals("kilometres per hour") || (mphVS.equals("kph") || (mphVS.equals("kilometers per hour")))) {

							double mphKPH = userSpeed * 1.609;
							mphKPH = roundTo(mphKPH);

							System.out.println(userSpeed + " Miles per hour is " + mphKPH + " Kilometres per hour!");
							break;

						} else if (mphVS.equals("metres per second")
								|| (mphVS.equals("meters per second") || (mphVS.equals("m/s") || (mphVS.equals("mps"))))) {
							double mphMPS = userSpeed / 2.237;
							mphMPS = roundTo(mphMPS);

							System.out.println(userSpeed + " Miles per hour is " + mphMPS + " Metres per second!");
							break;

						} else if (mphVS.equals("feet per second")
								|| (mphVS.equals("foot per second") || (mphVS.equals("f/s") || (mphVS.equals("fps"))))) {
							double mphFPS = userSpeed * 1.467;
							mphFPS = roundTo(mphFPS);

							System.out.println(userSpeed + " Miles per hour is " + mphFPS + " Feet per second!");
							break;

						} else if (mphVS.equals("knots") || (mphVS.equals("kts"))) {
							double mphKTS = userSpeed / 1.151;
							mphKTS = roundTo(mphKTS);

							System.out.println(userSpeed + " Miles per hour is " + mphKTS + " Knots!");
							break;

						} else {
							System.out.println("!!Invalid Unit!!");

						}
					}
					break;
				} else if (speedSelect.contains("kph")
						|| (speedSelect.contains("kilometres per hour") || (speedSelect.contains("kilometers per hour")))) {

					while (true) {

						System.out.println("Please select a unit to convert KPH to.");
						System.out.println("MPH - M/S - F/S - Knots");

						String kphVS = reader.nextLine().toLowerCase();

						if (kphVS.equals("miles per hour") || (kphVS.equals("mph"))) {

							double kphMPH = userSpeed / 1.609;
							kphMPH = roundTo(kphMPH);

							System.out.println(userSpeed + " Kilometres per hour is " + kphMPH + " Miles per hour!");
							break;

						} else if (kphVS.equals("metres per second")
								|| (kphVS.equals("m/s") || (kphVS.equals("mps") || (kphVS.equals("meters per second"))))) {
							double kphMPS = userSpeed / 3.6;
							kphMPS = roundTo(kphMPS);

							System.out.println(userSpeed + " Kilometres per hour is " + kphMPS + " Metres per second!");
							break;

						} else if (kphVS.equals("feet per second")
								|| (kphVS.equals("foot per second") || (kphVS.equals("f/s") || (kphVS.equals("fps"))))) {
							double kphFPS = userSpeed / 1.097;
							kphFPS = roundTo(kphFPS);

							System.out.println(userSpeed + " Kilometres per hour is " + kphFPS + " Feet per second!");
							break;

						} else if (kphVS.equals("knots") || (kphVS.equals("kts"))) {
							double kphKTS = userSpeed / 1.852;
							kphKTS = roundTo(kphKTS);

							System.out.println(userSpeed + " Kilometres per hour is " + kphKTS + " Knots!");
							break;

						} else {
							System.out.println("Invalid Unit");

						}
					}
					break;
				} else if (speedSelect.contains("mps")
						|| (speedSelect.contains("meters per second") || (speedSelect.contains("metres per second")))) {

					while (true) {

						System.out.println("Please select a unit to convert M/S to.");
						System.out.println("MPH - KPH - F/S - Knots");

						String mpsVS = reader.nextLine().toLowerCase();

						if (mpsVS.equals("miles per hour") || (mpsVS.equals("mph"))) {

							double mpsMPH = userSpeed * 2.237;
							mpsMPH = roundTo(mpsMPH);

							System.out.println(userSpeed + " Metres per second is " + mpsMPH + " Miles per hour!");
							break;

						} else if (mpsVS.equals("kilometres per hour") || (mpsVS.equals("kph") || (mpsVS.equals("kilometers per hour")))) {
							double mpsKPH = userSpeed * 3.6;
							mpsKPH = roundTo(mpsKPH);

							System.out.println(userSpeed + " Metres per second is " + mpsKPH + " Kilometres per hour!");
							break;

						} else if (mpsVS.equals("feet per second")
								|| (mpsVS.equals("foot per second") || (mpsVS.equals("f/s") || (mpsVS.equals("fps"))))) {
							double mpsFPS = userSpeed * 3.281;
							mpsFPS = roundTo(mpsFPS);

							System.out.println(userSpeed + " Metres per second is " + mpsFPS + " Feet per second!");
							break;

						} else if (mpsVS.equals("knots") || (mpsVS.equals("kts"))) {
							double mpsKTS = userSpeed * 1.944;
							mpsKTS = roundTo(mpsKTS);

							System.out.println(userSpeed + " Metres per second is " + mpsKTS + " Knots!");
							break;

						} else {
							System.out.println("Invalid Unit");

						}
					}
					break;
				} else if (speedSelect.contains("fps") || (speedSelect.contains("feet per second") || (speedSelect.contains("foot per second")))) {

					while (true) {

						System.out.println("Please select a unit to convert F/S to.");
						System.out.println("MPH - KPH - M/S - Knots");

						String fpsVS = reader.nextLine().toLowerCase();

						if (fpsVS.equals("miles per hour") || (fpsVS.equals("mph"))) {

							double fpsMPH = userSpeed / 1.467;
							fpsMPH = roundTo(fpsMPH);

							System.out.println(userSpeed + " Feet per second is " + fpsMPH + " Miles per hour!");
							break;

						} else if (fpsVS.equals("kilometres per hour") || (fpsVS.equals("kph") || (fpsVS.equals("kilometers per hour")))) {
							double fpsKPH = userSpeed * 1.097;
							fpsKPH = roundTo(fpsKPH);

							System.out.println(userSpeed + " Feet per second is " + fpsKPH + " Kilometres per hour!");
							break;

						} else if (fpsVS.equals("metres per second")
								|| (fpsVS.equals("meters per second") || (fpsVS.equals("m/s") || (fpsVS.equals("mps"))))) {
							double fpsMPS = userSpeed / 3.281;
							fpsMPS = roundTo(fpsMPS);

							System.out.println(userSpeed + " Feet per second is " + fpsMPS + " Metres per second!");
							break;

						} else if (fpsVS.equals("knots") || (fpsVS.equals("kts"))) {
							double fpsKTS = userSpeed / 1.688;
							fpsKTS = roundTo(fpsKTS);

							System.out.println(userSpeed + " Feet per second is " + fpsKTS + " Knots!");
							break;

						} else {
							System.out.println("Invalid Unit");

						}
					}
					break;
				} else if (speedSelect.contains("kts") || (speedSelect.contains("knots"))) {

					while (true) {

						System.out.println("Please select a unit to convert Knots to.");
						System.out.println("MPH - KPH - M/S - F/S");

						String ktsVS = reader.nextLine().toLowerCase();

						if (ktsVS.equals("miles per hour") || (ktsVS.equals("mph"))) {

							double ktsMPH = userSpeed * 1.151;
							ktsMPH = roundTo(ktsMPH);

							System.out.println(userSpeed + " Knots is " + ktsMPH + " Miles per hour!");
							break;

						} else if (ktsVS.equals("kilometres per hour") || (ktsVS.equals("kph") || (ktsVS.equals("kilometers per hour")))) {
							double ktsKPH = userSpeed * 1.852;
							ktsKPH = roundTo(ktsKPH);

							System.out.println(userSpeed + " Knots is " + ktsKPH + " Kilometres per hour!");
							break;

						} else if (ktsVS.equals("metres per second")
								|| (ktsVS.equals("meters per second") || (ktsVS.equals("m/s") || (ktsVS.equals("mps"))))) {
							double ktsMPS = userSpeed / 1.944;
							ktsMPS = roundTo(ktsMPS);

							System.out.println(userSpeed + " Knots is " + ktsMPS + " Metres per second!");
							break;

						} else if (ktsVS.equals("fps") || (ktsVS.equals("feet per second") || (ktsVS.equals("foot per second")))) {
							double ktsFPS = userSpeed * 1.688;
							ktsFPS = roundTo(ktsFPS);

							System.out.println(userSpeed + " Knots " + ktsFPS + " Feet per second!");
							break;

						} else {
							System.out.println("Invalid Unit");

						}
					}
					break;
				}
			} else if (userIn.equals("time zone") || (userIn.equals("time") || (userIn.equals("timezone")))) {
				System.out.println("Please enter your start time, including zone, in 24 hour format. eg: ##:##:## GMT");
				String userInputTime = reader.nextLine().toUpperCase();

				String[] timeFields = userInputTime.split(" ");
				String startTime = timeFields[0];
				String startTimeZone = timeFields[1];

				System.out.println("Please enter your target timezone...");
				String targetTimeZone = reader.nextLine().toUpperCase();

				SimpleDateFormat startTimeFormat = new SimpleDateFormat("HH:mm:ss");
				startTimeFormat.setTimeZone(TimeZone.getTimeZone(startTimeZone));

				SimpleDateFormat targetTimeFormat = new SimpleDateFormat("HH:mm:ss");
				targetTimeFormat.setTimeZone(TimeZone.getTimeZone(targetTimeZone));

				Date userInDate = null;
				try {
					userInDate = startTimeFormat.parse(startTime);
				} catch (ParseException e) {
					e.printStackTrace();
				}

				System.out.println("Your start time " + startTimeFormat.format(userInDate) + " " + startTimeZone);
				System.out.println("Converts to " + targetTimeFormat.format(userInDate) + " " + targetTimeZone);

			}
			break;
		}
	}
}
