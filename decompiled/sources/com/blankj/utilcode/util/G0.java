package com.blankj.utilcode.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import com.blankj.utilcode.util.E0;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class G0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: K, reason: collision with root package name */
    static final G0 f24754K = new G0();

    /* renamed from: L, reason: collision with root package name */
    private static final Activity f24755L = new Activity();

    /* renamed from: E, reason: collision with root package name */
    private final LinkedList<Activity> f24756E = new LinkedList<>();

    /* renamed from: F, reason: collision with root package name */
    private final List<E0.d> f24757F = new CopyOnWriteArrayList();

    /* renamed from: G, reason: collision with root package name */
    private final Map<Activity, List<E0.a>> f24758G = new ConcurrentHashMap();

    /* renamed from: H, reason: collision with root package name */
    private int f24759H = 0;

    /* renamed from: I, reason: collision with root package name */
    private int f24760I = 0;

    /* renamed from: J, reason: collision with root package name */
    private boolean f24761J = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Activity f24762E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ E0.a f24763F;

        a(Activity activity, E0.a aVar) {
            this.f24762E = activity;
            this.f24763F = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            G0.this.f(this.f24762E, this.f24763F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Activity f24765E;

        b(Activity activity) {
            this.f24765E = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            G0.this.f24758G.remove(this.f24765E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Activity f24767E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ E0.a f24768F;

        c(Activity activity, E0.a aVar) {
            this.f24767E = activity;
            this.f24768F = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            G0.this.x(this.f24767E, this.f24768F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Activity f24770E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Object f24771F;

        d(Activity activity, Object obj) {
            this.f24770E = activity;
            this.f24771F = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Window window = this.f24770E.getWindow();
                if (window != null) {
                    window.setSoftInputMode(((Integer) this.f24771F).intValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    G0() {
    }

    private void A(Activity activity) {
        if (this.f24756E.contains(activity)) {
            if (!this.f24756E.getFirst().equals(activity)) {
                this.f24756E.remove(activity);
                this.f24756E.addFirst(activity);
                return;
            }
            return;
        }
        this.f24756E.addFirst(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Activity activity, E0.a aVar) {
        List<E0.a> list = this.f24758G.get(activity);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.f24758G.put(activity, list);
        } else if (list.contains(aVar)) {
            return;
        }
        list.add(aVar);
    }

    private void h(Activity activity, Lifecycle.Event event) {
        i(activity, event, this.f24758G.get(activity));
        i(activity, event, this.f24758G.get(f24755L));
    }

    private void i(Activity activity, Lifecycle.Event event, List<E0.a> list) {
        if (list == null) {
            return;
        }
        for (E0.a aVar : list) {
            aVar.g(activity, event);
            if (event.equals(Lifecycle.Event.ON_CREATE)) {
                aVar.a(activity);
            } else if (event.equals(Lifecycle.Event.ON_START)) {
                aVar.e(activity);
            } else if (event.equals(Lifecycle.Event.ON_RESUME)) {
                aVar.d(activity);
            } else if (event.equals(Lifecycle.Event.ON_PAUSE)) {
                aVar.c(activity);
            } else if (event.equals(Lifecycle.Event.ON_STOP)) {
                aVar.f(activity);
            } else if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                aVar.b(activity);
            }
        }
        if (event.equals(Lifecycle.Event.ON_DESTROY)) {
            this.f24758G.remove(activity);
        }
    }

    private List<Activity> j() {
        Object l4;
        LinkedList linkedList = new LinkedList();
        Activity activity = null;
        try {
            l4 = l();
        } catch (Exception e4) {
            Log.e("UtilsActivityLifecycle", "getActivitiesByReflect: " + e4.getMessage());
        }
        if (l4 == null) {
            return linkedList;
        }
        Field declaredField = l4.getClass().getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(l4);
        if (!(obj instanceof Map)) {
            return linkedList;
        }
        for (Object obj2 : ((Map) obj).values()) {
            Class<?> cls = obj2.getClass();
            Field declaredField2 = cls.getDeclaredField("activity");
            declaredField2.setAccessible(true);
            Activity activity2 = (Activity) declaredField2.get(obj2);
            if (activity == null) {
                Field declaredField3 = cls.getDeclaredField("paused");
                declaredField3.setAccessible(true);
                if (!declaredField3.getBoolean(obj2)) {
                    activity = activity2;
                } else {
                    linkedList.addFirst(activity2);
                }
            } else {
                linkedList.addFirst(activity2);
            }
        }
        if (activity != null) {
            linkedList.addFirst(activity);
        }
        return linkedList;
    }

    private Object l() {
        Object m4 = m();
        if (m4 != null) {
            return m4;
        }
        return n();
    }

    private Object m() {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e4) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e4.getMessage());
            return null;
        }
    }

    private Object n() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e4) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e4.getMessage());
            return null;
        }
    }

    private void s(Activity activity, boolean z3) {
        if (this.f24757F.isEmpty()) {
            return;
        }
        for (E0.d dVar : this.f24757F) {
            if (z3) {
                dVar.a(activity);
            } else {
                dVar.b(activity);
            }
        }
    }

    private void t(Activity activity, boolean z3) {
        try {
            if (z3) {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
            } else {
                Object tag = activity.getWindow().getDecorView().getTag(-123);
                if (!(tag instanceof Integer)) {
                } else {
                    H0.W0(new d(activity, tag), 100L);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Activity activity, E0.a aVar) {
        List<E0.a> list = this.f24758G.get(activity);
        if (list != null && !list.isEmpty()) {
            list.remove(aVar);
        }
    }

    private static void z() {
        boolean areAnimatorsEnabled;
        if (Build.VERSION.SDK_INT >= 26) {
            areAnimatorsEnabled = ValueAnimator.areAnimatorsEnabled();
            if (areAnimatorsEnabled) {
                return;
            }
        }
        try {
            Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
            declaredField.setAccessible(true);
            if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                declaredField.set(null, Float.valueOf(1.0f));
                Log.i("UtilsActivityLifecycle", "setAnimatorsEnabled: Animators are enabled now!");
            }
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(Application application) {
        this.f24756E.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Activity activity, E0.a aVar) {
        if (activity != null && aVar != null) {
            H0.V0(new a(activity, aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(E0.a aVar) {
        d(f24755L, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(E0.d dVar) {
        this.f24757F.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Activity> k() {
        if (!this.f24756E.isEmpty()) {
            return new LinkedList(this.f24756E);
        }
        this.f24756E.addAll(j());
        return new LinkedList(this.f24756E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Application o() {
        Object invoke;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object l4 = l();
            if (l4 == null || (invoke = cls.getMethod("getApplication", new Class[0]).invoke(l4, new Object[0])) == null) {
                return null;
            }
            return (Application) invoke;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@androidx.annotation.N Activity activity, Bundle bundle) {
        if (this.f24756E.size() == 0) {
            s(activity, true);
        }
        N.b(activity);
        z();
        A(activity);
        h(activity, Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@androidx.annotation.N Activity activity) {
        this.f24756E.remove(activity);
        H0.E(activity);
        h(activity, Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@androidx.annotation.N Activity activity) {
        h(activity, Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@androidx.annotation.N Activity activity, @androidx.annotation.P Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(@androidx.annotation.N Activity activity, @androidx.annotation.N Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@androidx.annotation.N Activity activity, @androidx.annotation.P Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(@androidx.annotation.N Activity activity, @androidx.annotation.N Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@androidx.annotation.N Activity activity) {
        A(activity);
        if (this.f24761J) {
            this.f24761J = false;
            s(activity, true);
        }
        t(activity, false);
        h(activity, Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@androidx.annotation.N Activity activity, @androidx.annotation.N Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@androidx.annotation.N Activity activity) {
        if (!this.f24761J) {
            A(activity);
        }
        int i4 = this.f24760I;
        if (i4 < 0) {
            this.f24760I = i4 + 1;
        } else {
            this.f24759H++;
        }
        h(activity, Lifecycle.Event.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f24760I--;
        } else {
            int i4 = this.f24759H - 1;
            this.f24759H = i4;
            if (i4 <= 0) {
                this.f24761J = true;
                s(activity, false);
            }
        }
        t(activity, true);
        h(activity, Lifecycle.Event.ON_STOP);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity p() {
        for (Activity activity : k()) {
            if (H0.p0(activity)) {
                return activity;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        return !this.f24761J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Activity activity) {
        if (activity == null) {
            return;
        }
        H0.V0(new b(activity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(Activity activity, E0.a aVar) {
        if (activity != null && aVar != null) {
            H0.V0(new c(activity, aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(E0.a aVar) {
        v(f24755L, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(E0.d dVar) {
        this.f24757F.remove(dVar);
    }
}
