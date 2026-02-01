package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@x0.h
/* loaded from: classes.dex */
abstract class k {
    k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.f
    @x0.i
    public static Executor a() {
        return new o(Executors.newSingleThreadExecutor());
    }
}
