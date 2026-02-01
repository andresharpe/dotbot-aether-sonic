package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13143a = "LayoutInflaterCompatHC";

    /* renamed from: b, reason: collision with root package name */
    private static Field f13144b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13145c;

    /* loaded from: classes.dex */
    static class a implements LayoutInflater.Factory2 {

        /* renamed from: E, reason: collision with root package name */
        final G f13146E;

        a(G g4) {
            this.f13146E = g4;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f13146E.onCreateView(null, str, context, attributeSet);
        }

        @androidx.annotation.N
        public String toString() {
            return getClass().getName() + "{" + this.f13146E + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f13146E.onCreateView(view, str, context, attributeSet);
        }
    }

    private F() {
    }

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f13145c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f13144b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f13143a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e4);
            }
            f13145c = true;
        }
        Field field = f13144b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e5) {
                Log.e(f13143a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e5);
            }
        }
    }

    @Deprecated
    public static G b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).f13146E;
        }
        return null;
    }

    @Deprecated
    public static void c(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.N G g4) {
        layoutInflater.setFactory2(new a(g4));
    }

    public static void d(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.N LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
