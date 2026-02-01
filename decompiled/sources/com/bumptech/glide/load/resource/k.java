package com.bumptech.glide.load.resource;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;

@W(api = 28)
/* loaded from: classes.dex */
public abstract class k<T> implements com.bumptech.glide.load.g<ImageDecoder.Source, T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26632b = "ImageDecoder";

    /* renamed from: a, reason: collision with root package name */
    final A f26633a = A.d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26634a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26636c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DecodeFormat f26637d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DownsampleStrategy f26638e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PreferredColorSpace f26639f;

        /* renamed from: com.bumptech.glide.load.resource.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0239a implements ImageDecoder$OnPartialImageListener {
            C0239a() {
            }

            public boolean onPartialImage(@N ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        a(int i4, int i5, boolean z3, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.f26634a = i4;
            this.f26635b = i5;
            this.f26636c = z3;
            this.f26637d = decodeFormat;
            this.f26638e = downsampleStrategy;
            this.f26639f = preferredColorSpace;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size;
            ColorSpace.Named named;
            ColorSpace colorSpace;
            ColorSpace.Named named2;
            ColorSpace colorSpace2;
            ColorSpace colorSpace3;
            ColorSpace colorSpace4;
            boolean isWideGamut;
            if (k.this.f26633a.g(this.f26634a, this.f26635b, this.f26636c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f26637d == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0239a());
            size = imageInfo.getSize();
            int i4 = this.f26634a;
            if (i4 == Integer.MIN_VALUE) {
                i4 = size.getWidth();
            }
            int i5 = this.f26635b;
            if (i5 == Integer.MIN_VALUE) {
                i5 = size.getHeight();
            }
            float b4 = this.f26638e.b(size.getWidth(), size.getHeight(), i4, i5);
            int round = Math.round(size.getWidth() * b4);
            int round2 = Math.round(size.getHeight() * b4);
            if (Log.isLoggable(k.f26632b, 2)) {
                Log.v(k.f26632b, "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b4);
            }
            imageDecoder.setTargetSize(round, round2);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                if (this.f26639f == PreferredColorSpace.DISPLAY_P3) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            imageDecoder.setTargetColorSpace(colorSpace2);
                            return;
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                imageDecoder.setTargetColorSpace(colorSpace2);
                return;
            }
            if (i6 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@N ImageDecoder.Source source, @N com.bumptech.glide.load.f fVar) throws IOException {
        return e(com.bumptech.glide.load.resource.a.a(source), fVar);
    }

    @Override // com.bumptech.glide.load.g
    @P
    public /* bridge */ /* synthetic */ u b(@N ImageDecoder.Source source, int i4, int i5, @N com.bumptech.glide.load.f fVar) throws IOException {
        return d(com.bumptech.glide.load.resource.a.a(source), i4, i5, fVar);
    }

    protected abstract u<T> c(ImageDecoder.Source source, int i4, int i5, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException;

    @P
    public final u<T> d(@N ImageDecoder.Source source, int i4, int i5, @N com.bumptech.glide.load.f fVar) throws IOException {
        boolean z3;
        DecodeFormat decodeFormat = (DecodeFormat) fVar.c(com.bumptech.glide.load.resource.bitmap.u.f26533g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.c(DownsampleStrategy.f26459h);
        com.bumptech.glide.load.e<Boolean> eVar = com.bumptech.glide.load.resource.bitmap.u.f26537k;
        if (fVar.c(eVar) != null && ((Boolean) fVar.c(eVar)).booleanValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        return c(source, i4, i5, new a(i4, i5, z3, decodeFormat, downsampleStrategy, (PreferredColorSpace) fVar.c(com.bumptech.glide.load.resource.bitmap.u.f26534h)));
    }

    public final boolean e(@N ImageDecoder.Source source, @N com.bumptech.glide.load.f fVar) {
        return true;
    }
}
