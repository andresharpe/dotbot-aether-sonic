package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c extends l {

    /* renamed from: d0, reason: collision with root package name */
    private static final String f8347d0 = "CircularFlow";

    /* renamed from: e0, reason: collision with root package name */
    private static int f8348e0;

    /* renamed from: f0, reason: collision with root package name */
    private static float f8349f0;

    /* renamed from: Q, reason: collision with root package name */
    ConstraintLayout f8350Q;

    /* renamed from: R, reason: collision with root package name */
    int f8351R;

    /* renamed from: S, reason: collision with root package name */
    private float[] f8352S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f8353T;

    /* renamed from: U, reason: collision with root package name */
    private int f8354U;

    /* renamed from: V, reason: collision with root package name */
    private int f8355V;

    /* renamed from: W, reason: collision with root package name */
    private String f8356W;

    /* renamed from: a0, reason: collision with root package name */
    private String f8357a0;

    /* renamed from: b0, reason: collision with root package name */
    private Float f8358b0;

    /* renamed from: c0, reason: collision with root package name */
    private Integer f8359c0;

    public c(Context context) {
        super(context);
    }

    private void M(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f9641G == null || (fArr = this.f8352S) == null) {
            return;
        }
        if (this.f8355V + 1 > fArr.length) {
            this.f8352S = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f8352S[this.f8355V] = Integer.parseInt(str);
        this.f8355V++;
    }

    private void N(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f9641G == null || (iArr = this.f8353T) == null) {
            return;
        }
        if (this.f8354U + 1 > iArr.length) {
            this.f8353T = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f8353T[this.f8354U] = (int) (Integer.parseInt(str) * this.f9641G.getResources().getDisplayMetrics().density);
        this.f8354U++;
    }

    private void P() {
        this.f8350Q = (ConstraintLayout) getParent();
        for (int i4 = 0; i4 < this.f9640F; i4++) {
            View q4 = this.f8350Q.q(this.f9639E[i4]);
            if (q4 != null) {
                int i5 = f8348e0;
                float f4 = f8349f0;
                int[] iArr = this.f8353T;
                if (iArr != null && i4 < iArr.length) {
                    i5 = iArr[i4];
                } else {
                    Integer num = this.f8359c0;
                    if (num != null && num.intValue() != -1) {
                        this.f8354U++;
                        if (this.f8353T == null) {
                            this.f8353T = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f8353T = radius;
                        radius[this.f8354U - 1] = i5;
                    } else {
                        Log.e(f8347d0, "Added radius to view with id: " + this.f9647M.get(Integer.valueOf(q4.getId())));
                    }
                }
                float[] fArr = this.f8352S;
                if (fArr != null && i4 < fArr.length) {
                    f4 = fArr[i4];
                } else {
                    Float f5 = this.f8358b0;
                    if (f5 != null && f5.floatValue() != -1.0f) {
                        this.f8355V++;
                        if (this.f8352S == null) {
                            this.f8352S = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f8352S = angles;
                        angles[this.f8355V - 1] = f4;
                    } else {
                        Log.e(f8347d0, "Added angle to view with id: " + this.f9647M.get(Integer.valueOf(q4.getId())));
                    }
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) q4.getLayoutParams();
                bVar.f9553r = f4;
                bVar.f9549p = this.f8351R;
                bVar.f9551q = i5;
                q4.setLayoutParams(bVar);
            }
        }
        q();
    }

    private float[] R(float[] fArr, int i4) {
        if (fArr != null && i4 >= 0 && i4 < this.f8355V) {
            return S(fArr, i4);
        }
        return fArr;
    }

    private static float[] S(float[] fArr, int i4) {
        float[] fArr2 = new float[fArr.length - 1];
        int i5 = 0;
        for (int i6 = 0; i6 < fArr.length; i6++) {
            if (i6 != i4) {
                fArr2[i5] = fArr[i6];
                i5++;
            }
        }
        return fArr2;
    }

    private static int[] T(int[] iArr, int i4) {
        int[] iArr2 = new int[iArr.length - 1];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (i6 != i4) {
                iArr2[i5] = iArr[i6];
                i5++;
            }
        }
        return iArr2;
    }

    private int[] U(int[] iArr, int i4) {
        if (iArr != null && i4 >= 0 && i4 < this.f8354U) {
            return T(iArr, i4);
        }
        return iArr;
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f8355V = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                M(str.substring(i4).trim());
                return;
            } else {
                M(str.substring(i4, indexOf).trim());
                i4 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f8354U = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                N(str.substring(i4).trim());
                return;
            } else {
                N(str.substring(i4, indexOf).trim());
                i4 = indexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public int C(View view) {
        int C3 = super.C(view);
        if (C3 == -1) {
            return C3;
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.H(this.f8350Q);
        dVar.F(view.getId(), 8);
        dVar.r(this.f8350Q);
        float[] fArr = this.f8352S;
        if (C3 < fArr.length) {
            this.f8352S = R(fArr, C3);
            this.f8355V--;
        }
        int[] iArr = this.f8353T;
        if (C3 < iArr.length) {
            this.f8353T = U(iArr, C3);
            this.f8354U--;
        }
        P();
        return C3;
    }

    public void O(View view, int i4, float f4) {
        if (t(view.getId())) {
            return;
        }
        o(view);
        this.f8355V++;
        float[] angles = getAngles();
        this.f8352S = angles;
        angles[this.f8355V - 1] = f4;
        this.f8354U++;
        int[] radius = getRadius();
        this.f8353T = radius;
        radius[this.f8354U - 1] = (int) (i4 * this.f9641G.getResources().getDisplayMetrics().density);
        P();
    }

    public boolean Q(View view) {
        if (!t(view.getId()) || y(view.getId()) == -1) {
            return false;
        }
        return true;
    }

    public void V(View view, float f4) {
        if (!Q(view)) {
            Log.e(f8347d0, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int y3 = y(view.getId());
        if (y3 > this.f8352S.length) {
            return;
        }
        float[] angles = getAngles();
        this.f8352S = angles;
        angles[y3] = f4;
        P();
    }

    public void W(View view, int i4) {
        if (!Q(view)) {
            Log.e(f8347d0, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int y3 = y(view.getId());
        if (y3 > this.f8353T.length) {
            return;
        }
        int[] radius = getRadius();
        this.f8353T = radius;
        radius[y3] = (int) (i4 * this.f9641G.getResources().getDisplayMetrics().density);
        P();
    }

    public void X(View view, int i4, float f4) {
        if (!Q(view)) {
            Log.e(f8347d0, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int y3 = y(view.getId());
        if (getAngles().length > y3) {
            float[] angles = getAngles();
            this.f8352S = angles;
            angles[y3] = f4;
        }
        if (getRadius().length > y3) {
            int[] radius = getRadius();
            this.f8353T = radius;
            radius[y3] = (int) (i4 * this.f9641G.getResources().getDisplayMetrics().density);
        }
        P();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f8352S, this.f8355V);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f8353T, this.f8354U);
    }

    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8356W;
        if (str != null) {
            this.f8352S = new float[1];
            setAngles(str);
        }
        String str2 = this.f8357a0;
        if (str2 != null) {
            this.f8353T = new int[1];
            setRadius(str2);
        }
        Float f4 = this.f8358b0;
        if (f4 != null) {
            setDefaultAngle(f4.floatValue());
        }
        Integer num = this.f8359c0;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        P();
    }

    public void setDefaultAngle(float f4) {
        f8349f0 = f4;
    }

    public void setDefaultRadius(int i4) {
        f8348e0 = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.f7) {
                    this.f8351R = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == h.m.b7) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f8356W = string;
                    setAngles(string);
                } else if (index == h.m.e7) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f8357a0 = string2;
                    setRadius(string2);
                } else if (index == h.m.c7) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f8349f0));
                    this.f8358b0 = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == h.m.d7) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f8348e0));
                    this.f8359c0 = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
