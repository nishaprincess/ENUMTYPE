package io.naztech.Daysinmonth;

public enum Month {
	JANUARY("january", 31), FEBRUARY("february", 28), MARCH("march", 31), APRIL("april", 30), MAY("may", 31),
	JUNE("june", 30), JULY("july", 31), AUGUST("august", 31), SEPTEMBER("september", 30), OCTOBER("october", 31),
	NOVEMBER("november", 30), DECEMBER("december", 31);

	private final String title;
	private final int days;

	private Month(String title, int days) {
		this.title = title;
		this.days = days;
	}

	public String getTitle() {
		return title;
	}

	public int getDays() {
		return days;
	}

	public String getshortmonth() {
		return this.title.substring(0, 3);
	}

	public Month parse(String mon) {
        
		mon = mon.toUpperCase();
		if (mon != null) {
			for (Month m : Month.values()) {

				if (mon.length() == 3 && m.getshortmonth().toUpperCase().equals(mon)) {
					return m;
				} else if (m.getTitle().toUpperCase().equals(mon)) {
					return m;
				} 

			}

		}
		return null;
	}

}
