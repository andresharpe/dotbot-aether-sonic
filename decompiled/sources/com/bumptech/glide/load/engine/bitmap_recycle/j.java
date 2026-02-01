package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.i0;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b {

    /* renamed from: h, reason: collision with root package name */
    private static final int f25896h = 4194304;

    /* renamed from: i, reason: collision with root package name */
    @i0
    static final int f25897i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final int f25898j = 2;

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Object> f25899b;

    /* renamed from: c, reason: collision with root package name */
    private final b f25900c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f25901d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> f25902e;

    /* renamed from: f, reason: collision with root package name */
    private final int f25903f;

    /* renamed from: g, reason: collision with root package name */
    private int f25904g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final b f25905a;

        /* renamed from: b, reason: collision with root package name */
        int f25906b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f25907c;

        a(b bVar) {
            this.f25905a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.n
        public void a() {
            this.f25905a.c(this);
        }

        void b(int i4, Class<?> cls) {
            this.f25906b = i4;
            this.f25907c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25906b != aVar.f25906b || this.f25907c != aVar.f25907c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i4;
            int i5 = this.f25906b * 31;
            Class<?> cls = this.f25907c;
            if (cls != null) {
                i4 = cls.hashCode();
            } else {
                i4 = 0;
            }
            return i5 + i4;
        }

        public String toString() {
            return "Key{size=" + this.f25906b + "array=" + this.f25907c + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i4, Class<?> cls) {
            a b4 = b();
            b4.b(i4, cls);
            return b4;
        }
    }

    @i0
    public j() {
        this.f25899b = new h<>();
        this.f25900c = new b();
        this.f25901d = new HashMap();
        this.f25902e = new HashMap();
        this.f25903f = 4194304;
    }

    private void f(int i4, Class<?> cls) {
        NavigableMap<Integer, Integer> n4 = n(cls);
        Integer num = n4.get(Integer.valueOf(i4));
        if (num != null) {
            if (num.intValue() == 1) {
                n4.remove(Integer.valueOf(i4));
                return;
            } else {
                n4.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i4 + ", this: " + this);
    }

    private void g() {
        h(this.f25903f);
    }

    private void h(int i4) {
        while (this.f25904g > i4) {
            Object f4 = this.f25899b.f();
            com.bumptech.glide.util.l.d(f4);
            com.bumptech.glide.load.engine.bitmap_recycle.a i5 = i(f4);
            this.f25904g -= i5.b(f4) * i5.a();
            f(i5.b(f4), f4.getClass());
            if (Log.isLoggable(i5.s(), 2)) {
                Log.v(i5.s(), "evicted: " + i5.b(f4));
            }
        }
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> i(T t3) {
        return j(t3.getClass());
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> j(Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) this.f25902e.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new i();
            } else if (cls.equals(byte[].class)) {
                aVar = new g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f25902e.put(cls, aVar);
        }
        return aVar;
    }

    @P
    private <T> T k(a aVar) {
        return (T) this.f25899b.a(aVar);
    }

    private <T> T m(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> j4 = j(cls);
        T t3 = (T) k(aVar);
        if (t3 != null) {
            this.f25904g -= j4.b(t3) * j4.a();
            f(j4.b(t3), cls);
        }
        if (t3 == null) {
            if (Log.isLoggable(j4.s(), 2)) {
                Log.v(j4.s(), "Allocated " + aVar.f25906b + " bytes");
            }
            return j4.newArray(aVar.f25906b);
        }
        return t3;
    }

    private NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f25901d.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f25901d.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private boolean o() {
        int i4 = this.f25904g;
        if (i4 != 0 && this.f25903f / i4 < 2) {
            return false;
        }
        return true;
    }

    private boolean p(int i4) {
        if (i4 <= this.f25903f / 2) {
            return true;
        }
        return false;
    }

    private boolean q(int i4, Integer num) {
        if (num != null && (o() || num.intValue() <= i4 * 8)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void a(int i4) {
        try {
            if (i4 >= 40) {
                b();
            } else if (i4 >= 20 || i4 == 15) {
                h(this.f25903f / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void b() {
        h(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T c(int i4, Class<T> cls) {
        return (T) m(this.f25900c.e(i4, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    @Deprecated
    public <T> void d(T t3, Class<T> cls) {
        put(t3);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T e(int i4, Class<T> cls) {
        a e4;
        try {
            Integer ceilingKey = n(cls).ceilingKey(Integer.valueOf(i4));
            if (q(i4, ceilingKey)) {
                e4 = this.f25900c.e(ceilingKey.intValue(), cls);
            } else {
                e4 = this.f25900c.e(i4, cls);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) m(e4, cls);
    }

    int l() {
        int i4 = 0;
        for (Class<?> cls : this.f25901d.keySet()) {
            for (Integer num : this.f25901d.get(cls).keySet()) {
                i4 += num.intValue() * this.f25901d.get(cls).get(num).intValue() * j(cls).a();
            }
        }
        return i4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> void put(T t3) {
        Class<?> cls = t3.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> j4 = j(cls);
        int b4 = j4.b(t3);
        int a4 = j4.a() * b4;
        if (!p(a4)) {
            return;
        }
        a e4 = this.f25900c.e(b4, cls);
        this.f25899b.d(e4, t3);
        NavigableMap<Integer, Integer> n4 = n(cls);
        Integer num = n4.get(Integer.valueOf(e4.f25906b));
        Integer valueOf = Integer.valueOf(e4.f25906b);
        int i4 = 1;
        if (num != null) {
            i4 = 1 + num.intValue();
        }
        n4.put(valueOf, Integer.valueOf(i4));
        this.f25904g += a4;
        g();
    }

    public j(int i4) {
        this.f25899b = new h<>();
        this.f25900c = new b();
        this.f25901d = new HashMap();
        this.f25902e = new HashMap();
        this.f25903f = i4;
    }
}
