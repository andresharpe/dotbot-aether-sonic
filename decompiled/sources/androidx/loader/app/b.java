package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.collection.m;
import androidx.core.util.C0768i;
import androidx.lifecycle.E;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.loader.app.a;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static final String f15747c = "LoaderManager";

    /* renamed from: d, reason: collision with root package name */
    static boolean f15748d = false;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final E f15749a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final c f15750b;

    /* loaded from: classes.dex */
    public static class a<D> extends P<D> implements c.InterfaceC0148c<D> {

        /* renamed from: m, reason: collision with root package name */
        private final int f15751m;

        /* renamed from: n, reason: collision with root package name */
        @androidx.annotation.P
        private final Bundle f15752n;

        /* renamed from: o, reason: collision with root package name */
        @N
        private final androidx.loader.content.c<D> f15753o;

        /* renamed from: p, reason: collision with root package name */
        private E f15754p;

        /* renamed from: q, reason: collision with root package name */
        private C0146b<D> f15755q;

        /* renamed from: r, reason: collision with root package name */
        private androidx.loader.content.c<D> f15756r;

        a(int i4, @androidx.annotation.P Bundle bundle, @N androidx.loader.content.c<D> cVar, @androidx.annotation.P androidx.loader.content.c<D> cVar2) {
            this.f15751m = i4;
            this.f15752n = bundle;
            this.f15753o = cVar;
            this.f15756r = cVar2;
            cVar.u(i4, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0148c
        public void a(@N androidx.loader.content.c<D> cVar, @androidx.annotation.P D d4) {
            if (b.f15748d) {
                Log.v(b.f15747c, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r(d4);
                return;
            }
            if (b.f15748d) {
                Log.w(b.f15747c, "onLoadComplete was incorrectly called on a background thread");
            }
            o(d4);
        }

        @Override // androidx.lifecycle.LiveData
        protected void m() {
            if (b.f15748d) {
                Log.v(b.f15747c, "  Starting: " + this);
            }
            this.f15753o.y();
        }

        @Override // androidx.lifecycle.LiveData
        protected void n() {
            if (b.f15748d) {
                Log.v(b.f15747c, "  Stopping: " + this);
            }
            this.f15753o.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void p(@N Q<? super D> q4) {
            super.p(q4);
            this.f15754p = null;
            this.f15755q = null;
        }

        @Override // androidx.lifecycle.P, androidx.lifecycle.LiveData
        public void r(D d4) {
            super.r(d4);
            androidx.loader.content.c<D> cVar = this.f15756r;
            if (cVar != null) {
                cVar.w();
                this.f15756r = null;
            }
        }

        @K
        androidx.loader.content.c<D> s(boolean z3) {
            if (b.f15748d) {
                Log.v(b.f15747c, "  Destroying: " + this);
            }
            this.f15753o.b();
            this.f15753o.a();
            C0146b<D> c0146b = this.f15755q;
            if (c0146b != null) {
                p(c0146b);
                if (z3) {
                    c0146b.c();
                }
            }
            this.f15753o.B(this);
            if ((c0146b != null && !c0146b.b()) || z3) {
                this.f15753o.w();
                return this.f15756r;
            }
            return this.f15753o;
        }

        public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f15751m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f15752n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f15753o);
            this.f15753o.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f15755q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f15755q);
                this.f15755q.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(u().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f15751m);
            sb.append(" : ");
            C0768i.a(this.f15753o, sb);
            sb.append("}}");
            return sb.toString();
        }

        @N
        androidx.loader.content.c<D> u() {
            return this.f15753o;
        }

        boolean v() {
            C0146b<D> c0146b;
            if (!h() || (c0146b = this.f15755q) == null || c0146b.b()) {
                return false;
            }
            return true;
        }

        void w() {
            E e4 = this.f15754p;
            C0146b<D> c0146b = this.f15755q;
            if (e4 != null && c0146b != null) {
                super.p(c0146b);
                k(e4, c0146b);
            }
        }

        @N
        @K
        androidx.loader.content.c<D> x(@N E e4, @N a.InterfaceC0145a<D> interfaceC0145a) {
            C0146b<D> c0146b = new C0146b<>(this.f15753o, interfaceC0145a);
            k(e4, c0146b);
            C0146b<D> c0146b2 = this.f15755q;
            if (c0146b2 != null) {
                p(c0146b2);
            }
            this.f15754p = e4;
            this.f15755q = c0146b;
            return this.f15753o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0146b<D> implements Q<D> {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final androidx.loader.content.c<D> f15757a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private final a.InterfaceC0145a<D> f15758b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15759c = false;

        C0146b(@N androidx.loader.content.c<D> cVar, @N a.InterfaceC0145a<D> interfaceC0145a) {
            this.f15757a = cVar;
            this.f15758b = interfaceC0145a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f15759c);
        }

        boolean b() {
            return this.f15759c;
        }

        @K
        void c() {
            if (this.f15759c) {
                if (b.f15748d) {
                    Log.v(b.f15747c, "  Resetting: " + this.f15757a);
                }
                this.f15758b.c(this.f15757a);
            }
        }

        @Override // androidx.lifecycle.Q
        public void f(@androidx.annotation.P D d4) {
            if (b.f15748d) {
                Log.v(b.f15747c, "  onLoadFinished in " + this.f15757a + ": " + this.f15757a.d(d4));
            }
            this.f15758b.a(this.f15757a, d4);
            this.f15759c = true;
        }

        public String toString() {
            return this.f15758b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends j0 {

        /* renamed from: J, reason: collision with root package name */
        private static final m0.b f15760J = new a();

        /* renamed from: H, reason: collision with root package name */
        private m<a> f15761H = new m<>();

        /* renamed from: I, reason: collision with root package name */
        private boolean f15762I = false;

        /* loaded from: classes.dex */
        static class a implements m0.b {
            a() {
            }

            @Override // androidx.lifecycle.m0.b
            @N
            public <T extends j0> T a(@N Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        @N
        static c w(p0 p0Var) {
            return (c) new m0(p0Var, f15760J).a(c.class);
        }

        void A() {
            int B3 = this.f15761H.B();
            for (int i4 = 0; i4 < B3; i4++) {
                this.f15761H.C(i4).w();
            }
        }

        void B(int i4, @N a aVar) {
            this.f15761H.p(i4, aVar);
        }

        void C(int i4) {
            this.f15761H.s(i4);
        }

        void D() {
            this.f15762I = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.j0
        public void s() {
            super.s();
            int B3 = this.f15761H.B();
            for (int i4 = 0; i4 < B3; i4++) {
                this.f15761H.C(i4).s(true);
            }
            this.f15761H.b();
        }

        public void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f15761H.B() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i4 = 0; i4 < this.f15761H.B(); i4++) {
                    a C3 = this.f15761H.C(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f15761H.o(i4));
                    printWriter.print(": ");
                    printWriter.println(C3.toString());
                    C3.t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void v() {
            this.f15762I = false;
        }

        <D> a<D> x(int i4) {
            return this.f15761H.i(i4);
        }

        boolean y() {
            int B3 = this.f15761H.B();
            for (int i4 = 0; i4 < B3; i4++) {
                if (this.f15761H.C(i4).v()) {
                    return true;
                }
            }
            return false;
        }

        boolean z() {
            return this.f15762I;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(@N E e4, @N p0 p0Var) {
        this.f15749a = e4;
        this.f15750b = c.w(p0Var);
    }

    @N
    @K
    private <D> androidx.loader.content.c<D> j(int i4, @androidx.annotation.P Bundle bundle, @N a.InterfaceC0145a<D> interfaceC0145a, @androidx.annotation.P androidx.loader.content.c<D> cVar) {
        try {
            this.f15750b.D();
            androidx.loader.content.c<D> b4 = interfaceC0145a.b(i4, bundle);
            if (b4 != null) {
                if (b4.getClass().isMemberClass() && !Modifier.isStatic(b4.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b4);
                }
                a aVar = new a(i4, bundle, b4, cVar);
                if (f15748d) {
                    Log.v(f15747c, "  Created new loader " + aVar);
                }
                this.f15750b.B(i4, aVar);
                this.f15750b.v();
                return aVar.x(this.f15749a, interfaceC0145a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f15750b.v();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    @K
    public void a(int i4) {
        if (!this.f15750b.z()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (f15748d) {
                    Log.v(f15747c, "destroyLoader in " + this + " of " + i4);
                }
                a x3 = this.f15750b.x(i4);
                if (x3 != null) {
                    x3.s(true);
                    this.f15750b.C(i4);
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f15750b.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    @androidx.annotation.P
    public <D> androidx.loader.content.c<D> e(int i4) {
        if (!this.f15750b.z()) {
            a<D> x3 = this.f15750b.x(i4);
            if (x3 != null) {
                return x3.u();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.a
    public boolean f() {
        return this.f15750b.y();
    }

    @Override // androidx.loader.app.a
    @N
    @K
    public <D> androidx.loader.content.c<D> g(int i4, @androidx.annotation.P Bundle bundle, @N a.InterfaceC0145a<D> interfaceC0145a) {
        if (!this.f15750b.z()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> x3 = this.f15750b.x(i4);
                if (f15748d) {
                    Log.v(f15747c, "initLoader in " + this + ": args=" + bundle);
                }
                if (x3 == null) {
                    return j(i4, bundle, interfaceC0145a, null);
                }
                if (f15748d) {
                    Log.v(f15747c, "  Re-using existing loader " + x3);
                }
                return x3.x(this.f15749a, interfaceC0145a);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.a
    public void h() {
        this.f15750b.A();
    }

    @Override // androidx.loader.app.a
    @N
    @K
    public <D> androidx.loader.content.c<D> i(int i4, @androidx.annotation.P Bundle bundle, @N a.InterfaceC0145a<D> interfaceC0145a) {
        androidx.loader.content.c<D> cVar;
        if (!this.f15750b.z()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (f15748d) {
                    Log.v(f15747c, "restartLoader in " + this + ": args=" + bundle);
                }
                a<D> x3 = this.f15750b.x(i4);
                if (x3 != null) {
                    cVar = x3.s(false);
                } else {
                    cVar = null;
                }
                return j(i4, bundle, interfaceC0145a, cVar);
            }
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0768i.a(this.f15749a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
