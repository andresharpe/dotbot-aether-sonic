package com.google.android.material.color;

import T0.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.InterfaceC0568k;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.color.m;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f32012a = {a.c.l5};

    /* renamed from: b, reason: collision with root package name */
    private static final c f32013b;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"PrivateApi"})
    private static final c f32014c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, c> f32015d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, c> f32016e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f32017f = 0;

    /* loaded from: classes2.dex */
    class a implements c {
        a() {
        }

        @Override // com.google.android.material.color.l.c
        public boolean a() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private Long f32018a;

        b() {
        }

        @Override // com.google.android.material.color.l.c
        public boolean a() {
            if (this.f32018a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    this.f32018a = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                } catch (Exception unused) {
                    this.f32018a = -1L;
                }
            }
            if (this.f32018a.longValue() < 40100) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface c {
        boolean a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: E, reason: collision with root package name */
        private final m f32019E;

        d(@N m mVar) {
            this.f32019E = mVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@N Activity activity, @P Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@N Activity activity, @P Bundle bundle) {
            l.k(activity, this.f32019E.e(), this.f32019E.d(), this.f32019E.c());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@N Activity activity, @N Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@N Activity activity) {
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(@N Activity activity);
    }

    /* loaded from: classes2.dex */
    public interface f {
        boolean a(@N Activity activity, @d0 int i4);
    }

    static {
        a aVar = new a();
        f32013b = aVar;
        b bVar = new b();
        f32014c = bVar;
        HashMap hashMap = new HashMap();
        hashMap.put("google", aVar);
        hashMap.put("hmd global", aVar);
        hashMap.put("infinix", aVar);
        hashMap.put("infinix mobility limited", aVar);
        hashMap.put("itel", aVar);
        hashMap.put("kyocera", aVar);
        hashMap.put("lenovo", aVar);
        hashMap.put("lge", aVar);
        hashMap.put("motorola", aVar);
        hashMap.put("nothing", aVar);
        hashMap.put("oneplus", aVar);
        hashMap.put("oppo", aVar);
        hashMap.put("realme", aVar);
        hashMap.put("robolectric", aVar);
        hashMap.put("samsung", bVar);
        hashMap.put("sharp", aVar);
        hashMap.put("sony", aVar);
        hashMap.put("tcl", aVar);
        hashMap.put("tecno", aVar);
        hashMap.put("tecno mobile limited", aVar);
        hashMap.put("vivo", aVar);
        hashMap.put("xiaomi", aVar);
        f32015d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", aVar);
        hashMap2.put("jio", aVar);
        f32016e = Collections.unmodifiableMap(hashMap2);
    }

    private l() {
    }

    @Deprecated
    public static void b(@N Activity activity) {
        j(activity);
    }

    @Deprecated
    public static void c(@N Activity activity, @d0 int i4) {
        l(activity, new m.c().g(i4).d());
    }

    @Deprecated
    public static void d(@N Activity activity, @N f fVar) {
        l(activity, new m.c().f(fVar).d());
    }

    public static void e(@N Application application) {
        i(application, new m.c().d());
    }

    @Deprecated
    public static void f(@N Application application, @d0 int i4) {
        i(application, new m.c().g(i4).d());
    }

    @Deprecated
    public static void g(@N Application application, @d0 int i4, @N f fVar) {
        i(application, new m.c().g(i4).f(fVar).d());
    }

    @Deprecated
    public static void h(@N Application application, @N f fVar) {
        i(application, new m.c().f(fVar).d());
    }

    public static void i(@N Application application, @N m mVar) {
        application.registerActivityLifecycleCallbacks(new d(mVar));
    }

    public static void j(@N Activity activity) {
        l(activity, new m.c().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(@N Activity activity, @d0 int i4, @N f fVar, @N e eVar) {
        if (!n()) {
            return;
        }
        if (i4 == 0) {
            i4 = m(activity);
        }
        if (i4 != 0 && fVar.a(activity, i4)) {
            u.a(activity, i4);
            eVar.a(activity);
        }
    }

    public static void l(@N Activity activity, @N m mVar) {
        k(activity, mVar.e(), mVar.d(), mVar.c());
    }

    private static int m(@N Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f32012a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @SuppressLint({"DefaultLocale"})
    @InterfaceC0568k(api = ConstraintLayout.b.a.f9573F)
    public static boolean n() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        c cVar = f32015d.get(Build.MANUFACTURER.toLowerCase());
        if (cVar == null) {
            cVar = f32016e.get(Build.BRAND.toLowerCase());
        }
        if (cVar == null || !cVar.a()) {
            return false;
        }
        return true;
    }

    @N
    public static Context o(@N Context context) {
        return p(context, 0);
    }

    @N
    public static Context p(@N Context context, @d0 int i4) {
        if (!n()) {
            return context;
        }
        if (i4 == 0) {
            i4 = m(context);
        }
        if (i4 != 0) {
            return new ContextThemeWrapper(context, i4);
        }
        return context;
    }
}
