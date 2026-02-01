package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class G2 {

    /* renamed from: f, reason: collision with root package name */
    static HashMap f29334f;

    /* renamed from: k, reason: collision with root package name */
    private static Object f29339k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f29340l;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f29329a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f29330b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f29331c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f29332d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f29333e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    static final HashMap f29335g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    static final HashMap f29336h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    static final HashMap f29337i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    static final HashMap f29338j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    static final String[] f29341m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (G2.class) {
            try {
                String str3 = null;
                if (f29334f == null) {
                    f29333e.set(false);
                    f29334f = new HashMap();
                    f29339k = new Object();
                    f29340l = false;
                    contentResolver.registerContentObserver(f29329a, true, new F2(null));
                } else if (f29333e.getAndSet(false)) {
                    f29334f.clear();
                    f29335g.clear();
                    f29336h.clear();
                    f29337i.clear();
                    f29338j.clear();
                    f29339k = new Object();
                    f29340l = false;
                }
                Object obj = f29339k;
                if (f29334f.containsKey(str)) {
                    String str4 = (String) f29334f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f29341m.length;
                Cursor query = contentResolver.query(f29329a, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        c(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string != null) {
                        str3 = string;
                    }
                    return str3;
                } finally {
                    query.close();
                }
            } finally {
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (G2.class) {
            try {
                if (obj == f29339k) {
                    f29334f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
