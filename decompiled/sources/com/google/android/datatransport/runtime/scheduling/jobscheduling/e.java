package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.W;
import androidx.annotation.i0;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import z0.C2447a;

@W(api = 21)
/* loaded from: classes.dex */
public class e implements x {

    /* renamed from: d, reason: collision with root package name */
    private static final String f27535d = "JobInfoScheduler";

    /* renamed from: e, reason: collision with root package name */
    static final String f27536e = "attemptNumber";

    /* renamed from: f, reason: collision with root package name */
    static final String f27537f = "backendName";

    /* renamed from: g, reason: collision with root package name */
    static final String f27538g = "priority";

    /* renamed from: h, reason: collision with root package name */
    static final String f27539h = "extras";

    /* renamed from: a, reason: collision with root package name */
    private final Context f27540a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1134d f27541b;

    /* renamed from: c, reason: collision with root package name */
    private final SchedulerConfig f27542c;

    public e(Context context, InterfaceC1134d interfaceC1134d, SchedulerConfig schedulerConfig) {
        this.f27540a = context;
        this.f27541b = interfaceC1134d;
        this.f27542c = schedulerConfig;
    }

    private boolean d(JobScheduler jobScheduler, int i4, int i5) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i6 = jobInfo.getExtras().getInt(f27536e);
            if (jobInfo.getId() == i4) {
                if (i6 < i5) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.x
    public void a(com.google.android.datatransport.runtime.q qVar, int i4) {
        b(qVar, i4, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.x
    public void b(com.google.android.datatransport.runtime.q qVar, int i4, boolean z3) {
        ComponentName componentName = new ComponentName(this.f27540a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f27540a.getSystemService("jobscheduler");
        int c4 = c(qVar);
        if (!z3 && d(jobScheduler, c4, i4)) {
            C2447a.c(f27535d, "Upload for context %s is already scheduled. Returning...", qVar);
            return;
        }
        long O02 = this.f27541b.O0(qVar);
        JobInfo.Builder c5 = this.f27542c.c(new JobInfo.Builder(c4, componentName), qVar.d(), O02, i4);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt(f27536e, i4);
        persistableBundle.putString(f27537f, qVar.b());
        persistableBundle.putInt(f27538g, C0.a.a(qVar.d()));
        if (qVar.c() != null) {
            persistableBundle.putString(f27539h, Base64.encodeToString(qVar.c(), 0));
        }
        c5.setExtras(persistableBundle);
        C2447a.e(f27535d, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", qVar, Integer.valueOf(c4), Long.valueOf(this.f27542c.h(qVar.d(), O02, i4)), Long.valueOf(O02), Integer.valueOf(i4));
        jobScheduler.schedule(c5.build());
    }

    @i0
    int c(com.google.android.datatransport.runtime.q qVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f27540a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(qVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C0.a.a(qVar.d())).array());
        if (qVar.c() != null) {
            adler32.update(qVar.c());
        }
        return (int) adler32.getValue();
    }
}
