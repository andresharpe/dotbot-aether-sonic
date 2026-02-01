package kotlin.coroutines;

import kotlin.Y;
import kotlin.coroutines.f;
import kotlin.jvm.internal.F;
import kotlin.r;

/* loaded from: classes2.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    @r
    @l3.e
    @Y(version = "1.3")
    public static final <E extends f.b> E a(@l3.d f.b bVar, @l3.d f.c<E> key) {
        F.p(bVar, "<this>");
        F.p(key, "key");
        if (key instanceof b) {
            b bVar2 = (b) key;
            if (!bVar2.a(bVar.getKey())) {
                return null;
            }
            E e4 = (E) bVar2.b(bVar);
            if (!(e4 instanceof f.b)) {
                return null;
            }
            return e4;
        }
        if (bVar.getKey() != key) {
            return null;
        }
        return bVar;
    }

    @r
    @l3.d
    @Y(version = "1.3")
    public static final f b(@l3.d f.b bVar, @l3.d f.c<?> key) {
        F.p(bVar, "<this>");
        F.p(key, "key");
        if (key instanceof b) {
            b bVar2 = (b) key;
            if (bVar2.a(bVar.getKey()) && bVar2.b(bVar) != null) {
                return EmptyCoroutineContext.f52041E;
            }
            return bVar;
        }
        if (bVar.getKey() == key) {
            return EmptyCoroutineContext.f52041E;
        }
        return bVar;
    }
}
