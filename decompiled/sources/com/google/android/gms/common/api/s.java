package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.N;
import com.google.android.gms.common.api.q;

/* loaded from: classes.dex */
public abstract class s<R extends q> implements r<R> {
    @Override // com.google.android.gms.common.api.r
    @I0.a
    public final void a(@N R r4) {
        Status status = r4.getStatus();
        if (status.B0()) {
            c(r4);
            return;
        }
        b(status);
        if (r4 instanceof n) {
            try {
                ((n) r4).release();
            } catch (RuntimeException e4) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r4)), e4);
            }
        }
    }

    public abstract void b(@N Status status);

    public abstract void c(@N R r4);
}
