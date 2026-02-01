package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.W0;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final E f54428a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f54429b = false;

    /* renamed from: c, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final W0 f54430c;

    static {
        E e4 = new E();
        f54428a = e4;
        U.e("kotlinx.coroutines.fast.service.loader", true);
        f54430c = e4.a();
    }

    private E() {
    }

    private final W0 a() {
        kotlin.sequences.m e4;
        List c32;
        Object next;
        W0 f4;
        try {
            e4 = kotlin.sequences.s.e(ServiceLoader.load(D.class, D.class.getClassLoader()).iterator());
            c32 = SequencesKt___SequencesKt.c3(e4);
            Iterator it = c32.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int c4 = ((D) next).c();
                    do {
                        Object next2 = it.next();
                        int c5 = ((D) next2).c();
                        if (c4 < c5) {
                            next = next2;
                            c4 = c5;
                        }
                    } while (it.hasNext());
                }
            }
            D d4 = (D) next;
            if (d4 != null && (f4 = F.f(d4, c32)) != null) {
                return f4;
            }
            return F.b(null, null, 3, null);
        } catch (Throwable th) {
            return F.b(th, null, 2, null);
        }
    }
}
