package androidx.core.content;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F {
    private F() {
    }

    @androidx.annotation.P
    public static String a(@androidx.annotation.P String str, @androidx.annotation.N String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(split, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @androidx.annotation.P
    public static String b(@androidx.annotation.P String[] strArr, @androidx.annotation.N String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), split)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(@androidx.annotation.P String str, @androidx.annotation.N String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split("/"), str2.split("/"));
    }

    @androidx.annotation.N
    public static String[] d(@androidx.annotation.P String[] strArr, @androidx.annotation.N String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean e(@androidx.annotation.N String[] strArr, @androidx.annotation.N String[] strArr2) {
        if (strArr2.length == 2) {
            if (!strArr2[0].isEmpty() && !strArr2[1].isEmpty()) {
                if (strArr.length != 2) {
                    return false;
                }
                if (!"*".equals(strArr2[0]) && !strArr2[0].equals(strArr[0])) {
                    return false;
                }
                if (!"*".equals(strArr2[1]) && !strArr2[1].equals(strArr[1])) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
    }
}
