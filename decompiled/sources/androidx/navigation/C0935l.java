package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.C0741d;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.Pair;

@H
/* renamed from: androidx.navigation.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935l {

    /* renamed from: a, reason: collision with root package name */
    private int f16504a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final Map<String, Object> f16505b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private T f16506c;

    @l3.d
    public final C0934k a() {
        List J12;
        Bundle b4;
        int i4 = this.f16504a;
        T t3 = this.f16506c;
        if (!this.f16505b.isEmpty()) {
            J12 = kotlin.collections.a0.J1(this.f16505b);
            Object[] array = J12.toArray(new Pair[0]);
            if (array != null) {
                Pair[] pairArr = (Pair[]) array;
                b4 = C0741d.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        } else {
            b4 = null;
        }
        return new C0934k(i4, t3, b4);
    }

    @l3.d
    public final Map<String, Object> b() {
        return this.f16505b;
    }

    public final int c() {
        return this.f16504a;
    }

    public final void d(@l3.d X2.l<? super U, H0> optionsBuilder) {
        kotlin.jvm.internal.F.p(optionsBuilder, "optionsBuilder");
        U u3 = new U();
        optionsBuilder.C(u3);
        this.f16506c = u3.b();
    }

    public final void e(int i4) {
        this.f16504a = i4;
    }
}
