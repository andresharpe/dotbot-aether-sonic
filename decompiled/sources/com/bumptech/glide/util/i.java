package com.bumptech.glide.util;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f26949a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f26950b;

    /* renamed from: c, reason: collision with root package name */
    private long f26951c;

    /* renamed from: d, reason: collision with root package name */
    private long f26952d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        final Y f26953a;

        /* renamed from: b, reason: collision with root package name */
        final int f26954b;

        a(Y y3, int i4) {
            this.f26953a = y3;
            this.f26954b = i4;
        }
    }

    public i(long j4) {
        this.f26950b = j4;
        this.f26951c = j4;
    }

    private void j() {
        q(this.f26951c);
    }

    public void b() {
        q(0L);
    }

    public synchronized void c(float f4) {
        if (f4 >= 0.0f) {
            this.f26951c = Math.round(((float) this.f26950b) * f4);
            j();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    public synchronized long d() {
        return this.f26952d;
    }

    public synchronized long e() {
        return this.f26951c;
    }

    public synchronized boolean i(@N T t3) {
        return this.f26949a.containsKey(t3);
    }

    @P
    public synchronized Y k(@N T t3) {
        Y y3;
        a<Y> aVar = this.f26949a.get(t3);
        if (aVar != null) {
            y3 = aVar.f26953a;
        } else {
            y3 = null;
        }
        return y3;
    }

    protected synchronized int l() {
        return this.f26949a.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int m(@P Y y3) {
        return 1;
    }

    protected void n(@N T t3, @P Y y3) {
    }

    @P
    public synchronized Y o(@N T t3, @P Y y3) {
        a<Y> aVar;
        int m4 = m(y3);
        long j4 = m4;
        Y y4 = null;
        if (j4 >= this.f26951c) {
            n(t3, y3);
            return null;
        }
        if (y3 != null) {
            this.f26952d += j4;
        }
        Map<T, a<Y>> map = this.f26949a;
        if (y3 == null) {
            aVar = null;
        } else {
            aVar = new a<>(y3, m4);
        }
        a<Y> put = map.put(t3, aVar);
        if (put != null) {
            this.f26952d -= put.f26954b;
            if (!put.f26953a.equals(y3)) {
                n(t3, put.f26953a);
            }
        }
        j();
        if (put != null) {
            y4 = put.f26953a;
        }
        return y4;
    }

    @P
    public synchronized Y p(@N T t3) {
        a<Y> remove = this.f26949a.remove(t3);
        if (remove == null) {
            return null;
        }
        this.f26952d -= remove.f26954b;
        return remove.f26953a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void q(long j4) {
        while (this.f26952d > j4) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f26949a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f26952d -= value.f26954b;
            T key = next.getKey();
            it.remove();
            n(key, value.f26953a);
        }
    }
}
