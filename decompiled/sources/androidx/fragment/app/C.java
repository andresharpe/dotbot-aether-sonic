package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public abstract class C extends androidx.viewpager.widget.a {

    /* renamed from: l, reason: collision with root package name */
    private static final String f14872l = "FragmentStatePagerAdapt";

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f14873m = false;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f14874n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f14875o = 1;

    /* renamed from: e, reason: collision with root package name */
    private final FragmentManager f14876e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14877f;

    /* renamed from: g, reason: collision with root package name */
    private F f14878g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<Fragment.l> f14879h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<Fragment> f14880i;

    /* renamed from: j, reason: collision with root package name */
    private Fragment f14881j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14882k;

    @Deprecated
    public C(@androidx.annotation.N FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.a
    public void b(@androidx.annotation.N ViewGroup viewGroup, int i4, @androidx.annotation.N Object obj) {
        Fragment.l lVar;
        Fragment fragment = (Fragment) obj;
        if (this.f14878g == null) {
            this.f14878g = this.f14876e.q();
        }
        while (this.f14879h.size() <= i4) {
            this.f14879h.add(null);
        }
        ArrayList<Fragment.l> arrayList = this.f14879h;
        if (fragment.isAdded()) {
            lVar = this.f14876e.K1(fragment);
        } else {
            lVar = null;
        }
        arrayList.set(i4, lVar);
        this.f14880i.set(i4, null);
        this.f14878g.B(fragment);
        if (fragment.equals(this.f14881j)) {
            this.f14881j = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void d(@androidx.annotation.N ViewGroup viewGroup) {
        F f4 = this.f14878g;
        if (f4 != null) {
            if (!this.f14882k) {
                try {
                    this.f14882k = true;
                    f4.t();
                } finally {
                    this.f14882k = false;
                }
            }
            this.f14878g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.N
    public Object j(@androidx.annotation.N ViewGroup viewGroup, int i4) {
        Fragment.l lVar;
        Fragment fragment;
        if (this.f14880i.size() > i4 && (fragment = this.f14880i.get(i4)) != null) {
            return fragment;
        }
        if (this.f14878g == null) {
            this.f14878g = this.f14876e.q();
        }
        Fragment v3 = v(i4);
        if (this.f14879h.size() > i4 && (lVar = this.f14879h.get(i4)) != null) {
            v3.setInitialSavedState(lVar);
        }
        while (this.f14880i.size() <= i4) {
            this.f14880i.add(null);
        }
        v3.setMenuVisibility(false);
        if (this.f14877f == 0) {
            v3.setUserVisibleHint(false);
        }
        this.f14880i.set(i4, v3);
        this.f14878g.f(viewGroup.getId(), v3);
        if (this.f14877f == 1) {
            this.f14878g.O(v3, Lifecycle.State.STARTED);
        }
        return v3;
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
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f14879h.clear();
            this.f14880i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f14879h.add((Fragment.l) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment A02 = this.f14876e.A0(bundle, str);
                    if (A02 != null) {
                        while (this.f14880i.size() <= parseInt) {
                            this.f14880i.add(null);
                        }
                        A02.setMenuVisibility(false);
                        this.f14880i.set(parseInt, A02);
                    } else {
                        Log.w(f14872l, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.P
    public Parcelable o() {
        Bundle bundle;
        if (this.f14879h.size() > 0) {
            bundle = new Bundle();
            Fragment.l[] lVarArr = new Fragment.l[this.f14879h.size()];
            this.f14879h.toArray(lVarArr);
            bundle.putParcelableArray("states", lVarArr);
        } else {
            bundle = null;
        }
        for (int i4 = 0; i4 < this.f14880i.size(); i4++) {
            Fragment fragment = this.f14880i.get(i4);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f14876e.r1(bundle, "f" + i4, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void q(@androidx.annotation.N ViewGroup viewGroup, int i4, @androidx.annotation.N Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f14881j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f14877f == 1) {
                    if (this.f14878g == null) {
                        this.f14878g = this.f14876e.q();
                    }
                    this.f14878g.O(this.f14881j, Lifecycle.State.STARTED);
                } else {
                    this.f14881j.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f14877f == 1) {
                if (this.f14878g == null) {
                    this.f14878g = this.f14876e.q();
                }
                this.f14878g.O(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f14881j = fragment;
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

    public C(@androidx.annotation.N FragmentManager fragmentManager, int i4) {
        this.f14878g = null;
        this.f14879h = new ArrayList<>();
        this.f14880i = new ArrayList<>();
        this.f14881j = null;
        this.f14876e = fragmentManager;
        this.f14877f = i4;
    }
}
