package androidx.savedstate;

import android.view.View;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class f {
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @V(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ e a(View view) {
        F.p(view, "<this>");
        return g.a(view);
    }
}
