package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
final class J2 extends AbstractC1399g3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29366a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1471p3 f29367b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J2(Context context, @Nullable InterfaceC1471p3 interfaceC1471p3) {
        if (context != null) {
            this.f29366a = context;
            this.f29367b = interfaceC1471p3;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1399g3
    public final Context a() {
        return this.f29366a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1399g3
    @Nullable
    public final InterfaceC1471p3 b() {
        return this.f29367b;
    }

    public final boolean equals(Object obj) {
        InterfaceC1471p3 interfaceC1471p3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1399g3) {
            AbstractC1399g3 abstractC1399g3 = (AbstractC1399g3) obj;
            if (this.f29366a.equals(abstractC1399g3.a()) && ((interfaceC1471p3 = this.f29367b) != null ? interfaceC1471p3.equals(abstractC1399g3.b()) : abstractC1399g3.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f29366a.hashCode() ^ 1000003) * 1000003;
        InterfaceC1471p3 interfaceC1471p3 = this.f29367b;
        if (interfaceC1471p3 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC1471p3.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f29366a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.f29367b) + "}";
    }
}
