package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class d0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6180c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<d0>> f6181d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f6182a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f6183b;

    private d0(@androidx.annotation.N Context context) {
        super(context);
        if (p0.d()) {
            p0 p0Var = new p0(this, context.getResources());
            this.f6182a = p0Var;
            Resources.Theme newTheme = p0Var.newTheme();
            this.f6183b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f6182a = new f0(this, context.getResources());
        this.f6183b = null;
    }

    private static boolean a(@androidx.annotation.N Context context) {
        if (!(context instanceof d0) && !(context.getResources() instanceof f0) && !(context.getResources() instanceof p0)) {
            return p0.d();
        }
        return false;
    }

    public static Context b(@androidx.annotation.N Context context) {
        d0 d0Var;
        if (a(context)) {
            synchronized (f6180c) {
                try {
                    ArrayList<WeakReference<d0>> arrayList = f6181d;
                    if (arrayList == null) {
                        f6181d = new ArrayList<>();
                    } else {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            WeakReference<d0> weakReference = f6181d.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                f6181d.remove(size);
                            }
                        }
                        for (int size2 = f6181d.size() - 1; size2 >= 0; size2--) {
                            WeakReference<d0> weakReference2 = f6181d.get(size2);
                            if (weakReference2 != null) {
                                d0Var = weakReference2.get();
                            } else {
                                d0Var = null;
                            }
                            if (d0Var != null && d0Var.getBaseContext() == context) {
                                return d0Var;
                            }
                        }
                    }
                    d0 d0Var2 = new d0(context);
                    f6181d.add(new WeakReference<>(d0Var2));
                    return d0Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f6182a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f6182a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f6183b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        Resources.Theme theme = this.f6183b;
        if (theme == null) {
            super.setTheme(i4);
        } else {
            theme.applyStyle(i4, true);
        }
    }
}
