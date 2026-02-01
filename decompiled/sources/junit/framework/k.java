package junit.framework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.junit.internal.l;

/* loaded from: classes2.dex */
public class k implements f {

    /* renamed from: a, reason: collision with root package name */
    private String f51521a;

    /* renamed from: b, reason: collision with root package name */
    private Vector<f> f51522b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f51523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(str);
            this.f51523b = str2;
        }

        @Override // junit.framework.g
        protected void S() {
            g.J(this.f51523b);
        }
    }

    public k() {
        this.f51522b = new Vector<>(10);
    }

    private void c(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (list.contains(name)) {
            return;
        }
        if (!j(method)) {
            if (k(method)) {
                a(r("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
                return;
            }
            return;
        }
        list.add(name);
        a(g(cls, name));
    }

    private void f(Class<?> cls) {
        this.f51521a = cls.getName();
        try {
            i(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                a(r("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 = cls; f.class.isAssignableFrom(cls2); cls2 = cls2.getSuperclass()) {
                for (Method method : org.junit.internal.g.a(cls2)) {
                    c(method, arrayList, cls);
                }
            }
            if (this.f51522b.size() == 0) {
                a(r("No tests found in " + cls.getName()));
            }
        } catch (NoSuchMethodException unused) {
            a(r("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    public static f g(Class<?> cls, String str) {
        Object newInstance;
        try {
            Constructor<?> i4 = i(cls);
            try {
                if (i4.getParameterTypes().length == 0) {
                    newInstance = i4.newInstance(new Object[0]);
                    if (newInstance instanceof g) {
                        ((g) newInstance).T(str);
                    }
                } else {
                    newInstance = i4.newInstance(str);
                }
                return (f) newInstance;
            } catch (IllegalAccessException e4) {
                return r("Cannot access test case: " + str + " (" + l.g(e4) + ")");
            } catch (InstantiationException e5) {
                return r("Cannot instantiate test case: " + str + " (" + l.g(e5) + ")");
            } catch (InvocationTargetException e6) {
                return r("Exception in constructor: " + str + " (" + l.g(e6.getTargetException()) + ")");
            }
        } catch (NoSuchMethodException unused) {
            return r("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    public static Constructor<?> i(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(new Class[0]);
        }
    }

    private boolean j(Method method) {
        if (k(method) && Modifier.isPublic(method.getModifiers())) {
            return true;
        }
        return false;
    }

    private boolean k(Method method) {
        if (method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE)) {
            return true;
        }
        return false;
    }

    private f o(Class<?> cls) {
        if (g.class.isAssignableFrom(cls)) {
            return new k(cls.asSubclass(g.class));
        }
        return r(cls.getCanonicalName() + " does not extend TestCase");
    }

    public static f r(String str) {
        return new a("warning", str);
    }

    public void a(f fVar) {
        this.f51522b.add(fVar);
    }

    @Override // junit.framework.f
    public int b() {
        Iterator<f> it = this.f51522b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().b();
        }
        return i4;
    }

    @Override // junit.framework.f
    public void d(j jVar) {
        Iterator<f> it = this.f51522b.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!jVar.n()) {
                l(next, jVar);
            } else {
                return;
            }
        }
    }

    public void e(Class<? extends g> cls) {
        a(new k(cls));
    }

    public String h() {
        return this.f51521a;
    }

    public void l(f fVar, j jVar) {
        fVar.d(jVar);
    }

    public void m(String str) {
        this.f51521a = str;
    }

    public f n(int i4) {
        return this.f51522b.get(i4);
    }

    public int p() {
        return this.f51522b.size();
    }

    public Enumeration<f> q() {
        return this.f51522b.elements();
    }

    public String toString() {
        if (h() != null) {
            return h();
        }
        return super.toString();
    }

    public k(Class<?> cls) {
        this.f51522b = new Vector<>(10);
        f(cls);
    }

    public k(Class<? extends g> cls, String str) {
        this(cls);
        m(str);
    }

    public k(String str) {
        this.f51522b = new Vector<>(10);
        m(str);
    }

    public k(Class<?>... clsArr) {
        this.f51522b = new Vector<>(10);
        for (Class<?> cls : clsArr) {
            a(o(cls));
        }
    }

    public k(Class<? extends g>[] clsArr, String str) {
        this(clsArr);
        m(str);
    }
}
