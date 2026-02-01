package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.F;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@W(19)
/* loaded from: classes.dex */
public final class s extends l {

    /* renamed from: J, reason: collision with root package name */
    @P
    private static Paint f14564J;

    public s(@N j jVar) {
        super(jVar);
    }

    @N
    private static Paint f() {
        if (f14564J == null) {
            TextPaint textPaint = new TextPaint();
            f14564J = textPaint;
            textPaint.setColor(g.b().e());
            f14564J.setStyle(Paint.Style.FILL);
        }
        return f14564J;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@N Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @F(from = 0) int i4, @F(from = 0) int i5, float f4, int i6, int i7, int i8, @N Paint paint) {
        if (g.b().o()) {
            canvas.drawRect(f4, i6, f4 + e(), i8, f());
        }
        c().a(canvas, f4, i7, paint);
    }
}
