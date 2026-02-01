package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class e extends ViewGroup {

    /* renamed from: F, reason: collision with root package name */
    public static final String f10090F = "Constraints";

    /* renamed from: E, reason: collision with root package name */
    d f10091E;

    public e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void c(AttributeSet attributeSet) {
        Log.v(f10090F, " ################# init");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f10091E == null) {
            this.f10091E = new d();
        }
        this.f10091E.J(this);
        return this.f10091E;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
        super.setVisibility(8);
    }

    public e(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        c(attributeSet);
        super.setVisibility(8);
    }

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {

        /* renamed from: V0, reason: collision with root package name */
        public float f10092V0;

        /* renamed from: W0, reason: collision with root package name */
        public boolean f10093W0;

        /* renamed from: X0, reason: collision with root package name */
        public float f10094X0;

        /* renamed from: Y0, reason: collision with root package name */
        public float f10095Y0;

        /* renamed from: Z0, reason: collision with root package name */
        public float f10096Z0;

        /* renamed from: a1, reason: collision with root package name */
        public float f10097a1;

        /* renamed from: b1, reason: collision with root package name */
        public float f10098b1;

        /* renamed from: c1, reason: collision with root package name */
        public float f10099c1;

        /* renamed from: d1, reason: collision with root package name */
        public float f10100d1;

        /* renamed from: e1, reason: collision with root package name */
        public float f10101e1;

        /* renamed from: f1, reason: collision with root package name */
        public float f10102f1;

        /* renamed from: g1, reason: collision with root package name */
        public float f10103g1;

        /* renamed from: h1, reason: collision with root package name */
        public float f10104h1;

        public a(int i4, int i5) {
            super(i4, i5);
            this.f10092V0 = 1.0f;
            this.f10093W0 = false;
            this.f10094X0 = 0.0f;
            this.f10095Y0 = 0.0f;
            this.f10096Z0 = 0.0f;
            this.f10097a1 = 0.0f;
            this.f10098b1 = 1.0f;
            this.f10099c1 = 1.0f;
            this.f10100d1 = 0.0f;
            this.f10101e1 = 0.0f;
            this.f10102f1 = 0.0f;
            this.f10103g1 = 0.0f;
            this.f10104h1 = 0.0f;
        }

        public a(a aVar) {
            super(aVar);
            this.f10092V0 = 1.0f;
            this.f10093W0 = false;
            this.f10094X0 = 0.0f;
            this.f10095Y0 = 0.0f;
            this.f10096Z0 = 0.0f;
            this.f10097a1 = 0.0f;
            this.f10098b1 = 1.0f;
            this.f10099c1 = 1.0f;
            this.f10100d1 = 0.0f;
            this.f10101e1 = 0.0f;
            this.f10102f1 = 0.0f;
            this.f10103g1 = 0.0f;
            this.f10104h1 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10092V0 = 1.0f;
            this.f10093W0 = false;
            this.f10094X0 = 0.0f;
            this.f10095Y0 = 0.0f;
            this.f10096Z0 = 0.0f;
            this.f10097a1 = 0.0f;
            this.f10098b1 = 1.0f;
            this.f10099c1 = 1.0f;
            this.f10100d1 = 0.0f;
            this.f10101e1 = 0.0f;
            this.f10102f1 = 0.0f;
            this.f10103g1 = 0.0f;
            this.f10104h1 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.Wa);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.mb) {
                    this.f10092V0 = obtainStyledAttributes.getFloat(index, this.f10092V0);
                } else if (index == h.m.zb) {
                    this.f10094X0 = obtainStyledAttributes.getFloat(index, this.f10094X0);
                    this.f10093W0 = true;
                } else if (index == h.m.ub) {
                    this.f10096Z0 = obtainStyledAttributes.getFloat(index, this.f10096Z0);
                } else if (index == h.m.vb) {
                    this.f10097a1 = obtainStyledAttributes.getFloat(index, this.f10097a1);
                } else if (index == h.m.tb) {
                    this.f10095Y0 = obtainStyledAttributes.getFloat(index, this.f10095Y0);
                } else if (index == h.m.rb) {
                    this.f10098b1 = obtainStyledAttributes.getFloat(index, this.f10098b1);
                } else if (index == h.m.sb) {
                    this.f10099c1 = obtainStyledAttributes.getFloat(index, this.f10099c1);
                } else if (index == h.m.nb) {
                    this.f10100d1 = obtainStyledAttributes.getFloat(index, this.f10100d1);
                } else if (index == h.m.ob) {
                    this.f10101e1 = obtainStyledAttributes.getFloat(index, this.f10101e1);
                } else if (index == h.m.pb) {
                    this.f10102f1 = obtainStyledAttributes.getFloat(index, this.f10102f1);
                } else if (index == h.m.qb) {
                    this.f10103g1 = obtainStyledAttributes.getFloat(index, this.f10103g1);
                } else if (index == h.m.yb) {
                    this.f10104h1 = obtainStyledAttributes.getFloat(index, this.f10104h1);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
