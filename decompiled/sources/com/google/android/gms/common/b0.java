package com.google.android.gms.common;

import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.common.zzag;
import java.util.List;
import l1.InterfaceC2354a;

/* loaded from: classes.dex */
final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private String f28466a = null;

    /* renamed from: b, reason: collision with root package name */
    private long f28467b = -1;

    /* renamed from: c, reason: collision with root package name */
    private zzag f28468c = zzag.p();

    /* renamed from: d, reason: collision with root package name */
    private zzag f28469d = zzag.p();

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC2354a
    public final b0 a(long j4) {
        this.f28467b = j4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC2354a
    public final b0 b(List list) {
        C1285y.l(list);
        this.f28469d = zzag.o(list);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC2354a
    public final b0 c(List list) {
        C1285y.l(list);
        this.f28468c = zzag.o(list);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC2354a
    public final b0 d(String str) {
        this.f28466a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1312z e() {
        if (this.f28466a != null) {
            if (this.f28467b >= 0) {
                if (this.f28468c.isEmpty() && this.f28469d.isEmpty()) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                }
                return new C1312z(this.f28466a, this.f28467b, this.f28468c, this.f28469d, null);
            }
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        throw new IllegalStateException("packageName must be defined");
    }
}
