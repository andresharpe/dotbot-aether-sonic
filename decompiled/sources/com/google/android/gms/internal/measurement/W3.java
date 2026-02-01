package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class W3 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29543a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29544b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W3(Object obj, int i4) {
        this.f29543a = obj;
        this.f29544b = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof W3)) {
            return false;
        }
        W3 w3 = (W3) obj;
        if (this.f29543a != w3.f29543a || this.f29544b != w3.f29544b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f29543a) * 65535) + this.f29544b;
    }
}
