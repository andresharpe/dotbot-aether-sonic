package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f19952a = 1048576;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f19953b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f19954c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f19955d;

    /* loaded from: classes.dex */
    static class a implements TypeEvaluator<Matrix> {

        /* renamed from: a, reason: collision with root package name */
        final float[] f19956a = new float[9];

        /* renamed from: b, reason: collision with root package name */
        final float[] f19957b = new float[9];

        /* renamed from: c, reason: collision with root package name */
        final Matrix f19958c = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f19956a);
            matrix2.getValues(this.f19957b);
            for (int i4 = 0; i4 < 9; i4++) {
                float[] fArr = this.f19957b;
                float f5 = fArr[i4];
                float f6 = this.f19956a[i4];
                fArr[i4] = f6 + ((f5 - f6) * f4);
            }
            this.f19958c.setValues(this.f19957b);
            return this.f19958c;
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        boolean z3 = true;
        f19953b = true;
        f19954c = true;
        if (i4 < 28) {
            z3 = false;
        }
        f19955d = z3;
    }

    private Q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        f0.j(view, matrix);
        f0.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b4 = b(view, matrix, rectF, viewGroup);
        if (b4 != null) {
            imageView.setImageBitmap(b4);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    private static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z3;
        boolean z4;
        int i4;
        ViewGroup viewGroup2;
        if (f19953b) {
            z3 = !view.isAttachedToWindow();
            if (viewGroup == null) {
                z4 = false;
            } else {
                z4 = viewGroup.isAttachedToWindow();
            }
        } else {
            z3 = false;
            z4 = false;
        }
        boolean z5 = f19954c;
        Bitmap bitmap = null;
        if (z5 && z3) {
            if (!z4) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i4 = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        } else {
            i4 = 0;
            viewGroup2 = null;
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f19955d) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z5 && z3) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i4);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
