package kotlinx.coroutines.internal;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.internal.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2299f extends AbstractC2305l {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C2299f f54484a = new C2299f();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final a f54485b = new a();

    /* renamed from: kotlinx.coroutines.internal.f$a */
    /* loaded from: classes2.dex */
    public static final class a extends ClassValue<X2.l<? super Throwable, ? extends Throwable>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        @l3.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public X2.l<Throwable, Throwable> computeValue(@l3.e Class<?> cls) {
            X2.l<Throwable, Throwable> b4;
            if (cls != null) {
                b4 = ExceptionsConstructorKt.b(cls);
                return b4;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        }
    }

    private C2299f() {
    }

    @Override // kotlinx.coroutines.internal.AbstractC2305l
    @l3.d
    public X2.l<Throwable, Throwable> a(@l3.d Class<? extends Throwable> cls) {
        Object obj;
        obj = f54485b.get(cls);
        return (X2.l) obj;
    }
}
