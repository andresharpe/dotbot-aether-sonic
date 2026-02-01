package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.android.gms.common.util.InterfaceC1303d;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    @i0(otherwise = 3)
    public static final Charset f37466e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f37467f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f37468g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC1303d<String, f>> f37469a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f37470b;

    /* renamed from: c, reason: collision with root package name */
    private final e f37471c;

    /* renamed from: d, reason: collision with root package name */
    private final e f37472d;

    public m(Executor executor, e eVar, e eVar2) {
        this.f37470b = executor;
        this.f37471c = eVar;
        this.f37472d = eVar2;
    }

    private void c(final String str, final f fVar) {
        if (fVar == null) {
            return;
        }
        synchronized (this.f37469a) {
            try {
                for (final InterfaceC1303d<String, f> interfaceC1303d : this.f37469a) {
                    this.f37470b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC1303d.this.a(str, fVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @P
    private static f g(e eVar) {
        return eVar.g();
    }

    @P
    private static Double i(e eVar, String str) {
        f g4 = g(eVar);
        if (g4 == null) {
            return null;
        }
        try {
            return Double.valueOf(g4.d().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set<String> j(e eVar) {
        HashSet hashSet = new HashSet();
        f g4 = g(eVar);
        if (g4 == null) {
            return hashSet;
        }
        Iterator<String> keys = g4.d().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static TreeSet<String> l(String str, f fVar) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> keys = fVar.d().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    @P
    private static Long n(e eVar, String str) {
        f g4 = g(eVar);
        if (g4 == null) {
            return null;
        }
        try {
            return Long.valueOf(g4.d().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @P
    private static String p(e eVar, String str) {
        f g4 = g(eVar);
        if (g4 == null) {
            return null;
        }
        try {
            return g4.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void s(String str, String str2) {
        Log.w(com.google.firebase.remoteconfig.l.f37534x, String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(InterfaceC1303d<String, f> interfaceC1303d) {
        synchronized (this.f37469a) {
            this.f37469a.add(interfaceC1303d);
        }
    }

    public Map<String, com.google.firebase.remoteconfig.o> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(j(this.f37471c));
        hashSet.addAll(j(this.f37472d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, q(str));
        }
        return hashMap;
    }

    public boolean e(String str) {
        String p4 = p(this.f37471c, str);
        if (p4 != null) {
            if (f37467f.matcher(p4).matches()) {
                c(str, g(this.f37471c));
                return true;
            }
            if (f37468g.matcher(p4).matches()) {
                c(str, g(this.f37471c));
                return false;
            }
        }
        String p5 = p(this.f37472d, str);
        if (p5 != null) {
            if (f37467f.matcher(p5).matches()) {
                return true;
            }
            if (f37468g.matcher(p5).matches()) {
                return false;
            }
        }
        s(str, "Boolean");
        return false;
    }

    public byte[] f(String str) {
        String p4 = p(this.f37471c, str);
        if (p4 != null) {
            c(str, g(this.f37471c));
            return p4.getBytes(f37466e);
        }
        String p5 = p(this.f37472d, str);
        if (p5 != null) {
            return p5.getBytes(f37466e);
        }
        s(str, "ByteArray");
        return com.google.firebase.remoteconfig.l.f37526p;
    }

    public double h(String str) {
        Double i4 = i(this.f37471c, str);
        if (i4 != null) {
            c(str, g(this.f37471c));
            return i4.doubleValue();
        }
        Double i5 = i(this.f37472d, str);
        if (i5 != null) {
            return i5.doubleValue();
        }
        s(str, "Double");
        return com.google.firebase.remoteconfig.l.f37524n;
    }

    public Set<String> k(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        f g4 = g(this.f37471c);
        if (g4 != null) {
            treeSet.addAll(l(str, g4));
        }
        f g5 = g(this.f37472d);
        if (g5 != null) {
            treeSet.addAll(l(str, g5));
        }
        return treeSet;
    }

    public long m(String str) {
        Long n4 = n(this.f37471c, str);
        if (n4 != null) {
            c(str, g(this.f37471c));
            return n4.longValue();
        }
        Long n5 = n(this.f37472d, str);
        if (n5 != null) {
            return n5.longValue();
        }
        s(str, "Long");
        return 0L;
    }

    public String o(String str) {
        String p4 = p(this.f37471c, str);
        if (p4 != null) {
            c(str, g(this.f37471c));
            return p4;
        }
        String p5 = p(this.f37472d, str);
        if (p5 != null) {
            return p5;
        }
        s(str, "String");
        return "";
    }

    public com.google.firebase.remoteconfig.o q(String str) {
        String p4 = p(this.f37471c, str);
        if (p4 != null) {
            c(str, g(this.f37471c));
            return new r(p4, 2);
        }
        String p5 = p(this.f37472d, str);
        if (p5 != null) {
            return new r(p5, 1);
        }
        s(str, "FirebaseRemoteConfigValue");
        return new r("", 0);
    }
}
