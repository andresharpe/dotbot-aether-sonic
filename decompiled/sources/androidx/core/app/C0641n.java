package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0641n {

    /* renamed from: b, reason: collision with root package name */
    public static final int f11964b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11965c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11966d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11967e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11968f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11969g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11970h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11971i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11972j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f11973k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11974l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f11975m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f11976n = 4;

    /* renamed from: o, reason: collision with root package name */
    public static final int f11977o = 8;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11978p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f11979q = 32;

    /* renamed from: r, reason: collision with root package name */
    public static final int f11980r = 64;

    /* renamed from: s, reason: collision with root package name */
    public static final int f11981s = 128;

    /* renamed from: t, reason: collision with root package name */
    public static final int f11982t = 256;

    /* renamed from: u, reason: collision with root package name */
    public static final int f11983u = 511;

    /* renamed from: a, reason: collision with root package name */
    private final b f11984a;

    @androidx.annotation.W(24)
    /* renamed from: androidx.core.app.n$a */
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f11985e = 1000000;

        /* renamed from: f, reason: collision with root package name */
        private static final int f11986f = 500000;

        /* renamed from: g, reason: collision with root package name */
        private static HandlerThread f11987g;

        /* renamed from: h, reason: collision with root package name */
        private static Handler f11988h;

        /* renamed from: a, reason: collision with root package name */
        int f11989a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f11990b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f11991c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f11992d = new WindowOnFrameMetricsAvailableListenerC0077a();

        /* renamed from: androidx.core.app.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class WindowOnFrameMetricsAvailableListenerC0077a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0077a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i4) {
                a aVar = a.this;
                if ((aVar.f11989a & 1) != 0) {
                    aVar.f(aVar.f11990b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f11989a & 2) != 0) {
                    aVar2.f(aVar2.f11990b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f11989a & 4) != 0) {
                    aVar3.f(aVar3.f11990b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f11989a & 8) != 0) {
                    aVar4.f(aVar4.f11990b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f11989a & 16) != 0) {
                    aVar5.f(aVar5.f11990b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f11989a & 64) != 0) {
                    aVar6.f(aVar6.f11990b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f11989a & 32) != 0) {
                    aVar7.f(aVar7.f11990b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f11989a & 128) != 0) {
                    aVar8.f(aVar8.f11990b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f11989a & 256) != 0) {
                    aVar9.f(aVar9.f11990b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i4) {
            this.f11989a = i4;
        }

        @Override // androidx.core.app.C0641n.b
        public void a(Activity activity) {
            if (f11987g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f11987g = handlerThread;
                handlerThread.start();
                f11988h = new Handler(f11987g.getLooper());
            }
            for (int i4 = 0; i4 <= 8; i4++) {
                SparseIntArray[] sparseIntArrayArr = this.f11990b;
                if (sparseIntArrayArr[i4] == null && (this.f11989a & (1 << i4)) != 0) {
                    sparseIntArrayArr[i4] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f11992d, f11988h);
            this.f11991c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.C0641n.b
        public SparseIntArray[] b() {
            return this.f11990b;
        }

        @Override // androidx.core.app.C0641n.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f11991c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f11991c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f11992d);
            return this.f11990b;
        }

        @Override // androidx.core.app.C0641n.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f11990b;
            this.f11990b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.C0641n.b
        public SparseIntArray[] e() {
            for (int size = this.f11991c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f11991c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f11992d);
                    this.f11991c.remove(size);
                }
            }
            return this.f11990b;
        }

        void f(SparseIntArray sparseIntArray, long j4) {
            if (sparseIntArray != null) {
                int i4 = (int) ((500000 + j4) / 1000000);
                if (j4 >= 0) {
                    sparseIntArray.put(i4, sparseIntArray.get(i4) + 1);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.n$b */
    /* loaded from: classes.dex */
    private static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.app.n$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    public C0641n() {
        this(1);
    }

    public void a(@androidx.annotation.N Activity activity) {
        this.f11984a.a(activity);
    }

    @androidx.annotation.P
    public SparseIntArray[] b() {
        return this.f11984a.b();
    }

    @androidx.annotation.P
    public SparseIntArray[] c(@androidx.annotation.N Activity activity) {
        return this.f11984a.c(activity);
    }

    @androidx.annotation.P
    public SparseIntArray[] d() {
        return this.f11984a.d();
    }

    @androidx.annotation.P
    public SparseIntArray[] e() {
        return this.f11984a.e();
    }

    public C0641n(int i4) {
        this.f11984a = new a(i4);
    }
}
