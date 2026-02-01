package com.google.android.play.core.review;

import android.app.PendingIntent;

/* loaded from: classes2.dex */
final class d extends a {

    /* renamed from: E, reason: collision with root package name */
    private final PendingIntent f34416E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f34417F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(PendingIntent pendingIntent, boolean z3) {
        if (pendingIntent != null) {
            this.f34416E = pendingIntent;
            this.f34417F = z3;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    @Override // com.google.android.play.core.review.a
    final PendingIntent a() {
        return this.f34416E;
    }

    @Override // com.google.android.play.core.review.a
    final boolean b() {
        return this.f34417F;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f34416E.equals(aVar.a()) && this.f34417F == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.f34416E.hashCode() ^ 1000003) * 1000003;
        if (true != this.f34417F) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        return hashCode ^ i4;
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f34416E.toString() + ", isNoOp=" + this.f34417F + "}";
    }
}
