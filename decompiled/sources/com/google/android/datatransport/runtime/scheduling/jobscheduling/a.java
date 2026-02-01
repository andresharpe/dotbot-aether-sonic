package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.i0;
import androidx.core.app.C0;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import z0.C2447a;

/* loaded from: classes.dex */
public class a implements x {

    /* renamed from: f, reason: collision with root package name */
    private static final String f27517f = "AlarmManagerScheduler";

    /* renamed from: g, reason: collision with root package name */
    static final String f27518g = "attemptNumber";

    /* renamed from: h, reason: collision with root package name */
    static final String f27519h = "backendName";

    /* renamed from: i, reason: collision with root package name */
    static final String f27520i = "priority";

    /* renamed from: j, reason: collision with root package name */
    static final String f27521j = "extras";

    /* renamed from: a, reason: collision with root package name */
    private final Context f27522a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1134d f27523b;

    /* renamed from: c, reason: collision with root package name */
    private AlarmManager f27524c;

    /* renamed from: d, reason: collision with root package name */
    private final SchedulerConfig f27525d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27526e;

    public a(Context context, InterfaceC1134d interfaceC1134d, com.google.android.datatransport.runtime.time.a aVar, SchedulerConfig schedulerConfig) {
        this(context, interfaceC1134d, (AlarmManager) context.getSystemService(C0.f11617w0), aVar, schedulerConfig);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.x
    public void a(com.google.android.datatransport.runtime.q qVar, int i4) {
        b(qVar, i4, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.x
    public void b(com.google.android.datatransport.runtime.q qVar, int i4, boolean z3) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter(f27519h, qVar.b());
        builder.appendQueryParameter(f27520i, String.valueOf(C0.a.a(qVar.d())));
        if (qVar.c() != null) {
            builder.appendQueryParameter(f27521j, Base64.encodeToString(qVar.c(), 0));
        }
        Intent intent = new Intent(this.f27522a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra(f27518g, i4);
        if (!z3 && c(intent)) {
            C2447a.c(f27517f, "Upload for context %s is already scheduled. Returning...", qVar);
            return;
        }
        long O02 = this.f27523b.O0(qVar);
        long h4 = this.f27525d.h(qVar.d(), O02, i4);
        C2447a.e(f27517f, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", qVar, Long.valueOf(h4), Long.valueOf(O02), Integer.valueOf(i4));
        this.f27524c.set(3, this.f27526e.a() + h4, PendingIntent.getBroadcast(this.f27522a, 0, intent, 67108864));
    }

    @i0
    boolean c(Intent intent) {
        if (PendingIntent.getBroadcast(this.f27522a, 0, intent, 603979776) == null) {
            return false;
        }
        return true;
    }

    @i0
    a(Context context, InterfaceC1134d interfaceC1134d, AlarmManager alarmManager, com.google.android.datatransport.runtime.time.a aVar, SchedulerConfig schedulerConfig) {
        this.f27522a = context;
        this.f27523b = interfaceC1134d;
        this.f27524c = alarmManager;
        this.f27526e = aVar;
        this.f27525d = schedulerConfig;
    }
}
