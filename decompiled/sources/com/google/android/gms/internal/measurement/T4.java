package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
final class T4 implements InterfaceC1353a5 {

    /* renamed from: a, reason: collision with root package name */
    private final P4 f29502a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1488r5 f29503b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29504c;

    /* renamed from: d, reason: collision with root package name */
    private final Y3 f29505d;

    private T4(AbstractC1488r5 abstractC1488r5, Y3 y3, P4 p4) {
        this.f29503b = abstractC1488r5;
        this.f29504c = y3.c(p4);
        this.f29505d = y3;
        this.f29502a = p4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static T4 c(AbstractC1488r5 abstractC1488r5, Y3 y3, P4 p4) {
        return new T4(abstractC1488r5, y3, p4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final void a(Object obj, I5 i5) throws IOException {
        this.f29505d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final void b(Object obj, byte[] bArr, int i4, int i5, C1542y3 c1542y3) throws IOException {
        AbstractC1440l4 abstractC1440l4 = (AbstractC1440l4) obj;
        if (abstractC1440l4.zzc == C1496s5.c()) {
            abstractC1440l4.zzc = C1496s5.e();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final int zza(Object obj) {
        AbstractC1488r5 abstractC1488r5 = this.f29503b;
        int b4 = abstractC1488r5.b(abstractC1488r5.c(obj));
        if (!this.f29504c) {
            return b4;
        }
        this.f29505d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final int zzb(Object obj) {
        int hashCode = this.f29503b.c(obj).hashCode();
        if (!this.f29504c) {
            return hashCode;
        }
        this.f29505d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final Object zze() {
        return this.f29502a.d().v();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final void zzf(Object obj) {
        this.f29503b.g(obj);
        this.f29505d.b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final void zzg(Object obj, Object obj2) {
        C1369c5.f(this.f29503b, obj, obj2);
        if (this.f29504c) {
            C1369c5.e(this.f29505d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.f29503b.c(obj).equals(this.f29503b.c(obj2))) {
            return false;
        }
        if (!this.f29504c) {
            return true;
        }
        this.f29505d.a(obj);
        this.f29505d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final boolean zzk(Object obj) {
        this.f29505d.a(obj);
        throw null;
    }
}
