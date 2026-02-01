package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes.dex */
final class u extends v<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(int i4, int i5, Bundle bundle) {
        super(i4, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.v
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzq(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.v
    public final boolean b() {
        return true;
    }
}
