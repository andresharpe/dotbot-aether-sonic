package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import androidx.annotation.N;

/* loaded from: classes.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@N LocaleList localeList) {
    }

    public a(int i4) {
        super(i4);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i4, PorterDuff.Mode mode) {
        super(i4);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
