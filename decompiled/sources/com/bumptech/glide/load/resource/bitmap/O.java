package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.i0;
import com.bumptech.glide.load.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class O<T> implements com.bumptech.glide.load.g<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26495d = "VideoDecoder";

    /* renamed from: e, reason: collision with root package name */
    public static final long f26496e = -1;

    /* renamed from: f, reason: collision with root package name */
    @i0
    static final int f26497f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Long> f26498g = com.bumptech.glide.load.e.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Integer> f26499h = com.bumptech.glide.load.e.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: i, reason: collision with root package name */
    private static final e f26500i = new e();

    /* renamed from: a, reason: collision with root package name */
    private final f<T> f26501a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26502b;

    /* renamed from: c, reason: collision with root package name */
    private final e f26503c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f26504a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.e.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.N byte[] bArr, @androidx.annotation.N Long l4, @androidx.annotation.N MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f26504a) {
                this.f26504a.position(0);
                messageDigest.update(this.f26504a.putLong(l4.longValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements e.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f26505a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.e.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.N byte[] bArr, @androidx.annotation.N Integer num, @androidx.annotation.N MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f26505a) {
                this.f26505a.position(0);
                messageDigest.update(this.f26505a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.O.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(23)
    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends MediaDataSource {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f26506E;

            a(ByteBuffer byteBuffer) {
                this.f26506E = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f26506E.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j4, byte[] bArr, int i4, int i5) {
                if (j4 >= this.f26506E.limit()) {
                    return -1;
                }
                this.f26506E.position((int) j4);
                int min = Math.min(i5, this.f26506E.remaining());
                this.f26506E.get(bArr, i4, min);
                return min;
            }
        }

        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.O.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    @i0
    /* loaded from: classes.dex */
    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.O.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {

        /* renamed from: E, reason: collision with root package name */
        private static final long f26508E = -2556382523004027815L;

        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, f<T> fVar) {
        this(eVar, fVar, f26500i);
    }

    public static com.bumptech.glide.load.g<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new O(eVar, new c(null));
    }

    @W(api = 23)
    public static com.bumptech.glide.load.g<ByteBuffer, Bitmap> d(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new O(eVar, new d());
    }

    @P
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4, int i5, int i6, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 27 && i5 != Integer.MIN_VALUE && i6 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.f26457f) {
            bitmap = g(mediaMetadataRetriever, j4, i4, i5, i6, downsampleStrategy);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            bitmap = f(mediaMetadataRetriever, j4, i4);
        }
        if (bitmap != null) {
            return bitmap;
        }
        throw new h();
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4) {
        return mediaMetadataRetriever.getFrameAtTime(j4, i4);
    }

    @P
    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4, int i5, int i6, DownsampleStrategy downsampleStrategy) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b4 = downsampleStrategy.b(parseInt, parseInt2, i5, i6);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j4, i4, Math.round(parseInt * b4), Math.round(b4 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th) {
            if (Log.isLoggable(f26495d, 3)) {
                Log.d(f26495d, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                return null;
            }
            return null;
        }
    }

    public static com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new O(eVar, new g());
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@androidx.annotation.N T t3, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N T t3, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        long longValue = ((Long) fVar.c(f26498g)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) fVar.c(f26499h);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.c(DownsampleStrategy.f26459h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f26458g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever a4 = this.f26503c.a();
        try {
            this.f26501a.a(a4, t3);
            Bitmap e4 = e(a4, longValue, num.intValue(), i4, i5, downsampleStrategy2);
            a4.release();
            return C1122g.f(e4, this.f26502b);
        } catch (Throwable th) {
            a4.release();
            throw th;
        }
    }

    @i0
    O(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, f<T> fVar, e eVar2) {
        this.f26502b = eVar;
        this.f26501a = fVar;
        this.f26503c = eVar2;
    }
}
