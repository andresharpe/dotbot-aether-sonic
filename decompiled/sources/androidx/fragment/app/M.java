package androidx.fragment.app;

import A.a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0566i;
import androidx.core.os.C0742e;
import androidx.core.view.C0823k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f15211a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<e> f15212b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<e> f15213c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f15214d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f15215e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ d f15216E;

        a(d dVar) {
            this.f15216E = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (M.this.f15212b.contains(this.f15216E)) {
                this.f15216E.e().b(this.f15216E.f().f15026m0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ d f15218E;

        b(d dVar) {
            this.f15218E = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            M.this.f15212b.remove(this.f15218E);
            M.this.f15213c.remove(this.f15218E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15220a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f15221b;

        static {
            int[] iArr = new int[e.b.values().length];
            f15221b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15221b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15221b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f15220a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15220a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15220a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15220a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.N
        private final B f15222h;

        d(@androidx.annotation.N e.c cVar, @androidx.annotation.N e.b bVar, @androidx.annotation.N B b4, @androidx.annotation.N C0742e c0742e) {
            super(cVar, bVar, b4.k(), c0742e);
            this.f15222h = b4;
        }

        @Override // androidx.fragment.app.M.e
        public void c() {
            super.c();
            this.f15222h.m();
        }

        @Override // androidx.fragment.app.M.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment k4 = this.f15222h.k();
                View findFocus = k4.f15026m0.findFocus();
                if (findFocus != null) {
                    k4.f0(findFocus);
                    if (FragmentManager.S0(2)) {
                        Log.v(FragmentManager.f15087P, "requestFocus: Saved focused view " + findFocus + " for Fragment " + k4);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f15222h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k4.s());
                return;
            }
            if (g() == e.b.REMOVING) {
                Fragment k5 = this.f15222h.k();
                View requireView2 = k5.requireView();
                if (FragmentManager.S0(2)) {
                    Log.v(FragmentManager.f15087P, "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + k5);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private c f15223a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.N
        private b f15224b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.N
        private final Fragment f15225c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.N
        private final List<Runnable> f15226d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.N
        private final HashSet<C0742e> f15227e = new HashSet<>();

        /* renamed from: f, reason: collision with root package name */
        private boolean f15228f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f15229g = false;

        /* loaded from: classes.dex */
        class a implements C0742e.b {
            a() {
            }

            @Override // androidx.core.os.C0742e.b
            public void onCancel() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            @androidx.annotation.N
            public static c e(int i4) {
                if (i4 != 0) {
                    if (i4 != 4) {
                        if (i4 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i4);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @androidx.annotation.N
            public static c f(@androidx.annotation.N View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return e(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void b(@androidx.annotation.N View view) {
                int i4 = c.f15220a[ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                if (FragmentManager.S0(2)) {
                                    Log.v(FragmentManager.f15087P, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.S0(2)) {
                            Log.v(FragmentManager.f15087P, "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.S0(2)) {
                        Log.v(FragmentManager.f15087P, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (FragmentManager.S0(2)) {
                        Log.v(FragmentManager.f15087P, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        e(@androidx.annotation.N c cVar, @androidx.annotation.N b bVar, @androidx.annotation.N Fragment fragment, @androidx.annotation.N C0742e c0742e) {
            this.f15223a = cVar;
            this.f15224b = bVar;
            this.f15225c = fragment;
            c0742e.d(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(@androidx.annotation.N Runnable runnable) {
            this.f15226d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f15228f = true;
            if (this.f15227e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f15227e).iterator();
            while (it.hasNext()) {
                ((C0742e) it.next()).a();
            }
        }

        @InterfaceC0566i
        public void c() {
            if (this.f15229g) {
                return;
            }
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f15229g = true;
            Iterator<Runnable> it = this.f15226d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(@androidx.annotation.N C0742e c0742e) {
            if (this.f15227e.remove(c0742e) && this.f15227e.isEmpty()) {
                c();
            }
        }

        @androidx.annotation.N
        public c e() {
            return this.f15223a;
        }

        @androidx.annotation.N
        public final Fragment f() {
            return this.f15225c;
        }

        @androidx.annotation.N
        b g() {
            return this.f15224b;
        }

        final boolean h() {
            return this.f15228f;
        }

        final boolean i() {
            return this.f15229g;
        }

        public final void j(@androidx.annotation.N C0742e c0742e) {
            l();
            this.f15227e.add(c0742e);
        }

        final void k(@androidx.annotation.N c cVar, @androidx.annotation.N b bVar) {
            int i4 = c.f15221b[bVar.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3 && this.f15223a != c.REMOVED) {
                        if (FragmentManager.S0(2)) {
                            Log.v(FragmentManager.f15087P, "SpecialEffectsController: For fragment " + this.f15225c + " mFinalState = " + this.f15223a + " -> " + cVar + ". ");
                        }
                        this.f15223a = cVar;
                        return;
                    }
                    return;
                }
                if (FragmentManager.S0(2)) {
                    Log.v(FragmentManager.f15087P, "SpecialEffectsController: For fragment " + this.f15225c + " mFinalState = " + this.f15223a + " -> REMOVED. mLifecycleImpact  = " + this.f15224b + " to REMOVING.");
                }
                this.f15223a = c.REMOVED;
                this.f15224b = b.REMOVING;
                return;
            }
            if (this.f15223a == c.REMOVED) {
                if (FragmentManager.S0(2)) {
                    Log.v(FragmentManager.f15087P, "SpecialEffectsController: For fragment " + this.f15225c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f15224b + " to ADDING.");
                }
                this.f15223a = c.VISIBLE;
                this.f15224b = b.ADDING;
            }
        }

        void l() {
        }

        @androidx.annotation.N
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f15223a + "} {mLifecycleImpact = " + this.f15224b + "} {mFragment = " + this.f15225c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(@androidx.annotation.N ViewGroup viewGroup) {
        this.f15211a = viewGroup;
    }

    private void a(@androidx.annotation.N e.c cVar, @androidx.annotation.N e.b bVar, @androidx.annotation.N B b4) {
        synchronized (this.f15212b) {
            try {
                C0742e c0742e = new C0742e();
                e h4 = h(b4.k());
                if (h4 != null) {
                    h4.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, b4, c0742e);
                this.f15212b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.P
    private e h(@androidx.annotation.N Fragment fragment) {
        Iterator<e> it = this.f15212b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    @androidx.annotation.P
    private e i(@androidx.annotation.N Fragment fragment) {
        Iterator<e> it = this.f15213c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public static M n(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.N FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.K0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public static M o(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.N N n4) {
        Object tag = viewGroup.getTag(a.c.f16b);
        if (tag instanceof M) {
            return (M) tag;
        }
        M a4 = n4.a(viewGroup);
        viewGroup.setTag(a.c.f16b, a4);
        return a4;
    }

    private void q() {
        Iterator<e> it = this.f15212b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.e(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@androidx.annotation.N e.c cVar, @androidx.annotation.N B b4) {
        if (FragmentManager.S0(2)) {
            Log.v(FragmentManager.f15087P, "SpecialEffectsController: Enqueuing add operation for fragment " + b4.k());
        }
        a(cVar, e.b.ADDING, b4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(@androidx.annotation.N B b4) {
        if (FragmentManager.S0(2)) {
            Log.v(FragmentManager.f15087P, "SpecialEffectsController: Enqueuing hide operation for fragment " + b4.k());
        }
        a(e.c.GONE, e.b.NONE, b4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@androidx.annotation.N B b4) {
        if (FragmentManager.S0(2)) {
            Log.v(FragmentManager.f15087P, "SpecialEffectsController: Enqueuing remove operation for fragment " + b4.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, b4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@androidx.annotation.N B b4) {
        if (FragmentManager.S0(2)) {
            Log.v(FragmentManager.f15087P, "SpecialEffectsController: Enqueuing show operation for fragment " + b4.k());
        }
        a(e.c.VISIBLE, e.b.NONE, b4);
    }

    abstract void f(@androidx.annotation.N List<e> list, boolean z3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f15215e) {
            return;
        }
        if (!C0823k0.O0(this.f15211a)) {
            j();
            this.f15214d = false;
            return;
        }
        synchronized (this.f15212b) {
            try {
                if (!this.f15212b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f15213c);
                    this.f15213c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (FragmentManager.S0(2)) {
                            Log.v(FragmentManager.f15087P, "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f15213c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f15212b);
                    this.f15212b.clear();
                    this.f15213c.addAll(arrayList2);
                    if (FragmentManager.S0(2)) {
                        Log.v(FragmentManager.f15087P, "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f15214d);
                    this.f15214d = false;
                    if (FragmentManager.S0(2)) {
                        Log.v(FragmentManager.f15087P, "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        if (FragmentManager.S0(2)) {
            Log.v(FragmentManager.f15087P, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean O02 = C0823k0.O0(this.f15211a);
        synchronized (this.f15212b) {
            try {
                q();
                Iterator<e> it = this.f15212b.iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
                Iterator it2 = new ArrayList(this.f15213c).iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (FragmentManager.S0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (O02) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f15211a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v(FragmentManager.f15087P, sb.toString());
                    }
                    eVar.b();
                }
                Iterator it3 = new ArrayList(this.f15212b).iterator();
                while (it3.hasNext()) {
                    e eVar2 = (e) it3.next();
                    if (FragmentManager.S0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (O02) {
                            str = "";
                        } else {
                            str = "Container " + this.f15211a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v(FragmentManager.f15087P, sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.f15215e) {
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "SpecialEffectsController: Forcing postponed operations");
            }
            this.f15215e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public e.b l(@androidx.annotation.N B b4) {
        e.b bVar;
        e h4 = h(b4.k());
        if (h4 != null) {
            bVar = h4.g();
        } else {
            bVar = null;
        }
        e i4 = i(b4.k());
        if (i4 != null && (bVar == null || bVar == e.b.NONE)) {
            return i4.g();
        }
        return bVar;
    }

    @androidx.annotation.N
    public ViewGroup m() {
        return this.f15211a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f15212b) {
            try {
                q();
                this.f15215e = false;
                int size = this.f15212b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = this.f15212b.get(size);
                    e.c f4 = e.c.f(eVar.f().f15026m0);
                    e.c e4 = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (e4 == cVar && f4 != cVar) {
                        this.f15215e = eVar.f().z();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z3) {
        this.f15214d = z3;
    }
}
