package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.C2197u;

/* renamed from: androidx.navigation.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934k {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.D
    private final int f16501a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private T f16502b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private Bundle f16503c;

    @W2.j
    public C0934k(@androidx.annotation.D int i4) {
        this(i4, null, null, 6, null);
    }

    @l3.e
    public final Bundle a() {
        return this.f16503c;
    }

    public final int b() {
        return this.f16501a;
    }

    @l3.e
    public final T c() {
        return this.f16502b;
    }

    public final void d(@l3.e Bundle bundle) {
        this.f16503c = bundle;
    }

    public final void e(@l3.e T t3) {
        this.f16502b = t3;
    }

    @W2.j
    public C0934k(@androidx.annotation.D int i4, @l3.e T t3) {
        this(i4, t3, null, 4, null);
    }

    @W2.j
    public C0934k(@androidx.annotation.D int i4, @l3.e T t3, @l3.e Bundle bundle) {
        this.f16501a = i4;
        this.f16502b = t3;
        this.f16503c = bundle;
    }

    public /* synthetic */ C0934k(int i4, T t3, Bundle bundle, int i5, C2197u c2197u) {
        this(i4, (i5 & 2) != 0 ? null : t3, (i5 & 4) != 0 ? null : bundle);
    }
}
