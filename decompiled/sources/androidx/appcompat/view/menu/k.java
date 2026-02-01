package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.view.AbstractC0795b;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class k extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: q, reason: collision with root package name */
    static final String f5405q = "MenuItemWrapper";

    /* renamed from: o, reason: collision with root package name */
    private final o.b f5406o;

    /* renamed from: p, reason: collision with root package name */
    private Method f5407p;

    /* loaded from: classes.dex */
    private class a extends AbstractC0795b {

        /* renamed from: e, reason: collision with root package name */
        final ActionProvider f5408e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f5408e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0795b
        public boolean b() {
            return this.f5408e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0795b
        public View d() {
            return this.f5408e.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0795b
        public boolean f() {
            return this.f5408e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0795b
        public void g(SubMenu subMenu) {
            this.f5408e.onPrepareSubMenu(k.this.f(subMenu));
        }
    }

    @W(16)
    /* loaded from: classes.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: g, reason: collision with root package name */
        private AbstractC0795b.InterfaceC0107b f5410g;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC0795b
        public boolean c() {
            return this.f5408e.isVisible();
        }

        @Override // androidx.core.view.AbstractC0795b
        public View e(MenuItem menuItem) {
            return this.f5408e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0795b
        public boolean h() {
            return this.f5408e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0795b
        public void i() {
            this.f5408e.refreshVisibility();
        }

        @Override // androidx.core.view.AbstractC0795b
        public void l(AbstractC0795b.InterfaceC0107b interfaceC0107b) {
            b bVar;
            this.f5410g = interfaceC0107b;
            ActionProvider actionProvider = this.f5408e;
            if (interfaceC0107b != null) {
                bVar = this;
            } else {
                bVar = null;
            }
            actionProvider.setVisibilityListener(bVar);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z3) {
            AbstractC0795b.InterfaceC0107b interfaceC0107b = this.f5410g;
            if (interfaceC0107b != null) {
                interfaceC0107b.onActionProviderVisibilityChanged(z3);
            }
        }
    }

    /* loaded from: classes.dex */
    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: E, reason: collision with root package name */
        final CollapsibleActionView f5412E;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f5412E = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f5412E;
        }

        @Override // androidx.appcompat.view.c
        public void b() {
            this.f5412E.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void d() {
            this.f5412E.onActionViewCollapsed();
        }
    }

    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f5413a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f5413a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f5413a.onMenuItemActionCollapse(k.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f5413a.onMenuItemActionExpand(k.this.e(menuItem));
        }
    }

    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: E, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f5415E;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f5415E = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f5415E.onMenuItemClick(k.this.e(menuItem));
        }
    }

    public k(Context context, o.b bVar) {
        super(context);
        if (bVar != null) {
            this.f5406o = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f5406o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f5406o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0795b b4 = this.f5406o.b();
        if (b4 instanceof a) {
            return ((a) b4).f5408e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f5406o.getActionView();
        if (actionView instanceof c) {
            return ((c) actionView).a();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5406o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5406o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5406o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5406o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f5406o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5406o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5406o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5406o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f5406o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5406o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5406o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5406o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5406o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f5406o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f5406o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f5406o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5406o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f5406o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f5406o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f5406o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f5406o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f5406o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f5406o.isVisible();
    }

    public void j(boolean z3) {
        try {
            if (this.f5407p == null) {
                this.f5407p = this.f5406o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f5407p.invoke(this.f5406o, Boolean.valueOf(z3));
        } catch (Exception e4) {
            Log.w(f5405q, "Error while calling setExclusiveCheckable", e4);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f5266l, actionProvider);
        o.b bVar2 = this.f5406o;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f5406o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f5406o.setAlphabeticShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f5406o.setCheckable(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.f5406o.setChecked(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f5406o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.f5406o.setEnabled(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5406o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5406o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5406o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5406o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f5406o.setNumericShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        d dVar;
        o.b bVar = this.f5406o;
        if (onActionExpandListener != null) {
            dVar = new d(onActionExpandListener);
        } else {
            dVar = null;
        }
        bVar.setOnActionExpandListener(dVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        e eVar;
        o.b bVar = this.f5406o;
        if (onMenuItemClickListener != null) {
            eVar = new e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        bVar.setOnMenuItemClickListener(eVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f5406o.setShortcut(c4, c5);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i4) {
        this.f5406o.setShowAsAction(i4);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i4) {
        this.f5406o.setShowAsActionFlags(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5406o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5406o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f5406o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        return this.f5406o.setVisible(z3);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f5406o.setAlphabeticShortcut(c4, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f5406o.setIcon(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f5406o.setNumericShortcut(c4, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f5406o.setShortcut(c4, c5, i4, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f5406o.setTitle(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i4) {
        this.f5406o.setActionView(i4);
        View actionView = this.f5406o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f5406o.setActionView(new c(actionView));
        }
        return this;
    }
}
