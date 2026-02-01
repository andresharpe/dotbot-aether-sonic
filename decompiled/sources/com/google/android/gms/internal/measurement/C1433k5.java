package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1433k5 implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    private int f29705E = -1;

    /* renamed from: F, reason: collision with root package name */
    private boolean f29706F;

    /* renamed from: G, reason: collision with root package name */
    private Iterator f29707G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1465o5 f29708H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1433k5(C1465o5 c1465o5, C1425j5 c1425j5) {
        this.f29708H = c1465o5;
    }

    private final Iterator a() {
        Map map;
        if (this.f29707G == null) {
            map = this.f29708H.f29730G;
            this.f29707G = map.entrySet().iterator();
        }
        return this.f29707G;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i4 = this.f29705E + 1;
        list = this.f29708H.f29729F;
        if (i4 >= list.size()) {
            map = this.f29708H.f29730G;
            if (!map.isEmpty() && a().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f29706F = true;
        int i4 = this.f29705E + 1;
        this.f29705E = i4;
        list = this.f29708H.f29729F;
        if (i4 < list.size()) {
            list2 = this.f29708H.f29729F;
            return (Map.Entry) list2.get(this.f29705E);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f29706F) {
            this.f29706F = false;
            this.f29708H.r();
            int i4 = this.f29705E;
            list = this.f29708H.f29729F;
            if (i4 < list.size()) {
                C1465o5 c1465o5 = this.f29708H;
                int i5 = this.f29705E;
                this.f29705E = i5 - 1;
                c1465o5.p(i5);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
