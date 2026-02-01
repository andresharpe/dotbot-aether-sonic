package androidx.preference;

import android.R;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.k0;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.n;
import androidx.preference.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
/* loaded from: classes.dex */
public abstract class i extends Fragment implements n.c, n.a, n.b, DialogPreference.a {

    /* renamed from: O, reason: collision with root package name */
    @Deprecated
    public static final String f16888O = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* renamed from: P, reason: collision with root package name */
    private static final String f16889P = "android:preferences";

    /* renamed from: Q, reason: collision with root package name */
    private static final String f16890Q = "androidx.preference.PreferenceFragment.DIALOG";

    /* renamed from: R, reason: collision with root package name */
    private static final int f16891R = 1;

    /* renamed from: F, reason: collision with root package name */
    private n f16893F;

    /* renamed from: G, reason: collision with root package name */
    RecyclerView f16894G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f16895H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f16896I;

    /* renamed from: J, reason: collision with root package name */
    private Context f16897J;

    /* renamed from: L, reason: collision with root package name */
    private Runnable f16899L;

    /* renamed from: E, reason: collision with root package name */
    private final d f16892E = new d();

    /* renamed from: K, reason: collision with root package name */
    private int f16898K = q.h.f17065k;

    /* renamed from: M, reason: collision with root package name */
    private final Handler f16900M = new a();

    /* renamed from: N, reason: collision with root package name */
    private final Runnable f16901N = new b();

    /* loaded from: classes.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@N Message message) {
            if (message.what == 1) {
                i.this.b();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = i.this.f16894G;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Preference f16904E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f16905F;

        c(Preference preference, String str) {
            this.f16904E = preference;
            this.f16905F = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            int g4;
            RecyclerView.Adapter adapter = i.this.f16894G.getAdapter();
            if (!(adapter instanceof PreferenceGroup.c)) {
                if (adapter == 0) {
                    return;
                } else {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
            }
            Preference preference = this.f16904E;
            if (preference != null) {
                g4 = ((PreferenceGroup.c) adapter).e(preference);
            } else {
                g4 = ((PreferenceGroup.c) adapter).g(this.f16905F);
            }
            if (g4 != -1) {
                i.this.f16894G.G1(g4);
            } else {
                adapter.K(new h(adapter, i.this.f16894G, this.f16904E, this.f16905F));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f16907a;

        /* renamed from: b, reason: collision with root package name */
        private int f16908b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16909c = true;

        d() {
        }

