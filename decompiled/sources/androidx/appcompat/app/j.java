package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.appcompat.app.C0584b;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0599l;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.q0;
import androidx.core.app.C0660x;
import androidx.core.content.C0669d;
import androidx.core.content.res.i;
import androidx.core.os.C0750m;
import androidx.core.view.C0823k0;
import androidx.core.view.C0850t0;
import androidx.core.view.C0854v0;
import androidx.core.view.E;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;
import androidx.lifecycle.Lifecycle;
import d.C2042a;
import e.C2046a;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class j extends androidx.appcompat.app.i implements g.a, LayoutInflater.Factory2 {

    /* renamed from: Z0, reason: collision with root package name */
    private static final androidx.collection.l<String, Integer> f4873Z0 = new androidx.collection.l<>();

    /* renamed from: a1, reason: collision with root package name */
    private static final boolean f4874a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    private static final int[] f4875b1 = {R.attr.windowBackground};

    /* renamed from: c1, reason: collision with root package name */
    private static final boolean f4876c1 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: d1, reason: collision with root package name */
    private static final boolean f4877d1 = true;

    /* renamed from: e1, reason: collision with root package name */
    private static boolean f4878e1 = false;

    /* renamed from: f1, reason: collision with root package name */
    static final String f4879f1 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";

    /* renamed from: A0, reason: collision with root package name */
    boolean f4880A0;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f4881B0;

    /* renamed from: C0, reason: collision with root package name */
    private w[] f4882C0;

    /* renamed from: D0, reason: collision with root package name */
    private w f4883D0;

    /* renamed from: E0, reason: collision with root package name */
    private boolean f4884E0;

    /* renamed from: F0, reason: collision with root package name */
    private boolean f4885F0;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f4886G0;

    /* renamed from: H0, reason: collision with root package name */
    boolean f4887H0;

    /* renamed from: I0, reason: collision with root package name */
    private Configuration f4888I0;

    /* renamed from: J0, reason: collision with root package name */
    private int f4889J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f4890K0;

    /* renamed from: L0, reason: collision with root package name */
    private int f4891L0;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f4892M0;

    /* renamed from: N0, reason: collision with root package name */
    private s f4893N0;

    /* renamed from: O0, reason: collision with root package name */
    private s f4894O0;

    /* renamed from: P0, reason: collision with root package name */
    boolean f4895P0;

    /* renamed from: Q0, reason: collision with root package name */
    int f4896Q0;

    /* renamed from: R0, reason: collision with root package name */
    private final Runnable f4897R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f4898S0;

    /* renamed from: T0, reason: collision with root package name */
    private Rect f4899T0;

    /* renamed from: U0, reason: collision with root package name */
    private Rect f4900U0;

    /* renamed from: V0, reason: collision with root package name */
    private androidx.appcompat.app.u f4901V0;

    /* renamed from: W0, reason: collision with root package name */
    private androidx.appcompat.app.x f4902W0;

    /* renamed from: X0, reason: collision with root package name */
    private OnBackInvokedDispatcher f4903X0;

    /* renamed from: Y0, reason: collision with root package name */
    private OnBackInvokedCallback f4904Y0;

    /* renamed from: Z, reason: collision with root package name */
    final Object f4905Z;

    /* renamed from: a0, reason: collision with root package name */
    final Context f4906a0;

    /* renamed from: b0, reason: collision with root package name */
    Window f4907b0;

    /* renamed from: c0, reason: collision with root package name */
    private q f4908c0;

    /* renamed from: d0, reason: collision with root package name */
    final androidx.appcompat.app.f f4909d0;

    /* renamed from: e0, reason: collision with root package name */
    AbstractC0583a f4910e0;

    /* renamed from: f0, reason: collision with root package name */
    MenuInflater f4911f0;

    /* renamed from: g0, reason: collision with root package name */
    private CharSequence f4912g0;

    /* renamed from: h0, reason: collision with root package name */
    private F f4913h0;

    /* renamed from: i0, reason: collision with root package name */
    private C0043j f4914i0;

    /* renamed from: j0, reason: collision with root package name */
    private x f4915j0;

    /* renamed from: k0, reason: collision with root package name */
    androidx.appcompat.view.b f4916k0;

    /* renamed from: l0, reason: collision with root package name */
    ActionBarContextView f4917l0;

    /* renamed from: m0, reason: collision with root package name */
    PopupWindow f4918m0;

    /* renamed from: n0, reason: collision with root package name */
    Runnable f4919n0;

    /* renamed from: o0, reason: collision with root package name */
    C0850t0 f4920o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f4921p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f4922q0;

    /* renamed from: r0, reason: collision with root package name */
    ViewGroup f4923r0;

    /* renamed from: s0, reason: collision with root package name */
    private TextView f4924s0;

    /* renamed from: t0, reason: collision with root package name */
    private View f4925t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f4926u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f4927v0;

    /* renamed from: w0, reason: collision with root package name */
    boolean f4928w0;

    /* renamed from: x0, reason: collision with root package name */
    boolean f4929x0;

    /* renamed from: y0, reason: collision with root package name */
    boolean f4930y0;

    /* renamed from: z0, reason: collision with root package name */
    boolean f4931z0;

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f4932a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f4932a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (!message.contains("drawable") && !message.contains("Drawable")) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@N Thread thread, @N Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + j.f4879f1);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f4932a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f4932a.uncaughtException(thread, th);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            if ((jVar.f4896Q0 & 1) != 0) {
                jVar.B0(0);
            }
            j jVar2 = j.this;
            if ((jVar2.f4896Q0 & 4096) != 0) {
                jVar2.B0(108);
            }
            j jVar3 = j.this;
            jVar3.f4895P0 = false;
            jVar3.f4896Q0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements InterfaceC0772a0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, Y0 y02) {
            int r4 = y02.r();
            int y12 = j.this.y1(y02, null);
            if (r4 != y12) {
                y02 = y02.D(y02.p(), y12, y02.q(), y02.o());
            }
            return C0823k0.g1(view, y02);
        }
    }

    /* loaded from: classes.dex */
    class d implements O.a {
        d() {
        }

        @Override // androidx.appcompat.widget.O.a
        public void a(Rect rect) {
            rect.top = j.this.y1(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            j.this.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        class a extends C0854v0 {
            a() {
            }

            @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
            public void b(View view) {
                j.this.f4917l0.setAlpha(1.0f);
                j.this.f4920o0.u(null);
                j.this.f4920o0 = null;
            }

            @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
            public void c(View view) {
                j.this.f4917l0.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.f4918m0.showAtLocation(jVar.f4917l0, 55, 0, 0);
            j.this.C0();
            if (j.this.o1()) {
                j.this.f4917l0.setAlpha(0.0f);
                j jVar2 = j.this;
                jVar2.f4920o0 = C0823k0.g(jVar2.f4917l0).b(1.0f);
                j.this.f4920o0.u(new a());
                return;
            }
            j.this.f4917l0.setAlpha(1.0f);
            j.this.f4917l0.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends C0854v0 {
        g() {
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void b(View view) {
            j.this.f4917l0.setAlpha(1.0f);
            j.this.f4920o0.u(null);
            j.this.f4920o0 = null;
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void c(View view) {
            j.this.f4917l0.setVisibility(0);
            if (j.this.f4917l0.getParent() instanceof View) {
                C0823k0.v1((View) j.this.f4917l0.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    private class h implements C0584b.InterfaceC0042b {
        h() {
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public void a(Drawable drawable, int i4) {
            AbstractC0583a C3 = j.this.C();
            if (C3 != null) {
                C3.l0(drawable);
                C3.i0(i4);
            }
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public Drawable b() {
            g0 F3 = g0.F(e(), null, new int[]{C2042a.b.f49109E1});
            Drawable h4 = F3.h(0);
            F3.I();
            return h4;
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public void c(int i4) {
            AbstractC0583a C3 = j.this.C();
            if (C3 != null) {
                C3.i0(i4);
            }
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public boolean d() {
            AbstractC0583a C3 = j.this.C();
            if (C3 != null && (C3.p() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public Context e() {
            return j.this.H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface i {
        boolean a(int i4);

        @P
        View onCreatePanelView(int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.j$j, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0043j implements n.a {
        C0043j() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@N androidx.appcompat.view.menu.g gVar, boolean z3) {
            j.this.t0(gVar);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@N androidx.appcompat.view.menu.g gVar) {
            Window.Callback Q02 = j.this.Q0();
            if (Q02 != null) {
                Q02.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f4942a;

        /* loaded from: classes.dex */
        class a extends C0854v0 {
            a() {
            }

            @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
            public void b(View view) {
                j.this.f4917l0.setVisibility(8);
                j jVar = j.this;
                PopupWindow popupWindow = jVar.f4918m0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (jVar.f4917l0.getParent() instanceof View) {
                    C0823k0.v1((View) j.this.f4917l0.getParent());
                }
                j.this.f4917l0.t();
                j.this.f4920o0.u(null);
                j jVar2 = j.this;
                jVar2.f4920o0 = null;
                C0823k0.v1(jVar2.f4923r0);
            }
        }

        public k(b.a aVar) {
            this.f4942a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f4942a.a(bVar);
            j jVar = j.this;
            if (jVar.f4918m0 != null) {
                jVar.f4907b0.getDecorView().removeCallbacks(j.this.f4919n0);
            }
            j jVar2 = j.this;
            if (jVar2.f4917l0 != null) {
                jVar2.C0();
                j jVar3 = j.this;
                jVar3.f4920o0 = C0823k0.g(jVar3.f4917l0).b(0.0f);
                j.this.f4920o0.u(new a());
            }
            j jVar4 = j.this;
            androidx.appcompat.app.f fVar = jVar4.f4909d0;
            if (fVar != null) {
                fVar.h(jVar4.f4916k0);
            }
            j jVar5 = j.this;
            jVar5.f4916k0 = null;
            C0823k0.v1(jVar5.f4923r0);
            j.this.w1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f4942a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            C0823k0.v1(j.this.f4923r0);
            return this.f4942a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f4942a.d(bVar, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(17)
    /* loaded from: classes.dex */
    public static class l {
        private l() {
        }

        static Context a(@N Context context, @N Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(@N Configuration configuration, @N Configuration configuration2, @N Configuration configuration3) {
            int i4 = configuration.densityDpi;
            int i5 = configuration2.densityDpi;
            if (i4 != i5) {
                configuration3.densityDpi = i5;
            }
        }

        @InterfaceC0577u
        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        @InterfaceC0577u
        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    @W(21)
    /* loaded from: classes.dex */
    static class m {
        private m() {
        }

        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @InterfaceC0577u
        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(24)
    /* loaded from: classes.dex */
    public static class n {
        private n() {
        }

        @InterfaceC0577u
        static void a(@N Configuration configuration, @N Configuration configuration2, @N Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        @InterfaceC0577u
        static C0750m b(Configuration configuration) {
            return C0750m.c(configuration.getLocales().toLanguageTags());
        }

        @InterfaceC0577u
        public static void c(C0750m c0750m) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c0750m.m()));
        }

        @InterfaceC0577u
        static void d(Configuration configuration, C0750m c0750m) {
            configuration.setLocales(LocaleList.forLanguageTags(c0750m.m()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(26)
    /* loaded from: classes.dex */
    public static class o {
        private o() {
        }

        static void a(@N Configuration configuration, @N Configuration configuration2, @N Configuration configuration3) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            i4 = configuration.colorMode;
            int i12 = i4 & 3;
            i5 = configuration2.colorMode;
            if (i12 != (i5 & 3)) {
                i10 = configuration3.colorMode;
                i11 = configuration2.colorMode;
                configuration3.colorMode = i10 | (i11 & 3);
            }
            i6 = configuration.colorMode;
            int i13 = i6 & 12;
            i7 = configuration2.colorMode;
            if (i13 != (i7 & 12)) {
                i8 = configuration3.colorMode;
                i9 = configuration2.colorMode;
                configuration3.colorMode = i8 | (i9 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(33)
    /* loaded from: classes.dex */
    public static class p {
        private p() {
        }

        @InterfaceC0577u
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        @InterfaceC0577u
        static OnBackInvokedCallback b(Object obj, final j jVar) {
            Objects.requireNonNull(jVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.r
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    j.this.X0();
                }
            };
            androidx.appcompat.app.n.a(obj).registerOnBackInvokedCallback(kotlin.time.g.f52879a, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @InterfaceC0577u
        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.n.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.m.a(obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class q extends androidx.appcompat.view.i {

        /* renamed from: F, reason: collision with root package name */
        private i f4945F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f4946G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f4947H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f4948I;

        q(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f4947H = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f4947H = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f4946G = true;
                callback.onContentChanged();
            } finally {
                this.f4946G = false;
            }
        }

        public void d(Window.Callback callback, int i4, Menu menu) {
            try {
                this.f4948I = true;
                callback.onPanelClosed(i4, menu);
            } finally {
                this.f4948I = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f4947H) {
                return a().dispatchKeyEvent(keyEvent);
            }
            if (!j.this.A0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !j.this.a1(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        void e(@P i iVar) {
            this.f4945F = iVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(j.this.f4906a0, callback);
            androidx.appcompat.view.b k02 = j.this.k0(aVar);
            if (k02 != null) {
                return aVar.e(k02);
            }
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f4946G) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i4, Menu menu) {
            if (i4 == 0 && !(menu instanceof androidx.appcompat.view.menu.g)) {
                return false;
            }
            return super.onCreatePanelMenu(i4, menu);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i4) {
            View onCreatePanelView;
            i iVar = this.f4945F;
            if (iVar != null && (onCreatePanelView = iVar.onCreatePanelView(i4)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i4);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i4, Menu menu) {
            super.onMenuOpened(i4, menu);
            j.this.d1(i4);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i4, Menu menu) {
            if (this.f4948I) {
                a().onPanelClosed(i4, menu);
            } else {
                super.onPanelClosed(i4, menu);
                j.this.e1(i4);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i4, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar;
            if (menu instanceof androidx.appcompat.view.menu.g) {
                gVar = (androidx.appcompat.view.menu.g) menu;
            } else {
                gVar = null;
            }
            if (i4 == 0 && gVar == null) {
                return false;
            }
            boolean z3 = true;
            if (gVar != null) {
                gVar.i0(true);
            }
            i iVar = this.f4945F;
            if (iVar == null || !iVar.a(i4)) {
                z3 = false;
            }
            if (!z3) {
                z3 = super.onPreparePanel(i4, view, menu);
            }
            if (gVar != null) {
                gVar.i0(false);
            }
            return z3;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        @W(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i4) {
            androidx.appcompat.view.menu.g gVar;
            w N02 = j.this.N0(0, true);
            if (N02 != null && (gVar = N02.f4967j) != null) {
                super.onProvideKeyboardShortcuts(list, gVar, i4);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i4);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        @W(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
            if (j.this.I() && i4 == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class r extends s {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f4950c;

        r(@N Context context) {
            super();
            this.f4950c = (PowerManager) context.getApplicationContext().getSystemService(L1.a.f1635p3);
        }

        @Override // androidx.appcompat.app.j.s
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.j.s
        public int c() {
            if (m.a(this.f4950c)) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.j.s
        public void e() {
            j.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public abstract class s {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f4952a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                s.this.e();
            }
        }

        s() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f4952a;
            if (broadcastReceiver != null) {
                try {
                    j.this.f4906a0.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f4952a = null;
            }
        }

        @P
        abstract IntentFilter b();

        abstract int c();

        boolean d() {
            if (this.f4952a != null) {
                return true;
            }
            return false;
        }

        abstract void e();

        void f() {
            a();
            IntentFilter b4 = b();
            if (b4 != null && b4.countActions() != 0) {
                if (this.f4952a == null) {
                    this.f4952a = new a();
                }
                j.this.f4906a0.registerReceiver(this.f4952a, b4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class t extends s {

        /* renamed from: c, reason: collision with root package name */
        private final D f4955c;

        t(@N D d4) {
            super();
            this.f4955c = d4;
        }

        @Override // androidx.appcompat.app.j.s
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.j.s
        public int c() {
            if (this.f4955c.d()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.j.s
        public void e() {
            j.this.h();
        }
    }

    @W(17)
    /* loaded from: classes.dex */
    private static class u {
        private u() {
        }

        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class v extends ContentFrameLayout {
        public v(Context context) {
            super(context);
        }

        private boolean c(int i4, int i5) {
            if (i4 >= -5 && i5 >= -5 && i4 <= getWidth() + 5 && i5 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!j.this.A0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                j.this.v0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i4) {
            setBackgroundDrawable(C2046a.b(getContext(), i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class w {

        /* renamed from: a, reason: collision with root package name */
        int f4958a;

        /* renamed from: b, reason: collision with root package name */
        int f4959b;

        /* renamed from: c, reason: collision with root package name */
        int f4960c;

        /* renamed from: d, reason: collision with root package name */
        int f4961d;

        /* renamed from: e, reason: collision with root package name */
        int f4962e;

        /* renamed from: f, reason: collision with root package name */
        int f4963f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f4964g;

        /* renamed from: h, reason: collision with root package name */
        View f4965h;

        /* renamed from: i, reason: collision with root package name */
        View f4966i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f4967j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f4968k;

        /* renamed from: l, reason: collision with root package name */
        Context f4969l;

        /* renamed from: m, reason: collision with root package name */
        boolean f4970m;

        /* renamed from: n, reason: collision with root package name */
        boolean f4971n;

        /* renamed from: o, reason: collision with root package name */
        boolean f4972o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f4973p;

        /* renamed from: q, reason: collision with root package name */
        boolean f4974q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f4975r;

        /* renamed from: s, reason: collision with root package name */
        boolean f4976s;

        /* renamed from: t, reason: collision with root package name */
        Bundle f4977t;

        /* renamed from: u, reason: collision with root package name */
        Bundle f4978u;

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0044a();

            /* renamed from: E, reason: collision with root package name */
            int f4979E;

            /* renamed from: F, reason: collision with root package name */
            boolean f4980F;

            /* renamed from: G, reason: collision with root package name */
            Bundle f4981G;

            /* renamed from: androidx.appcompat.app.j$w$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0044a implements Parcelable.ClassLoaderCreator<a> {
                C0044a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return a.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return a.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i4) {
                    return new a[i4];
                }
            }

            a() {
            }

            static a a(Parcel parcel, ClassLoader classLoader) {
                a aVar = new a();
                aVar.f4979E = parcel.readInt();
                boolean z3 = true;
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                aVar.f4980F = z3;
                if (z3) {
                    aVar.f4981G = parcel.readBundle(classLoader);
                }
                return aVar;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f4979E);
                parcel.writeInt(this.f4980F ? 1 : 0);
                if (this.f4980F) {
                    parcel.writeBundle(this.f4981G);
                }
            }
        }

        w(int i4) {
            this.f4958a = i4;
        }

        void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.g gVar = this.f4967j;
            if (gVar != null && (bundle = this.f4977t) != null) {
                gVar.U(bundle);
                this.f4977t = null;
            }
        }

        public void b() {
            androidx.appcompat.view.menu.g gVar = this.f4967j;
            if (gVar != null) {
                gVar.S(this.f4968k);
            }
            this.f4968k = null;
        }

        androidx.appcompat.view.menu.o c(n.a aVar) {
            if (this.f4967j == null) {
                return null;
            }
            if (this.f4968k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f4969l, C2042a.j.f49701q);
                this.f4968k = eVar;
                eVar.h(aVar);
                this.f4967j.b(this.f4968k);
            }
            return this.f4968k.m(this.f4964g);
        }

        public boolean d() {
            if (this.f4965h == null) {
                return false;
            }
            if (this.f4966i == null && this.f4968k.a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        void e(Parcelable parcelable) {
            a aVar = (a) parcelable;
            this.f4958a = aVar.f4979E;
            this.f4976s = aVar.f4980F;
            this.f4977t = aVar.f4981G;
            this.f4965h = null;
            this.f4964g = null;
        }

        Parcelable f() {
            a aVar = new a();
            aVar.f4979E = this.f4958a;
            aVar.f4980F = this.f4972o;
            if (this.f4967j != null) {
                Bundle bundle = new Bundle();
                aVar.f4981G = bundle;
                this.f4967j.W(bundle);
            }
            return aVar;
        }

        void g(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f4967j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.S(this.f4968k);
            }
            this.f4967j = gVar;
            if (gVar != null && (eVar = this.f4968k) != null) {
                gVar.b(eVar);
            }
        }

        void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C2042a.b.f49205c, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                newTheme.applyStyle(i4, true);
            }
            newTheme.resolveAttribute(C2042a.b.f49309x2, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                newTheme.applyStyle(i5, true);
            } else {
                newTheme.applyStyle(C2042a.l.P3, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f4969l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C2042a.m.f50039S0);
            this.f4959b = obtainStyledAttributes.getResourceId(C2042a.m.f49973B2, 0);
            this.f4963f = obtainStyledAttributes.getResourceId(C2042a.m.f50047U0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class x implements n.a {
        x() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@N androidx.appcompat.view.menu.g gVar, boolean z3) {
            boolean z4;
            androidx.appcompat.view.menu.g G3 = gVar.G();
            if (G3 != gVar) {
                z4 = true;
            } else {
                z4 = false;
            }
            j jVar = j.this;
            if (z4) {
                gVar = G3;
            }
            w F02 = jVar.F0(gVar);
            if (F02 != null) {
                if (z4) {
                    j.this.s0(F02.f4958a, F02, G3);
                    j.this.w0(F02, true);
                } else {
                    j.this.w0(F02, z3);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@N androidx.appcompat.view.menu.g gVar) {
            Window.Callback Q02;
            if (gVar == gVar.G()) {
                j jVar = j.this;
                if (jVar.f4928w0 && (Q02 = jVar.Q0()) != null && !j.this.f4887H0) {
                    Q02.onMenuOpened(108, gVar);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Activity activity, androidx.appcompat.app.f fVar) {
        this(activity, null, fVar, activity);
    }

    private void D0() {
        if (!this.f4922q0) {
            this.f4923r0 = y0();
            CharSequence P02 = P0();
            if (!TextUtils.isEmpty(P02)) {
                F f4 = this.f4913h0;
                if (f4 != null) {
                    f4.setWindowTitle(P02);
                } else if (h1() != null) {
                    h1().B0(P02);
                } else {
                    TextView textView = this.f4924s0;
                    if (textView != null) {
                        textView.setText(P02);
                    }
                }
            }
            o0();
            f1(this.f4923r0);
            this.f4922q0 = true;
            w N02 = N0(0, false);
            if (!this.f4887H0) {
                if (N02 == null || N02.f4967j == null) {
                    V0(108);
                }
            }
        }
    }

    private void E0() {
        if (this.f4907b0 == null) {
            Object obj = this.f4905Z;
            if (obj instanceof Activity) {
                p0(((Activity) obj).getWindow());
            }
        }
        if (this.f4907b0 != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @N
    private static Configuration G0(@N Configuration configuration, @P Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f4 = configuration.fontScale;
            float f5 = configuration2.fontScale;
            if (f4 != f5) {
                configuration3.fontScale = f5;
            }
            int i4 = configuration.mcc;
            int i5 = configuration2.mcc;
            if (i4 != i5) {
                configuration3.mcc = i5;
            }
            int i6 = configuration.mnc;
            int i7 = configuration2.mnc;
            if (i6 != i7) {
                configuration3.mnc = i7;
            }
            int i8 = Build.VERSION.SDK_INT;
            n.a(configuration, configuration2, configuration3);
            int i9 = configuration.touchscreen;
            int i10 = configuration2.touchscreen;
            if (i9 != i10) {
                configuration3.touchscreen = i10;
            }
            int i11 = configuration.keyboard;
            int i12 = configuration2.keyboard;
            if (i11 != i12) {
                configuration3.keyboard = i12;
            }
            int i13 = configuration.keyboardHidden;
            int i14 = configuration2.keyboardHidden;
            if (i13 != i14) {
                configuration3.keyboardHidden = i14;
            }
            int i15 = configuration.navigation;
            int i16 = configuration2.navigation;
            if (i15 != i16) {
                configuration3.navigation = i16;
            }
            int i17 = configuration.navigationHidden;
            int i18 = configuration2.navigationHidden;
            if (i17 != i18) {
                configuration3.navigationHidden = i18;
            }
            int i19 = configuration.orientation;
            int i20 = configuration2.orientation;
            if (i19 != i20) {
                configuration3.orientation = i20;
            }
            int i21 = configuration.screenLayout & 15;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 15)) {
                configuration3.screenLayout |= i22 & 15;
            }
            int i23 = configuration.screenLayout & 192;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 192)) {
                configuration3.screenLayout |= i24 & 192;
            }
            int i25 = configuration.screenLayout & 48;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 48)) {
                configuration3.screenLayout |= i26 & 48;
            }
            int i27 = configuration.screenLayout & 768;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 768)) {
                configuration3.screenLayout |= i28 & 768;
            }
            if (i8 >= 26) {
                o.a(configuration, configuration2, configuration3);
            }
            int i29 = configuration.uiMode & 15;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 15)) {
                configuration3.uiMode |= i30 & 15;
            }
            int i31 = configuration.uiMode & 48;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 48)) {
                configuration3.uiMode |= i32 & 48;
            }
            int i33 = configuration.screenWidthDp;
            int i34 = configuration2.screenWidthDp;
            if (i33 != i34) {
                configuration3.screenWidthDp = i34;
            }
            int i35 = configuration.screenHeightDp;
            int i36 = configuration2.screenHeightDp;
            if (i35 != i36) {
                configuration3.screenHeightDp = i36;
            }
            int i37 = configuration.smallestScreenWidthDp;
            int i38 = configuration2.smallestScreenWidthDp;
            if (i37 != i38) {
                configuration3.smallestScreenWidthDp = i38;
            }
            l.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int I0(Context context) {
        int i4;
        if (!this.f4892M0 && (this.f4905Z instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i4 = 269221888;
                } else {
                    i4 = 786432;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f4905Z.getClass()), i4);
                if (activityInfo != null) {
                    this.f4891L0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e4);
                this.f4891L0 = 0;
            }
        }
        this.f4892M0 = true;
        return this.f4891L0;
    }

    private s J0(@N Context context) {
        if (this.f4894O0 == null) {
            this.f4894O0 = new r(context);
        }
        return this.f4894O0;
    }

    private s L0(@N Context context) {
        if (this.f4893N0 == null) {
            this.f4893N0 = new t(D.a(context));
        }
        return this.f4893N0;
    }

    private void R0() {
        D0();
        if (this.f4928w0 && this.f4910e0 == null) {
            Object obj = this.f4905Z;
            if (obj instanceof Activity) {
                this.f4910e0 = new E((Activity) this.f4905Z, this.f4929x0);
            } else if (obj instanceof Dialog) {
                this.f4910e0 = new E((Dialog) this.f4905Z);
            }
            AbstractC0583a abstractC0583a = this.f4910e0;
            if (abstractC0583a != null) {
                abstractC0583a.X(this.f4898S0);
            }
        }
    }

    private boolean S0(w wVar) {
        View view = wVar.f4966i;
        if (view != null) {
            wVar.f4965h = view;
            return true;
        }
        if (wVar.f4967j == null) {
            return false;
        }
        if (this.f4915j0 == null) {
            this.f4915j0 = new x();
        }
        View view2 = (View) wVar.c(this.f4915j0);
        wVar.f4965h = view2;
        if (view2 != null) {
            return true;
        }
        return false;
    }

    private boolean T0(w wVar) {
        wVar.h(H0());
        wVar.f4964g = new v(wVar.f4969l);
        wVar.f4960c = 81;
        return true;
    }

    private boolean U0(w wVar) {
        Resources.Theme theme;
        Context context = this.f4906a0;
        int i4 = wVar.f4958a;
        if ((i4 == 0 || i4 == 108) && this.f4913h0 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C2042a.b.f49240j, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C2042a.b.f49245k, typedValue, true);
            } else {
                theme2.resolveAttribute(C2042a.b.f49245k, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.X(this);
        wVar.g(gVar);
        return true;
    }

    private void V0(int i4) {
        this.f4896Q0 = (1 << i4) | this.f4896Q0;
        if (!this.f4895P0) {
            C0823k0.p1(this.f4907b0.getDecorView(), this.f4897R0);
            this.f4895P0 = true;
        }
    }

    private boolean Z0(int i4, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            w N02 = N0(i4, true);
            if (!N02.f4972o) {
                return j1(N02, keyEvent);
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005a, code lost:
    
        if (j1(r2, r6) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c1(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f4916k0
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.j$w r2 = r4.N0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.F r5 = r4.f4913h0
            if (r5 == 0) goto L43
            boolean r5 = r5.i()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f4906a0
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.F r5 = r4.f4913h0
            boolean r5 = r5.f()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f4887H0
            if (r5 != 0) goto L60
            boolean r5 = r4.j1(r2, r6)
            if (r5 == 0) goto L60
            androidx.appcompat.widget.F r5 = r4.f4913h0
            boolean r0 = r5.m()
            goto L66
        L3c:
            androidx.appcompat.widget.F r5 = r4.f4913h0
            boolean r0 = r5.l()
            goto L66
        L43:
            boolean r5 = r2.f4972o
            if (r5 != 0) goto L62
            boolean r3 = r2.f4971n
            if (r3 == 0) goto L4c
            goto L62
        L4c:
            boolean r5 = r2.f4970m
            if (r5 == 0) goto L60
            boolean r5 = r2.f4975r
            if (r5 == 0) goto L5c
            r2.f4970m = r1
            boolean r5 = r4.j1(r2, r6)
            if (r5 == 0) goto L60
        L5c:
            r4.g1(r2, r6)
            goto L66
        L60:
            r0 = r1
            goto L66
        L62:
            r4.w0(r2, r0)
            r0 = r5
        L66:
            if (r0 == 0) goto L83
            android.content.Context r5 = r4.f4906a0
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7c
            r5.playSoundEffect(r1)
            goto L83
        L7c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.c1(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g1(androidx.appcompat.app.j.w r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.g1(androidx.appcompat.app.j$w, android.view.KeyEvent):void");
    }

    private boolean i1(w wVar, int i4, KeyEvent keyEvent, int i5) {
        androidx.appcompat.view.menu.g gVar;
        boolean z3 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wVar.f4970m || j1(wVar, keyEvent)) && (gVar = wVar.f4967j) != null) {
            z3 = gVar.performShortcut(i4, keyEvent, i5);
        }
        if (z3 && (i5 & 1) == 0 && this.f4913h0 == null) {
            w0(wVar, true);
        }
        return z3;
    }

    private boolean j1(w wVar, KeyEvent keyEvent) {
        boolean z3;
        F f4;
        int i4;
        boolean z4;
        F f5;
        F f6;
        if (this.f4887H0) {
            return false;
        }
        if (wVar.f4970m) {
            return true;
        }
        w wVar2 = this.f4883D0;
        if (wVar2 != null && wVar2 != wVar) {
            w0(wVar2, false);
        }
        Window.Callback Q02 = Q0();
        if (Q02 != null) {
            wVar.f4966i = Q02.onCreatePanelView(wVar.f4958a);
        }
        int i5 = wVar.f4958a;
        if (i5 != 0 && i5 != 108) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 && (f6 = this.f4913h0) != null) {
            f6.g();
        }
        if (wVar.f4966i == null && (!z3 || !(h1() instanceof B))) {
            androidx.appcompat.view.menu.g gVar = wVar.f4967j;
            if (gVar == null || wVar.f4975r) {
                if (gVar == null && (!U0(wVar) || wVar.f4967j == null)) {
                    return false;
                }
                if (z3 && this.f4913h0 != null) {
                    if (this.f4914i0 == null) {
                        this.f4914i0 = new C0043j();
                    }
                    this.f4913h0.d(wVar.f4967j, this.f4914i0);
                }
                wVar.f4967j.m0();
                if (!Q02.onCreatePanelMenu(wVar.f4958a, wVar.f4967j)) {
                    wVar.g(null);
                    if (z3 && (f4 = this.f4913h0) != null) {
                        f4.d(null, this.f4914i0);
                    }
                    return false;
                }
                wVar.f4975r = false;
            }
            wVar.f4967j.m0();
            Bundle bundle = wVar.f4978u;
            if (bundle != null) {
                wVar.f4967j.T(bundle);
                wVar.f4978u = null;
            }
            if (!Q02.onPreparePanel(0, wVar.f4966i, wVar.f4967j)) {
                if (z3 && (f5 = this.f4913h0) != null) {
                    f5.d(null, this.f4914i0);
                }
                wVar.f4967j.l0();
                return false;
            }
            if (keyEvent != null) {
                i4 = keyEvent.getDeviceId();
            } else {
                i4 = -1;
            }
            if (KeyCharacterMap.load(i4).getKeyboardType() != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            wVar.f4973p = z4;
            wVar.f4967j.setQwertyMode(z4);
            wVar.f4967j.l0();
        }
        wVar.f4970m = true;
        wVar.f4971n = false;
        this.f4883D0 = wVar;
        return true;
    }

    private void k1(boolean z3) {
        F f4 = this.f4913h0;
        if (f4 != null && f4.i() && (!ViewConfiguration.get(this.f4906a0).hasPermanentMenuKey() || this.f4913h0.k())) {
            Window.Callback Q02 = Q0();
            if (this.f4913h0.f() && z3) {
                this.f4913h0.l();
                if (!this.f4887H0) {
                    Q02.onPanelClosed(108, N0(0, true).f4967j);
                    return;
                }
                return;
            }
            if (Q02 != null && !this.f4887H0) {
                if (this.f4895P0 && (this.f4896Q0 & 1) != 0) {
                    this.f4907b0.getDecorView().removeCallbacks(this.f4897R0);
                    this.f4897R0.run();
                }
                w N02 = N0(0, true);
                androidx.appcompat.view.menu.g gVar = N02.f4967j;
                if (gVar != null && !N02.f4975r && Q02.onPreparePanel(0, N02.f4966i, gVar)) {
                    Q02.onMenuOpened(108, N02.f4967j);
                    this.f4913h0.m();
                    return;
                }
                return;
            }
            return;
        }
        w N03 = N0(0, true);
        N03.f4974q = true;
        w0(N03, false);
        g1(N03, null);
    }

    private int l1(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i4 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return androidx.appcompat.app.i.f4871X;
        }
        return i4;
    }

    private boolean m0(boolean z3) {
        return n0(z3, true);
    }

    private boolean n0(boolean z3, boolean z4) {
        C0750m c0750m;
        if (this.f4887H0) {
            return false;
        }
        int r02 = r0();
        int W02 = W0(this.f4906a0, r02);
        if (Build.VERSION.SDK_INT < 33) {
            c0750m = q0(this.f4906a0);
        } else {
            c0750m = null;
        }
        if (!z4 && c0750m != null) {
            c0750m = M0(this.f4906a0.getResources().getConfiguration());
        }
        boolean v12 = v1(W02, c0750m, z3);
        if (r02 == 0) {
            L0(this.f4906a0).f();
        } else {
            s sVar = this.f4893N0;
            if (sVar != null) {
                sVar.a();
            }
        }
        if (r02 == 3) {
            J0(this.f4906a0).f();
        } else {
            s sVar2 = this.f4894O0;
            if (sVar2 != null) {
                sVar2.a();
            }
        }
        return v12;
    }

    private void o0() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f4923r0.findViewById(R.id.content);
        View decorView = this.f4907b0.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f4906a0.obtainStyledAttributes(C2042a.m.f50039S0);
        obtainStyledAttributes.getValue(C2042a.m.f50139n3, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C2042a.m.f50144o3, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C2042a.m.f50129l3)) {
            obtainStyledAttributes.getValue(C2042a.m.f50129l3, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C2042a.m.f50134m3)) {
            obtainStyledAttributes.getValue(C2042a.m.f50134m3, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C2042a.m.f50119j3)) {
            obtainStyledAttributes.getValue(C2042a.m.f50119j3, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C2042a.m.f50124k3)) {
            obtainStyledAttributes.getValue(C2042a.m.f50124k3, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void p0(@N Window window) {
        if (this.f4907b0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof q)) {
                q qVar = new q(callback);
                this.f4908c0 = qVar;
                window.setCallback(qVar);
                g0 F3 = g0.F(this.f4906a0, null, f4875b1);
                Drawable i4 = F3.i(0);
                if (i4 != null) {
                    window.setBackgroundDrawable(i4);
                }
                F3.I();
                this.f4907b0 = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f4903X0 == null) {
                    g0(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean p1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f4907b0.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0823k0.O0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int r0() {
        int i4 = this.f4889J0;
        if (i4 == -100) {
            return androidx.appcompat.app.i.v();
        }
        return i4;
    }

    private void s1() {
        if (!this.f4922q0) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @P
    private ActivityC0587e t1() {
        for (Context context = this.f4906a0; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC0587e) {
                return (ActivityC0587e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void u0() {
        s sVar = this.f4893N0;
        if (sVar != null) {
            sVar.a();
        }
        s sVar2 = this.f4894O0;
        if (sVar2 != null) {
            sVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u1(Configuration configuration) {
        Activity activity = (Activity) this.f4905Z;
        if (activity instanceof androidx.lifecycle.E) {
            if (((androidx.lifecycle.E) activity).getLifecycle().b().e(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f4886G0 && !this.f4887H0) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean v1(int r9, @androidx.annotation.P androidx.core.os.C0750m r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f4906a0
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.x0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f4906a0
            int r1 = r8.I0(r1)
            android.content.res.Configuration r2 = r8.f4888I0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f4906a0
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.m r2 = r8.M0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.m r0 = r8.M0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L45
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L6f
            if (r11 == 0) goto L6f
            boolean r11 = r8.f4885F0
            if (r11 == 0) goto L6f
            boolean r11 = androidx.appcompat.app.j.f4876c1
            if (r11 != 0) goto L58
            boolean r11 = r8.f4886G0
            if (r11 == 0) goto L6f
        L58:
            java.lang.Object r11 = r8.f4905Z
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L6f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r8.f4905Z
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.C0617b.H(r11)
            r11 = r7
            goto L70
        L6f:
            r11 = r6
        L70:
            if (r11 != 0) goto L7d
            if (r3 == 0) goto L7d
            r11 = r3 & r1
            if (r11 != r3) goto L79
            r6 = r7
        L79:
            r8.x1(r4, r0, r6, r5)
            goto L7e
        L7d:
            r7 = r11
        L7e:
            if (r7 == 0) goto L9a
            java.lang.Object r11 = r8.f4905Z
            boolean r1 = r11 instanceof androidx.appcompat.app.ActivityC0587e
            if (r1 == 0) goto L9a
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L8f
            androidx.appcompat.app.e r11 = (androidx.appcompat.app.ActivityC0587e) r11
            r11.q0(r9)
        L8f:
            r9 = r3 & 4
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.f4905Z
            androidx.appcompat.app.e r9 = (androidx.appcompat.app.ActivityC0587e) r9
            r9.p0(r10)
        L9a:
            if (r7 == 0) goto Laf
            if (r0 == 0) goto Laf
            android.content.Context r9 = r8.f4906a0
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.m r9 = r8.M0(r9)
            r8.n1(r9)
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.v1(int, androidx.core.os.m, boolean):boolean");
    }

    @N
    private Configuration x0(@N Context context, int i4, @P C0750m c0750m, @P Configuration configuration, boolean z3) {
        int i5;
        if (i4 != 1) {
            if (i4 != 2) {
                if (z3) {
                    i5 = 0;
                } else {
                    i5 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i5 = 32;
            }
        } else {
            i5 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (c0750m != null) {
            m1(configuration2, c0750m);
        }
        return configuration2;
    }

    private void x1(int i4, @P C0750m c0750m, boolean z3, @P Configuration configuration) {
        Resources resources = this.f4906a0.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & (-49));
        if (c0750m != null) {
            m1(configuration2, c0750m);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            A.a(resources);
        }
        int i5 = this.f4890K0;
        if (i5 != 0) {
            this.f4906a0.setTheme(i5);
            this.f4906a0.getTheme().applyStyle(this.f4890K0, true);
        }
        if (z3 && (this.f4905Z instanceof Activity)) {
            u1(configuration2);
        }
    }

    private ViewGroup y0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f4906a0.obtainStyledAttributes(C2042a.m.f50039S0);
        if (obtainStyledAttributes.hasValue(C2042a.m.f50104g3)) {
            if (obtainStyledAttributes.getBoolean(C2042a.m.f50149p3, false)) {
                V(1);
            } else if (obtainStyledAttributes.getBoolean(C2042a.m.f50104g3, false)) {
                V(108);
            }
            if (obtainStyledAttributes.getBoolean(C2042a.m.f50109h3, false)) {
                V(androidx.appcompat.app.i.f4871X);
            }
            if (obtainStyledAttributes.getBoolean(C2042a.m.f50114i3, false)) {
                V(10);
            }
            this.f4931z0 = obtainStyledAttributes.getBoolean(C2042a.m.f50043T0, false);
            obtainStyledAttributes.recycle();
            E0();
            this.f4907b0.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f4906a0);
            if (!this.f4880A0) {
                if (this.f4931z0) {
                    viewGroup = (ViewGroup) from.inflate(C2042a.j.f49697m, (ViewGroup) null);
                    this.f4929x0 = false;
                    this.f4928w0 = false;
                } else if (this.f4928w0) {
                    TypedValue typedValue = new TypedValue();
                    this.f4906a0.getTheme().resolveAttribute(C2042a.b.f49240j, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new androidx.appcompat.view.d(this.f4906a0, typedValue.resourceId);
                    } else {
                        context = this.f4906a0;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C2042a.j.f49708x, (ViewGroup) null);
                    F f4 = (F) viewGroup.findViewById(C2042a.g.f49662x);
                    this.f4913h0 = f4;
                    f4.setWindowCallback(Q0());
                    if (this.f4929x0) {
                        this.f4913h0.o(androidx.appcompat.app.i.f4871X);
                    }
                    if (this.f4926u0) {
                        this.f4913h0.o(2);
                    }
                    if (this.f4927v0) {
                        this.f4913h0.o(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f4930y0 ? (ViewGroup) from.inflate(C2042a.j.f49707w, (ViewGroup) null) : (ViewGroup) from.inflate(C2042a.j.f49706v, (ViewGroup) null);
            }
            if (viewGroup != null) {
                C0823k0.a2(viewGroup, new c());
                if (this.f4913h0 == null) {
                    this.f4924s0 = (TextView) viewGroup.findViewById(C2042a.g.f49653s0);
                }
                q0.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C2042a.g.f49618b);
                ViewGroup viewGroup2 = (ViewGroup) this.f4907b0.findViewById(R.id.content);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(R.id.content);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f4907b0.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f4928w0 + ", windowActionBarOverlay: " + this.f4929x0 + ", android:windowIsFloating: " + this.f4931z0 + ", windowActionModeOverlay: " + this.f4930y0 + ", windowNoTitle: " + this.f4880A0 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void z1(View view) {
        int f4;
        if ((C0823k0.C0(view) & 8192) != 0) {
            f4 = C0669d.f(this.f4906a0, C2042a.d.f49363g);
        } else {
            f4 = C0669d.f(this.f4906a0, C2042a.d.f49361f);
        }
        view.setBackgroundColor(f4);
    }

    boolean A0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f4905Z;
        if (((obj instanceof E.a) || (obj instanceof androidx.appcompat.app.t)) && (decorView = this.f4907b0.getDecorView()) != null && androidx.core.view.E.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f4908c0.b(this.f4907b0.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return Y0(keyCode, keyEvent);
        }
        return b1(keyCode, keyEvent);
    }

    void B0(int i4) {
        w N02;
        w N03 = N0(i4, true);
        if (N03.f4967j != null) {
            Bundle bundle = new Bundle();
            N03.f4967j.V(bundle);
            if (bundle.size() > 0) {
                N03.f4978u = bundle;
            }
            N03.f4967j.m0();
            N03.f4967j.clear();
        }
        N03.f4975r = true;
        N03.f4974q = true;
        if ((i4 == 108 || i4 == 0) && this.f4913h0 != null && (N02 = N0(0, false)) != null) {
            N02.f4970m = false;
            j1(N02, null);
        }
    }

    @Override // androidx.appcompat.app.i
    public AbstractC0583a C() {
        R0();
        return this.f4910e0;
    }

    void C0() {
        C0850t0 c0850t0 = this.f4920o0;
        if (c0850t0 != null) {
            c0850t0.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D(int r4) {
        /*
            r3 = this;
            int r0 = r3.l1(r4)
            r1 = 1
            if (r0 == r1) goto L29
            r2 = 2
            if (r0 == r2) goto L26
            r2 = 5
            if (r0 == r2) goto L23
            r2 = 10
            if (r0 == r2) goto L20
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 == r2) goto L1d
            r2 = 109(0x6d, float:1.53E-43)
            if (r0 == r2) goto L1a
            goto L2d
        L1a:
            boolean r0 = r3.f4929x0
            goto L2b
        L1d:
            boolean r0 = r3.f4928w0
            goto L2b
        L20:
            boolean r0 = r3.f4930y0
            goto L2b
        L23:
            boolean r0 = r3.f4927v0
            goto L2b
        L26:
            boolean r0 = r3.f4926u0
            goto L2b
        L29:
            boolean r0 = r3.f4880A0
        L2b:
            if (r0 != 0) goto L37
        L2d:
            android.view.Window r0 = r3.f4907b0
            boolean r4 = r0.hasFeature(r4)
            if (r4 == 0) goto L36
            goto L37
        L36:
            r1 = 0
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.D(int):boolean");
    }

    @Override // androidx.appcompat.app.i
    public void E() {
        LayoutInflater from = LayoutInflater.from(this.f4906a0);
        if (from.getFactory() == null) {
            androidx.core.view.F.d(from, this);
        } else if (!(from.getFactory2() instanceof j)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.i
    public void F() {
        if (h1() != null && !C().D()) {
            V0(0);
        }
    }

    w F0(Menu menu) {
        int i4;
        w[] wVarArr = this.f4882C0;
        if (wVarArr != null) {
            i4 = wVarArr.length;
        } else {
            i4 = 0;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            w wVar = wVarArr[i5];
            if (wVar != null && wVar.f4967j == menu) {
                return wVar;
            }
        }
        return null;
    }

    final Context H0() {
        Context context;
        AbstractC0583a C3 = C();
        if (C3 != null) {
            context = C3.A();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f4906a0;
        }
        return context;
    }

    @Override // androidx.appcompat.app.i
    public boolean I() {
        return this.f4921p0;
    }

    @i0
    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    final s K0() {
        return L0(this.f4906a0);
    }

    @Override // androidx.appcompat.app.i
    public void L(Configuration configuration) {
        AbstractC0583a C3;
        if (this.f4928w0 && this.f4922q0 && (C3 = C()) != null) {
            C3.I(configuration);
        }
        C0599l.b().g(this.f4906a0);
        this.f4888I0 = new Configuration(this.f4906a0.getResources().getConfiguration());
        n0(false, false);
    }

    @Override // androidx.appcompat.app.i
    public void M(Bundle bundle) {
        String str;
        this.f4885F0 = true;
        m0(false);
        E0();
        Object obj = this.f4905Z;
        if (obj instanceof Activity) {
            try {
                str = C0660x.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0583a h12 = h1();
                if (h12 == null) {
                    this.f4898S0 = true;
                } else {
                    h12.X(true);
                }
            }
            androidx.appcompat.app.i.e(this);
        }
        this.f4888I0 = new Configuration(this.f4906a0.getResources().getConfiguration());
        this.f4886G0 = true;
    }

    C0750m M0(Configuration configuration) {
        return n.b(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4905Z
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.i.T(r3)
        L9:
            boolean r0 = r3.f4895P0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f4907b0
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f4897R0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f4887H0 = r0
            int r0 = r3.f4889J0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f4905Z
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.l<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.j.f4873Z0
            java.lang.Object r1 = r3.f4905Z
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f4889J0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.l<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.j.f4873Z0
            java.lang.Object r1 = r3.f4905Z
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f4910e0
            if (r0 == 0) goto L5b
            r0.J()
        L5b:
            r3.u0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.N():void");
    }

    protected w N0(int i4, boolean z3) {
        w[] wVarArr = this.f4882C0;
        if (wVarArr == null || wVarArr.length <= i4) {
            w[] wVarArr2 = new w[i4 + 1];
            if (wVarArr != null) {
                System.arraycopy(wVarArr, 0, wVarArr2, 0, wVarArr.length);
            }
            this.f4882C0 = wVarArr2;
            wVarArr = wVarArr2;
        }
        w wVar = wVarArr[i4];
        if (wVar == null) {
            w wVar2 = new w(i4);
            wVarArr[i4] = wVar2;
            return wVar2;
        }
        return wVar;
    }

    @Override // androidx.appcompat.app.i
    public void O(Bundle bundle) {
        D0();
    }

    ViewGroup O0() {
        return this.f4923r0;
    }

    @Override // androidx.appcompat.app.i
    public void P() {
        AbstractC0583a C3 = C();
        if (C3 != null) {
            C3.u0(true);
        }
    }

    final CharSequence P0() {
        Object obj = this.f4905Z;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f4912g0;
    }

    @Override // androidx.appcompat.app.i
    public void Q(Bundle bundle) {
    }

    final Window.Callback Q0() {
        return this.f4907b0.getCallback();
    }

    @Override // androidx.appcompat.app.i
    public void R() {
        n0(true, false);
    }

    @Override // androidx.appcompat.app.i
    public void S() {
        AbstractC0583a C3 = C();
        if (C3 != null) {
            C3.u0(false);
        }
    }

    @Override // androidx.appcompat.app.i
    public boolean V(int i4) {
        int l12 = l1(i4);
        if (this.f4880A0 && l12 == 108) {
            return false;
        }
        if (this.f4928w0 && l12 == 1) {
            this.f4928w0 = false;
        }
        if (l12 != 1) {
            if (l12 != 2) {
                if (l12 != 5) {
                    if (l12 != 10) {
                        if (l12 != 108) {
                            if (l12 != 109) {
                                return this.f4907b0.requestFeature(l12);
                            }
                            s1();
                            this.f4929x0 = true;
                            return true;
                        }
                        s1();
                        this.f4928w0 = true;
                        return true;
                    }
                    s1();
                    this.f4930y0 = true;
                    return true;
                }
                s1();
                this.f4927v0 = true;
                return true;
            }
            s1();
            this.f4926u0 = true;
            return true;
        }
        s1();
        this.f4880A0 = true;
        return true;
    }

    int W0(@N Context context, int i4) {
        if (i4 == -100) {
            return -1;
        }
        if (i4 != -1) {
            if (i4 != 0) {
                if (i4 != 1 && i4 != 2) {
                    if (i4 == 3) {
                        return J0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return L0(context).c();
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean X0() {
        boolean z3 = this.f4884E0;
        this.f4884E0 = false;
        w N02 = N0(0, false);
        if (N02 != null && N02.f4972o) {
            if (!z3) {
                w0(N02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f4916k0;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        AbstractC0583a C3 = C();
        if (C3 == null || !C3.m()) {
            return false;
        }
        return true;
    }

    boolean Y0(int i4, KeyEvent keyEvent) {
        boolean z3 = true;
        if (i4 != 4) {
            if (i4 == 82) {
                Z0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z3 = false;
            }
            this.f4884E0 = z3;
        }
        return false;
    }

    @Override // androidx.appcompat.app.i
    public void Z(int i4) {
        D0();
        ViewGroup viewGroup = (ViewGroup) this.f4923r0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4906a0).inflate(i4, viewGroup);
        this.f4908c0.c(this.f4907b0.getCallback());
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@N androidx.appcompat.view.menu.g gVar, @N MenuItem menuItem) {
        w F02;
        Window.Callback Q02 = Q0();
        if (Q02 != null && !this.f4887H0 && (F02 = F0(gVar.G())) != null) {
            return Q02.onMenuItemSelected(F02.f4958a, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.app.i
    public void a0(View view) {
        D0();
        ViewGroup viewGroup = (ViewGroup) this.f4923r0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4908c0.c(this.f4907b0.getCallback());
    }

    boolean a1(int i4, KeyEvent keyEvent) {
        AbstractC0583a C3 = C();
        if (C3 != null && C3.K(i4, keyEvent)) {
            return true;
        }
        w wVar = this.f4883D0;
        if (wVar != null && i1(wVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            w wVar2 = this.f4883D0;
            if (wVar2 != null) {
                wVar2.f4971n = true;
            }
            return true;
        }
        if (this.f4883D0 == null) {
            w N02 = N0(0, true);
            j1(N02, keyEvent);
            boolean i12 = i1(N02, keyEvent.getKeyCode(), keyEvent, 1);
            N02.f4970m = false;
            if (i12) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@N androidx.appcompat.view.menu.g gVar) {
        k1(true);
    }

    @Override // androidx.appcompat.app.i
    public void b0(View view, ViewGroup.LayoutParams layoutParams) {
        D0();
        ViewGroup viewGroup = (ViewGroup) this.f4923r0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4908c0.c(this.f4907b0.getCallback());
    }

    boolean b1(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            if (i4 == 82) {
                c1(0, keyEvent);
                return true;
            }
        } else if (X0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.i
    public void d0(boolean z3) {
        this.f4921p0 = z3;
    }

    void d1(int i4) {
        AbstractC0583a C3;
        if (i4 == 108 && (C3 = C()) != null) {
            C3.n(true);
        }
    }

    void e1(int i4) {
        if (i4 == 108) {
            AbstractC0583a C3 = C();
            if (C3 != null) {
                C3.n(false);
                return;
            }
            return;
        }
        if (i4 == 0) {
            w N02 = N0(i4, true);
            if (N02.f4972o) {
                w0(N02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.i
    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        D0();
        ((ViewGroup) this.f4923r0.findViewById(R.id.content)).addView(view, layoutParams);
        this.f4908c0.c(this.f4907b0.getCallback());
    }

    @Override // androidx.appcompat.app.i
    @W(17)
    public void f0(int i4) {
        if (this.f4889J0 != i4) {
            this.f4889J0 = i4;
            if (this.f4885F0) {
                h();
            }
        }
    }

    void f1(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.i
    boolean g() {
        if (androidx.appcompat.app.i.G(this.f4906a0) && androidx.appcompat.app.i.A() != null && !androidx.appcompat.app.i.A().equals(androidx.appcompat.app.i.B())) {
            k(this.f4906a0);
        }
        return m0(true);
    }

    @Override // androidx.appcompat.app.i
    @W(33)
    public void g0(@P OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.g0(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f4903X0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f4904Y0) != null) {
            p.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f4904Y0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f4905Z;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f4903X0 = p.a((Activity) this.f4905Z);
                w1();
            }
        }
        this.f4903X0 = onBackInvokedDispatcher;
        w1();
    }

    @Override // androidx.appcompat.app.i
    public boolean h() {
        return m0(true);
    }

    @Override // androidx.appcompat.app.i
    public void h0(Toolbar toolbar) {
        if (!(this.f4905Z instanceof Activity)) {
            return;
        }
        AbstractC0583a C3 = C();
        if (!(C3 instanceof E)) {
            this.f4911f0 = null;
            if (C3 != null) {
                C3.J();
            }
            this.f4910e0 = null;
            if (toolbar != null) {
                B b4 = new B(toolbar, P0(), this.f4908c0);
                this.f4910e0 = b4;
                this.f4908c0.e(b4.f4719k);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f4908c0.e(null);
            }
            F();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    final AbstractC0583a h1() {
        return this.f4910e0;
    }

    @Override // androidx.appcompat.app.i
    public void i0(@d0 int i4) {
        this.f4890K0 = i4;
    }

    @Override // androidx.appcompat.app.i
    public final void j0(CharSequence charSequence) {
        this.f4912g0 = charSequence;
        F f4 = this.f4913h0;
        if (f4 != null) {
            f4.setWindowTitle(charSequence);
            return;
        }
        if (h1() != null) {
            h1().B0(charSequence);
            return;
        }
        TextView textView = this.f4924s0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.i
    public androidx.appcompat.view.b k0(@N b.a aVar) {
        androidx.appcompat.app.f fVar;
        if (aVar != null) {
            androidx.appcompat.view.b bVar = this.f4916k0;
            if (bVar != null) {
                bVar.c();
            }
            k kVar = new k(aVar);
            AbstractC0583a C3 = C();
            if (C3 != null) {
                androidx.appcompat.view.b D02 = C3.D0(kVar);
                this.f4916k0 = D02;
                if (D02 != null && (fVar = this.f4909d0) != null) {
                    fVar.g(D02);
                }
            }
            if (this.f4916k0 == null) {
                this.f4916k0 = r1(kVar);
            }
            w1();
            return this.f4916k0;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // androidx.appcompat.app.i
    @InterfaceC0566i
    @N
    public Context m(@N Context context) {
        Configuration configuration;
        this.f4885F0 = true;
        int W02 = W0(context, r0());
        if (androidx.appcompat.app.i.G(context)) {
            androidx.appcompat.app.i.l0(context);
        }
        C0750m q02 = q0(context);
        if (f4877d1 && (context instanceof ContextThemeWrapper)) {
            try {
                u.a((ContextThemeWrapper) context, x0(context, W02, q02, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(x0(context, W02, q02, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f4876c1) {
            return super.m(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = l.a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = G0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration x02 = x0(context, W02, q02, configuration, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, C2042a.l.b4);
        dVar.a(x02);
        try {
            if (context.getTheme() != null) {
                i.h.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.m(dVar);
    }

    void m1(Configuration configuration, @N C0750m c0750m) {
        n.d(configuration, c0750m);
    }

    void n1(C0750m c0750m) {
        n.c(c0750m);
    }

    final boolean o1() {
        ViewGroup viewGroup;
        if (this.f4922q0 && (viewGroup = this.f4923r0) != null && C0823k0.U0(viewGroup)) {
            return true;
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return r(view, str, context, attributeSet);
    }

    @P
    C0750m q0(@N Context context) {
        C0750m A3;
        if (Build.VERSION.SDK_INT >= 33 || (A3 = androidx.appcompat.app.i.A()) == null) {
            return null;
        }
        C0750m M02 = M0(context.getApplicationContext().getResources().getConfiguration());
        C0750m c4 = y.c(A3, M02);
        if (!c4.j()) {
            return c4;
        }
        return M02;
    }

    boolean q1() {
        if (this.f4903X0 == null) {
            return false;
        }
        w N02 = N0(0, false);
        if ((N02 == null || !N02.f4972o) && this.f4916k0 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.i
    public View r(View view, String str, @N Context context, @N AttributeSet attributeSet) {
        boolean z3;
        boolean z4 = false;
        if (this.f4901V0 == null) {
            String string = this.f4906a0.obtainStyledAttributes(C2042a.m.f50039S0).getString(C2042a.m.f50099f3);
            if (string == null) {
                this.f4901V0 = new androidx.appcompat.app.u();
            } else {
                try {
                    this.f4901V0 = (androidx.appcompat.app.u) this.f4906a0.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f4901V0 = new androidx.appcompat.app.u();
                }
            }
        }
        boolean z5 = f4874a1;
        if (z5) {
            if (this.f4902W0 == null) {
                this.f4902W0 = new androidx.appcompat.app.x();
            }
            if (this.f4902W0.a(attributeSet)) {
                z3 = true;
                return this.f4901V0.r(view, str, context, attributeSet, z3, z5, true, p0.d());
            }
            if (attributeSet instanceof XmlPullParser) {
                if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z4 = true;
                }
            } else {
                z4 = p1((ViewParent) view);
            }
        }
        z3 = z4;
        return this.f4901V0.r(view, str, context, attributeSet, z3, z5, true, p0.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.appcompat.view.b r1(@androidx.annotation.N androidx.appcompat.view.b.a r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.r1(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    @Override // androidx.appcompat.app.i
    @P
    public <T extends View> T s(@androidx.annotation.D int i4) {
        D0();
        return (T) this.f4907b0.findViewById(i4);
    }

    void s0(int i4, w wVar, Menu menu) {
        if (menu == null) {
            if (wVar == null && i4 >= 0) {
                w[] wVarArr = this.f4882C0;
                if (i4 < wVarArr.length) {
                    wVar = wVarArr[i4];
                }
            }
            if (wVar != null) {
                menu = wVar.f4967j;
            }
        }
        if ((wVar == null || wVar.f4972o) && !this.f4887H0) {
            this.f4908c0.d(this.f4907b0.getCallback(), i4, menu);
        }
    }

    void t0(@N androidx.appcompat.view.menu.g gVar) {
        if (this.f4881B0) {
            return;
        }
        this.f4881B0 = true;
        this.f4913h0.p();
        Window.Callback Q02 = Q0();
        if (Q02 != null && !this.f4887H0) {
            Q02.onPanelClosed(108, gVar);
        }
        this.f4881B0 = false;
    }

    @Override // androidx.appcompat.app.i
    public Context u() {
        return this.f4906a0;
    }

    void v0(int i4) {
        w0(N0(i4, true), true);
    }

    @Override // androidx.appcompat.app.i
    public final C0584b.InterfaceC0042b w() {
        return new h();
    }

    void w0(w wVar, boolean z3) {
        ViewGroup viewGroup;
        F f4;
        if (z3 && wVar.f4958a == 0 && (f4 = this.f4913h0) != null && f4.f()) {
            t0(wVar.f4967j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f4906a0.getSystemService("window");
        if (windowManager != null && wVar.f4972o && (viewGroup = wVar.f4964g) != null) {
            windowManager.removeView(viewGroup);
            if (z3) {
                s0(wVar.f4958a, wVar, null);
            }
        }
        wVar.f4970m = false;
        wVar.f4971n = false;
        wVar.f4972o = false;
        wVar.f4965h = null;
        wVar.f4974q = true;
        if (this.f4883D0 == wVar) {
            this.f4883D0 = null;
        }
        if (wVar.f4958a == 0) {
            w1();
        }
    }

    void w1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean q12 = q1();
            if (q12 && this.f4904Y0 == null) {
                this.f4904Y0 = p.b(this.f4903X0, this);
            } else if (!q12 && (onBackInvokedCallback = this.f4904Y0) != null) {
                p.c(this.f4903X0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.i
    public int x() {
        return this.f4889J0;
    }

    final int y1(@P Y0 y02, @P Rect rect) {
        int i4;
        boolean z3;
        int p4;
        int q4;
        boolean z4;
        int i5 = 0;
        if (y02 != null) {
            i4 = y02.r();
        } else if (rect != null) {
            i4 = rect.top;
        } else {
            i4 = 0;
        }
        ActionBarContextView actionBarContextView = this.f4917l0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4917l0.getLayoutParams();
            boolean z5 = true;
            if (this.f4917l0.isShown()) {
                if (this.f4899T0 == null) {
                    this.f4899T0 = new Rect();
                    this.f4900U0 = new Rect();
                }
                Rect rect2 = this.f4899T0;
                Rect rect3 = this.f4900U0;
                if (y02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(y02.p(), y02.r(), y02.q(), y02.o());
                }
                q0.a(this.f4923r0, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                Y0 o02 = C0823k0.o0(this.f4923r0);
                if (o02 == null) {
                    p4 = 0;
                } else {
                    p4 = o02.p();
                }
                if (o02 == null) {
                    q4 = 0;
                } else {
                    q4 = o02.q();
                }
                if (marginLayoutParams.topMargin == i6 && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == i8) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i6;
                    marginLayoutParams.leftMargin = i7;
                    marginLayoutParams.rightMargin = i8;
                    z4 = true;
                }
                if (i6 > 0 && this.f4925t0 == null) {
                    View view = new View(this.f4906a0);
                    this.f4925t0 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = p4;
                    layoutParams.rightMargin = q4;
                    this.f4923r0.addView(this.f4925t0, -1, layoutParams);
                } else {
                    View view2 = this.f4925t0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != p4 || marginLayoutParams2.rightMargin != q4) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = p4;
                            marginLayoutParams2.rightMargin = q4;
                            this.f4925t0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f4925t0;
                if (view3 == null) {
                    z5 = false;
                }
                if (z5 && view3.getVisibility() != 0) {
                    z1(this.f4925t0);
                }
                if (!this.f4930y0 && z5) {
                    i4 = 0;
                }
                z3 = z5;
                z5 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z3 = false;
            } else {
                z3 = false;
                z5 = false;
            }
            if (z5) {
                this.f4917l0.setLayoutParams(marginLayoutParams);
            }
        } else {
            z3 = false;
        }
        View view4 = this.f4925t0;
        if (view4 != null) {
            if (!z3) {
                i5 = 8;
            }
            view4.setVisibility(i5);
        }
        return i4;
    }

    @Override // androidx.appcompat.app.i
    public MenuInflater z() {
        Context context;
        if (this.f4911f0 == null) {
            R0();
            AbstractC0583a abstractC0583a = this.f4910e0;
            if (abstractC0583a != null) {
                context = abstractC0583a.A();
            } else {
                context = this.f4906a0;
            }
            this.f4911f0 = new androidx.appcompat.view.g(context);
        }
        return this.f4911f0;
    }

    void z0() {
        androidx.appcompat.view.menu.g gVar;
        F f4 = this.f4913h0;
        if (f4 != null) {
            f4.p();
        }
        if (this.f4918m0 != null) {
            this.f4907b0.getDecorView().removeCallbacks(this.f4919n0);
            if (this.f4918m0.isShowing()) {
                try {
                    this.f4918m0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f4918m0 = null;
        }
        C0();
        w N02 = N0(0, false);
        if (N02 != null && (gVar = N02.f4967j) != null) {
            gVar.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Dialog dialog, androidx.appcompat.app.f fVar) {
        this(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, Window window, androidx.appcompat.app.f fVar) {
        this(context, window, fVar, context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, Activity activity, androidx.appcompat.app.f fVar) {
        this(context, null, fVar, activity);
    }

    private j(Context context, Window window, androidx.appcompat.app.f fVar, Object obj) {
        androidx.collection.l<String, Integer> lVar;
        Integer num;
        ActivityC0587e t12;
        this.f4920o0 = null;
        this.f4921p0 = true;
        this.f4889J0 = -100;
        this.f4897R0 = new b();
        this.f4906a0 = context;
        this.f4909d0 = fVar;
        this.f4905Z = obj;
        if (this.f4889J0 == -100 && (obj instanceof Dialog) && (t12 = t1()) != null) {
            this.f4889J0 = t12.l0().x();
        }
        if (this.f4889J0 == -100 && (num = (lVar = f4873Z0).get(obj.getClass().getName())) != null) {
            this.f4889J0 = num.intValue();
            lVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            p0(window);
        }
        C0599l.i();
    }
}
