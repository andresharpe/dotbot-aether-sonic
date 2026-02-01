package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.C2101p;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class ExceptionsConstructorKt {

    /* renamed from: a, reason: collision with root package name */
    private static final int f54431a = f(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final AbstractC2305l f54432b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            l4 = kotlin.comparisons.g.l(Integer.valueOf(((Constructor) t4).getParameterTypes().length), Integer.valueOf(((Constructor) t3).getParameterTypes().length));
            return l4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l {

        /* renamed from: F, reason: collision with root package name */
        public static final b f54437F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void C(@l3.d Throwable th) {
            return null;
        }
    }

    static {
        AbstractC2305l abstractC2305l;
        try {
            if (C2309p.a()) {
                abstractC2305l = e0.f54481a;
            } else {
                abstractC2305l = C2299f.f54484a;
            }
        } catch (Throwable unused) {
            abstractC2305l = e0.f54481a;
        }
        f54432b = abstractC2305l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> X2.l<Throwable, Throwable> b(Class<E> cls) {
        List Lv;
        b bVar = b.f54437F;
        if (f54431a == f(cls, 0)) {
            Lv = C2101p.Lv(cls.getConstructors(), new a());
            Iterator it = Lv.iterator();
            while (it.hasNext()) {
                X2.l<Throwable, Throwable> c4 = c((Constructor) it.next());
                if (c4 != null) {
                    return c4;
                }
            }
            return bVar;
        }
        return bVar;
    }

    private static final X2.l<Throwable, Throwable> c(final Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length != 2 || !kotlin.jvm.internal.F.g(parameterTypes[0], String.class) || !kotlin.jvm.internal.F.g(parameterTypes[1], Throwable.class)) {
                    return null;
                }
                return new X2.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // X2.l
                    @l3.e
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Throwable C(@l3.d Throwable th) {
                        Object b4;
                        Object newInstance;
                        try {
                            Result.a aVar = Result.f51807F;
                            newInstance = constructor.newInstance(th.getMessage(), th);
                        } catch (Throwable th2) {
                            Result.a aVar2 = Result.f51807F;
                            b4 = Result.b(kotlin.W.a(th2));
                        }
                        if (newInstance != null) {
                            b4 = Result.b((Throwable) newInstance);
                            if (Result.i(b4)) {
                                b4 = null;
                            }
                            return (Throwable) b4;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                };
            }
            Class<?> cls = parameterTypes[0];
            if (kotlin.jvm.internal.F.g(cls, Throwable.class)) {
                return new X2.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // X2.l
                    @l3.e
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Throwable C(@l3.d Throwable th) {
                        Object b4;
                        Object newInstance;
                        try {
                            Result.a aVar = Result.f51807F;
                            newInstance = constructor.newInstance(th);
                        } catch (Throwable th2) {
                            Result.a aVar2 = Result.f51807F;
                            b4 = Result.b(kotlin.W.a(th2));
                        }
                        if (newInstance != null) {
                            b4 = Result.b((Throwable) newInstance);
                            if (Result.i(b4)) {
                                b4 = null;
                            }
                            return (Throwable) b4;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                };
            }
            if (!kotlin.jvm.internal.F.g(cls, String.class)) {
                return null;
            }
            return new X2.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // X2.l
                @l3.e
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Throwable C(@l3.d Throwable th) {
                    Object b4;
                    Object newInstance;
                    try {
                        Result.a aVar = Result.f51807F;
                        newInstance = constructor.newInstance(th.getMessage());
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.f51807F;
                        b4 = Result.b(kotlin.W.a(th2));
                    }
                    if (newInstance != null) {
                        Throwable th3 = (Throwable) newInstance;
                        th3.initCause(th);
                        b4 = Result.b(th3);
                        if (Result.i(b4)) {
                            b4 = null;
                        }
                        return (Throwable) b4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
            };
        }
        return new X2.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // X2.l
            @l3.e
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Throwable C(@l3.d Throwable th) {
                Object b4;
                Object newInstance;
                try {
                    Result.a aVar = Result.f51807F;
                    newInstance = constructor.newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.f51807F;
                    b4 = Result.b(kotlin.W.a(th2));
                }
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    b4 = Result.b(th3);
                    if (Result.i(b4)) {
                        b4 = null;
                    }
                    return (Throwable) b4;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
        };
    }

    private static final int d(Class<?> cls, int i4) {
        do {
            int length = cls.getDeclaredFields().length;
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (!Modifier.isStatic(r0[i6].getModifiers())) {
                    i5++;
                }
            }
            i4 += i5;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i4;
    }

    static /* synthetic */ int e(Class cls, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return d(cls, i4);
    }

    private static final int f(Class<?> cls, int i4) {
        Object b4;
        W2.b.i(cls);
        try {
            Result.a aVar = Result.f51807F;
            b4 = Result.b(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(kotlin.W.a(th));
        }
        Integer valueOf = Integer.valueOf(i4);
        if (Result.i(b4)) {
            b4 = valueOf;
        }
        return ((Number) b4).intValue();
    }

    private static final X2.l<Throwable, Throwable> g(final X2.l<? super Throwable, ? extends Throwable> lVar) {
        return new X2.l<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // X2.l
            @l3.e
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Throwable C(@l3.d Throwable th) {
                Object b4;
                X2.l<Throwable, Throwable> lVar2 = lVar;
                try {
                    Result.a aVar = Result.f51807F;
                    b4 = Result.b(lVar2.C(th));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.f51807F;
                    b4 = Result.b(kotlin.W.a(th2));
                }
                if (Result.i(b4)) {
                    b4 = null;
                }
                return (Throwable) b4;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    public static final <E extends Throwable> E h(@l3.d E e4) {
        Object b4;
        if (e4 instanceof kotlinx.coroutines.L) {
            try {
                Result.a aVar = Result.f51807F;
                b4 = Result.b(((kotlinx.coroutines.L) e4).a());
            } catch (Throwable th) {
                Result.a aVar2 = Result.f51807F;
                b4 = Result.b(kotlin.W.a(th));
            }
            if (Result.i(b4)) {
                b4 = null;
            }
            return (E) b4;
        }
        return (E) f54432b.a(e4.getClass()).C(e4);
    }
}
