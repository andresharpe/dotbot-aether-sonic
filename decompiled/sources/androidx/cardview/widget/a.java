package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.W;
import androidx.cardview.widget.g;

@W(17)
/* loaded from: classes.dex */
class a extends c {

    /* renamed from: androidx.cardview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0053a implements g.a {
        C0053a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f4, Paint paint) {
            canvas.drawRoundRect(rectF, f4, f4, paint);
        }
    }

    a() {
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public void j() {
        g.f6433s = new C0053a();
    }
}
