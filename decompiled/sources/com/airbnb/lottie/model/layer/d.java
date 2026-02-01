package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.N;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: F, reason: collision with root package name */
    private final Paint f21773F;

    /* renamed from: G, reason: collision with root package name */
    private final Rect f21774G;

    /* renamed from: H, reason: collision with root package name */
    private final Rect f21775H;

    /* renamed from: I, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f21776I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> f21777J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(j jVar, Layer layer) {
        super(jVar, layer);
        this.f21773F = new com.airbnb.lottie.animation.a(3);
        this.f21774G = new Rect();
        this.f21775H = new Rect();
    }

    @P
    private Bitmap O() {
        Bitmap h4;
        com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> aVar = this.f21777J;
        if (aVar != null && (h4 = aVar.h()) != null) {
            return h4;
        }
        return this.f21750n.C(this.f21751o.m());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        if (O() != null) {
            rectF.set(0.0f, 0.0f, r3.getWidth() * com.airbnb.lottie.utils.j.e(), r3.getHeight() * com.airbnb.lottie.utils.j.e());
            this.f21749m.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        super.h(t3, jVar);
        if (t3 == o.f21823K) {
            if (jVar == null) {
                this.f21776I = null;
                return;
            } else {
                this.f21776I = new q(jVar);
                return;
            }
        }
        if (t3 == o.f21826N) {
            if (jVar == null) {
                this.f21777J = null;
            } else {
                this.f21777J = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(@N Canvas canvas, Matrix matrix, int i4) {
        Bitmap O3 = O();
        if (O3 != null && !O3.isRecycled()) {
            float e4 = com.airbnb.lottie.utils.j.e();
            this.f21773F.setAlpha(i4);
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21776I;
            if (aVar != null) {
                this.f21773F.setColorFilter(aVar.h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f21774G.set(0, 0, O3.getWidth(), O3.getHeight());
            this.f21775H.set(0, 0, (int) (O3.getWidth() * e4), (int) (O3.getHeight() * e4));
            canvas.drawBitmap(O3, this.f21774G, this.f21775H, this.f21773F);
            canvas.restore();
        }
    }
}
