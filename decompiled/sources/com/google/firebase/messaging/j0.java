package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37053a = "com.google.firebase.iid.WakeLockHolder.wakefulintent";

    /* renamed from: b, reason: collision with root package name */
    static final long f37054b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f37055c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.B("WakeLockHolder.syncObject")
    private static com.google.android.gms.stats.d f37056d;

    j0() {
    }

    @l1.r(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void b(Intent intent, long j4) {
        synchronized (f37055c) {
            try {
                if (f37056d != null) {
                    j(intent, true);
                    f37056d.a(j4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.B("WakeLockHolder.syncObject")
    private static void c(Context context) {
        if (f37056d == null) {
            com.google.android.gms.stats.d dVar = new com.google.android.gms.stats.d(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f37056d = dVar;
            dVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@androidx.annotation.N Intent intent) {
        synchronized (f37055c) {
            try {
                if (f37056d != null && f(intent)) {
                    j(intent, false);
                    f37056d.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @l1.r(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void e(Context context) {
        synchronized (f37055c) {
            c(context);
        }
    }

    @androidx.annotation.i0
    static boolean f(@androidx.annotation.N Intent intent) {
        return intent.getBooleanExtra(f37053a, false);
    }

    @l1.r(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void h() {
        synchronized (f37055c) {
            f37056d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Context context, o0 o0Var, final Intent intent) {
        synchronized (f37055c) {
            try {
                c(context);
                boolean f4 = f(intent);
                j(intent, true);
                if (!f4) {
                    f37056d.a(f37054b);
                }
                o0Var.c(intent).f(new androidx.profileinstaller.g(), new InterfaceC1764e() { // from class: com.google.firebase.messaging.i0
                    @Override // com.google.android.gms.tasks.InterfaceC1764e
                    public final void a(AbstractC1770k abstractC1770k) {
                        j0.d(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void j(@androidx.annotation.N Intent intent, boolean z3) {
        intent.putExtra(f37053a, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName k(@androidx.annotation.N Context context, @androidx.annotation.N Intent intent) {
        synchronized (f37055c) {
            try {
                c(context);
                boolean f4 = f(intent);
                j(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!f4) {
                    f37056d.a(f37054b);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
