package case_study.utils;

public class Regex {
    public static final String REGEX_ROOM_SERVICECODE = "^SVRO-\\d{4}$";
    public static final String REGEX_VILLA_SERVICECODE = "^SVVL-\\d{4}$";
    public static final String REGEX_SERVICENAME = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
    public static final String REGEX_USED_AREA = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    public static final String REGEX_SWIMMING_POOL_AREA = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    public static final String REGEX_RENTAL_COSTS = "^0*\\d+.*\\d+$";
    public static final String REGEX_MAXIMUM_NUMBER_PERSONS = "^0*([1-9]|1[0-9])$";
    public static final String REGEX_NUMBER_FLOORS = "^0*[1-9]\\d*$";
    public static final String REGEX_RENTAL_TYPE = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
    public static final String REGEX_STANDARD_ROOM = "^[A-Z][a-z]*+(\\s[a-z]+)*$";

}
