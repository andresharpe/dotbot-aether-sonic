package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.C1164a.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.InterfaceC1184f;
import com.google.android.gms.common.api.internal.InterfaceC1211q;
import com.google.android.gms.common.internal.AbstractC1246e;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.InterfaceC1268p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0265a<?, O> f28038a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f28039b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28040c;

    @I0.a
    @com.google.android.gms.common.util.D
    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0265a<T extends f, O> extends e<T, O> {
        @I0.a
        @N
        @Deprecated
        public T c(@N Context context, @N Looper looper, @N C1250g c1250g, @N O o4, @N i.b bVar, @N i.c cVar) {
            return d(context, looper, c1250g, o4, bVar, cVar);
        }

        @I0.a
        @N
        public T d(@N Context context, @N Looper looper, @N C1250g c1250g, @N O o4, @N InterfaceC1184f interfaceC1184f, @N InterfaceC1211q interfaceC1211q) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @I0.a
    /* renamed from: com.google.android.gms.common.api.a$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    @I0.a
    /* renamed from: com.google.android.gms.common.api.a$c */
    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: g, reason: collision with root package name */
        @N
        public static final C0267d f28041g = new C0267d(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0266a extends c, e {
            @N
            Account z();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* loaded from: classes.dex */
        public interface b extends c {
            @P
            GoogleSignInAccount v();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* loaded from: classes.dex */
        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0267d implements e {
            private C0267d() {
            }

            /* synthetic */ C0267d(v vVar) {
            }
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        /* loaded from: classes.dex */
        public interface e extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$f */
        /* loaded from: classes.dex */
        public interface f extends c, e {
        }
    }

    @I0.a
    @com.google.android.gms.common.util.D
    /* renamed from: com.google.android.gms.common.api.a$e */
    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {

        /* renamed from: a, reason: collision with root package name */
        @I0.a
        public static final int f28042a = 1;

        /* renamed from: b, reason: collision with root package name */
        @I0.a
        public static final int f28043b = 2;

        /* renamed from: c, reason: collision with root package name */
        @I0.a
        public static final int f28044c = Integer.MAX_VALUE;

        @I0.a
        @N
        public List<Scope> a(@P O o4) {
            return Collections.emptyList();
        }

        @I0.a
        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    @I0.a
    /* renamed from: com.google.android.gms.common.api.a$f */
    /* loaded from: classes.dex */
    public interface f extends b {
        @I0.a
        boolean a();

        @I0.a
        void c();

        @I0.a
        boolean e();

        @I0.a
        boolean f();

        @I0.a
        boolean g();

        @I0.a
        @N
        Set<Scope> h();

        @I0.a
        void i(@P InterfaceC1268p interfaceC1268p, @P Set<Scope> set);

        @I0.a
        void j(@N String str);

        @I0.a
        @N
        String k();

        @I0.a
        void l(@N AbstractC1246e.c cVar);

        @I0.a
        void m(@N AbstractC1246e.InterfaceC0269e interfaceC0269e);

        @I0.a
        @N
        C1233e[] o();

        @I0.a
        void p(@N String str, @P FileDescriptor fileDescriptor, @N PrintWriter printWriter, @P String[] strArr);

        @I0.a
        boolean q();

        @I0.a
        int s();

        @I0.a
        @N
        C1233e[] t();

        @P
        @I0.a
        String v();

        @I0.a
        @N
        Intent w();

        @I0.a
        boolean x();

        @P
        @I0.a
        IBinder y();
    }

    @I0.a
    @com.google.android.gms.common.util.D
    /* renamed from: com.google.android.gms.common.api.a$g */
    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @I0.a
    public <C extends f> C1164a(@N String str, @N AbstractC0265a<C, O> abstractC0265a, @N g<C> gVar) {
        C1285y.m(abstractC0265a, "Cannot construct an Api with a null ClientBuilder");
        C1285y.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f28040c = str;
        this.f28038a = abstractC0265a;
        this.f28039b = gVar;
    }

    @N
    public final AbstractC0265a<?, O> a() {
        return this.f28038a;
    }

    @N
    public final c<?> b() {
        return this.f28039b;
    }

    @N
    public final e<?, O> c() {
        return this.f28038a;
    }

    @N
    public final String d() {
        return this.f28040c;
    }
}
