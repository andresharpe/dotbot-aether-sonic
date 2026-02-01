package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: androidx.core.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0643o extends Service {

    /* renamed from: L, reason: collision with root package name */
    static final String f12000L = "JobIntentService";

    /* renamed from: M, reason: collision with root package name */
    static final boolean f12001M = false;

    /* renamed from: N, reason: collision with root package name */
    static final Object f12002N = new Object();

    /* renamed from: O, reason: collision with root package name */
    static final HashMap<ComponentName, h> f12003O = new HashMap<>();

    /* renamed from: E, reason: collision with root package name */
    b f12004E;

    /* renamed from: F, reason: collision with root package name */
    h f12005F;

    /* renamed from: G, reason: collision with root package name */
    a f12006G;

    /* renamed from: H, reason: collision with root package name */
    boolean f12007H = false;

    /* renamed from: I, reason: collision with root package name */
    boolean f12008I = false;

    /* renamed from: J, reason: collision with root package name */
    boolean f12009J = false;

    /* renamed from: K, reason: collision with root package name */
    final ArrayList<d> f12010K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.o$a */
    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a4 = AbstractServiceC0643o.this.a();
                if (a4 != null) {
                    AbstractServiceC0643o.this.h(a4.getIntent());
                    a4.j();
                } else {
                    return null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            AbstractServiceC0643o.this.j();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            AbstractServiceC0643o.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.o$b */
    /* loaded from: classes.dex */
    public interface b {
        IBinder a();

        e b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.o$c */
    /* loaded from: classes.dex */
    public static final class c extends h {

        /* renamed from: d, reason: collision with root package name */
        private final Context f12012d;

        /* renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f12013e;

        /* renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f12014f;

        /* renamed from: g, reason: collision with root package name */
        boolean f12015g;

        /* renamed from: h, reason: collision with root package name */
        boolean f12016h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f12012d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService(L1.a.f1635p3);
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f12013e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f12014f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.AbstractServiceC0643o.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f12029a);
            if (this.f12012d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f12015g) {
                            this.f12015g = true;
                            if (!this.f12016h) {
                                this.f12013e.acquire(com.harman.jbl.partybox.ui.party.b.f44883c);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC0643o.h
        public void c() {
            synchronized (this) {
                try {
                    if (this.f12016h) {
                        if (this.f12015g) {
                            this.f12013e.acquire(com.harman.jbl.partybox.ui.party.b.f44883c);
                        }
                        this.f12016h = false;
                        this.f12014f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC0643o.h
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f12016h) {
                        this.f12016h = true;
                        this.f12014f.acquire(600000L);
                        this.f12013e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC0643o.h
        public void e() {
            synchronized (this) {
                this.f12015g = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.o$d */
    /* loaded from: classes.dex */
    public final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        final Intent f12017a;

        /* renamed from: b, reason: collision with root package name */
        final int f12018b;

        d(Intent intent, int i4) {
            this.f12017a = intent;
            this.f12018b = i4;
        }

        @Override // androidx.core.app.AbstractServiceC0643o.e
        public Intent getIntent() {
            return this.f12017a;
        }

        @Override // androidx.core.app.AbstractServiceC0643o.e
        public void j() {
            AbstractServiceC0643o.this.stopSelf(this.f12018b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.o$e */
    /* loaded from: classes.dex */
    public interface e {
        Intent getIntent();

        void j();
    }

    @androidx.annotation.W(26)
    /* renamed from: androidx.core.app.o$f */
    /* loaded from: classes.dex */
    static final class f extends JobServiceEngine implements b {

        /* renamed from: d, reason: collision with root package name */
        static final String f12020d = "JobServiceEngineImpl";

        /* renamed from: e, reason: collision with root package name */
        static final boolean f12021e = false;

        /* renamed from: a, reason: collision with root package name */
        final AbstractServiceC0643o f12022a;

        /* renamed from: b, reason: collision with root package name */
        final Object f12023b;

        /* renamed from: c, reason: collision with root package name */
        JobParameters f12024c;

        /* renamed from: androidx.core.app.o$f$a */
        /* loaded from: classes.dex */
        final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            final JobWorkItem f12025a;

            a(JobWorkItem jobWorkItem) {
                this.f12025a = jobWorkItem;
            }

            @Override // androidx.core.app.AbstractServiceC0643o.e
            public Intent getIntent() {
                Intent intent;
                intent = this.f12025a.getIntent();
                return intent;
            }

            @Override // androidx.core.app.AbstractServiceC0643o.e
            public void j() {
                synchronized (f.this.f12023b) {
                    try {
                        JobParameters jobParameters = f.this.f12024c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f12025a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        f(AbstractServiceC0643o abstractServiceC0643o) {
            super(abstractServiceC0643o);
            this.f12023b = new Object();
            this.f12022a = abstractServiceC0643o;
        }

        @Override // androidx.core.app.AbstractServiceC0643o.b
        public IBinder a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // androidx.core.app.AbstractServiceC0643o.b
        public e b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f12023b) {
                try {
                    JobParameters jobParameters = this.f12024c;
                    if (jobParameters != null) {
                        dequeueWork = jobParameters.dequeueWork();
                        if (dequeueWork != null) {
                            intent = dequeueWork.getIntent();
                            intent.setExtrasClassLoader(this.f12022a.getClassLoader());
                            return new a(dequeueWork);
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f12024c = jobParameters;
            this.f12022a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b4 = this.f12022a.b();
            synchronized (this.f12023b) {
                this.f12024c = null;
            }
            return b4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(26)
    /* renamed from: androidx.core.app.o$g */
    /* loaded from: classes.dex */
    public static final class g extends h {

        /* renamed from: d, reason: collision with root package name */
        private final JobInfo f12027d;

        /* renamed from: e, reason: collision with root package name */
        private final JobScheduler f12028e;

        g(Context context, ComponentName componentName, int i4) {
            super(componentName);
            b(i4);
            this.f12027d = new JobInfo.Builder(i4, this.f12029a).setOverrideDeadline(0L).build();
            this.f12028e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.AbstractServiceC0643o.h
        void a(Intent intent) {
            this.f12028e.enqueue(this.f12027d, C0654u.a(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.o$h */
    /* loaded from: classes.dex */
    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f12029a;

        /* renamed from: b, reason: collision with root package name */
        boolean f12030b;

        /* renamed from: c, reason: collision with root package name */
        int f12031c;

        h(ComponentName componentName) {
            this.f12029a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i4) {
            if (!this.f12030b) {
                this.f12030b = true;
                this.f12031c = i4;
            } else {
                if (this.f12031c == i4) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i4 + " is different than previous " + this.f12031c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public AbstractServiceC0643o() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12010K = null;
        } else {
            this.f12010K = new ArrayList<>();
        }
    }

    public static void c(@androidx.annotation.N Context context, @androidx.annotation.N ComponentName componentName, int i4, @androidx.annotation.N Intent intent) {
        if (intent != null) {
            synchronized (f12002N) {
                h f4 = f(context, componentName, true, i4);
                f4.b(i4);
                f4.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(@androidx.annotation.N Context context, @androidx.annotation.N Class<?> cls, int i4, @androidx.annotation.N Intent intent) {
        c(context, new ComponentName(context, cls), i4, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z3, int i4) {
        h cVar;
        HashMap<ComponentName, h> hashMap = f12003O;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z3) {
                    cVar = new g(context, componentName, i4);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                cVar = new c(context, componentName);
            }
            hVar = cVar;
            hashMap.put(componentName, hVar);
        }
        return hVar;
    }

    e a() {
        b bVar = this.f12004E;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f12010K) {
            try {
                if (this.f12010K.size() > 0) {
                    return this.f12010K.remove(0);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean b() {
        a aVar = this.f12006G;
        if (aVar != null) {
            aVar.cancel(this.f12007H);
        }
        this.f12008I = true;
        return i();
    }

    void e(boolean z3) {
        if (this.f12006G == null) {
            this.f12006G = new a();
            h hVar = this.f12005F;
            if (hVar != null && z3) {
                hVar.d();
            }
            this.f12006G.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f12008I;
    }

    protected abstract void h(@androidx.annotation.N Intent intent);

    public boolean i() {
        return true;
    }

    void j() {
        ArrayList<d> arrayList = this.f12010K;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f12006G = null;
                    ArrayList<d> arrayList2 = this.f12010K;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f12009J) {
                        this.f12005F.c();
                    }
                } finally {
                }
            }
        }
    }

    public void k(boolean z3) {
        this.f12007H = z3;
    }

    @Override // android.app.Service
    public IBinder onBind(@androidx.annotation.N Intent intent) {
        b bVar = this.f12004E;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12004E = new f(this);
            this.f12005F = null;
        } else {
            this.f12004E = null;
            this.f12005F = f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f12010K;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f12009J = true;
                this.f12005F.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@androidx.annotation.P Intent intent, int i4, int i5) {
        if (this.f12010K != null) {
            this.f12005F.e();
            synchronized (this.f12010K) {
                ArrayList<d> arrayList = this.f12010K;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new d(intent, i5));
                e(true);
            }
            return 3;
        }
        return 2;
    }
}
