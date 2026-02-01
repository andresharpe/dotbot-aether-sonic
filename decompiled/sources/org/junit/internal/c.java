package org.junit.internal;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f55558a = g("end of array");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f55559a;

        a(String str) {
            this.f55559a = str;
        }

        public String toString() {
            return this.f55559a;
        }
    }

    private void b(String str, Object obj, Object obj2, boolean z3) throws ArrayComparisonFailure {
        String str2;
        if (obj != obj2 && !Arrays.deepEquals(new Object[]{obj}, new Object[]{obj2})) {
            String str3 = "";
            if (str == null) {
                str2 = "";
            } else {
                str2 = str + ": ";
            }
            if (z3) {
                str3 = str2;
            }
            if (obj == null) {
                org.junit.c.g0(str3 + "expected array was null");
            }
            if (obj2 == null) {
                org.junit.c.g0(str3 + "actual array was null");
            }
            int length = Array.getLength(obj2);
            int length2 = Array.getLength(obj);
            if (length != length2) {
                str2 = str2 + "array lengths differed, expected.length=" + length2 + " actual.length=" + length + "; ";
            }
            int min = Math.min(length, length2);
            for (int i4 = 0; i4 < min; i4++) {
                Object obj3 = Array.get(obj, i4);
                Object obj4 = Array.get(obj2, i4);
                if (f(obj3) && f(obj4)) {
                    try {
                        b(str, obj3, obj4, false);
                    } catch (ArrayComparisonFailure e4) {
                        e4.a(i4);
                        throw e4;
                    } catch (AssertionError e5) {
                        throw new ArrayComparisonFailure(str2, e5, i4);
                    }
                } else {
                    try {
                        c(obj3, obj4);
                    } catch (AssertionError e6) {
                        throw new ArrayComparisonFailure(str2, e6, i4);
                    }
                }
            }
            if (length != length2) {
                try {
                    org.junit.c.w(e(obj, length2, min), e(obj2, length, min));
                } catch (AssertionError e7) {
                    throw new ArrayComparisonFailure(str2, e7, min);
                }
            }
        }
    }

    private String d(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType.isArray()) {
            return d(componentType) + "[]";
        }
        return componentType.getName();
    }

    private Object e(Object obj, int i4, int i5) {
        if (i5 < i4) {
            Object obj2 = Array.get(obj, i5);
            if (f(obj2)) {
                return g(d(obj2.getClass()) + "[" + Array.getLength(obj2) + "]");
            }
            return obj2;
        }
        return f55558a;
    }

    private boolean f(Object obj) {
        if (obj != null && obj.getClass().isArray()) {
            return true;
        }
        return false;
    }

    private static Object g(String str) {
        return new a(str);
    }

    public void a(String str, Object obj, Object obj2) throws ArrayComparisonFailure {
        b(str, obj, obj2, true);
    }

    protected abstract void c(Object obj, Object obj2);
}
