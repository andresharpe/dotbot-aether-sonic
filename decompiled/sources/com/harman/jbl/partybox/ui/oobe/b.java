package com.harman.jbl.partybox.ui.oobe;

import androidx.annotation.c0;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f44389a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44390b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f44391c;

    public b(@c0 int i4, @c0 int i5, @l3.d String animationAsset) {
        F.p(animationAsset, "animationAsset");
        this.f44389a = i4;
        this.f44390b = i5;
        this.f44391c = animationAsset;
    }

    public static /* synthetic */ b e(b bVar, int i4, int i5, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = bVar.f44389a;
        }
        if ((i6 & 2) != 0) {
            i5 = bVar.f44390b;
        }
        if ((i6 & 4) != 0) {
            str = bVar.f44391c;
        }
        return bVar.d(i4, i5, str);
    }

    public final int a() {
        return this.f44389a;
    }

    public final int b() {
        return this.f44390b;
    }

    @l3.d
    public final String c() {
        return this.f44391c;
    }

    @l3.d
    public final b d(@c0 int i4, @c0 int i5, @l3.d String animationAsset) {
        F.p(animationAsset, "animationAsset");
        return new b(i4, i5, animationAsset);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f44389a == bVar.f44389a && this.f44390b == bVar.f44390b && F.g(this.f44391c, bVar.f44391c);
    }

    @l3.d
    public final String f() {
        return this.f44391c;
    }

    public final int g() {
        return this.f44390b;
    }

    public final int h() {
        return this.f44389a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f44389a) * 31) + Integer.hashCode(this.f44390b)) * 31) + this.f44391c.hashCode();
    }

    @l3.d
    public String toString() {
        return "OnBoardingSlide(title=" + this.f44389a + ", desc=" + this.f44390b + ", animationAsset=" + this.f44391c + ")";
    }
}
