package kotlin.reflect;

import kotlin.Y;
import kotlin.reflect.n;

/* loaded from: classes2.dex */
public interface p<T, V> extends n<V>, X2.l<T, V> {

    /* loaded from: classes2.dex */
    public interface a<T, V> extends n.c<V>, X2.l<T, V> {
    }

    @Override // kotlin.reflect.n
    @l3.d
    a<T, V> a();

    V get(T t3);

    @l3.e
    @Y(version = "1.1")
    Object r(T t3);
}
