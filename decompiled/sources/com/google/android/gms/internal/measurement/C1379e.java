package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1379e implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    private int f29624E = 0;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1387f f29625F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1379e(C1387f c1387f) {
        this.f29625F = c1387f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f29624E < this.f29625F.j()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f29624E < this.f29625F.j()) {
            C1387f c1387f = this.f29625F;
            int i4 = this.f29624E;
            this.f29624E = i4 + 1;
            return c1387f.k(i4);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f29624E);
    }
}
