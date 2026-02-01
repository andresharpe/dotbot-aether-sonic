package androidx.lifecycle;

import kotlin.H0;
import kotlin.InterfaceC2205l;

/* loaded from: classes.dex */
public final class K {

    @kotlin.jvm.internal.U({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\nandroidx/lifecycle/LiveDataKt$observe$wrappedObserver$1\n*L\n1#1,55:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements Q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.l<T, H0> f15432a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(X2.l<? super T, H0> lVar) {
            this.f15432a = lVar;
        }

        @Override // androidx.lifecycle.Q
        public final void f(T t3) {
            this.f15432a.C(t3);
        }
    }

    @l3.d
    @InterfaceC2205l(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @androidx.annotation.K
    public static final <T> Q<T> a(@l3.d LiveData<T> liveData, @l3.d E owner, @l3.d X2.l<? super T, H0> onChanged) {
        kotlin.jvm.internal.F.p(liveData, "<this>");
        kotlin.jvm.internal.F.p(owner, "owner");
        kotlin.jvm.internal.F.p(onChanged, "onChanged");
        a aVar = new a(onChanged);
        liveData.k(owner, aVar);
        return aVar;
    }
}
