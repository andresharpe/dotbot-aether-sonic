package com.harman.jbl.partybox.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final float f46172a = 0.4f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f46173b = 10.0f;

    public static Bitmap a(Context context, Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * f46172a), Math.round(bitmap.getHeight() * f46172a), false);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setRadius(f46173b);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        return createBitmap;
    }
}
