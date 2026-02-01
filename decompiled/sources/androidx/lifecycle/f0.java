package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C2101p;
import kotlin.collections.C2108v;
import kotlin.collections.CollectionsKt__CollectionsKt;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final List<Class<?>> f15610a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final List<Class<?>> f15611b;

    static {
        List<Class<?>> O3;
        List<Class<?>> k4;
        O3 = CollectionsKt__CollectionsKt.O(Application.class, a0.class);
        f15610a = O3;
        k4 = C2108v.k(a0.class);
        f15611b = k4;
    }

    @l3.e
    public static final <T> Constructor<T> c(@l3.d Class<T> modelClass, @l3.d List<? extends Class<?>> signature) {
        List Jy;
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        kotlin.jvm.internal.F.p(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.F.o(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.F.o(parameterTypes, "constructor.parameterTypes");
            Jy = C2101p.Jy(parameterTypes);
            if (kotlin.jvm.internal.F.g(signature, Jy)) {
                kotlin.jvm.internal.F.n(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == Jy.size() && Jy.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends j0> T d(@l3.d Class<T> modelClass, @l3.d Constructor<T> constructor, @l3.d Object... params) {
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        kotlin.jvm.internal.F.p(constructor, "constructor");
        kotlin.jvm.internal.F.p(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access " + modelClass, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e6.getCause());
        }
    }
}
