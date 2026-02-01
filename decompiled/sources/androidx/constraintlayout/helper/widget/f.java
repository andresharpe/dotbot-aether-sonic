package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class f extends p {

    /* renamed from: d0, reason: collision with root package name */
    public static final String f8404d0 = "FadeMove";

    /* renamed from: e0, reason: collision with root package name */
    public static final int f8405e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f8406f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f8407g0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f8408h0 = 2;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f8409i0 = 3;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f8410j0 = -1;

    /* renamed from: S, reason: collision with root package name */
    private float f8411S;

    /* renamed from: T, reason: collision with root package name */
    private int f8412T;

    /* renamed from: U, reason: collision with root package name */
    private int f8413U;

    /* renamed from: V, reason: collision with root package name */
    private int f8414V;

    /* renamed from: W, reason: collision with root package name */
    private int f8415W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f8416a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f8417b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f8418c0;

    public f(Context context) {
        super(context);
        this.f8411S = 0.1f;
        this.f8412T = 49;
        this.f8413U = 50;
        this.f8414V = 0;
        this.f8415W = 0;
        this.f8416a0 = true;
        this.f8417b0 = -1;
        this.f8418c0 = -1;
    }

    private void M(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.Jj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Nj) {
                    int i5 = obtainStyledAttributes.getInt(index, this.f8412T);
                    this.f8412T = i5;
                    this.f8412T = Math.max(Math.min(i5, 99), 0);
                } else if (index == h.m.Lj) {
                    int i6 = obtainStyledAttributes.getInt(index, this.f8413U);
                    this.f8413U = i6;
                    this.f8413U = Math.max(Math.min(i6, 99), 0);
                } else if (index == h.m.Pj) {
                    this.f8414V = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8414V);
                } else if (index == h.m.Qj) {
                    this.f8415W = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8415W);
                } else if (index == h.m.Kj) {
                    this.f8411S = obtainStyledAttributes.getFloat(index, this.f8411S);
                } else if (index == h.m.Mj) {
                    this.f8418c0 = obtainStyledAttributes.getInt(index, this.f8418c0);
                } else if (index == h.m.Oj) {
                    this.f8416a0 = obtainStyledAttributes.getBoolean(index, this.f8416a0);
                } else if (index == h.m.Rj) {
                    this.f8417b0 = obtainStyledAttributes.getResourceId(index, this.f8417b0);
                }
            }
            int i7 = this.f8412T;
            int i8 = this.f8413U;
            if (i7 == i8) {
                if (i7 > 0) {
                    this.f8412T = i7 - 1;
                } else {
                    this.f8413U = i8 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0185, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0199, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a9, code lost:
    
        if (r15 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b9, code lost:
    
        if (r15 == 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    @Override // androidx.constraintlayout.motion.widget.p, androidx.constraintlayout.motion.widget.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(androidx.constraintlayout.motion.widget.s r23, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r24) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.f.g(androidx.constraintlayout.motion.widget.s, java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.p, androidx.constraintlayout.motion.widget.q
    public boolean j() {
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8411S = 0.1f;
        this.f8412T = 49;
        this.f8413U = 50;
        this.f8414V = 0;
        this.f8415W = 0;
        this.f8416a0 = true;
        this.f8417b0 = -1;
        this.f8418c0 = -1;
        M(context, attributeSet);
    }

    public f(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8411S = 0.1f;
        this.f8412T = 49;
        this.f8413U = 50;
        this.f8414V = 0;
        this.f8415W = 0;
        this.f8416a0 = true;
        this.f8417b0 = -1;
        this.f8418c0 = -1;
        M(context, attributeSet);
    }
}
