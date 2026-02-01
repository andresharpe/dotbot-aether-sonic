package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.H0;

/* loaded from: classes.dex */
public final class M {
    @l3.d
    public static final Picture a(@l3.d Picture picture, int i4, int i5, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(picture, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        Canvas beginRecording = picture.beginRecording(i4, i5);
        kotlin.jvm.internal.F.o(beginRecording, "beginRecording(width, height)");
        try {
            block.C(beginRecording);
            return picture;
        } finally {
            kotlin.jvm.internal.C.d(1);
            picture.endRecording();
            kotlin.jvm.internal.C.c(1);
        }
    }
}
