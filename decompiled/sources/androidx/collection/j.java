package androidx.collection;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class j<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f6494a;

    /* renamed from: b, reason: collision with root package name */
    private int f6495b;

    /* renamed from: c, reason: collision with root package name */
    private int f6496c;

    /* renamed from: d, reason: collision with root package name */
    private int f6497d;

    /* renamed from: e, reason: collision with root package name */
    private int f6498e;

    /* renamed from: f, reason: collision with root package name */
    private int f6499f;

    /* renamed from: g, reason: collision with root package name */
    private int f6500g;

    /* renamed from: h, reason: collision with root package name */
    private int f6501h;

    public j(int i4) {
        if (i4 > 0) {
            this.f6496c = i4;
            this.f6494a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int n(K k4, V v3) {
        int p4 = p(k4, v3);
        if (p4 >= 0) {
            return p4;
        }
        throw new IllegalStateException("Negative size: " + k4 + "=" + v3);
    }

    @P
    protected V a(@N K k4) {
        return null;
    }

    public final synchronized int b() {
        return this.f6498e;
    }

    protected void c(boolean z3, @N K k4, @N V v3, @P V v4) {
    }

    public final void d() {
        r(-1);
    }

    public final synchronized int e() {
        return this.f6499f;
    }

    @P
    public final V f(@N K k4) {
        V v3;
        if (k4 != null) {
            synchronized (this) {
                try {
                    V v4 = this.f6494a.get(k4);
                    if (v4 != null) {
                        this.f6500g++;
                        return v4;
                    }
                    this.f6501h++;
                    V a4 = a(k4);
                    if (a4 == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.f6498e++;
                            v3 = (V) this.f6494a.put(k4, a4);
                            if (v3 != null) {
                                this.f6494a.put(k4, v3);
                            } else {
                                this.f6495b += n(k4, a4);
                            }
                        } finally {
                        }
                    }
                    if (v3 != null) {
                        c(false, k4, a4, v3);
                        return v3;
                    }
                    r(this.f6496c);
                    return a4;
                } finally {
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized int g() {
        return this.f6500g;
    }

    public final synchronized int h() {
        return this.f6496c;
    }

    public final synchronized int i() {
        return this.f6501h;
    }

    @P
    public final V j(@N K k4, @N V v3) {
        V put;
        if (k4 != null && v3 != null) {
            synchronized (this) {
                try {
                    this.f6497d++;
                    this.f6495b += n(k4, v3);
                    put = this.f6494a.put(k4, v3);
                    if (put != null) {
                        this.f6495b -= n(k4, put);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                c(false, k4, put, v3);
            }
            r(this.f6496c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final synchronized int k() {
        return this.f6497d;
    }

    @P
    public final V l(@N K k4) {
        V remove;
        if (k4 != null) {
            synchronized (this) {
                try {
                    remove = this.f6494a.remove(k4);
                    if (remove != null) {
                        this.f6495b -= n(k4, remove);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (remove != null) {
                c(false, k4, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public void m(int i4) {
        if (i4 > 0) {
            synchronized (this) {
                this.f6496c = i4;
            }
            r(i4);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized int o() {
        return this.f6495b;
    }

    protected int p(@N K k4, @N V v3) {
        return 1;
    }

    public final synchronized Map<K, V> q() {
        return new LinkedHashMap(this.f6494a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f6495b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap<K, V> r0 = r4.f6494a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.f6495b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.f6495b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap<K, V> r0 = r4.f6494a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap<K, V> r0 = r4.f6494a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r4.f6494a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f6495b     // Catch: java.lang.Throwable -> L12
            int r3 = r4.n(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.f6495b = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f6499f     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.f6499f = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.c(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j.r(int):void");
    }

    public final synchronized String toString() {
        int i4;
        try {
            int i5 = this.f6500g;
            int i6 = this.f6501h + i5;
            if (i6 != 0) {
                i4 = (i5 * 100) / i6;
            } else {
                i4 = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f6496c), Integer.valueOf(this.f6500g), Integer.valueOf(this.f6501h), Integer.valueOf(i4));
    }
}
