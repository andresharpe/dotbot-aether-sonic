package R;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* loaded from: classes.dex */
public final class b implements m0.b {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final h<?>[] f1727b;

    public b(@l3.d h<?>... initializers) {
        F.p(initializers, "initializers");
        this.f1727b = initializers;
    }

    @Override // androidx.lifecycle.m0.b
    @l3.d
    public <T extends j0> T c(@l3.d Class<T> modelClass, @l3.d a extras) {
        F.p(modelClass, "modelClass");
        F.p(extras, "extras");
        T t3 = null;
        for (h<?> hVar : this.f1727b) {
            if (F.g(hVar.a(), modelClass)) {
                Object C3 = hVar.b().C(extras);
                if (C3 instanceof j0) {
                    t3 = (T) C3;
                } else {
                    t3 = null;
                }
            }
        }
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
