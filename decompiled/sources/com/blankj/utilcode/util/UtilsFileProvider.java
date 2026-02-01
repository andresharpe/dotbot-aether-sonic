package com.blankj.utilcode.util;

import android.app.Application;
import androidx.core.content.C0671f;

/* loaded from: classes.dex */
public class UtilsFileProvider extends C0671f {
    @Override // androidx.core.content.C0671f, android.content.ContentProvider
    public boolean onCreate() {
        E0.b((Application) getContext().getApplicationContext());
        return true;
    }
}
