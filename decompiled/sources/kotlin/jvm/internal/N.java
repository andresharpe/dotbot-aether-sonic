package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.C2097l;
import kotlin.reflect.KVariance;

/* loaded from: classes2.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    private static final O f52289a;

    /* renamed from: b, reason: collision with root package name */
    static final String f52290b = " (Kotlin reflection is not available)";

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.d[] f52291c;

    static {
        O o4 = null;
        try {
            o4 = (O) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (o4 == null) {
            o4 = new O();
        }
        f52289a = o4;
        f52291c = new kotlin.reflect.d[0];
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r A(Class cls) {
        return f52289a.s(d(cls), Collections.emptyList(), false);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r B(Class cls, kotlin.reflect.t tVar) {
        return f52289a.s(d(cls), Collections.singletonList(tVar), false);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r C(Class cls, kotlin.reflect.t tVar, kotlin.reflect.t tVar2) {
        return f52289a.s(d(cls), Arrays.asList(tVar, tVar2), false);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r D(Class cls, kotlin.reflect.t... tVarArr) {
        return f52289a.s(d(cls), C2097l.Jy(tVarArr), false);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r E(kotlin.reflect.g gVar) {
        return f52289a.s(gVar, Collections.emptyList(), false);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.s F(Object obj, String str, KVariance kVariance, boolean z3) {
        return f52289a.t(obj, str, kVariance, z3);
    }

    public static kotlin.reflect.d a(Class cls) {
        return f52289a.a(cls);
    }

    public static kotlin.reflect.d b(Class cls, String str) {
        return f52289a.b(cls, str);
    }

    public static kotlin.reflect.i c(FunctionReference functionReference) {
        return f52289a.c(functionReference);
    }

    public static kotlin.reflect.d d(Class cls) {
        return f52289a.d(cls);
    }

    public static kotlin.reflect.d e(Class cls, String str) {
        return f52289a.e(cls, str);
    }

    public static kotlin.reflect.d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f52291c;
        }
        kotlin.reflect.d[] dVarArr = new kotlin.reflect.d[length];
        for (int i4 = 0; i4 < length; i4++) {
            dVarArr[i4] = d(clsArr[i4]);
        }
        return dVarArr;
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.h g(Class cls) {
        return f52289a.f(cls, "");
    }

    public static kotlin.reflect.h h(Class cls, String str) {
        return f52289a.f(cls, str);
    }

    @kotlin.Y(version = "1.6")
    public static kotlin.reflect.r i(kotlin.reflect.r rVar) {
        return f52289a.g(rVar);
    }

    public static kotlin.reflect.k j(MutablePropertyReference0 mutablePropertyReference0) {
        return f52289a.h(mutablePropertyReference0);
    }

    public static kotlin.reflect.l k(MutablePropertyReference1 mutablePropertyReference1) {
        return f52289a.i(mutablePropertyReference1);
    }

    public static kotlin.reflect.m l(MutablePropertyReference2 mutablePropertyReference2) {
        return f52289a.j(mutablePropertyReference2);
    }

    @kotlin.Y(version = "1.6")
    public static kotlin.reflect.r m(kotlin.reflect.r rVar) {
        return f52289a.k(rVar);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r n(Class cls) {
        return f52289a.s(d(cls), Collections.emptyList(), true);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r o(Class cls, kotlin.reflect.t tVar) {
        return f52289a.s(d(cls), Collections.singletonList(tVar), true);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r p(Class cls, kotlin.reflect.t tVar, kotlin.reflect.t tVar2) {
        return f52289a.s(d(cls), Arrays.asList(tVar, tVar2), true);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r q(Class cls, kotlin.reflect.t... tVarArr) {
        return f52289a.s(d(cls), C2097l.Jy(tVarArr), true);
    }

    @kotlin.Y(version = "1.4")
    public static kotlin.reflect.r r(kotlin.reflect.g gVar) {
        return f52289a.s(gVar, Collections.emptyList(), true);
    }

    @kotlin.Y(version = "1.6")
    public static kotlin.reflect.r s(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return f52289a.l(rVar, rVar2);
    }

    public static kotlin.reflect.o t(PropertyReference0 propertyReference0) {
        return f52289a.m(propertyReference0);
    }

    public static kotlin.reflect.p u(PropertyReference1 propertyReference1) {
        return f52289a.n(propertyReference1);
    }

    public static kotlin.reflect.q v(PropertyReference2 propertyReference2) {
        return f52289a.o(propertyReference2);
    }

    @kotlin.Y(version = "1.3")
    public static String w(B b4) {
        return f52289a.p(b4);
    }

    @kotlin.Y(version = "1.1")
    public static String x(Lambda lambda) {
        return f52289a.q(lambda);
    }

    @kotlin.Y(version = "1.4")
    public static void y(kotlin.reflect.s sVar, kotlin.reflect.r rVar) {
        f52289a.r(sVar, Collections.singletonList(rVar));
    }

    @kotlin.Y(version = "1.4")
    public static void z(kotlin.reflect.s sVar, kotlin.reflect.r... rVarArr) {
        f52289a.r(sVar, C2097l.Jy(rVarArr));
    }
}
