package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.collection.h;
import androidx.core.util.u;
import androidx.core.view.C0823k0;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.A;
import androidx.lifecycle.E;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<androidx.viewpager2.adapter.a> implements androidx.viewpager2.adapter.b {

    /* renamed from: l, reason: collision with root package name */
    private static final String f20605l = "f#";

    /* renamed from: m, reason: collision with root package name */
    private static final String f20606m = "s#";

    /* renamed from: n, reason: collision with root package name */
    private static final long f20607n = 10000;

    /* renamed from: d, reason: collision with root package name */
    final Lifecycle f20608d;

    /* renamed from: e, reason: collision with root package name */
    final FragmentManager f20609e;

    /* renamed from: f, reason: collision with root package name */
    final h<Fragment> f20610f;

    /* renamed from: g, reason: collision with root package name */
    private final h<Fragment.l> f20611g;

    /* renamed from: h, reason: collision with root package name */
    private final h<Integer> f20612h;

    /* renamed from: i, reason: collision with root package name */
    private FragmentMaxLifecycleEnforcer f20613i;

    /* renamed from: j, reason: collision with root package name */
    boolean f20614j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20615k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a, reason: collision with root package name */
        private ViewPager2.j f20621a;

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.i f20622b;

        /* renamed from: c, reason: collision with root package name */
        private A f20623c;

        /* renamed from: d, reason: collision with root package name */
        private ViewPager2 f20624d;

        /* renamed from: e, reason: collision with root package name */
        private long f20625e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ViewPager2.j {
            a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void a(int i4) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void c(int i4) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends d {
            b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.i
            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        @N
        private ViewPager2 a(@N RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(@N RecyclerView recyclerView) {
            this.f20624d = a(recyclerView);
            a aVar = new a();
            this.f20621a = aVar;
            this.f20624d.n(aVar);
            b bVar = new b();
            this.f20622b = bVar;
            FragmentStateAdapter.this.K(bVar);
            A a4 = new A() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.A
                public void f(@N E e4, @N Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f20623c = a4;
            FragmentStateAdapter.this.f20608d.a(a4);
        }

        void c(@N RecyclerView recyclerView) {
            a(recyclerView).x(this.f20621a);
            FragmentStateAdapter.this.N(this.f20622b);
            FragmentStateAdapter.this.f20608d.d(this.f20623c);
            this.f20624d = null;
        }

        void d(boolean z3) {
            int currentItem;
            Fragment i4;
            boolean z4;
            if (FragmentStateAdapter.this.h0() || this.f20624d.getScrollState() != 0 || FragmentStateAdapter.this.f20610f.n() || FragmentStateAdapter.this.l() == 0 || (currentItem = this.f20624d.getCurrentItem()) >= FragmentStateAdapter.this.l()) {
                return;
            }
            long m4 = FragmentStateAdapter.this.m(currentItem);
            if ((m4 != this.f20625e || z3) && (i4 = FragmentStateAdapter.this.f20610f.i(m4)) != null && i4.isAdded()) {
                this.f20625e = m4;
                F q4 = FragmentStateAdapter.this.f20609e.q();
                Fragment fragment = null;
                for (int i5 = 0; i5 < FragmentStateAdapter.this.f20610f.A(); i5++) {
                    long o4 = FragmentStateAdapter.this.f20610f.o(i5);
                    Fragment B3 = FragmentStateAdapter.this.f20610f.B(i5);
                    if (B3.isAdded()) {
                        if (o4 != this.f20625e) {
                            q4.O(B3, Lifecycle.State.STARTED);
                        } else {
                            fragment = B3;
                        }
                        if (o4 == this.f20625e) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        B3.setMenuVisibility(z4);
                    }
                }
                if (fragment != null) {
                    q4.O(fragment, Lifecycle.State.RESUMED);
                }
                if (!q4.A()) {
                    q4.s();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FrameLayout f20630a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.viewpager2.adapter.a f20631b;

        a(FrameLayout frameLayout, androidx.viewpager2.adapter.a aVar) {
            this.f20630a = frameLayout;
            this.f20631b = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            if (this.f20630a.getParent() != null) {
                this.f20630a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.d0(this.f20631b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends FragmentManager.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f20633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f20634b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f20633a = fragment;
            this.f20634b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public void m(@N FragmentManager fragmentManager, @N Fragment fragment, @N View view, @P Bundle bundle) {
            if (fragment == this.f20633a) {
                fragmentManager.W1(this);
                FragmentStateAdapter.this.O(view, this.f20634b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f20614j = false;
            fragmentStateAdapter.T();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class d extends RecyclerView.i {
        private d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i4, int i5, @P Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i4, int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i4, int i5) {
            a();
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    public FragmentStateAdapter(@N ActivityC0889g activityC0889g) {
        this(activityC0889g.S(), activityC0889g.getLifecycle());
    }

    @N
    private static String R(@N String str, long j4) {
        return str + j4;
    }

    private void S(int i4) {
        long m4 = m(i4);
        if (!this.f20610f.e(m4)) {
            Fragment Q3 = Q(i4);
            Q3.setInitialSavedState(this.f20611g.i(m4));
            this.f20610f.p(m4, Q3);
        }
    }

    private boolean U(long j4) {
        View view;
        if (this.f20612h.e(j4)) {
            return true;
        }
        Fragment i4 = this.f20610f.i(j4);
        if (i4 != null && (view = i4.getView()) != null && view.getParent() != null) {
            return true;
        }
        return false;
    }

    private static boolean V(@N String str, @N String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    private Long W(int i4) {
        Long l4 = null;
        for (int i5 = 0; i5 < this.f20612h.A(); i5++) {
            if (this.f20612h.B(i5).intValue() == i4) {
                if (l4 == null) {
                    l4 = Long.valueOf(this.f20612h.o(i5));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l4;
    }

    private static long c0(@N String str, @N String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void e0(long j4) {
        ViewParent parent;
        Fragment i4 = this.f20610f.i(j4);
        if (i4 == null) {
            return;
        }
        if (i4.getView() != null && (parent = i4.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!P(j4)) {
            this.f20611g.s(j4);
        }
        if (!i4.isAdded()) {
            this.f20610f.s(j4);
            return;
        }
        if (h0()) {
            this.f20615k = true;
            return;
        }
        if (i4.isAdded() && P(j4)) {
            this.f20611g.p(j4, this.f20609e.K1(i4));
        }
        this.f20609e.q().B(i4).s();
        this.f20610f.s(j4);
    }

    private void f0() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f20608d.a(new A() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.A
            public void f(@N E e4, @N Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    e4.getLifecycle().d(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000L);
    }

    private void g0(Fragment fragment, @N FrameLayout frameLayout) {
        this.f20609e.s1(new b(fragment, frameLayout), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @InterfaceC0566i
    public void B(@N RecyclerView recyclerView) {
        boolean z3;
        if (this.f20613i == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        u.a(z3);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f20613i = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @InterfaceC0566i
    public void F(@N RecyclerView recyclerView) {
        this.f20613i.c(recyclerView);
        this.f20613i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void L(boolean z3) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    void O(@N View view, @N FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean P(long j4) {
        if (j4 >= 0 && j4 < l()) {
            return true;
        }
        return false;
    }

    @N
    public abstract Fragment Q(int i4);

    void T() {
        if (this.f20615k && !h0()) {
            androidx.collection.c cVar = new androidx.collection.c();
            for (int i4 = 0; i4 < this.f20610f.A(); i4++) {
                long o4 = this.f20610f.o(i4);
                if (!P(o4)) {
                    cVar.add(Long.valueOf(o4));
                    this.f20612h.s(o4);
                }
            }
            if (!this.f20614j) {
                this.f20615k = false;
                for (int i5 = 0; i5 < this.f20610f.A(); i5++) {
                    long o5 = this.f20610f.o(i5);
                    if (!U(o5)) {
                        cVar.add(Long.valueOf(o5));
                    }
                }
            }
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                e0(((Long) it.next()).longValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void C(@N androidx.viewpager2.adapter.a aVar, int i4) {
        long n4 = aVar.n();
        int id = aVar.S().getId();
        Long W3 = W(id);
        if (W3 != null && W3.longValue() != n4) {
            e0(W3.longValue());
            this.f20612h.s(W3.longValue());
        }
        this.f20612h.p(n4, Integer.valueOf(id));
        S(i4);
        FrameLayout S3 = aVar.S();
        if (C0823k0.O0(S3)) {
            if (S3.getParent() == null) {
                S3.addOnLayoutChangeListener(new a(S3, aVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        T();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final androidx.viewpager2.adapter.a E(@N ViewGroup viewGroup, int i4) {
        return androidx.viewpager2.adapter.a.R(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final boolean G(@N androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.viewpager2.adapter.b
    @N
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f20610f.A() + this.f20611g.A());
        for (int i4 = 0; i4 < this.f20610f.A(); i4++) {
            long o4 = this.f20610f.o(i4);
            Fragment i5 = this.f20610f.i(o4);
            if (i5 != null && i5.isAdded()) {
                this.f20609e.r1(bundle, R(f20605l, o4), i5);
            }
        }
        for (int i6 = 0; i6 < this.f20611g.A(); i6++) {
            long o5 = this.f20611g.o(i6);
            if (P(o5)) {
                bundle.putParcelable(R(f20606m, o5), this.f20611g.i(o5));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final void H(@N androidx.viewpager2.adapter.a aVar) {
        d0(aVar);
        T();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final void J(@N androidx.viewpager2.adapter.a aVar) {
        Long W3 = W(aVar.S().getId());
        if (W3 != null) {
            e0(W3.longValue());
            this.f20612h.s(W3.longValue());
        }
    }

    @Override // androidx.viewpager2.adapter.b
    public final void c(@N Parcelable parcelable) {
        if (this.f20611g.n() && this.f20610f.n()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (V(str, f20605l)) {
                    this.f20610f.p(c0(str, f20605l), this.f20609e.A0(bundle, str));
                } else if (V(str, f20606m)) {
                    long c02 = c0(str, f20606m);
                    Fragment.l lVar = (Fragment.l) bundle.getParcelable(str);
                    if (P(c02)) {
                        this.f20611g.p(c02, lVar);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (!this.f20610f.n()) {
                this.f20615k = true;
                this.f20614j = true;
                T();
                f0();
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    void d0(@N final androidx.viewpager2.adapter.a aVar) {
        Fragment i4 = this.f20610f.i(aVar.n());
        if (i4 != null) {
            FrameLayout S3 = aVar.S();
            View view = i4.getView();
            if (!i4.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (i4.isAdded() && view == null) {
                g0(i4, S3);
                return;
            }
            if (i4.isAdded() && view.getParent() != null) {
                if (view.getParent() != S3) {
                    O(view, S3);
                    return;
                }
                return;
            }
            if (i4.isAdded()) {
                O(view, S3);
                return;
            }
            if (!h0()) {
                g0(i4, S3);
                this.f20609e.q().k(i4, "f" + aVar.n()).O(i4, Lifecycle.State.STARTED).s();
                this.f20613i.d(false);
                return;
            }
            if (this.f20609e.R0()) {
                return;
            }
            this.f20608d.a(new A() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.A
                public void f(@N E e4, @N Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.h0()) {
                        return;
                    }
                    e4.getLifecycle().d(this);
                    if (C0823k0.O0(aVar.S())) {
                        FragmentStateAdapter.this.d0(aVar);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    boolean h0() {
        return this.f20609e.Y0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long m(int i4) {
        return i4;
    }

    public FragmentStateAdapter(@N Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@N FragmentManager fragmentManager, @N Lifecycle lifecycle) {
        this.f20610f = new h<>();
        this.f20611g = new h<>();
        this.f20612h = new h<>();
        this.f20614j = false;
        this.f20615k = false;
        this.f20609e = fragmentManager;
        this.f20608d = lifecycle;
        super.L(true);
    }
}
