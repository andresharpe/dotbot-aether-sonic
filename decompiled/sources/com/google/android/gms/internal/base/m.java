package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public interface m {
    ExecutorService a(int i4, int i5);

    ExecutorService b(int i4, ThreadFactory threadFactory, int i5);

    ExecutorService c(ThreadFactory threadFactory, int i4);
}
