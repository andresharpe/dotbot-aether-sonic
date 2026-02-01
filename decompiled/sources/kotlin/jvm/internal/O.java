package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KVariance;

/* loaded from: classes2.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    private static final String f52292a = "kotlin.jvm.functions.";

    public kotlin.reflect.d a(Class cls) {
        return new C2195s(cls);
    }

    public kotlin.reflect.d b(Class cls, String str) {
        return new C2195s(cls);
    }

    public kotlin.reflect.i c(FunctionReference functionReference) {
        return functionReference;
    }

    public kotlin.reflect.d d(Class cls) {
        return new C2195s(cls);
    }

    public kotlin.reflect.d e(Class cls, String str) {
        return new C2195s(cls);
    }

    public kotlin.reflect.h f(Class cls, String str) {
        return new L(cls, str);
    }

    @kotlin.Y(version = "1.6")
    public kotlin.reflect.r g(kotlin.reflect.r rVar) {
        Z z3 = (Z) rVar;
        return new Z(rVar.e0(), rVar.h(), z3.C(), z3.z() | 2);
    }

    public kotlin.reflect.k h(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public kotlin.reflect.l i(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public kotlin.reflect.m j(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    @kotlin.Y(version = "1.6")
    public kotlin.reflect.r k(kotlin.reflect.r rVar) {
        Z z3 = (Z) rVar;
        return new Z(rVar.e0(), rVar.h(), z3.C(), z3.z() | 4);
    }

    @kotlin.Y(version = "1.6")
    public kotlin.reflect.r l(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return new Z(rVar.e0(), rVar.h(), rVar2, ((Z) rVar).z());
    }

    public kotlin.reflect.o m(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public kotlin.reflect.p n(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public kotlin.reflect.q o(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    @kotlin.Y(version = "1.3")
    public String p(B b4) {
        String obj = b4.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith(f52292a)) {
            return obj.substring(21);
        }
        return obj;
    }

    @kotlin.Y(version = "1.1")
    public String q(Lambda lambda) {
        return p(lambda);
    }

    @kotlin.Y(version = "1.4")
    public void r(kotlin.reflect.s sVar, List<kotlin.reflect.r> list) {
        ((Y) sVar).b(list);
    }

    @kotlin.Y(version = "1.4")
    public kotlin.reflect.r s(kotlin.reflect.g gVar, List<kotlin.reflect.t> list, boolean z3) {
        return new Z(gVar, list, z3);
    }

    @kotlin.Y(version = "1.4")
    public kotlin.reflect.s t(Object obj, String str, KVariance kVariance, boolean z3) {
        return new Y(obj, str, kVariance, z3);
    }
}
