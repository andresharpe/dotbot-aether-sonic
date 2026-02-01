package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import java.util.List;

/* loaded from: classes.dex */
public class T {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityRecord f13409a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(15)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @InterfaceC0577u
        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @InterfaceC0577u
        static void c(AccessibilityRecord accessibilityRecord, int i4) {
            accessibilityRecord.setMaxScrollX(i4);
        }

        @InterfaceC0577u
        static void d(AccessibilityRecord accessibilityRecord, int i4) {
            accessibilityRecord.setMaxScrollY(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(16)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(AccessibilityRecord accessibilityRecord, View view, int i4) {
            accessibilityRecord.setSource(view, i4);
        }
    }

    @Deprecated
    public T(Object obj) {
        this.f13409a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static T A(T t3) {
        return new T(AccessibilityRecord.obtain(t3.f13409a));
    }

    public static void N(@androidx.annotation.N AccessibilityRecord accessibilityRecord, int i4) {
        a.c(accessibilityRecord, i4);
    }

    public static void P(@androidx.annotation.N AccessibilityRecord accessibilityRecord, int i4) {
        a.d(accessibilityRecord, i4);
    }

    public static void Y(@androidx.annotation.N AccessibilityRecord accessibilityRecord, @androidx.annotation.P View view, int i4) {
        b.a(accessibilityRecord, view, i4);
    }

    public static int j(@androidx.annotation.N AccessibilityRecord accessibilityRecord) {
        return a.a(accessibilityRecord);
    }

    public static int l(@androidx.annotation.N AccessibilityRecord accessibilityRecord) {
        return a.b(accessibilityRecord);
    }

    @Deprecated
    public static T z() {
        return new T(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f13409a.recycle();
    }

    @Deprecated
    public void C(int i4) {
        this.f13409a.setAddedCount(i4);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f13409a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z3) {
        this.f13409a.setChecked(z3);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f13409a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f13409a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i4) {
        this.f13409a.setCurrentItemIndex(i4);
    }

    @Deprecated
    public void I(boolean z3) {
        this.f13409a.setEnabled(z3);
    }

    @Deprecated
    public void J(int i4) {
        this.f13409a.setFromIndex(i4);
    }

    @Deprecated
    public void K(boolean z3) {
        this.f13409a.setFullScreen(z3);
    }

    @Deprecated
    public void L(int i4) {
        this.f13409a.setItemCount(i4);
    }

    @Deprecated
    public void M(int i4) {
        N(this.f13409a, i4);
    }

    @Deprecated
    public void O(int i4) {
        P(this.f13409a, i4);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f13409a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z3) {
        this.f13409a.setPassword(z3);
    }

    @Deprecated
    public void S(int i4) {
        this.f13409a.setRemovedCount(i4);
    }

    @Deprecated
    public void T(int i4) {
        this.f13409a.setScrollX(i4);
    }

    @Deprecated
    public void U(int i4) {
        this.f13409a.setScrollY(i4);
    }

    @Deprecated
    public void V(boolean z3) {
        this.f13409a.setScrollable(z3);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.f13409a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i4) {
        Y(this.f13409a, view, i4);
    }

    @Deprecated
    public void Z(int i4) {
        this.f13409a.setToIndex(i4);
    }

    @Deprecated
    public int a() {
        return this.f13409a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f13409a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f13409a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f13409a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f13409a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t3 = (T) obj;
        AccessibilityRecord accessibilityRecord = this.f13409a;
        if (accessibilityRecord == null) {
            if (t3.f13409a == null) {
                return true;
            }
            return false;
        }
        return accessibilityRecord.equals(t3.f13409a);
    }

    @Deprecated
    public int f() {
        return this.f13409a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f13409a;
    }

    @Deprecated
    public int h() {
        return this.f13409a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f13409a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.f13409a);
    }

    @Deprecated
    public int k() {
        return l(this.f13409a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f13409a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f13409a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f13409a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f13409a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public M q() {
        return M.d2(this.f13409a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f13409a.getText();
    }

    @Deprecated
    public int s() {
        return this.f13409a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f13409a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f13409a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f13409a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f13409a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f13409a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f13409a.isScrollable();
    }
}
