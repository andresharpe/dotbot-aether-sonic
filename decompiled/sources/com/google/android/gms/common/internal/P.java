package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Set<Scope> f28637a;

    public P(Set<Scope> set) {
        C1285y.l(set);
        this.f28637a = Collections.unmodifiableSet(set);
    }
}
