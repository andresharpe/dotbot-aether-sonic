package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.C1290k;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @N
    public static final String f31064a = "GmsCore_OpenSSL";

    /* renamed from: b, reason: collision with root package name */
    private static final C1237i f31065b = C1237i.i();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f31066c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @B("ProviderInstaller.lock")
    private static Method f31067d = null;

    /* renamed from: e, reason: collision with root package name */
    @B("ProviderInstaller.lock")
    private static Method f31068e = null;

    /* renamed from: com.google.android.gms.security.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0273a {
        void a();

        void b(int i4, @P Intent intent);
    }

    public static void a(@N Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        C1285y.m(context, "Context must not be null");
        f31065b.p(context, 11925000);
        synchronized (f31066c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f29072j, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.LoadingException e4) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e4.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context i4 = C1290k.i(context);
                if (i4 != null) {
                    try {
                        if (f31068e == null) {
                            Class cls = Long.TYPE;
                            f31068e = d(i4, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f31068e.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                    } catch (Exception e5) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e5.getMessage())));
                    }
                }
                if (i4 != null) {
                    e(i4, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            }
            e(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    public static void b(@N Context context, @N InterfaceC0273a interfaceC0273a) {
        C1285y.m(context, "Context must not be null");
        C1285y.m(interfaceC0273a, "Listener must not be null");
        C1285y.g("Must be called on the UI thread");
        new b(context, interfaceC0273a).execute(new Void[0]);
    }

    private static Method d(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @B("ProviderInstaller.lock")
    private static void e(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        String message;
        try {
            if (f31067d == null) {
                f31067d = d(context, str, "insertProvider", new Class[]{Context.class});
            }
            f31067d.invoke(null, context);
        } catch (Exception e4) {
            Throwable cause = e4.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    message = e4.getMessage();
                } else {
                    message = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(message)));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
