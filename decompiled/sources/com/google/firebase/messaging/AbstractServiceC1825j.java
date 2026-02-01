package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.InterfaceC0566i;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.google.firebase.messaging.l0;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC1825j extends Service {

    /* renamed from: J, reason: collision with root package name */
    private static final String f37046J = "EnhancedIntentService";

    /* renamed from: F, reason: collision with root package name */
    private Binder f37048F;

    /* renamed from: H, reason: collision with root package name */
    private int f37050H;

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.i0
    final ExecutorService f37047E = C1830o.e();

    /* renamed from: G, reason: collision with root package name */
    private final Object f37049G = new Object();

    /* renamed from: I, reason: collision with root package name */
    private int f37051I = 0;

    /* renamed from: com.google.firebase.messaging.j$a */
    /* loaded from: classes2.dex */
    class a implements l0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.l0.a
        @I0.a
        public AbstractC1770k<Void> a(Intent intent) {
            return AbstractServiceC1825j.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            j0.d(intent);
        }
        synchronized (this.f37049G) {
            try {
                int i4 = this.f37051I - 1;
                this.f37051I = i4;
                if (i4 == 0) {
                    k(this.f37050H);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, AbstractC1770k abstractC1770k) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, C1771l c1771l) {
        try {
            f(intent);
        } finally {
            c1771l.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.K
    public AbstractC1770k<Void> j(final Intent intent) {
        if (g(intent)) {
            return C1773n.g(null);
        }
        final C1771l c1771l = new C1771l();
        this.f37047E.execute(new Runnable() { // from class: com.google.firebase.messaging.i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC1825j.this.i(intent, c1771l);
            }
        });
        return c1771l.a();
    }

    protected Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i4) {
        return stopSelfResult(i4);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(f37046J, 3)) {
                Log.d(f37046J, "Service received bind request");
            }
            if (this.f37048F == null) {
                this.f37048F = new l0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37048F;
    }

    @Override // android.app.Service
    @InterfaceC0566i
    public void onDestroy() {
        this.f37047E.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i4, int i5) {
        synchronized (this.f37049G) {
            this.f37050H = i5;
            this.f37051I++;
        }
        Intent e4 = e(intent);
        if (e4 == null) {
            d(intent);
            return 2;
        }
        AbstractC1770k<Void> j4 = j(e4);
        if (j4.u()) {
            d(intent);
            return 2;
        }
        j4.f(new androidx.profileinstaller.g(), new InterfaceC1764e() { // from class: com.google.firebase.messaging.h
            @Override // com.google.android.gms.tasks.InterfaceC1764e
            public final void a(AbstractC1770k abstractC1770k) {
                AbstractServiceC1825j.this.h(intent, abstractC1770k);
            }
        });
        return 3;
    }
}
