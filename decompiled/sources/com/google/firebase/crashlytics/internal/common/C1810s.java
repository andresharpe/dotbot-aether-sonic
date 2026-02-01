package com.google.firebase.crashlytics.internal.common;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.crashlytics.internal.common.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1810s implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f35178a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.d f35179b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f35180c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f35181d = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.s$a */
    /* loaded from: classes2.dex */
    interface a {
        void a(com.google.firebase.crashlytics.internal.settings.d dVar, Thread thread, Throwable th);
    }

    public C1810s(a aVar, com.google.firebase.crashlytics.internal.settings.d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f35178a = aVar;
        this.f35179b = dVar;
        this.f35180c = uncaughtExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f35181d.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.crashlytics.internal.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f35181d.set(true);
        ?? r12 = "Completed exception processing. Invoking default exception handler.";
        try {
            try {
                if (thread == 0) {
                    com.google.firebase.crashlytics.internal.f.f().d("Could not handle uncaught exception; null thread");
                } else if (th == null) {
                    com.google.firebase.crashlytics.internal.f.f().d("Could not handle uncaught exception; null throwable");
                } else {
                    this.f35178a.a(this.f35179b, thread, th);
                }
            } catch (Exception e4) {
                com.google.firebase.crashlytics.internal.f.f().e("An error occurred in the uncaught exception handler", e4);
            }
            com.google.firebase.crashlytics.internal.f.f().b("Completed exception processing. Invoking default exception handler.");
            r12 = this.f35180c;
            r12.uncaughtException(thread, th);
            thread = this.f35181d;
            thread.set(false);
        } catch (Throwable th2) {
            com.google.firebase.crashlytics.internal.f.f().b(r12);
            this.f35180c.uncaughtException(thread, th);
            this.f35181d.set(false);
            throw th2;
        }
    }
}
