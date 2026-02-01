package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.InterfaceC0936m;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: androidx.navigation.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937n<Args extends InterfaceC0936m> implements kotlin.A<Args> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.reflect.d<Args> f16507E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final X2.a<Bundle> f16508F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private Args f16509G;

    public C0937n(@l3.d kotlin.reflect.d<Args> navArgsClass, @l3.d X2.a<Bundle> argumentProducer) {
        kotlin.jvm.internal.F.p(navArgsClass, "navArgsClass");
        kotlin.jvm.internal.F.p(argumentProducer, "argumentProducer");
        this.f16507E = navArgsClass;
        this.f16508F = argumentProducer;
    }

    @Override // kotlin.A
    public boolean a() {
        if (this.f16509G != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.A
    @l3.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Args getValue() {
        Args args = this.f16509G;
        if (args == null) {
            Bundle n4 = this.f16508F.n();
            Method method = C0938o.a().get(this.f16507E);
            if (method == null) {
                Class e4 = W2.b.e(this.f16507E);
                Class<Bundle>[] b4 = C0938o.b();
                method = e4.getMethod("fromBundle", (Class[]) Arrays.copyOf(b4, b4.length));
                C0938o.a().put(this.f16507E, method);
                kotlin.jvm.internal.F.o(method, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke = method.invoke(null, n4);
            if (invoke != null) {
                Args args2 = (Args) invoke;
                this.f16509G = args2;
                return args2;
            }
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        return args;
    }
}
