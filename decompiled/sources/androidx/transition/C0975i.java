package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Q;
import java.util.Map;

/* renamed from: androidx.transition.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0975i extends J {

    /* renamed from: z0, reason: collision with root package name */
    private static final String f20061z0 = "android:changeImageTransform:matrix";

    /* renamed from: A0, reason: collision with root package name */
    private static final String f20057A0 = "android:changeImageTransform:bounds";

    /* renamed from: B0, reason: collision with root package name */
    private static final String[] f20058B0 = {f20061z0, f20057A0};

    /* renamed from: C0, reason: collision with root package name */
    private static final TypeEvaluator<Matrix> f20059C0 = new a();

    /* renamed from: D0, reason: collision with root package name */
    private static final Property<ImageView, Matrix> f20060D0 = new b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.i$a */
    /* loaded from: classes.dex */
    class a implements TypeEvaluator<Matrix> {
        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.i$b */
    /* loaded from: classes.dex */
    class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            C0988w.a(imageView, matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.i$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20062a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f20062a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20062a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C0975i() {
    }

    private void E0(S s4) {
        View view = s4.f19960b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = s4.f19959a;
            map.put(f20057A0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(f20061z0, G0(imageView));
        }
    }

    private static Matrix F0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f4 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f5 = intrinsicHeight;
        float max = Math.max(width / f4, height / f5);
        int round = Math.round((width - (f4 * max)) / 2.0f);
        int round2 = Math.round((height - (f5 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    @androidx.annotation.N
    private static Matrix G0(@androidx.annotation.N ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i4 = c.f20062a[imageView.getScaleType().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    return new Matrix(imageView.getImageMatrix());
                }
                return F0(imageView);
            }
            return J0(imageView);
        }
        return new Matrix(imageView.getImageMatrix());
    }

    private ObjectAnimator H0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f20060D0, (TypeEvaluator) new Q.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @androidx.annotation.N
    private ObjectAnimator I0(@androidx.annotation.N ImageView imageView) {
        Property<ImageView, Matrix> property = f20060D0;
        TypeEvaluator<Matrix> typeEvaluator = f20059C0;
        Matrix matrix = C0989x.f20195a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix J0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    public String[] Y() {
        return f20058B0;
    }

    @Override // androidx.transition.J
    public void l(@androidx.annotation.N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    public void p(@androidx.annotation.N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    @androidx.annotation.P
    public Animator t(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.P S s4, @androidx.annotation.P S s5) {
        boolean z3;
        if (s4 == null || s5 == null) {
            return null;
        }
        Rect rect = (Rect) s4.f19959a.get(f20057A0);
        Rect rect2 = (Rect) s5.f19959a.get(f20057A0);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) s4.f19959a.get(f20061z0);
        Matrix matrix2 = (Matrix) s5.f19959a.get(f20061z0);
        if ((matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rect.equals(rect2) && z3) {
            return null;
        }
        ImageView imageView = (ImageView) s5.f19960b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (matrix == null) {
                matrix = C0989x.f20195a;
            }
            if (matrix2 == null) {
                matrix2 = C0989x.f20195a;
            }
            f20060D0.set(imageView, matrix);
            return H0(imageView, matrix, matrix2);
        }
        return I0(imageView);
    }

    public C0975i(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
