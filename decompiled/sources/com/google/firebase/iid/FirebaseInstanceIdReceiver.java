package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.j0;
import com.google.android.gms.cloudmessaging.AbstractC1159b;
import com.google.android.gms.cloudmessaging.C1158a;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.messaging.C1829n;
import com.google.firebase.messaging.J;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1159b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f35980b = "FirebaseMessaging";

    private static Intent g(@N Context context, @N String str, @N Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.AbstractC1159b
    @j0
    protected int b(@N Context context, @N C1158a c1158a) {
        try {
            return ((Integer) C1773n.a(new C1829n(context).i(c1158a.u0()))).intValue();
        } catch (InterruptedException | ExecutionException e4) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e4);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.AbstractC1159b
    @j0
    protected void c(@N Context context, @N Bundle bundle) {
        Intent g4 = g(context, AbstractC1159b.a.f27898b, bundle);
        if (J.E(g4)) {
            J.v(g4);
        }
    }
}
