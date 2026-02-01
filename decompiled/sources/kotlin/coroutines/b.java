package kotlin.coroutines;

import X2.l;
import kotlin.Y;
import kotlin.coroutines.f;
import kotlin.coroutines.f.b;
import kotlin.jvm.internal.F;
import kotlin.r;

@r
@Y(version = "1.3")
/* loaded from: classes2.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final l<f.b, E> f52044E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final f.c<?> f52045F;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.f$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X2.l<kotlin.coroutines.f$b, E extends B>, X2.l<? super kotlin.coroutines.f$b, ? extends E extends B>, java.lang.Object] */
    public b(@l3.d f.c<B> baseKey, @l3.d l<? super f.b, ? extends E> safeCast) {
        F.p(baseKey, "baseKey");
        F.p(safeCast, "safeCast");
        this.f52044E = safeCast;
        this.f52045F = baseKey instanceof b ? (f.c<B>) ((b) baseKey).f52045F : baseKey;
    }

    public final boolean a(@l3.d f.c<?> key) {
        F.p(key, "key");
        if (key != this && this.f52045F != key) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/f$b;)TE; */
    @l3.e
    public final f.b b(@l3.d f.b element) {
        F.p(element, "element");
        return (f.b) this.f52044E.C(element);
    }
}
