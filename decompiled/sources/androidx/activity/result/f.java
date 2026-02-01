package androidx.activity.result;

import b.AbstractC1000a;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class f {
    @l3.d
    public static final <I, O> i<H0> c(@l3.d c cVar, @l3.d AbstractC1000a<I, O> contract, I i4, @l3.d final X2.l<? super O, H0> callback) {
        F.p(cVar, "<this>");
        F.p(contract, "contract");
        F.p(callback, "callback");
        i<I> registerForActivityResult = cVar.registerForActivityResult(contract, new b() { // from class: androidx.activity.result.e
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                f.f(X2.l.this, obj);
            }
        });
        F.o(registerForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new g(registerForActivityResult, contract, i4);
    }

    @l3.d
    public static final <I, O> i<H0> d(@l3.d c cVar, @l3.d AbstractC1000a<I, O> contract, I i4, @l3.d ActivityResultRegistry registry, @l3.d final X2.l<? super O, H0> callback) {
        F.p(cVar, "<this>");
        F.p(contract, "contract");
        F.p(registry, "registry");
        F.p(callback, "callback");
        i<I> registerForActivityResult = cVar.registerForActivityResult(contract, registry, new b() { // from class: androidx.activity.result.d
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                f.e(X2.l.this, obj);
            }
        });
        F.o(registerForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new g(registerForActivityResult, contract, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(X2.l callback, Object obj) {
        F.p(callback, "$callback");
        callback.C(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(X2.l callback, Object obj) {
        F.p(callback, "$callback");
        callback.C(obj);
    }
}