        private boolean o(@N View view, @N RecyclerView recyclerView) {
            RecyclerView.F t02 = recyclerView.t0(view);
            boolean z3 = false;
            if (!(t02 instanceof p) || !((p) t02).U()) {
                return false;
            }
            boolean z4 = this.f16909c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                RecyclerView.F t03 = recyclerView.t0(recyclerView.getChildAt(indexOfChild + 1));
                if ((t03 instanceof p) && ((p) t03).T()) {
                    z3 = true;
                }
                return z3;
            }
            return z4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(@N Rect rect, @N View view, @N RecyclerView recyclerView, @N RecyclerView.C c4) {
            if (o(view, recyclerView)) {
                rect.bottom = this.f16908b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void k(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.C c4) {
            if (this.f16907a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                if (o(childAt, recyclerView)) {
                    int y3 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f16907a.setBounds(0, y3, width, this.f16908b + y3);
                    this.f16907a.draw(canvas);
                }
            }
        }

        public void l(boolean z3) {
            this.f16909c = z3;
        }

        public void m(@P Drawable drawable) {
            if (drawable != null) {
                this.f16908b = drawable.getIntrinsicHeight();
            } else {
                this.f16908b = 0;
            }
            this.f16907a = drawable;
            i.this.f16894G.K0();
        }

        public void n(int i4) {
            this.f16908b = i4;
            i.this.f16894G.K0();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(@N i iVar, @N Preference preference);
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a(@N i iVar, @N Preference preference);
    }

    /* loaded from: classes.dex */
    public interface g {
        boolean a(@N i iVar, @N PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes.dex */
    private static class h extends RecyclerView.i {

        /* renamed from: a, reason: collision with root package name */
        private final RecyclerView.Adapter<?> f16911a;

        /* renamed from: b, reason: collision with root package name */
        private final RecyclerView f16912b;

        /* renamed from: c, reason: collision with root package name */
        private final Preference f16913c;

        /* renamed from: d, reason: collision with root package name */
        private final String f16914d;

        h(@N RecyclerView.Adapter<?> adapter, @N RecyclerView recyclerView, Preference preference, String str) {
            this.f16911a = adapter;
            this.f16912b = recyclerView;
            this.f16913c = preference;
            this.f16914d = str;
        }

        private void h() {
            int g4;
            this.f16911a.N(this);
            Preference preference = this.f16913c;
            if (preference != null) {
                g4 = ((PreferenceGroup.c) this.f16911a).e(preference);
            } else {
                g4 = ((PreferenceGroup.c) this.f16911a).g(this.f16914d);
            }
            if (g4 != -1) {
                this.f16912b.G1(g4);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void b(int i4, int i5) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i4, int i5, Object obj) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i4, int i5) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i4, int i5, int i6) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i4, int i5) {
            h();
        }
    }

    private void m() {
        if (this.f16900M.hasMessages(1)) {
            return;
        }
        this.f16900M.obtainMessage(1).sendToTarget();
    }

    private void n() {
        if (this.f16893F != null) {
        } else {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void q(Preference preference, String str) {
        c cVar = new c(preference, str);
        if (this.f16894G == null) {
            this.f16899L = cVar;
        } else {
            cVar.run();
        }
    }

    private void v() {
        PreferenceScreen f4 = f();
        if (f4 != null) {
            f4.g0();
        }
        l();
    }

    @Deprecated
    public void a(@k0 int i4) {
        n();
        t(this.f16893F.r(this.f16897J, i4, f()));
    }

    void b() {
        PreferenceScreen f4 = f();
        if (f4 != null) {
            d().setAdapter(h(f4));
            f4.a0();
        }
        g();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Fragment c() {
        return null;
    }

    @Deprecated
    public final RecyclerView d() {
        return this.f16894G;
    }

    @Deprecated
    public n e() {
        return this.f16893F;
    }

    @Deprecated
    public PreferenceScreen f() {
        return this.f16893F.n();
    }

    @Override // androidx.preference.DialogPreference.a
    @Deprecated
    public <T extends Preference> T findPreference(@N CharSequence charSequence) {
        n nVar = this.f16893F;
        if (nVar == null) {
            return null;
        }
        return (T) nVar.b(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected void g() {
    }

    @N
    @Deprecated
    protected RecyclerView.Adapter h(@N PreferenceScreen preferenceScreen) {
        return new j(preferenceScreen);
    }

    @N
    @Deprecated
    public RecyclerView.o i() {
        return new LinearLayoutManager(getActivity());
    }

    @Deprecated
    public abstract void j(@P Bundle bundle, String str);

    @N
    @Deprecated
    public RecyclerView k(@N LayoutInflater layoutInflater, @N ViewGroup viewGroup, @P Bundle bundle) {
        RecyclerView recyclerView;
        if (this.f16897J.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(q.f.f17048e)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(q.h.f17067m, viewGroup, false);
        recyclerView2.setLayoutManager(i());
        recyclerView2.setAccessibilityDelegateCompat(new o(recyclerView2));
        return recyclerView2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected void l() {
    }

    @Deprecated
    public void o(@N Preference preference) {
        q(preference, null);
    }

    @Override // android.app.Fragment
    public void onCreate(@P Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(q.a.f16988R, typedValue, true);
        int i4 = typedValue.resourceId;
        if (i4 == 0) {
            i4 = q.j.f17094i;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i4);
        this.f16897J = contextThemeWrapper;
        n nVar = new n(contextThemeWrapper);
        this.f16893F = nVar;
        nVar.y(this);
        if (getArguments() != null) {
            str = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        j(bundle, str);
    }

    @Override // android.app.Fragment
    @N
    public View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        Context context = this.f16897J;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, q.k.f17238v0, androidx.core.content.res.n.a(context, q.a.f16984N, R.attr.preferenceFragmentStyle), 0);
        this.f16898K = obtainStyledAttributes.getResourceId(q.k.f17241w0, this.f16898K);
        Drawable drawable = obtainStyledAttributes.getDrawable(q.k.f17244x0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(q.k.f17247y0, -1);
        boolean z3 = obtainStyledAttributes.getBoolean(q.k.f17250z0, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.f16897J);
        View inflate = cloneInContext.inflate(this.f16898K, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.list_container);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView k4 = k(cloneInContext, viewGroup2, bundle);
            if (k4 != null) {
                this.f16894G = k4;
                k4.n(this.f16892E);
                r(drawable);
                if (dimensionPixelSize != -1) {
                    s(dimensionPixelSize);
                }
                this.f16892E.l(z3);
                if (this.f16894G.getParent() == null) {
                    viewGroup2.addView(this.f16894G);
                }
                this.f16900M.post(this.f16901N);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f16900M.removeCallbacks(this.f16901N);
        this.f16900M.removeMessages(1);
        if (this.f16895H) {
            v();
        }
        this.f16894G = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.n.a
    @Deprecated
    public void onDisplayPreferenceDialog(@N Preference preference) {
        boolean z3;
        DialogFragment i4;
        if (c() instanceof e) {
            z3 = ((e) c()).a(this, preference);
        } else {
            z3 = false;
        }
        if (!z3 && (getActivity() instanceof e)) {
            z3 = ((e) getActivity()).a(this, preference);
        }
        if (z3 || getFragmentManager().findFragmentByTag(f16890Q) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            i4 = androidx.preference.b.i(preference.u());
        } else if (preference instanceof ListPreference) {
            i4 = androidx.preference.d.i(preference.u());
        } else if (preference instanceof MultiSelectListPreference) {
            i4 = androidx.preference.e.i(preference.u());
        } else {
            throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
        }
        i4.setTargetFragment(this, 0);
        i4.show(getFragmentManager(), f16890Q);
    }

    @Override // androidx.preference.n.b
    @Deprecated
    public void onNavigateToScreen(@N PreferenceScreen preferenceScreen) {
        if ((!(c() instanceof g) || !((g) c()).a(this, preferenceScreen)) && (getActivity() instanceof g)) {
            ((g) getActivity()).a(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.n.c
    @Deprecated
    public boolean onPreferenceTreeClick(@N Preference preference) {
        boolean z3 = false;
        if (preference.q() == null) {
            return false;
        }
        if (c() instanceof f) {
            z3 = ((f) c()).a(this, preference);
        }
        if (!z3 && (getActivity() instanceof f)) {
            return ((f) getActivity()).a(this, preference);
        }
        return z3;
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen f4 = f();
        if (f4 != null) {
            Bundle bundle2 = new Bundle();
            f4.C0(bundle2);
            bundle.putBundle(f16889P, bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f16893F.z(this);
        this.f16893F.x(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f16893F.z(null);
        this.f16893F.x(null);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@N View view, @P Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen f4;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(f16889P)) != null && (f4 = f()) != null) {
            f4.B0(bundle2);
        }
        if (this.f16895H) {
            b();
            Runnable runnable = this.f16899L;
            if (runnable != null) {
                runnable.run();
                this.f16899L = null;
            }
        }
        this.f16896I = true;
    }

    @Deprecated
    public void p(@N String str) {
        q(null, str);
    }

    @Deprecated
    public void r(@P Drawable drawable) {
        this.f16892E.m(drawable);
    }

    @Deprecated
    public void s(int i4) {
        this.f16892E.n(i4);
    }

    @Deprecated
    public void t(PreferenceScreen preferenceScreen) {
        if (this.f16893F.C(preferenceScreen) && preferenceScreen != null) {
            l();
            this.f16895H = true;
            if (this.f16896I) {
                m();
            }
        }
    }

    @Deprecated
    public void u(@k0 int i4, @P String str) {
        n();
        PreferenceScreen r4 = this.f16893F.r(this.f16897J, i4, null);
        Object obj = r4;
        if (str != null) {
            Object o12 = r4.o1(str);
            boolean z3 = o12 instanceof PreferenceScreen;
            obj = o12;
            if (!z3) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        t((PreferenceScreen) obj);
    }
}
