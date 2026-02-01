package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.navigation.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939p {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final X<Object> f16512a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16513b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16514c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final Object f16515d;

    /* renamed from: androidx.navigation.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private X<Object> f16516a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16517b;

        /* renamed from: c, reason: collision with root package name */
        @l3.e
        private Object f16518c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16519d;

        @l3.d
        public final C0939p a() {
            X<Object> x3 = this.f16516a;
            if (x3 == null) {
                x3 = X.f16363c.c(this.f16518c);
            }
            return new C0939p(x3, this.f16517b, this.f16518c, this.f16519d);
        }

        @l3.d
        public final a b(@l3.e Object obj) {
            this.f16518c = obj;
            this.f16519d = true;
            return this;
        }

        @l3.d
        public final a c(boolean z3) {
            this.f16517b = z3;
            return this;
        }

        @l3.d
        public final <T> a d(@l3.d X<T> type) {
            kotlin.jvm.internal.F.p(type, "type");
            this.f16516a = type;
            return this;
        }
    }

    public C0939p(@l3.d X<Object> type, boolean z3, @l3.e Object obj, boolean z4) {
        kotlin.jvm.internal.F.p(type, "type");
        if (!type.f() && z3) {
            throw new IllegalArgumentException(kotlin.jvm.internal.F.C(type.c(), " does not allow nullable values").toString());
        }
        if (!z3 && z4 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.c() + " has null value but is not nullable.").toString());
        }
        this.f16512a = type;
        this.f16513b = z3;
        this.f16515d = obj;
        this.f16514c = z4;
    }

    @l3.e
    public final Object a() {
        return this.f16515d;
    }

    @l3.d
    public final X<Object> b() {
        return this.f16512a;
    }

    public final boolean c() {
        return this.f16514c;
    }

    public final boolean d() {
        return this.f16513b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void e(@l3.d String name, @l3.d Bundle bundle) {
        kotlin.jvm.internal.F.p(name, "name");
        kotlin.jvm.internal.F.p(bundle, "bundle");
        if (this.f16514c) {
            this.f16512a.i(bundle, name, this.f16515d);
        }
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.F.g(C0939p.class, obj.getClass())) {
            return false;
        }
        C0939p c0939p = (C0939p) obj;
        if (this.f16513b != c0939p.f16513b || this.f16514c != c0939p.f16514c || !kotlin.jvm.internal.F.g(this.f16512a, c0939p.f16512a)) {
            return false;
        }
        Object obj2 = this.f16515d;
        if (obj2 != null) {
            return kotlin.jvm.internal.F.g(obj2, c0939p.f16515d);
        }
        if (c0939p.f16515d == null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean f(@l3.d String name, @l3.d Bundle bundle) {
        kotlin.jvm.internal.F.p(name, "name");
        kotlin.jvm.internal.F.p(bundle, "bundle");
        if (!this.f16513b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f16512a.b(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f16512a.hashCode() * 31) + (this.f16513b ? 1 : 0)) * 31) + (this.f16514c ? 1 : 0)) * 31;
        Object obj = this.f16515d;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
