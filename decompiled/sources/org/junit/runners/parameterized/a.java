package org.junit.runners.parameterized;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.junit.internal.runners.statements.e;
import org.junit.internal.runners.statements.f;
import org.junit.runners.d;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public class a extends org.junit.runners.b {

    /* renamed from: i, reason: collision with root package name */
    private final Object[] f55852i;

    /* renamed from: j, reason: collision with root package name */
    private final String f55853j;

    /* renamed from: org.junit.runners.parameterized.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C0538a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55854a;

        static {
            int[] iArr = new int[b.values().length];
            f55854a = iArr;
            try {
                iArr[b.CONSTRUCTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55854a[b.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum b {
        CONSTRUCTOR,
        FIELD
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends e {
        c(i iVar, List<org.junit.runners.model.d> list) {
            super(iVar, list, null);
        }

        @Override // org.junit.internal.runners.statements.e
        protected void b(org.junit.runners.model.d dVar) throws Throwable {
            Object[] objArr;
            if (dVar.m().getParameterTypes().length != 0) {
                objArr = a.this.f55852i;
            } else {
                objArr = null;
            }
            dVar.p(null, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class d extends f {
        d(i iVar, List<org.junit.runners.model.d> list) {
            super(iVar, list, null);
        }

        @Override // org.junit.internal.runners.statements.f
        protected void b(org.junit.runners.model.d dVar) throws Throwable {
            Object[] objArr;
            if (dVar.m().getParameterTypes().length != 0) {
                objArr = a.this.f55852i;
            } else {
                objArr = null;
            }
            dVar.p(null, objArr);
        }
    }

    public a(org.junit.runners.parameterized.d dVar) throws InitializationError {
        super(dVar.c());
        this.f55852i = dVar.b().toArray(new Object[dVar.b().size()]);
        this.f55853j = dVar.a();
    }

    private Object n0() throws Exception {
        return u().p().newInstance(this.f55852i);
    }

    private Object o0() throws Exception {
        List<org.junit.runners.model.b> q02 = q0();
        if (q02.size() == this.f55852i.length) {
            Object newInstance = u().n().newInstance();
            Iterator<org.junit.runners.model.b> it = q02.iterator();
            while (it.hasNext()) {
                Field m4 = it.next().m();
                int value = ((d.e) m4.getAnnotation(d.e.class)).value();
                try {
                    m4.set(newInstance, this.f55852i[value]);
                } catch (IllegalAccessException e4) {
                    IllegalAccessException illegalAccessException = new IllegalAccessException("Cannot set parameter '" + m4.getName() + "'. Ensure that the field '" + m4.getName() + "' is public.");
                    illegalAccessException.initCause(e4);
                    throw illegalAccessException;
                } catch (IllegalArgumentException e5) {
                    throw new Exception(u().o() + ": Trying to set " + m4.getName() + " with the value " + this.f55852i[value] + " that is not the right type (" + this.f55852i[value].getClass().getSimpleName() + " instead of " + m4.getType().getSimpleName() + ").", e5);
                }
            }
            return newInstance;
        }
        throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + q02.size() + ", available parameters: " + this.f55852i.length + ".");
    }

    private boolean p0() {
        return !q0().isEmpty();
    }

    private List<org.junit.runners.model.b> q0() {
        return u().h(d.e.class);
    }

    private b r0() {
        if (p0()) {
            return b.FIELD;
        }
        return b.CONSTRUCTOR;
    }

    private i s0(i iVar) {
        List<org.junit.runners.model.d> m4 = u().m(d.b.class);
        if (!m4.isEmpty()) {
            return new c(iVar, m4);
        }
        return iVar;
    }

    private i t0(i iVar) {
        List<org.junit.runners.model.d> m4 = u().m(d.InterfaceC0536d.class);
        if (!m4.isEmpty()) {
            return new d(iVar, m4);
        }
        return iVar;
    }

    @Override // org.junit.runners.b
    public Object L() throws Exception {
        b r02 = r0();
        int i4 = C0538a.f55854a[r02.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return o0();
            }
            throw new IllegalStateException("The injection type " + r02 + " is not supported.");
        }
        return n0();
    }

    @Override // org.junit.runners.b
    protected String Y(org.junit.runners.model.d dVar) {
        return dVar.d() + s();
    }

    @Override // org.junit.runners.b
    protected void Z(List<Throwable> list) {
        e0(list);
        if (r0() != b.CONSTRUCTOR) {
            h0(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.b
    public void a0(List<Throwable> list) {
        super.a0(list);
        if (r0() == b.FIELD) {
            List<org.junit.runners.model.b> q02 = q0();
            int size = q02.size();
            int[] iArr = new int[size];
            Iterator<org.junit.runners.model.b> it = q02.iterator();
            while (it.hasNext()) {
                int value = ((d.e) it.next().m().getAnnotation(d.e.class)).value();
                if (value >= 0 && value <= q02.size() - 1) {
                    iArr[value] = iArr[value] + 1;
                } else {
                    list.add(new Exception("Invalid @Parameter value: " + value + ". @Parameter fields counted: " + q02.size() + ". Please use an index between 0 and " + (q02.size() - 1) + "."));
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                int i5 = iArr[i4];
                if (i5 == 0) {
                    list.add(new Exception("@Parameter(" + i4 + ") is never used."));
                } else if (i5 > 1) {
                    list.add(new Exception("@Parameter(" + i4 + ") is used more than once (" + i5 + ")."));
                }
            }
        }
    }

    @Override // org.junit.runners.e
    protected i k(org.junit.runner.notification.b bVar) {
        return s0(t0(j(bVar)));
    }

    @Override // org.junit.runners.e
    protected String s() {
        return this.f55853j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.e
    public Annotation[] t() {
        Annotation[] annotationArr = new Annotation[r0.length - 1];
        int i4 = 0;
        for (Annotation annotation : super.t()) {
            if (!annotation.annotationType().equals(org.junit.runner.i.class)) {
                annotationArr[i4] = annotation;
                i4++;
            }
        }
        return annotationArr;
    }
}
