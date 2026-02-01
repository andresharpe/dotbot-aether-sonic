package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.N;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.a<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26278a = "ByteBufferEncoder";

    @Override // com.bumptech.glide.load.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@N ByteBuffer byteBuffer, @N File file, @N com.bumptech.glide.load.f fVar) {
        try {
            com.bumptech.glide.util.a.e(byteBuffer, file);
            return true;
        } catch (IOException e4) {
            if (Log.isLoggable(f26278a, 3)) {
                Log.d(f26278a, "Failed to write data", e4);
            }
            return false;
        }
    }
}
