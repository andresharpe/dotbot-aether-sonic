package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.k0;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements o.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: W, reason: collision with root package name */
    private static final String f5196W = "ActionMenuItemView";

    /* renamed from: a0, reason: collision with root package name */
    private static final int f5197a0 = 32;

    /* renamed from: L, reason: collision with root package name */
    j f5198L;

    /* renamed from: M, reason: collision with root package name */
    private CharSequence f5199M;

    /* renamed from: N, reason: collision with root package name */
    private Drawable f5200N;

    /* renamed from: O, reason: collision with root package name */
    g.b f5201O;

    /* renamed from: P, reason: collision with root package name */
    private P f5202P;

    /* renamed from: Q, reason: collision with root package name */
    b f5203Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f5204R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f5205S;

    /* renamed from: T, reason: collision with root package name */
    private int f5206T;

    /* renamed from: U, reason: collision with root package name */
    private int f5207U;

    /* renamed from: V, reason: collision with root package name */
    private int f5208V;

    /* loaded from: classes.dex */
    private class a extends P {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.P
        public q b() {
            b bVar = ActionMenuItemView.this.f5203Q;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.P
        protected boolean c() {
            q b4;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f5201O;
            if (bVar == null || !bVar.a(actionMenuItemView.f5198L) || (b4 = b()) == null || !b4.c()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract q a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean v() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 < 480 && ((i4 < 640 || i5 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    private void w() {
        CharSequence charSequence;
        CharSequence title;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f5199M);
        if (this.f5200N != null && (!this.f5198L.E() || (!this.f5204R && !this.f5205S))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        CharSequence charSequence2 = null;
        if (z5) {
            charSequence = this.f5199M;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f5198L.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z5) {
                title = null;
            } else {
                title = this.f5198L.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f5198L.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z5) {
                charSequence2 = this.f5198L.getTitle();
            }
            k0.a(this, charSequence2);
            return;
        }
        k0.a(this, tooltipText);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return u();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void c(boolean z3, char c4) {
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean d() {
        if (u() && this.f5198L.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean f() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean g() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f5198L;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void h(j jVar, int i4) {
        int i5;
        this.f5198L = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.l(this));
        setId(jVar.getItemId());
        if (jVar.isVisible()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        setVisibility(i5);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f5202P == null) {
            this.f5202P = new a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f5201O;
        if (bVar != null) {
            bVar.a(this.f5198L);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5204R = v();
        w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        boolean u3 = u();
        if (u3 && (i7 = this.f5207U) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i6 = Math.min(size, this.f5206T);
        } else {
            i6 = this.f5206T;
        }
        if (mode != 1073741824 && this.f5206T > 0 && measuredWidth < i6) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
        }
        if (!u3 && this.f5200N != null) {
            super.setPadding((getMeasuredWidth() - this.f5200N.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        P p4;
        if (this.f5198L.hasSubMenu() && (p4 = this.f5202P) != null && p4.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z3) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f5205S != z3) {
            this.f5205S = z3;
            j jVar = this.f5198L;
            if (jVar != null) {
                jVar.e();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        this.f5200N = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f5208V;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        w();
    }

    public void setItemInvoker(g.b bVar) {
        this.f5201O = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        this.f5207U = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(b bVar) {
        this.f5203Q = bVar;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.f5199M = charSequence;
        w();
    }

    public boolean u() {
        return !TextUtils.isEmpty(getText());
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Resources resources = context.getResources();
        this.f5204R = v();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.f49990G, i4, 0);
        this.f5206T = obtainStyledAttributes.getDimensionPixelSize(C2042a.m.f49994H, 0);
        obtainStyledAttributes.recycle();
        this.f5208V = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f5207U = -1;
        setSaveEnabled(false);
    }
}
