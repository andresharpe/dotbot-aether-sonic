package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.W;
import androidx.annotation.d0;
import androidx.core.text.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13823a = "TextViewCompat";

    /* renamed from: b, reason: collision with root package name */
    public static final int f13824b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13825c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static Field f13826d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f13827e = false;

    /* renamed from: f, reason: collision with root package name */
    private static Field f13828f = null;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f13829g = false;

    /* renamed from: h, reason: collision with root package name */
    private static Field f13830h = null;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f13831i = false;

    /* renamed from: j, reason: collision with root package name */
    private static Field f13832j = null;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f13833k = false;

    /* renamed from: l, reason: collision with root package name */
    private static final int f13834l = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @InterfaceC0577u
        static int b(TextView textView) {
            return textView.getMaxLines();
        }

        @InterfaceC0577u
        static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(17)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @InterfaceC0577u
        static int b(View view) {
            return view.getLayoutDirection();
        }

        @InterfaceC0577u
        static int c(View view) {
            return view.getTextDirection();
        }

        @InterfaceC0577u
        static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        @InterfaceC0577u
        static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @InterfaceC0577u
        static void f(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
        }

        @InterfaceC0577u
        static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @InterfaceC0577u
        static void h(View view, int i4) {
            view.setTextDirection(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(23)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @InterfaceC0577u
        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @InterfaceC0577u
        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @InterfaceC0577u
        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @InterfaceC0577u
        static void e(TextView textView, int i4) {
            textView.setBreakStrategy(i4);
        }

        @InterfaceC0577u
        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @InterfaceC0577u
        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @InterfaceC0577u
        static void h(TextView textView, int i4) {
            textView.setHyphenationFrequency(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(24)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @InterfaceC0577u
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @W(26)
    /* loaded from: classes.dex */
    static class e {
        private e() {
        }

        @InterfaceC0577u
        static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @InterfaceC0577u
        static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @InterfaceC0577u
        static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @InterfaceC0577u
        static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @InterfaceC0577u
        static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @InterfaceC0577u
        static void f(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        @InterfaceC0577u
        static void g(TextView textView, int[] iArr, int i4) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        @InterfaceC0577u
        static void h(TextView textView, int i4) {
            textView.setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(28)
    /* loaded from: classes.dex */
    public static class f {
        private f() {
        }

        @InterfaceC0577u
        static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @InterfaceC0577u
        static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @InterfaceC0577u
        static void c(TextView textView, int i4) {
            textView.setFirstBaselineToTopHeight(i4);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(26)
    /* loaded from: classes.dex */
    public static class h implements ActionMode.Callback {

        /* renamed from: g, reason: collision with root package name */
        private static final int f13835g = 100;

        /* renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f13836a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f13837b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f13838c;

        /* renamed from: d, reason: collision with root package name */
        private Method f13839d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f13840e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f13841f = false;

        h(ActionMode.Callback callback, TextView textView) {
            this.f13836a = callback;
            this.f13837b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                return true;
            }
            return false;
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        private void g(Menu menu) {
            Method declaredMethod;
            Context context = this.f13837b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f13841f) {
                this.f13841f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f13838c = cls;
                    this.f13839d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f13840e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f13838c = null;
                    this.f13839d = null;
                    this.f13840e = false;
                }
            }
            try {
                if (this.f13840e && this.f13838c.isInstance(menu)) {
                    declaredMethod = this.f13839d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c4 = c(context, packageManager);
                for (int i4 = 0; i4 < c4.size(); i4++) {
                    ResolveInfo resolveInfo = c4.get(i4);
                    menu.add(0, 0, i4 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f13837b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @N
        ActionMode.Callback d() {
            return this.f13836a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f13836a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f13836a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f13836a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f13836a.onPrepareActionMode(actionMode, menu);
        }
    }

    private r() {
    }

    public static void A(@N TextView textView, @U @F(from = 0) int i4) {
        int i5;
        androidx.core.util.u.i(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            f.c(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i5 = fontMetricsInt.top;
        } else {
            i5 = fontMetricsInt.ascent;
        }
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(@N TextView textView, @U @F(from = 0) int i4) {
        int i5;
        androidx.core.util.u.i(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i5 = fontMetricsInt.bottom;
        } else {
            i5 = fontMetricsInt.descent;
        }
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static void C(@N TextView textView, @U @F(from = 0) int i4) {
        androidx.core.util.u.i(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static void D(@N TextView textView, @N z zVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(zVar.f());
        } else {
            if (o(textView).a(zVar.e())) {
                textView.setText(zVar);
                return;
            }
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void E(@N TextView textView, @d0 int i4) {
        textView.setTextAppearance(i4);
    }

    public static void F(@N TextView textView, @N z.a aVar) {
        b.h(textView, m(aVar.d()));
        textView.getPaint().set(aVar.e());
        c.e(textView, aVar.b());
        c.h(textView, aVar.c());
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback G(@P ActionMode.Callback callback) {
        if ((callback instanceof h) && Build.VERSION.SDK_INT >= 26) {
            return ((h) callback).d();
        }
        return callback;
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback H(@N TextView textView, @P ActionMode.Callback callback) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && i4 <= 27 && !(callback instanceof h) && callback != null) {
            return new h(callback, textView);
        }
        return callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(@N TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.a(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(@N TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.b(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(@N TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.c(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    public static int[] d(@N TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.d(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(@N TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.e(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @P
    public static ColorStateList f(@N TextView textView) {
        androidx.core.util.u.l(textView);
        return c.b(textView);
    }

    @P
    public static PorterDuff.Mode g(@N TextView textView) {
        androidx.core.util.u.l(textView);
        return c.c(textView);
    }

    @N
    public static Drawable[] h(@N TextView textView) {
        return b.a(textView);
    }

    public static int i(@N TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@N TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@N TextView textView) {
        return a.b(textView);
    }

    public static int l(@N TextView textView) {
        return a.c(textView);
    }

    @W(18)
    private static int m(@N TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        if (textDirectionHeuristic != textDirectionHeuristic3) {
            return 1;
        }
        return 7;
    }

    @W(18)
    private static TextDirectionHeuristic n(@N TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z3 = true;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(f.a(d.a(b.d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (b.b(textView) != 1) {
            z3 = false;
        }
        switch (b.c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z3) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    @N
    public static z.a o(@N TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new z.a(f.b(textView));
        }
        z.a.C0103a c0103a = new z.a.C0103a(new TextPaint(textView.getPaint()));
        c0103a.b(c.a(textView));
        c0103a.c(c.d(textView));
        c0103a.d(n(textView));
        return c0103a.a();
    }

    private static Field p(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            Log.e(f13823a, "Could not retrieve " + str + " field.");
            return field;
        }
    }

    private static int q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d(f13823a, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(@N TextView textView, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.f(textView, i4, i5, i6, i7);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(@N TextView textView, @N int[] iArr, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.g(textView, iArr, i4);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(@N TextView textView, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.h(textView, i4);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    public static void u(@N TextView textView, @P ColorStateList colorStateList) {
        androidx.core.util.u.l(textView);
        c.f(textView, colorStateList);
    }

    public static void v(@N TextView textView, @P PorterDuff.Mode mode) {
        androidx.core.util.u.l(textView);
        c.g(textView, mode);
    }

    public static void w(@N TextView textView, @P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
        b.e(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void x(@N TextView textView, @InterfaceC0578v int i4, @InterfaceC0578v int i5, @InterfaceC0578v int i6, @InterfaceC0578v int i7) {
        b.f(textView, i4, i5, i6, i7);
    }

    public static void y(@N TextView textView, @P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
        b.g(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void z(@N TextView textView, @N ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(H(textView, callback));
    }
}
