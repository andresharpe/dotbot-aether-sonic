package androidx.fragment.app;

import A.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.l;
import androidx.annotation.RestrictTo;
import androidx.annotation.c0;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.savedstate.c;
import b.AbstractC1000a;
import b.C1001b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager implements z {

    /* renamed from: N, reason: collision with root package name */
    static final String f15085N = "android:support:fragments";

    /* renamed from: O, reason: collision with root package name */
    private static boolean f15086O = false;

    /* renamed from: P, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f15087P = "FragmentManager";

    /* renamed from: Q, reason: collision with root package name */
    public static final int f15088Q = 1;

    /* renamed from: R, reason: collision with root package name */
    private static final String f15089R = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* renamed from: A, reason: collision with root package name */
    private androidx.activity.result.i<String[]> f15090A;

    /* renamed from: C, reason: collision with root package name */
    private boolean f15092C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f15093D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f15094E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f15095F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f15096G;

    /* renamed from: H, reason: collision with root package name */
    private ArrayList<C0883a> f15097H;

    /* renamed from: I, reason: collision with root package name */
    private ArrayList<Boolean> f15098I;

    /* renamed from: J, reason: collision with root package name */
    private ArrayList<Fragment> f15099J;

    /* renamed from: K, reason: collision with root package name */
    private v f15100K;

    /* renamed from: L, reason: collision with root package name */
    private FragmentStrictMode.b f15101L;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15104b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<C0883a> f15106d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f15107e;

    /* renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f15109g;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<o> f15115m;

    /* renamed from: q, reason: collision with root package name */
    private AbstractC0894l<?> f15119q;

    /* renamed from: r, reason: collision with root package name */
    private AbstractC0891i f15120r;

    /* renamed from: s, reason: collision with root package name */
    private Fragment f15121s;

    /* renamed from: t, reason: collision with root package name */
    @androidx.annotation.P
    Fragment f15122t;

    /* renamed from: y, reason: collision with root package name */
    private androidx.activity.result.i<Intent> f15127y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.activity.result.i<androidx.activity.result.l> f15128z;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<p> f15103a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final D f15105c = new D();

    /* renamed from: f, reason: collision with root package name */
    private final LayoutInflaterFactory2C0897o f15108f = new LayoutInflaterFactory2C0897o(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.activity.j f15110h = new a(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f15111i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, C0885c> f15112j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, Bundle> f15113k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, n> f15114l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final C0898p f15116n = new C0898p(this);

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList<w> f15117o = new CopyOnWriteArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    int f15118p = -1;

    /* renamed from: u, reason: collision with root package name */
    private C0893k f15123u = null;

    /* renamed from: v, reason: collision with root package name */
    private C0893k f15124v = new b();

    /* renamed from: w, reason: collision with root package name */
    private N f15125w = null;

    /* renamed from: x, reason: collision with root package name */
    private N f15126x = new c();

    /* renamed from: B, reason: collision with root package name */
    ArrayDeque<m> f15091B = new ArrayDeque<>();

    /* renamed from: M, reason: collision with root package name */
    private Runnable f15102M = new d();

    /* loaded from: classes.dex */
    class a extends androidx.activity.j {
        a(boolean z3) {
            super(z3);
        }

        @Override // androidx.activity.j
        public void e() {
            FragmentManager.this.O0();
        }
    }

    /* loaded from: classes.dex */
    class b extends C0893k {
        b() {
        }

        @Override // androidx.fragment.app.C0893k
        @androidx.annotation.N
        public Fragment a(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) {
            return FragmentManager.this.F0().b(FragmentManager.this.F0().g(), str, null);
        }
    }

    /* loaded from: classes.dex */
    class c implements N {
        c() {
        }

        @Override // androidx.fragment.app.N
        @androidx.annotation.N
        public M a(@androidx.annotation.N ViewGroup viewGroup) {
            return new C0886d(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.f0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements w {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Fragment f15137E;

        e(Fragment fragment) {
            this.f15137E = fragment;
        }

        @Override // androidx.fragment.app.w
        public void a(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
            this.f15137E.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements androidx.activity.result.b<androidx.activity.result.a> {
        f() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = FragmentManager.this.f15091B.pollFirst();
            if (pollFirst == null) {
                Log.w(FragmentManager.f15087P, "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f15144E;
            int i4 = pollFirst.f15145F;
            Fragment i5 = FragmentManager.this.f15105c.i(str);
            if (i5 == null) {
                Log.w(FragmentManager.f15087P, "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i5.onActivityResult(i4, aVar.b(), aVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements androidx.activity.result.b<androidx.activity.result.a> {
        g() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = FragmentManager.this.f15091B.pollFirst();
            if (pollFirst == null) {
                Log.w(FragmentManager.f15087P, "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f15144E;
            int i4 = pollFirst.f15145F;
            Fragment i5 = FragmentManager.this.f15105c.i(str);
            if (i5 == null) {
                Log.w(FragmentManager.f15087P, "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i5.onActivityResult(i4, aVar.b(), aVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<Map<String, Boolean>> {
        h() {
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            int i4;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                if (((Boolean) arrayList.get(i5)).booleanValue()) {
                    i4 = 0;
                } else {
                    i4 = -1;
                }
                iArr[i5] = i4;
            }
            m pollFirst = FragmentManager.this.f15091B.pollFirst();
            if (pollFirst == null) {
                Log.w(FragmentManager.f15087P, "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f15144E;
            int i6 = pollFirst.f15145F;
            Fragment i7 = FragmentManager.this.f15105c.i(str);
            if (i7 == null) {
                Log.w(FragmentManager.f15087P, "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i7.onRequestPermissionsResult(i6, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        @androidx.annotation.P
        @Deprecated
        CharSequence a();

        @c0
        @Deprecated
        int c();

        @c0
        @Deprecated
        int d();

        @androidx.annotation.P
        @Deprecated
        CharSequence e();

        int getId();

        @androidx.annotation.P
        String getName();
    }

    /* loaded from: classes.dex */
    private class j implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f15142a;

        j(@androidx.annotation.N String str) {
            this.f15142a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.v(arrayList, arrayList2, this.f15142a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends AbstractC1000a<androidx.activity.result.l, androidx.activity.result.a> {
        k() {
        }

        @Override // b.AbstractC1000a
        @androidx.annotation.N
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@androidx.annotation.N Context context, androidx.activity.result.l lVar) {
            Bundle bundleExtra;
            Intent intent = new Intent(C1001b.o.f20941b);
            Intent a4 = lVar.a();
            if (a4 != null && (bundleExtra = a4.getBundleExtra(C1001b.n.f20939b)) != null) {
                intent.putExtra(C1001b.n.f20939b, bundleExtra);
                a4.removeExtra(C1001b.n.f20939b);
                if (a4.getBooleanExtra(FragmentManager.f15089R, false)) {
                    lVar = new l.b(lVar.d()).b(null).c(lVar.c(), lVar.b()).a();
                }
            }
            intent.putExtra(C1001b.o.f20942c, lVar);
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // b.AbstractC1000a
        @androidx.annotation.N
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i4, @androidx.annotation.P Intent intent) {
            return new androidx.activity.result.a(i4, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        @Deprecated
        public void a(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.P Bundle bundle) {
        }

        public void b(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.N Context context) {
        }

        public void c(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.P Bundle bundle) {
        }

        public void d(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
        }

        public void e(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
        }

        public void f(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
        }

        public void g(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.N Context context) {
        }

        public void h(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.P Bundle bundle) {
        }

        public void i(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
        }

        public void j(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.N Bundle bundle) {
        }

        public void k(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
        }

        public void l(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
        }

        public void m(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.N View view, @androidx.annotation.P Bundle bundle) {
        }

        public void n(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    private static class n implements y {

        /* renamed from: a, reason: collision with root package name */
        private final Lifecycle f15146a;

        /* renamed from: b, reason: collision with root package name */
        private final y f15147b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.lifecycle.A f15148c;

        n(@androidx.annotation.N Lifecycle lifecycle, @androidx.annotation.N y yVar, @androidx.annotation.N androidx.lifecycle.A a4) {
            this.f15146a = lifecycle;
            this.f15147b = yVar;
            this.f15148c = a4;
        }

        @Override // androidx.fragment.app.y
        public void a(@androidx.annotation.N String str, @androidx.annotation.N Bundle bundle) {
            this.f15147b.a(str, bundle);
        }

        public boolean b(Lifecycle.State state) {
            return this.f15146a.b().e(state);
        }

        public void c() {
            this.f15146a.d(this.f15148c);
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        @androidx.annotation.K
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface p {
        boolean b(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class q implements p {

        /* renamed from: a, reason: collision with root package name */
        final String f15149a;

        /* renamed from: b, reason: collision with root package name */
        final int f15150b;

        /* renamed from: c, reason: collision with root package name */
        final int f15151c;

        q(@androidx.annotation.P String str, int i4, int i5) {
            this.f15149a = str;
            this.f15150b = i4;
            this.f15151c = i5;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f15122t;
            if (fragment != null && this.f15150b < 0 && this.f15149a == null && fragment.getChildFragmentManager().m1()) {
                return false;
            }
            return FragmentManager.this.q1(arrayList, arrayList2, this.f15149a, this.f15150b, this.f15151c);
        }
    }

    /* loaded from: classes.dex */
    private class r implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f15153a;

        r(@androidx.annotation.N String str) {
            this.f15153a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.B1(arrayList, arrayList2, this.f15153a);
        }
    }

    /* loaded from: classes.dex */
    private class s implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f15155a;

        s(@androidx.annotation.N String str) {
            this.f15155a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.J1(arrayList, arrayList2, this.f15155a);
        }
    }

    private ViewGroup B0(@androidx.annotation.N Fragment fragment) {
        ViewGroup viewGroup = fragment.f15025l0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f15016c0 > 0 && this.f15120r.e()) {
            View c4 = this.f15120r.c(fragment.f15016c0);
            if (c4 instanceof ViewGroup) {
                return (ViewGroup) c4;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F1(int i4) {
        int i5 = F.f14939I;
        if (i4 != 4097) {
            if (i4 != 8194) {
                i5 = F.f14943M;
                if (i4 == 8197) {
                    return F.f14942L;
                }
                if (i4 == 4099) {
                    return F.f14941K;
                }
                if (i4 != 4100) {
                    return 0;
                }
            }
            return i5;
        }
        return 8194;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static Fragment M0(@androidx.annotation.N View view) {
        Object tag = view.getTag(a.c.f15a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void P(@androidx.annotation.P Fragment fragment) {
        if (fragment != null && fragment.equals(k0(fragment.f14997J))) {
            fragment.T();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean S0(int i4) {
        if (!f15086O && !Log.isLoggable(f15087P, i4)) {
            return false;
        }
        return true;
    }

    private void S1(@androidx.annotation.N Fragment fragment) {
        ViewGroup B02 = B0(fragment);
        if (B02 != null && fragment.h() + fragment.j() + fragment.q() + fragment.r() > 0) {
            if (B02.getTag(a.c.f17c) == null) {
                B02.setTag(a.c.f17c, fragment);
            }
            ((Fragment) B02.getTag(a.c.f17c)).h0(fragment.p());
        }
    }

    private boolean T0(@androidx.annotation.N Fragment fragment) {
        if ((fragment.f15022i0 && fragment.f15023j0) || fragment.f15013Z.r()) {
            return true;
        }
        return false;
    }

    private void U1() {
        Iterator<B> it = this.f15105c.l().iterator();
        while (it.hasNext()) {
            h1(it.next());
        }
    }

    private void V1(RuntimeException runtimeException) {
        Log.e(f15087P, runtimeException.getMessage());
        Log.e(f15087P, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new L(f15087P));
        AbstractC0894l<?> abstractC0894l = this.f15119q;
        if (abstractC0894l != null) {
            try {
                abstractC0894l.i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e4) {
                Log.e(f15087P, "Failed dumping state", e4);
                throw runtimeException;
            }
        }
        try {
            a0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e5) {
            Log.e(f15087P, "Failed dumping state", e5);
            throw runtimeException;
        }
    }

    private void W(int i4) {
        try {
            this.f15104b = true;
            this.f15105c.d(i4);
            d1(i4, false);
            Iterator<M> it = x().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
            this.f15104b = false;
            f0(true);
        } catch (Throwable th) {
            this.f15104b = false;
            throw th;
        }
    }

    private void X1() {
        synchronized (this.f15103a) {
            try {
                boolean z3 = true;
                if (!this.f15103a.isEmpty()) {
                    this.f15110h.i(true);
                    return;
                }
                androidx.activity.j jVar = this.f15110h;
                if (x0() <= 0 || !W0(this.f15121s)) {
                    z3 = false;
                }
                jVar.i(z3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void Z() {
        if (this.f15096G) {
            this.f15096G = false;
            U1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle Z0() {
        Bundle bundle = new Bundle();
        Parcelable H12 = H1();
        if (H12 != null) {
            bundle.putParcelable(f15085N, H12);
        }
        return bundle;
    }

    @Deprecated
    public static void b0(boolean z3) {
        f15086O = z3;
    }

    private void c0() {
        Iterator<M> it = x().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    private void e0(boolean z3) {
        if (!this.f15104b) {
            if (this.f15119q == null) {
                if (this.f15095F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f15119q.h().getLooper()) {
                if (!z3) {
                    s();
                }
                if (this.f15097H == null) {
                    this.f15097H = new ArrayList<>();
                    this.f15098I = new ArrayList<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private static void h0(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2, int i4, int i5) {
        while (i4 < i5) {
            C0883a c0883a = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                c0883a.U(-1);
                c0883a.a0();
            } else {
                c0883a.U(1);
                c0883a.Z();
            }
            i4++;
        }
    }

    private void i0(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2, int i4, int i5) {
        boolean z3 = arrayList.get(i4).f14968r;
        ArrayList<Fragment> arrayList3 = this.f15099J;
        if (arrayList3 == null) {
            this.f15099J = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f15099J.addAll(this.f15105c.p());
        Fragment J02 = J0();
        boolean z4 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0883a c0883a = arrayList.get(i6);
            if (!arrayList2.get(i6).booleanValue()) {
                J02 = c0883a.b0(this.f15099J, J02);
            } else {
                J02 = c0883a.d0(this.f15099J, J02);
            }
            if (!z4 && !c0883a.f14959i) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        this.f15099J.clear();
        if (!z3 && this.f15118p >= 1) {
            for (int i7 = i4; i7 < i5; i7++) {
                Iterator<F.a> it = arrayList.get(i7).f14953c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f14971b;
                    if (fragment != null && fragment.f15011X != null) {
                        this.f15105c.s(z(fragment));
                    }
                }
            }
        }
        h0(arrayList, arrayList2, i4, i5);
        boolean booleanValue = arrayList2.get(i5 - 1).booleanValue();
        for (int i8 = i4; i8 < i5; i8++) {
            C0883a c0883a2 = arrayList.get(i8);
            if (booleanValue) {
                for (int size = c0883a2.f14953c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = c0883a2.f14953c.get(size).f14971b;
                    if (fragment2 != null) {
                        z(fragment2).m();
                    }
                }
            } else {
                Iterator<F.a> it2 = c0883a2.f14953c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f14971b;
                    if (fragment3 != null) {
                        z(fragment3).m();
                    }
                }
            }
        }
        d1(this.f15118p, true);
        for (M m4 : y(arrayList, i4, i5)) {
            m4.r(booleanValue);
            m4.p();
            m4.g();
        }
        while (i4 < i5) {
            C0883a c0883a3 = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue() && c0883a3.f15234P >= 0) {
                c0883a3.f15234P = -1;
            }
            c0883a3.c0();
            i4++;
        }
        if (z4) {
            y1();
        }
    }

    private int l0(@androidx.annotation.P String str, int i4, boolean z3) {
        ArrayList<C0883a> arrayList = this.f15106d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i4 < 0) {
            if (z3) {
                return 0;
            }
            return this.f15106d.size() - 1;
        }
        int size = this.f15106d.size() - 1;
        while (size >= 0) {
            C0883a c0883a = this.f15106d.get(size);
            if ((str != null && str.equals(c0883a.getName())) || (i4 >= 0 && i4 == c0883a.f15234P)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z3) {
            while (size > 0) {
                C0883a c0883a2 = this.f15106d.get(size - 1);
                if ((str != null && str.equals(c0883a2.getName())) || (i4 >= 0 && i4 == c0883a2.f15234P)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        }
        if (size == this.f15106d.size() - 1) {
            return -1;
        }
        return size + 1;
    }

    @androidx.annotation.N
    public static <F extends Fragment> F m0(@androidx.annotation.N View view) {
        F f4 = (F) r0(view);
        if (f4 != null) {
            return f4;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private boolean p1(@androidx.annotation.P String str, int i4, int i5) {
        f0(false);
        e0(true);
        Fragment fragment = this.f15122t;
        if (fragment != null && i4 < 0 && str == null && fragment.getChildFragmentManager().m1()) {
            return true;
        }
        boolean q12 = q1(this.f15097H, this.f15098I, str, i4, i5);
        if (q12) {
            this.f15104b = true;
            try {
                w1(this.f15097H, this.f15098I);
            } finally {
                t();
            }
        }
        X1();
        Z();
        this.f15105c.b();
        return q12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public static FragmentManager q0(@androidx.annotation.N View view) {
        ActivityC0889g activityC0889g;
        Fragment r02 = r0(view);
        if (r02 != null) {
            if (r02.isAdded()) {
                return r02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + r02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof ActivityC0889g) {
                    activityC0889g = (ActivityC0889g) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activityC0889g = null;
                break;
            }
        }
        if (activityC0889g != null) {
            return activityC0889g.S();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @androidx.annotation.P
    private static Fragment r0(@androidx.annotation.N View view) {
        while (view != null) {
            Fragment M02 = M0(view);
            if (M02 != null) {
                return M02;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void s() {
        if (!Y0()) {
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void s0() {
        Iterator<M> it = x().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    private void t() {
        this.f15104b = false;
        this.f15098I.clear();
        this.f15097H.clear();
    }

    private boolean t0(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2) {
        synchronized (this.f15103a) {
            if (this.f15103a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f15103a.size();
                boolean z3 = false;
                for (int i4 = 0; i4 < size; i4++) {
                    z3 |= this.f15103a.get(i4).b(arrayList, arrayList2);
                }
                return z3;
            } finally {
                this.f15103a.clear();
                this.f15119q.h().removeCallbacks(this.f15102M);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w() {
        /*
            r4 = this;
            androidx.fragment.app.l<?> r0 = r4.f15119q
            boolean r1 = r0 instanceof androidx.lifecycle.q0
            if (r1 == 0) goto L11
            androidx.fragment.app.D r0 = r4.f15105c
            androidx.fragment.app.v r0 = r0.q()
            boolean r0 = r0.E()
            goto L27
        L11:
            android.content.Context r0 = r0.g()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L29
            androidx.fragment.app.l<?> r0 = r4.f15119q
            android.content.Context r0 = r0.g()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            r0 = r0 ^ 1
        L27:
            if (r0 == 0) goto L5b
        L29:
            java.util.Map<java.lang.String, androidx.fragment.app.c> r0 = r4.f15112j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.c r1 = (androidx.fragment.app.C0885c) r1
            java.util.List<java.lang.String> r1 = r1.f15251E
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.D r3 = r4.f15105c
            androidx.fragment.app.v r3 = r3.q()
            r3.w(r2)
            goto L45
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.w():void");
    }

    private void w1(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                if (!arrayList.get(i4).f14968r) {
                    if (i5 != i4) {
                        i0(arrayList, arrayList2, i5, i4);
                    }
                    i5 = i4 + 1;
                    if (arrayList2.get(i4).booleanValue()) {
                        while (i5 < size && arrayList2.get(i5).booleanValue() && !arrayList.get(i5).f14968r) {
                            i5++;
                        }
                    }
                    i0(arrayList, arrayList2, i4, i5);
                    i4 = i5 - 1;
                }
                i4++;
            }
            if (i5 != size) {
                i0(arrayList, arrayList2, i5, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private Set<M> x() {
        HashSet hashSet = new HashSet();
        Iterator<B> it = this.f15105c.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().f15025l0;
            if (viewGroup != null) {
                hashSet.add(M.o(viewGroup, K0()));
            }
        }
        return hashSet;
    }

    private Set<M> y(@androidx.annotation.N ArrayList<C0883a> arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            Iterator<F.a> it = arrayList.get(i4).f14953c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f14971b;
                if (fragment != null && (viewGroup = fragment.f15025l0) != null) {
                    hashSet.add(M.n(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    @androidx.annotation.N
    private v y0(@androidx.annotation.N Fragment fragment) {
        return this.f15100K.z(fragment);
    }

    private void y1() {
        if (this.f15115m != null) {
            for (int i4 = 0; i4 < this.f15115m.size(); i4++) {
                this.f15115m.get(i4).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(@androidx.annotation.N Fragment fragment) {
        if (S0(2)) {
            Log.v(f15087P, "detach: " + fragment);
        }
        if (!fragment.f15019f0) {
            fragment.f15019f0 = true;
            if (fragment.f15003P) {
                if (S0(2)) {
                    Log.v(f15087P, "remove from detach: " + fragment);
                }
                this.f15105c.v(fragment);
                if (T0(fragment)) {
                    this.f15092C = true;
                }
                S1(fragment);
            }
        }
    }

    @androidx.annotation.P
    public Fragment A0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment k02 = k0(string);
        if (k02 == null) {
            V1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return k02;
    }

    public void A1(@androidx.annotation.N String str) {
        d0(new r(str), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        this.f15093D = false;
        this.f15094E = false;
        this.f15100K.H(false);
        W(4);
    }

    boolean B1(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2, @androidx.annotation.N String str) {
        C0885c remove = this.f15112j.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<C0883a> it = arrayList.iterator();
        while (it.hasNext()) {
            C0883a next = it.next();
            if (next.f15235Q) {
                Iterator<F.a> it2 = next.f14953c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f14971b;
                    if (fragment != null) {
                        hashMap.put(fragment.f14997J, fragment);
                    }
                }
            }
        }
        Iterator<C0883a> it3 = remove.a(this, hashMap).iterator();
        while (true) {
            boolean z3 = false;
            while (it3.hasNext()) {
                if (it3.next().b(arrayList, arrayList2) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        this.f15093D = false;
        this.f15094E = false;
        this.f15100K.H(false);
        W(0);
    }

    @androidx.annotation.N
    public C0893k C0() {
        C0893k c0893k = this.f15123u;
        if (c0893k != null) {
            return c0893k;
        }
        Fragment fragment = this.f15121s;
        if (fragment != null) {
            return fragment.f15011X.C0();
        }
        return this.f15124v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C1(@androidx.annotation.P Parcelable parcelable) {
        if (this.f15119q instanceof androidx.savedstate.e) {
            V1(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        D1(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(@androidx.annotation.N Configuration configuration) {
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null) {
                fragment.D(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public D D0() {
        return this.f15105c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D1(@androidx.annotation.P Parcelable parcelable) {
        u uVar;
        ArrayList<A> arrayList;
        B b4;
        if (parcelable == null || (arrayList = (uVar = (u) parcelable).f15353E) == null) {
            return;
        }
        this.f15105c.y(arrayList);
        this.f15105c.w();
        Iterator<String> it = uVar.f15354F.iterator();
        while (it.hasNext()) {
            A C3 = this.f15105c.C(it.next(), null);
            if (C3 != null) {
                Fragment y3 = this.f15100K.y(C3.f14846F);
                if (y3 != null) {
                    if (S0(2)) {
                        Log.v(f15087P, "restoreSaveState: re-attaching retained " + y3);
                    }
                    b4 = new B(this.f15116n, this.f15105c, y3, C3);
                } else {
                    b4 = new B(this.f15116n, this.f15105c, this.f15119q.g().getClassLoader(), C0(), C3);
                }
                Fragment k4 = b4.k();
                k4.f15011X = this;
                if (S0(2)) {
                    Log.v(f15087P, "restoreSaveState: active (" + k4.f14997J + "): " + k4);
                }
                b4.o(this.f15119q.g().getClassLoader());
                this.f15105c.s(b4);
                b4.u(this.f15118p);
            }
        }
        for (Fragment fragment : this.f15100K.B()) {
            if (!this.f15105c.c(fragment.f14997J)) {
                if (S0(2)) {
                    Log.v(f15087P, "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + uVar.f15354F);
                }
                this.f15100K.F(fragment);
                fragment.f15011X = this;
                B b5 = new B(this.f15116n, this.f15105c, fragment);
                b5.u(1);
                b5.m();
                fragment.f15004Q = true;
                b5.m();
            }
        }
        this.f15105c.x(uVar.f15355G);
        if (uVar.f15356H != null) {
            this.f15106d = new ArrayList<>(uVar.f15356H.length);
            int i4 = 0;
            while (true) {
                C0884b[] c0884bArr = uVar.f15356H;
                if (i4 >= c0884bArr.length) {
                    break;
                }
                C0883a b6 = c0884bArr[i4].b(this);
                if (S0(2)) {
                    Log.v(f15087P, "restoreAllState: back stack #" + i4 + " (index " + b6.f15234P + "): " + b6);
                    PrintWriter printWriter = new PrintWriter(new L(f15087P));
                    b6.Y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f15106d.add(b6);
                i4++;
            }
        } else {
            this.f15106d = null;
        }
        this.f15111i.set(uVar.f15357I);
        String str = uVar.f15358J;
        if (str != null) {
            Fragment k02 = k0(str);
            this.f15122t = k02;
            P(k02);
        }
        ArrayList<String> arrayList2 = uVar.f15359K;
        if (arrayList2 != null) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                this.f15112j.put(arrayList2.get(i5), uVar.f15360L.get(i5));
            }
        }
        ArrayList<String> arrayList3 = uVar.f15361M;
        if (arrayList3 != null) {
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                Bundle bundle = uVar.f15362N.get(i6);
                bundle.setClassLoader(this.f15119q.g().getClassLoader());
                this.f15113k.put(arrayList3.get(i6), bundle);
            }
        }
        this.f15091B = new ArrayDeque<>(uVar.f15363O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E(@androidx.annotation.N MenuItem menuItem) {
        if (this.f15118p < 1) {
            return false;
        }
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null && fragment.E(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.N
    public List<Fragment> E0() {
        return this.f15105c.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public t E1() {
        if (this.f15119q instanceof q0) {
            V1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f15100K.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        this.f15093D = false;
        this.f15094E = false;
        this.f15100K.H(false);
        W(1);
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AbstractC0894l<?> F0() {
        return this.f15119q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G(@androidx.annotation.N Menu menu, @androidx.annotation.N MenuInflater menuInflater) {
        if (this.f15118p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z3 = false;
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null && V0(fragment) && fragment.G(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z3 = true;
            }
        }
        if (this.f15107e != null) {
            for (int i4 = 0; i4 < this.f15107e.size(); i4++) {
                Fragment fragment2 = this.f15107e.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f15107e = arrayList;
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public LayoutInflater.Factory2 G0() {
        return this.f15108f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable G1() {
        if (this.f15119q instanceof androidx.savedstate.e) {
            V1(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        return H1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        this.f15095F = true;
        f0(true);
        c0();
        w();
        W(-1);
        this.f15119q = null;
        this.f15120r = null;
        this.f15121s = null;
        if (this.f15109g != null) {
            this.f15110h.g();
            this.f15109g = null;
        }
        androidx.activity.result.i<Intent> iVar = this.f15127y;
        if (iVar != null) {
            iVar.d();
            this.f15128z.d();
            this.f15090A.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public C0898p H0() {
        return this.f15116n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable H1() {
        int size;
        s0();
        c0();
        f0(true);
        this.f15093D = true;
        this.f15100K.H(true);
        ArrayList<String> z3 = this.f15105c.z();
        ArrayList<A> n4 = this.f15105c.n();
        C0884b[] c0884bArr = null;
        if (n4.isEmpty()) {
            if (S0(2)) {
                Log.v(f15087P, "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> A3 = this.f15105c.A();
        ArrayList<C0883a> arrayList = this.f15106d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c0884bArr = new C0884b[size];
            for (int i4 = 0; i4 < size; i4++) {
                c0884bArr[i4] = new C0884b(this.f15106d.get(i4));
                if (S0(2)) {
                    Log.v(f15087P, "saveAllState: adding back stack #" + i4 + ": " + this.f15106d.get(i4));
                }
            }
        }
        u uVar = new u();
        uVar.f15353E = n4;
        uVar.f15354F = z3;
        uVar.f15355G = A3;
        uVar.f15356H = c0884bArr;
        uVar.f15357I = this.f15111i.get();
        Fragment fragment = this.f15122t;
        if (fragment != null) {
            uVar.f15358J = fragment.f14997J;
        }
        uVar.f15359K.addAll(this.f15112j.keySet());
        uVar.f15360L.addAll(this.f15112j.values());
        uVar.f15361M.addAll(this.f15113k.keySet());
        uVar.f15362N.addAll(this.f15113k.values());
        uVar.f15363O = new ArrayList<>(this.f15091B);
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        W(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment I0() {
        return this.f15121s;
    }

    public void I1(@androidx.annotation.N String str) {
        d0(new s(str), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J() {
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null) {
                fragment.M();
            }
        }
    }

    @androidx.annotation.P
    public Fragment J0() {
        return this.f15122t;
    }

    boolean J1(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2, @androidx.annotation.N String str) {
        String str2;
        String str3;
        int i4;
        int l02 = l0(str, -1, true);
        if (l02 < 0) {
            return false;
        }
        for (int i5 = l02; i5 < this.f15106d.size(); i5++) {
            C0883a c0883a = this.f15106d.get(i5);
            if (!c0883a.f14968r) {
                V1(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c0883a + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i6 = l02; i6 < this.f15106d.size(); i6++) {
            C0883a c0883a2 = this.f15106d.get(i6);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<F.a> it = c0883a2.f14953c.iterator();
            while (it.hasNext()) {
                F.a next = it.next();
                Fragment fragment = next.f14971b;
                if (fragment != null) {
                    if (!next.f14972c || (i4 = next.f14970a) == 1 || i4 == 2 || i4 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i7 = next.f14970a;
                    if (i7 == 1 || i7 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str3 = " " + hashSet2.iterator().next();
                } else {
                    str3 = "s " + hashSet2;
                }
                sb.append(str3);
                sb.append(" in ");
                sb.append(c0883a2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                V1(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.f15020g0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                sb2.append(str2);
                sb2.append("fragment ");
                sb2.append(fragment2);
                V1(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.f15013Z.v0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).f14997J);
        }
        ArrayList arrayList4 = new ArrayList(this.f15106d.size() - l02);
        for (int i8 = l02; i8 < this.f15106d.size(); i8++) {
            arrayList4.add(null);
        }
        C0885c c0885c = new C0885c(arrayList3, arrayList4);
        for (int size = this.f15106d.size() - 1; size >= l02; size--) {
            C0883a remove = this.f15106d.remove(size);
            C0883a c0883a3 = new C0883a(remove);
            c0883a3.V();
            arrayList4.set(size - l02, new C0884b(c0883a3));
            remove.f15235Q = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f15112j.put(str, c0885c);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(boolean z3) {
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null) {
                fragment.N(z3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public N K0() {
        N n4 = this.f15125w;
        if (n4 != null) {
            return n4;
        }
        Fragment fragment = this.f15121s;
        if (fragment != null) {
            return fragment.f15011X.K0();
        }
        return this.f15126x;
    }

    @androidx.annotation.P
    public Fragment.l K1(@androidx.annotation.N Fragment fragment) {
        B o4 = this.f15105c.o(fragment.f14997J);
        if (o4 == null || !o4.k().equals(fragment)) {
            V1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return o4.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(@androidx.annotation.N Fragment fragment) {
        Iterator<w> it = this.f15117o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    @androidx.annotation.P
    public FragmentStrictMode.b L0() {
        return this.f15101L;
    }

    void L1() {
        synchronized (this.f15103a) {
            try {
                if (this.f15103a.size() == 1) {
                    this.f15119q.h().removeCallbacks(this.f15102M);
                    this.f15119q.h().post(this.f15102M);
                    X1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        for (Fragment fragment : this.f15105c.m()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.f15013Z.M();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M1(@androidx.annotation.N Fragment fragment, boolean z3) {
        ViewGroup B02 = B0(fragment);
        if (B02 != null && (B02 instanceof FragmentContainerView)) {
            ((FragmentContainerView) B02).setDrawDisappearingViewsLast(!z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N(@androidx.annotation.N MenuItem menuItem) {
        if (this.f15118p < 1) {
            return false;
        }
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null && fragment.O(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public p0 N0(@androidx.annotation.N Fragment fragment) {
        return this.f15100K.D(fragment);
    }

    public void N1(@androidx.annotation.N C0893k c0893k) {
        this.f15123u = c0893k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(@androidx.annotation.N Menu menu) {
        if (this.f15118p < 1) {
            return;
        }
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null) {
                fragment.P(menu);
            }
        }
    }

    void O0() {
        f0(true);
        if (this.f15110h.f()) {
            m1();
        } else {
            this.f15109g.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Lifecycle.State state) {
        if (fragment.equals(k0(fragment.f14997J)) && (fragment.f15012Y == null || fragment.f15011X == this)) {
            fragment.f15034u0 = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(@androidx.annotation.N Fragment fragment) {
        if (S0(2)) {
            Log.v(f15087P, "hide: " + fragment);
        }
        if (!fragment.f15018e0) {
            fragment.f15018e0 = true;
            fragment.f15031r0 = true ^ fragment.f15031r0;
            S1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P1(@androidx.annotation.P Fragment fragment) {
        if (fragment != null && (!fragment.equals(k0(fragment.f14997J)) || (fragment.f15012Y != null && fragment.f15011X != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f15122t;
        this.f15122t = fragment;
        P(fragment2);
        P(this.f15122t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q() {
        W(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(@androidx.annotation.N Fragment fragment) {
        if (fragment.f15003P && T0(fragment)) {
            this.f15092C = true;
        }
    }

    void Q1(@androidx.annotation.N N n4) {
        this.f15125w = n4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(boolean z3) {
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null) {
                fragment.R(z3);
            }
        }
    }

    public boolean R0() {
        return this.f15095F;
    }

    public void R1(@androidx.annotation.P FragmentStrictMode.b bVar) {
        this.f15101L = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean S(@androidx.annotation.N Menu menu) {
        boolean z3 = false;
        if (this.f15118p < 1) {
            return false;
        }
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null && V0(fragment) && fragment.S(menu)) {
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        X1();
        P(this.f15122t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T1(@androidx.annotation.N Fragment fragment) {
        if (S0(2)) {
            Log.v(f15087P, "show: " + fragment);
        }
        if (fragment.f15018e0) {
            fragment.f15018e0 = false;
            fragment.f15031r0 = !fragment.f15031r0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        this.f15093D = false;
        this.f15094E = false;
        this.f15100K.H(false);
        W(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean U0(@androidx.annotation.P Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        this.f15093D = false;
        this.f15094E = false;
        this.f15100K.H(false);
        W(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean V0(@androidx.annotation.P Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean W0(@androidx.annotation.P Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f15011X;
        if (fragment.equals(fragmentManager.J0()) && W0(fragmentManager.f15121s)) {
            return true;
        }
        return false;
    }

    public void W1(@androidx.annotation.N l lVar) {
        this.f15116n.p(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        this.f15094E = true;
        this.f15100K.H(true);
        W(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean X0(int i4) {
        if (this.f15118p >= i4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y() {
        W(2);
    }

    public boolean Y0() {
        if (!this.f15093D && !this.f15094E) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.z
    public final void a(@androidx.annotation.N String str, @androidx.annotation.N Bundle bundle) {
        n nVar = this.f15114l.get(str);
        if (nVar != null && nVar.b(Lifecycle.State.STARTED)) {
            nVar.a(str, bundle);
        } else {
            this.f15113k.put(str, bundle);
        }
        if (S0(2)) {
            Log.v(f15087P, "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public void a0(@androidx.annotation.N String str, @androidx.annotation.P FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f15105c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f15107e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                Fragment fragment = this.f15107e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0883a> arrayList2 = this.f15106d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                C0883a c0883a = this.f15106d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c0883a.toString());
                c0883a.X(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f15111i.get());
        synchronized (this.f15103a) {
            try {
                int size3 = this.f15103a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size3; i6++) {
                        p pVar = this.f15103a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(pVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f15119q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f15120r);
        if (this.f15121s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f15121s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f15118p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f15093D);
        printWriter.print(" mStopped=");
        printWriter.print(this.f15094E);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f15095F);
        if (this.f15092C) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f15092C);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N String[] strArr, int i4) {
        if (this.f15090A != null) {
            this.f15091B.addLast(new m(fragment.f14997J, i4));
            this.f15090A.b(strArr);
            return;
        }
        this.f15119q.n(fragment, strArr, i4);
    }

    @Override // androidx.fragment.app.z
    @SuppressLint({"SyntheticAccessor"})
    public final void b(@androidx.annotation.N final String str, @androidx.annotation.N androidx.lifecycle.E e4, @androidx.annotation.N final y yVar) {
        final Lifecycle lifecycle = e4.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        androidx.lifecycle.A a4 = new androidx.lifecycle.A() { // from class: androidx.fragment.app.FragmentManager.5
            @Override // androidx.lifecycle.A
            public void f(@androidx.annotation.N androidx.lifecycle.E e5, @androidx.annotation.N Lifecycle.Event event) {
                Bundle bundle;
                if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.f15113k.get(str)) != null) {
                    yVar.a(str, bundle);
                    FragmentManager.this.d(str);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.d(this);
                    FragmentManager.this.f15114l.remove(str);
                }
            }
        };
        lifecycle.a(a4);
        n put = this.f15114l.put(str, new n(lifecycle, yVar, a4));
        if (put != null) {
            put.c();
        }
        if (S0(2)) {
            Log.v(f15087P, "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(@androidx.annotation.N Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, @androidx.annotation.P Bundle bundle) {
        if (this.f15127y != null) {
            this.f15091B.addLast(new m(fragment.f14997J, i4));
            if (intent != null && bundle != null) {
                intent.putExtra(C1001b.n.f20939b, bundle);
            }
            this.f15127y.b(intent);
            return;
        }
        this.f15119q.s(fragment, intent, i4, bundle);
    }

    @Override // androidx.fragment.app.z
    public final void c(@androidx.annotation.N String str) {
        n remove = this.f15114l.remove(str);
        if (remove != null) {
            remove.c();
        }
        if (S0(2)) {
            Log.v(f15087P, "Clearing FragmentResultListener for key " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c1(@androidx.annotation.N Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @androidx.annotation.P Intent intent, int i5, int i6, int i7, @androidx.annotation.P Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f15128z != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra(f15089R, true);
                } else {
                    intent2 = intent;
                }
                if (S0(2)) {
                    Log.v(f15087P, "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra(C1001b.n.f20939b, bundle);
            } else {
                intent2 = intent;
            }
            androidx.activity.result.l a4 = new l.b(intentSender).b(intent2).c(i6, i5).a();
            this.f15091B.addLast(new m(fragment.f14997J, i4));
            if (S0(2)) {
                Log.v(f15087P, "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f15128z.b(a4);
            return;
        }
        this.f15119q.t(fragment, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    @Override // androidx.fragment.app.z
    public final void d(@androidx.annotation.N String str) {
        this.f15113k.remove(str);
        if (S0(2)) {
            Log.v(f15087P, "Clearing fragment result with key " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(@androidx.annotation.N p pVar, boolean z3) {
        if (!z3) {
            if (this.f15119q == null) {
                if (this.f15095F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            s();
        }
        synchronized (this.f15103a) {
            try {
                if (this.f15119q == null) {
                    if (z3) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f15103a.add(pVar);
                    L1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d1(int i4, boolean z3) {
        AbstractC0894l<?> abstractC0894l;
        if (this.f15119q == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z3 && i4 == this.f15118p) {
            return;
        }
        this.f15118p = i4;
        this.f15105c.u();
        U1();
        if (this.f15092C && (abstractC0894l = this.f15119q) != null && this.f15118p == 7) {
            abstractC0894l.u();
            this.f15092C = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1() {
        if (this.f15119q == null) {
            return;
        }
        this.f15093D = false;
        this.f15094E = false;
        this.f15100K.H(false);
        for (Fragment fragment : this.f15105c.p()) {
            if (fragment != null) {
                fragment.A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f0(boolean z3) {
        e0(z3);
        boolean z4 = false;
        while (t0(this.f15097H, this.f15098I)) {
            z4 = true;
            this.f15104b = true;
            try {
                w1(this.f15097H, this.f15098I);
            } finally {
                t();
            }
        }
        X1();
        Z();
        this.f15105c.b();
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f1(@androidx.annotation.N FragmentContainerView fragmentContainerView) {
        View view;
        for (B b4 : this.f15105c.l()) {
            Fragment k4 = b4.k();
            if (k4.f15016c0 == fragmentContainerView.getId() && (view = k4.f15026m0) != null && view.getParent() == null) {
                k4.f15025l0 = fragmentContainerView;
                b4.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(@androidx.annotation.N p pVar, boolean z3) {
        if (z3 && (this.f15119q == null || this.f15095F)) {
            return;
        }
        e0(z3);
        if (pVar.b(this.f15097H, this.f15098I)) {
            this.f15104b = true;
            try {
                w1(this.f15097H, this.f15098I);
            } finally {
                t();
            }
        }
        X1();
        Z();
        this.f15105c.b();
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public F g1() {
        return q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1(@androidx.annotation.N B b4) {
        Fragment k4 = b4.k();
        if (k4.f15027n0) {
            if (this.f15104b) {
                this.f15096G = true;
            } else {
                k4.f15027n0 = false;
                b4.m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(C0883a c0883a) {
        if (this.f15106d == null) {
            this.f15106d = new ArrayList<>();
        }
        this.f15106d.add(c0883a);
    }

    public void i1() {
        d0(new q(null, -1, 0), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B j(@androidx.annotation.N Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.i(fragment, str);
        }
        if (S0(2)) {
            Log.v(f15087P, "add: " + fragment);
        }
        B z3 = z(fragment);
        fragment.f15011X = this;
        this.f15105c.s(z3);
        if (!fragment.f15019f0) {
            this.f15105c.a(fragment);
            fragment.f15004Q = false;
            if (fragment.f15026m0 == null) {
                fragment.f15031r0 = false;
            }
            if (T0(fragment)) {
                this.f15092C = true;
            }
        }
        return z3;
    }

    public boolean j0() {
        boolean f02 = f0(true);
        s0();
        return f02;
    }

    public void j1(int i4, int i5) {
        k1(i4, i5, false);
    }

    public void k(@androidx.annotation.N w wVar) {
        this.f15117o.add(wVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment k0(@androidx.annotation.N String str) {
        return this.f15105c.f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k1(int i4, int i5, boolean z3) {
        if (i4 >= 0) {
            d0(new q(null, i4, i5), z3);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    public void l(@androidx.annotation.N o oVar) {
        if (this.f15115m == null) {
            this.f15115m = new ArrayList<>();
        }
        this.f15115m.add(oVar);
    }

    public void l1(@androidx.annotation.P String str, int i4) {
        d0(new q(str, -1, i4), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@androidx.annotation.N Fragment fragment) {
        this.f15100K.u(fragment);
    }

    public boolean m1() {
        return p1(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f15111i.getAndIncrement();
    }

    @androidx.annotation.P
    public Fragment n0(@androidx.annotation.D int i4) {
        return this.f15105c.g(i4);
    }

    public boolean n1(int i4, int i5) {
        if (i4 >= 0) {
            return p1(null, i4, i5);
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public void o(@androidx.annotation.N AbstractC0894l<?> abstractC0894l, @androidx.annotation.N AbstractC0891i abstractC0891i, @androidx.annotation.P Fragment fragment) {
        String str;
        if (this.f15119q == null) {
            this.f15119q = abstractC0894l;
            this.f15120r = abstractC0891i;
            this.f15121s = fragment;
            if (fragment != null) {
                k(new e(fragment));
            } else if (abstractC0894l instanceof w) {
                k((w) abstractC0894l);
            }
            if (this.f15121s != null) {
                X1();
            }
            if (abstractC0894l instanceof androidx.activity.o) {
                androidx.activity.o oVar = (androidx.activity.o) abstractC0894l;
                OnBackPressedDispatcher d4 = oVar.d();
                this.f15109g = d4;
                androidx.lifecycle.E e4 = oVar;
                if (fragment != null) {
                    e4 = fragment;
                }
                d4.c(e4, this.f15110h);
            }
            if (fragment != null) {
                this.f15100K = fragment.f15011X.y0(fragment);
            } else if (abstractC0894l instanceof q0) {
                this.f15100K = v.A(((q0) abstractC0894l).getViewModelStore());
            } else {
                this.f15100K = new v(false);
            }
            this.f15100K.H(Y0());
            this.f15105c.B(this.f15100K);
            Object obj = this.f15119q;
            if ((obj instanceof androidx.savedstate.e) && fragment == null) {
                androidx.savedstate.c savedStateRegistry = ((androidx.savedstate.e) obj).getSavedStateRegistry();
                savedStateRegistry.j(f15085N, new c.InterfaceC0173c() { // from class: androidx.fragment.app.q
                    @Override // androidx.savedstate.c.InterfaceC0173c
                    public final Bundle a() {
                        Bundle Z02;
                        Z02 = FragmentManager.this.Z0();
                        return Z02;
                    }
                });
                Bundle b4 = savedStateRegistry.b(f15085N);
                if (b4 != null) {
                    D1(b4.getParcelable(f15085N));
                }
            }
            Object obj2 = this.f15119q;
            if (obj2 instanceof androidx.activity.result.k) {
                ActivityResultRegistry o4 = ((androidx.activity.result.k) obj2).o();
                if (fragment != null) {
                    str = fragment.f14997J + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f15127y = o4.j(str2 + "StartActivityForResult", new C1001b.n(), new f());
                this.f15128z = o4.j(str2 + "StartIntentSenderForResult", new k(), new g());
                this.f15090A = o4.j(str2 + "RequestPermissions", new C1001b.l(), new h());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    @androidx.annotation.P
    public Fragment o0(@androidx.annotation.P String str) {
        return this.f15105c.h(str);
    }

    public boolean o1(@androidx.annotation.P String str, int i4) {
        return p1(str, -1, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(@androidx.annotation.N Fragment fragment) {
        if (S0(2)) {
            Log.v(f15087P, "attach: " + fragment);
        }
        if (fragment.f15019f0) {
            fragment.f15019f0 = false;
            if (!fragment.f15003P) {
                this.f15105c.a(fragment);
                if (S0(2)) {
                    Log.v(f15087P, "add from attach: " + fragment);
                }
                if (T0(fragment)) {
                    this.f15092C = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment p0(@androidx.annotation.N String str) {
        return this.f15105c.i(str);
    }

    @androidx.annotation.N
    public F q() {
        return new C0883a(this);
    }

    boolean q1(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2, @androidx.annotation.P String str, int i4, int i5) {
        boolean z3;
        if ((i5 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int l02 = l0(str, i4, z3);
        if (l02 < 0) {
            return false;
        }
        for (int size = this.f15106d.size() - 1; size >= l02; size--) {
            arrayList.add(this.f15106d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    boolean r() {
        boolean z3 = false;
        for (Fragment fragment : this.f15105c.m()) {
            if (fragment != null) {
                z3 = T0(fragment);
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public void r1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N String str, @androidx.annotation.N Fragment fragment) {
        if (fragment.f15011X != this) {
            V1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f14997J);
    }

    public void s1(@androidx.annotation.N l lVar, boolean z3) {
        this.f15116n.o(lVar, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t1(@androidx.annotation.N Fragment fragment) {
        if (S0(2)) {
            Log.v(f15087P, "remove: " + fragment + " nesting=" + fragment.f15010W);
        }
        boolean z3 = !fragment.y();
        if (!fragment.f15019f0 || z3) {
            this.f15105c.v(fragment);
            if (T0(fragment)) {
                this.f15092C = true;
            }
            fragment.f15004Q = true;
            S1(fragment);
        }
    }

    @androidx.annotation.N
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f15121s;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f15121s)));
            sb.append("}");
        } else {
            AbstractC0894l<?> abstractC0894l = this.f15119q;
            if (abstractC0894l != null) {
                sb.append(abstractC0894l.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f15119q)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u(@androidx.annotation.N String str) {
        d0(new j(str), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u0() {
        return this.f15105c.k();
    }

    public void u1(@androidx.annotation.N w wVar) {
        this.f15117o.remove(wVar);
    }

    boolean v(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2, @androidx.annotation.N String str) {
        if (!B1(arrayList, arrayList2, str)) {
            return false;
        }
        return q1(arrayList, arrayList2, str, -1, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public List<Fragment> v0() {
        return this.f15105c.m();
    }

    public void v1(@androidx.annotation.N o oVar) {
        ArrayList<o> arrayList = this.f15115m;
        if (arrayList != null) {
            arrayList.remove(oVar);
        }
    }

    @androidx.annotation.N
    public i w0(int i4) {
        return this.f15106d.get(i4);
    }

    public int x0() {
        ArrayList<C0883a> arrayList = this.f15106d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x1(@androidx.annotation.N Fragment fragment) {
        this.f15100K.F(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public B z(@androidx.annotation.N Fragment fragment) {
        B o4 = this.f15105c.o(fragment.f14997J);
        if (o4 != null) {
            return o4;
        }
        B b4 = new B(this.f15116n, this.f15105c, fragment);
        b4.o(this.f15119q.g().getClassLoader());
        b4.u(this.f15118p);
        return b4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public AbstractC0891i z0() {
        return this.f15120r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z1(@androidx.annotation.P Parcelable parcelable, @androidx.annotation.P t tVar) {
        if (this.f15119q instanceof q0) {
            V1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f15100K.G(tVar);
        D1(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        String f15144E;

        /* renamed from: F, reason: collision with root package name */
        int f15145F;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i4) {
                return new m[i4];
            }
        }

        m(@androidx.annotation.N String str, int i4) {
            this.f15144E = str;
            this.f15145F = i4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f15144E);
            parcel.writeInt(this.f15145F);
        }

        m(@androidx.annotation.N Parcel parcel) {
            this.f15144E = parcel.readString();
            this.f15145F = parcel.readInt();
        }
    }
}
