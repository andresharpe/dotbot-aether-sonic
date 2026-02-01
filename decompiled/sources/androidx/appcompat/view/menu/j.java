package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.o;
import androidx.core.view.AbstractC0795b;
import d.C2042a;
import e.C2046a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class j implements o.b {

    /* renamed from: Q, reason: collision with root package name */
    private static final String f5364Q = "MenuItemImpl";

    /* renamed from: R, reason: collision with root package name */
    private static final int f5365R = 3;

    /* renamed from: S, reason: collision with root package name */
    private static final int f5366S = 1;

    /* renamed from: T, reason: collision with root package name */
    private static final int f5367T = 2;

    /* renamed from: U, reason: collision with root package name */
    private static final int f5368U = 4;

    /* renamed from: V, reason: collision with root package name */
    private static final int f5369V = 8;

    /* renamed from: W, reason: collision with root package name */
    private static final int f5370W = 16;

    /* renamed from: X, reason: collision with root package name */
    private static final int f5371X = 32;

    /* renamed from: Y, reason: collision with root package name */
    static final int f5372Y = 0;

    /* renamed from: A, reason: collision with root package name */
    private Runnable f5373A;

    /* renamed from: B, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f5374B;

    /* renamed from: C, reason: collision with root package name */
    private CharSequence f5375C;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f5376D;

    /* renamed from: K, reason: collision with root package name */
    private int f5383K;

    /* renamed from: L, reason: collision with root package name */
    private View f5384L;

    /* renamed from: M, reason: collision with root package name */
    private AbstractC0795b f5385M;

    /* renamed from: N, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f5386N;

    /* renamed from: P, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f5388P;

    /* renamed from: l, reason: collision with root package name */
    private final int f5389l;

    /* renamed from: m, reason: collision with root package name */
    private final int f5390m;

    /* renamed from: n, reason: collision with root package name */
    private final int f5391n;

    /* renamed from: o, reason: collision with root package name */
    private final int f5392o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f5393p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f5394q;

    /* renamed from: r, reason: collision with root package name */
    private Intent f5395r;

    /* renamed from: s, reason: collision with root package name */
    private char f5396s;

    /* renamed from: u, reason: collision with root package name */
    private char f5398u;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f5400w;

    /* renamed from: y, reason: collision with root package name */
    g f5402y;

    /* renamed from: z, reason: collision with root package name */
    private s f5403z;

    /* renamed from: t, reason: collision with root package name */
    private int f5397t = 4096;

    /* renamed from: v, reason: collision with root package name */
    private int f5399v = 4096;

    /* renamed from: x, reason: collision with root package name */
    private int f5401x = 0;

    /* renamed from: E, reason: collision with root package name */
    private ColorStateList f5377E = null;

    /* renamed from: F, reason: collision with root package name */
    private PorterDuff.Mode f5378F = null;

    /* renamed from: G, reason: collision with root package name */
    private boolean f5379G = false;

    /* renamed from: H, reason: collision with root package name */
    private boolean f5380H = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f5381I = false;

    /* renamed from: J, reason: collision with root package name */
    private int f5382J = 16;

    /* renamed from: O, reason: collision with root package name */
    private boolean f5387O = false;

    /* loaded from: classes.dex */
    class a implements AbstractC0795b.InterfaceC0107b {
        a() {
        }

        @Override // androidx.core.view.AbstractC0795b.InterfaceC0107b
        public void onActionProviderVisibilityChanged(boolean z3) {
            j jVar = j.this;
            jVar.f5402y.M(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(g gVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f5402y = gVar;
        this.f5389l = i5;
        this.f5390m = i4;
        this.f5391n = i6;
        this.f5392o = i7;
        this.f5393p = charSequence;
        this.f5383K = i8;
    }

    private static void f(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    private Drawable g(Drawable drawable) {
        if (drawable != null && this.f5381I && (this.f5379G || this.f5380H)) {
            drawable = androidx.core.graphics.drawable.d.r(drawable).mutate();
            if (this.f5379G) {
                androidx.core.graphics.drawable.d.o(drawable, this.f5377E);
            }
            if (this.f5380H) {
                androidx.core.graphics.drawable.d.p(drawable, this.f5378F);
            }
            this.f5381I = false;
        }
        return drawable;
    }

    public void A(s sVar) {
        this.f5403z = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B(boolean z3) {
        int i4;
        int i5 = this.f5382J;
        int i6 = i5 & (-9);
        if (z3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        int i7 = i4 | i6;
        this.f5382J = i7;
        if (i5 == i7) {
            return false;
        }
        return true;
    }

    public boolean C() {
        return this.f5402y.D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        if (this.f5402y.K() && j() != 0) {
            return true;
        }
        return false;
    }

    public boolean E() {
        if ((this.f5383K & 4) == 4) {
            return true;
        }
        return false;
    }

    @Override // o.b
    @N
    public o.b a(AbstractC0795b abstractC0795b) {
        AbstractC0795b abstractC0795b2 = this.f5385M;
        if (abstractC0795b2 != null) {
            abstractC0795b2.j();
        }
        this.f5384L = null;
        this.f5385M = abstractC0795b;
        this.f5402y.N(true);
        AbstractC0795b abstractC0795b3 = this.f5385M;
        if (abstractC0795b3 != null) {
            abstractC0795b3.l(new a());
        }
        return this;
    }

    @Override // o.b
    public AbstractC0795b b() {
        return this.f5385M;
    }

    @Override // o.b
    public boolean c() {
        if (!d() && !q()) {
            return true;
        }
        return false;
    }

    @Override // o.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f5383K & 8) == 0) {
            return false;
        }
        if (this.f5384L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5386N;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f5402y.g(this);
    }

    @Override // o.b
    public boolean d() {
        if ((this.f5383K & 2) == 2) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f5402y.L(this);
    }

    @Override // o.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5386N;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f5402y.n(this);
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // o.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f5384L;
        if (view != null) {
            return view;
        }
        AbstractC0795b abstractC0795b = this.f5385M;
        if (abstractC0795b != null) {
            View e4 = abstractC0795b.e(this);
            this.f5384L = e4;
            return e4;
        }
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5399v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5398u;
    }

    @Override // o.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5375C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5390m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f5400w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f5401x != 0) {
            Drawable b4 = C2046a.b(this.f5402y.x(), this.f5401x);
            this.f5401x = 0;
            this.f5400w = b4;
            return g(b4);
        }
        return null;
    }

    @Override // o.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5377E;
    }

    @Override // o.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5378F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5395r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f5389l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5388P;
    }

    @Override // o.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5397t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5396s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5391n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f5403z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f5393p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5394q;
        if (charSequence == null) {
            return this.f5393p;
        }
        return charSequence;
    }

    @Override // o.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5376D;
    }

    Runnable h() {
        return this.f5373A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        if (this.f5403z != null) {
            return true;
        }
        return false;
    }

    public int i() {
        return this.f5392o;
    }

    @Override // o.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f5387O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.f5382J & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.f5382J & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.f5382J & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0795b abstractC0795b = this.f5385M;
        if (abstractC0795b != null && abstractC0795b.h()) {
            if ((this.f5382J & 8) != 0 || !this.f5385M.c()) {
                return false;
            }
            return true;
        }
        if ((this.f5382J & 8) != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char j() {
        if (this.f5402y.J()) {
            return this.f5398u;
        }
        return this.f5396s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        int i4;
        char j4 = j();
        if (j4 == 0) {
            return "";
        }
        Resources resources = this.f5402y.x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f5402y.x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C2042a.k.f49730r));
        }
        if (this.f5402y.J()) {
            i4 = this.f5399v;
        } else {
            i4 = this.f5397t;
        }
        f(sb, i4, 65536, resources.getString(C2042a.k.f49726n));
        f(sb, i4, 4096, resources.getString(C2042a.k.f49722j));
        f(sb, i4, 2, resources.getString(C2042a.k.f49721i));
        f(sb, i4, 1, resources.getString(C2042a.k.f49727o));
        f(sb, i4, 4, resources.getString(C2042a.k.f49729q));
        f(sb, i4, 8, resources.getString(C2042a.k.f49725m));
        if (j4 != '\b') {
            if (j4 != '\n') {
                if (j4 != ' ') {
                    sb.append(j4);
                } else {
                    sb.append(resources.getString(C2042a.k.f49728p));
                }
            } else {
                sb.append(resources.getString(C2042a.k.f49724l));
            }
        } else {
            sb.append(resources.getString(C2042a.k.f49723k));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence l(o.a aVar) {
        if (aVar != null && aVar.f()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    public boolean m() {
        AbstractC0795b abstractC0795b;
        if ((this.f5383K & 8) == 0) {
            return false;
        }
        if (this.f5384L == null && (abstractC0795b = this.f5385M) != null) {
            this.f5384L = abstractC0795b.e(this);
        }
        if (this.f5384L == null) {
            return false;
        }
        return true;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f5374B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f5402y;
        if (gVar.i(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f5373A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f5395r != null) {
            try {
                this.f5402y.x().startActivity(this.f5395r);
                return true;
            } catch (ActivityNotFoundException e4) {
                Log.e(f5364Q, "Can't find activity to handle intent; ignoring", e4);
            }
        }
        AbstractC0795b abstractC0795b = this.f5385M;
        if (abstractC0795b != null && abstractC0795b.f()) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if ((this.f5382J & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if ((this.f5382J & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean q() {
        if ((this.f5383K & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // o.b, android.view.MenuItem
    @N
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public o.b setActionView(int i4) {
        Context x3 = this.f5402y.x();
        setActionView(LayoutInflater.from(x3).inflate(i4, (ViewGroup) new LinearLayout(x3), false));
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public o.b setActionView(View view) {
        int i4;
        this.f5384L = view;
        this.f5385M = null;
        if (view != null && view.getId() == -1 && (i4 = this.f5389l) > 0) {
            view.setId(i4);
        }
        this.f5402y.L(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        if (this.f5398u == c4) {
            return this;
        }
        this.f5398u = Character.toLowerCase(c4);
        this.f5402y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        int i4 = this.f5382J;
        int i5 = (z3 ? 1 : 0) | (i4 & (-2));
        this.f5382J = i5;
        if (i4 != i5) {
            this.f5402y.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        if ((this.f5382J & 4) != 0) {
            this.f5402y.a0(this);
        } else {
            v(z3);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f5382J |= 16;
        } else {
            this.f5382J &= -17;
        }
        this.f5402y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5401x = 0;
        this.f5400w = drawable;
        this.f5381I = true;
        this.f5402y.N(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setIconTintList(@P ColorStateList colorStateList) {
        this.f5377E = colorStateList;
        this.f5379G = true;
        this.f5381I = true;
        this.f5402y.N(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5378F = mode;
        this.f5380H = true;
        this.f5381I = true;
        this.f5402y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5395r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        if (this.f5396s == c4) {
            return this;
        }
        this.f5396s = c4;
        this.f5402y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5386N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5374B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f5396s = c4;
        this.f5398u = Character.toLowerCase(c5);
        this.f5402y.N(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    public void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f5383K = i4;
        this.f5402y.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5393p = charSequence;
        this.f5402y.N(false);
        s sVar = this.f5403z;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5394q = charSequence;
        this.f5402y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        if (B(z3)) {
            this.f5402y.M(this);
        }
        return this;
    }

    public void t(boolean z3) {
        this.f5387O = z3;
        this.f5402y.N(false);
    }

    public String toString() {
        CharSequence charSequence = this.f5393p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.f5373A = runnable;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(boolean z3) {
        int i4;
        int i5 = this.f5382J;
        int i6 = i5 & (-3);
        if (z3) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        int i7 = i4 | i6;
        this.f5382J = i7;
        if (i5 != i7) {
            this.f5402y.N(false);
        }
    }

    public void w(boolean z3) {
        int i4;
        int i5 = this.f5382J & (-5);
        if (z3) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        this.f5382J = i4 | i5;
    }

    public void x(boolean z3) {
        if (z3) {
            this.f5382J |= 32;
        } else {
            this.f5382J &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f5388P = contextMenuInfo;
    }

    @Override // o.b, android.view.MenuItem
    @N
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public o.b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public o.b setContentDescription(CharSequence charSequence) {
        this.f5375C = charSequence;
        this.f5402y.N(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public o.b setTooltipText(CharSequence charSequence) {
        this.f5376D = charSequence;
        this.f5402y.N(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f5398u == c4 && this.f5399v == i4) {
            return this;
        }
        this.f5398u = Character.toLowerCase(c4);
        this.f5399v = KeyEvent.normalizeMetaState(i4);
        this.f5402y.N(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f5396s == c4 && this.f5397t == i4) {
            return this;
        }
        this.f5396s = c4;
        this.f5397t = KeyEvent.normalizeMetaState(i4);
        this.f5402y.N(false);
        return this;
    }

    @Override // o.b, android.view.MenuItem
    @N
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f5396s = c4;
        this.f5397t = KeyEvent.normalizeMetaState(i4);
        this.f5398u = Character.toLowerCase(c5);
        this.f5399v = KeyEvent.normalizeMetaState(i5);
        this.f5402y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f5400w = null;
        this.f5401x = i4;
        this.f5381I = true;
        this.f5402y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        return setTitle(this.f5402y.x().getString(i4));
    }
}
