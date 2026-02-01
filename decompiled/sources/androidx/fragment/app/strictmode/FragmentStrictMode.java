package androidx.fragment.app.strictmode;

import W2.f;
import W2.n;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.E;
import kotlin.collections.D;
import kotlin.collections.Y;
import kotlin.collections.j0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes.dex */
public final class FragmentStrictMode {

    /* renamed from: b, reason: collision with root package name */
    @d
    private static final String f15334b = "FragmentStrictMode";

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final FragmentStrictMode f15333a = new FragmentStrictMode();

    /* renamed from: c, reason: collision with root package name */
    @d
    private static b f15335c = b.f15337e;

    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(@d Violation violation);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        @d
        public static final C0132b f15336d = new C0132b(null);

        /* renamed from: e, reason: collision with root package name */
        @f
        @d
        public static final b f15337e;

        /* renamed from: a, reason: collision with root package name */
        @d
        private final Set<Flag> f15338a;

        /* renamed from: b, reason: collision with root package name */
        @e
        private final a f15339b;

        /* renamed from: c, reason: collision with root package name */
        @d
        private final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> f15340c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            @e
            private a f15342b;

            /* renamed from: a, reason: collision with root package name */
            @d
            private final Set<Flag> f15341a = new LinkedHashSet();

            /* renamed from: c, reason: collision with root package name */
            @d
            private final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> f15343c = new LinkedHashMap();

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a a(@d Class<? extends Fragment> fragmentClass, @d Class<? extends Violation> violationClass) {
                F.p(fragmentClass, "fragmentClass");
                F.p(violationClass, "violationClass");
                Set<Class<? extends Violation>> set = this.f15343c.get(fragmentClass);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                set.add(violationClass);
                this.f15343c.put(fragmentClass, set);
                return this;
            }

