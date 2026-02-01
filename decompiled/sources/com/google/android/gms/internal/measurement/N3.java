package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class N3 extends P3 {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f29401c;

    /* renamed from: d, reason: collision with root package name */
    private int f29402d;

    /* renamed from: e, reason: collision with root package name */
    private int f29403e;

    /* renamed from: f, reason: collision with root package name */
    private int f29404f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ N3(byte[] bArr, int i4, int i5, boolean z3, M3 m32) {
        super(null);
        this.f29404f = Integer.MAX_VALUE;
        this.f29401c = bArr;
        this.f29402d = 0;
    }

    public final int c(int i4) throws zzko {
        int i5 = this.f29404f;
        this.f29404f = 0;
        int i6 = this.f29402d + this.f29403e;
        this.f29402d = i6;
        if (i6 > 0) {
            this.f29403e = i6;
            this.f29402d = i6 - i6;
        } else {
            this.f29403e = 0;
        }
        return i5;
    }
}
