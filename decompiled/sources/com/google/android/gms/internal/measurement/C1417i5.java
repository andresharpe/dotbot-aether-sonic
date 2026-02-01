package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1417i5 implements Map.Entry, Comparable {

    /* renamed from: E, reason: collision with root package name */
    private final Comparable f29670E;

    /* renamed from: F, reason: collision with root package name */
    private Object f29671F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1465o5 f29672G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1417i5(C1465o5 c1465o5, Comparable comparable, Object obj) {
        this.f29672G = c1465o5;
        this.f29670E = comparable;
        this.f29671F = obj;
    }

    private static final boolean e(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f29670E;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f29670E.compareTo(((C1417i5) obj).f29670E);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (e(this.f29670E, entry.getKey()) && e(this.f29671F, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f29670E;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29671F;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f29670E;
        int i4 = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f29671F;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return hashCode ^ i4;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f29672G.r();
        Object obj2 = this.f29671F;
        this.f29671F = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f29670E) + "=" + String.valueOf(this.f29671F);
    }
}
