package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.W;
import com.google.android.datatransport.runtime.q;

@W(api = 21)
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i4 = jobParameters.getExtras().getInt("priority");
        int i5 = jobParameters.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.v.f(getApplicationContext());
        q.a d4 = com.google.android.datatransport.runtime.q.a().b(string).d(C0.a.b(i4));
        if (string2 != null) {
            d4.c(Base64.decode(string2, 0));
        }
        com.google.android.datatransport.runtime.v.c().e().v(d4.a(), i5, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
