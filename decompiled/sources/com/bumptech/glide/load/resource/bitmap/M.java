package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.O;

@Deprecated
/* loaded from: classes.dex */
public class M extends O<ParcelFileDescriptor> {
    public M(Context context) {
        this(com.bumptech.glide.b.e(context).h());
    }

    public M(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(eVar, new O.g());
    }
}
