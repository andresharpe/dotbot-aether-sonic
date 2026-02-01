package com.blankj.utilcode.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f24800a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final byte f24801b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f24802c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f24803d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f24804e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f24805f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f24806g = 6;

    private L() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static <T> T A(String str, String str2, T t3, byte b4) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            try {
                return (T) B(new JSONObject(str), str2, t3, b4);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        return t3;
    }

    private static <T> T B(JSONObject jSONObject, String str, T t3, byte b4) {
        T t4;
        if (jSONObject != null && str != null && str.length() != 0) {
            try {
                if (b4 == 0) {
                    t4 = (T) Boolean.valueOf(jSONObject.getBoolean(str));
                } else if (b4 == 1) {
                    t4 = (T) Integer.valueOf(jSONObject.getInt(str));
                } else if (b4 == 2) {
                    t4 = (T) Long.valueOf(jSONObject.getLong(str));
                } else if (b4 == 3) {
                    t4 = (T) Double.valueOf(jSONObject.getDouble(str));
                } else if (b4 == 4) {
                    t4 = (T) jSONObject.getString(str);
                } else if (b4 == 5) {
                    t4 = (T) jSONObject.getJSONObject(str);
                } else if (b4 == 6) {
                    t4 = (T) jSONObject.getJSONArray(str);
                }
                return t4;
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        return t3;
    }

    public static <T> boolean C(T t3) {
        return t3 instanceof JSONArray;
    }

    public static <T> boolean D(T t3) {
        return t3 instanceof JSONObject;
    }

    public static String a(String str) {
        return b(str, 4);
    }

    public static String b(String str, int i4) {
        try {
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if (charAt == '{') {
                    return new JSONObject(str).toString(i4);
                }
                if (charAt == '[') {
                    return new JSONArray(str).toString(i4);
                }
                if (!Character.isWhitespace(charAt)) {
                    return str;
                }
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return str;
    }

    public static boolean c(String str, String str2) {
        return d(str, str2, false);
    }

    public static boolean d(String str, String str2, boolean z3) {
        return ((Boolean) A(str, str2, Boolean.valueOf(z3), (byte) 0)).booleanValue();
    }

    public static boolean e(JSONObject jSONObject, String str) {
        return f(jSONObject, str, false);
    }

    public static boolean f(JSONObject jSONObject, String str, boolean z3) {
        return ((Boolean) B(jSONObject, str, Boolean.valueOf(z3), (byte) 0)).booleanValue();
    }

    public static double g(String str, String str2) {
        return h(str, str2, -1.0d);
    }

    public static double h(String str, String str2, double d4) {
        return ((Double) A(str, str2, Double.valueOf(d4), (byte) 3)).doubleValue();
    }

    public static double i(JSONObject jSONObject, String str) {
        return j(jSONObject, str, -1.0d);
    }

    public static double j(JSONObject jSONObject, String str, double d4) {
        return ((Double) B(jSONObject, str, Double.valueOf(d4), (byte) 3)).doubleValue();
    }

    public static int k(String str, String str2) {
        return l(str, str2, -1);
    }

    public static int l(String str, String str2, int i4) {
        return ((Integer) A(str, str2, Integer.valueOf(i4), (byte) 1)).intValue();
    }

    public static int m(JSONObject jSONObject, String str) {
        return n(jSONObject, str, -1);
    }

    public static int n(JSONObject jSONObject, String str, int i4) {
        return ((Integer) B(jSONObject, str, Integer.valueOf(i4), (byte) 1)).intValue();
    }

    public static JSONArray o(String str, String str2, JSONArray jSONArray) {
        return (JSONArray) A(str, str2, jSONArray, (byte) 6);
    }

    public static JSONArray p(JSONObject jSONObject, String str, JSONArray jSONArray) {
        return (JSONArray) B(jSONObject, str, jSONArray, (byte) 6);
    }

    public static JSONObject q(String str, String str2, JSONObject jSONObject) {
        return (JSONObject) A(str, str2, jSONObject, (byte) 5);
    }

    public static JSONObject r(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        return (JSONObject) B(jSONObject, str, jSONObject2, (byte) 5);
    }

    public static long s(String str, String str2) {
        return t(str, str2, -1L);
    }

    public static long t(String str, String str2, long j4) {
        return ((Long) A(str, str2, Long.valueOf(j4), (byte) 2)).longValue();
    }

    public static long u(JSONObject jSONObject, String str) {
        return v(jSONObject, str, -1L);
    }

    public static long v(JSONObject jSONObject, String str, long j4) {
        return ((Long) B(jSONObject, str, Long.valueOf(j4), (byte) 2)).longValue();
    }

    public static String w(String str, String str2) {
        return x(str, str2, "");
    }

    public static String x(String str, String str2, String str3) {
        return (String) A(str, str2, str3, (byte) 4);
    }

    public static String y(JSONObject jSONObject, String str) {
        return z(jSONObject, str, "");
    }

    public static String z(JSONObject jSONObject, String str, String str2) {
        return (String) B(jSONObject, str, str2, (byte) 4);
    }
}
