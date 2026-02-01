package org.junit.runners.model;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final Method f55841a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Method method) {
        this.f55841a = method;
    }

    private void b(GenericArrayType genericArrayType, List<Throwable> list) {
        d(genericArrayType.getGenericComponentType(), list);
    }

    private void c(ParameterizedType parameterizedType, List<Throwable> list) {
        for (Type type : parameterizedType.getActualTypeArguments()) {
            d(type, list);
        }
    }

    private void d(Type type, List<Throwable> list) {
        if (type instanceof TypeVariable) {
            list.add(new Exception("Method " + this.f55841a.getName() + "() contains unresolved type variable " + type));
            return;
        }
        if (type instanceof ParameterizedType) {
            c((ParameterizedType) type, list);
        } else if (type instanceof WildcardType) {
            e((WildcardType) type, list);
        } else if (type instanceof GenericArrayType) {
            b((GenericArrayType) type, list);
        }
    }

    private void e(WildcardType wildcardType, List<Throwable> list) {
        for (Type type : wildcardType.getUpperBounds()) {
            d(type, list);
        }
        for (Type type2 : wildcardType.getLowerBounds()) {
            d(type2, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<Throwable> list) {
        for (Type type : this.f55841a.getGenericParameterTypes()) {
            d(type, list);
        }
    }
}
