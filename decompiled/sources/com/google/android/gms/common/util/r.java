package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@I0.a
@D
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f29024a = Pattern.compile("\\\\.");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f29025b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private r() {
    }

    @I0.a
    public static boolean a(@P Object obj, @P Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    C1285y.l(next);
                } catch (JSONException unused) {
                }
                if (!a(jSONObject.get(next), jSONObject2.get(next))) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                if (!a(jSONArray.get(i4), jSONArray2.get(i4))) {
                    return false;
                }
            }
            return true;
        }
        return obj.equals(obj2);
    }

    @P
    @I0.a
    public static String b(@P String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f29025b.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(0);
                if (charAt != '\f') {
                    if (charAt != '\r') {
                        if (charAt != '\"') {
                            if (charAt != '/') {
                                if (charAt != '\\') {
                                    switch (charAt) {
                                        case '\b':
                                            matcher.appendReplacement(stringBuffer, "\\\\b");
                                            break;
                                        case '\t':
                                            matcher.appendReplacement(stringBuffer, "\\\\t");
                                            break;
                                        case '\n':
                                            matcher.appendReplacement(stringBuffer, "\\\\n");
                                            break;
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\\\\/");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, "\\\\r");
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                }
            }
            if (stringBuffer == null) {
                return str;
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }

    @I0.a
    @N
    public static String c(@N String str) {
        if (!TextUtils.isEmpty(str)) {
            String a4 = H.a(str);
            Matcher matcher = f29024a.matcher(a4);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(1);
                if (charAt != '\"') {
                    if (charAt != '/') {
                        if (charAt != '\\') {
                            if (charAt != 'b') {
                                if (charAt != 'f') {
                                    if (charAt != 'n') {
                                        if (charAt != 'r') {
                                            if (charAt == 't') {
                                                matcher.appendReplacement(stringBuffer, "\t");
                                            } else {
                                                throw new IllegalStateException("Found an escaped character that should never be.");
                                            }
                                        } else {
                                            matcher.appendReplacement(stringBuffer, "\r");
                                        }
                                    } else {
                                        matcher.appendReplacement(stringBuffer, "\n");
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\f");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\b");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, "/");
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\"");
                }
            }
            if (stringBuffer == null) {
                return a4;
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }
}
