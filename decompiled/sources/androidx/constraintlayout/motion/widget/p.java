package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;

/* loaded from: classes.dex */
public class p extends androidx.constraintlayout.widget.a implements q {

    /* renamed from: O, reason: collision with root package name */
    private boolean f8905O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f8906P;

    /* renamed from: Q, reason: collision with root package name */
    private float f8907Q;

    /* renamed from: R, reason: collision with root package name */
    protected View[] f8908R;

    public p(Context context) {
        super(context);
        this.f8905O = false;
        this.f8906P = false;
    }

    public void L(View view, float f4) {
    }

    public void a(s sVar, int i4, int i5, float f4) {
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public void b(s sVar) {
    }

    @Override // androidx.constraintlayout.motion.widget.s.l
    public void c(s sVar, int i4, int i5) {
    }

    @Override // androidx.constraintlayout.motion.widget.s.l
    public void d(s sVar, int i4, boolean z3, float f4) {
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public boolean e() {
        return this.f8905O;
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public boolean f() {
        return this.f8906P;
    }

    public void g(s sVar, HashMap<View, o> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0613a
    public float getProgress() {
        return this.f8907Q;
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public void h(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public void i(Canvas canvas) {
    }

    public boolean j() {
        return false;
    }

    public void k(s sVar, int i4) {
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0613a
    public void setProgress(float f4) {
        this.f8907Q = f4;
        int i4 = 0;
        if (this.f9640F > 0) {
            this.f8908R = x((ConstraintLayout) getParent());
            while (i4 < this.f9640F) {
                L(this.f8908R[i4], f4);
                i4++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i4 < childCount) {
            View childAt = viewGroup.getChildAt(i4);
            if (!(childAt instanceof p)) {
                L(childAt, f4);
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.a
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.Sj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Uj) {
                    this.f8905O = obtainStyledAttributes.getBoolean(index, this.f8905O);
                } else if (index == h.m.Tj) {
                    this.f8906P = obtainStyledAttributes.getBoolean(index, this.f8906P);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8905O = false;
        this.f8906P = false;
        z(attributeSet);
    }

    public p(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8905O = false;
        this.f8906P = false;
        z(attributeSet);
    }
}
