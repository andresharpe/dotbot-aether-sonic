package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    static ExecutorService f23588b = b();

    /* renamed from: a, reason: collision with root package name */
    private final com.amazonaws.event.b f23589a;

    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ com.amazonaws.event.b f23590E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ com.amazonaws.event.a f23591F;

        a(com.amazonaws.event.b bVar, com.amazonaws.event.a aVar) {
            this.f23590E = bVar;
            this.f23591F = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23590E.a(this.f23591F);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ com.amazonaws.event.a f23592E;

        b(com.amazonaws.event.a aVar) {
            this.f23592E = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f23589a.a(this.f23592E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.amazonaws.event.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC0201c implements ThreadFactory {
        ThreadFactoryC0201c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("android-sdk-progress-listener-callback-thread");
            thread.setDaemon(true);
            return thread;
        }
    }

    public c(com.amazonaws.event.b bVar) {
        this.f23589a = bVar;
    }

    static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC0201c());
    }

    protected static ExecutorService c() {
        return f23588b;
    }

    public static Future<?> e(com.amazonaws.event.b bVar, com.amazonaws.event.a aVar) {
        if (bVar == null) {
            return null;
        }
        return f23588b.submit(new a(bVar, aVar));
    }

    public static c g(com.amazonaws.event.b bVar) {
        if (bVar == null) {
            return null;
        }
        return new c(bVar);
    }

    protected com.amazonaws.event.b d() {
        return this.f23589a;
    }

    public void f(com.amazonaws.event.a aVar) {
        if (this.f23589a == null) {
            return;
        }
        f23588b.submit(new b(aVar));
    }

    public c() {
        this.f23589a = null;
    }
}
