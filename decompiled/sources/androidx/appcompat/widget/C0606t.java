package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0606t {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6318c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f6319a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f6320b;

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(23)
    /* renamed from: androidx.appcompat.widget.t$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i4) {
            layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
            layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
            layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
            layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
            layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
            layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
            layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
            layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
            layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0606t(ProgressBar progressBar) {
        this.f6319a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i4 = 0; i4 < numberOfFrames; i4++) {
                Drawable d4 = d(animationDrawable.getFrame(i4), true);
                d4.setLevel(com.clj.fastble.a.f26980l);
                animationDrawable2.addFrame(d4, animationDrawable.getDuration(i4));
            }
            animationDrawable2.setLevel(com.clj.fastble.a.f26980l);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap b() {
        return this.f6320b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i4) {
        g0 G3 = g0.G(this.f6319a.getContext(), attributeSet, f6318c, i4, 0);
        Drawable i5 = G3.i(0);
        if (i5 != null) {
            this.f6319a.setIndeterminateDrawable(e(i5));
        }
        Drawable i6 = G3.i(1);
        if (i6 != null) {
            this.f6319a.setProgressDrawable(d(i6, false));
        }
        G3.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.i0
    Drawable d(Drawable drawable, boolean z3) {
        boolean z4;
        if (drawable instanceof androidx.core.graphics.drawable.l) {
            androidx.core.graphics.drawable.l lVar = (androidx.core.graphics.drawable.l) drawable;
            Drawable b4 = lVar.b();
            if (b4 != null) {
                lVar.a(d(b4, z3));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id = layerDrawable.getId(i4);
                    Drawable drawable2 = layerDrawable.getDrawable(i4);
                    if (id != 16908301 && id != 16908303) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    drawableArr[i4] = d(drawable2, z4);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    layerDrawable2.setId(i5, layerDrawable.getId(i5));
                    a.a(layerDrawable, layerDrawable2, i5);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f6320b == null) {
                    this.f6320b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z3) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }
}
