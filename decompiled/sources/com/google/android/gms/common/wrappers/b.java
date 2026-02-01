package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.util.v;

@I0.a
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f29031a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private static Boolean f29032b;

    @I0.a
    public static synchronized boolean a(@N Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f29031a;
            if (context2 != null && (bool = f29032b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f29032b = null;
            if (v.n()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f29032b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f29032b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f29032b = Boolean.FALSE;
                }
            }
            f29031a = applicationContext;
            return f29032b.booleanValue();
        }
    }
}
