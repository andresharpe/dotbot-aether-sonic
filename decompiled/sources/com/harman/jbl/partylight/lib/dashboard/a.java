package com.harman.jbl.partylight.lib.dashboard;

import com.harman.jbl.partylight.lib.biz.Color;
import com.harman.jbl.partylight.lib.biz.LightInfo;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Color f46320a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final LightInfo.PatternLooping f46321b;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ a d(a aVar, Color color, LightInfo.PatternLooping patternLooping, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            color = aVar.f46320a;
        }
        if ((i4 & 2) != 0) {
            patternLooping = aVar.f46321b;
        }
        return aVar.c(color, patternLooping);
    }

    @l3.d
    public final Color a() {
        return this.f46320a;
    }

    @l3.d
    public final LightInfo.PatternLooping b() {
        return this.f46321b;
    }

    @l3.d
    public final a c(@l3.d Color color, @l3.d LightInfo.PatternLooping patternLooping) {
        F.p(color, "color");
        F.p(patternLooping, "patternLooping");
        return new a(color, patternLooping);
    }

    @l3.d
    public final Color e() {
        return this.f46320a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return F.g(this.f46320a, aVar.f46320a) && this.f46321b == aVar.f46321b;
    }

    @l3.d
    public final LightInfo.PatternLooping f() {
        return this.f46321b;
    }

    public int hashCode() {
        return (this.f46320a.hashCode() * 31) + this.f46321b.hashCode();
    }

    @l3.d
    public String toString() {
        return "ColorState(color=" + this.f46320a + ", patternLooping=" + this.f46321b + ")";
    }

    public a(@l3.d Color color, @l3.d LightInfo.PatternLooping patternLooping) {
        F.p(color, "color");
        F.p(patternLooping, "patternLooping");
        this.f46320a = color;
        this.f46321b = patternLooping;
    }

    public /* synthetic */ a(Color color, LightInfo.PatternLooping patternLooping, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? Color.f46223H.a() : color, (i4 & 2) != 0 ? LightInfo.PatternLooping.COLOR_LOOP : patternLooping);
    }
}
