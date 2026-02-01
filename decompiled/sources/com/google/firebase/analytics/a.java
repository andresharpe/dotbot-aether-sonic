package com.google.firebase.analytics;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class a extends ThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FirebaseAnalytics firebaseAnalytics, int i4, int i5, long j4, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }
}
