package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;
import com.spotify.sdk.android.auth.b;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a extends View {

    /* renamed from: N, reason: collision with root package name */
    protected static final String f9638N = "CONSTRAINT_LAYOUT_HELPER_CHILD";

    /* renamed from: E, reason: collision with root package name */
    protected int[] f9639E;

    /* renamed from: F, reason: collision with root package name */
    protected int f9640F;

    /* renamed from: G, reason: collision with root package name */
    protected Context f9641G;

    /* renamed from: H, reason: collision with root package name */
    protected androidx.constraintlayout.core.widgets.g f9642H;

    /* renamed from: I, reason: collision with root package name */
    protected boolean f9643I;

    /* renamed from: J, reason: collision with root package name */
    protected String f9644J;

    /* renamed from: K, reason: collision with root package name */
    protected String f9645K;

    /* renamed from: L, reason: collision with root package name */
    private View[] f9646L;

    /* renamed from: M, reason: collision with root package name */
    protected HashMap<Integer, String> f9647M;

    public a(Context context) {
        super(context);
        this.f9639E = new int[32];
        this.f9643I = false;
        this.f9646L = null;
        this.f9647M = new HashMap<>();
        this.f9641G = context;
        z(null);
    }

    public static boolean A(View view) {
        if (f9638N == view.getTag()) {
            return true;
        }
        return false;
    }

    private void l(String str) {
        if (str == null || str.length() == 0 || this.f9641G == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int w3 = w(trim);
        if (w3 != 0) {
            this.f9647M.put(Integer.valueOf(w3), trim);
            m(w3);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void m(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i5 = this.f9640F + 1;
        int[] iArr = this.f9639E;
        if (i5 > iArr.length) {
            this.f9639E = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f9639E;
        int i6 = this.f9640F;
        iArr2[i6] = i4;
        this.f9640F = i6 + 1;
    }

    private void n(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.f9641G == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f9524c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m(childAt.getId());
                }
            }
        }
    }

    private int[] u(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        for (String str2 : split) {
            int w3 = w(str2.trim());
            if (w3 != 0) {
                iArr[i4] = w3;
                i4++;
            }
        }
        if (i4 != split.length) {
            return Arrays.copyOf(iArr, i4);
        }
        return iArr;
    }

    private int v(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f9641G.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int w(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i4 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object o4 = constraintLayout.o(0, str);
            if (o4 instanceof Integer) {
                i4 = ((Integer) o4).intValue();
            }
        }
        if (i4 == 0 && constraintLayout != null) {
            i4 = v(constraintLayout, str);
        }
        if (i4 == 0) {
            try {
                i4 = h.g.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i4 == 0) {
            return this.f9641G.getResources().getIdentifier(str, b.c.f48986a, this.f9641G.getPackageName());
        }
        return i4;
    }

    public void B(d.a aVar, androidx.constraintlayout.core.widgets.h hVar, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        d.b bVar2 = aVar.f9840e;
        int[] iArr = bVar2.f9978k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f9980l0;
            if (str != null) {
                if (str.length() > 0) {
                    d.b bVar3 = aVar.f9840e;
                    bVar3.f9978k0 = u(this, bVar3.f9980l0);
                } else {
                    aVar.f9840e.f9978k0 = null;
                }
            }
        }
        if (hVar != null) {
            hVar.a();
            if (aVar.f9840e.f9978k0 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr2 = aVar.f9840e.f9978k0;
                    if (i4 < iArr2.length) {
                        ConstraintWidget constraintWidget = sparseArray.get(iArr2[i4]);
                        if (constraintWidget != null) {
                            hVar.b(constraintWidget);
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public int C(View view) {
        int i4;
        int id = view.getId();
        int i5 = -1;
        if (id == -1) {
            return -1;
        }
        this.f9644J = null;
        int i6 = 0;
        while (true) {
            if (i6 >= this.f9640F) {
                break;
            }
            if (this.f9639E[i6] == id) {
                int i7 = i6;
                while (true) {
                    i4 = this.f9640F;
                    if (i7 >= i4 - 1) {
                        break;
                    }
                    int[] iArr = this.f9639E;
                    int i8 = i7 + 1;
                    iArr[i7] = iArr[i8];
                    i7 = i8;
                }
                this.f9639E[i4 - 1] = 0;
                this.f9640F = i4 - 1;
                i5 = i6;
            } else {
                i6++;
            }
        }
        requestLayout();
        return i5;
    }

    public void D(ConstraintWidget constraintWidget, boolean z3) {
    }

    public void E(ConstraintLayout constraintLayout) {
    }

    public void F(ConstraintLayout constraintLayout) {
    }

    public void G(ConstraintLayout constraintLayout) {
    }

    public void H(ConstraintLayout constraintLayout) {
    }

    public void I(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.g gVar, SparseArray<ConstraintWidget> sparseArray) {
        gVar.a();
        for (int i4 = 0; i4 < this.f9640F; i4++) {
            gVar.b(sparseArray.get(this.f9639E[i4]));
        }
    }

    public void J(ConstraintLayout constraintLayout) {
        String str;
        int v3;
        if (isInEditMode()) {
            setIds(this.f9644J);
        }
        androidx.constraintlayout.core.widgets.g gVar = this.f9642H;
        if (gVar == null) {
            return;
        }
        gVar.a();
        for (int i4 = 0; i4 < this.f9640F; i4++) {
            int i5 = this.f9639E[i4];
            View q4 = constraintLayout.q(i5);
            if (q4 == null && (v3 = v(constraintLayout, (str = this.f9647M.get(Integer.valueOf(i5))))) != 0) {
                this.f9639E[i4] = v3;
                this.f9647M.put(Integer.valueOf(v3), str);
                q4 = constraintLayout.q(v3);
            }
            if (q4 != null) {
                this.f9642H.b(constraintLayout.w(q4));
            }
        }
        this.f9642H.c(constraintLayout.f9445G);
    }

    public void K() {
        if (this.f9642H == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f9562v0 = (ConstraintWidget) this.f9642H;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f9639E, this.f9640F);
    }

    public void o(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f9644J = null;
            m(view.getId());
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f9644J;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f9645K;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f9643I) {
            super.onMeasure(i4, i5);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            r((ConstraintLayout) parent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i4 = 0; i4 < this.f9640F; i4++) {
            View q4 = constraintLayout.q(this.f9639E[i4]);
            if (q4 != null) {
                q4.setVisibility(visibility);
                if (elevation > 0.0f) {
                    q4.setTranslationZ(q4.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(ConstraintLayout constraintLayout) {
    }

    protected void setIds(String str) {
        this.f9644J = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f9640F = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                l(str.substring(i4));
                return;
            } else {
                l(str.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f9645K = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f9640F = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                n(str.substring(i4));
                return;
            } else {
                n(str.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f9644J = null;
        this.f9640F = 0;
        for (int i4 : iArr) {
            m(i4);
        }
    }

    @Override // android.view.View
    public void setTag(int i4, Object obj) {
        super.setTag(i4, obj);
        if (obj == null && this.f9644J == null) {
            m(i4);
        }
    }

    public boolean t(int i4) {
        for (int i5 : this.f9639E) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View[] x(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f9646L;
        if (viewArr == null || viewArr.length != this.f9640F) {
            this.f9646L = new View[this.f9640F];
        }
        for (int i4 = 0; i4 < this.f9640F; i4++) {
            this.f9646L[i4] = constraintLayout.q(this.f9639E[i4]);
        }
        return this.f9646L;
    }

    public int y(int i4) {
        int i5 = -1;
        for (int i6 : this.f9639E) {
            i5++;
            if (i6 == i4) {
                return i5;
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.h7) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f9644J = string;
                    setIds(string);
                } else if (index == h.m.i7) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f9645K = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9639E = new int[32];
        this.f9643I = false;
        this.f9646L = null;
        this.f9647M = new HashMap<>();
        this.f9641G = context;
        z(attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9639E = new int[32];
        this.f9643I = false;
        this.f9646L = null;
        this.f9647M = new HashMap<>();
        this.f9641G = context;
        z(attributeSet);
    }
}
