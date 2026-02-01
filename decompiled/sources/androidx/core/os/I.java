package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

@W(22)
/* loaded from: classes.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final I f12715a = new I();

    private I() {
    }

    @W2.n
    @InterfaceC0577u
    public static final void a(@l3.d PersistableBundle persistableBundle, @l3.e String str, boolean z3) {
        kotlin.jvm.internal.F.p(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z3);
    }

    @W2.n
    @InterfaceC0577u
    public static final void b(@l3.d PersistableBundle persistableBundle, @l3.e String str, @l3.d boolean[] value) {
        kotlin.jvm.internal.F.p(persistableBundle, "persistableBundle");
        kotlin.jvm.internal.F.p(value, "value");
        persistableBundle.putBooleanArray(str, value);
    }
}
