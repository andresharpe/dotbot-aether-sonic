package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.firebase.messaging.C1821f;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class L {

    /* renamed from: b, reason: collision with root package name */
    private static final int f36489b = -16777216;

    /* renamed from: c, reason: collision with root package name */
    private static final int f36490c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f36491d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f36492e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f36493f = "NotificationParams";

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final Bundle f36494a;

    public L(@androidx.annotation.N Bundle bundle) {
        if (bundle != null) {
            this.f36494a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException(C1821f.C0339f.a.f37006R);
    }

    private static String B(String str) {
        if (str.startsWith(C1821f.c.f36943b)) {
            return str.substring(6);
        }
        return str;
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean t(String str) {
        if (!str.startsWith(C1821f.a.f36924a) && !str.equals("from")) {
            return false;
        }
        return true;
    }

    public static boolean v(Bundle bundle) {
        if (!"1".equals(bundle.getString(C1821f.c.f36945d)) && !"1".equals(bundle.getString(x(C1821f.c.f36945d)))) {
            return false;
        }
        return true;
    }

    private static boolean w(String str) {
        if (!str.startsWith(C1821f.d.f36982o) && !str.startsWith(C1821f.c.f36943b) && !str.startsWith(C1821f.c.f36944c)) {
            return false;
        }
        return true;
    }

    private static String x(String str) {
        if (!str.startsWith(C1821f.c.f36943b)) {
            return str;
        }
        return str.replace(C1821f.c.f36943b, C1821f.c.f36944c);
    }

    private String y(String str) {
        if (!this.f36494a.containsKey(str) && str.startsWith(C1821f.c.f36943b)) {
            String x3 = x(str);
            if (this.f36494a.containsKey(x3)) {
                return x3;
            }
        }
        return str;
    }

    public Bundle A() {
        Bundle bundle = new Bundle(this.f36494a);
        for (String str : this.f36494a.keySet()) {
            if (w(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public boolean a(String str) {
        String p4 = p(str);
        if (!"1".equals(p4) && !Boolean.parseBoolean(p4)) {
            return false;
        }
        return true;
    }

    public Integer b(String str) {
        String p4 = p(str);
        if (!TextUtils.isEmpty(p4)) {
            try {
                return Integer.valueOf(Integer.parseInt(p4));
            } catch (NumberFormatException unused) {
                Log.w(f36493f, "Couldn't parse value of " + B(str) + "(" + p4 + ") into an int");
                return null;
            }
        }
        return null;
    }

    @androidx.annotation.P
    public JSONArray c(String str) {
        String p4 = p(str);
        if (!TextUtils.isEmpty(p4)) {
            try {
                return new JSONArray(p4);
            } catch (JSONException unused) {
                Log.w(f36493f, "Malformed JSON for key " + B(str) + ": " + p4 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public int[] e() {
        JSONArray c4 = c(C1821f.c.f36964w);
        if (c4 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c4.length() == 3) {
                iArr[0] = d(c4.optString(0));
                iArr[1] = c4.optInt(1);
                iArr[2] = c4.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e4) {
            Log.w(f36493f, "LightSettings is invalid: " + c4 + ". " + e4.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w(f36493f, "LightSettings is invalid: " + c4 + ". Skipping setting LightSettings");
            return null;
        }
    }

    @androidx.annotation.P
    public Uri f() {
        String p4 = p(C1821f.c.f36937C);
        if (TextUtils.isEmpty(p4)) {
            p4 = p(C1821f.c.f36936B);
        }
        if (!TextUtils.isEmpty(p4)) {
            return Uri.parse(p4);
        }
        return null;
    }

    @androidx.annotation.P
    public Object[] g(String str) {
        JSONArray c4 = c(str + C1821f.c.f36941G);
        if (c4 == null) {
            return null;
        }
        int length = c4.length();
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr[i4] = c4.optString(i4);
        }
        return strArr;
    }

    @androidx.annotation.P
    public String h(String str) {
        return p(str + C1821f.c.f36940F);
    }

    @androidx.annotation.P
    public String i(Resources resources, String str, String str2) {
        String h4 = h(str2);
        if (TextUtils.isEmpty(h4)) {
            return null;
        }
        int identifier = resources.getIdentifier(h4, v.b.f7403e, str);
        if (identifier == 0) {
            Log.w(f36493f, B(str2 + C1821f.c.f36940F) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g4 = g(str2);
        if (g4 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g4);
        } catch (MissingFormatArgumentException e4) {
            Log.w(f36493f, "Missing format argument for " + B(str2) + ": " + Arrays.toString(g4) + " Default value will be used.", e4);
            return null;
        }
    }

    public Long j(String str) {
        String p4 = p(str);
        if (!TextUtils.isEmpty(p4)) {
            try {
                return Long.valueOf(Long.parseLong(p4));
            } catch (NumberFormatException unused) {
                Log.w(f36493f, "Couldn't parse value of " + B(str) + "(" + p4 + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String k() {
        return p(C1821f.c.f36938D);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Integer l() {
        Integer b4 = b(C1821f.c.f36961t);
        if (b4 == null) {
            return null;
        }
        if (b4.intValue() < 0) {
            Log.w(C1821f.f36920a, "notificationCount is invalid: " + b4 + ". Skipping setting notificationCount.");
            return null;
        }
        return b4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Integer m() {
        Integer b4 = b(C1821f.c.f36957p);
        if (b4 == null) {
            return null;
        }
        if (b4.intValue() >= -2 && b4.intValue() <= 2) {
            return b4;
        }
        Log.w(C1821f.f36920a, "notificationPriority is invalid " + b4 + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p4 = p(str2);
        if (!TextUtils.isEmpty(p4)) {
            return p4;
        }
        return i(resources, str, str2);
    }

    @androidx.annotation.P
    public String o() {
        String p4 = p(C1821f.c.f36966y);
        if (TextUtils.isEmpty(p4)) {
            return p(C1821f.c.f36967z);
        }
        return p4;
    }

    public String p(String str) {
        return this.f36494a.getString(y(str));
    }

    @androidx.annotation.P
    public long[] q() {
        JSONArray c4 = c(C1821f.c.f36963v);
        if (c4 == null) {
            return null;
        }
        try {
            if (c4.length() > 1) {
                int length = c4.length();
                long[] jArr = new long[length];
                for (int i4 = 0; i4 < length; i4++) {
                    jArr[i4] = c4.optLong(i4);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w(f36493f, "User defined vibrateTimings is invalid: " + c4 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer r() {
        Integer b4 = b(C1821f.c.f36962u);
        if (b4 == null) {
            return null;
        }
        if (b4.intValue() >= -1 && b4.intValue() <= 1) {
            return b4;
        }
        Log.w(f36493f, "visibility is invalid: " + b4 + ". Skipping setting visibility.");
        return null;
    }

    public boolean s() {
        return !TextUtils.isEmpty(p(C1821f.c.f36951j));
    }

    public boolean u() {
        return a(C1821f.c.f36945d);
    }

    public Bundle z() {
        Bundle bundle = new Bundle(this.f36494a);
        for (String str : this.f36494a.keySet()) {
            if (!t(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
