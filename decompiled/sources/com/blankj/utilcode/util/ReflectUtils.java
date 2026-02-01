package com.blankj.utilcode.util;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ReflectUtils {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f24925a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f24926b;

    /* loaded from: classes.dex */
    public static class ReflectException extends RuntimeException {

        /* renamed from: E, reason: collision with root package name */
        private static final long f24927E = 858774075258496016L;

        public ReflectException(String str) {
            super(str);
        }

        public ReflectException(String str, Throwable th) {
            super(str, th);
        }

        public ReflectException(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<Constructor<?>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Constructor<?> constructor, Constructor<?> constructor2) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
            int length = parameterTypes.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (!parameterTypes[i4].equals(parameterTypes2[i4])) {
                    if (ReflectUtils.this.G(parameterTypes[i4]).isAssignableFrom(ReflectUtils.this.G(parameterTypes2[i4]))) {
                        return 1;
                    }
                    return -1;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Comparator<Method> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            int length = parameterTypes.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (!parameterTypes[i4].equals(parameterTypes2[i4])) {
                    if (ReflectUtils.this.G(parameterTypes[i4]).isAssignableFrom(ReflectUtils.this.G(parameterTypes2[i4]))) {
                        return 1;
                    }
                    return -1;
                }
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    class c implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f24930a;

        c(boolean z3) {
            this.f24930a = z3;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            int length;
            String name = method.getName();
            try {
                return ReflectUtils.y(ReflectUtils.this.f24926b).q(name, objArr).j();
            } catch (ReflectException e4) {
                if (this.f24930a) {
                    Map map = (Map) ReflectUtils.this.f24926b;
                    if (objArr == null) {
                        length = 0;
                    } else {
                        length = objArr.length;
                    }
                    if (length == 0 && name.startsWith("get")) {
                        return map.get(ReflectUtils.v(name.substring(3)));
                    }
                    if (length == 0 && name.startsWith("is")) {
                        return map.get(ReflectUtils.v(name.substring(2)));
                    }
                    if (length == 1 && name.startsWith("set")) {
                        map.put(ReflectUtils.v(name.substring(3)), objArr[0]);
                        return null;
                    }
                }
                throw e4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }
    }

    private ReflectUtils(Class<?> cls) {
        this(cls, cls);
    }

    public static ReflectUtils A(String str, ClassLoader classLoader) throws ReflectException {
        return x(i(str, classLoader));
    }

    private Method B(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> E3 = E();
        ArrayList arrayList = new ArrayList();
        for (Method method : E3.getMethods()) {
            if (n(method, str, clsArr)) {
                arrayList.add(method);
            }
        }
        if (!arrayList.isEmpty()) {
            D(arrayList);
            return arrayList.get(0);
        }
        do {
            for (Method method2 : E3.getDeclaredMethods()) {
                if (n(method2, str, clsArr)) {
                    arrayList.add(method2);
                }
            }
            if (!arrayList.isEmpty()) {
                D(arrayList);
                return arrayList.get(0);
            }
            E3 = E3.getSuperclass();
        } while (E3 != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + E() + ".");
    }

    private void C(List<Constructor<?>> list) {
        Collections.sort(list, new a());
    }

    private void D(List<Method> list) {
        Collections.sort(list, new b());
    }

    private Class<?> E() {
        return this.f24925a;
    }

    private Object F(Object obj) {
        if (obj instanceof ReflectUtils) {
            return ((ReflectUtils) obj).j();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Class<?> G(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
            return cls;
        }
        return cls;
    }

    private <T extends AccessibleObject> T d(T t3) {
        if (t3 == null) {
            return null;
        }
        if (t3 instanceof Member) {
            Member member = (Member) t3;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t3;
            }
        }
        if (!t3.isAccessible()) {
            t3.setAccessible(true);
        }
        return t3;
    }

    private Method e(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> E3 = E();
        try {
            return E3.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return E3.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    E3 = E3.getSuperclass();
                }
            } while (E3 != null);
            throw new NoSuchMethodException();
        }
    }

    private static Class<?> h(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e4) {
            throw new ReflectException(e4);
        }
    }

    private static Class<?> i(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, true, classLoader);
        } catch (ClassNotFoundException e4) {
            throw new ReflectException(e4);
        }
    }

    private Field k(String str) {
        Class<?> E3 = E();
        try {
            return (Field) d(E3.getField(str));
        } catch (NoSuchFieldException e4) {
            do {
                try {
                    return (Field) d(E3.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    E3 = E3.getSuperclass();
                    if (E3 == null) {
                        throw new ReflectException(e4);
                    }
                }
            } while (E3 == null);
            throw new ReflectException(e4);
        }
    }

    private Class<?>[] l(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                cls = d.class;
            } else {
                cls = obj.getClass();
            }
            clsArr[i4] = cls;
        }
        return clsArr;
    }

    private Field m(String str) throws IllegalAccessException {
        Field k4 = k(str);
        if ((k4.getModifiers() & 16) == 16) {
            try {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(k4, k4.getModifiers() & (-17));
            } catch (NoSuchFieldException unused) {
                k4.setAccessible(true);
            }
        }
        return k4;
    }

    private boolean n(Method method, String str, Class<?>[] clsArr) {
        if (method.getName().equals(str) && o(method.getParameterTypes(), clsArr)) {
            return true;
        }
        return false;
    }

    private boolean o(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < clsArr2.length; i4++) {
            if (clsArr2[i4] != d.class && !G(clsArr[i4]).isAssignableFrom(G(clsArr2[i4]))) {
                return false;
            }
        }
        return true;
    }

    private ReflectUtils r(Method method, Object obj, Object... objArr) {
        try {
            d(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return y(obj);
            }
            return y(method.invoke(obj, objArr));
        } catch (Exception e4) {
            throw new ReflectException(e4);
        }
    }

    private ReflectUtils t(Constructor<?> constructor, Object... objArr) {
        try {
            return new ReflectUtils(constructor.getDeclaringClass(), ((Constructor) d(constructor)).newInstance(objArr));
        } catch (Exception e4) {
            throw new ReflectException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static ReflectUtils x(Class<?> cls) throws ReflectException {
        return new ReflectUtils(cls);
    }

    public static ReflectUtils y(Object obj) throws ReflectException {
        Class<?> cls;
        if (obj == null) {
            cls = Object.class;
        } else {
            cls = obj.getClass();
        }
        return new ReflectUtils(cls, obj);
    }

    public static ReflectUtils z(String str) throws ReflectException {
        return x(h(str));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ReflectUtils) && this.f24926b.equals(((ReflectUtils) obj).j())) {
            return true;
        }
        return false;
    }

    public ReflectUtils f(String str) {
        try {
            Field m4 = m(str);
            return new ReflectUtils(m4.getType(), m4.get(this.f24926b));
        } catch (IllegalAccessException e4) {
            throw new ReflectException(e4);
        }
    }

    public ReflectUtils g(String str, Object obj) {
        try {
            m(str).set(this.f24926b, F(obj));
            return this;
        } catch (Exception e4) {
            throw new ReflectException(e4);
        }
    }

    public int hashCode() {
        return this.f24926b.hashCode();
    }

    public <T> T j() {
        return (T) this.f24926b;
    }

    public ReflectUtils p(String str) throws ReflectException {
        return q(str, new Object[0]);
    }

    public ReflectUtils q(String str, Object... objArr) throws ReflectException {
        Class<?>[] l4 = l(objArr);
        try {
            try {
                return r(e(str, l4), this.f24926b, objArr);
            } catch (NoSuchMethodException e4) {
                throw new ReflectException(e4);
            }
        } catch (NoSuchMethodException unused) {
            return r(B(str, l4), this.f24926b, objArr);
        }
    }

    public ReflectUtils s() {
        return u(new Object[0]);
    }

    public String toString() {
        return this.f24926b.toString();
    }

    public ReflectUtils u(Object... objArr) {
        Class<?>[] l4 = l(objArr);
        try {
            return t(E().getDeclaredConstructor(l4), objArr);
        } catch (NoSuchMethodException e4) {
            ArrayList arrayList = new ArrayList();
            for (Constructor<?> constructor : E().getDeclaredConstructors()) {
                if (o(constructor.getParameterTypes(), l4)) {
                    arrayList.add(constructor);
                }
            }
            if (!arrayList.isEmpty()) {
                C(arrayList);
                return t(arrayList.get(0), objArr);
            }
            throw new ReflectException(e4);
        }
    }

    public <P> P w(Class<P> cls) {
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c(this.f24926b instanceof Map));
    }

    private ReflectUtils(Class<?> cls, Object obj) {
        this.f24925a = cls;
        this.f24926b = obj;
    }
}
