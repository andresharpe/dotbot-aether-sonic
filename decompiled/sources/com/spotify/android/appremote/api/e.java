package com.spotify.android.appremote.api;

import android.graphics.Bitmap;
import com.spotify.protocol.types.Image;
import com.spotify.protocol.types.ImageUri;

/* loaded from: classes2.dex */
public interface e {
    com.spotify.protocol.client.c<Bitmap> a(ImageUri imageUri);

    com.spotify.protocol.client.c<Bitmap> b(ImageUri imageUri, Image.Dimension dimension);
}
