package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.j0;
import java.io.Closeable;

@j0
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1134d extends Closeable {
    Iterable<AbstractC1141k> C(com.google.android.datatransport.runtime.q qVar);

    @androidx.annotation.P
    AbstractC1141k I0(com.google.android.datatransport.runtime.q qVar, com.google.android.datatransport.runtime.j jVar);

    void J(com.google.android.datatransport.runtime.q qVar, long j4);

    long O0(com.google.android.datatransport.runtime.q qVar);

    Iterable<com.google.android.datatransport.runtime.q> Q();

    boolean S0(com.google.android.datatransport.runtime.q qVar);

    void T0(Iterable<AbstractC1141k> iterable);

    int o();

    void r(Iterable<AbstractC1141k> iterable);
}
