package com.google.android.gms.common.providers;

import androidx.annotation.N;
import java.util.concurrent.ScheduledExecutorService;

@I0.a
@Deprecated
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0270a f28864a;

    /* renamed from: com.google.android.gms.common.providers.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0270a {
        @I0.a
        @N
        @Deprecated
        ScheduledExecutorService a();
    }

    private a() {
    }

    @I0.a
    @N
    @Deprecated
    public static synchronized InterfaceC0270a a() {
        InterfaceC0270a interfaceC0270a;
        synchronized (a.class) {
            try {
                if (f28864a == null) {
                    f28864a = new b();
                }
                interfaceC0270a = f28864a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0270a;
    }
}
