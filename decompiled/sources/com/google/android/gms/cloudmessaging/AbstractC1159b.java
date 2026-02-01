package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.j0;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.messaging.C1821f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.cloudmessaging.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1159b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f27896a;

    /* renamed from: com.google.android.gms.cloudmessaging.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @N
        public static final String f27897a = "com.google.firebase.messaging.NOTIFICATION_OPEN";

        /* renamed from: b, reason: collision with root package name */
        @N
        public static final String f27898b = "com.google.firebase.messaging.NOTIFICATION_DISMISS";

        private a() {
        }
    }

    /* renamed from: com.google.android.gms.cloudmessaging.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0262b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public static final String f27899a = "pending_intent";

        /* renamed from: b, reason: collision with root package name */
        @N
        public static final String f27900b = "wrapped_intent";

        private C0262b() {
        }
    }

    public AbstractC1159b() {
        com.google.android.gms.internal.cloudmessaging.e.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f27896a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @j0
    private final int e(@N Context context, @N Intent intent) {
        AbstractC1770k<Void> c4;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra(C1821f.d.f36975h);
        if (TextUtils.isEmpty(stringExtra)) {
            c4 = C1773n.g(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(C1821f.d.f36975h, stringExtra);
            c4 = x.b(context).c(2, bundle);
        }
        int b4 = b(context, new C1158a(intent));
        try {
            C1773n.b(c4, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            String valueOf = String.valueOf(e4);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return b4;
    }

    @j0
    private final int f(@N Context context, @N Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(C0262b.f27899a);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(C0262b.f27899a);
        } else {
            extras = new Bundle();
        }
        if (a.f27898b.equals(intent.getAction())) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @N
    protected Executor a() {
        return this.f27896a;
    }

    @j0
    protected abstract int b(@N Context context, @N C1158a c1158a);

    @j0
    protected void c(@N Context context, @N Bundle bundle) {
    }

    public final /* synthetic */ void d(@N Intent intent, @N Context context, boolean z3, @N BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int e4;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(C0262b.f27900b);
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                e4 = f(context, intent2);
            } else {
                e4 = e(context, intent);
            }
            if (z3) {
                pendingResult.setResultCode(e4);
            }
            pendingResult.finish();
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@N final Context context, @N final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a().execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.k
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1159b.this.d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
