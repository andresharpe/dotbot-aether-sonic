package androidx.navigation;

import android.os.Bundle;

/* renamed from: androidx.navigation.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924a implements I {

    /* renamed from: a, reason: collision with root package name */
    private final int f16383a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final Bundle f16384b = new Bundle();

    public C0924a(int i4) {
        this.f16383a = i4;
    }

    public static /* synthetic */ C0924a c(C0924a c0924a, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = c0924a.i();
        }
        return c0924a.b(i4);
    }

    public final int a() {
        return i();
    }

    @l3.d
    public final C0924a b(int i4) {
        return new C0924a(i4);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kotlin.jvm.internal.F.g(C0924a.class, obj.getClass()) && i() == ((C0924a) obj).i()) {
            return true;
        }
        return false;
    }

    @Override // androidx.navigation.I
    @l3.d
    public Bundle h() {
        return this.f16384b;
    }

    public int hashCode() {
        return 31 + i();
    }

    @Override // androidx.navigation.I
    public int i() {
        return this.f16383a;
    }

    @l3.d
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + i() + ')';
    }
}
