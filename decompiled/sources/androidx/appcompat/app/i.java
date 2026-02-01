package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.S;
import androidx.annotation.W;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.appcompat.app.C0584b;
import androidx.appcompat.app.w;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p0;
import androidx.core.os.C0738a;
import androidx.core.os.C0750m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: E, reason: collision with root package name */
    static final boolean f4852E = false;

    /* renamed from: F, reason: collision with root package name */
    static final String f4853F = "AppCompatDelegate";

    /* renamed from: H, reason: collision with root package name */
    public static final int f4855H = -1;

    /* renamed from: I, reason: collision with root package name */
    @Deprecated
    public static final int f4856I = 0;

    /* renamed from: J, reason: collision with root package name */
    @Deprecated
    public static final int f4857J = 0;

    /* renamed from: K, reason: collision with root package name */
    public static final int f4858K = 1;

    /* renamed from: L, reason: collision with root package name */
    public static final int f4859L = 2;

    /* renamed from: M, reason: collision with root package name */
    public static final int f4860M = 3;

    /* renamed from: N, reason: collision with root package name */
    public static final int f4861N = -100;

    /* renamed from: W, reason: collision with root package name */
    public static final int f4870W = 108;

    /* renamed from: X, reason: collision with root package name */
    public static final int f4871X = 109;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f4872Y = 10;

    /* renamed from: G, reason: collision with root package name */
    static w.a f4854G = new w.a(new w.b());

    /* renamed from: O, reason: collision with root package name */
    private static int f4862O = -100;

    /* renamed from: P, reason: collision with root package name */
    private static C0750m f4863P = null;

    /* renamed from: Q, reason: collision with root package name */
    private static C0750m f4864Q = null;

    /* renamed from: R, reason: collision with root package name */
    private static Boolean f4865R = null;

    /* renamed from: S, reason: collision with root package name */
    private static boolean f4866S = false;

    /* renamed from: T, reason: collision with root package name */
    private static final androidx.collection.c<WeakReference<i>> f4867T = new androidx.collection.c<>();

    /* renamed from: U, reason: collision with root package name */
    private static final Object f4868U = new Object();

    /* renamed from: V, reason: collision with root package name */
    private static final Object f4869V = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC0577u
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(33)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC0577u
        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public static C0750m A() {
        return f4863P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public static C0750m B() {
        return f4864Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean G(Context context) {
        if (f4865R == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.a(context).metaData;
                if (bundle != null) {
                    f4865R = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d(f4853F, "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f4865R = Boolean.FALSE;
            }
        }
        return f4865R.booleanValue();
    }

    public static boolean H() {
        return p0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(Context context) {
        w.c(context);
        f4866S = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void T(@N i iVar) {
        synchronized (f4868U) {
            U(iVar);
        }
    }

    private static void U(@N i iVar) {
        synchronized (f4868U) {
            try {
                Iterator<WeakReference<i>> it = f4867T.iterator();
                while (it.hasNext()) {
                    i iVar2 = it.next().get();
                    if (iVar2 == iVar || iVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @i0
    static void W() {
        f4863P = null;
        f4864Q = null;
    }

    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static void X(@N C0750m c0750m) {
        Objects.requireNonNull(c0750m);
        if (C0738a.k()) {
            Object y3 = y();
            if (y3 != null) {
                b.b(y3, a.a(c0750m.m()));
                return;
            }
            return;
        }
        if (!c0750m.equals(f4863P)) {
            synchronized (f4868U) {
                f4863P = c0750m;
                j();
            }
        }
    }

    public static void Y(boolean z3) {
        p0.c(z3);
    }

    public static void c0(int i4) {
        if (i4 != -1 && i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
            Log.d(f4853F, "setDefaultNightMode() called with an unknown mode");
        } else if (f4862O != i4) {
            f4862O = i4;
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(@N i iVar) {
        synchronized (f4868U) {
            U(iVar);
            f4867T.add(new WeakReference<>(iVar));
        }
    }

    @i0
    static void e0(boolean z3) {
        f4865R = Boolean.valueOf(z3);
    }

    private static void i() {
        synchronized (f4868U) {
            try {
                Iterator<WeakReference<i>> it = f4867T.iterator();
                while (it.hasNext()) {
                    i iVar = it.next().get();
                    if (iVar != null) {
                        iVar.h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void j() {
        Iterator<WeakReference<i>> it = f4867T.iterator();
        while (it.hasNext()) {
            i iVar = it.next().get();
            if (iVar != null) {
                iVar.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static void l0(final Context context) {
        if (!G(context)) {
            return;
        }
        if (C0738a.k()) {
            if (!f4866S) {
                f4854G.execute(new Runnable() { // from class: androidx.appcompat.app.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.K(context);
                    }
                });
                return;
            }
            return;
        }
        synchronized (f4869V) {
            try {
                C0750m c0750m = f4863P;
                if (c0750m == null) {
                    if (f4864Q == null) {
                        f4864Q = C0750m.c(w.b(context));
                    }
                    if (f4864Q.j()) {
                    } else {
                        f4863P = f4864Q;
                    }
                } else if (!c0750m.equals(f4864Q)) {
                    C0750m c0750m2 = f4863P;
                    f4864Q = c0750m2;
                    w.a(context, c0750m2.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @N
    public static i n(@N Activity activity, @P f fVar) {
        return new j(activity, fVar);
    }

    @N
    public static i o(@N Dialog dialog, @P f fVar) {
        return new j(dialog, fVar);
    }

    @N
    public static i p(@N Context context, @N Activity activity, @P f fVar) {
        return new j(context, activity, fVar);
    }

    @N
    public static i q(@N Context context, @N Window window, @P f fVar) {
        return new j(context, window, fVar);
    }

    @InterfaceC0561d
    @N
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static C0750m t() {
        if (C0738a.k()) {
            Object y3 = y();
            if (y3 != null) {
                return C0750m.o(b.a(y3));
            }
        } else {
            C0750m c0750m = f4863P;
            if (c0750m != null) {
                return c0750m;
            }
        }
        return C0750m.g();
    }

    public static int v() {
        return f4862O;
    }

    @W(33)
    static Object y() {
        Context u3;
        Iterator<WeakReference<i>> it = f4867T.iterator();
        while (it.hasNext()) {
            i iVar = it.next().get();
            if (iVar != null && (u3 = iVar.u()) != null) {
                return u3.getSystemService("locale");
            }
        }
        return null;
    }

    @P
    public abstract AbstractC0583a C();

    public abstract boolean D(int i4);

    public abstract void E();

    public abstract void F();

    public abstract boolean I();

    public abstract void L(Configuration configuration);

    public abstract void M(Bundle bundle);

    public abstract void N();

    public abstract void O(Bundle bundle);

    public abstract void P();

    public abstract void Q(Bundle bundle);

    public abstract void R();

    public abstract void S();

    public abstract boolean V(int i4);

    public abstract void Z(@I int i4);

    public abstract void a0(View view);

    public abstract void b0(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void d0(boolean z3);

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    @W(17)
    public abstract void f0(int i4);

    boolean g() {
        return false;
    }

    @InterfaceC0566i
    @W(33)
    public void g0(@P OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract boolean h();

    public abstract void h0(@P Toolbar toolbar);

    public void i0(@d0 int i4) {
    }

    public abstract void j0(@P CharSequence charSequence);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(final Context context) {
        f4854G.execute(new Runnable() { // from class: androidx.appcompat.app.h
            @Override // java.lang.Runnable
            public final void run() {
                i.l0(context);
            }
        });
    }

    @P
    public abstract androidx.appcompat.view.b k0(@N b.a aVar);

    @Deprecated
    public void l(Context context) {
    }

    @InterfaceC0566i
    @N
    public Context m(@N Context context) {
        l(context);
        return context;
    }

    public abstract View r(@P View view, String str, @N Context context, @N AttributeSet attributeSet);

    @P
    public abstract <T extends View> T s(@androidx.annotation.D int i4);

    @P
    public Context u() {
        return null;
    }

    @P
    public abstract C0584b.InterfaceC0042b w();

    public int x() {
        return -100;
    }

    public abstract MenuInflater z();
}
