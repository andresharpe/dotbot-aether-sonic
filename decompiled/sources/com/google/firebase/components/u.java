package com.google.firebase.components;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f34936a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34937b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34938c;

    private u(Class<?> cls, int i4, int i5) {
        this.f34936a = (Class) D.c(cls, "Null dependency anInterface.");
        this.f34937b = i4;
        this.f34938c = i5;
    }

    public static u a(Class<?> cls) {
        return new u(cls, 0, 2);
    }

    private static String b(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i4);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    public static u h(Class<?> cls) {
        return new u(cls, 0, 0);
    }

    public static u i(Class<?> cls) {
        return new u(cls, 0, 1);
    }

    public static u j(Class<?> cls) {
        return new u(cls, 1, 0);
    }

    public static u k(Class<?> cls) {
        return new u(cls, 1, 1);
    }

    public static u l(Class<?> cls) {
        return new u(cls, 2, 0);
    }

    public static u m(Class<?> cls) {
        return new u(cls, 2, 1);
    }

    public Class<?> c() {
        return this.f34936a;
    }

    public boolean d() {
        if (this.f34938c == 2) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f34938c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f34936a != uVar.f34936a || this.f34937b != uVar.f34937b || this.f34938c != uVar.f34938c) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.f34937b == 1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f34937b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f34936a.hashCode() ^ 1000003) * 1000003) ^ this.f34937b) * 1000003) ^ this.f34938c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f34936a);
        sb.append(", type=");
        int i4 = this.f34937b;
        if (i4 == 1) {
            str = "required";
        } else if (i4 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(b(this.f34938c));
        sb.append("}");
        return sb.toString();
    }
}
