package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.l;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import o.InterfaceMenuC2377a;

/* loaded from: classes.dex */
public class d extends l {

    /* renamed from: o0, reason: collision with root package name */
    private static final String f8360o0 = "Grid";

    /* renamed from: p0, reason: collision with root package name */
    public static final int f8361p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f8362q0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    private static final boolean f8363r0 = false;

    /* renamed from: Q, reason: collision with root package name */
    private final int f8364Q;

    /* renamed from: R, reason: collision with root package name */
    private final int f8365R;

    /* renamed from: S, reason: collision with root package name */
    private View[] f8366S;

    /* renamed from: T, reason: collision with root package name */
    ConstraintLayout f8367T;

    /* renamed from: U, reason: collision with root package name */
    private int f8368U;

    /* renamed from: V, reason: collision with root package name */
    private int f8369V;

    /* renamed from: W, reason: collision with root package name */
    private int f8370W;

    /* renamed from: a0, reason: collision with root package name */
    private int f8371a0;

    /* renamed from: b0, reason: collision with root package name */
    private String f8372b0;

    /* renamed from: c0, reason: collision with root package name */
    private String f8373c0;

    /* renamed from: d0, reason: collision with root package name */
    private String f8374d0;

    /* renamed from: e0, reason: collision with root package name */
    private String f8375e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f8376f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f8377g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f8378h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f8379i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f8380j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f8381k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean[][] f8382l0;

    /* renamed from: m0, reason: collision with root package name */
    Set<Integer> f8383m0;

    /* renamed from: n0, reason: collision with root package name */
    private int[] f8384n0;

    public d(Context context) {
        super(context);
        this.f8364Q = 50;
        this.f8365R = 50;
        this.f8379i0 = 0;
        this.f8383m0 = new HashSet();
    }

