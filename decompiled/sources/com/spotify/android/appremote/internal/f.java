package com.spotify.android.appremote.internal;

import G2.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.spotify.protocol.client.c;
import com.spotify.protocol.types.Image;
import com.spotify.protocol.types.ImageIdentifier;
import com.spotify.protocol.types.ImageUri;
import com.spotify.protocol.types.b;

/* loaded from: classes2.dex */
public class f implements com.spotify.android.appremote.api.e {

    /* renamed from: a, reason: collision with root package name */
    private final com.spotify.protocol.client.k f48802a;

    public f(com.spotify.protocol.client.k remoteClient) {
        this.f48802a = (com.spotify.protocol.client.k) com.spotify.protocol.client.d.a(remoteClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.spotify.protocol.client.c cVar, Image image) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            byte[] bArr = image.imageData;
            cVar.f(com.spotify.protocol.client.p.b(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options)));
        } catch (Exception e4) {
            cVar.e(e4);
        }
    }

    @Override // com.spotify.android.appremote.api.e
    public com.spotify.protocol.client.c<Bitmap> a(ImageUri imageUri) {
        return b(imageUri, Image.Dimension.LARGE);
    }

    @Override // com.spotify.android.appremote.api.e
    public com.spotify.protocol.client.c<Bitmap> b(ImageUri imageUri, Image.Dimension dimension) {
        com.spotify.protocol.client.c d4 = this.f48802a.d(a.C0008a.f589i, new ImageIdentifier(imageUri.raw, dimension), Image.class);
        final com.spotify.protocol.client.c<Bitmap> cVar = new com.spotify.protocol.client.c<>(b.a.f48925b);
        d4.i(new c.a() { // from class: com.spotify.android.appremote.internal.d
            @Override // com.spotify.protocol.client.c.a
            public final void onResult(Object obj) {
                f.d(com.spotify.protocol.client.c.this, (Image) obj);
            }
        });
        d4.a(new com.spotify.protocol.client.g() { // from class: com.spotify.android.appremote.internal.e
            @Override // com.spotify.protocol.client.g
            public final void onError(Throwable th) {
                com.spotify.protocol.client.c.this.e(th);
            }
        });
        return cVar;
    }
}
