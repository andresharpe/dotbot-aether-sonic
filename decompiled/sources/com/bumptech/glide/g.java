package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.V;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
interface g<T> {
    @InterfaceC0567j
    @Deprecated
    T f(@P URL url);

    @N
    @InterfaceC0567j
    T g(@P Uri uri);

    @N
    @InterfaceC0567j
    T h(@P byte[] bArr);

    @N
    @InterfaceC0567j
    T i(@P File file);

    @N
    @InterfaceC0567j
    T j(@P Drawable drawable);

    @N
    @InterfaceC0567j
    T k(@P Bitmap bitmap);

    @N
    @InterfaceC0567j
    T n(@P Object obj);

    @N
    @InterfaceC0567j
    T o(@P @V @InterfaceC0578v Integer num);

    @N
    @InterfaceC0567j
    T t(@P String str);
}
