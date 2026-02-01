package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.q;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i4 = intent.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.v.f(context);
        q.a d4 = com.google.android.datatransport.runtime.q.a().b(queryParameter).d(C0.a.b(intValue));
        if (queryParameter2 != null) {
            d4.c(Base64.decode(queryParameter2, 0));
        }
        com.google.android.datatransport.runtime.v.c().e().v(d4.a(), i4, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.b();
            }
        });
    }
}
