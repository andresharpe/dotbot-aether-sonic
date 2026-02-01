package com.google.firebase.crashlytics.internal.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class B {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f34996b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private static final String f34997c = "user";

    /* renamed from: d, reason: collision with root package name */
    private static final String f34998d = "keys";

    /* renamed from: e, reason: collision with root package name */
    private static final String f34999e = "internal-keys";

    /* renamed from: f, reason: collision with root package name */
    private static final String f35000f = ".meta";

    /* renamed from: g, reason: collision with root package name */
    private static final String f35001g = "userId";

    /* renamed from: a, reason: collision with root package name */
    private final File f35002a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f35003a;

        a(T t3) throws JSONException {
            this.f35003a = t3;
            put(B.f35001g, t3.c());
        }
    }

    public B(File file) {
        this.f35002a = file;
    }

    private static Map<String, String> d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, k(jSONObject, next));
        }
        return hashMap;
    }

    private static T e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        T t3 = new T();
        t3.g(k(jSONObject, f35001g));
        return t3;
    }

    private static String f(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    private static String j(T t3) throws JSONException {
        return new a(t3).toString();
    }

    private static String k(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @androidx.annotation.N
    public File a(String str) {
        return new File(this.f35002a, str + f34999e + f35000f);
    }

    @androidx.annotation.N
    public File b(String str) {
        return new File(this.f35002a, str + f34998d + f35000f);
    }

    @androidx.annotation.N
    public File c(String str) {
        return new File(this.f35002a, str + f34997c + f35000f);
    }

    public Map<String, String> g(String str) {
        return h(str, false);
    }

    Map<String, String> h(String str, boolean z3) {
        File b4;
        FileInputStream fileInputStream;
        if (z3) {
            b4 = a(str);
        } else {
            b4 = b(str);
        }
        if (!b4.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(b4);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            Map<String, String> d4 = d(C1799g.G(fileInputStream));
            C1799g.e(fileInputStream, "Failed to close user metadata file.");
            return d4;
        } catch (Exception e5) {
            e = e5;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.f.f().e("Error deserializing user metadata.", e);
            C1799g.e(fileInputStream2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            C1799g.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public T i(String str) {
        FileInputStream fileInputStream;
        File c4 = c(str);
        if (!c4.exists()) {
            return new T();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(c4);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            T e5 = e(C1799g.G(fileInputStream));
            C1799g.e(fileInputStream, "Failed to close user metadata file.");
            return e5;
        } catch (Exception e6) {
            e = e6;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.f.f().e("Error deserializing user metadata.", e);
            C1799g.e(fileInputStream2, "Failed to close user metadata file.");
            return new T();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            C1799g.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void l(String str, Map<String, String> map) {
        m(str, map, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str, Map<String, String> map, boolean z3) {
        File b4;
        String f4;
        BufferedWriter bufferedWriter;
        if (z3) {
            b4 = a(str);
        } else {
            b4 = b(str);
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                f4 = f(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b4), f34996b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            bufferedWriter.write(f4);
            bufferedWriter.flush();
            C1799g.e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.f.f().e("Error serializing key/value metadata.", e);
            C1799g.e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C1799g.e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void n(String str, T t3) {
        String j4;
        BufferedWriter bufferedWriter;
        File c4 = c(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                j4 = j(t3);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c4), f34996b));
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(j4);
            bufferedWriter.flush();
            C1799g.e(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.f.f().e("Error serializing user metadata.", e);
            C1799g.e(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C1799g.e(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
