package com.blankj.utilcode.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.blankj.utilcode.util.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.collection.l<String, String> f25028a = new androidx.collection.l<>();

    private C1099k0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String a(String str) {
        return str.substring(str.lastIndexOf("@") + 1);
    }

    public static String b(String str) {
        return str.substring(0, str.lastIndexOf("@"));
    }

    public static List<String> c(String str, CharSequence charSequence) {
        if (charSequence == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str).matcher(charSequence);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static String d(String str, String str2, String str3) {
        if (str == null) {
            return "";
        }
        return Pattern.compile(str2).matcher(str).replaceAll(str3);
    }

    public static String e(String str, String str2, String str3) {
        if (str == null) {
            return "";
        }
        return Pattern.compile(str2).matcher(str).replaceFirst(str3);
    }

    public static String[] f(String str, String str2) {
        if (str == null) {
            return new String[0];
        }
        return str.split(str2);
    }

    public static boolean g(CharSequence charSequence) {
        return o(r0.d.f57410j, charSequence);
    }

    public static boolean h(CharSequence charSequence) {
        return o(r0.d.f57406f, charSequence);
    }

    public static boolean i(String str, String[] strArr) {
        return C1094i.V(strArr, a(str));
    }

    public static boolean j(String str, String str2) {
        return a(str).equalsIgnoreCase(str2);
    }

    public static boolean k(CharSequence charSequence) {
        return o(r0.d.f57404d, charSequence);
    }

    public static boolean l(CharSequence charSequence) {
        return o(r0.d.f57405e, charSequence);
    }

    public static boolean m(CharSequence charSequence) {
        if (l(charSequence)) {
            int[] iArr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
            char[] cArr = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
            androidx.collection.l<String, String> lVar = f25028a;
            if (lVar.isEmpty()) {
                lVar.put("11", "北京");
                lVar.put("12", "天津");
                lVar.put("13", "河北");
                lVar.put("14", "山西");
                lVar.put("15", "内蒙古");
                lVar.put("21", "辽宁");
                lVar.put("22", "吉林");
                lVar.put("23", "黑龙江");
                lVar.put(com.harman.sdk.utils.k.f48727x, "上海");
                lVar.put(com.harman.sdk.utils.k.f48730y, "江苏");
                lVar.put(com.harman.sdk.utils.k.f48733z, "浙江");
                lVar.put(com.harman.sdk.utils.k.f48562A, "安徽");
                lVar.put(com.harman.sdk.utils.k.f48565B, "福建");
                lVar.put(com.harman.sdk.utils.k.f48568C, "江西");
                lVar.put(com.harman.sdk.utils.k.f48571D, "山东");
                lVar.put("41", "河南");
                lVar.put("42", "湖北");
                lVar.put("43", "湖南");
                lVar.put("44", "广东");
                lVar.put(com.harman.sdk.utils.k.f48698o1, "广西");
                lVar.put(com.harman.sdk.utils.k.f48682k1, "海南");
                lVar.put("50", "重庆");
                lVar.put("51", "四川");
                lVar.put("52", "贵州");
                lVar.put(com.harman.sdk.utils.k.f48607P, "云南");
                lVar.put(com.harman.sdk.utils.k.f48610Q, "西藏");
                lVar.put("61", "陕西");
                lVar.put("62", "甘肃");
                lVar.put("63", "青海");
                lVar.put("64", "宁夏");
                lVar.put("65", "新疆");
                lVar.put("71", "台湾老");
                lVar.put("81", "香港");
                lVar.put("82", "澳门");
                lVar.put("83", "台湾新");
                lVar.put("91", "国外");
            }
            if (lVar.get(charSequence.subSequence(0, 2).toString()) != null) {
                int i4 = 0;
                for (int i5 = 0; i5 < 17; i5++) {
                    i4 += (charSequence.charAt(i5) - '0') * iArr[i5];
                }
                if (charSequence.charAt(17) == cArr[i4 % 11]) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static boolean n(CharSequence charSequence) {
        return o(r0.d.f57411k, charSequence);
    }

    public static boolean o(String str, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && Pattern.matches(str, charSequence)) {
            return true;
        }
        return false;
    }

    public static boolean p(CharSequence charSequence) {
        return q(charSequence, null);
    }

    public static boolean q(CharSequence charSequence, List<String> list) {
        if (o(r0.d.f57402b, charSequence)) {
            return true;
        }
        if (list != null && charSequence != null && charSequence.length() == 11) {
            String charSequence2 = charSequence.toString();
            for (char c4 : charSequence2.toCharArray()) {
                if (!Character.isDigit(c4)) {
                    return false;
                }
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (charSequence2.startsWith(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean r(CharSequence charSequence) {
        return o(r0.d.f57401a, charSequence);
    }

    public static boolean s(CharSequence charSequence) {
        return o(r0.d.f57403c, charSequence);
    }

    public static boolean t(CharSequence charSequence) {
        return o(r0.d.f57407g, charSequence);
    }

    public static boolean u(CharSequence charSequence) {
        return o(r0.d.f57409i, charSequence);
    }

    public static boolean v(CharSequence charSequence) {
        return o(r0.d.f57408h, charSequence);
    }
}
