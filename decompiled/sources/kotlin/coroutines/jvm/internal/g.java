package kotlin.coroutines.jvm.internal;

import N0.a;
import java.lang.reflect.Method;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final g f52075a = new g();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final a f52076b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private static a f52077c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Method f52078a;

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Method f52079b;

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Method f52080c;

        public a(@l3.e Method method, @l3.e Method method2, @l3.e Method method3) {
            this.f52078a = method;
            this.f52079b = method2;
            this.f52080c = method3;
        }
    }

    private g() {
    }

    private final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(a.C0015a.f1688b, new Class[0]));
            f52077c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f52076b;
            f52077c = aVar2;
            return aVar2;
        }
    }

    @l3.e
    public final String b(@l3.d BaseContinuationImpl continuation) {
        Object obj;
        Object obj2;
        Object obj3;
        F.p(continuation, "continuation");
        a aVar = f52077c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f52076b) {
            return null;
        }
        Method method = aVar.f52078a;
        if (method != null) {
            obj = method.invoke(continuation.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f52079b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f52080c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
