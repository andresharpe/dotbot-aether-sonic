package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1498t implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    private int f29782E = 0;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1514v f29783F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1498t(C1514v c1514v) {
        this.f29783F = c1514v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i4 = this.f29782E;
        str = this.f29783F.f29810E;
        return i4 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i4 = this.f29782E;
        str = this.f29783F.f29810E;
        if (i4 < str.length()) {
            this.f29782E = i4 + 1;
            return new C1514v(String.valueOf(i4));
        }
        throw new NoSuchElementException();
    }
}
