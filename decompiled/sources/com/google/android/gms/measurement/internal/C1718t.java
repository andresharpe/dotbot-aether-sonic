package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1718t implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    final Iterator f30969E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1724u f30970F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1718t(C1724u c1724u) {
        Bundle bundle;
        this.f30970F = c1724u;
        bundle = c1724u.f30988E;
        this.f30969E = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f30969E.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30969E.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
