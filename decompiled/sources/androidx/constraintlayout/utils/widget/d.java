package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.W;
import androidx.appcompat.widget.C0594g;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class d extends C0594g {

    /* renamed from: H, reason: collision with root package name */
    private float f9345H;

    /* renamed from: I, reason: collision with root package name */
    private float f9346I;

    /* renamed from: J, reason: collision with root package name */
    private Path f9347J;

    /* renamed from: K, reason: collision with root package name */
    ViewOutlineProvider f9348K;

    /* renamed from: L, reason: collision with root package name */
    RectF f9349L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, d.this.getWidth(), d.this.getHeight(), (Math.min(r3, r4) * d.this.f9345H) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, d.this.getWidth(), d.this.getHeight(), d.this.f9346I);
        }
    }

    public d(Context context) {
        super(context);
        this.f9345H = 0.0f;
        this.f9346I = Float.NaN;
        d(context, null);
    }

    private void d(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.Ge);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Re) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == h.m.Se) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f9346I;
    }

    public float getRoundPercent() {
        return this.f9345H;
    }

    @W(21)
    public void setRound(float f4) {
        boolean z3;
        if (Float.isNaN(f4)) {
            this.f9346I = f4;
            float f5 = this.f9345H;
            this.f9345H = -1.0f;
            setRoundPercent(f5);
            return;
        }
        if (this.f9346I != f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9346I = f4;
        if (f4 != 0.0f) {
            if (this.f9347J == null) {
                this.f9347J = new Path();
            }
            if (this.f9349L == null) {
                this.f9349L = new RectF();
            }
            if (this.f9348K == null) {
                b bVar = new b();
                this.f9348K = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f9349L.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f9347J.reset();
            Path path = this.f9347J;
            RectF rectF = this.f9349L;
            float f6 = this.f9346I;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    @W(21)
    public void setRoundPercent(float f4) {
        boolean z3;
        if (this.f9345H != f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9345H = f4;
        if (f4 != 0.0f) {
            if (this.f9347J == null) {
                this.f9347J = new Path();
            }
            if (this.f9349L == null) {
                this.f9349L = new RectF();
            }
            if (this.f9348K == null) {
                a aVar = new a();
                this.f9348K = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f9345H) / 2.0f;
            this.f9349L.set(0.0f, 0.0f, width, height);
            this.f9347J.reset();
            this.f9347J.addRoundRect(this.f9349L, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9345H = 0.0f;
        this.f9346I = Float.NaN;
        d(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9345H = 0.0f;
        this.f9346I = Float.NaN;
        d(context, attributeSet);
    }
}
