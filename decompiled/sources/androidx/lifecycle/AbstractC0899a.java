package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.m0;
import kotlin.jvm.internal.C2197u;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0899a extends m0.d implements m0.b {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final C0136a f15552e = new C0136a(null);

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final String f15553f = "androidx.lifecycle.savedstate.vm.tag";

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private androidx.savedstate.c f15554b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private Lifecycle f15555c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private Bundle f15556d;

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0136a {
        public /* synthetic */ C0136a(C2197u c2197u) {
            this();
        }

        private C0136a() {
        }
    }

    public AbstractC0899a() {
    }

    private final <T extends j0> T e(String str, Class<T> cls) {
        androidx.savedstate.c cVar = this.f15554b;
        kotlin.jvm.internal.F.m(cVar);
        Lifecycle lifecycle = this.f15555c;
        kotlin.jvm.internal.F.m(lifecycle);
        SavedStateHandleController b4 = LegacySavedStateHandleController.b(cVar, lifecycle, str, this.f15556d);
        T t3 = (T) f(str, cls, b4.d());
        t3.t("androidx.lifecycle.savedstate.vm.tag", b4);
        return t3;
    }

    @Override // androidx.lifecycle.m0.b
    @l3.d
    public <T extends j0> T a(@l3.d Class<T> modelClass) {
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.f15555c != null) {
                return (T) e(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.m0.b
    @l3.d
    public <T extends j0> T c(@l3.d Class<T> modelClass, @l3.d R.a extras) {
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        kotlin.jvm.internal.F.p(extras, "extras");
        String str = (String) extras.a(m0.c.f15686d);
        if (str != null) {
            if (this.f15554b != null) {
                return (T) e(str, modelClass);
            }
            return (T) f(str, modelClass, b0.a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.m0.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d(@l3.d j0 viewModel) {
        kotlin.jvm.internal.F.p(viewModel, "viewModel");
        androidx.savedstate.c cVar = this.f15554b;
        if (cVar != null) {
            kotlin.jvm.internal.F.m(cVar);
            Lifecycle lifecycle = this.f15555c;
            kotlin.jvm.internal.F.m(lifecycle);
            LegacySavedStateHandleController.a(viewModel, cVar, lifecycle);
        }
    }

    @l3.d
    protected abstract <T extends j0> T f(@l3.d String str, @l3.d Class<T> cls, @l3.d a0 a0Var);

    public AbstractC0899a(@l3.d androidx.savedstate.e owner, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(owner, "owner");
        this.f15554b = owner.getSavedStateRegistry();
        this.f15555c = owner.getLifecycle();
        this.f15556d = bundle;
    }
}
