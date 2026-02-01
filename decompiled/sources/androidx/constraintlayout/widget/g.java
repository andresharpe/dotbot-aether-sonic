package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: E, reason: collision with root package name */
    private int f10105E;

    /* renamed from: F, reason: collision with root package name */
    private View f10106F;

    /* renamed from: G, reason: collision with root package name */
    private int f10107G;

    public g(Context context) {
        super(context);
        this.f10105E = -1;
        this.f10106F = null;
        this.f10107G = 4;
        a(null);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f10107G);
        this.f10105E = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.O8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.P8) {
                    this.f10105E = obtainStyledAttributes.getResourceId(index, this.f10105E);
                } else if (index == h.m.Q8) {
                    this.f10107G = obtainStyledAttributes.getInt(index, this.f10107G);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f10106F == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f10106F.getLayoutParams();
        bVar2.f9562v0.b2(0);
        ConstraintWidget.DimensionBehaviour H3 = bVar.f9562v0.H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (H3 != dimensionBehaviour) {
            bVar.f9562v0.c2(bVar2.f9562v0.m0());
        }
        if (bVar.f9562v0.j0() != dimensionBehaviour) {
            bVar.f9562v0.y1(bVar2.f9562v0.D());
        }
        bVar2.f9562v0.b2(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f10105E == -1 && !isInEditMode()) {
            setVisibility(this.f10107G);
        }
        View findViewById = constraintLayout.findViewById(this.f10105E);
        this.f10106F = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f9538j0 = true;
            this.f10106F.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f10106F;
    }

    public int getEmptyVisibility() {
        return this.f10107G;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i4) {
        View findViewById;
        if (this.f10105E == i4) {
            return;
        }
        View view = this.f10106F;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f10106F.getLayoutParams()).f9538j0 = false;
            this.f10106F = null;
        }
        this.f10105E = i4;
        if (i4 != -1 && (findViewById = ((View) getParent()).findViewById(i4)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i4) {
        this.f10107G = i4;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10105E = -1;
        this.f10106F = null;
        this.f10107G = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f10105E = -1;
        this.f10106F = null;
        this.f10107G = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4);
        this.f10105E = -1;
        this.f10106F = null;
        this.f10107G = 4;
        a(attributeSet);
    }
}
