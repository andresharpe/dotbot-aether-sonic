package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.g0;
import androidx.core.view.C0823k0;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: V, reason: collision with root package name */
    private static final String f5213V = "ListMenuItemView";

    /* renamed from: E, reason: collision with root package name */
    private j f5214E;

    /* renamed from: F, reason: collision with root package name */
    private ImageView f5215F;

    /* renamed from: G, reason: collision with root package name */
    private RadioButton f5216G;

    /* renamed from: H, reason: collision with root package name */
    private TextView f5217H;

    /* renamed from: I, reason: collision with root package name */
    private CheckBox f5218I;

    /* renamed from: J, reason: collision with root package name */
    private TextView f5219J;

    /* renamed from: K, reason: collision with root package name */
    private ImageView f5220K;

    /* renamed from: L, reason: collision with root package name */
    private ImageView f5221L;

    /* renamed from: M, reason: collision with root package name */
    private LinearLayout f5222M;

    /* renamed from: N, reason: collision with root package name */
    private Drawable f5223N;

    /* renamed from: O, reason: collision with root package name */
    private int f5224O;

    /* renamed from: P, reason: collision with root package name */
    private Context f5225P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f5226Q;

    /* renamed from: R, reason: collision with root package name */
    private Drawable f5227R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f5228S;

    /* renamed from: T, reason: collision with root package name */
    private LayoutInflater f5229T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f5230U;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49189Y1);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i4) {
        LinearLayout linearLayout = this.f5222M;
        if (linearLayout != null) {
            linearLayout.addView(view, i4);
        } else {
            addView(view, i4);
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C2042a.j.f49699o, (ViewGroup) this, false);
        this.f5218I = checkBox;
        a(checkBox);
    }

    private void e() {
        ImageView imageView = (ImageView) getInflater().inflate(C2042a.j.f49700p, (ViewGroup) this, false);
        this.f5215F = imageView;
        b(imageView, 0);
    }

    private LayoutInflater getInflater() {
        if (this.f5229T == null) {
            this.f5229T = LayoutInflater.from(getContext());
        }
        return this.f5229T;
    }

    private void i() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C2042a.j.f49702r, (ViewGroup) this, false);
        this.f5216G = radioButton;
        a(radioButton);
    }

    private void setSubMenuArrowVisible(boolean z3) {
        int i4;
        ImageView imageView = this.f5220K;
        if (imageView != null) {
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f5221L;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5221L.getLayoutParams();
            rect.top += this.f5221L.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void c(boolean z3, char c4) {
        int i4;
        if (z3 && this.f5214E.D()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (i4 == 0) {
            this.f5219J.setText(this.f5214E.k());
        }
        if (this.f5219J.getVisibility() != i4) {
            this.f5219J.setVisibility(i4);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean g() {
        return this.f5230U;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f5214E;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void h(j jVar, int i4) {
        int i5;
        this.f5214E = jVar;
        if (jVar.isVisible()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        setVisibility(i5);
        setTitle(jVar.l(this));
        setCheckable(jVar.isCheckable());
        c(jVar.D(), jVar.j());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0823k0.I1(this, this.f5223N);
        TextView textView = (TextView) findViewById(C2042a.g.f49653s0);
        this.f5217H = textView;
        int i4 = this.f5224O;
        if (i4 != -1) {
            textView.setTextAppearance(this.f5225P, i4);
        }
        this.f5219J = (TextView) findViewById(C2042a.g.f49631h0);
        ImageView imageView = (ImageView) findViewById(C2042a.g.f49643n0);
        this.f5220K = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f5227R);
        }
        this.f5221L = (ImageView) findViewById(C2042a.g.f49592C);
        this.f5222M = (LinearLayout) findViewById(C2042a.g.f49654t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f5215F != null && this.f5226Q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f5215F.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f5216G == null && this.f5218I == null) {
            return;
        }
        if (this.f5214E.p()) {
            if (this.f5216G == null) {
                i();
            }
            compoundButton = this.f5216G;
            view = this.f5218I;
        } else {
            if (this.f5218I == null) {
                d();
            }
            compoundButton = this.f5218I;
            view = this.f5216G;
        }
        if (z3) {
            compoundButton.setChecked(this.f5214E.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f5218I;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f5216G;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if (this.f5214E.p()) {
            if (this.f5216G == null) {
                i();
            }
            compoundButton = this.f5216G;
        } else {
            if (this.f5218I == null) {
                d();
            }
            compoundButton = this.f5218I;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f5230U = z3;
        this.f5226Q = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        int i4;
        ImageView imageView = this.f5221L;
        if (imageView != null) {
            if (!this.f5228S && z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        boolean z3;
        if (!this.f5214E.C() && !this.f5230U) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 && !this.f5226Q) {
            return;
        }
        ImageView imageView = this.f5215F;
        if (imageView == null && drawable == null && !this.f5226Q) {
            return;
        }
        if (imageView == null) {
            e();
        }
        if (drawable == null && !this.f5226Q) {
            this.f5215F.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f5215F;
        if (!z3) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.f5215F.getVisibility() != 0) {
            this.f5215F.setVisibility(0);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f5217H.setText(charSequence);
            if (this.f5217H.getVisibility() != 0) {
                this.f5217H.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f5217H.getVisibility() != 8) {
            this.f5217H.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        g0 G3 = g0.G(getContext(), attributeSet, C2042a.m.I4, i4, 0);
        this.f5223N = G3.h(C2042a.m.O4);
        this.f5224O = G3.u(C2042a.m.K4, -1);
        this.f5226Q = G3.a(C2042a.m.Q4, false);
        this.f5225P = context;
        this.f5227R = G3.h(C2042a.m.R4);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C2042a.b.f49272p1, 0);
        this.f5228S = obtainStyledAttributes.hasValue(0);
        G3.I();
        obtainStyledAttributes.recycle();
    }
}
