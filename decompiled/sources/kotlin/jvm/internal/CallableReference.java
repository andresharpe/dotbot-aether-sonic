package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

/* loaded from: classes2.dex */
public abstract class CallableReference implements kotlin.reflect.c, Serializable {

    /* renamed from: K, reason: collision with root package name */
    @kotlin.Y(version = "1.1")
    public static final Object f52260K = a.f52267E;

    /* renamed from: E, reason: collision with root package name */
    private transient kotlin.reflect.c f52261E;

    /* renamed from: F, reason: collision with root package name */
    @kotlin.Y(version = "1.1")
    protected final Object f52262F;

    /* renamed from: G, reason: collision with root package name */
    @kotlin.Y(version = "1.4")
    private final Class f52263G;

    /* renamed from: H, reason: collision with root package name */
    @kotlin.Y(version = "1.4")
    private final String f52264H;

    /* renamed from: I, reason: collision with root package name */
    @kotlin.Y(version = "1.4")
    private final String f52265I;

    /* renamed from: J, reason: collision with root package name */
    @kotlin.Y(version = "1.4")
    private final boolean f52266J;

    @kotlin.Y(version = "1.2")
    /* loaded from: classes2.dex */
    private static class a implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        private static final a f52267E = new a();

        private a() {
        }

        private Object b() throws ObjectStreamException {
            return f52267E;
        }
    }

    public CallableReference() {
        this(f52260K);
    }

    public String A0() {
        return this.f52265I;
    }

    @Override // kotlin.reflect.c
    public Object R(Map map) {
        return z0().R(map);
    }

    @Override // kotlin.reflect.c
    @kotlin.Y(version = "1.1")
    public KVisibility c() {
        return z0().c();
    }

    @Override // kotlin.reflect.c
    @kotlin.Y(version = "1.1")
    public boolean d() {
        return z0().d();
    }

    @Override // kotlin.reflect.c
    public List<KParameter> e() {
        return z0().e();
    }

    @Override // kotlin.reflect.c
    @kotlin.Y(version = "1.1")
    public List<kotlin.reflect.s> f() {
        return z0().f();
    }

    @Override // kotlin.reflect.c
    public String getName() {
        return this.f52264H;
    }

    @Override // kotlin.reflect.b
    public List<Annotation> i() {
        return z0().i();
    }

    @Override // kotlin.reflect.c
    @kotlin.Y(version = "1.1")
    public boolean isOpen() {
        return z0().isOpen();
    }

    @Override // kotlin.reflect.c
    @kotlin.Y(version = "1.1")
    public boolean j() {
        return z0().j();
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.r j0() {
        return z0().j0();
    }

    @Override // kotlin.reflect.c
    @kotlin.Y(version = "1.3")
    public boolean l() {
        return z0().l();
    }

    @Override // kotlin.reflect.c
    public Object t0(Object... objArr) {
        return z0().t0(objArr);
    }

    @kotlin.Y(version = "1.1")
    public kotlin.reflect.c v0() {
        kotlin.reflect.c cVar = this.f52261E;
        if (cVar == null) {
            kotlin.reflect.c w02 = w0();
            this.f52261E = w02;
            return w02;
        }
        return cVar;
    }

    protected abstract kotlin.reflect.c w0();

    @kotlin.Y(version = "1.1")
    public Object x0() {
        return this.f52262F;
    }

    public kotlin.reflect.h y0() {
        Class cls = this.f52263G;
        if (cls == null) {
            return null;
        }
        if (this.f52266J) {
            return N.g(cls);
        }
        return N.d(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @kotlin.Y(version = "1.1")
    public kotlin.reflect.c z0() {
        kotlin.reflect.c v02 = v0();
        if (v02 != this) {
            return v02;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @kotlin.Y(version = "1.1")
    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @kotlin.Y(version = "1.4")
    public CallableReference(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f52262F = obj;
        this.f52263G = cls;
        this.f52264H = str;
        this.f52265I = str2;
        this.f52266J = z3;
    }
}
