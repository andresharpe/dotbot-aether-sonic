package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.B;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.Priority;
import com.bumptech.glide.c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j<R> implements e, o, i {

    /* renamed from: E, reason: collision with root package name */
    private static final String f26796E = "Glide";

    /* renamed from: A, reason: collision with root package name */
    @B("requestLock")
    private int f26798A;

    /* renamed from: B, reason: collision with root package name */
    @B("requestLock")
    private boolean f26799B;

    /* renamed from: C, reason: collision with root package name */
    @P
    private RuntimeException f26800C;

    /* renamed from: a, reason: collision with root package name */
    @P
    private final String f26801a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f26802b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f26803c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final g<R> f26804d;

    /* renamed from: e, reason: collision with root package name */
    private final RequestCoordinator f26805e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f26806f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.d f26807g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private final Object f26808h;

    /* renamed from: i, reason: collision with root package name */
    private final Class<R> f26809i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.request.a<?> f26810j;

    /* renamed from: k, reason: collision with root package name */
    private final int f26811k;

    /* renamed from: l, reason: collision with root package name */
    private final int f26812l;

    /* renamed from: m, reason: collision with root package name */
    private final Priority f26813m;

    /* renamed from: n, reason: collision with root package name */
    private final p<R> f26814n;

    /* renamed from: o, reason: collision with root package name */
    @P
    private final List<g<R>> f26815o;

    /* renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.request.transition.g<? super R> f26816p;

    /* renamed from: q, reason: collision with root package name */
    private final Executor f26817q;

    /* renamed from: r, reason: collision with root package name */
    @B("requestLock")
    private u<R> f26818r;

    /* renamed from: s, reason: collision with root package name */
    @B("requestLock")
    private k.d f26819s;

    /* renamed from: t, reason: collision with root package name */
    @B("requestLock")
    private long f26820t;

    /* renamed from: u, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.k f26821u;

    /* renamed from: v, reason: collision with root package name */
    @B("requestLock")
    private a f26822v;

    /* renamed from: w, reason: collision with root package name */
    @P
    @B("requestLock")
    private Drawable f26823w;

    /* renamed from: x, reason: collision with root package name */
    @P
    @B("requestLock")
    private Drawable f26824x;

    /* renamed from: y, reason: collision with root package name */
    @P
    @B("requestLock")
    private Drawable f26825y;

    /* renamed from: z, reason: collision with root package name */
    @B("requestLock")
    private int f26826z;

    /* renamed from: D, reason: collision with root package name */
    private static final String f26795D = "Request";

    /* renamed from: F, reason: collision with root package name */
    private static final boolean f26797F = Log.isLoggable(f26795D, 2);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private j(Context context, com.bumptech.glide.d dVar, @N Object obj, @P Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i4, int i5, Priority priority, p<R> pVar, @P g<R> gVar, @P List<g<R>> list, RequestCoordinator requestCoordinator, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.request.transition.g<? super R> gVar2, Executor executor) {
        String str;
        if (f26797F) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f26801a = str;
        this.f26802b = com.bumptech.glide.util.pool.c.a();
        this.f26803c = obj;
        this.f26806f = context;
        this.f26807g = dVar;
        this.f26808h = obj2;
        this.f26809i = cls;
        this.f26810j = aVar;
        this.f26811k = i4;
        this.f26812l = i5;
        this.f26813m = priority;
        this.f26814n = pVar;
        this.f26804d = gVar;
        this.f26815o = list;
        this.f26805e = requestCoordinator;
        this.f26821u = kVar;
        this.f26816p = gVar2;
        this.f26817q = executor;
        this.f26822v = a.PENDING;
        if (this.f26800C == null && dVar.g().b(c.d.class)) {
            this.f26800C = new RuntimeException("Glide request origin trace");
        }
    }

    @B("requestLock")
    private void A(u<R> uVar, R r4, DataSource dataSource, boolean z3) {
        boolean z4;
        boolean s4 = s();
        this.f26822v = a.COMPLETE;
        this.f26818r = uVar;
        if (this.f26807g.h() <= 3) {
            Log.d(f26796E, "Finished loading " + r4.getClass().getSimpleName() + " from " + dataSource + " for " + this.f26808h + " with size [" + this.f26826z + "x" + this.f26798A + "] in " + com.bumptech.glide.util.h.a(this.f26820t) + " ms");
        }
        boolean z5 = true;
        this.f26799B = true;
        try {
            List<g<R>> list = this.f26815o;
            if (list != null) {
                Iterator<g<R>> it = list.iterator();
                z4 = false;
                while (it.hasNext()) {
                    z4 |= it.next().h(r4, this.f26808h, this.f26814n, dataSource, s4);
                }
            } else {
                z4 = false;
            }
            g<R> gVar = this.f26804d;
            if (gVar == null || !gVar.h(r4, this.f26808h, this.f26814n, dataSource, s4)) {
                z5 = false;
            }
            if (!(z5 | z4)) {
                this.f26814n.e(r4, this.f26816p.a(dataSource, s4));
            }
            this.f26799B = false;
            x();
        } catch (Throwable th) {
            this.f26799B = false;
            throw th;
        }
    }

    @B("requestLock")
    private void B() {
        Drawable drawable;
        if (!m()) {
            return;
        }
        if (this.f26808h == null) {
            drawable = q();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = p();
        }
        if (drawable == null) {
            drawable = r();
        }
        this.f26814n.m(drawable);
    }

    @B("requestLock")
    private void j() {
        if (!this.f26799B) {
        } else {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @B("requestLock")
    private boolean l() {
        RequestCoordinator requestCoordinator = this.f26805e;
        if (requestCoordinator != null && !requestCoordinator.l(this)) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private boolean m() {
        RequestCoordinator requestCoordinator = this.f26805e;
        if (requestCoordinator != null && !requestCoordinator.f(this)) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private boolean n() {
        RequestCoordinator requestCoordinator = this.f26805e;
        if (requestCoordinator != null && !requestCoordinator.h(this)) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private void o() {
        j();
        this.f26802b.c();
        this.f26814n.c(this);
        k.d dVar = this.f26819s;
        if (dVar != null) {
            dVar.a();
            this.f26819s = null;
        }
    }

    @B("requestLock")
    private Drawable p() {
        if (this.f26823w == null) {
            Drawable K3 = this.f26810j.K();
            this.f26823w = K3;
            if (K3 == null && this.f26810j.J() > 0) {
                this.f26823w = t(this.f26810j.J());
            }
        }
        return this.f26823w;
    }

    @B("requestLock")
    private Drawable q() {
        if (this.f26825y == null) {
            Drawable L3 = this.f26810j.L();
            this.f26825y = L3;
            if (L3 == null && this.f26810j.M() > 0) {
                this.f26825y = t(this.f26810j.M());
            }
        }
        return this.f26825y;
    }

    @B("requestLock")
    private Drawable r() {
        if (this.f26824x == null) {
            Drawable R3 = this.f26810j.R();
            this.f26824x = R3;
            if (R3 == null && this.f26810j.S() > 0) {
                this.f26824x = t(this.f26810j.S());
            }
        }
        return this.f26824x;
    }

    @B("requestLock")
    private boolean s() {
        RequestCoordinator requestCoordinator = this.f26805e;
        if (requestCoordinator != null && requestCoordinator.d().c()) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private Drawable t(@InterfaceC0578v int i4) {
        Resources.Theme theme;
        if (this.f26810j.X() != null) {
            theme = this.f26810j.X();
        } else {
            theme = this.f26806f.getTheme();
        }
        return com.bumptech.glide.load.resource.drawable.a.a(this.f26807g, i4, theme);
    }

    private void u(String str) {
        Log.v(f26795D, str + " this: " + this.f26801a);
    }

    private static int v(int i4, float f4) {
        if (i4 != Integer.MIN_VALUE) {
            return Math.round(f4 * i4);
        }
        return i4;
    }

    @B("requestLock")
    private void w() {
        RequestCoordinator requestCoordinator = this.f26805e;
        if (requestCoordinator != null) {
            requestCoordinator.a(this);
        }
    }

    @B("requestLock")
    private void x() {
        RequestCoordinator requestCoordinator = this.f26805e;
        if (requestCoordinator != null) {
            requestCoordinator.j(this);
        }
    }

    public static <R> j<R> y(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i4, int i5, Priority priority, p<R> pVar, g<R> gVar, @P List<g<R>> list, RequestCoordinator requestCoordinator, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.request.transition.g<? super R> gVar2, Executor executor) {
        return new j<>(context, dVar, obj, obj2, cls, aVar, i4, i5, priority, pVar, gVar, list, requestCoordinator, kVar, gVar2, executor);
    }

    private void z(GlideException glideException, int i4) {
        boolean z3;
        this.f26802b.c();
        synchronized (this.f26803c) {
            try {
                glideException.l(this.f26800C);
                int h4 = this.f26807g.h();
                if (h4 <= i4) {
                    Log.w(f26796E, "Load failed for " + this.f26808h + " with size [" + this.f26826z + "x" + this.f26798A + "]", glideException);
                    if (h4 <= 4) {
                        glideException.h(f26796E);
                    }
                }
                this.f26819s = null;
                this.f26822v = a.FAILED;
                boolean z4 = true;
                this.f26799B = true;
                try {
                    List<g<R>> list = this.f26815o;
                    if (list != null) {
                        Iterator<g<R>> it = list.iterator();
                        z3 = false;
                        while (it.hasNext()) {
                            z3 |= it.next().g(glideException, this.f26808h, this.f26814n, s());
                        }
                    } else {
                        z3 = false;
                    }
                    g<R> gVar = this.f26804d;
                    if (gVar == null || !gVar.g(glideException, this.f26808h, this.f26814n, s())) {
                        z4 = false;
                    }
                    if (!(z3 | z4)) {
                        B();
                    }
                    this.f26799B = false;
                    w();
                } catch (Throwable th) {
                    this.f26799B = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.i
    public void a(GlideException glideException) {
        z(glideException, 5);
    }

    @Override // com.bumptech.glide.request.e
    public void b() {
        synchronized (this.f26803c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean c() {
        boolean z3;
        synchronized (this.f26803c) {
            if (this.f26822v == a.COMPLETE) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f26803c) {
            try {
                j();
                this.f26802b.c();
                a aVar = this.f26822v;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                o();
                u<R> uVar = this.f26818r;
                if (uVar != null) {
                    this.f26818r = null;
                } else {
                    uVar = null;
                }
                if (l()) {
                    this.f26814n.r(r());
                }
                this.f26822v = aVar2;
                if (uVar != null) {
                    this.f26821u.l(uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.i
    public void d(u<?> uVar, DataSource dataSource, boolean z3) {
        Object obj;
        String str;
        this.f26802b.c();
        u<?> uVar2 = null;
        try {
            synchronized (this.f26803c) {
                try {
                    this.f26819s = null;
                    if (uVar == null) {
                        a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f26809i + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = uVar.get();
                    try {
                        if (obj2 != null && this.f26809i.isAssignableFrom(obj2.getClass())) {
                            if (!n()) {
                                this.f26818r = null;
                                this.f26822v = a.COMPLETE;
                                this.f26821u.l(uVar);
                                return;
                            }
                            A(uVar, obj2, dataSource, z3);
                            return;
                        }
                        this.f26818r = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f26809i);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(uVar);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        a(new GlideException(sb.toString()));
                        this.f26821u.l(uVar);
                    } catch (Throwable th) {
                        uVar2 = uVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (uVar2 != null) {
                this.f26821u.l(uVar2);
            }
            throw th3;
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean e(e eVar) {
        int i4;
        int i5;
        Object obj;
        Class<R> cls;
        com.bumptech.glide.request.a<?> aVar;
        Priority priority;
        int i6;
        int i7;
        int i8;
        Object obj2;
        Class<R> cls2;
        com.bumptech.glide.request.a<?> aVar2;
        Priority priority2;
        int i9;
        if (!(eVar instanceof j)) {
            return false;
        }
        synchronized (this.f26803c) {
            try {
                i4 = this.f26811k;
                i5 = this.f26812l;
                obj = this.f26808h;
                cls = this.f26809i;
                aVar = this.f26810j;
                priority = this.f26813m;
                List<g<R>> list = this.f26815o;
                if (list != null) {
                    i6 = list.size();
                } else {
                    i6 = 0;
                }
            } finally {
            }
        }
        j jVar = (j) eVar;
        synchronized (jVar.f26803c) {
            try {
                i7 = jVar.f26811k;
                i8 = jVar.f26812l;
                obj2 = jVar.f26808h;
                cls2 = jVar.f26809i;
                aVar2 = jVar.f26810j;
                priority2 = jVar.f26813m;
                List<g<R>> list2 = jVar.f26815o;
                if (list2 != null) {
                    i9 = list2.size();
                } else {
                    i9 = 0;
                }
            } finally {
            }
        }
        if (i4 == i7 && i5 == i8 && n.c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && i6 == i9) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.target.o
    public void f(int i4, int i5) {
        Object obj;
        this.f26802b.c();
        Object obj2 = this.f26803c;
        synchronized (obj2) {
            try {
                try {
                    boolean z3 = f26797F;
                    if (z3) {
                        u("Got onSizeReady in " + com.bumptech.glide.util.h.a(this.f26820t));
                    }
                    if (this.f26822v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f26822v = aVar;
                        float W3 = this.f26810j.W();
                        this.f26826z = v(i4, W3);
                        this.f26798A = v(i5, W3);
                        if (z3) {
                            u("finished setup for calling load in " + com.bumptech.glide.util.h.a(this.f26820t));
                        }
                        obj = obj2;
                        try {
                            this.f26819s = this.f26821u.g(this.f26807g, this.f26808h, this.f26810j.V(), this.f26826z, this.f26798A, this.f26810j.U(), this.f26809i, this.f26813m, this.f26810j.I(), this.f26810j.Y(), this.f26810j.l0(), this.f26810j.g0(), this.f26810j.O(), this.f26810j.e0(), this.f26810j.a0(), this.f26810j.Z(), this.f26810j.N(), this, this.f26817q);
                            if (this.f26822v != aVar) {
                                this.f26819s = null;
                            }
                            if (z3) {
                                u("finished onSizeReady in " + com.bumptech.glide.util.h.a(this.f26820t));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean g() {
        boolean z3;
        synchronized (this.f26803c) {
            if (this.f26822v == a.CLEARED) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.i
    public Object h() {
        this.f26802b.c();
        return this.f26803c;
    }

    @Override // com.bumptech.glide.request.e
    public void i() {
        int i4;
        synchronized (this.f26803c) {
            try {
                j();
                this.f26802b.c();
                this.f26820t = com.bumptech.glide.util.h.b();
                if (this.f26808h == null) {
                    if (n.w(this.f26811k, this.f26812l)) {
                        this.f26826z = this.f26811k;
                        this.f26798A = this.f26812l;
                    }
                    if (q() == null) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    z(new GlideException("Received null model"), i4);
                    return;
                }
                a aVar = this.f26822v;
                a aVar2 = a.RUNNING;
                if (aVar != aVar2) {
                    if (aVar == a.COMPLETE) {
                        d(this.f26818r, DataSource.MEMORY_CACHE, false);
                        return;
                    }
                    a aVar3 = a.WAITING_FOR_SIZE;
                    this.f26822v = aVar3;
                    if (n.w(this.f26811k, this.f26812l)) {
                        f(this.f26811k, this.f26812l);
                    } else {
                        this.f26814n.s(this);
                    }
                    a aVar4 = this.f26822v;
                    if ((aVar4 == aVar2 || aVar4 == aVar3) && m()) {
                        this.f26814n.p(r());
                    }
                    if (f26797F) {
                        u("finished run method in " + com.bumptech.glide.util.h.a(this.f26820t));
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot restart a running request");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z3;
        synchronized (this.f26803c) {
            try {
                a aVar = this.f26822v;
                if (aVar != a.RUNNING && aVar != a.WAITING_FOR_SIZE) {
                    z3 = false;
                }
                z3 = true;
            } finally {
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.e
    public boolean k() {
        boolean z3;
        synchronized (this.f26803c) {
            if (this.f26822v == a.COMPLETE) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }
}
