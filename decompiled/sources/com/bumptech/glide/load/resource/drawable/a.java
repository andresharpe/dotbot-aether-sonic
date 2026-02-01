package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.P;
import androidx.core.content.C0669d;
import androidx.core.content.res.i;
import e.C2046a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f26561a = true;

    private a() {
    }

    public static Drawable a(Context context, @InterfaceC0578v int i4, @P Resources.Theme theme) {
        return c(context, context, i4, theme);
    }

    public static Drawable b(Context context, Context context2, @InterfaceC0578v int i4) {
        return c(context, context2, i4, null);
    }

    private static Drawable c(Context context, Context context2, @InterfaceC0578v int i4, @P Resources.Theme theme) {
        try {
            if (f26561a) {
                return e(context2, i4, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e4) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0669d.i(context2, i4);
            }
            throw e4;
        } catch (NoClassDefFoundError unused2) {
            f26561a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i4, theme);
    }

    private static Drawable d(Context context, @InterfaceC0578v int i4, @P Resources.Theme theme) {
        return i.g(context.getResources(), i4, theme);
    }

    private static Drawable e(Context context, @InterfaceC0578v int i4, @P Resources.Theme theme) {
        if (theme != null) {
            context = new androidx.appcompat.view.d(context, theme);
        }
        return C2046a.b(context, i4);
    }
}
