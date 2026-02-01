package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.B;
import androidx.annotation.P;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @P
    @B("DynamiteLoaderV2ClassLoader.class")
    private static volatile ClassLoader f29089a;

    /* renamed from: b, reason: collision with root package name */
    @P
    @B("DynamiteLoaderV2ClassLoader.class")
    private static volatile Thread f29090b;

    @P
    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (d.class) {
            try {
                if (f29089a == null) {
                    f29089a = b();
                }
                classLoader = f29089a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return classLoader;
    }

    @P
    private static synchronized ClassLoader b() {
        synchronized (d.class) {
            ClassLoader classLoader = null;
            if (f29090b == null) {
                f29090b = c();
                if (f29090b == null) {
                    return null;
                }
            }
            synchronized (f29090b) {
                try {
                    classLoader = f29090b.getContextClassLoader();
                } catch (SecurityException e4) {
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e4.getMessage());
                }
            }
            return classLoader;
        }
    }

    @P
    private static synchronized Thread c() {
        SecurityException e4;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (d.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    try {
                        int activeGroupCount = threadGroup2.activeGroupCount();
                        ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                        threadGroup2.enumerate(threadGroupArr);
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i5 < activeGroupCount) {
                                threadGroup = threadGroupArr[i5];
                                if ("dynamiteLoader".equals(threadGroup.getName())) {
                                    break;
                                }
                                i5++;
                            } else {
                                threadGroup = null;
                                break;
                            }
                        }
                        if (threadGroup == null) {
                            threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                        }
                        int activeCount = threadGroup.activeCount();
                        Thread[] threadArr = new Thread[activeCount];
                        threadGroup.enumerate(threadArr);
                        while (true) {
                            if (i4 < activeCount) {
                                thread2 = threadArr[i4];
                                if ("GmsDynamite".equals(thread2.getName())) {
                                    break;
                                }
                                i4++;
                            } else {
                                thread2 = null;
                                break;
                            }
                        }
                    } finally {
                    }
                } catch (SecurityException e5) {
                    e4 = e5;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new c(threadGroup, "GmsDynamite");
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e6) {
                            e4 = e6;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e4.getMessage());
                            thread2 = thread;
                            return thread2;
                        }
                    } catch (SecurityException e7) {
                        e4 = e7;
                        thread = thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
