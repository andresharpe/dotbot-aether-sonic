package androidx.lifecycle;

import R.a;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m0;
import androidx.savedstate.c;
import kotlin.jvm.internal.Lambda;

@W2.i(name = "SavedStateHandleSupport")
@kotlin.jvm.internal.U({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,221:1\n1#2:222\n31#3:223\n63#3,2:224\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:223\n110#1:224,2\n*E\n"})
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final String f15569a = "androidx.lifecycle.internal.SavedStateHandlesVM";

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f15570b = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    /* renamed from: c, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final a.b<androidx.savedstate.e> f15571c = new b();

    /* renamed from: d, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final a.b<q0> f15572d = new c();

    /* renamed from: e, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final a.b<Bundle> f15573e = new a();

    /* loaded from: classes.dex */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.b<androidx.savedstate.e> {
        b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a.b<q0> {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends Lambda implements X2.l<R.a, d0> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f15574F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final d0 C(@l3.d R.a initializer) {
            kotlin.jvm.internal.F.p(initializer, "$this$initializer");
            return new d0();
        }
    }

    @l3.d
    @androidx.annotation.K
    public static final a0 a(@l3.d R.a aVar) {
        kotlin.jvm.internal.F.p(aVar, "<this>");
        androidx.savedstate.e eVar = (androidx.savedstate.e) aVar.a(f15571c);
        if (eVar != null) {
            q0 q0Var = (q0) aVar.a(f15572d);
            if (q0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f15573e);
                String str = (String) aVar.a(m0.c.f15686d);
                if (str != null) {
                    return b(eVar, q0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final a0 b(androidx.savedstate.e eVar, q0 q0Var, String str, Bundle bundle) {
        c0 d4 = d(eVar);
        d0 e4 = e(q0Var);
        a0 a0Var = e4.u().get(str);
        if (a0Var == null) {
            a0 a4 = a0.f15557f.a(d4.b(str), bundle);
            e4.u().put(str, a4);
            return a4;
        }
        return a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.K
    public static final <T extends androidx.savedstate.e & q0> void c(@l3.d T t3) {
        kotlin.jvm.internal.F.p(t3, "<this>");
        Lifecycle.State b4 = t3.getLifecycle().b();
        if (b4 != Lifecycle.State.INITIALIZED && b4 != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t3.getSavedStateRegistry().c(f15570b) == null) {
            c0 c0Var = new c0(t3.getSavedStateRegistry(), t3);
            t3.getSavedStateRegistry().j(f15570b, c0Var);
            t3.getLifecycle().a(new SavedStateHandleAttacher(c0Var));
        }
    }

    @l3.d
    public static final c0 d(@l3.d androidx.savedstate.e eVar) {
        c0 c0Var;
        kotlin.jvm.internal.F.p(eVar, "<this>");
        c.InterfaceC0173c c4 = eVar.getSavedStateRegistry().c(f15570b);
        if (c4 instanceof c0) {
            c0Var = (c0) c4;
        } else {
            c0Var = null;
        }
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @l3.d
    public static final d0 e(@l3.d q0 q0Var) {
        kotlin.jvm.internal.F.p(q0Var, "<this>");
        R.c cVar = new R.c();
        cVar.a(kotlin.jvm.internal.N.d(d0.class), d.f15574F);
        return (d0) new m0(q0Var, cVar.b()).b(f15569a, d0.class);
    }
}