            @d
            public final b b() {
                if (this.f15342b == null && !this.f15341a.contains(Flag.PENALTY_DEATH)) {
                    k();
                }
                return new b(this.f15341a, this.f15342b, this.f15343c);
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a c() {
                this.f15341a.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a d() {
                this.f15341a.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a e() {
                this.f15341a.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a f() {
                this.f15341a.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a g() {
                this.f15341a.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a h() {
                this.f15341a.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a i() {
                this.f15341a.add(Flag.PENALTY_DEATH);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a j(@d a listener) {
                F.p(listener, "listener");
                this.f15342b = listener;
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a k() {
                this.f15341a.add(Flag.PENALTY_LOG);
                return this;
            }
        }

        /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0132b {
            public /* synthetic */ C0132b(C2197u c2197u) {
                this();
            }

            private C0132b() {
            }
        }

        static {
            Set k4;
            Map z3;
            k4 = j0.k();
            z3 = Y.z();
            f15337e = new b(k4, null, z3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@d Set<? extends Flag> flags, @e a aVar, @d Map<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            F.p(flags, "flags");
            F.p(allowedViolations, "allowedViolations");
            this.f15338a = flags;
            this.f15339b = aVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f15340c = linkedHashMap;
        }

        @d
        public final Set<Flag> a() {
            return this.f15338a;
        }

        @e
        public final a b() {
            return this.f15339b;
        }

        @d
        public final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> c() {
            return this.f15340c;
        }
    }

    private FragmentStrictMode() {
    }

    private final b d(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                F.o(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.L0() != null) {
                    b L02 = parentFragmentManager.L0();
                    F.m(L02);
                    F.o(L02, "fragmentManager.strictModePolicy!!");
                    return L02;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f15335c;
    }

    private final void e(final b bVar, final Violation violation) {
        Fragment a4 = violation.a();
        final String name = a4.getClass().getName();
        if (bVar.a().contains(Flag.PENALTY_LOG)) {
            Log.d(f15334b, F.C("Policy violation in ", name), violation);
        }
        if (bVar.b() != null) {
            s(a4, new Runnable() { // from class: B.a
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.f(FragmentStrictMode.b.this, violation);
                }
            });
        }
        if (bVar.a().contains(Flag.PENALTY_DEATH)) {
            s(a4, new Runnable() { // from class: B.b
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.g(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(b policy, Violation violation) {
        F.p(policy, "$policy");
        F.p(violation, "$violation");
        policy.b().a(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, Violation violation) {
        F.p(violation, "$violation");
        Log.e(f15334b, F.C("Policy violation with PENALTY_DEATH in ", str), violation);
        throw violation;
    }

    private final void h(Violation violation) {
        if (FragmentManager.S0(3)) {
            Log.d(FragmentManager.f15087P, F.C("StrictMode violation in ", violation.a().getClass().getName()), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void i(@d Fragment fragment, @d String previousFragmentId) {
        F.p(fragment, "fragment");
        F.p(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(fragmentReuseViolation);
        b d4 = fragmentStrictMode.d(fragment);
        if (d4.a().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.u(d4, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.e(d4, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void j(@d Fragment fragment, @e ViewGroup viewGroup) {
        F.p(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(fragmentTagUsageViolation);
        b d4 = fragmentStrictMode.d(fragment);
        if (d4.a().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.u(d4, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.e(d4, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void k(@d Fragment fragment) {
        F.p(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(getRetainInstanceUsageViolation);
        b d4 = fragmentStrictMode.d(fragment);
        if (d4.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.u(d4, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.e(d4, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void l(@d Fragment fragment) {
        F.p(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(getTargetFragmentRequestCodeUsageViolation);
        b d4 = fragmentStrictMode.d(fragment);
        if (d4.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.u(d4, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.e(d4, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void m(@d Fragment fragment) {
        F.p(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(getTargetFragmentUsageViolation);
        b d4 = fragmentStrictMode.d(fragment);
        if (d4.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.u(d4, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.e(d4, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void o(@d Fragment fragment) {
        F.p(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(setRetainInstanceUsageViolation);
        b d4 = fragmentStrictMode.d(fragment);
        if (d4.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.u(d4, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.e(d4, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void p(@d Fragment violatingFragment, @d Fragment targetFragment, int i4) {
        F.p(violatingFragment, "violatingFragment");
        F.p(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, i4);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(setTargetFragmentUsageViolation);
        b d4 = fragmentStrictMode.d(violatingFragment);
        if (d4.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.u(d4, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.e(d4, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void q(@d Fragment fragment, boolean z3) {
        F.p(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z3);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(setUserVisibleHintViolation);
        b d4 = fragmentStrictMode.d(fragment);
        if (d4.a().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.u(d4, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.e(d4, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void r(@d Fragment fragment, @d ViewGroup container) {
        F.p(fragment, "fragment");
        F.p(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        FragmentStrictMode fragmentStrictMode = f15333a;
        fragmentStrictMode.h(wrongFragmentContainerViolation);
        b d4 = fragmentStrictMode.d(fragment);
        if (d4.a().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.u(d4, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.e(d4, wrongFragmentContainerViolation);
        }
    }

    private final void s(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler h4 = fragment.getParentFragmentManager().F0().h();
            F.o(h4, "fragment.parentFragmentManager.host.handler");
            if (F.g(h4.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                h4.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean u(b bVar, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        boolean W12;
        Set<Class<? extends Violation>> set = bVar.c().get(cls);
        if (set == null) {
            return true;
        }
        if (!F.g(cls2.getSuperclass(), Violation.class)) {
            W12 = D.W1(set, cls2.getSuperclass());
            if (W12) {
                return false;
            }
        }
        return !set.contains(cls2);
    }

    @d
    public final b c() {
        return f15335c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i0
    public final void n(@d Violation violation) {
        F.p(violation, "violation");
        h(violation);
        Fragment a4 = violation.a();
        b d4 = d(a4);
        if (u(d4, a4.getClass(), violation.getClass())) {
            e(d4, violation);
        }
    }

    public final void t(@d b bVar) {
        F.p(bVar, "<set-?>");
        f15335c = bVar;
    }
}
