package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.k0;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.n;
import androidx.preference.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements n.c, n.a, n.b, DialogPreference.a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* renamed from: W0, reason: collision with root package name */
    private static final String f16775W0 = "PreferenceFragment";

    /* renamed from: X0, reason: collision with root package name */
    private static final String f16776X0 = "android:preferences";

    /* renamed from: Y0, reason: collision with root package name */
    private static final String f16777Y0 = "androidx.preference.PreferenceFragment.DIALOG";

    /* renamed from: Z0, reason: collision with root package name */
    private static final int f16778Z0 = 1;

    /* renamed from: O0, reason: collision with root package name */
    private n f16780O0;

    /* renamed from: P0, reason: collision with root package name */
    RecyclerView f16781P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f16782Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f16783R0;

    /* renamed from: T0, reason: collision with root package name */
    private Runnable f16785T0;

    /* renamed from: N0, reason: collision with root package name */
    private final d f16779N0 = new d();

    /* renamed from: S0, reason: collision with root package name */
    private int f16784S0 = q.h.f17065k;

    /* renamed from: U0, reason: collision with root package name */
    private final Handler f16786U0 = new a(Looper.getMainLooper());

    /* renamed from: V0, reason: collision with root package name */
    private final Runnable f16787V0 = new b();

    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                PreferenceFragmentCompat.this.k0();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.f16781P0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Preference f16790E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f16791F;

        c(Preference preference, String str) {
            this.f16790E = preference;
            this.f16791F = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            int g4;
            RecyclerView.Adapter adapter = PreferenceFragmentCompat.this.f16781P0.getAdapter();
            if (!(adapter instanceof PreferenceGroup.c)) {
                if (adapter == 0) {
                    return;
                } else {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
            }
            Preference preference = this.f16790E;
            if (preference != null) {
                g4 = ((PreferenceGroup.c) adapter).e(preference);
            } else {
                g4 = ((PreferenceGroup.c) adapter).g(this.f16791F);
            }
            if (g4 != -1) {
                PreferenceFragmentCompat.this.f16781P0.G1(g4);
            } else {
                adapter.K(new h(adapter, PreferenceFragmentCompat.this.f16781P0, this.f16790E, this.f16791F));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f16793a;

        /* renamed from: b, reason: collision with root package name */
        private int f16794b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16795c = true;

        d() {
        }

        private boolean o(View view, RecyclerView recyclerView) {
            RecyclerView.F t02 = recyclerView.t0(view);
            boolean z3 = false;
            if (!(t02 instanceof p) || !((p) t02).U()) {
                return false;
            }
            boolean z4 = this.f16795c;
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
                rect.bottom = this.f16794b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void k(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.C c4) {
            if (this.f16793a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                if (o(childAt, recyclerView)) {
                    int y3 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f16793a.setBounds(0, y3, width, this.f16794b + y3);
                    this.f16793a.draw(canvas);
                }
            }
        }

        public void l(boolean z3) {
            this.f16795c = z3;
        }

        public void m(Drawable drawable) {
            if (drawable != null) {
                this.f16794b = drawable.getIntrinsicHeight();
            } else {
                this.f16794b = 0;
            }
            this.f16793a = drawable;
            PreferenceFragmentCompat.this.f16781P0.K0();
        }

        public void n(int i4) {
            this.f16794b = i4;
            PreferenceFragmentCompat.this.f16781P0.K0();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(@N PreferenceFragmentCompat preferenceFragmentCompat, @N Preference preference);
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onPreferenceStartFragment(@N PreferenceFragmentCompat preferenceFragmentCompat, @N Preference preference);
    }

    /* loaded from: classes.dex */
    public interface g {
        boolean a(@N PreferenceFragmentCompat preferenceFragmentCompat, @N PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes.dex */
    private static class h extends RecyclerView.i {

        /* renamed from: a, reason: collision with root package name */
        private final RecyclerView.Adapter<?> f16797a;

        /* renamed from: b, reason: collision with root package name */
        private final RecyclerView f16798b;

        /* renamed from: c, reason: collision with root package name */
        private final Preference f16799c;

        /* renamed from: d, reason: collision with root package name */
        private final String f16800d;

        h(RecyclerView.Adapter<?> adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f16797a = adapter;
            this.f16798b = recyclerView;
            this.f16799c = preference;
            this.f16800d = str;
        }

        private void h() {
            int g4;
            this.f16797a.N(this);
            Preference preference = this.f16799c;
            if (preference != null) {
                g4 = ((PreferenceGroup.c) this.f16797a).e(preference);
            } else {
                g4 = ((PreferenceGroup.c) this.f16797a).g(this.f16800d);
            }
            if (g4 != -1) {
                this.f16798b.G1(g4);
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

    private void o0() {
        if (this.f16786U0.hasMessages(1)) {
            return;
        }
        this.f16786U0.obtainMessage(1).sendToTarget();
    }

    private void p0() {
        if (this.f16780O0 != null) {
        } else {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void q0(@P Preference preference, @P String str) {
        c cVar = new c(preference, str);
        if (this.f16781P0 == null) {
            this.f16785T0 = cVar;
        } else {
            cVar.run();
        }
    }

    private void r0() {
        getListView().setAdapter(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.g0();
        }
        n0();
    }

    public void addPreferencesFromResource(@k0 int i4) {
        p0();
        setPreferenceScreen(this.f16780O0.r(requireContext(), i4, getPreferenceScreen()));
    }

    @Override // androidx.preference.DialogPreference.a
    @P
    public <T extends Preference> T findPreference(@N CharSequence charSequence) {
        n nVar = this.f16780O0;
        if (nVar == null) {
            return null;
        }
        return (T) nVar.b(charSequence);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.f16781P0;
    }

    public n getPreferenceManager() {
        return this.f16780O0;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.f16780O0.n();
    }

    void k0() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(m0(preferenceScreen));
            preferenceScreen.a0();
        }
        l0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void l0() {
    }

    @N
    protected RecyclerView.Adapter m0(@N PreferenceScreen preferenceScreen) {
        return new j(preferenceScreen);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void n0() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(q.a.f16988R, typedValue, true);
        int i4 = typedValue.resourceId;
        if (i4 == 0) {
            i4 = q.j.f17094i;
        }
        requireContext().getTheme().applyStyle(i4, false);
        n nVar = new n(requireContext());
        this.f16780O0 = nVar;
        nVar.y(this);
        if (getArguments() != null) {
            str = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        onCreatePreferences(bundle, str);
    }

    @N
    public RecyclerView.o onCreateLayoutManager() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void onCreatePreferences(@P Bundle bundle, @P String str);

    @N
    public RecyclerView onCreateRecyclerView(@N LayoutInflater layoutInflater, @N ViewGroup viewGroup, @P Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(q.f.f17048e)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(q.h.f17067m, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new o(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, q.k.f17113A0, q.a.f16982L, 0);
        this.f16784S0 = obtainStyledAttributes.getResourceId(q.k.f17116B0, this.f16784S0);
        Drawable drawable = obtainStyledAttributes.getDrawable(q.k.f17119C0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(q.k.f17122D0, -1);
        boolean z3 = obtainStyledAttributes.getBoolean(q.k.f17125E0, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.f16784S0, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.list_container);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
            if (onCreateRecyclerView != null) {
                this.f16781P0 = onCreateRecyclerView;
                onCreateRecyclerView.n(this.f16779N0);
                setDivider(drawable);
                if (dimensionPixelSize != -1) {
                    setDividerHeight(dimensionPixelSize);
                }
                this.f16779N0.l(z3);
                if (this.f16781P0.getParent() == null) {
                    viewGroup2.addView(this.f16781P0);
                }
                this.f16786U0.post(this.f16787V0);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f16786U0.removeCallbacks(this.f16787V0);
        this.f16786U0.removeMessages(1);
        if (this.f16782Q0) {
            r0();
        }
        this.f16781P0 = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.n.a
    public void onDisplayPreferenceDialog(@N Preference preference) {
        boolean z3;
        DialogFragment newInstance;
        if (getCallbackFragment() instanceof e) {
            z3 = ((e) getCallbackFragment()).a(this, preference);
        } else {
            z3 = false;
        }
        for (Fragment fragment = this; !z3 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof e) {
                z3 = ((e) fragment).a(this, preference);
            }
        }
        if (!z3 && (getContext() instanceof e)) {
            z3 = ((e) getContext()).a(this, preference);
        }
        if (!z3 && (getActivity() instanceof e)) {
            z3 = ((e) getActivity()).a(this, preference);
        }
        if (z3 || getParentFragmentManager().o0(f16777Y0) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            newInstance = EditTextPreferenceDialogFragmentCompat.newInstance(preference.u());
        } else if (preference instanceof ListPreference) {
            newInstance = ListPreferenceDialogFragmentCompat.newInstance(preference.u());
        } else if (preference instanceof MultiSelectListPreference) {
            newInstance = MultiSelectListPreferenceDialogFragmentCompat.newInstance(preference.u());
        } else {
            throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        }
        newInstance.setTargetFragment(this, 0);
        newInstance.show(getParentFragmentManager(), f16777Y0);
    }

    @Override // androidx.preference.n.b
    public void onNavigateToScreen(@N PreferenceScreen preferenceScreen) {
        boolean z3;
        if (getCallbackFragment() instanceof g) {
            z3 = ((g) getCallbackFragment()).a(this, preferenceScreen);
        } else {
            z3 = false;
        }
        for (Fragment fragment = this; !z3 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof g) {
                z3 = ((g) fragment).a(this, preferenceScreen);
            }
        }
        if (!z3 && (getContext() instanceof g)) {
            z3 = ((g) getContext()).a(this, preferenceScreen);
        }
        if (!z3 && (getActivity() instanceof g)) {
            ((g) getActivity()).a(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.n.c
    public boolean onPreferenceTreeClick(@N Preference preference) {
        boolean z3;
        if (preference.q() == null) {
            return false;
        }
        if (getCallbackFragment() instanceof f) {
            z3 = ((f) getCallbackFragment()).onPreferenceStartFragment(this, preference);
        } else {
            z3 = false;
        }
        for (Fragment fragment = this; !z3 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof f) {
                z3 = ((f) fragment).onPreferenceStartFragment(this, preference);
            }
        }
        if (!z3 && (getContext() instanceof f)) {
            z3 = ((f) getContext()).onPreferenceStartFragment(this, preference);
        }
        if (!z3 && (getActivity() instanceof f)) {
            z3 = ((f) getActivity()).onPreferenceStartFragment(this, preference);
        }
        if (!z3) {
            Log.w(f16775W0, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Bundle o4 = preference.o();
            Fragment a4 = parentFragmentManager.C0().a(requireActivity().getClassLoader(), preference.q());
            a4.setArguments(o4);
            a4.setTargetFragment(this, 0);
            parentFragmentManager.q().C(((View) requireView().getParent()).getId(), a4).o(null).q();
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.C0(bundle2);
            bundle.putBundle(f16776X0, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f16780O0.z(this);
        this.f16780O0.x(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f16780O0.z(null);
        this.f16780O0.x(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@N View view, @P Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(f16776X0)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.B0(bundle2);
        }
        if (this.f16782Q0) {
            k0();
            Runnable runnable = this.f16785T0;
            if (runnable != null) {
                runnable.run();
                this.f16785T0 = null;
            }
        }
        this.f16783R0 = true;
    }

    public void scrollToPreference(@N String str) {
        q0(null, str);
    }

    public void setDivider(@P Drawable drawable) {
        this.f16779N0.m(drawable);
    }

    public void setDividerHeight(int i4) {
        this.f16779N0.n(i4);
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (this.f16780O0.C(preferenceScreen) && preferenceScreen != null) {
            n0();
            this.f16782Q0 = true;
            if (this.f16783R0) {
                o0();
            }
        }
    }

    public void setPreferencesFromResource(@k0 int i4, @P String str) {
        p0();
        PreferenceScreen r4 = this.f16780O0.r(requireContext(), i4, null);
        Object obj = r4;
        if (str != null) {
            Object o12 = r4.o1(str);
            boolean z3 = o12 instanceof PreferenceScreen;
            obj = o12;
            if (!z3) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        setPreferenceScreen((PreferenceScreen) obj);
    }

    public void scrollToPreference(@N Preference preference) {
        q0(preference, null);
    }
}
