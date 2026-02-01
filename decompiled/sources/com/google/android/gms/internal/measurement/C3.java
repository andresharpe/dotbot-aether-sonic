package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class C3 extends E3 {

    /* renamed from: E, reason: collision with root package name */
    private int f29284E = 0;

    /* renamed from: F, reason: collision with root package name */
    private final int f29285F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ zzjd f29286G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3(zzjd zzjdVar) {
        this.f29286G = zzjdVar;
        this.f29285F = zzjdVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29284E < this.f29285F;
    }

    @Override // com.google.android.gms.internal.measurement.G3
    public final byte zza() {
        int i4 = this.f29284E;
        if (i4 < this.f29285F) {
            this.f29284E = i4 + 1;
            return this.f29286G.c(i4);
        }
        throw new NoSuchElementException();
    }
}
