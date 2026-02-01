package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import o.InterfaceMenuC2377a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class p extends c implements Menu {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceMenuC2377a f5432o;

    public p(Context context, InterfaceMenuC2377a interfaceMenuC2377a) {
        super(context);
        if (interfaceMenuC2377a != null) {
            this.f5432o = interfaceMenuC2377a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return e(this.f5432o.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f5432o.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = e(menuItemArr2[i8]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.f5432o.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        g();
        this.f5432o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f5432o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        return e(this.f5432o.findItem(i4));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return e(this.f5432o.getItem(i4));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f5432o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f5432o.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return this.f5432o.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.f5432o.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        h(i4);
        this.f5432o.removeGroup(i4);
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        i(i4);
        this.f5432o.removeItem(i4);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        this.f5432o.setGroupCheckable(i4, z3, z4);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z3) {
        this.f5432o.setGroupEnabled(i4, z3);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z3) {
        this.f5432o.setGroupVisible(i4, z3);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f5432o.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f5432o.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return e(this.f5432o.add(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return f(this.f5432o.addSubMenu(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return e(this.f5432o.add(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return f(this.f5432o.addSubMenu(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return e(this.f5432o.add(i4, i5, i6, i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return f(this.f5432o.addSubMenu(i4, i5, i6, i7));
    }
}
