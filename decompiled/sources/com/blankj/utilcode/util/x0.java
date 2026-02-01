package com.blankj.utilcode.util;

import android.content.res.Resources;
import androidx.annotation.InterfaceC0562e;
import java.util.IllegalFormatException;

/* loaded from: classes.dex */
public final class x0 {
    private x0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (charSequence.charAt(i4) != charSequence2.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static String c(@androidx.annotation.P String str, Object... objArr) {
        if (str != null && objArr != null && objArr.length > 0) {
            try {
                return String.format(str, objArr);
            } catch (IllegalFormatException e4) {
                e4.printStackTrace();
                return str;
            }
        }
        return str;
    }

    public static String d(@androidx.annotation.c0 int i4) {
        return e(i4, null);
    }

    public static String e(@androidx.annotation.c0 int i4, Object... objArr) {
        try {
            return c(E0.a().getString(i4), objArr);
        } catch (Resources.NotFoundException e4) {
            e4.printStackTrace();
            return String.valueOf(i4);
        }
    }

    public static String[] f(@InterfaceC0562e int i4) {
        try {
            return E0.a().getResources().getStringArray(i4);
        } catch (Resources.NotFoundException e4) {
            e4.printStackTrace();
            return new String[]{String.valueOf(i4)};
        }
    }

    public static boolean g(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean h(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isWhitespace(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static int j(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String k(String str) {
        if (str != null && str.length() != 0) {
            if (!Character.isUpperCase(str.charAt(0))) {
                return str;
            }
            return String.valueOf((char) (str.charAt(0) + ' ')) + str.substring(1);
        }
        return "";
    }

    public static String l(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String m(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        int i4 = length >> 1;
        char[] charArray = str.toCharArray();
        for (int i5 = 0; i5 < i4; i5++) {
            char c4 = charArray[i5];
            int i6 = (length - i5) - 1;
            charArray[i5] = charArray[i6];
            charArray[i6] = c4;
        }
        return new String(charArray);
    }

    public static String n(String str) {
        if (str != null && str.length() != 0) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                char c4 = charArray[i4];
                if (c4 == 12288) {
                    charArray[i4] = ' ';
                } else if (65281 <= c4 && c4 <= 65374) {
                    charArray[i4] = (char) (c4 - 65248);
                } else {
                    charArray[i4] = c4;
                }
            }
            return new String(charArray);
        }
        return "";
    }

    public static String o(String str) {
        if (str != null && str.length() != 0) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                char c4 = charArray[i4];
                if (c4 == ' ') {
                    charArray[i4] = 12288;
                } else if ('!' <= c4 && c4 <= '~') {
                    charArray[i4] = (char) (c4 + 65248);
                } else {
                    charArray[i4] = c4;
                }
            }
            return new String(charArray);
        }
        return "";
    }

    public static String p(String str) {
        if (str != null && str.length() != 0) {
            if (!Character.isLowerCase(str.charAt(0))) {
                return str;
            }
            return ((char) (str.charAt(0) - ' ')) + str.substring(1);
        }
        return "";
    }
}
