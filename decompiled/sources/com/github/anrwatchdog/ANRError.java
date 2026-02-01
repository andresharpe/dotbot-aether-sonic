package com.github.anrwatchdog;

import android.os.Looper;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class ANRError extends Error {

    /* renamed from: F, reason: collision with root package name */
    private static final long f27140F = 1;

    /* renamed from: E, reason: collision with root package name */
    public final long f27141E;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        private final String f27142E;

        /* renamed from: F, reason: collision with root package name */
        private final StackTraceElement[] f27143F;

        /* renamed from: com.github.anrwatchdog.ANRError$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0249a extends Throwable {
            /* synthetic */ C0249a(a aVar, C0249a c0249a, b bVar) {
                this(c0249a);
            }

            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                setStackTrace(a.this.f27143F);
                return this;
            }

            private C0249a(C0249a c0249a) {
                super(a.this.f27142E, c0249a);
            }
        }

        /* synthetic */ a(String str, StackTraceElement[] stackTraceElementArr, b bVar) {
            this(str, stackTraceElementArr);
        }

        private a(String str, StackTraceElement[] stackTraceElementArr) {
            this.f27142E = str;
            this.f27143F = stackTraceElementArr;
        }
    }

    /* loaded from: classes.dex */
    static class b implements Comparator<Thread> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread f27145a;

        b(Thread thread) {
            this.f27145a = thread;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Thread thread, Thread thread2) {
            if (thread == thread2) {
                return 0;
            }
            Thread thread3 = this.f27145a;
            if (thread == thread3) {
                return 1;
            }
            if (thread2 == thread3) {
                return -1;
            }
            return thread2.getName().compareTo(thread.getName());
        }
    }

    private ANRError(a.C0249a c0249a, long j4) {
        super("Application Not Responding for at least " + j4 + " ms.", c0249a);
        this.f27141E = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ANRError a(long j4, String str, boolean z3) {
        Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new b(thread));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == thread || (entry.getKey().getName().startsWith(str) && (z3 || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        b bVar = null;
        a.C0249a c0249a = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            c0249a = new a.C0249a(new a(c((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue(), bVar), c0249a, bVar);
        }
        return new ANRError(c0249a, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static ANRError b(long j4) {
        Thread thread = Looper.getMainLooper().getThread();
        return new ANRError(new a.C0249a(new a(c(thread), thread.getStackTrace(), null), 0 == true ? 1 : 0, 0 == true ? 1 : 0), j4);
    }

    private static String c(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
