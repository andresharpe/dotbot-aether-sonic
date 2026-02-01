package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C2197u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class X extends Fragment {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final b f15548F = new b(null);

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private static final String f15549G = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private a f15550E;

    /* loaded from: classes.dex */
    public interface a {
        void b();

        void c();

        void e();
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        @W2.n
        public static /* synthetic */ void c(Activity activity) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @W2.n
        public final void a(@l3.d Activity activity, @l3.d Lifecycle.Event event) {
            kotlin.jvm.internal.F.p(activity, "activity");
            kotlin.jvm.internal.F.p(event, "event");
            if (activity instanceof H) {
                ((H) activity).getLifecycle().l(event);
            } else if (activity instanceof E) {
                Lifecycle lifecycle = ((E) activity).getLifecycle();
                if (lifecycle instanceof G) {
                    ((G) lifecycle).l(event);
                }
            }
        }

        @l3.d
        @W2.i(name = "get")
        public final X b(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag(X.f15549G);
            kotlin.jvm.internal.F.n(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (X) findFragmentByTag;
        }

        @W2.n
        public final void d(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(X.f15549G) == null) {
                fragmentManager.beginTransaction().add(new X(), X.f15549G).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private b() {
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {

        @l3.d
        public static final a Companion = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @W2.n
            public final void a(@l3.d Activity activity) {
                kotlin.jvm.internal.F.p(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            private a() {
            }
        }

        @W2.n
        public static final void registerIn(@l3.d Activity activity) {
            Companion.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@l3.d Activity activity, @l3.e Bundle bundle) {
            kotlin.jvm.internal.F.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@l3.d Activity activity, @l3.e Bundle bundle) {
            kotlin.jvm.internal.F.p(activity, "activity");
            X.f15548F.a(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            X.f15548F.a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            X.f15548F.a(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            X.f15548F.a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            X.f15548F.a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            X.f15548F.a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@l3.d Activity activity, @l3.d Bundle bundle) {
            kotlin.jvm.internal.F.p(activity, "activity");
            kotlin.jvm.internal.F.p(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
        }
    }

    private final void a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f15548F;
            Activity activity = getActivity();
            kotlin.jvm.internal.F.o(activity, "activity");
            bVar.a(activity, event);
        }
    }

    @W2.n
    public static final void b(@l3.d Activity activity, @l3.d Lifecycle.Event event) {
        f15548F.a(activity, event);
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.e();
        }
    }

    private final void e(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    @l3.d
    @W2.i(name = "get")
    public static final X f(@l3.d Activity activity) {
        return f15548F.b(activity);
    }

    @W2.n
    public static final void g(@l3.d Activity activity) {
        f15548F.d(activity);
    }

    public final void h(@l3.e a aVar) {
        this.f15550E = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@l3.e Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f15550E);
        a(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(Lifecycle.Event.ON_DESTROY);
        this.f15550E = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f15550E);
        a(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f15550E);
        a(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(Lifecycle.Event.ON_STOP);
    }
}
