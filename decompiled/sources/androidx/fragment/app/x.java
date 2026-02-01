package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;

@Deprecated
/* loaded from: classes.dex */
public abstract class x extends androidx.viewpager.widget.a {

    /* renamed from: j, reason: collision with root package name */
    private static final String f15373j = "FragmentPagerAdapter";

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f15374k = false;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f15375l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f15376m = 1;

    /* renamed from: e, reason: collision with root package name */
    private final FragmentManager f15377e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15378f;

    /* renamed from: g, reason: collision with root package name */
    private F f15379g;

    /* renamed from: h, reason: collision with root package name */
    private Fragment f15380h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15381i;

    @Deprecated
    public x(@androidx.annotation.N FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String x(int i4, long j4) {
        return "android:switcher:" + i4 + ":" + j4;
    }

    @Override // androidx.viewpager.widget.a
    public void b(@androidx.annotation.N ViewGroup viewGroup, int i4, @androidx.annotation.N Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f15379g == null) {
            this.f15379g = this.f15377e.q();
        }
        this.f15379g.v(fragment);
        if (fragment.equals(this.f15380h)) {
            this.f15380h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void d(@androidx.annotation.N ViewGroup viewGroup) {
        F f4 = this.f15379g;
        if (f4 != null) {
            if (!this.f15381i) {
                try {
                    this.f15381i = true;
                    f4.t();
                } finally {
                    this.f15381i = false;
                }
            }
            this.f15379g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.N
    public Object j(@androidx.annotation.N ViewGroup viewGroup, int i4) {
        if (this.f15379g == null) {
            this.f15379g = this.f15377e.q();
        }
        long w3 = w(i4);
        Fragment o02 = this.f15377e.o0(x(viewGroup.getId(), w3));
        if (o02 != null) {
            this.f15379g.p(o02);
        } else {
            o02 = v(i4);
            this.f15379g.g(viewGroup.getId(), o02, x(viewGroup.getId(), w3));
        }
        if (o02 != this.f15380h) {
            o02.setMenuVisibility(false);
            if (this.f15378f == 1) {
                this.f15379g.O(o02, Lifecycle.State.STARTED);
            } else {
                o02.setUserVisibleHint(false);
            }
        }
        return o02;
    }

    @Override // androidx.viewpager.widget.a
    public boolean k(@androidx.annotation.N View view, @androidx.annotation.N Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.a
    public void n(@androidx.annotation.P Parcelable parcelable, @androidx.annotation.P ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.P
    public Parcelable o() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void q(@androidx.annotation.N ViewGroup viewGroup, int i4, @androidx.annotation.N Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f15380h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f15378f == 1) {
                    if (this.f15379g == null) {
                        this.f15379g = this.f15377e.q();
                    }
                    this.f15379g.O(this.f15380h, Lifecycle.State.STARTED);
                } else {
                    this.f15380h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f15378f == 1) {
                if (this.f15379g == null) {
                    this.f15379g = this.f15377e.q();
                }
                this.f15379g.O(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f15380h = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void t(@androidx.annotation.N ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @androidx.annotation.N
    public abstract Fragment v(int i4);

    public long w(int i4) {
        return i4;
    }

    public x(@androidx.annotation.N FragmentManager fragmentManager, int i4) {
        this.f15379g = null;
        this.f15380h = null;
        this.f15377e = fragmentManager;
        this.f15378f = i4;
    }
}
