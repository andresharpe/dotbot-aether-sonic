package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.N;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.u;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class d implements com.bumptech.glide.load.h<c> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26597a = "GifEncoder";

    @Override // com.bumptech.glide.load.h
    @N
    public EncodeStrategy b(@N com.bumptech.glide.load.f fVar) {
        return EncodeStrategy.SOURCE;
    }

    @Override // com.bumptech.glide.load.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@N u<c> uVar, @N File file, @N com.bumptech.glide.load.f fVar) {
        try {
            com.bumptech.glide.util.a.e(uVar.get().f(), file);
            return true;
        } catch (IOException e4) {
            if (Log.isLoggable(f26597a, 5)) {
                Log.w(f26597a, "Failed to encode GIF drawable data", e4);
            }
            return false;
        }
    }
}
