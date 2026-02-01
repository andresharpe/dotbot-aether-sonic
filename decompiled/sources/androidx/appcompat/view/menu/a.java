package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.content.C0669d;
import androidx.core.view.AbstractC0795b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a implements o.b {

    /* renamed from: F, reason: collision with root package name */
    private static final int f5231F = 1;

    /* renamed from: G, reason: collision with root package name */
    private static final int f5232G = 2;

    /* renamed from: H, reason: collision with root package name */
    private static final int f5233H = 4;

    /* renamed from: I, reason: collision with root package name */
    private static final int f5234I = 8;

    /* renamed from: J, reason: collision with root package name */
    private static final int f5235J = 16;

    /* renamed from: l, reason: collision with root package name */
    private final int f5241l;

    /* renamed from: m, reason: collision with root package name */
    private final int f5242m;

    /* renamed from: n, reason: collision with root package name */
    private final int f5243n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f5244o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f5245p;

    /* renamed from: q, reason: collision with root package name */
    private Intent f5246q;

    /* renamed from: r, reason: collision with root package name */
    private char f5247r;

    /* renamed from: t, reason: collision with root package name */
    private char f5249t;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f5251v;

    /* renamed from: w, reason: collision with root package name */
    private Context f5252w;

    /* renamed from: x, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f5253x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f5254y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f5255z;

    /* renamed from: s, reason: collision with root package name */
    private int f5248s = 4096;

    /* renamed from: u, reason: collision with root package name */
    private int f5250u = 4096;

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f5236A = null;

    /* renamed from: B, reason: collision with root package name */
    private PorterDuff.Mode f5237B = null;

    /* renamed from: C, reason: collision with root package name */
    private boolean f5238C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f5239D = false;

    /* renamed from: E, reason: collision with root package name */
    private int f5240E = 16;

    public a(Context context, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f5252w = context;
        this.f5241l = i5;
        this.f5242m = i4;
        this.f5243n = i7;
        this.f5244o = charSequence;
    }

    private void e() {
        Drawable drawable = this.f5251v;
        if (drawable != null) {
            if (this.f5238C || this.f5239D) {
                Drawable r4 = androidx.core.graphics.drawable.d.r(drawable);
                this.f5251v = r4;
                Drawable mutate = r4.mutate();
                this.f5251v = mutate;
                if (this.f5238C) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f5236A);
                }
                if (this.f5239D) {
                    androidx.core.graphics.drawable.d.p(this.f5251v, this.f5237B);
                }
            }
        }
    }

    @Override // o.b
    @N
    public o.b a(AbstractC0795b abstractC0795b) {
        throw new UnsupportedOperationException();
    }

    @Override // o.b
    public AbstractC0795b b() {
        return null;
    }

    @Override // o.b
    public boolean c() {
        return false;
    }

    @Override // o.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // o.b
    public boolean d() {
        return true;
    }

    @Override // o.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f5253x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f5246q;
        if (intent != null) {
            this.f5252w.startActivity(intent);
            return true;
        }
        return false;
    }

    @Override // o.b, android.view.MenuItem
    @N
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o.b setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // o.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5250u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5249t;
    }

    @Override // o.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5254y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5242m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f5251v;
    }

    @Override // o.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5236A;
    }

    @Override // o.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5237B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5246q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f5241l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5248s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5247r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5243n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f5244o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5245p;
        if (charSequence == null) {
            return this.f5244o;
        }
        return charSequence;
    }

    @Override // o.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5255z;
    }

    @Override // o.b, android.view.MenuItem
    @N
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public o.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z3) {
        int i4;
        int i5 = this.f5240E & (-5);
        if (z3) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        this.f5240E = i4 | i5;
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.f5240E & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.f5240E & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.f5240E & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        if ((this.f5240E & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // o.b, android.view.MenuItem
    @N
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o.b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f5249t = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f5240E = (z3 ? 1 : 0) | (this.f5240E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        int i4;
        int i5 = this.f5240E & (-3);
        if (z3) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        this.f5240E = i4 | i5;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        int i4;
        int i5 = this.f5240E & (-17);
        if (z3) {
            i4 = 16;
        } else {
            i4 = 0;
        }
        this.f5240E = i4 | i5;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5251v = drawable;
        e();
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setIconTintList(@P ColorStateList colorStateList) {
        this.f5236A = colorStateList;
        this.f5238C = true;
        e();
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5237B = mode;
        this.f5239D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5246q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f5247r = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5253x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f5247r = c4;
        this.f5249t = Character.toLowerCase(c5);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5244o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5245p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        int i4 = 8;
        int i5 = this.f5240E & 8;
        if (z3) {
            i4 = 0;
        }
        this.f5240E = i5 | i4;
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f5249t = Character.toLowerCase(c4);
        this.f5250u = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public o.b setContentDescription(CharSequence charSequence) {
        this.f5254y = charSequence;
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f5247r = c4;
        this.f5248s = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f5244o = this.f5252w.getResources().getString(i4);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public o.b setTooltipText(CharSequence charSequence) {
        this.f5255z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f5251v = C0669d.i(this.f5252w, i4);
        e();
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f5247r = c4;
        this.f5248s = KeyEvent.normalizeMetaState(i4);
        this.f5249t = Character.toLowerCase(c5);
        this.f5250u = KeyEvent.normalizeMetaState(i5);
        return this;
    }
}
