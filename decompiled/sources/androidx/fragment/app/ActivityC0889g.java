package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0572o;
import androidx.annotation.RestrictTo;
import androidx.core.app.C0617b;
import androidx.core.app.y1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.savedstate.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC0889g extends ComponentActivity implements C0617b.i, C0617b.k {

    /* renamed from: d0, reason: collision with root package name */
    static final String f15301d0 = "android:support:lifecycle";

    /* renamed from: Y, reason: collision with root package name */
    final C0892j f15302Y;

    /* renamed from: Z, reason: collision with root package name */
    final androidx.lifecycle.G f15303Z;

    /* renamed from: a0, reason: collision with root package name */
    boolean f15304a0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f15305b0;

    /* renamed from: c0, reason: collision with root package name */
    boolean f15306c0;

    /* renamed from: androidx.fragment.app.g$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0894l<ActivityC0889g> implements q0, androidx.activity.o, androidx.activity.result.k, androidx.savedstate.e, w {
        public a() {
            super(ActivityC0889g.this);
        }

        @Override // androidx.fragment.app.w
        public void a(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
            ActivityC0889g.this.Z(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0894l, androidx.fragment.app.AbstractC0891i
        @androidx.annotation.P
        public View c(int i4) {
            return ActivityC0889g.this.findViewById(i4);
        }

        @Override // androidx.activity.o
        @androidx.annotation.N
        public OnBackPressedDispatcher d() {
            return ActivityC0889g.this.d();
        }

        @Override // androidx.fragment.app.AbstractC0894l, androidx.fragment.app.AbstractC0891i
        public boolean e() {
            Window window = ActivityC0889g.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.E
        @androidx.annotation.N
        public Lifecycle getLifecycle() {
            return ActivityC0889g.this.f15303Z;
        }

        @Override // androidx.savedstate.e
        @androidx.annotation.N
        public androidx.savedstate.c getSavedStateRegistry() {
            return ActivityC0889g.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.q0
        @androidx.annotation.N
        public p0 getViewModelStore() {
            return ActivityC0889g.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC0894l
        public void i(@androidx.annotation.N String str, @androidx.annotation.P FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
            ActivityC0889g.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0894l
        @androidx.annotation.N
        public LayoutInflater k() {
            return ActivityC0889g.this.getLayoutInflater().cloneInContext(ActivityC0889g.this);
        }

        @Override // androidx.fragment.app.AbstractC0894l
        public int l() {
            Window window = ActivityC0889g.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.AbstractC0894l
        public boolean m() {
            if (ActivityC0889g.this.getWindow() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.activity.result.k
        @androidx.annotation.N
        public ActivityResultRegistry o() {
            return ActivityC0889g.this.o();
        }

        @Override // androidx.fragment.app.AbstractC0894l
        public boolean p(@androidx.annotation.N Fragment fragment) {
            return !ActivityC0889g.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0894l
        public boolean q(@androidx.annotation.N String str) {
            return C0617b.P(ActivityC0889g.this, str);
        }

        @Override // androidx.fragment.app.AbstractC0894l
        public void u() {
            ActivityC0889g.this.i0();
        }

        @Override // androidx.fragment.app.AbstractC0894l
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public ActivityC0889g j() {
            return ActivityC0889g.this;
        }
    }

    public ActivityC0889g() {
        this.f15302Y = C0892j.b(new a());
        this.f15303Z = new androidx.lifecycle.G(this);
        this.f15306c0 = true;
        U();
    }

    private void U() {
        getSavedStateRegistry().j(f15301d0, new c.InterfaceC0173c() { // from class: androidx.fragment.app.e
            @Override // androidx.savedstate.c.InterfaceC0173c
            public final Bundle a() {
                Bundle V3;
                V3 = ActivityC0889g.this.V();
                return V3;
            }
        });
        z(new androidx.activity.contextaware.c() { // from class: androidx.fragment.app.f
            @Override // androidx.activity.contextaware.c
            public final void a(Context context) {
                ActivityC0889g.this.W(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle V() {
        X();
        this.f15303Z.l(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(Context context) {
        this.f15302Y.a(null);
    }

    private static boolean Y(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z3 = false;
        for (Fragment fragment : fragmentManager.E0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z3 |= Y(fragment.getChildFragmentManager(), state);
                }
                K k4 = fragment.f15036w0;
                if (k4 != null && k4.getLifecycle().b().e(Lifecycle.State.STARTED)) {
                    fragment.f15036w0.g(state);
                    z3 = true;
                }
                if (fragment.f15035v0.b().e(Lifecycle.State.STARTED)) {
                    fragment.f15035v0.s(state);
                    z3 = true;
                }
            }
        }
        return z3;
    }

    @androidx.annotation.P
    final View R(@androidx.annotation.P View view, @androidx.annotation.N String str, @androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        return this.f15302Y.G(view, str, context, attributeSet);
    }

    @androidx.annotation.N
    public FragmentManager S() {
        return this.f15302Y.D();
    }

    @androidx.annotation.N
    @Deprecated
    public androidx.loader.app.a T() {
        return androidx.loader.app.a.d(this);
    }

    void X() {
        do {
        } while (Y(S(), Lifecycle.State.CREATED));
    }

    @androidx.annotation.K
    @Deprecated
    public void Z(@androidx.annotation.N Fragment fragment) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    protected boolean a0(@androidx.annotation.P View view, @androidx.annotation.N Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void b0() {
        this.f15303Z.l(Lifecycle.Event.ON_RESUME);
        this.f15302Y.r();
    }

    @Override // androidx.core.app.C0617b.k
    @Deprecated
    public final void c(int i4) {
    }

    public void c0(@androidx.annotation.P y1 y1Var) {
        C0617b.L(this, y1Var);
    }

    public void d0(@androidx.annotation.P y1 y1Var) {
        C0617b.M(this, y1Var);
    }

    @Override // android.app.Activity
    public void dump(@androidx.annotation.N String str, @androidx.annotation.P FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f15304a0);
        printWriter.print(" mResumed=");
        printWriter.print(this.f15305b0);
        printWriter.print(" mStopped=");
        printWriter.print(this.f15306c0);
        if (getApplication() != null) {
            androidx.loader.app.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.f15302Y.D().a0(str, fileDescriptor, printWriter, strArr);
    }

    public void e0(@androidx.annotation.N Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        f0(fragment, intent, i4, null);
    }

    public void f0(@androidx.annotation.N Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, @androidx.annotation.P Bundle bundle) {
        if (i4 == -1) {
            C0617b.Q(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i4, bundle);
        }
    }

    @Deprecated
    public void g0(@androidx.annotation.N Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @androidx.annotation.P Intent intent, int i5, int i6, int i7, @androidx.annotation.P Bundle bundle) throws IntentSender.SendIntentException {
        if (i4 == -1) {
            C0617b.R(this, intentSender, i4, intent, i5, i6, i7, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    public void h0() {
        C0617b.A(this);
    }

    @Deprecated
    public void i0() {
        invalidateOptionsMenu();
    }

    public void j0() {
        C0617b.G(this);
    }

    public void k0() {
        C0617b.S(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC0566i
    public void onActivityResult(int i4, int i5, @androidx.annotation.P Intent intent) {
        this.f15302Y.F();
        super.onActivityResult(i4, i5, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@androidx.annotation.N Configuration configuration) {
        this.f15302Y.F();
        super.onConfigurationChanged(configuration);
        this.f15302Y.d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@androidx.annotation.P Bundle bundle) {
        super.onCreate(bundle);
        this.f15303Z.l(Lifecycle.Event.ON_CREATE);
        this.f15302Y.f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, @androidx.annotation.N Menu menu) {
        if (i4 == 0) {
            return super.onCreatePanelMenu(i4, menu) | this.f15302Y.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i4, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @androidx.annotation.P
    public View onCreateView(@androidx.annotation.P View view, @androidx.annotation.N String str, @androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        View R3 = R(view, str, context, attributeSet);
        return R3 == null ? super.onCreateView(view, str, context, attributeSet) : R3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f15302Y.h();
        this.f15303Z.l(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f15302Y.j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, @androidx.annotation.N MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 != 0) {
            if (i4 != 6) {
                return false;
            }
            return this.f15302Y.e(menuItem);
        }
        return this.f15302Y.l(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC0566i
    public void onMultiWindowModeChanged(boolean z3) {
        this.f15302Y.k(z3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC0566i
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f15302Y.F();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, @androidx.annotation.N Menu menu) {
        if (i4 == 0) {
            this.f15302Y.m(menu);
        }
        super.onPanelClosed(i4, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f15305b0 = false;
        this.f15302Y.n();
        this.f15303Z.l(Lifecycle.Event.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC0566i
    public void onPictureInPictureModeChanged(boolean z3) {
        this.f15302Y.o(z3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        b0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i4, @androidx.annotation.P View view, @androidx.annotation.N Menu menu) {
        if (i4 == 0) {
            return a0(view, menu) | this.f15302Y.p(menu);
        }
        return super.onPreparePanel(i4, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC0566i
    public void onRequestPermissionsResult(int i4, @androidx.annotation.N String[] strArr, @androidx.annotation.N int[] iArr) {
        this.f15302Y.F();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.f15302Y.F();
        super.onResume();
        this.f15305b0 = true;
        this.f15302Y.z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.f15302Y.F();
        super.onStart();
        this.f15306c0 = false;
        if (!this.f15304a0) {
            this.f15304a0 = true;
            this.f15302Y.c();
        }
        this.f15302Y.z();
        this.f15303Z.l(Lifecycle.Event.ON_START);
        this.f15302Y.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f15302Y.F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f15306c0 = true;
        X();
        this.f15302Y.t();
        this.f15303Z.l(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @androidx.annotation.P
    public View onCreateView(@androidx.annotation.N String str, @androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        View R3 = R(null, str, context, attributeSet);
        return R3 == null ? super.onCreateView(str, context, attributeSet) : R3;
    }

    @InterfaceC0572o
    public ActivityC0889g(@androidx.annotation.I int i4) {
        super(i4);
        this.f15302Y = C0892j.b(new a());
        this.f15303Z = new androidx.lifecycle.G(this);
        this.f15306c0 = true;
        U();
    }
}
