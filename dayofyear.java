// First draft - example of repeating yourself a lot and also multiple magic numbers

public static int dayOfYear(int month, int dayOfMonth, int year) {
    if (month == 2) {
        dayOfMonth += 31;
    } else if (month == 3) {
        dayOfMonth += 59;
    } else if (month == 4) {
        dayOfMonth += 90;
    } else if (month == 5) {
        dayOfMonth += 31 + 28 + 31 + 30;
    } else if (month == 6) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31;
    } else if (month == 7) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
    } else if (month == 8) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
    } else if (month == 9) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
    } else if (month == 10) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
    } else if (month == 11) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
    } else if (month == 12) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
    }
    return dayOfMonth;
}

// Second draft with except clause for out of range and months as strings for less confusion
public enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,
        OCTOBER, NOVEMBER, DECEMBER };
public static int dayOfYear(Month month, int dayOfMonth, int year) {
    if (month == FEBRUARY) {
        dayOfMonth += 31;
    } else if (month == MARCH) {
        dayOfMonth += 59;
    } else if (month == APRIL) {
        dayOfMonth += 90;
    } else if (month == MAY) {
        dayOfMonth += 31 + 28 + 31 + 30;
    } else if (month == JUNE) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31;
    } else if (month == JULY) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
    } else if (month == AUGUST) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
    } else if (month == SEPTEMBER) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
    } else if (month == OCTOBER) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
    } else if (month == NOVEMBER) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
    } else if (month == DECEMBER) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
    }
    } else {
        throw new IllegalArgumentException("month out of range");
    }
    return dayOfMonth;
}

// To compute leap year - Smelly version
public static boolean leap(int y) {
    String tmp = String.valueOf(y);
    if (tmp.charAt(2) == '1' || tmp.charAt(2) == '3' || tmp.charAt(2) == 5
            || tmp.charAt(2) == '7' || tmp.charAt(2) == '9') {
        if (tmp.charAt(3)=='2'||tmp.charAt(3)=='6') return true; 
        else
            return false; 
    }else{
        if (tmp.charAt(2) == '0' && tmp.charAt(3) == '0') {
            return false; 
        }
        if (tmp.charAt(3)=='0'||tmp.charAt(3)=='4'||tmp.charAt(3)=='8')return true; 
    }
    return false; 
}

// Better way to calculate leap year
public static boolean isDivisibleBy(int year, int factor) { return year % factor == 0; }