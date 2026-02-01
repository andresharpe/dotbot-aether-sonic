package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1506u implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    private int f29800E = 0;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1514v f29801F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1506u(C1514v c1514v) {
        this.f29801F = c1514v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i4 = this.f29800E;
        str = this.f29801F.f29810E;
        return i4 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i4 = this.f29800E;
        C1514v c1514v = this.f29801F;
        str = c1514v.f29810E;
        if (i4 < str.length()) {
            str2 = c1514v.f29810E;
            this.f29800E = i4 + 1;
            return new C1514v(String.valueOf(str2.charAt(i4)));
        }
        throw new NoSuchElementException();
    }
}
