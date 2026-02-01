package androidx.activity.result;

import androidx.activity.result.m;
import b.C1001b;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class n {
    @l3.d
    public static final m a(@l3.d C1001b.k.f mediaType) {
        F.p(mediaType, "mediaType");
        return new m.a().b(mediaType).a();
    }

    public static /* synthetic */ m b(C1001b.k.f fVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = C1001b.k.C0192b.f20930a;
        }
        return a(fVar);
    }
}
