package R;

import X2.l;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@g
@U({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final List<h<?>> f1728a = new ArrayList();

    public final <T extends j0> void a(@l3.d kotlin.reflect.d<T> clazz, @l3.d l<? super a, ? extends T> initializer) {
        F.p(clazz, "clazz");
        F.p(initializer, "initializer");
        this.f1728a.add(new h<>(W2.b.e(clazz), initializer));
    }

    @l3.d
    public final m0.b b() {
        h[] hVarArr = (h[]) this.f1728a.toArray(new h[0]);
        return new b((h[]) Arrays.copyOf(hVarArr, hVarArr.length));
    }
}
