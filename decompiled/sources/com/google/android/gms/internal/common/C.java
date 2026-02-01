package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
final class C extends F {

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ D f29127L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d4, G g4, CharSequence charSequence) {
        super(g4, charSequence);
        this.f29127L = d4;
    }

    @Override // com.google.android.gms.internal.common.F
    final int c(int i4) {
        return i4 + 1;
    }

    @Override // com.google.android.gms.internal.common.F
    final int d(int i4) {
        x xVar = this.f29127L.f29128a;
        CharSequence charSequence = this.f29131G;
        int length = charSequence.length();
        B.b(i4, length, FirebaseAnalytics.b.f34777X);
        while (i4 < length) {
            if (!xVar.a(charSequence.charAt(i4))) {
                i4++;
            } else {
                return i4;
            }
        }
        return -1;
    }
}
