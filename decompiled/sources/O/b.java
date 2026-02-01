package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC0795b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface b extends MenuItem {

    /* renamed from: g, reason: collision with root package name */
    public static final int f55294g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f55295h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f55296i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f55297j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f55298k = 8;

    @N
    b a(@P AbstractC0795b abstractC0795b);

    @P
    AbstractC0795b b();

    boolean c();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @P
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @P
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @P
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @P
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @P
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @N
    MenuItem setActionView(int i4);

    @Override // android.view.MenuItem
    @N
    MenuItem setActionView(@P View view);

    @Override // android.view.MenuItem
    @N
    MenuItem setAlphabeticShortcut(char c4, int i4);

    @Override // android.view.MenuItem
    @N
    b setContentDescription(@P CharSequence charSequence);

    @Override // android.view.MenuItem
    @N
    MenuItem setIconTintList(@P ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @N
    MenuItem setIconTintMode(@P PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @N
    MenuItem setNumericShortcut(char c4, int i4);

    @Override // android.view.MenuItem
    @N
    MenuItem setShortcut(char c4, char c5, int i4, int i5);

    @Override // android.view.MenuItem
    void setShowAsAction(int i4);

    @Override // android.view.MenuItem
    @N
    MenuItem setShowAsActionFlags(int i4);

    @Override // android.view.MenuItem
    @N
    b setTooltipText(@P CharSequence charSequence);
}
