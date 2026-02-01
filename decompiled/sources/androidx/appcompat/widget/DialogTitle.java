package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int lineCount;
        super.onMeasure(i4, i5);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C2042a.m.O5, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2042a.m.P5, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i4, i5);
        }
    }

    public DialogTitle(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(@androidx.annotation.N Context context) {
        super(context);
    }
}
