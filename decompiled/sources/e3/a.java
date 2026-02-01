package e3;

import W2.i;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.text.k;
import kotlin.text.l;
import kotlin.text.m;
import l3.d;
import l3.e;

@i(name = "RegexExtensionsJDK8Kt")
/* loaded from: classes2.dex */
public final class a {
    @e
    @Y(version = "1.2")
    public static final k a(@d l lVar, @d String name) {
        m mVar;
        F.p(lVar, "<this>");
        F.p(name, "name");
        if (lVar instanceof m) {
            mVar = (m) lVar;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            return mVar.a(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
