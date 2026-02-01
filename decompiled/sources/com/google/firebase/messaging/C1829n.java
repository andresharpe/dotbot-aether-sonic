package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1762c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@I0.a
/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1829n {

    /* renamed from: c, reason: collision with root package name */
    private static final String f37064c = "rawData";

    /* renamed from: d, reason: collision with root package name */
    private static final String f37065d = "gcm.rawData64";

    /* renamed from: e, reason: collision with root package name */
    private static final Object f37066e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.B("lock")
    private static o0 f37067f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f37068a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f37069b;

    public C1829n(Context context) {
        this.f37068a = context;
        this.f37069b = new androidx.profileinstaller.g();
    }

    private static AbstractC1770k<Integer> d(Context context, Intent intent) {
        if (Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, "Binding to service");
        }
        if (Y.b().e(context)) {
            j0.i(context, e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            e(context, "com.google.firebase.MESSAGING_EVENT").c(intent);
        }
        return C1773n.g(-1);
    }

    private static o0 e(Context context, String str) {
        o0 o0Var;
        synchronized (f37066e) {
            try {
                if (f37067f == null) {
                    f37067f = new o0(context, str);
                }
                o0Var = f37067f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer f(Context context, Intent intent) throws Exception {
        return Integer.valueOf(Y.b().h(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(AbstractC1770k abstractC1770k) throws Exception {
        return Integer.valueOf(v.c.f7438d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC1770k h(Context context, Intent intent, AbstractC1770k abstractC1770k) throws Exception {
        if (com.google.android.gms.common.util.v.n() && ((Integer) abstractC1770k.r()).intValue() == 402) {
            return d(context, intent).n(new androidx.profileinstaller.g(), new InterfaceC1762c() { // from class: com.google.firebase.messaging.k
                @Override // com.google.android.gms.tasks.InterfaceC1762c
                public final Object a(AbstractC1770k abstractC1770k2) {
                    Integer g4;
                    g4 = C1829n.g(abstractC1770k2);
                    return g4;
                }
            });
        }
        return abstractC1770k;
    }

    @com.google.android.gms.common.util.D
    public static void j() {
        synchronized (f37066e) {
            f37067f = null;
        }
    }

    @I0.a
    public AbstractC1770k<Integer> i(Intent intent) {
        String stringExtra = intent.getStringExtra(f37065d);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(f37065d);
        }
        return k(this.f37068a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public AbstractC1770k<Integer> k(final Context context, final Intent intent) {
        boolean z3;
        boolean z4 = false;
        if (com.google.android.gms.common.util.v.n() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z4 = true;
        }
        if (z3 && !z4) {
            return d(context, intent);
        }
        return C1773n.d(this.f37069b, new Callable() { // from class: com.google.firebase.messaging.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f4;
                f4 = C1829n.f(context, intent);
                return f4;
            }
        }).p(this.f37069b, new InterfaceC1762c() { // from class: com.google.firebase.messaging.m
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k) {
                AbstractC1770k h4;
                h4 = C1829n.h(context, intent, abstractC1770k);
                return h4;
            }
        });
    }

    public C1829n(Context context, ExecutorService executorService) {
        this.f37068a = context;
        this.f37069b = executorService;
    }
}
