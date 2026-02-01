package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import androidx.annotation.e0;
import kotlin.jvm.internal.F;

@W(26)
/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final l f12381a = new l();

    private l() {
    }

    @W2.n
    @InterfaceC0577u
    @l3.d
    public static final Typeface a(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "typedArray");
        Typeface font = typedArray.getFont(i4);
        F.m(font);
        return font;
    }
}
