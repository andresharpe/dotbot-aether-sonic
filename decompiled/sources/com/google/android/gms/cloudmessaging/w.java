package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.firebase.messaging.C1821f;

/* loaded from: classes.dex */
final class w extends v<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w(int i4, int i5, Bundle bundle) {
        super(i4, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.v
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(C1821f.C0339f.a.f37006R);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.v
    public final boolean b() {
        return false;
    }
}
