package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC1278u0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.InterfaceC1280v0;
import com.google.android.gms.common.util.C1300a;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
@l1.b
/* loaded from: classes.dex */
public final class O {

    /* renamed from: e, reason: collision with root package name */
    private static volatile InterfaceC1280v0 f27970e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f27972g;

    /* renamed from: a, reason: collision with root package name */
    static final M f27966a = new G(K.G("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final M f27967b = new H(K.G("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final M f27968c = new I(K.G("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final M f27969d = new J(K.G("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f27971f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z a(String str, K k4, boolean z3, boolean z4) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return h(str, k4, z3, z4);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z b(String str, boolean z3, boolean z4, boolean z5) {
        return i(str, z3, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z c(String str, boolean z3, boolean z4, boolean z5) {
        return i(str, z3, false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String d(boolean z3, String str, K k4) throws Exception {
        String str2;
        if (!z3 && h(str, k4, true, false).f27992a) {
            str2 = "debug cert rejected";
        } else {
            str2 = "not allowed";
        }
        MessageDigest b4 = C1300a.b("SHA-256");
        C1285y.l(b4);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.n.a(b4.digest(k4.O0())), Boolean.valueOf(z3), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e(Context context) {
        synchronized (O.class) {
            if (f27972g == null) {
                if (context != null) {
                    f27972g = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                return f27970e.zzg();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e4) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                return f27970e.zzi();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e4) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    private static Z h(final String str, final K k4, final boolean z3, boolean z4) {
        try {
            j();
            C1285y.l(f27972g);
            try {
                if (f27970e.c0(new U(str, k4, z3, z4), com.google.android.gms.dynamic.f.O0(f27972g.getPackageManager()))) {
                    return Z.b();
                }
                return new X(new Callable() { // from class: com.google.android.gms.common.F
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return O.d(z3, str, k4);
                    }
                }, null);
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return Z.d("module call", e4);
            }
        } catch (DynamiteModule.LoadingException e5) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            return Z.d("module init: ".concat(String.valueOf(e5.getMessage())), e5);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.d, android.os.IBinder] */
    private static Z i(String str, boolean z3, boolean z4, boolean z5, boolean z6) {
        Z d4;
        S X02;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C1285y.l(f27972g);
            try {
                j();
                P p4 = new P(str, z3, false, com.google.android.gms.dynamic.f.O0(f27972g), false);
                try {
                    if (z6) {
                        X02 = f27970e.K0(p4);
                    } else {
                        X02 = f27970e.X0(p4);
                    }
                    if (X02.e0()) {
                        d4 = Z.f(X02.i0());
                    } else {
                        String c02 = X02.c0();
                        if (X02.u0() == 4) {
                            nameNotFoundException = new PackageManager.NameNotFoundException();
                        } else {
                            nameNotFoundException = null;
                        }
                        if (c02 == null) {
                            c02 = "error checking package certificate";
                        }
                        d4 = Z.g(X02.i0(), X02.u0(), c02, nameNotFoundException);
                    }
                } catch (RemoteException e4) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                    d4 = Z.d("module call", e4);
                }
            } catch (DynamiteModule.LoadingException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                d4 = Z.d("module init: ".concat(String.valueOf(e5.getMessage())), e5);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d4;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static void j() throws DynamiteModule.LoadingException {
        if (f27970e != null) {
            return;
        }
        C1285y.l(f27972g);
        synchronized (f27971f) {
            try {
                if (f27970e == null) {
                    f27970e = AbstractBinderC1278u0.A(DynamiteModule.e(f27972g, DynamiteModule.f29072j, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
