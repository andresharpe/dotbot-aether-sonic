package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class y1 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f12153b = 1048576;

    /* renamed from: c, reason: collision with root package name */
    private static final String f12154c = "sharedElement:snapshot:bitmap";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12155d = "sharedElement:snapshot:imageScaleType";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12156e = "sharedElement:snapshot:imageMatrix";

    /* renamed from: a, reason: collision with root package name */
    private Matrix f12157a;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    private static Bitmap a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
            if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int i4 = (int) (intrinsicWidth * min);
            int i5 = (int) (intrinsicHeight * min);
            Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect bounds = drawable.getBounds();
            int i6 = bounds.left;
            int i7 = bounds.top;
            int i8 = bounds.right;
            int i9 = bounds.bottom;
            drawable.setBounds(0, 0, i4, i5);
            drawable.draw(canvas);
            drawable.setBounds(i6, i7, i8, i9);
            return createBitmap;
        }
        return null;
    }

    public Parcelable b(View view, Matrix matrix, RectF rectF) {
        Bitmap a4;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (a4 = a(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f12154c, a4);
                bundle.putString(f12155d, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(f12156e, fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int i4 = (int) (round * min);
            int i5 = (int) (round2 * min);
            if (this.f12157a == null) {
                this.f12157a = new Matrix();
            }
            this.f12157a.set(matrix);
            this.f12157a.postTranslate(-rectF.left, -rectF.top);
            this.f12157a.postScale(min, min);
            Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.concat(this.f12157a);
            view.draw(canvas);
            return createBitmap;
        }
        return null;
    }

    public View c(Context context, Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f12154c);
            if (bitmap == null) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(f12155d)));
            if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray(f12156e);
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
                return imageView;
            }
            return imageView;
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap((Bitmap) parcelable);
        return imageView2;
    }

    public void d(List<String> list, Map<String, View> map) {
    }

    public void e(List<View> list) {
    }

    public void f(List<String> list, List<View> list2, List<View> list3) {
    }

    public void g(List<String> list, List<View> list2, List<View> list3) {
    }

    public void h(List<String> list, List<View> list2, a aVar) {
        aVar.a();
    }
}
