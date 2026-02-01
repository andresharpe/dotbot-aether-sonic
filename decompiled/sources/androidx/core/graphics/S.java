package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.H0;

/* loaded from: classes.dex */
public final class S {
    public static final void a(@l3.d Shader shader, @l3.d X2.l<? super Matrix, H0> block) {
        kotlin.jvm.internal.F.p(shader, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        block.C(matrix);
        shader.setLocalMatrix(matrix);
    }
}
