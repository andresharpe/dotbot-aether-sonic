package com.google.firebase.messaging;

import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1830o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37071a = "Firebase-Messaging-Network-Io";

    /* renamed from: b, reason: collision with root package name */
    private static final String f37072b = "Firebase-Messaging-Task";

    /* renamed from: c, reason: collision with root package name */
    private static final String f37073c = "Firebase-Messaging-File";

    /* renamed from: d, reason: collision with root package name */
    private static final String f37074d = "Firebase-Messaging-Intent-Handle";

    /* renamed from: e, reason: collision with root package name */
    private static final String f37075e = "Firebase-Messaging-Topics-Io";

    /* renamed from: f, reason: collision with root package name */
    private static final String f37076f = "Firebase-Messaging-Init";

    /* renamed from: g, reason: collision with root package name */
    static final String f37077g = "Firebase-Messaging-File-Io";

    /* renamed from: h, reason: collision with root package name */
    static final String f37078h = "Firebase-Messaging-Rpc-Task";

    private C1830o() {
    }

    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b(str));
    }

    static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.b(f37073c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor c() {
        return a(f37077g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService d() {
        return new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b(f37076f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService e() {
        return com.google.firebase.messaging.threads.b.a().i(new com.google.android.gms.common.util.concurrent.b(f37074d), ThreadPriority.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.b(f37071a));
    }

    static Executor g() {
        return a(f37078h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService h() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.b(f37072b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService i() {
        return new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b(f37075e));
    }
}
