package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;
import r0.InterfaceC2401a;

/* renamed from: com.blankj.utilcode.util.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104n implements InterfaceC2401a {

    /* renamed from: j, reason: collision with root package name */
    private static final long f25064j = Long.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    private static final int f25065k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    private static final String f25066l = "cdu_";

    /* renamed from: m, reason: collision with root package name */
    private static final String f25067m = "by_";

    /* renamed from: n, reason: collision with root package name */
    private static final String f25068n = "st_";

    /* renamed from: o, reason: collision with root package name */
    private static final String f25069o = "jo_";

    /* renamed from: p, reason: collision with root package name */
    private static final String f25070p = "ja_";

    /* renamed from: q, reason: collision with root package name */
    private static final String f25071q = "bi_";

    /* renamed from: r, reason: collision with root package name */
    private static final String f25072r = "dr_";

    /* renamed from: s, reason: collision with root package name */
    private static final String f25073s = "pa_";

    /* renamed from: t, reason: collision with root package name */
    private static final String f25074t = "se_";

    /* renamed from: u, reason: collision with root package name */
    private static final Map<String, C1104n> f25075u = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f25076e;

    /* renamed from: f, reason: collision with root package name */
    private final File f25077f;

    /* renamed from: g, reason: collision with root package name */
    private final long f25078g;

    /* renamed from: h, reason: collision with root package name */
    private final int f25079h;

    /* renamed from: i, reason: collision with root package name */
    private c f25080i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.blankj.utilcode.util.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final int f25081a = 14;

        private b() {
        }

        private static byte[] d(byte[] bArr, int i4, int i5) {
            int i6 = i5 - i4;
            if (i6 >= 0) {
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i4, bArr2, 0, Math.min(bArr.length - i4, i6));
                return bArr2;
            }
            throw new IllegalArgumentException(i4 + " > " + i5);
        }

        private static String e(int i4) {
            return String.format(Locale.getDefault(), "_$%010d$_", Long.valueOf((System.currentTimeMillis() / 1000) + i4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] f(byte[] bArr) {
            if (h(bArr)) {
                return d(bArr, 14, bArr.length);
            }
            return bArr;
        }

        private static long g(byte[] bArr) {
            if (h(bArr)) {
                try {
                    return Long.parseLong(new String(d(bArr, 2, 12))) * 1000;
                } catch (NumberFormatException unused) {
                }
            }
            return -1L;
        }

        private static boolean h(byte[] bArr) {
            if (bArr == null || bArr.length < 14 || bArr[0] != 95 || bArr[1] != 36 || bArr[12] != 36 || bArr[13] != 95) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean i(byte[] bArr) {
            long g4 = g(bArr);
            if (g4 != -1 && System.currentTimeMillis() > g4) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] j(int i4, byte[] bArr) {
            byte[] bytes = e(i4).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.blankj.utilcode.util.n$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicLong f25082a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f25083b;

        /* renamed from: c, reason: collision with root package name */
        private final long f25084c;

        /* renamed from: d, reason: collision with root package name */
        private final int f25085d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<File, Long> f25086e;

        /* renamed from: f, reason: collision with root package name */
        private final File f25087f;

        /* renamed from: g, reason: collision with root package name */
        private final Thread f25088g;

        /* renamed from: com.blankj.utilcode.util.n$c$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ File f25089E;

            /* renamed from: com.blankj.utilcode.util.n$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0218a implements FilenameFilter {
                C0218a() {
                }

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return str.startsWith(C1104n.f25066l);
                }
            }

            a(File file) {
                this.f25089E = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles = this.f25089E.listFiles(new C0218a());
                if (listFiles != null) {
                    int i4 = 0;
                    int i5 = 0;
                    for (File file : listFiles) {
                        i4 = (int) (i4 + file.length());
                        i5++;
                        c.this.f25086e.put(file, Long.valueOf(file.lastModified()));
                    }
                    c.this.f25082a.getAndAdd(i4);
                    c.this.f25083b.getAndAdd(i5);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.blankj.utilcode.util.n$c$b */
        /* loaded from: classes.dex */
        public class b implements FilenameFilter {
            b() {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith(C1104n.f25066l);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean l() {
            File[] listFiles = this.f25087f.listFiles(new b());
            boolean z3 = true;
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    if (!file.delete()) {
                        z3 = false;
                    } else {
                        this.f25082a.addAndGet(-file.length());
                        this.f25083b.addAndGet(-1);
                        this.f25086e.remove(file);
                    }
                }
                if (z3) {
                    this.f25086e.clear();
                    this.f25082a.set(0L);
                    this.f25083b.set(0);
                }
            }
            return z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int m() {
            v();
            return this.f25083b.get();
        }

        private String n(String str) {
            return C1104n.f25066l + str.substring(0, 3) + str.substring(3).hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long o() {
            v();
            return this.f25082a.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File p(String str) {
            v();
            File file = new File(this.f25087f, n(str));
            if (file.exists()) {
                this.f25083b.addAndGet(-1);
                this.f25082a.addAndGet(-file.length());
            }
            return file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File q(String str) {
            File file = new File(this.f25087f, n(str));
            if (!file.exists()) {
                return null;
            }
            return file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(File file) {
            this.f25083b.addAndGet(1);
            this.f25082a.addAndGet(file.length());
            while (true) {
                if (this.f25083b.get() <= this.f25085d && this.f25082a.get() <= this.f25084c) {
                    return;
                }
                this.f25082a.addAndGet(-t());
                this.f25083b.addAndGet(-1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean s(String str) {
            File q4 = q(str);
            if (q4 == null) {
                return true;
            }
            if (!q4.delete()) {
                return false;
            }
            this.f25082a.addAndGet(-q4.length());
            this.f25083b.addAndGet(-1);
            this.f25086e.remove(q4);
            return true;
        }

        private long t() {
            File file;
            if (this.f25086e.isEmpty()) {
                return 0L;
            }
            Long l4 = Long.MAX_VALUE;
            Set<Map.Entry<File, Long>> entrySet = this.f25086e.entrySet();
            synchronized (this.f25086e) {
                try {
                    file = null;
                    for (Map.Entry<File, Long> entry : entrySet) {
                        Long value = entry.getValue();
                        if (value.longValue() < l4.longValue()) {
                            file = entry.getKey();
                            l4 = value;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (file == null) {
                return 0L;
            }
            long length = file.length();
            if (!file.delete()) {
                return 0L;
            }
            this.f25086e.remove(file);
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(File file) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(valueOf.longValue());
            this.f25086e.put(file, valueOf);
        }

        private void v() {
            try {
                this.f25088g.join();
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
        }

        private c(File file, long j4, int i4) {
            this.f25086e = Collections.synchronizedMap(new HashMap());
            this.f25087f = file;
            this.f25084c = j4;
            this.f25085d = i4;
            this.f25082a = new AtomicLong();
            this.f25083b = new AtomicInteger();
            Thread thread = new Thread(new a(file));
            this.f25088g = thread;
            thread.start();
        }
    }

    private C1104n(String str, File file, long j4, int i4) {
        this.f25076e = str;
        this.f25077f = file;
        this.f25078g = j4;
        this.f25079h = i4;
    }

    private byte[] Q(@androidx.annotation.N String str) {
        return R(str, null);
    }

    private byte[] R(@androidx.annotation.N String str, byte[] bArr) {
        c h4 = h();
        if (h4 != null) {
            File q4 = h4.q(str);
            if (q4 == null) {
                return bArr;
            }
            byte[] P02 = H0.P0(q4);
            if (b.i(P02)) {
                h4.s(str);
                return bArr;
            }
            h4.u(q4);
            return b.f(P02);
        }
        return bArr;
    }

    private void S(String str, byte[] bArr, int i4) {
        c h4;
        if (bArr == null || (h4 = h()) == null) {
            return;
        }
        if (i4 >= 0) {
            bArr = b.j(i4, bArr);
        }
        File p4 = h4.p(str);
        H0.h1(p4, bArr);
        h4.u(p4);
        h4.r(p4);
    }

    private c h() {
        if (this.f25077f.exists()) {
            if (this.f25080i == null) {
                this.f25080i = new c(this.f25077f, this.f25078g, this.f25079h);
            }
        } else if (this.f25077f.mkdirs()) {
            this.f25080i = new c(this.f25077f, this.f25078g, this.f25079h);
        } else {
            Log.e("CacheDiskUtils", "can't make dirs in " + this.f25077f.getAbsolutePath());
        }
        return this.f25080i;
    }

    public static C1104n k() {
        return p("", Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static C1104n l(long j4, int i4) {
        return p("", j4, i4);
    }

    public static C1104n m(@androidx.annotation.N File file) {
        return n(file, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static C1104n n(@androidx.annotation.N File file, long j4, int i4) {
        String str = file.getAbsoluteFile() + "_" + j4 + "_" + i4;
        Map<String, C1104n> map = f25075u;
        C1104n c1104n = map.get(str);
        if (c1104n == null) {
            synchronized (C1104n.class) {
                try {
                    c1104n = map.get(str);
                    if (c1104n == null) {
                        C1104n c1104n2 = new C1104n(str, file, j4, i4);
                        map.put(str, c1104n2);
                        c1104n = c1104n2;
                    }
                } finally {
                }
            }
        }
        return c1104n;
    }

    public static C1104n o(String str) {
        return p(str, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static C1104n p(String str, long j4, int i4) {
        if (H0.D0(str)) {
            str = "cacheUtils";
        }
        return n(new File(E0.a().getCacheDir(), str), j4, i4);
    }

    public void A(@androidx.annotation.N String str, Bitmap bitmap) {
        B(str, bitmap, -1);
    }

    public void B(@androidx.annotation.N String str, Bitmap bitmap, int i4) {
        S(f25071q + str, H0.f(bitmap), i4);
    }

    public void C(@androidx.annotation.N String str, Drawable drawable) {
        D(str, drawable, -1);
    }

    public void D(@androidx.annotation.N String str, Drawable drawable, int i4) {
        S(f25072r + str, H0.y(drawable), i4);
    }

    public void E(@androidx.annotation.N String str, Parcelable parcelable) {
        F(str, parcelable, -1);
    }

    public void F(@androidx.annotation.N String str, Parcelable parcelable, int i4) {
        S(f25073s + str, H0.K0(parcelable), i4);
    }

    public void G(@androidx.annotation.N String str, Serializable serializable) {
        H(str, serializable, -1);
    }

    public void H(@androidx.annotation.N String str, Serializable serializable, int i4) {
        S(f25074t + str, H0.X0(serializable), i4);
    }

    public void I(@androidx.annotation.N String str, String str2) {
        J(str, str2, -1);
    }

    public void J(@androidx.annotation.N String str, String str2, int i4) {
        S(f25068n + str, H0.a1(str2), i4);
    }

    public void K(@androidx.annotation.N String str, JSONArray jSONArray) {
        L(str, jSONArray, -1);
    }

    public void L(@androidx.annotation.N String str, JSONArray jSONArray, int i4) {
        S(f25070p + str, H0.F0(jSONArray), i4);
    }

    public void M(@androidx.annotation.N String str, JSONObject jSONObject) {
        N(str, jSONObject, -1);
    }

    public void N(@androidx.annotation.N String str, JSONObject jSONObject, int i4) {
        S(f25069o + str, H0.G0(jSONObject), i4);
    }

    public void O(@androidx.annotation.N String str, byte[] bArr) {
        P(str, bArr, -1);
    }

    public void P(@androidx.annotation.N String str, byte[] bArr, int i4) {
        S(f25067m + str, bArr, i4);
    }

    public boolean T(@androidx.annotation.N String str) {
        c h4 = h();
        if (h4 == null) {
            return true;
        }
        if (h4.s(f25067m + str)) {
            if (h4.s(f25068n + str)) {
                if (h4.s(f25069o + str)) {
                    if (h4.s(f25070p + str)) {
                        if (h4.s(f25071q + str)) {
                            if (h4.s(f25072r + str)) {
                                if (h4.s(f25073s + str)) {
                                    if (h4.s(f25074t + str)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean a() {
        c h4 = h();
        if (h4 != null) {
            return h4.l();
        }
        return true;
    }

    public Bitmap b(@androidx.annotation.N String str) {
        return c(str, null);
    }

    public Bitmap c(@androidx.annotation.N String str, Bitmap bitmap) {
        byte[] Q3 = Q(f25071q + str);
        if (Q3 == null) {
            return bitmap;
        }
        return H0.j(Q3);
    }

    public byte[] d(@androidx.annotation.N String str) {
        return e(str, null);
    }

    public byte[] e(@androidx.annotation.N String str, byte[] bArr) {
        return R(f25067m + str, bArr);
    }

    public int f() {
        c h4 = h();
        if (h4 != null) {
            return h4.m();
        }
        return 0;
    }

    public long g() {
        c h4 = h();
        if (h4 != null) {
            return h4.o();
        }
        return 0L;
    }

    public Drawable i(@androidx.annotation.N String str) {
        return j(str, null);
    }

    public Drawable j(@androidx.annotation.N String str, Drawable drawable) {
        byte[] Q3 = Q(f25072r + str);
        if (Q3 == null) {
            return drawable;
        }
        return H0.k(Q3);
    }

    public JSONArray q(@androidx.annotation.N String str) {
        return r(str, null);
    }

    public JSONArray r(@androidx.annotation.N String str, JSONArray jSONArray) {
        byte[] Q3 = Q(f25070p + str);
        if (Q3 == null) {
            return jSONArray;
        }
        return H0.m(Q3);
    }

    public JSONObject s(@androidx.annotation.N String str) {
        return t(str, null);
    }

    public JSONObject t(@androidx.annotation.N String str, JSONObject jSONObject) {
        byte[] Q3 = Q(f25069o + str);
        if (Q3 == null) {
            return jSONObject;
        }
        return H0.n(Q3);
    }

    public String toString() {
        return this.f25076e + "@" + Integer.toHexString(hashCode());
    }

    public <T> T u(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator) {
        return (T) v(str, creator, null);
    }

    public <T> T v(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator, T t3) {
        byte[] Q3 = Q(f25073s + str);
        if (Q3 == null) {
            return t3;
        }
        return (T) H0.p(Q3, creator);
    }

    public Object w(@androidx.annotation.N String str) {
        return x(str, null);
    }

    public Object x(@androidx.annotation.N String str, Object obj) {
        byte[] Q3 = Q(f25074t + str);
        if (Q3 == null) {
            return obj;
        }
        return H0.o(Q3);
    }

    public String y(@androidx.annotation.N String str) {
        return z(str, null);
    }

    public String z(@androidx.annotation.N String str, String str2) {
        byte[] Q3 = Q(f25068n + str);
        if (Q3 == null) {
            return str2;
        }
        return H0.q(Q3);
    }
}
