package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0585c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4835a = "ActionBarDrawerToggleHC";

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f4836b = {R.attr.homeAsUpIndicator};

    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public Method f4837a;

        /* renamed from: b, reason: collision with root package name */
        public Method f4838b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f4839c;

        a(Activity activity) {
            try {
                this.f4837a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f4838b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(R.id.home);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f4839c = (ImageView) childAt;
                }
            }
        }
    }

    private C0585c() {
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f4836b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i4) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f4837a != null) {
            try {
                aVar.f4838b.invoke(activity.getActionBar(), Integer.valueOf(i4));
            } catch (Exception e4) {
                Log.w(f4835a, "Couldn't set content description via JB-MR2 API", e4);
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int i4) {
        a aVar = new a(activity);
        if (aVar.f4837a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f4837a.invoke(actionBar, drawable);
                aVar.f4838b.invoke(actionBar, Integer.valueOf(i4));
            } catch (Exception e4) {
                Log.w(f4835a, "Couldn't set home-as-up indicator via JB-MR2 API", e4);
            }
        } else {
            ImageView imageView = aVar.f4839c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w(f4835a, "Couldn't set home-as-up indicator");
            }
        }
        return aVar;
    }
}
