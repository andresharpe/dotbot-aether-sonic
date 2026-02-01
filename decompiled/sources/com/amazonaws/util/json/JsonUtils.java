package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class JsonUtils {

    /* renamed from: a, reason: collision with root package name */
    private static volatile com.amazonaws.util.json.a f24314a = new e();

    /* loaded from: classes.dex */
    public enum JsonEngine {
        Gson,
        Jackson
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24315a;

        static {
            int[] iArr = new int[JsonEngine.values().length];
            f24315a = iArr;
            try {
                iArr[JsonEngine.Gson.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24315a[JsonEngine.Jackson.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static b a(Reader reader) {
        if (f24314a != null) {
            return f24314a.b(reader);
        }
        throw new IllegalStateException("Json engine is unavailable.");
    }

    public static c b(Writer writer) {
        if (f24314a != null) {
            return f24314a.a(writer);
        }
        throw new IllegalStateException("Json engine is unavailable.");
    }

    private static boolean c(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Map<String, String> d(Reader reader) {
        b a4 = a(reader);
        try {
            if (a4.peek() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap hashMap = new HashMap();
            a4.b();
            while (a4.hasNext()) {
                String h4 = a4.h();
                if (a4.g()) {
                    a4.f();
                } else {
                    hashMap.put(h4, a4.e());
                }
            }
            a4.a();
            a4.close();
            return Collections.unmodifiableMap(hashMap);
        } catch (IOException e4) {
            throw new AmazonClientException("Unable to parse JSON String.", e4);
        }
    }

    public static Map<String, String> e(String str) {
        if (str != null && !str.isEmpty()) {
            return d(new StringReader(str));
        }
        return Collections.EMPTY_MAP;
    }

    public static String f(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                c b4 = b(stringWriter);
                b4.b();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    b4.l(entry.getKey()).g(entry.getValue());
                }
                b4.a();
                b4.close();
                return stringWriter.toString();
            } catch (IOException e4) {
                throw new AmazonClientException("Unable to serialize to JSON String.", e4);
            }
        }
        return "{}";
    }

    static void g(com.amazonaws.util.json.a aVar) {
        if (aVar != null) {
            f24314a = aVar;
            return;
        }
        throw new IllegalArgumentException("factory can't be null");
    }

    public static void h(JsonEngine jsonEngine) {
        int i4 = a.f24315a[jsonEngine.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                f24314a = new f();
                return;
            }
            throw new RuntimeException("Unsupported json engine");
        }
        f24314a = new e();
    }
}