    private boolean M() {
        View[] x3 = x(this.f8367T);
        for (int i4 = 0; i4 < this.f9640F; i4++) {
            if (!this.f8383m0.contains(Integer.valueOf(this.f9639E[i4]))) {
                int nextPosition = getNextPosition();
                int R3 = R(nextPosition);
                int Q3 = Q(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                O(x3[i4], R3, Q3, 1, 1);
            }
        }
        return true;
    }

    private void N() {
        int max = Math.max(this.f8368U, this.f8370W);
        View[] viewArr = this.f8366S;
        int i4 = 0;
        if (viewArr == null) {
            this.f8366S = new View[max];
            int i5 = 0;
            while (true) {
                View[] viewArr2 = this.f8366S;
                if (i5 >= viewArr2.length) {
                    break;
                }
                viewArr2[i5] = Y();
                i5++;
            }
        } else if (max != viewArr.length) {
            View[] viewArr3 = new View[max];
            for (int i6 = 0; i6 < max; i6++) {
                View[] viewArr4 = this.f8366S;
                if (i6 < viewArr4.length) {
                    viewArr3[i6] = viewArr4[i6];
                } else {
                    viewArr3[i6] = Y();
                }
            }
            int i7 = max;
            while (true) {
                View[] viewArr5 = this.f8366S;
                if (i7 >= viewArr5.length) {
                    break;
                }
                this.f8367T.removeView(viewArr5[i7]);
                i7++;
            }
            this.f8366S = viewArr3;
        }
        this.f8384n0 = new int[max];
        while (true) {
            View[] viewArr6 = this.f8366S;
            if (i4 < viewArr6.length) {
                this.f8384n0[i4] = viewArr6[i4].getId();
                i4++;
            } else {
                d0();
                c0();
                return;
            }
        }
    }

    private void O(View view, int i4, int i5, int i6, int i7) {
        ConstraintLayout.b Z3 = Z(view);
        int[] iArr = this.f8384n0;
        Z3.f9527e = iArr[i5];
        Z3.f9535i = iArr[i4];
        Z3.f9533h = iArr[(i5 + i7) - 1];
        Z3.f9541l = iArr[(i4 + i6) - 1];
    }

    private boolean P(boolean z3) {
        boolean z4;
        int[][] a02;
        int[][] a03;
        if (this.f8367T == null || this.f8368U < 1 || this.f8370W < 1) {
            return false;
        }
        if (z3) {
            for (int i4 = 0; i4 < this.f8382l0.length; i4++) {
                int i5 = 0;
                while (true) {
                    boolean[][] zArr = this.f8382l0;
                    if (i5 < zArr[0].length) {
                        zArr[i4][i5] = true;
                        i5++;
                    }
                }
            }
            this.f8383m0.clear();
        }
        this.f8379i0 = 0;
        N();
        String str = this.f8373c0;
        if (str != null && !str.trim().isEmpty() && (a03 = a0(this.f8373c0)) != null) {
            z4 = S(a03) & true;
        } else {
            z4 = true;
        }
        String str2 = this.f8372b0;
        if (str2 != null && !str2.trim().isEmpty() && (a02 = a0(this.f8372b0)) != null) {
            z4 &= T(this.f9639E, a02);
        }
        boolean M3 = z4 & M();
        this.f8367T.requestLayout();
        q();
        if (!M3 && this.f8380j0) {
            return false;
        }
        return true;
    }

    private int Q(int i4) {
        if (this.f8378h0 == 1) {
            return i4 / this.f8368U;
        }
        return i4 % this.f8370W;
    }

    private int R(int i4) {
        if (this.f8378h0 == 1) {
            return i4 % this.f8368U;
        }
        return i4 / this.f8370W;
    }

    private boolean S(int[][] iArr) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int R3 = R(iArr[i4][0]);
            int Q3 = Q(iArr[i4][0]);
            int[] iArr2 = iArr[i4];
            if (!V(R3, Q3, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    private boolean T(int[] iArr, int[][] iArr2) {
        View[] x3 = x(this.f8367T);
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            int R3 = R(iArr2[i4][0]);
            int Q3 = Q(iArr2[i4][0]);
            int[] iArr3 = iArr2[i4];
            if (!V(R3, Q3, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = x3[i4];
            int[] iArr4 = iArr2[i4];
            O(view, R3, Q3, iArr4[1], iArr4[2]);
            this.f8383m0.add(Integer.valueOf(iArr[i4]));
        }
        return true;
    }

    private void U() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f8368U, this.f8370W);
        this.f8382l0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    private boolean V(int i4, int i5, int i6, int i7) {
        for (int i8 = i4; i8 < i4 + i6; i8++) {
            for (int i9 = i5; i9 < i5 + i7; i9++) {
                boolean[][] zArr = this.f8382l0;
                if (i8 < zArr.length && i9 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i8];
                    if (zArr2[i9]) {
                        zArr2[i9] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean W(CharSequence charSequence) {
        return true;
    }

    private boolean X(String str) {
        return true;
    }

    private View Y() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.f8367T.addView(view, new ConstraintLayout.b(0, 0));
        return view;
    }

    private ConstraintLayout.b Z(View view) {
        return (ConstraintLayout.b) view.getLayoutParams();
    }

    private int[][] a0(String str) {
        if (!W(str)) {
            return null;
        }
        String[] split = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
        for (int i4 = 0; i4 < split.length; i4++) {
            String[] split2 = split[i4].trim().split(":");
            String[] split3 = split2[1].split("x");
            iArr[i4][0] = Integer.parseInt(split2[0]);
            iArr[i4][1] = Integer.parseInt(split3[0]);
            iArr[i4][2] = Integer.parseInt(split3[1]);
        }
        return iArr;
    }

    private float[] b0(int i4, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] split = str.split(",");
            if (split.length != i4) {
                return null;
            }
            fArr = new float[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                fArr[i5] = Float.parseFloat(split[i5].trim());
            }
        }
        return fArr;
    }

    private void c0() {
        int i4;
        int id = getId();
        int max = Math.max(this.f8368U, this.f8370W);
        float[] b02 = b0(this.f8370W, this.f8375e0);
        int i5 = 0;
        ConstraintLayout.b Z3 = Z(this.f8366S[0]);
        if (this.f8370W == 1) {
            Z3.f9527e = id;
            Z3.f9533h = id;
            return;
        }
        while (true) {
            i4 = this.f8370W;
            if (i5 >= i4) {
                break;
            }
            ConstraintLayout.b Z4 = Z(this.f8366S[i5]);
            if (b02 != null) {
                Z4.f9504L = b02[i5];
            }
            if (i5 > 0) {
                Z4.f9529f = this.f8384n0[i5 - 1];
            } else {
                Z4.f9527e = id;
            }
            if (i5 < this.f8370W - 1) {
                Z4.f9531g = this.f8384n0[i5 + 1];
            } else {
                Z4.f9533h = id;
            }
            if (i5 > 0) {
                ((ViewGroup.MarginLayoutParams) Z4).leftMargin = (int) this.f8376f0;
            }
            i5++;
        }
        while (i4 < max) {
            ConstraintLayout.b Z5 = Z(this.f8366S[i4]);
            Z5.f9527e = id;
            Z5.f9533h = id;
            i4++;
        }
    }

    private void d0() {
        int i4;
        int id = getId();
        int max = Math.max(this.f8368U, this.f8370W);
        float[] b02 = b0(this.f8368U, this.f8374d0);
        int i5 = 0;
        if (this.f8368U == 1) {
            ConstraintLayout.b Z3 = Z(this.f8366S[0]);
            Z3.f9535i = id;
            Z3.f9541l = id;
            return;
        }
        while (true) {
            i4 = this.f8368U;
            if (i5 >= i4) {
                break;
            }
            ConstraintLayout.b Z4 = Z(this.f8366S[i5]);
            if (b02 != null) {
                Z4.f9505M = b02[i5];
            }
            if (i5 > 0) {
                Z4.f9537j = this.f8384n0[i5 - 1];
            } else {
                Z4.f9535i = id;
            }
            if (i5 < this.f8368U - 1) {
                Z4.f9539k = this.f8384n0[i5 + 1];
            } else {
                Z4.f9541l = id;
            }
            if (i5 > 0) {
                ((ViewGroup.MarginLayoutParams) Z4).topMargin = (int) this.f8376f0;
            }
            i5++;
        }
        while (i4 < max) {
            ConstraintLayout.b Z5 = Z(this.f8366S[i4]);
            Z5.f9535i = id;
            Z5.f9541l = id;
            i4++;
        }
    }

    private void e0() {
        int i4;
        int i5 = this.f8369V;
        if (i5 != 0 && (i4 = this.f8371a0) != 0) {
            this.f8368U = i5;
            this.f8370W = i4;
            return;
        }
        int i6 = this.f8371a0;
        if (i6 > 0) {
            this.f8370W = i6;
            this.f8368U = ((this.f9640F + i6) - 1) / i6;
        } else if (i5 > 0) {
            this.f8368U = i5;
            this.f8370W = ((this.f9640F + i5) - 1) / i5;
        } else {
            int sqrt = (int) (Math.sqrt(this.f9640F) + 1.5d);
            this.f8368U = sqrt;
            this.f8370W = ((this.f9640F + sqrt) - 1) / sqrt;
        }
    }

    private int getNextPosition() {
        boolean z3 = false;
        int i4 = 0;
        while (!z3) {
            i4 = this.f8379i0;
            if (i4 >= this.f8368U * this.f8370W) {
                return -1;
            }
            int R3 = R(i4);
            int Q3 = Q(this.f8379i0);
            boolean[] zArr = this.f8382l0[R3];
            if (zArr[Q3]) {
                zArr[Q3] = false;
                z3 = true;
            }
            this.f8379i0++;
        }
        return i4;
    }

    public String getColumnWeights() {
        return this.f8375e0;
    }

    public int getColumns() {
        return this.f8371a0;
    }

    public float getHorizontalGaps() {
        return this.f8376f0;
    }

    public int getOrientation() {
        return this.f8378h0;
    }

    public String getRowWeights() {
        return this.f8374d0;
    }

    public int getRows() {
        return this.f8369V;
    }

    public String getSkips() {
        return this.f8373c0;
    }

    public String getSpans() {
        return this.f8372b0;
    }

    public float getVerticalGaps() {
        return this.f8377g0;
    }

    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8367T = (ConstraintLayout) getParent();
        P(false);
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(InterfaceMenuC2377a.f55290c);
        paint.setStyle(Paint.Style.STROKE);
        int top = getTop();
        int left = getLeft();
        int bottom = getBottom();
        int right = getRight();
        View[] viewArr = this.f8366S;
        int length = viewArr.length;
        int i4 = 0;
        while (i4 < length) {
            View view = viewArr[i4];
            int left2 = view.getLeft() - left;
            int top2 = view.getTop() - top;
            int right2 = view.getRight() - left;
            int bottom2 = view.getBottom() - top;
            canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
            canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
            i4++;
            top = top;
        }
    }

    public void setColumnWeights(String str) {
        if (!X(str)) {
            return;
        }
        String str2 = this.f8375e0;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.f8375e0 = str;
        P(true);
        invalidate();
    }

    public void setColumns(int i4) {
        if (i4 > 50 || this.f8371a0 == i4) {
            return;
        }
        this.f8371a0 = i4;
        e0();
        U();
        P(false);
        invalidate();
    }

    public void setHorizontalGaps(float f4) {
        if (f4 < 0.0f || this.f8376f0 == f4) {
            return;
        }
        this.f8376f0 = f4;
        P(true);
        invalidate();
    }

    public void setOrientation(int i4) {
        if ((i4 != 0 && i4 != 1) || this.f8378h0 == i4) {
            return;
        }
        this.f8378h0 = i4;
        P(true);
        invalidate();
    }

    public void setRowWeights(String str) {
        if (!X(str)) {
            return;
        }
        String str2 = this.f8374d0;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.f8374d0 = str;
        P(true);
        invalidate();
    }

    public void setRows(int i4) {
        if (i4 > 50 || this.f8369V == i4) {
            return;
        }
        this.f8369V = i4;
        e0();
        U();
        P(false);
        invalidate();
    }

    public void setSkips(String str) {
        if (!W(str)) {
            return;
        }
        String str2 = this.f8373c0;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.f8373c0 = str;
        P(true);
        invalidate();
    }

    public void setSpans(CharSequence charSequence) {
        if (!W(charSequence)) {
            return;
        }
        String str = this.f8372b0;
        if (str != null && str.contentEquals(charSequence)) {
            return;
        }
        this.f8372b0 = charSequence.toString();
        P(true);
        invalidate();
    }

    public void setVerticalGaps(float f4) {
        if (f4 < 0.0f || this.f8377g0 == f4) {
            return;
        }
        this.f8377g0 = f4;
        P(true);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.ue);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Ae) {
                    this.f8369V = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == h.m.we) {
                    this.f8371a0 = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == h.m.Ce) {
                    this.f8372b0 = obtainStyledAttributes.getString(index);
                } else if (index == h.m.Be) {
                    this.f8373c0 = obtainStyledAttributes.getString(index);
                } else if (index == h.m.ze) {
                    this.f8374d0 = obtainStyledAttributes.getString(index);
                } else if (index == h.m.ve) {
                    this.f8375e0 = obtainStyledAttributes.getString(index);
                } else if (index == h.m.ye) {
                    this.f8378h0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == h.m.xe) {
                    this.f8376f0 = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == h.m.Fe) {
                    this.f8377g0 = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == h.m.Ee) {
                    this.f8380j0 = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == h.m.De) {
                    this.f8381k0 = obtainStyledAttributes.getBoolean(index, false);
                }
            }
            e0();
            U();
            obtainStyledAttributes.recycle();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8364Q = 50;
        this.f8365R = 50;
        this.f8379i0 = 0;
        this.f8383m0 = new HashSet();
    }

    public d(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8364Q = 50;
        this.f8365R = 50;
        this.f8379i0 = 0;
        this.f8383m0 = new HashSet();
    }
}
