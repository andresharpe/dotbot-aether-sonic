package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.preference.q;

@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: E, reason: collision with root package name */
    private int f16915E;

    /* renamed from: F, reason: collision with root package name */
    private int f16916F;

    public PreferenceImageView(@N Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f16916F;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f16915E;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i4);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i4 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i5);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i5 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i4) {
        this.f16916F = i4;
        super.setMaxHeight(i4);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i4) {
        this.f16915E = i4;
        super.setMaxWidth(i4);
    }

    public PreferenceImageView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f16915E = Integer.MAX_VALUE;
        this.f16916F = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17140J0, i4, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(q.k.f17149N0, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(q.k.f17147M0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
}
