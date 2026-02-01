package y1;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface d {
    <T> void b(Class<T> cls, Executor executor, b<? super T> bVar);

    <T> void c(Class<T> cls, b<? super T> bVar);

    <T> void d(Class<T> cls, b<? super T> bVar);
}
