package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.m0;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends m0.d implements m0.b {

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private Application f15604b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final m0.b f15605c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private Bundle f15606d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private Lifecycle f15607e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private androidx.savedstate.c f15608f;

    public e0() {
        this.f15605c = new m0.a();
    }

    @Override // androidx.lifecycle.m0.b
    @l3.d
    public <T extends j0> T a(@l3.d Class<T> modelClass) {
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.m0.b
    @l3.d
    public <T extends j0> T c(@l3.d Class<T> modelClass, @l3.d R.a extras) {
        List list;
        Constructor c4;
        List list2;
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        kotlin.jvm.internal.F.p(extras, "extras");
        String str = (String) extras.a(m0.c.f15686d);
        if (str != null) {
            if (extras.a(b0.f15571c) != null && extras.a(b0.f15572d) != null) {
                Application application = (Application) extras.a(m0.a.f15679i);
                boolean isAssignableFrom = C0900b.class.isAssignableFrom(modelClass);
                if (!isAssignableFrom || application == null) {
                    list = f0.f15611b;
                    c4 = f0.c(modelClass, list);
                } else {
                    list2 = f0.f15610a;
                    c4 = f0.c(modelClass, list2);
                }
                if (c4 == null) {
                    return (T) this.f15605c.c(modelClass, extras);
                }
                if (isAssignableFrom && application != null) {
                    return (T) f0.d(modelClass, c4, application, b0.a(extras));
                }
                return (T) f0.d(modelClass, c4, b0.a(extras));
            }
            if (this.f15607e != null) {
                return (T) e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.m0.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d(@l3.d j0 viewModel) {
        kotlin.jvm.internal.F.p(viewModel, "viewModel");
        if (this.f15607e != null) {
            androidx.savedstate.c cVar = this.f15608f;
            kotlin.jvm.internal.F.m(cVar);
            Lifecycle lifecycle = this.f15607e;
            kotlin.jvm.internal.F.m(lifecycle);
            LegacySavedStateHandleController.a(viewModel, cVar, lifecycle);
        }
    }

    @l3.d
    public final <T extends j0> T e(@l3.d String key, @l3.d Class<T> modelClass) {
        List list;
        Constructor c4;
        T t3;
        Application application;
        List list2;
        kotlin.jvm.internal.F.p(key, "key");
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        Lifecycle lifecycle = this.f15607e;
        if (lifecycle != null) {
            boolean isAssignableFrom = C0900b.class.isAssignableFrom(modelClass);
            if (!isAssignableFrom || this.f15604b == null) {
                list = f0.f15611b;
                c4 = f0.c(modelClass, list);
            } else {
                list2 = f0.f15610a;
                c4 = f0.c(modelClass, list2);
            }
            if (c4 == null) {
                if (this.f15604b != null) {
                    return (T) this.f15605c.a(modelClass);
                }
                return (T) m0.c.f15684b.a().a(modelClass);
            }
            androidx.savedstate.c cVar = this.f15608f;
            kotlin.jvm.internal.F.m(cVar);
            SavedStateHandleController b4 = LegacySavedStateHandleController.b(cVar, lifecycle, key, this.f15606d);
            if (isAssignableFrom && (application = this.f15604b) != null) {
                kotlin.jvm.internal.F.m(application);
                t3 = (T) f0.d(modelClass, c4, application, b4.d());
            } else {
                t3 = (T) f0.d(modelClass, c4, b4.d());
            }
            t3.t("androidx.lifecycle.savedstate.vm.tag", b4);
            return t3;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(@l3.e Application application, @l3.d androidx.savedstate.e owner) {
        this(application, owner, null);
        kotlin.jvm.internal.F.p(owner, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public e0(@l3.e Application application, @l3.d androidx.savedstate.e owner, @l3.e Bundle bundle) {
        m0.a aVar;
        kotlin.jvm.internal.F.p(owner, "owner");
        this.f15608f = owner.getSavedStateRegistry();
        this.f15607e = owner.getLifecycle();
        this.f15606d = bundle;
        this.f15604b = application;
        if (application != null) {
            aVar = m0.a.f15676f.b(application);
        } else {
            aVar = new m0.a();
        }
        this.f15605c = aVar;
    }
}
