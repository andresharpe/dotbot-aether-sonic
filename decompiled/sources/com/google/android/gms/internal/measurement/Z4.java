package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class Z4 implements M4 {

    /* renamed from: a, reason: collision with root package name */
    private final P4 f29573a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29574b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f29575c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29576d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z4(P4 p4, String str, Object[] objArr) {
        this.f29573a = p4;
        this.f29574b = str;
        this.f29575c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f29576d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 >= 55296) {
                i4 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i6 = i7;
            } else {
                this.f29576d = i4 | (charAt2 << i5);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.f29574b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] b() {
        return this.f29575c;
    }

    @Override // com.google.android.gms.internal.measurement.M4
    public final P4 zza() {
        return this.f29573a;
    }

    @Override // com.google.android.gms.internal.measurement.M4
    public final boolean zzb() {
        return (this.f29576d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.M4
    public final int zzc() {
        return (this.f29576d & 1) == 1 ? 1 : 2;
    }
}
