package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.RestrictTo;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f5110a;

    private a(Context context) {
        this.f5110a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        if (this.f5110a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    public int c() {
        return this.f5110a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f5110a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i4 <= 600) {
            if (i4 <= 960 || i5 <= 720) {
                if (i4 <= 720 || i5 <= 960) {
                    if (i4 < 500) {
                        if (i4 <= 640 || i5 <= 480) {
                            if (i4 <= 480 || i5 <= 640) {
                                if (i4 >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.f5110a.getResources().getDimensionPixelSize(C2042a.e.f49469k);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f5110a.obtainStyledAttributes(null, C2042a.m.f50070a, C2042a.b.f49220f, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C2042a.m.f50140o, 0);
        Resources resources = this.f5110a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C2042a.e.f49467j));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f5110a.getResources().getBoolean(C2042a.c.f49318a);
    }

    public boolean h() {
        return true;
    }
}
