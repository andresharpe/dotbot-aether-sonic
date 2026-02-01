package com.google.android.gms.common.api;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.j0;
import com.google.android.gms.common.api.internal.W0;
import com.google.android.gms.common.api.q;

/* loaded from: classes.dex */
public abstract class t<R extends q, S extends q> {
    @N
    public final l<S> a(@N Status status) {
        return new W0(status);
    }

    @N
    public Status b(@N Status status) {
        return status;
    }

    @P
    @j0
    public abstract l<S> c(@N R r4);
}
