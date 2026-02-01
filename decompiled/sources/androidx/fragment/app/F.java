package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0558a;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.core.view.C0823k0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: A, reason: collision with root package name */
    static final int f14931A = 7;

    /* renamed from: B, reason: collision with root package name */
    static final int f14932B = 8;

    /* renamed from: C, reason: collision with root package name */
    static final int f14933C = 9;

    /* renamed from: D, reason: collision with root package name */
    static final int f14934D = 10;

    /* renamed from: E, reason: collision with root package name */
    public static final int f14935E = 4096;

    /* renamed from: F, reason: collision with root package name */
    public static final int f14936F = 8192;

    /* renamed from: G, reason: collision with root package name */
    public static final int f14937G = -1;

    /* renamed from: H, reason: collision with root package name */
    public static final int f14938H = 0;

    /* renamed from: I, reason: collision with root package name */
    public static final int f14939I = 4097;

    /* renamed from: J, reason: collision with root package name */
    public static final int f14940J = 8194;

    /* renamed from: K, reason: collision with root package name */
    public static final int f14941K = 4099;

    /* renamed from: L, reason: collision with root package name */
    public static final int f14942L = 4100;

    /* renamed from: M, reason: collision with root package name */
    public static final int f14943M = 8197;

    /* renamed from: t, reason: collision with root package name */
    static final int f14944t = 0;

    /* renamed from: u, reason: collision with root package name */
    static final int f14945u = 1;

    /* renamed from: v, reason: collision with root package name */
    static final int f14946v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f14947w = 3;

    /* renamed from: x, reason: collision with root package name */
    static final int f14948x = 4;

    /* renamed from: y, reason: collision with root package name */
    static final int f14949y = 5;

    /* renamed from: z, reason: collision with root package name */
    static final int f14950z = 6;

    /* renamed from: a, reason: collision with root package name */
    private final C0893k f14951a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f14952b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<a> f14953c;

    /* renamed from: d, reason: collision with root package name */
    int f14954d;

    /* renamed from: e, reason: collision with root package name */
    int f14955e;

    /* renamed from: f, reason: collision with root package name */
    int f14956f;

    /* renamed from: g, reason: collision with root package name */
    int f14957g;

    /* renamed from: h, reason: collision with root package name */
    int f14958h;

    /* renamed from: i, reason: collision with root package name */
    boolean f14959i;

    /* renamed from: j, reason: collision with root package name */
    boolean f14960j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.P
    String f14961k;

    /* renamed from: l, reason: collision with root package name */
    int f14962l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f14963m;

    /* renamed from: n, reason: collision with root package name */
    int f14964n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f14965o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f14966p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<String> f14967q;

    /* renamed from: r, reason: collision with root package name */
    boolean f14968r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f14969s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f14970a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f14971b;

        /* renamed from: c, reason: collision with root package name */
        boolean f14972c;

        /* renamed from: d, reason: collision with root package name */
        int f14973d;

        /* renamed from: e, reason: collision with root package name */
        int f14974e;

        /* renamed from: f, reason: collision with root package name */
        int f14975f;

        /* renamed from: g, reason: collision with root package name */
        int f14976g;

        /* renamed from: h, reason: collision with root package name */
        Lifecycle.State f14977h;

        /* renamed from: i, reason: collision with root package name */
        Lifecycle.State f14978i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i4, Fragment fragment) {
            this.f14970a = i4;
            this.f14971b = fragment;
            this.f14972c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f14977h = state;
            this.f14978i = state;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i4, Fragment fragment, boolean z3) {
            this.f14970a = i4;
            this.f14971b = fragment;
            this.f14972c = z3;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f14977h = state;
            this.f14978i = state;
        }

        a(int i4, @androidx.annotation.N Fragment fragment, Lifecycle.State state) {
            this.f14970a = i4;
            this.f14971b = fragment;
            this.f14972c = false;
            this.f14977h = fragment.f15034u0;
            this.f14978i = state;
        }

        a(a aVar) {
            this.f14970a = aVar.f14970a;
            this.f14971b = aVar.f14971b;
            this.f14972c = aVar.f14972c;
            this.f14973d = aVar.f14973d;
            this.f14974e = aVar.f14974e;
            this.f14975f = aVar.f14975f;
            this.f14976g = aVar.f14976g;
            this.f14977h = aVar.f14977h;
            this.f14978i = aVar.f14978i;
        }
    }

    @Deprecated
    public F() {
        this.f14953c = new ArrayList<>();
        this.f14960j = true;
        this.f14968r = false;
        this.f14951a = null;
        this.f14952b = null;
    }

    @androidx.annotation.N
    private Fragment u(@androidx.annotation.N Class<? extends Fragment> cls, @androidx.annotation.P Bundle bundle) {
        C0893k c0893k = this.f14951a;
        if (c0893k != null) {
            ClassLoader classLoader = this.f14952b;
            if (classLoader != null) {
                Fragment a4 = c0893k.a(classLoader, cls.getName());
                if (bundle != null) {
                    a4.setArguments(bundle);
                }
                return a4;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public boolean A() {
        return this.f14953c.isEmpty();
    }

    @androidx.annotation.N
    public F B(@androidx.annotation.N Fragment fragment) {
        m(new a(3, fragment));
        return this;
    }

    @androidx.annotation.N
    public F C(@androidx.annotation.D int i4, @androidx.annotation.N Fragment fragment) {
        return D(i4, fragment, null);
    }

    @androidx.annotation.N
    public F D(@androidx.annotation.D int i4, @androidx.annotation.N Fragment fragment, @androidx.annotation.P String str) {
        if (i4 != 0) {
            x(i4, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @androidx.annotation.N
    public final F E(@androidx.annotation.D int i4, @androidx.annotation.N Class<? extends Fragment> cls, @androidx.annotation.P Bundle bundle) {
        return F(i4, cls, bundle, null);
    }

    @androidx.annotation.N
    public final F F(@androidx.annotation.D int i4, @androidx.annotation.N Class<? extends Fragment> cls, @androidx.annotation.P Bundle bundle, @androidx.annotation.P String str) {
        return D(i4, u(cls, bundle), str);
    }

    @androidx.annotation.N
    public F G(@androidx.annotation.N Runnable runnable) {
        w();
        if (this.f14969s == null) {
            this.f14969s = new ArrayList<>();
        }
        this.f14969s.add(runnable);
        return this;
    }

    @androidx.annotation.N
    @Deprecated
    public F H(boolean z3) {
        return Q(z3);
    }

    @androidx.annotation.N
    @Deprecated
    public F I(@c0 int i4) {
        this.f14964n = i4;
        this.f14965o = null;
        return this;
    }

    @androidx.annotation.N
    @Deprecated
    public F J(@androidx.annotation.P CharSequence charSequence) {
        this.f14964n = 0;
        this.f14965o = charSequence;
        return this;
    }

    @androidx.annotation.N
    @Deprecated
    public F K(@c0 int i4) {
        this.f14962l = i4;
        this.f14963m = null;
        return this;
    }

    @androidx.annotation.N
    @Deprecated
    public F L(@androidx.annotation.P CharSequence charSequence) {
        this.f14962l = 0;
        this.f14963m = charSequence;
        return this;
    }

    @androidx.annotation.N
    public F M(@InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5) {
        return N(i4, i5, 0, 0);
    }

    @androidx.annotation.N
    public F N(@InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7) {
        this.f14954d = i4;
        this.f14955e = i5;
        this.f14956f = i6;
        this.f14957g = i7;
        return this;
    }

    @androidx.annotation.N
    public F O(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Lifecycle.State state) {
        m(new a(10, fragment, state));
        return this;
    }

    @androidx.annotation.N
    public F P(@androidx.annotation.P Fragment fragment) {
        m(new a(8, fragment));
        return this;
    }

    @androidx.annotation.N
    public F Q(boolean z3) {
        this.f14968r = z3;
        return this;
    }

    @androidx.annotation.N
    public F R(int i4) {
        this.f14958h = i4;
        return this;
    }

    @androidx.annotation.N
    @Deprecated
    public F S(@d0 int i4) {
        return this;
    }

    @androidx.annotation.N
    public F T(@androidx.annotation.N Fragment fragment) {
        m(new a(5, fragment));
        return this;
    }

    @androidx.annotation.N
    public F f(@androidx.annotation.D int i4, @androidx.annotation.N Fragment fragment) {
        x(i4, fragment, null, 1);
        return this;
    }

    @androidx.annotation.N
    public F g(@androidx.annotation.D int i4, @androidx.annotation.N Fragment fragment, @androidx.annotation.P String str) {
        x(i4, fragment, str, 1);
        return this;
    }

    @androidx.annotation.N
    public final F h(@androidx.annotation.D int i4, @androidx.annotation.N Class<? extends Fragment> cls, @androidx.annotation.P Bundle bundle) {
        return f(i4, u(cls, bundle));
    }

    @androidx.annotation.N
    public final F i(@androidx.annotation.D int i4, @androidx.annotation.N Class<? extends Fragment> cls, @androidx.annotation.P Bundle bundle, @androidx.annotation.P String str) {
        return g(i4, u(cls, bundle), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F j(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.N Fragment fragment, @androidx.annotation.P String str) {
        fragment.f15025l0 = viewGroup;
        return g(viewGroup.getId(), fragment, str);
    }

    @androidx.annotation.N
    public F k(@androidx.annotation.N Fragment fragment, @androidx.annotation.P String str) {
        x(0, fragment, str, 1);
        return this;
    }

    @androidx.annotation.N
    public final F l(@androidx.annotation.N Class<? extends Fragment> cls, @androidx.annotation.P Bundle bundle, @androidx.annotation.P String str) {
        return k(u(cls, bundle), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(a aVar) {
        this.f14953c.add(aVar);
        aVar.f14973d = this.f14954d;
        aVar.f14974e = this.f14955e;
        aVar.f14975f = this.f14956f;
        aVar.f14976g = this.f14957g;
    }

    @androidx.annotation.N
    public F n(@androidx.annotation.N View view, @androidx.annotation.N String str) {
        if (H.f()) {
            String x02 = C0823k0.x0(view);
            if (x02 != null) {
                if (this.f14966p == null) {
                    this.f14966p = new ArrayList<>();
                    this.f14967q = new ArrayList<>();
                } else if (!this.f14967q.contains(str)) {
                    if (this.f14966p.contains(x02)) {
                        throw new IllegalArgumentException("A shared element with the source name '" + x02 + "' has already been added to the transaction.");
                    }
                } else {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                this.f14966p.add(x02);
                this.f14967q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @androidx.annotation.N
    public F o(@androidx.annotation.P String str) {
        if (this.f14960j) {
            this.f14959i = true;
            this.f14961k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @androidx.annotation.N
    public F p(@androidx.annotation.N Fragment fragment) {
        m(new a(7, fragment));
        return this;
    }

    public abstract int q();

    public abstract int r();

    public abstract void s();

    public abstract void t();

    @androidx.annotation.N
    public F v(@androidx.annotation.N Fragment fragment) {
        m(new a(6, fragment));
        return this;
    }

    @androidx.annotation.N
    public F w() {
        if (!this.f14959i) {
            this.f14960j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(int i4, Fragment fragment, @androidx.annotation.P String str, int i5) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.i(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.f15017d0;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f15017d0 + " now " + str);
                }
                fragment.f15017d0 = str;
            }
            if (i4 != 0) {
                if (i4 != -1) {
                    int i6 = fragment.f15015b0;
                    if (i6 != 0 && i6 != i4) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f15015b0 + " now " + i4);
                    }
                    fragment.f15015b0 = i4;
                    fragment.f15016c0 = i4;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m(new a(i5, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    @androidx.annotation.N
    public F y(@androidx.annotation.N Fragment fragment) {
        m(new a(4, fragment));
        return this;
    }

    public boolean z() {
        return this.f14960j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(@androidx.annotation.N C0893k c0893k, @androidx.annotation.P ClassLoader classLoader) {
        this.f14953c = new ArrayList<>();
        this.f14960j = true;
        this.f14968r = false;
        this.f14951a = c0893k;
        this.f14952b = classLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(@androidx.annotation.N C0893k c0893k, @androidx.annotation.P ClassLoader classLoader, @androidx.annotation.N F f4) {
        this(c0893k, classLoader);
        Iterator<a> it = f4.f14953c.iterator();
        while (it.hasNext()) {
            this.f14953c.add(new a(it.next()));
        }
        this.f14954d = f4.f14954d;
        this.f14955e = f4.f14955e;
        this.f14956f = f4.f14956f;
        this.f14957g = f4.f14957g;
        this.f14958h = f4.f14958h;
        this.f14959i = f4.f14959i;
        this.f14960j = f4.f14960j;
        this.f14961k = f4.f14961k;
        this.f14964n = f4.f14964n;
        this.f14965o = f4.f14965o;
        this.f14962l = f4.f14962l;
        this.f14963m = f4.f14963m;
        if (f4.f14966p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f14966p = arrayList;
            arrayList.addAll(f4.f14966p);
        }
        if (f4.f14967q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f14967q = arrayList2;
            arrayList2.addAll(f4.f14967q);
        }
        this.f14968r = f4.f14968r;
    }
}
