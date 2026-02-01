package d1;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;
import androidx.appcompat.view.d;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2044a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f50193a = {R.attr.theme, a.c.Ig};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f50194b = {a.c.kb};

    private C2044a() {
    }

    @d0
    private static int a(@N Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f50193a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    @d0
    private static int b(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f50194b, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @N
    public static Context c(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        boolean z3;
        int b4 = b(context, attributeSet, i4, i5);
        if ((context instanceof d) && ((d) context).c() == b4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b4 != 0 && !z3) {
            d dVar = new d(context, b4);
            int a4 = a(context, attributeSet);
            if (a4 != 0) {
                dVar.getTheme().applyStyle(a4, true);
            }
            return dVar;
        }
        return context;
    }
}
