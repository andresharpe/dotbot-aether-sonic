package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i4, char c4) {
        if (i4 < str.length() && str.charAt(i4) == c4) {
            return true;
        }
        return false;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i4) {
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if (charAt >= '0' && charAt <= '9') {
                i4++;
            } else {
                return i4;
            }
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i4, int i5) {
        String num = Integer.toString(i4);
        for (int length = i5 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i4, int i5) throws NumberFormatException {
        int i6;
        int i7;
        if (i4 >= 0 && i5 <= str.length() && i4 <= i5) {
            if (i4 < i5) {
                i7 = i4 + 1;
                int digit = Character.digit(str.charAt(i4), 10);
                if (digit >= 0) {
                    i6 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
                }
            } else {
                i6 = 0;
                i7 = i4;
            }
            while (i7 < i5) {
                int i8 = i7 + 1;
                int digit2 = Character.digit(str.charAt(i7), 10);
                if (digit2 >= 0) {
                    i6 = (i6 * 10) - digit2;
                    i7 = i8;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
                }
            }
            return -i6;
        }
        throw new NumberFormatException(str);
    }

    public static String format(Date date, boolean z3) {
        return format(date, z3, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z3, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z3 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z3) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i4 = offset / 60000;
            int abs = Math.abs(i4 / 60);
            int abs2 = Math.abs(i4 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
